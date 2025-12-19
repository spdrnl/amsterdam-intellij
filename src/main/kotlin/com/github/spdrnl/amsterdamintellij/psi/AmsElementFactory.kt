package com.github.spdrnl.amsterdamintellij.psi

import com.github.spdrnl.amsterdamintellij.lang.amsLanguage
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.util.PsiTreeUtil
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

object AmsElementFactory {
    fun createPrefixHeader(project: Project, name: String): AmsPrefixHeader {
        val file = createFile(project, "Prefix $name: <http://example.org/> .")
        return PsiTreeUtil.findChildOfType(file, AmsPrefixHeader::class.java)!!
    }

    fun createCurie(project: Project, text: String): PsiElement {
        val file = createFile(project, "Class $text .")
        return PsiTreeUtil.findChildOfType(file, AmsCurie::class.java)!!
    }

    fun createFile(project: Project, text: String): com.github.spdrnl.amsterdamintellij.lang.amsFile {
        val name = "dummy.ams"
        return PsiFileFactory.getInstance(project).createFileFromText(name, amsLanguage.INSTANCE, text) as com.github.spdrnl.amsterdamintellij.lang.amsFile
    }
}
