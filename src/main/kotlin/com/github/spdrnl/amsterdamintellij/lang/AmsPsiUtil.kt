package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.intellij.psi.PsiElement
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

object AmsPsiUtil {
    fun findRecursively(node: PsiElement, ruleIndex: Int): PsiElement? {
        if (node is ANTLRPsiNode && node.node.elementType is RuleIElementType && 
            (node.node.elementType as RuleIElementType).ruleIndex == ruleIndex) {
            return node
        }
        for (child in node.children) {
            val found = findRecursively(child, ruleIndex)
            if (found != null) return found
        }
        return null
    }

    fun findRecursivelyByName(node: PsiElement, name: String): PsiElement? {
        if (node is ANTLRPsiNode && node.node.elementType.toString().contains(name)) {
            return node
        }
        for (child in node.children) {
            val found = findRecursivelyByName(child, name)
            if (found != null) return found
        }
        return null
    }

    fun getAxiomLabel(axiom: PsiElement): String {
        if (axiom !is ANTLRPsiNode) return axiom.text.take(20)
        
        val label = findLabelAnnotation(axiom)
        if (label != null) return label

        val idNode = findIdNode(axiom)
        return idNode?.text ?: axiom.text.take(20)
    }

    fun findLabelAnnotation(node: PsiElement, lang: String? = null): String? = findAnnotation(node, "rdfs:label", lang)

    fun findCommentAnnotation(node: PsiElement, lang: String? = null): String? = findAnnotation(node, "rdfs:comment", lang)

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

    fun findAllAnnotations(node: PsiElement, propName: String): List<Pair<String, String?>> {
        var current: PsiElement? = node
        val candidates = mutableListOf<Pair<String, String?>>()

        while (current != null && current !is amsFile) {
            if (current is ANTLRPsiNode && current.node.elementType is RuleIElementType) {
                val type = (current.node.elementType as RuleIElementType).ruleIndex
                if (type == OwlDslParser.RULE_annotatedAxiom || type == OwlDslParser.RULE_annotatedOntologyHeader) {
                    val blocks = current.children.filter { 
                        it is ANTLRPsiNode && it.node.elementType is RuleIElementType && 
                        (it.node.elementType as RuleIElementType).ruleIndex == OwlDslParser.RULE_annotationBlock 
                    }
                    for (block in blocks) {
                        val list = block.children.find { 
                            it is ANTLRPsiNode && it.node.elementType is RuleIElementType && 
                            (it.node.elementType as RuleIElementType).ruleIndex == OwlDslParser.RULE_annotationList 
                        }
                        val annotations = list?.children?.filter { 
                            it is ANTLRPsiNode && it.node.elementType is RuleIElementType && 
                            (it.node.elementType as RuleIElementType).ruleIndex == OwlDslParser.RULE_annotation 
                        } ?: emptyList()

                        for (ann in annotations) {
                            val propId = ann.children.find { 
                                it is ANTLRPsiNode && it.node.elementType is RuleIElementType && 
                                (it.node.elementType as RuleIElementType).ruleIndex == OwlDslParser.RULE_entityUsage 
                            }
                            if (propId?.text?.endsWith(propName) == true || propId?.text == propName) {
                                val literal = ann.children.find { 
                                    it is ANTLRPsiNode && it.node.elementType is RuleIElementType && 
                                    (it.node.elementType as RuleIElementType).ruleIndex == OwlDslParser.RULE_literal 
                                }
                                if (literal != null) {
                                    val langTag = literal.children.find { it.node.elementType.toString().contains("LANGTAG") }?.text
                                    val rawText = literal.text
                                    val content = when {
                                        rawText.startsWith("\"\"\"") -> rawText.substringAfter("\"\"\"").substringBeforeLast("\"\"\"")
                                        rawText.startsWith("\"") -> rawText.substringAfter("\"").substringBeforeLast("\"")
                                        else -> rawText
                                    }
                                    candidates.add(content to langTag)
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
        var p = element.parent
        while (p != null) {
            if (p is ANTLRPsiNode) {
                val type = (p.node.elementType as? RuleIElementType)?.ruleIndex
                if (type == OwlDslParser.RULE_classAxiom ||
                    type == OwlDslParser.RULE_objectPropertyAxiom ||
                    type == OwlDslParser.RULE_dataPropertyAxiom ||
                    type == OwlDslParser.RULE_annotationPropertyAxiom ||
                    type == OwlDslParser.RULE_datatypeAxiom ||
                    type == OwlDslParser.RULE_individualAxiom) {
                    return p
                }
            }
            p = p.parent
        }
        return null
    }
}
