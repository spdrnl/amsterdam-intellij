package com.github.spdrnl.amsterdamintellij.psi

import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import com.intellij.psi.util.PsiTreeUtil
import com.github.spdrnl.amsterdamintellij.lang.amsFile
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

class AmsCurieLocalNameReference(element: AmsCurie, range: TextRange) : PsiReferenceBase<AmsCurie>(element, range), PsiPolyVariantReference {
    
    override fun resolve(): PsiElement? {
        val results = multiResolve(false)
        return if (results.size == 1) results[0].element else null
    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val file = element.containingFile as? amsFile ?: return emptyArray()
        val elementIri = element.getFullIri() ?: return emptyArray()
        
        val definitions = file.getDefinitionsByIri()[elementIri] ?: emptyList()
        val results = definitions
            .filter { it !== element }
            .map { PsiElementResolveResult(it) }
        
        // If no definitions found by IRI, fall back to matching literal text if it's a CURIE
        if (results.isEmpty()) {
             val elementText = element.text
             val curies = PsiTreeUtil.findChildrenOfType(file, AmsCurie::class.java)
             return curies
                .filter { it !== element && it.text == elementText && it.isDef() }
                .map { PsiElementResolveResult(it) }
                .toTypedArray()
        }
        
        return results.toTypedArray()
    }

    override fun handleElementRename(newElementName: String): PsiElement {
        return element.setName(newElementName)
    }
}
