package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.intellij.navigation.ChooseByNameContributor
import com.intellij.navigation.NavigationItem
import com.intellij.openapi.project.Project
import com.intellij.psi.search.FilenameIndex
import com.intellij.psi.search.GlobalSearchScope

class AmsSymbolContributor : ChooseByNameContributor {
    override fun getNames(project: Project, includeNonProjectItems: Boolean): Array<String> {
        val names = mutableSetOf<String>()
        val files = FilenameIndex.getAllFilesByExt(project, "ams", GlobalSearchScope.allScope(project))
        for (file in files) {
            val psiFile = com.intellij.psi.PsiManager.getInstance(project).findFile(file) as? amsFile ?: continue
            
            // Add CURIE and IRI from definitions
            val allDefs = psiFile.getAllDefinitions()
            for (curie in allDefs) {
                curie.text?.let { names.add(it) }
                curie.getFullIri()?.let { names.add(it) }
            }

            // Add rdfs:label values
            val allLabels = psiFile.getAllLabels()
            for ((_, labelPair) in allLabels) {
                names.add(labelPair.first)
            }
        }
        return names.toTypedArray()
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
            
            // Match CURIE, IRI, or rdfs:label
            val allDefs = psiFile.getAllDefinitions()
            for (curie in allDefs) {
                if (curie.text == name || curie.getFullIri() == name) {
                    items.add(AmsNavigationItem(curie))
                }
                
                // Also check if rdfs:label matches
                val axiom = AmsPsiUtil.findAxiom(curie)
                if (axiom != null) {
                    val label = AmsPsiUtil.findLabelAnnotation(axiom)
                    if (label == name) {
                        items.add(AmsNavigationItem(curie))
                    }
                }
            }
        }
        return items.toTypedArray()
    }
}

class AmsNavigationItem(private val element: AmsCurie) : NavigationItem {
    override fun getName(): String {
        val iri = element.getFullIri() ?: element.text
        val axiom = AmsPsiUtil.findAxiom(element)
        val label = if (axiom != null) AmsPsiUtil.findLabelAnnotation(axiom) else null
        return if (label != null) "$iri $label" else iri
    }

    override fun getPresentation() = amsStructureViewElement(AmsPsiUtil.findAxiom(element) ?: element).presentation
    override fun navigate(requestFocus: Boolean) = element.navigate(requestFocus)
    override fun canNavigate(): Boolean = element.canNavigate()
    override fun canNavigateToSource(): Boolean = element.canNavigateToSource()
}
