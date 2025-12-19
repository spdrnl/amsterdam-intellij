package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.intellij.navigation.ChooseByNameContributor
import com.intellij.navigation.NavigationItem
import com.intellij.openapi.project.Project
import com.intellij.psi.search.FilenameIndex
import com.intellij.psi.search.GlobalSearchScope

class AmsSymbolContributor : ChooseByNameContributor {
    override fun getNames(project: Project, includeNonProjectItems: Boolean): Array<String> {
        val curies = mutableListOf<String>()
        val files = FilenameIndex.getAllFilesByExt(project, "ams", GlobalSearchScope.allScope(project))
        for (file in files) {
            val psiFile = com.intellij.psi.PsiManager.getInstance(project).findFile(file) as? amsFile ?: continue
            val allDefs = psiFile.getAllDefinitions()
            for (curie in allDefs) {
                curie.text?.let { curies.add(it) }
            }
        }
        return curies.toTypedArray()
    }

    override fun getItemsByName(
        name: String,
        pattern: String,
        project: Project,
        includeNonProjectItems: Boolean
    ): Array<NavigationItem> {
        val items = mutableListOf<NavigationItem>()
        val files = FilenameIndex.getAllFilesByExt(project, "ams", GlobalSearchScope.allScope(project))
        for (file in files) {
            val psiFile = com.intellij.psi.PsiManager.getInstance(project).findFile(file) as? amsFile ?: continue
            val allDefs = psiFile.getAllDefinitions()
            for (curie in allDefs) {
                if (curie.text == name) {
                    items.add(AmsNavigationItem(curie))
                }
            }
        }
        return items.toTypedArray()
    }
}

class AmsNavigationItem(private val element: AmsCurie) : NavigationItem {
    override fun getName(): String = AmsPsiUtil.getAxiomLabel(AmsPsiUtil.findAxiom(element) ?: element)
    override fun getPresentation() = amsStructureViewElement(AmsPsiUtil.findAxiom(element) ?: element).presentation
    override fun navigate(requestFocus: Boolean) = element.navigate(requestFocus)
    override fun canNavigate(): Boolean = element.canNavigate()
    override fun canNavigateToSource(): Boolean = element.canNavigateToSource()
}
