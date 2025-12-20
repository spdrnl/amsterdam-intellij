package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer
import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiFile
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.lexer.TokenIElementType

class AmsFormattingModelBuilder : FormattingModelBuilder {
    override fun createModel(formattingContext: FormattingContext): FormattingModel {
        val settings = formattingContext.codeStyleSettings
        val spacingBuilder = createSpacingBuilder(settings)
        return FormattingModelProvider.createFormattingModelForPsiFile(
            formattingContext.containingFile,
            AmsFormattingBlock(formattingContext.node, null, null, Indent.getNoneIndent(), spacingBuilder),
            settings
        )
    }

    private fun createSpacingBuilder(settings: CodeStyleSettings): SpacingBuilder {
        val tokenTypes = PSIElementTypeFactory.getTokenIElementTypes(amsLanguage.INSTANCE)
        val ruleTypes = PSIElementTypeFactory.getRuleIElementTypes(amsLanguage.INSTANCE)
        val semicolon = tokenTypes[OwlDslLexer.SEMICOLON]
        val dot = tokenTypes[OwlDslLexer.DOT]
        val colon = tokenTypes[OwlDslLexer.COLON]
        val prefixName = tokenTypes[OwlDslLexer.PREFIX_NAME]
        val curie = tokenTypes[OwlDslLexer.CURIE]
        val curieEmpty = tokenTypes[OwlDslLexer.CURIE_EMPTY]

        val topLevel = TokenSet.create(
            ruleTypes[OwlDslParser.RULE_prefixDecl],
            ruleTypes[OwlDslParser.RULE_ontologyPropertyBlock],
            ruleTypes[OwlDslParser.RULE_annotatedAxiom],
            ruleTypes[OwlDslParser.RULE_bareAxiom],
            ruleTypes[OwlDslParser.RULE_annotatedOntologyHeader],
            ruleTypes[OwlDslParser.RULE_ontologyHeader]
        )

        return SpacingBuilder(settings, amsLanguage.INSTANCE)
            // No space in CURIEs
            .between(colon, curie).spacing(0, 0, 0, false, 0)
            .between(prefixName, curie).spacing(0, 0, 0, false, 0)
            .between(colon, curieEmpty).spacing(0, 0, 0, false, 0)
            .between(prefixName, curieEmpty).spacing(0, 0, 0, false, 0)
            // After semicolon: newline
            .after(semicolon).spacing(0, 0, 1, false, 0)
            // Space around COLON in prefixes
            .around(colon).spacing(1, 1, 0, false, 0)
            // Space before DOT at the end of axioms
            .before(dot).spacing(1, 1, 0, false, 0)
            .after(dot).spacing(0, 0, 1, false, 0)
            // Visual separation between top-level elements: 1 blank line
            .between(topLevel, topLevel).spacing(0, 0, 2, false, 1)
            // Space around some operators
            .around(tokenTypes[OwlDslLexer.SUBSET_EQ]).spacing(1, 1, 0, false, 0)
            .around(tokenTypes[OwlDslLexer.INTERSECTION]).spacing(1, 1, 0, false, 0)
            .around(tokenTypes[OwlDslLexer.UNION_SYM]).spacing(1, 1, 0, false, 0)
            .around(tokenTypes[OwlDslLexer.SOME_SYM]).spacing(1, 1, 0, false, 0)
            .around(tokenTypes[OwlDslLexer.ONLY_SYM]).spacing(1, 1, 0, false, 0)
            // Space before keywords that often start a clause
            .before(tokenTypes[OwlDslLexer.DOMAIN_KW]).spacing(1, 1, 0, false, 0)
            .before(tokenTypes[OwlDslLexer.RANGE_KW]).spacing(1, 1, 0, false, 0)
    }

    private fun getRule(ruleIndex: Int): RuleIElementType {
        return PSIElementTypeFactory.getRuleIElementTypes(amsLanguage.INSTANCE)[ruleIndex]
    }

    override fun getRangeAffectingIndent(file: PsiFile, offset: Int, elementAtOffset: ASTNode): TextRange? = null
}

class AmsFormattingBlock(
    private val node: ASTNode,
    private val alignment: Alignment?,
    private val wrap: Wrap?,
    private val indent: Indent?,
    private val spacingBuilder: SpacingBuilder
) : ASTBlock {

    override fun getNode(): ASTNode = node
    override fun getTextRange(): TextRange = node.textRange
    override fun getAlignment(): Alignment? = alignment
    override fun getWrap(): Wrap? = wrap
    override fun getIndent(): Indent? = indent

    override fun getSubBlocks(): List<Block> {
        val blocks = mutableListOf<Block>()
        var child = node.firstChildNode
        while (child != null) {
            if (child.elementType !== com.intellij.psi.TokenType.WHITE_SPACE) {
                blocks.add(
                    AmsFormattingBlock(
                        child,
                        null,
                        null,
                        computeIndent(child),
                        spacingBuilder
                    )
                )
            }
            child = child.treeNext
        }
        return blocks
    }

    private fun computeIndent(child: ASTNode): Indent? {
        val parent = child.treeParent ?: return Indent.getNoneIndent()
        val parentType = parent.elementType

        if (parentType is RuleIElementType) {
            when (parentType.ruleIndex) {
                OwlDslParser.RULE_classSubOrEqAxiom,
                OwlDslParser.RULE_objectPropertyDomainRangeAxiom,
                OwlDslParser.RULE_dataPropertyDomainRangeAxiom,
                OwlDslParser.RULE_individualAxiom,
                OwlDslParser.RULE_annotationPropertyAxiom -> {
                    // Elements after the first line (the declaration) should be indented
                    // In many axioms, the first few children are keyword, maybe comment, and ID.
                    // Clauses usually come after these.

                    // Simple heuristic: if it's not the first few children, indent it.
                    // Or more specifically, if it's a clause.
                    val childType = child.elementType
                    if (childType is RuleIElementType) {
                        when (childType.ruleIndex) {
                            OwlDslParser.RULE_classClause,
                            OwlDslParser.RULE_objectPropertyClause,
                            OwlDslParser.RULE_dataPropertyClause,
                            OwlDslParser.RULE_annotationPropertyClause,
                            OwlDslParser.RULE_individualAxiomBody,
                            OwlDslParser.RULE_propAssertionList -> return Indent.getNormalIndent()
                        }
                    }

                    // Also indent if it follows a semicolon
                    var prev = child.treePrev
                    while (prev != null && prev.elementType === com.intellij.psi.TokenType.WHITE_SPACE) {
                        prev = prev.treePrev
                    }
                    if (prev?.elementType is TokenIElementType && (prev.elementType as TokenIElementType).antlrTokenType == OwlDslLexer.SEMICOLON) {
                        return Indent.getNormalIndent()
                    }
                }
            }
        }

        return Indent.getNoneIndent()
    }

    override fun getSpacing(child1: Block?, child2: Block): Spacing? {
        return spacingBuilder.getSpacing(this, child1, child2)
    }

    override fun getChildAttributes(newChildIndex: Int): ChildAttributes {
        return ChildAttributes(Indent.getNoneIndent(), null)
    }

    override fun isIncomplete(): Boolean = false
    override fun isLeaf(): Boolean = node.firstChildNode == null
}
