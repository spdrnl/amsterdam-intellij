package com.github.spdrnl.amsterdamintellij.psi

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.util.PsiTreeUtil

/**
 * A reference from the namespace part of an IRI string to the Prefix statement.
 */
class AmsNamespaceReference(
    element: AmsCurie,
    range: TextRange,
    private val prefixHeader: PsiElement
) : PsiReferenceBase<AmsCurie>(element, range) {

    override fun resolve(): PsiElement = prefixHeader

    override fun handleElementRename(newElementName: String): PsiElement {
        val resolved = resolve()
        if (resolved is AmsPrefixHeader) {
            val nsCurie = PsiTreeUtil.findChildOfType(resolved, AmsCurie::class.java)
            if (nsCurie != null) {
                nsCurie.setName(newElementName)
            }
        } else if (resolved is AmsCurie) {
            resolved.setName(newElementName)
        }
        
        // After renaming the Prefix (and all IRIs starting with it), 
        // we might also need to update THIS element if it wasn't already replaced.
        // But AmsCurie.setName on the namespaceIRI part already handles updating other IRIs.
        
        return element
    }
}
