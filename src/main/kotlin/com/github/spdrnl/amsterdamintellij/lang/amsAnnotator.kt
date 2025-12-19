package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser

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
                    OwlDslParser.RULE_entityId,
                    OwlDslParser.RULE_classId,
                    OwlDslParser.RULE_propId,
                    OwlDslParser.RULE_individualId,
                    OwlDslParser.RULE_datatypeId,
                    OwlDslParser.RULE_namespaceIRI -> {
                        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                            .range(element.textRange)
                            .textAttributes(AmsSyntaxHighlighter.SEMANTIC_ID)
                            .create()
                    }
                }
            }
        }
    }
}
