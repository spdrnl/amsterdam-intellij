package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer
import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory

class AmsSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
        val ID = createTextAttributesKey("AMS_ID", DefaultLanguageHighlighterColors.IDENTIFIER)
        val KEYWORD = createTextAttributesKey("AMS_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val STRING = createTextAttributesKey("AMS_STRING", DefaultLanguageHighlighterColors.STRING)
        val LINE_COMMENT = createTextAttributesKey("AMS_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BLOCK_COMMENT = createTextAttributesKey("AMS_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
        val NUMBER = createTextAttributesKey("AMS_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val OPERATOR = createTextAttributesKey("AMS_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val BRACES = createTextAttributesKey("AMS_BRACES", DefaultLanguageHighlighterColors.BRACES)
        val PARENTHESES = createTextAttributesKey("AMS_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
        val DOT = createTextAttributesKey("AMS_DOT", DefaultLanguageHighlighterColors.DOT)
        val COMMA = createTextAttributesKey("AMS_COMMA", DefaultLanguageHighlighterColors.COMMA)
        val SEMICOLON = createTextAttributesKey("AMS_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON)
        val PRE_IRI = createTextAttributesKey("AMS_PRE_IRI", DefaultLanguageHighlighterColors.METADATA)
        val IRI = createTextAttributesKey("AMS_IRI", DefaultLanguageHighlighterColors.STRING)
        val DEFAULT_TEXT = createTextAttributesKey("AMS_DEFAULT_TEXT")

        val ANNOTATION_MENTION = createTextAttributesKey("AMS_ANNOTATION_MENTION", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION)

        val SEMANTIC_LABEL =
            createTextAttributesKey("AMS_SEMANTIC_LABEL", DefaultLanguageHighlighterColors.STATIC_FIELD)
        val SEMANTIC_ID = createTextAttributesKey("AMS_SEMANTIC_ID", DefaultLanguageHighlighterColors.IDENTIFIER)
        val SEMANTIC_ID_REF = createTextAttributesKey("AMS_SEMANTIC_ID_REF", DefaultLanguageHighlighterColors.METADATA)
        val INLAY_TEXT = createTextAttributesKey("AMS_INLAY_TEXT", DefaultLanguageHighlighterColors.INLINE_PARAMETER_HINT)
        val CLASS_KW = createTextAttributesKey("AMS_CLASS_KW", DefaultLanguageHighlighterColors.KEYWORD)
        val PROP_KW = createTextAttributesKey("AMS_PROP_KW", DefaultLanguageHighlighterColors.KEYWORD)
        val INDIVIDUAL_KW = createTextAttributesKey("AMS_INDIVIDUAL_KW", DefaultLanguageHighlighterColors.KEYWORD)
    }

    override fun getHighlightingLexer(): Lexer {
        val lexer = OwlDslLexer(null)
        return ANTLRLexerAdaptor(amsLanguage.INSTANCE, lexer)
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        if (tokenType !is org.antlr.intellij.adaptor.lexer.TokenIElementType) return EMPTY_KEYS
        val antlrTokenType = tokenType.antlrTokenType
        return when (antlrTokenType) {
            OwlDslLexer.CURIE, OwlDslLexer.CURIE_EMPTY, OwlDslLexer.PREFIX_NAME -> arrayOf(ID)
            OwlDslLexer.STRING, OwlDslLexer.STRING3 -> arrayOf(STRING)
            OwlDslLexer.LINE_COMMENT -> arrayOf(LINE_COMMENT)
            OwlDslLexer.BLOCK_COMMENT -> arrayOf(BLOCK_COMMENT)
            OwlDslLexer.INTEGER, OwlDslLexer.DECIMAL, OwlDslLexer.DOUBLE -> arrayOf(NUMBER)
            OwlDslLexer.IRI -> arrayOf(IRI)
            OwlDslLexer.ANNOTATION, OwlDslLexer.PROPERTY -> arrayOf(ANNOTATION_MENTION)
            OwlDslLexer.LANGTAG -> arrayOf(PRE_IRI)

            OwlDslLexer.DATA_PROPERTY_KW, OwlDslLexer.DATA_KW, OwlDslLexer.EQUIVALENT_DATA_PROPERTIES_KW,
            OwlDslLexer.DISJOINT_DATA_PROPERTIES_KW, OwlDslLexer.ANNOTATION_PROPERTY_KW, OwlDslLexer.ANNOTATION_KW,
            OwlDslLexer.DATATYPE_KW, OwlDslLexer.DATATYPE_DEFINITION_KW, OwlDslLexer.SUB_PROPERTY_CHAIN_KW,
            OwlDslLexer.SUBPROPERTY_CHAIN_KW, OwlDslLexer.CHAIN_KW -> arrayOf(PROP_KW)

            OwlDslLexer.INDIVIDUAL_KW -> arrayOf(INDIVIDUAL_KW)

            OwlDslLexer.CLASS_KW -> arrayOf(CLASS_KW)

            OwlDslLexer.PREFIX_KW, OwlDslLexer.ONTOLOGY_KW, OwlDslLexer.VERSION_IRI_KW,
            OwlDslLexer.EQUIVALENT_CLASSES_KW, OwlDslLexer.ALL_DISJOINT_CLASSES_KW,
            OwlDslLexer.SUB_CLASS_OF_KW, OwlDslLexer.IS_KW, OwlDslLexer.A_KW,
            OwlDslLexer.AN_KW, OwlDslLexer.SUBCLASS_KW, OwlDslLexer.OF_KW,
            OwlDslLexer.EQUIVALENT_TO_KW, OwlDslLexer.EQUIVALENT_KW, OwlDslLexer.TO_KW,
            OwlDslLexer.DISJOINT_WITH_KW, OwlDslLexer.DISJOINT_KW, OwlDslLexer.WITH_KW,
            OwlDslLexer.DISJOINT_UNION_OF_KW, OwlDslLexer.UNION_KW, OwlDslLexer.HAS_KW,
            OwlDslLexer.KEY_KW, OwlDslLexer.OBJECT_PROPERTY_KW, OwlDslLexer.OBJECT_KW,
            OwlDslLexer.PROPERTY_KW, OwlDslLexer.EQUIVALENT_OBJECT_PROPERTIES_KW, OwlDslLexer.DISJOINT_OBJECT_PROPERTIES_KW,
            OwlDslLexer.SUB_PROPERTY_OF_KW, OwlDslLexer.SUBPROPERTY_KW, OwlDslLexer.DOMAIN_KW,
            OwlDslLexer.RANGE_KW, OwlDslLexer.CHARACTERISTICS_KW, OwlDslLexer.INVERSE_KW,
            OwlDslLexer.TYPE_KW, OwlDslLexer.SAME_AS_KW, OwlDslLexer.SAME_KW,
            OwlDslLexer.AS_KW, OwlDslLexer.DIFFERENT_FROM_KW, OwlDslLexer.DIFFERENT_KW,
            OwlDslLexer.FROM_KW, OwlDslLexer.NOT_KW, OwlDslLexer.AND_KW,
            OwlDslLexer.OR_KW, OwlDslLexer.THING_KW, OwlDslLexer.NOTHING_KW,
            OwlDslLexer.SOME_KW, OwlDslLexer.ONLY_KW, OwlDslLexer.HAS_VALUE_KW,
            OwlDslLexer.MIN_KW, OwlDslLexer.MAX_KW, OwlDslLexer.EXACTLY_KW,
            OwlDslLexer.THAT_KW, OwlDslLexer.AT_KW, OwlDslLexer.LEAST_KW,
            OwlDslLexer.MOST_KW, OwlDslLexer.ONE_OF_KW, OwlDslLexer.ONE_KW,
            OwlDslLexer.ALL_OF_KW, OwlDslLexer.ALL_KW, OwlDslLexer.ANY_OF_KW,
            OwlDslLexer.ANY_KW, OwlDslLexer.FUNCTIONAL_KW, OwlDslLexer.INVERSE_FUNCTIONAL_KW,
            OwlDslLexer.TRANSITIVE_KW, OwlDslLexer.SYMMETRIC_KW, OwlDslLexer.ASYMMETRIC_KW,
            OwlDslLexer.REFLEXIVE_KW, OwlDslLexer.IRREFLEXIVE_KW, OwlDslLexer.RESTRICTION_KW,
            OwlDslLexer.GREATER_KW, OwlDslLexer.THAN_KW, OwlDslLexer.LESS_KW,
            OwlDslLexer.EQUAL_KW, OwlDslLexer.TRUE_KW, OwlDslLexer.FALSE_KW -> arrayOf(KEYWORD)

            OwlDslLexer.SUBSET_EQ, OwlDslLexer.LE_SEQ, OwlDslLexer.NOT_SYM,
            OwlDslLexer.INTERSECTION, OwlDslLexer.UNION_SYM, OwlDslLexer.SOME_SYM,
            OwlDslLexer.ONLY_SYM, OwlDslLexer.GE, OwlDslLexer.LE,
            OwlDslLexer.GT, OwlDslLexer.LT, OwlDslLexer.EQ,
            OwlDslLexer.GE_SYM, OwlDslLexer.LE_SYM, OwlDslLexer.GE_ASC,
            OwlDslLexer.LE_ASC, OwlDslLexer.GT_SYM, OwlDslLexer.LT_SYM,
            OwlDslLexer.EQ_SYM, OwlDslLexer.COMPOSITION, OwlDslLexer.THEN,
            OwlDslLexer.FACET, OwlDslLexer.DATATYPE_SEP -> arrayOf(OPERATOR)

            OwlDslLexer.LPAREN, OwlDslLexer.RPAREN -> arrayOf(PARENTHESES)
            OwlDslLexer.LBRACE, OwlDslLexer.RBRACE -> arrayOf(BRACES)
            OwlDslLexer.DOT -> arrayOf(DOT)
            OwlDslLexer.COMMA -> arrayOf(COMMA)
            OwlDslLexer.SEMICOLON -> arrayOf(SEMICOLON)
            OwlDslLexer.COLON -> arrayOf(ID) // Colon as part of prefix declaration is an ID

            else -> arrayOf(DEFAULT_TEXT)
        }
    }
}
