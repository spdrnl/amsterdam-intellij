package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class AmsDocumentationTest : BasePlatformTestCase() {

    fun testDocumentation() {
        val text = """
            Prefix : <http://example.org/> .
            Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
            
            @annotation(rdfs:label "My Class", rdfs:comment "This is a test class")
            Class :MyClass .
            
            Class :OtherClass .
            
            Individual :indiv type :MyClass .
        """.trimIndent()

        myFixture.configureByText("test.ams", text)

        // Find :MyClass in the Individual declaration
        val offset = text.indexOf("type :MyClass") + "type ".length
        val element = myFixture.file.findElementAt(offset)
        val curie = PsiTreeUtil.getParentOfType(element, AmsCurie::class.java)

        assertNotNull("Should find AmsCurie at offset $offset", curie)

        // Find :MyClass in the Class declaration (the definition)
        val defOffset = text.indexOf("Class :MyClass") + "Class ".length
        val defElement = myFixture.file.findElementAt(defOffset)
        val defCurie = PsiTreeUtil.getParentOfType(defElement, AmsCurie::class.java)
        assertNotNull("Should find defCurie", defCurie)

        val documentationProvider = AmsDocumentationProvider()
        val doc = documentationProvider.generateDoc(defCurie!!, null)

        assertNotNull(doc)
        assertTrue(doc!!.contains("<b>Class</b>"))
        assertTrue(doc.contains("<b>Label:</b> My Class"))
        assertTrue(doc.contains("This is a test class"))
        assertTrue(doc.contains("http://example.org/MyClass"))
    }

    fun testQuickNavigateInfo() {
        val text = """
            Prefix : <http://example.org/> .
            Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
            
            @annotation(rdfs:label "My Class")
            Class :MyClass .
        """.trimIndent()

        myFixture.configureByText("test.ams", text)
        val offset = text.indexOf(":MyClass .")
        val element = myFixture.file.findElementAt(offset)
        val curie = PsiTreeUtil.getParentOfType(element, AmsCurie::class.java)

        assertNotNull(curie)
        val documentationProvider = AmsDocumentationProvider()
        val info = documentationProvider.getQuickNavigateInfo(curie!!, null)

        assertNotNull(info)
        assertEquals("[Class] \"My Class\" <http://example.org/MyClass>", info)
    }
}
