package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

class amsAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element is ANTLRPsiNode) {
            val elementType = element.node.elementType
            if (elementType is RuleIElementType) {
                when (elementType.ruleIndex) {
                    OwlDslParser.RULE_prefixDecl -> {
                        // Check if Prefix ends with .
                        if (!element.text.trim().endsWith(".")) {
                            holder.newAnnotation(HighlightSeverity.ERROR, "Prefix declaration must end with a dot")
                                .range(element.textRange)
                                .create()
                        }
                    }

                    OwlDslParser.RULE_commentOpt -> {
                        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(element.textRange)
                            .textAttributes(AmsSyntaxHighlighter.SEMANTIC_LABEL)
                            .create()
                    }

                    OwlDslParser.RULE_entityUsage,
                    OwlDslParser.RULE_entityId,
                    OwlDslParser.RULE_classId,
                    OwlDslParser.RULE_propId,
                    OwlDslParser.RULE_individualId,
                    OwlDslParser.RULE_datatypeId,
                    OwlDslParser.RULE_namespaceIRI -> {
                        if (element.text == "IntellijIdeaRulezzz") return

                        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(element.textRange)
                            .textAttributes(AmsSyntaxHighlighter.SEMANTIC_ID)
                            .create()

                        if (elementType.ruleIndex != OwlDslParser.RULE_namespaceIRI) {
                            checkUndefinedPrefix(element, holder)
                        }
                        if (element is AmsCurie && element.isDef()) {
                            checkDuplicateEntityId(element, holder)
                        }
                    }

                    OwlDslParser.RULE_annotation -> {
                        checkDuplicateAnnotation(element, holder)
                    }

                    OwlDslParser.RULE_ontology -> {
                        // Ignore INTELLIJ_DUMMY
                    }

                    OwlDslParser.RULE_classExpr,
                    OwlDslParser.RULE_propExpr -> {
                        // Recurse to children to find IDs? 
                        // Actually ANTLR adaptor should have already called annotate on children.
                    }
                }
            }
        }
    }

    private fun checkUndefinedPrefix(element: ANTLRPsiNode, holder: AnnotationHolder) {
        val text = element.text
        if (text.startsWith("<")) return
        val colonIndex = text.indexOf(':')
        if (colonIndex == -1) return

        val prefix = text.substring(0, colonIndex)
        val file = element.containingFile as? amsFile ?: return
        val prefixMap = file.getPrefixMap()

        if (!prefixMap.containsKey(prefix)) {
            holder.newAnnotation(HighlightSeverity.ERROR, "Unresolved prefix: $prefix")
                .range(element.textRange)
                .withFix(AddPrefixFix(prefix))
                .create()
        }
    }

    private fun checkDuplicateEntityId(element: AmsCurie, holder: AnnotationHolder) {
        val iri = element.getFullIri() ?: return
        val file = element.containingFile as? amsFile ?: return
        val defs = file.getDefinitionsByIri()[iri] ?: return

        if (defs.size > 1) {
            holder.newAnnotation(HighlightSeverity.ERROR, "Duplicate Entity ID: $iri")
                .range(element.textRange)
                .create()
        }
    }

    private fun checkDuplicateAnnotation(element: ANTLRPsiNode, holder: AnnotationHolder) {
        val propId = element.children.find {
            it is ANTLRPsiNode && (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_entityUsage
        } ?: return

        val propName = propId.text
        val isLabel = propName.endsWith("rdfs:label") || propName == "rdfs:label"
        val isSkosDef = propName.endsWith("skos:definition") || propName == "skos:definition"

        if (isLabel || isSkosDef) {
            val literal = element.children.find {
                it is ANTLRPsiNode && (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_literal
            } ?: return
            val file = element.containingFile as? amsFile ?: return
            val labelData = getLabelData(literal as ANTLRPsiNode)
            
            val matches = if (isLabel) {
                file.getAllLabels().filter { it.second == labelData }
            } else {
                file.getAllSkosDefinitions().filter { it.second == labelData }
            }

            if (matches.size > 1) {
                val msgPrefix = if (isLabel) "Duplicate rdfs:label" else "Duplicate skos:definition"
                holder.newAnnotation(
                    HighlightSeverity.ERROR,
                    "$msgPrefix: ${labelData.first}${labelData.second ?: ""}"
                )
                    .range(literal.textRange)
                    .create()
            }
        }
    }

    private fun getLabelData(literal: ANTLRPsiNode): Pair<String, String?> {
        return AmsPsiUtil.getLiteralContent(literal)
    }
}
