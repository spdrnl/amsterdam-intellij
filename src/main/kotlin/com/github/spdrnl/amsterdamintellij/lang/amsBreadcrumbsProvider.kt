package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.intellij.lang.Language
import com.intellij.psi.PsiElement
import com.intellij.ui.breadcrumbs.BreadcrumbsProvider
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import javax.swing.Icon

class amsBreadcrumbsProvider : BreadcrumbsProvider {
    override fun getLanguages(): Array<Language> = arrayOf(amsLanguage.INSTANCE)

    override fun acceptElement(element: PsiElement): Boolean {
        if (element is ANTLRPsiNode) {
            val elementType = element.node.elementType
            if (elementType is RuleIElementType) {
                return when (elementType.ruleIndex) {
                    OwlDslParser.RULE_ontologyHeader,
                    OwlDslParser.RULE_classAxiom,
                    OwlDslParser.RULE_objectPropertyAxiom,
                    OwlDslParser.RULE_dataPropertyAxiom,
                    OwlDslParser.RULE_annotationPropertyAxiom,
                    OwlDslParser.RULE_individualAxiom,
                    OwlDslParser.RULE_prefixDecl,
                    OwlDslParser.RULE_classClause,
                    OwlDslParser.RULE_objectPropertyClause,
                    OwlDslParser.RULE_dataPropertyClause,
                    OwlDslParser.RULE_annotationPropertyClause,
                    OwlDslParser.RULE_primaryClassExpr,
                    OwlDslParser.RULE_boolClassExpr,
                    OwlDslParser.RULE_classExpr -> true

                    else -> false
                }
            }
        }
        return false
    }

    override fun getElementInfo(element: PsiElement): String {
        return if (element is ANTLRPsiNode) {
            // Reusing logic similar to amsStructureViewElement
            val structureElement = amsStructureViewElement(element)
            structureElement.getPresentableText()
        } else {
            element.text
        }
    }

    override fun getElementIcon(element: PsiElement): Icon? {
        return if (element is ANTLRPsiNode) {
            val structureElement = amsStructureViewElement(element)
            structureElement.presentation.getIcon(false)
        } else {
            null
        }
    }

    override fun getParent(element: PsiElement): PsiElement? {
        return element.parent
    }
}
