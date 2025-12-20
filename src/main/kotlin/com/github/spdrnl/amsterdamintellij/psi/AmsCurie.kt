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
import com.intellij.psi.util.PsiTreeUtil
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
                
                // If the IRI has a known namespace, return the local part
                val ns = getNamespace()
                if (ns != null && iri.startsWith(ns)) {
                    return iri.substring(ns.length)
                }
                
                // No known namespace, return the full IRI without brackets
                return iri
            }
            if (t.contains(':')) {
                return getLocalName()
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
            val oldNamespace = if (currentText.startsWith('<') && currentText.endsWith('>')) {
                currentText.substring(1, currentText.length - 1)
            } else {
                currentText
            }
            val cleanName = name.removePrefix("<").removeSuffix(">")
            val newNamespace = cleanName

            val file = (containingFile as? amsFile) ?: return this
            
            val allCuries = PsiTreeUtil.findChildrenOfType(file, AmsCurie::class.java)
            for (curie in allCuries) {
                if (curie === this || !curie.isValid) continue
                val t = curie.text
                if (t.startsWith('<') && t.endsWith('>')) {
                    val iri = t.substring(1, t.length - 1)
                    if (iri.startsWith(oldNamespace)) {
                        val rest = iri.substring(oldNamespace.length)
                        val newIri = "<$newNamespace$rest>"
                        if (t != newIri) {
                            curie.replace(AmsElementFactory.createCurie(project, newIri))
                        }
                    }
                }
            }

            val newCurie = AmsElementFactory.createCurie(project, "<$newNamespace>")
            return this.replace(newCurie)
        }

        val newName = if (currentText.startsWith('<') && currentText.endsWith('>')) {
            // It's an IRI.
            val cleanName = name.removePrefix("<").removeSuffix(">")
            
            // If the name provided is a full IRI (contains protocol), use it as is
            if (cleanName.contains("://") || cleanName.startsWith("http")) {
                "<$cleanName>"
            } else {
                // Otherwise, it's just the local name part.
                val matchedNamespace = getNamespace()
                if (matchedNamespace != null) {
                    "<$matchedNamespace$cleanName>"
                } else {
                    // Fallback: if no declared namespace matches, split at last / or #
                    val iri = currentText.substring(1, currentText.length - 1)
                    val lastSlash = iri.lastIndexOf('/')
                    val lastHash = iri.lastIndexOf('#')
                    val splitIdx = maxOf(lastSlash, lastHash)
                    if (splitIdx != -1) {
                        "<${iri.substring(0, splitIdx + 1)}$cleanName>"
                    } else {
                        "<$cleanName>"
                    }
                }
            }
        } else {
            // It's a CURIE.
            val colonIndex = currentText.indexOf(':')
            if (colonIndex != -1) {
                if (name.contains(':')) {
                    // If they provided a full CURIE, use it
                    name
                } else if (name.startsWith('<') && name.endsWith('>')) {
                    // If they renamed a CURIE to a full IRI
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
        
        // Add LocalNameReference to everything that is not a definition
        if (!isDef()) {
            if (t.startsWith('<')) {
                refs.add(AmsCurieLocalNameReference(this, TextRange(0, t.length)))
            } else {
                val colonIndex = t.indexOf(':')
                if (colonIndex != -1) {
                    refs.add(AmsCurieReference(this, TextRange(0, colonIndex)))
                    refs.add(AmsCurieLocalNameReference(this, TextRange(colonIndex + 1, t.length)))
                } else {
                    refs.add(AmsCurieLocalNameReference(this, TextRange(0, t.length)))
                }
            }
        } else if (t.contains(':') && !t.startsWith('<')) {
            // Even if it's a definition, we might want to resolve the prefix
            val colonIndex = t.indexOf(':')
            refs.add(AmsCurieReference(this, TextRange(0, colonIndex)))
        }

        return refs.toTypedArray()
    }

    fun isDef(): Boolean {
        // Recursive search for the first ID token in an axiom, skipping annotations and ontology property blocks
        fun findFirstId(node: com.intellij.psi.PsiElement): com.intellij.psi.PsiElement? {
            if (node is AmsCurie) {
                // println("[DEBUG_LOG] findFirstId encountered AmsCurie: ${node.text}")
                return node
            }
            for (child in node.children) {
                if (child is ANTLRPsiNode) {
                    val type = (child.node.elementType as? RuleIElementType)?.ruleIndex
                    if (type == OwlDslParser.RULE_annotationBlock || 
                        type == OwlDslParser.RULE_ontologyPropertyBlock || 
                        type == OwlDslParser.RULE_commentOpt ||
                        type == OwlDslParser.RULE_classClause ||
                        type == OwlDslParser.RULE_objectPropertyClause ||
                        type == OwlDslParser.RULE_dataPropertyClause
                    ) {
                        // println("[DEBUG_LOG] findFirstId skipping child type: $type")
                        continue
                    }
                }
                val found = findFirstId(child)
                if (found != null) return found
            }
            return null
        }

        val nodeType = node.elementType
        var rIdx = if (nodeType is RuleIElementType) nodeType.ruleIndex else -1

        fun isIdRule(idx: Int) = idx == OwlDslParser.RULE_classId ||
                idx == OwlDslParser.RULE_propId ||
                idx == OwlDslParser.RULE_datatypeId ||
                idx == OwlDslParser.RULE_individualId ||
                idx == OwlDslParser.RULE_entityId

        var curr: com.intellij.psi.PsiElement? = this
        while (curr != null && curr !is amsFile) {
            val type = curr.node.elementType
            if (type is RuleIElementType) {
                val idx = type.ruleIndex
                if (idx == OwlDslParser.RULE_namespaceIRI) return true
                
                // All disjoint classes (...) is NOT a definition
                if (idx == OwlDslParser.RULE_allDisjointClassesPhrase) return false
                
                // Check if we are inside AllDisjointClassesAxiom
                var p = curr
                while (p != null && p !is amsFile) {
                    val pType = (p.node.elementType as? RuleIElementType)?.ruleIndex
                    if (pType == OwlDslParser.RULE_classAxiom && p.node.text.startsWith("All disjoint classes", ignoreCase = true)) {
                        return false
                    }
                    p = p.parent
                }

                if (idx == OwlDslParser.RULE_classAxiom ||
                    idx == OwlDslParser.RULE_objectPropertyAxiom ||
                    idx == OwlDslParser.RULE_dataPropertyAxiom ||
                    idx == OwlDslParser.RULE_individualAxiom ||
                    idx == OwlDslParser.RULE_annotationPropertyAxiom ||
                    idx == OwlDslParser.RULE_datatypeAxiom ||
                    idx == OwlDslParser.RULE_classSubOrEqAxiom ||
                    idx == OwlDslParser.RULE_objectPropertyDomainRangeAxiom ||
                    idx == OwlDslParser.RULE_objectSubPropertyAxiom ||
                    idx == OwlDslParser.RULE_dataPropertyDomainRangeAxiom ||
                    idx == OwlDslParser.RULE_dataSubPropertyAxiom ||
                    idx == OwlDslParser.RULE_subPropertyChainAxiom ||
                    idx == OwlDslParser.RULE_objectInversePropertyAxiom ||
                    idx == OwlDslParser.RULE_bareAxiom
                ) {
                    return findFirstId(curr) === this
                }
            }
            curr = curr.parent
        }

        return false
    }

    fun getNamespace(): String? {
        val t = text
        if (t.startsWith('<') && t.endsWith('>')) {
            val iri = t.substring(1, t.length - 1)
            val file = containingFile as? amsFile
            val prefixMap = file?.getPrefixMap() ?: emptyMap()
            for ((_, ns) in prefixMap) {
                if (iri.startsWith(ns) && ns.isNotEmpty()) return ns
            }
            return null
        } else {
            val prefix = getPrefix() ?: ""
            val file = containingFile as? amsFile
            return file?.getPrefixMap()?.get(prefix)
        }
    }

    fun getPrefix(): String? {
        val t = text
        if (t.startsWith('<')) {
            val ns = getNamespace() ?: return null
            val file = containingFile as? amsFile
            val prefixMap = file?.getPrefixMap() ?: emptyMap()
            return prefixMap.entries.find { it.value == ns }?.key
        }
        val colonIndex = t.indexOf(':')
        return if (colonIndex != -1) t.substring(0, colonIndex) else null
    }

    fun getLocalName(): String {
        val t = text
        if (t.startsWith('<') && t.endsWith('>')) {
            val ns = getNamespace()
            val iri = t.substring(1, t.length - 1)
            if (ns != null && iri.startsWith(ns)) return iri.substring(ns.length)
            
            // Fallback: split at last / or #
            val lastSlash = iri.lastIndexOf('/')
            val lastHash = iri.lastIndexOf('#')
            val splitIdx = maxOf(lastSlash, lastHash)
            return if (splitIdx != -1) iri.substring(splitIdx + 1) else iri
        }
        val colonIndex = t.indexOf(':')
        return if (colonIndex != -1) t.substring(colonIndex + 1) else t
    }

    fun getFullIri(): String? {
        val t = text
        if (t.startsWith('<') && t.endsWith('>')) {
            return t.substring(1, t.length - 1)
        }
        
        val prefix = getPrefix() ?: ""
        val localName = getLocalName()

        val file = containingFile as? amsFile ?: return null
        val prefixMap = file.getPrefixMap()

        val ns = prefixMap[prefix] ?: return null
        return ns + localName
    }
}
