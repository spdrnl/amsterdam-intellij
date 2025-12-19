package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.codeInsight.template.TemplateContextType
import com.intellij.psi.PsiFile

class AmsContext : TemplateContextType("AMSTERDAM", "Amsterdam") {
    override fun isInContext(file: PsiFile, offset: Int): Boolean {
        return file is amsFile
    }
}
