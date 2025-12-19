package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer
import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.github.spdrnl.amsterdamintellij.psi.AmsPrefixHeader
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.RuleIElementType

class amsParserDefinition : ParserDefinition {
    companion object {
        val FILE = IFileElementType(amsLanguage.INSTANCE)
    }

    init {
        PSIElementTypeFactory.defineLanguageIElementTypes(amsLanguage.INSTANCE, OwlDslParser.VOCABULARY, OwlDslParser.ruleNames)
    }

    override fun createLexer(project: Project?): Lexer = amsLexerAdapter()
    
    override fun getWhitespaceTokens(): TokenSet = PSIElementTypeFactory.createTokenSet(amsLanguage.INSTANCE, com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer.WS)

    override fun createParser(project: Project?): PsiParser {
        return object : org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor(amsLanguage.INSTANCE, com.github.spdrnl.amsterdamintellij.parser.OwlDslParser(null)) {
            override fun parse(parser: org.antlr.v4.runtime.Parser?, root: com.intellij.psi.tree.IElementType?): org.antlr.v4.runtime.tree.ParseTree {
                return (parser as com.github.spdrnl.amsterdamintellij.parser.OwlDslParser).ontology()
            }
        }
    }

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = PSIElementTypeFactory.createTokenSet(amsLanguage.INSTANCE, com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer.LINE_COMMENT, com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer.BLOCK_COMMENT)

    override fun getStringLiteralElements(): TokenSet = PSIElementTypeFactory.createTokenSet(amsLanguage.INSTANCE, com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer.STRING)

    override fun createElement(node: ASTNode?): PsiElement {
        val elementType = node!!.elementType
        if (elementType is RuleIElementType) {
            when (elementType.ruleIndex) {
                OwlDslParser.RULE_prefixDecl -> return AmsPrefixHeader(node)
                OwlDslParser.RULE_classId,
                OwlDslParser.RULE_propId,
                OwlDslParser.RULE_datatypeId,
                OwlDslParser.RULE_individualId,
                OwlDslParser.RULE_entityUsage,
                OwlDslParser.RULE_entityId,
                OwlDslParser.RULE_fullIRI,
                OwlDslParser.RULE_namespaceIRI -> return AmsCurie(node)
                OwlDslParser.RULE_classAxiom -> return org.antlr.intellij.adaptor.psi.ANTLRPsiNode(node)
            }
        }
        
        return org.antlr.intellij.adaptor.psi.ANTLRPsiNode(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile = amsFile(viewProvider)
}
