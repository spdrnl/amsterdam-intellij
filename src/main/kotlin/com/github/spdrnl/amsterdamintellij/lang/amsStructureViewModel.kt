package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.ide.structureView.StructureViewModel
import com.intellij.ide.structureView.StructureViewModelBase
import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.util.treeView.smartTree.*
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiFile
import com.intellij.util.PlatformIcons

class amsStructureViewModel(editor: Editor?, psiFile: PsiFile) :
    StructureViewModelBase(psiFile, editor, amsStructureViewElement(psiFile)),
    StructureViewModel.ElementInfoProvider {

    override fun getSorters(): Array<Sorter> = arrayOf(Sorter.ALPHA_SORTER, TYPE_SORTER)

    override fun getFilters(): Array<Filter> = arrayOf(PREFIX_FILTER, INDIVIDUAL_FILTER, ANNOTATION_PROPERTY_FILTER)

    override fun isAlwaysShowsPlus(element: StructureViewTreeElement): Boolean = false

    override fun isAlwaysLeaf(element: StructureViewTreeElement): Boolean = false

    companion object {
        val TYPE_SORTER = object : Sorter {
            override fun getComparator(): Comparator<*> = Comparator<Any> { o1, o2 ->
                val type1 = (o1 as? amsStructureViewElement)?.getType()
                    ?: (o1 as? amsStructureGroup)?.getType() ?: 9
                val type2 = (o2 as? amsStructureViewElement)?.getType()
                    ?: (o2 as? amsStructureGroup)?.getType() ?: 9
                type1.compareTo(type2)
            }

            override fun isVisible(): Boolean = true

            override fun getName(): String = "TYPE_SORTER"

            override fun getPresentation(): ActionPresentation = ActionPresentationData(
                "Sort by Type",
                "Sort elements by their type (Ontology, Prefixes, Classes, etc.)",
                PlatformIcons.ENUM_ICON // Just a placeholder icon that looks like sorting
            )
        }

        val PREFIX_FILTER = object : Filter {
            override fun isVisible(treeNode: TreeElement?): Boolean {
                if (treeNode is amsStructureViewElement) {
                    return treeNode.getType() != 1 // 1 is RULE_prefixDecl
                }
                if (treeNode is amsStructureGroup) {
                    return treeNode.getType() != 1
                }
                return true
            }

            override fun isReverted(): Boolean = false

            override fun getName(): String = "HIDE_PREFIXES"

            override fun getPresentation(): ActionPresentation = ActionPresentationData(
                "Hide Prefixes",
                "Hide prefix declarations",
                AmsIcons.PREFIX
            )
        }

        val INDIVIDUAL_FILTER = object : Filter {
            override fun isVisible(treeNode: TreeElement?): Boolean {
                if (treeNode is amsStructureViewElement) {
                    return treeNode.getType() != 8 // 8 is RULE_individualAxiom
                }
                if (treeNode is amsStructureGroup) {
                    return treeNode.getType() != 8
                }
                return true
            }

            override fun isReverted(): Boolean = false

            override fun getName(): String = "HIDE_INDIVIDUALS"

            override fun getPresentation(): ActionPresentation = ActionPresentationData(
                "Hide Individuals",
                "Hide individuals",
                PlatformIcons.ANONYMOUS_CLASS_ICON
            )
        }

        val ANNOTATION_PROPERTY_FILTER = object : Filter {
            override fun isVisible(treeNode: TreeElement?): Boolean {
                if (treeNode is amsStructureViewElement) {
                    return treeNode.getType() != 2 // 2 is RULE_annotationPropertyAxiom
                }
                if (treeNode is amsStructureGroup) {
                    return treeNode.getType() != 2
                }
                return true
            }

            override fun isReverted(): Boolean = false

            override fun getName(): String = "HIDE_ANNOTATION_PROPERTIES"

            override fun getPresentation(): ActionPresentation = ActionPresentationData(
                "Hide Annotation Properties",
                "Hide annotation properties",
                AmsIcons.ANNOTATION_PROPERTY
            )
        }
    }
}
