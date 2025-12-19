package com.github.spdrnl.amsterdamintellij.psi

import com.github.spdrnl.amsterdamintellij.lang.amsFile
import com.github.spdrnl.amsterdamintellij.lang.amsLanguage
import com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer
import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.PsiReference
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

class AmsCurie(node: ASTNode) : ANTLRPsiNode(node), PsiNamedElement, PsiNameIdentifierOwner {

    override fun getName(): String? {
        val id = nameIdentifier
        if (id != null && id !== this) {
            val t = id.text
            if (t.startsWith('<') && t.endsWith('>')) {
                val iri = t.substring(1, t.length - 1)

                // Check if it starts with any declared namespace
                val file = containingFile as? amsFile ?: return iri
                val prefixMap = file.getPrefixMap()
                for ((_, namespace) in prefixMap) {
                    if (iri.startsWith(namespace)) {
                        return iri.substring(namespace.length)
                    }
                }

                // No declared namespace match: return full IRI without brackets
                return iri
            }
            if (t.contains(':')) {
                // For CURIEs, return the local name part
                return t.substring(t.indexOf(':') + 1)
            }
            return t
        }
        return text
    }

    override fun setName(name: String): PsiElement {
        val currentText = text

        // Check if this is a namespace IRI renaming
        val ruleIndex = (node.elementType as? RuleIElementType)?.ruleIndex
        if (ruleIndex == OwlDslParser.RULE_namespaceIRI) {
            // Renaming the IRI in "Prefix obo: <...>"
            val oldNamespace = if (currentText.startsWith('<') && currentText.endsWith('>')) {
                currentText.substring(1, currentText.length - 1)
            } else {
                currentText
            }
            val newNamespace = if (name.startsWith('<') && name.endsWith('>')) {
                name.substring(1, name.length - 1)
            } else {
                name
            }

            val file = (containingFile as? amsFile) ?: return this
            val allCuries = file.getAllDefinitions() // Only need definitions for IRI check
            getFullIri()
            for (curie in allCuries) {
                if (curie === this || !curie.isValid || !curie.isPhysical) continue
                val t = curie.text
                if (t.startsWith('<') && t.endsWith('>')) {
                    val iri = t.substring(1, t.length - 1)
                    if (iri.startsWith(oldNamespace)) {
                        val rest = iri.substring(oldNamespace.length)
                        curie.replace(AmsElementFactory.createCurie(project, "<$newNamespace$rest>"))
                    }
                }
            }

            val newCurie = AmsElementFactory.createCurie(project, if (name.startsWith('<')) name else "<$name>")
            return this.replace(newCurie)
        }

        val newName = if (currentText.startsWith('<') && currentText.endsWith('>')) {
            // It's an IRI.
            val iri = currentText.substring(1, currentText.length - 1)

            // Check if it starts with any declared namespace
            val file = containingFile as? amsFile
            val prefixMap = file?.getPrefixMap() ?: emptyMap()
            var matchedNamespace: String? = null
            for ((_, namespace) in prefixMap) {
                if (iri.startsWith(namespace)) {
                    matchedNamespace = namespace
                    break
                }
            }

            if (name.startsWith('<') && name.endsWith('>')) {
                name
            } else if (name.contains("://") || name.startsWith("http")) {
                "<$name>"
            } else if (matchedNamespace != null) {
                // User provided a local part, and we have a matched namespace
                "<$matchedNamespace$name>"
            } else {
                // No match, user likely provided a full IRI without brackets
                "<$name>"
            }
        } else {
            // It's a CURIE.
            val colonIndex = currentText.indexOf(':')
            if (colonIndex != -1) {
                if (name.contains(':')) {
                    // If they provided a full CURIE (e.g. through some other means), use it
                    name
                } else {
                    // Standard case: renaming local part
                    currentText.substring(0, colonIndex + 1) + name
                }
            } else {
                name
            }
        }
        val newCurie = AmsElementFactory.createCurie(project, newName)
        return this.replace(newCurie)
    }

    override fun getNameIdentifier(): PsiElement {
        val tokenTypes = PSIElementTypeFactory.getTokenIElementTypes(amsLanguage.INSTANCE)

        // If this element itself is a leaf token (IRI, CURIE, CURIE_EMPTY), return it
        val elementType = node.elementType
        if (elementType == tokenTypes[OwlDslLexer.IRI] ||
            elementType == tokenTypes[OwlDslLexer.CURIE] ||
            elementType == tokenTypes[OwlDslLexer.CURIE_EMPTY]
        ) {
            return this
        }

        // Otherwise try to find it in descendants
        fun findLeaf(node: ASTNode): ASTNode? {
            if (node.elementType == tokenTypes[OwlDslLexer.IRI] ||
                node.elementType == tokenTypes[OwlDslLexer.CURIE] ||
                node.elementType == tokenTypes[OwlDslLexer.CURIE_EMPTY]
            ) {
                return node
            }
            for (child in node.getChildren(null)) {
                val leaf = findLeaf(child)
                if (leaf != null) return leaf
            }
            return null
        }

        return findLeaf(node)?.psi ?: this
    }

    override fun getTextOffset(): Int {
        val id = nameIdentifier
        return if (id != null && id !== this) id.textOffset else super.getTextOffset()
    }

    override fun getReference(): PsiReference? {
        val text = text
        if (text.startsWith('<')) return null
        val colonIndex = text.indexOf(':')
        if (colonIndex == -1) return null

        // Return a reference for the prefix part
        return AmsCurieReference(this, TextRange(0, colonIndex))
    }

    override fun getReferences(): Array<PsiReference> {
        val refs = mutableListOf<PsiReference>()
        val t = text
        if (t.startsWith('<')) {
            // IRIs also need to resolve to their definitions
            if (!isDef()) {
                refs.add(AmsCurieLocalNameReference(this, TextRange(0, t.length)))
            }
            return refs.toTypedArray()
        }

        val colonIndex = t.indexOf(':')
        if (colonIndex != -1) {
            refs.add(AmsCurieReference(this, TextRange(0, colonIndex)))
            // Add reference for the local name part if it's not a declaration
            if (!isDef()) {
                refs.add(AmsCurieLocalNameReference(this, TextRange(colonIndex + 1, t.length)))
            }
        } else {
            if (!isDef()) {
                refs.add(AmsCurieLocalNameReference(this, TextRange(0, t.length)))
            }
        }

        return refs.toTypedArray()
    }

    fun isDef(): Boolean {
        val ruleIndex = (node.elementType as? RuleIElementType)?.ruleIndex ?: return false

        return ruleIndex == OwlDslParser.RULE_classId ||
                ruleIndex == OwlDslParser.RULE_propId ||
                ruleIndex == OwlDslParser.RULE_datatypeId ||
                ruleIndex == OwlDslParser.RULE_individualId ||
                ruleIndex == OwlDslParser.RULE_entityId ||
                ruleIndex == OwlDslParser.RULE_namespaceIRI
    }

    fun getFullIri(): String? {
        val t = text
        if (t.startsWith('<') && t.endsWith('>')) {
            return t.substring(1, t.length - 1)
        }
        val colonIndex = t.indexOf(':')

        val prefix = if (colonIndex != -1) t.substring(0, colonIndex) else ""
        val localName = if (colonIndex != -1) t.substring(colonIndex + 1) else t

        val file = containingFile as? amsFile ?: return null
        val prefixMap = file.getPrefixMap()

        val ns = prefixMap[prefix] ?: return null
        return ns + localName
    }
}
