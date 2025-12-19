package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.intellij.psi.PsiElement
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

object AmsPsiUtil {
    fun findRecursively(node: PsiElement, ruleIndex: Int): PsiElement? {
        if (node is ANTLRPsiNode && node.node.elementType is RuleIElementType &&
            (node.node.elementType as RuleIElementType).ruleIndex == ruleIndex
        ) {
            return node
        }
        for (child in node.children) {
            val found = findRecursively(child, ruleIndex)
            if (found != null) return found
        }
        return null
    }

    fun findRecursivelyByName(node: PsiElement, name: String): PsiElement? {
        if (node is ANTLRPsiNode) {
            val type = node.node.elementType
            if (type is org.antlr.intellij.adaptor.lexer.TokenIElementType) {
                if (com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer.VOCABULARY.getSymbolicName(type.antlrTokenType) == name) {
                    return node
                }
            } else if (type is RuleIElementType) {
                if (OwlDslParser.ruleNames[type.ruleIndex] == name) {
                    return node
                }
            }
        }
        for (child in node.children) {
            val found = findRecursivelyByName(child, name)
            if (found != null) return found
        }
        return null
    }

    fun getAxiomLabel(axiom: PsiElement): String {
        if (axiom !is ANTLRPsiNode) return axiom.text.take(20)

        val label = findBestLabel(axiom)
        if (label != null) return label

        val idNode = findIdNode(axiom)
        return idNode?.text ?: axiom.text.take(20)
    }

    /**
     * Finds the "best" label for an element, checking rdfs:label, skos:definition, and inline comments.
     */
    fun findBestLabel(node: PsiElement, lang: String? = null): String? {
        // 1. Check rdfs:label
        findLabelAnnotation(node, lang)?.let { return it }

        // 2. Check skos:definition
        findAnnotation(node, "skos:definition", lang)?.let { return it }

        // 3. Check inline commentOpt
        findInlineComment(node)?.let { return it }

        return null
    }

    fun findLabelAnnotation(node: PsiElement, lang: String? = null): String? = findAnnotation(node, "rdfs:label", lang)

    fun findCommentAnnotation(node: PsiElement, lang: String? = null): String? =
        findAnnotation(node, "rdfs:comment", lang)

    fun findInlineComment(node: PsiElement): String? {
        val axiom = if (findAxiom(node) != null) findAxiom(node) else node
        if (axiom is ANTLRPsiNode) {
            val commentOpt = axiom.children.find {
                (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_commentOpt
            }
            if (commentOpt != null) {
                val literal = commentOpt.children.firstOrNull {
                    (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_literal
                }
                if (literal != null) {
                    return getLiteralContent(literal).first
                }
            }
        }
        return null
    }

    private fun findAnnotation(node: PsiElement, propName: String, requestedLang: String? = null): String? {
        val candidates = findAllAnnotations(node, propName)

        if (requestedLang != null) {
            candidates.find { it.second == requestedLang }?.let { return it.first }
        }

        if (candidates.isEmpty()) return null

        // 1. Match @en
        candidates.find { it.second == "@en" }?.let { return it.first }
        // 2. Any other label
        return candidates.first().first
    }

    fun getLiteralContent(literal: PsiElement): Pair<String, String?> {
        val langTag = literal.children.find {
            val type = it.node.elementType
            type is org.antlr.intellij.adaptor.lexer.TokenIElementType && type.antlrTokenType == com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer.LANGTAG
        }?.text
        val rawText = literal.text
        val content = when {
            rawText.startsWith("\"\"\"") -> rawText.substringAfter("\"\"\"")
                .substringBeforeLast("\"\"\"")

            rawText.startsWith("\"") -> rawText.substringAfter("\"")
                .substringBeforeLast("\"")

            else -> rawText
        }
        return content to langTag
    }

    fun findAllAnnotations(node: PsiElement, propNames: Set<String>): List<Triple<String, String?, String>> {
        var current: PsiElement? = node
        val candidates = mutableListOf<Triple<String, String?, String>>()

        while (current != null && current !is amsFile) {
            if (current is ANTLRPsiNode) {
                val type = (current.node.elementType as? RuleIElementType)?.ruleIndex
                if (type == OwlDslParser.RULE_annotatedAxiom || type == OwlDslParser.RULE_annotatedOntologyHeader) {
                    for (block in current.children) {
                        if (block is ANTLRPsiNode && (block.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_annotationBlock) {
                            val list = block.children.find {
                                it is ANTLRPsiNode && (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_annotationList
                            }
                            if (list != null) {
                                for (ann in list.children) {
                                    if (ann is ANTLRPsiNode && (ann.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_annotation) {
                                        val propId = ann.children.find {
                                            it is ANTLRPsiNode && (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_entityUsage
                                        }
                                        val matchedProp =
                                            propNames.find { propId?.text?.endsWith(it) == true || propId?.text == it }
                                        if (matchedProp != null) {
                                            val literal = ann.children.find {
                                                it is ANTLRPsiNode && (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_literal
                                            }
                                            if (literal != null) {
                                                val (content, langTag) = getLiteralContent(literal)
                                                candidates.add(Triple(content, langTag, matchedProp))
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            current = current.parent
        }
        return candidates
    }

    fun findAllAnnotations(node: PsiElement, propName: String): List<Pair<String, String?>> {
        return findAllAnnotations(node, setOf(propName)).map { it.first to it.second }
    }

    fun findIdNode(node: ANTLRPsiNode): PsiElement? {
        val ruleIElementType = node.node.elementType as? RuleIElementType ?: return null
        val targetRule = when (ruleIElementType.ruleIndex) {
            OwlDslParser.RULE_classAxiom -> OwlDslParser.RULE_classId
            OwlDslParser.RULE_objectPropertyAxiom, OwlDslParser.RULE_dataPropertyAxiom -> OwlDslParser.RULE_propId
            OwlDslParser.RULE_individualAxiom -> OwlDslParser.RULE_individualId
            OwlDslParser.RULE_annotationPropertyAxiom -> OwlDslParser.RULE_propId
            OwlDslParser.RULE_datatypeAxiom -> OwlDslParser.RULE_datatypeId
            OwlDslParser.RULE_subPropertyChainAxiom -> OwlDslParser.RULE_propId
            else -> null
        }

        if (targetRule != null) {
            val found = findRecursively(node, targetRule)
            if (found != null) {
                return found.children.firstOrNull() ?: found
            }
        }

        return findRecursivelyByName(node, "CURIE") ?: findRecursivelyByName(node, "IRI")
    }

    fun findAxiom(element: PsiElement): PsiElement? {
        var p: PsiElement? = element
        while (p != null) {
            if (p is ANTLRPsiNode) {
                val type = (p.node.elementType as? RuleIElementType)?.ruleIndex
                if (type == OwlDslParser.RULE_classAxiom ||
                    type == OwlDslParser.RULE_objectPropertyAxiom ||
                    type == OwlDslParser.RULE_dataPropertyAxiom ||
                    type == OwlDslParser.RULE_annotationPropertyAxiom ||
                    type == OwlDslParser.RULE_datatypeAxiom ||
                    type == OwlDslParser.RULE_individualAxiom ||
                    type == OwlDslParser.RULE_subPropertyChainAxiom
                ) {
                    return p
                }
            }
            if (p is amsFile) break
            p = p.parent
        }
        return null
    }
}
