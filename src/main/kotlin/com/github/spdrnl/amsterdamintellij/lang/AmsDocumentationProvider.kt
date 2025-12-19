package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.intellij.lang.documentation.AbstractDocumentationProvider
import com.intellij.psi.PsiElement
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

class AmsDocumentationProvider : AbstractDocumentationProvider() {
    override fun generateDoc(element: PsiElement?, originalElement: PsiElement?): String? {
        if (element is AmsCurie) {
            val axiom = AmsPsiUtil.findAxiom(element)
            if (axiom != null) {
                val sb = StringBuilder()
                val type = getAxiomType(axiom)
                if (type != null) {
                    sb.append("<b>$type</b><br/>")
                }

                val label = AmsPsiUtil.findLabelAnnotation(axiom)
                if (label != null) {
                    sb.append("<b>Label:</b> $label<br/>")
                }

                val skosDef = AmsPsiUtil.findAllAnnotations(axiom, "skos:definition").firstOrNull()?.first
                if (skosDef != null) {
                    sb.append("<b>Definition:</b> $skosDef<br/>")
                }

                val inlineComment = AmsPsiUtil.findInlineComment(axiom)
                if (inlineComment != null) {
                    sb.append("<b>Comment:</b> $inlineComment<br/>")
                }

                val comment = AmsPsiUtil.findCommentAnnotation(axiom)
                if (comment != null) {
                    sb.append("<br/>$comment")
                }

                val iri = element.getFullIri()
                if (iri != null) {
                    sb.append("<br/><br/><icon src='AllIcons.Nodes.PpLib'/> <i>$iri</i>")
                }

                return if (sb.isNotEmpty()) sb.toString() else null
            }
        }
        return null
    }

    override fun getQuickNavigateInfo(element: PsiElement?, originalElement: PsiElement?): String? {
        if (element is AmsCurie) {
            val axiom = AmsPsiUtil.findAxiom(element)
            if (axiom != null) {
                val type = getAxiomType(axiom)
                val label = AmsPsiUtil.findBestLabel(axiom)
                val iri = element.getFullIri()

                return buildString {
                    if (type != null) append("[$type] ")
                    if (label != null) append("\"$label\" ")
                    if (iri != null) append("<$iri>")
                }
            }
        }
        return null
    }

    private fun getAxiomType(axiom: PsiElement): String? {
        if (axiom is ANTLRPsiNode) {
            val type = (axiom.node.elementType as? RuleIElementType)?.ruleIndex
            return when (type) {
                OwlDslParser.RULE_classAxiom -> "Class"
                OwlDslParser.RULE_objectPropertyAxiom -> "Object Property"
                OwlDslParser.RULE_dataPropertyAxiom -> "Data Property"
                OwlDslParser.RULE_annotationPropertyAxiom -> "Annotation Property"
                OwlDslParser.RULE_datatypeAxiom -> "Datatype"
                OwlDslParser.RULE_individualAxiom -> "Individual"
                else -> null
            }
        }
        return null
    }
}
