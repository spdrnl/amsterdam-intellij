package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class amsAnnotatorTest : BasePlatformTestCase() {

    fun testSemanticHighlighting() {
        val text = """
            Prefix : <http://example.org/> .
            Class obo:BFO_0000003 ;
                subclass of :Thing .
        """.trimIndent()

        myFixture.configureByText("test.ams", text)
        val highlights = myFixture.doHighlighting()

        // Find semantic highlights
        val idHighlight =
            highlights.find { it.text == "obo:BFO_0000003" && it.forcedTextAttributesKey == AmsSyntaxHighlighter.SEMANTIC_ID }
        val idRefHighlight =
            highlights.find { it.text == ":Thing" && it.forcedTextAttributesKey == AmsSyntaxHighlighter.SEMANTIC_ID_REF }

        assertNotNull("ID definition should be semantically highlighted", idHighlight)
        assertNotNull("ID reference should be semantically highlighted", idRefHighlight)
    }

    fun testMultipleSemanticIDs() {
        val text = """
            Class "fiat surface"@en obo:BFO_0000146 ;
                ⊑ "continuant fiat boundary"@en obo:BFO_0000140 ;
                ⊑ ∀ "has continuant part"@en obo:BFO_0000178 "continuant fiat boundary"@en obo:BFO_0000140 .
        """.trimIndent()

        myFixture.configureByText("test_multiple.ams", text)
        val highlights = myFixture.doHighlighting()

        val idHighlights = highlights.filter {
            it.forcedTextAttributesKey == AmsSyntaxHighlighter.SEMANTIC_ID ||
                    it.forcedTextAttributesKey == AmsSyntaxHighlighter.SEMANTIC_ID_REF
        }

        val expectedIDs = listOf("obo:BFO_0000146", "obo:BFO_0000140", "obo:BFO_0000178", "obo:BFO_0000140")
        val highlightedTexts = idHighlights.map { it.text }

        for (id in expectedIDs) {
            assertTrue("ID $id should be highlighted", highlightedTexts.contains(id))
        }

        assertEquals("Should have 4 semantic ID highlights", 4, idHighlights.size)
    }

    fun testUndefinedPrefixError() {
        val text = """
            Prefix : <http://example.org/> .
            Class undefined:MyClass .
        """.trimIndent()

        myFixture.configureByText("test_err.ams", text)
        val highlights = myFixture.doHighlighting()

        val errorHighlight =
            highlights.find { it.severity == HighlightSeverity.ERROR && it.text == "undefined:MyClass" }
        assertNotNull("Undefined prefix should be highlighted as an error", errorHighlight)
        assertEquals("Unresolved prefix: undefined", errorHighlight?.description)
    }

    fun testAddPrefixQuickFix() {
        val text = """
            Prefix : <http://example.org/> .
            Class <http://example.org/C1> .
            Class undefined<caret>:MyClass .
        """.trimIndent()

        myFixture.configureByText("test_fix.ams", text)
        myFixture.doHighlighting()

        val intention = myFixture.findSingleIntention("Add prefix declaration for 'undefined'")
        myFixture.launchAction(intention)

        val expected = """
            Prefix undefined: <http://example.org/> .

            Prefix : <http://example.org/> .
            Class <http://example.org/C1> .
            Class undefined:MyClass .
        """.trimIndent()

        val actual = myFixture.file.text
        assertEquals(expected, actual)
    }

    fun testDuplicateEntityIdError() {
        val text = """
            Prefix : <http://example.org/> .
            Class :C1 .
            object property :C1 .
        """.trimIndent()

        myFixture.configureByText("test_dup_id.ams", text)
        val highlights = myFixture.doHighlighting()

        val errorHighlight =
            highlights.find { it.severity == HighlightSeverity.ERROR && it.text == ":C1" }
        assertNotNull("Duplicate Entity ID should be highlighted as an error", errorHighlight)
        assertEquals("Duplicate Entity ID: http://example.org/C1", errorHighlight?.description)
    }

    fun testDuplicateRdfsLabelError() {
        val text = """
            Prefix : <http://example.org/> .
            Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
            
            @annotation(rdfs:label "Duplicate"@en)
            Class :C1 .
            
            @annotation(rdfs:label "Duplicate"@en)
            Class :C2 .
            
            @annotation(rdfs:label "Duplicate"@fr)
            Class :C3 .
        """.trimIndent()

        myFixture.configureByText("test_dup_label.ams", text)
        val highlights = myFixture.doHighlighting()

        val errorHighlights =
            highlights.filter { it.severity == HighlightSeverity.ERROR && it.text == "\"Duplicate\"@en" }
        assertEquals("Should have two errors for duplicate labels with same lang", 2, errorHighlights.size)

        val frHighlight = highlights.find { it.severity == HighlightSeverity.ERROR && it.text == "\"Duplicate\"@fr" }
        assertNull("Label with different lang should NOT be an error", frHighlight)
    }

    fun testDuplicateSkosDefinitionError() {
        val text = """
            Prefix : <http://example.org/> .
            Prefix skos: <http://www.w3.org/2000/04/skos/core#> .
            
            @annotation(skos:definition "Definition")
            Class :C1 .
            
            @annotation(skos:definition "Definition")
            Class :C2 .
        """.trimIndent()

        myFixture.configureByText("test_dup_skos.ams", text)
        val highlights = myFixture.doHighlighting()

        val errorHighlights =
            highlights.filter { it.severity == HighlightSeverity.ERROR && it.text == "\"Definition\"" }
        assertEquals("Should have two errors for duplicate skos definitions", 2, errorHighlights.size)
    }
}
