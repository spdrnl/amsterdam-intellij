package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.intellij.lang.cacheBuilder.DefaultWordsScanner
import com.intellij.lang.cacheBuilder.WordsScanner
import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer

class AmsFindUsagesProvider : FindUsagesProvider {
    override fun getWordsScanner(): WordsScanner? {
        val tokenTypes = PSIElementTypeFactory.getTokenIElementTypes(amsLanguage.INSTANCE)
        return DefaultWordsScanner(
            amsLexerAdapter(),
            TokenSet.create(tokenTypes[OwlDslLexer.PREFIX_NAME], tokenTypes[OwlDslLexer.CURIE], tokenTypes[OwlDslLexer.CURIE_EMPTY], tokenTypes[OwlDslLexer.IRI]),
            TokenSet.create(tokenTypes[OwlDslLexer.LINE_COMMENT], tokenTypes[OwlDslLexer.BLOCK_COMMENT]),
            TokenSet.create(tokenTypes[OwlDslLexer.STRING3], tokenTypes[OwlDslLexer.STRING])
        )
    }

    override fun canFindUsagesFor(psiElement: PsiElement): Boolean {
        return psiElement is AmsCurie
    }

    override fun getHelpId(psiElement: PsiElement): String? = null

    override fun getType(element: PsiElement): String {
        if (element is AmsCurie) {
            val ruleIndex = (element.node.elementType as? RuleIElementType)?.ruleIndex
            when (ruleIndex) {
                OwlDslParser.RULE_classId -> return "class"
                OwlDslParser.RULE_propId -> return "property"
                OwlDslParser.RULE_datatypeId -> return "data type"
                OwlDslParser.RULE_individualId -> return "individual"
                OwlDslParser.RULE_namespaceIRI -> return "prefix"
                OwlDslParser.RULE_entityId -> return "entity"
            }
            
            var current: PsiElement? = element.parent
            while (current != null) {
                val type = (current.node.elementType as? RuleIElementType)?.ruleIndex
                when (type) {
                    OwlDslParser.RULE_classAxiom -> return "class"
                    OwlDslParser.RULE_objectPropertyAxiom -> return "object property"
                    OwlDslParser.RULE_dataPropertyAxiom -> return "data property"
                    OwlDslParser.RULE_annotationPropertyAxiom -> return "annotation property"
                    OwlDslParser.RULE_datatypeAxiom -> return "data type"
                    OwlDslParser.RULE_individualAxiom -> return "individual"
                    OwlDslParser.RULE_prefixDecl -> return "prefix"
                }
                current = current.parent
            }
        }
        return "entity"
    }

    override fun getDescriptiveName(element: PsiElement): String {
        return if (element is AmsCurie) element.text else ""
    }

    override fun getNodeText(element: PsiElement, useFullName: Boolean): String {
        return if (element is AmsCurie) element.text else ""
    }
}
