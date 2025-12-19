package com.github.spdrnl.amsterdamintellij.psi

import com.github.spdrnl.amsterdamintellij.lang.amsLanguage
import com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.PsiReference
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

class AmsPrefixHeader(node: ASTNode) : ANTLRPsiNode(node), PsiNameIdentifierOwner {
    override fun getNameIdentifier(): PsiElement? {
        val tokenTypes = PSIElementTypeFactory.getTokenIElementTypes(amsLanguage.INSTANCE)
        val prefixName = node.findChildByType(tokenTypes[OwlDslLexer.PREFIX_NAME])
        if (prefixName != null) return prefixName.psi

        val colon = node.findChildByType(tokenTypes[OwlDslLexer.COLON])
        return colon?.psi
    }

    override fun getTextOffset(): Int = nameIdentifier?.textOffset ?: super.getTextOffset()

    override fun getName(): String? {
        val t = nameIdentifier?.text ?: return null
        return if (t == ":") "" else t.removeSuffix(":")
    }

    override fun setName(name: String): PsiElement {
        val id = nameIdentifier
        if (id != null) {
            val newPrefix = AmsElementFactory.createPrefixHeader(project, name)
            val newId = newPrefix.nameIdentifier
            if (newId != null) {
                id.replace(newId)
            }
        }
        return this
    }

    override fun getReference(): PsiReference? = null

    override fun getReferences(): Array<PsiReference> = PsiReference.EMPTY_ARRAY
}
