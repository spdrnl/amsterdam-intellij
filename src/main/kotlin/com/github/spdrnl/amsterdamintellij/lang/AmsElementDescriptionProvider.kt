package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.intellij.psi.ElementDescriptionLocation
import com.intellij.psi.ElementDescriptionProvider
import com.intellij.psi.PsiElement
import com.intellij.refactoring.util.RefactoringDescriptionLocation
import org.antlr.intellij.adaptor.lexer.RuleIElementType

class AmsElementDescriptionProvider : ElementDescriptionProvider {
    override fun getElementDescription(element: PsiElement, location: ElementDescriptionLocation): String? {
        if (location is RefactoringDescriptionLocation && element is AmsCurie) {
            return if (element.text.startsWith('<')) "IRI" else "CURIE"
        }
        return null
    }
}
