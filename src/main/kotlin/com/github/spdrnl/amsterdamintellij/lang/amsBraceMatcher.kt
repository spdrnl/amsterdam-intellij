package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory

class amsBraceMatcher : PairedBraceMatcher {
    companion object {
        private val PAIRS: Array<BracePair> by lazy {
            val tokenTypes = PSIElementTypeFactory.getTokenIElementTypes(amsLanguage.INSTANCE)
            arrayOf(
                BracePair(tokenTypes[OwlDslLexer.LPAREN], tokenTypes[OwlDslLexer.RPAREN], false), // ( )
                BracePair(tokenTypes[OwlDslLexer.LBRACE], tokenTypes[OwlDslLexer.RBRACE], true)  // { }
            )
        }
    }

    override fun getPairs(): Array<BracePair> = PAIRS

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?): Boolean = true

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset
}
