package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.intellij.lang.annotation.HighlightSeverity

class amsAnnotatorTest : BasePlatformTestCase() {

    fun testSemanticHighlighting() {
        val text = """
            Prefix : <http://example.org/> .
            Class "occurrent"@en obo:BFO_0000003 ;
                subClassOf :Thing .
        """.trimIndent()
        
        myFixture.configureByText("test.ams", text)
        val highlights = myFixture.doHighlighting()
        
        // Find semantic highlights
        val labelHighlight = highlights.find { it.text == "\"occurrent\"@en" && it.forcedTextAttributesKey == AmsSyntaxHighlighter.SEMANTIC_LABEL }
        val idHighlight = highlights.find { it.text == "obo:BFO_0000003" && it.forcedTextAttributesKey == AmsSyntaxHighlighter.SEMANTIC_ID }
        
        assertNotNull("Label should be semantically highlighted", labelHighlight)
        assertNotNull("ID should be semantically highlighted", idHighlight)
    }

    fun testMultipleSemanticIDs() {
        val text = """
            Class "fiat surface"@en obo:BFO_0000146 ;
                ⊑ "continuant fiat boundary"@en obo:BFO_0000140 ;
                ⊑ ∀ "has continuant part"@en obo:BFO_0000178 "continuant fiat boundary"@en obo:BFO_0000140 .
        """.trimIndent()

        myFixture.configureByText("test_multiple.ams", text)
        val highlights = myFixture.doHighlighting()

        val idHighlights = highlights.filter { it.forcedTextAttributesKey == AmsSyntaxHighlighter.SEMANTIC_ID }
        
        val expectedIDs = listOf("obo:BFO_0000146", "obo:BFO_0000140", "obo:BFO_0000178", "obo:BFO_0000140")
        val highlightedTexts = idHighlights.map { it.text }
        
        for (id in expectedIDs) {
            assertTrue("ID $id should be highlighted", highlightedTexts.contains(id))
        }
        
        assertEquals("Should have 4 semantic ID highlights", 4, idHighlights.size)
    }
}
