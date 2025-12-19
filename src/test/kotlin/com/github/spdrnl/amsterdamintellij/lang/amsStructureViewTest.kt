package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.intellij.ide.structureView.newStructureView.StructureViewComponent
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.ide.structureView.StructureViewFactory
import com.intellij.util.ui.tree.TreeUtil
import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.intellij.psi.util.PsiTreeUtil
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

class amsStructureViewTest : BasePlatformTestCase() {

    fun testStructureViewPopulation() {
        val text = """
            Prefix : <http://example.org/> .
            Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
            
            Ontology <http://example.org/test> .
            
            @annotation(rdfs:label "My Class"@en)
            Class :C1 .
            
            @annotation(rdfs:label "Typed Label"^^xsd:string)
            Class :C3 .
            
            Class :C2 .
            
            @annotation(rdfs:label "My Property")
            ObjectProperty :p1 .
        """.trimIndent()
        
        val psiFile = myFixture.configureByText("test.ams", text)
        val builder = com.intellij.lang.LanguageStructureViewBuilder.getInstance().getStructureViewBuilder(psiFile)
        val structureView = builder!!.createStructureView(null, project) as StructureViewComponent
        
        try {
            val tree = structureView.tree
            TreeUtil.expandAll(tree)
            
            val model = structureView.treeModel
            val root = model.root
            val groups = root.children
            
            // Expected groups: Ontology, Classes, Object Properties, Prefixes
            assertEquals("Should have 4 groups", 4, groups.size)
            
            assertEquals("Ontology", groups[0].presentation.presentableText)
            assertEquals("Ontology <http://example.org/test>", groups[0].children[0].presentation.presentableText)

            assertEquals("Prefixes", groups[1].presentation.presentableText)
            val prefixChildren = groups[1].children
            assertEquals(2, prefixChildren.size)
            assertEquals("Prefix : <http://example.org/>", prefixChildren[0].presentation.presentableText)
            assertEquals("Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>", prefixChildren[1].presentation.presentableText)

            assertEquals("Classes", groups[2].presentation.presentableText)
            val classChildren = groups[2].children
            assertEquals(3, classChildren.size)
            assertEquals("My Class", classChildren[0].presentation.presentableText)
            assertEquals("Typed Label", classChildren[1].presentation.presentableText)
            assertEquals(":C2", classChildren[2].presentation.presentableText)

            assertEquals("Object Properties", groups[3].presentation.presentableText)
            val propChildren = groups[3].children
            assertEquals(1, propChildren.size)
            assertEquals("My Property", propChildren[0].presentation.presentableText)
            
            // Verify icons
            assertEquals(AmsIcons.CLASS, classChildren[0].presentation.getIcon(false))
            assertEquals(AmsIcons.OBJECT_PROPERTY, propChildren[0].presentation.getIcon(false))
            assertEquals(AmsIcons.PREFIX, prefixChildren[0].presentation.getIcon(false))
            
        } finally {
            structureView.dispose()
        }
    }
    fun testStructureViewIcons() {
        val text = """
            DataProperty :dp1 .
            AnnotationProperty :ap1 .
            AllDisjointClasses(:C1, :C2) .
        """.trimIndent()
        
        val psiFile = myFixture.configureByText("test2.ams", text)
        val builder = com.intellij.lang.LanguageStructureViewBuilder.getInstance().getStructureViewBuilder(psiFile)
        val structureView = builder!!.createStructureView(null, project) as StructureViewComponent
        
        try {
            val tree = structureView.tree
            TreeUtil.expandAll(tree)
            
            val model = structureView.treeModel
            val root = model.root
            val groups = root.children
            
            assertEquals(3, groups.size)
            
            assertEquals("Annotation Properties", groups[0].presentation.presentableText)
            assertEquals(AmsIcons.ANNOTATION_PROPERTY, groups[0].children[0].presentation.getIcon(false))

            assertEquals("Disjoint Unions", groups[1].presentation.presentableText)
            assertEquals(AmsIcons.ALL_DISJOINT_CLASSES, groups[1].children[0].presentation.getIcon(false))

            assertEquals("Data Properties", groups[2].presentation.presentableText)
            assertEquals(AmsIcons.DATA_PROPERTY, groups[2].children[0].presentation.getIcon(false))
            
        } finally {
            structureView.dispose()
        }
    }

    fun testStructureViewSorting() {
        val text = """
            Class :B .
            Ontology <http://example.org/test> .
            Class :A .
            DataProperty :dp1 .
        """.trimIndent()

        val psiFile = myFixture.configureByText("test_sort.ams", text)
        val builder = com.intellij.lang.LanguageStructureViewBuilder.getInstance().getStructureViewBuilder(psiFile)
        val structureView = builder!!.createStructureView(null, project) as StructureViewComponent

        try {
            val model = structureView.treeModel
            val root = model.root
            
            // Default order (Source)
            var groups = root.children
            assertEquals(3, groups.size) // Classes, Ontology, Data Properties
            
            // Group order in getChildren(): Ontology (0), Classes (1), Data Properties (4)
            // Wait, collectTopLevel finds them in order of appearance?
            // Yes, ontologyNode?.children?.forEach { collectTopLevel(node, allElements) }
            // Then it filters into groups.
            // Since they are displayed in groups list order:
            assertEquals("Ontology", groups[0].presentation.presentableText)
            assertEquals("Classes", groups[1].presentation.presentableText)
            assertEquals("Data Properties", groups[2].presentation.presentableText)

            // Get children of "Classes" group
            val classGroup = groups.find { it.presentation.presentableText == "Classes" }!!
            var classChildren = classGroup.children
            assertEquals(2, classChildren.size)
            assertEquals(":B", classChildren[0].presentation.presentableText)
            assertEquals(":A", classChildren[1].presentation.presentableText)

            // Alphabetical Sort (Name)
            val alphaComparator = com.intellij.ide.util.treeView.smartTree.Sorter.ALPHA_SORTER.comparator as java.util.Comparator<Any>
            val alphaSortedClassChildren = classChildren.sortedWith(alphaComparator)
            assertEquals(":A", alphaSortedClassChildren[0].presentation.presentableText)
            assertEquals(":B", alphaSortedClassChildren[1].presentation.presentableText)

            // Type Sort should be gone
            assertNull(model.sorters.find { it.name == "TYPE_SORTER" })
            
        } finally {
            structureView.dispose()
        }
    }
}
