package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class AmsDuplicateCurieTest : BasePlatformTestCase() {
    fun testAllDisjointClassesDoesNotCauseDuplicateCurieError() {
        val text = """
            Prefix : <http://example.org/> .
            Class :C1 .
            Class :C2 .
            All disjoint classes (:C1, :C2) .
        """.trimIndent()
        myFixture.configureByText("test_disjoint.ams", text)
        val highlights = myFixture.doHighlighting()
        
        val errors = highlights.filter { it.severity == HighlightSeverity.ERROR }
        val errorMessages = errors.map { "${it.text}: ${it.description}" }
        
        assertTrue("Should have no errors in All disjoint classes, but found: $errorMessages", errors.isEmpty())
    }

    fun testAllDisjointClassesWithDuplicateUsage() {
        val text = """
            Prefix : <http://example.org/> .
            Class :C1 .
            All disjoint classes (:C1, :C1) .
        """.trimIndent()
        myFixture.configureByText("test_disjoint_dup.ams", text)
        val highlights = myFixture.doHighlighting()
        
        // This test is to see if it reports duplicate CURIEs inside the list itself, 
        // or if it thinks :C1 in the list is a definition.
        val errors = highlights.filter { it.severity == HighlightSeverity.ERROR }
        for (error in errors) {
            println("[DEBUG_LOG] Error: ${error.text} - ${error.description}")
        }
    }
}
