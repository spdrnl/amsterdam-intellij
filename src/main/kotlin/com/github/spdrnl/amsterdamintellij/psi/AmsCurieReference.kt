package com.github.spdrnl.amsterdamintellij.psi

import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import com.intellij.psi.util.PsiTreeUtil

class AmsCurieReference(element: PsiElement, range: TextRange) : PsiReferenceBase<PsiElement>(element, range),
    PsiPolyVariantReference {

    override fun resolve(): PsiElement? {
        val results = multiResolve(false)
        return if (results.size == 1) results[0].element else null
    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val prefix = element.text.substring(rangeInElement.startOffset, rangeInElement.endOffset)
        val file = element.containingFile
        val prefixDecls = PsiTreeUtil.findChildrenOfType(file, AmsPrefixHeader::class.java)

        return prefixDecls
            .filter { it.name == prefix }
            .map { PsiElementResolveResult(it) }
            .toTypedArray()
    }

    override fun handleElementRename(newElementName: String): PsiElement {
        // Here we handle the prefix rename in the CURIE
        val currentText = element.text
        val newPrefix = newElementName
        val localPart = if (currentText.contains(':')) currentText.substring(currentText.indexOf(':')) else ":"
        val newText = newPrefix + localPart

        val newCurie = AmsElementFactory.createCurie(element.project, newText)
        return element.replace(newCurie)
    }
}
