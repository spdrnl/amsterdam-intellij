package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.testFramework.fixtures.BasePlatformTestCase

class AmsCompletionTest : BasePlatformTestCase() {

    fun testTopLevelKeywords() {
        myFixture.configureByText("test.ams", "<caret>")
        myFixture.completeBasic()
        val strings = myFixture.lookupElementStrings
        assertNotNull(strings)
        assertTrue(strings!!.contains("Class"))
        assertTrue(strings.contains("Prefix"))
        assertTrue(strings.contains("Ontology"))
    }

    fun testClassKeywords() {
        myFixture.configureByText("test.ams", "Class :Person <caret>")
        myFixture.completeBasic()
        val strings = myFixture.lookupElementStrings
        assertNotNull(strings)
        assertTrue(strings!!.contains("subClassOf"))
        assertTrue(strings.contains("is a"))
        assertTrue(strings.contains("is an"))
        assertTrue(strings.contains("is subclass of"))
        assertTrue(strings.contains("⊑"))
        assertTrue(strings.contains("<=:"))
        assertTrue(strings.contains("equivalentTo"))
    }

    fun testPropertyKeywords() {
        myFixture.configureByText("test.ams", "ObjectProperty :p1 <caret>")
        myFixture.completeBasic()
        val strings = myFixture.lookupElementStrings
        assertNotNull(strings)
        assertTrue(strings!!.contains("subPropertyOf"))
        assertTrue(strings.contains("is subproperty of"))
        assertTrue(strings.contains("⊑"))
        assertTrue(strings.contains("<=:"))
    }

    fun testSynonymCompletion() {
        // Typing "subclass" should suggest "subClassOf" because it's part of "is subclass of"
        myFixture.configureByText("test.ams", "Class :Person is subclass<caret>")

        myFixture.completeBasic()
        val elements = myFixture.lookupElements
        assertNotNull(elements)
        val strings = elements!!.map { it.lookupString }
        assertTrue("Should suggest 'subClassOf' when typing 'subclass'", strings.contains("subClassOf"))
        assertTrue("Should suggest '⊑' when typing 'subclass'", strings.contains("⊑"))
    }

    fun testEntityCompletion() {
        val text = """
            Prefix : <http://example.org/> .
            Class :Person .
            Class :Student subClassOf <caret>
        """.trimIndent()
        myFixture.configureByText("test.ams", text)
        myFixture.completeBasic()
        val strings = myFixture.lookupElementStrings
        assertNotNull(strings)
        assertTrue(strings!!.contains(":Person"))
    }

    fun testPrefixCompletion() {
        val text = """
            Prefix ex: <http://example.org/> .
            Class <caret>
        """.trimIndent()
        myFixture.configureByText("test.ams", text)
        myFixture.completeBasic()
        val strings = myFixture.lookupElementStrings
        assertNotNull(strings)
        assertTrue(strings!!.contains("ex:"))
    }

    fun testCompletionByLabel() {
        val text = """
            Prefix : <http://example.org/> .
            Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
            
            @annotation(rdfs:label "Human Being"@en)
            Class :Person .
            
            Class :Student subClassOf <caret>
        """.trimIndent()
        myFixture.configureByText("test.ams", text)
        myFixture.completeBasic()
        val lookupElements = myFixture.lookupElements
        assertNotNull(lookupElements)

        val personItem = lookupElements!!.find { it.lookupString == ":Person" }
        assertNotNull("Should find :Person in lookup items", personItem)

        // Check if "Human Being" is one of the lookup strings
        val lookupStrings = personItem!!.allLookupStrings
        assertTrue("Should contain 'Human Being' as a lookup string", lookupStrings.contains("Human Being"))
    }

    fun testCompletionByLabelWithPrefix() {
        val text = """
            Prefix obo: <http://purl.obolibrary.org/obo/> .
            Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
            
            @annotation(rdfs:label "entity"@en)
            Class obo:BFO_0000001 .
            
            Class obo:X ;
                is subclass of <caret>
        """.trimIndent()
        myFixture.configureByText("test.ams", text)
        myFixture.completeBasic()
        val lookupElements = myFixture.lookupElements
        assertNotNull(lookupElements)

        val bfoItem = lookupElements!!.find { it.lookupString == "obo:BFO_0000001" }
        assertNotNull("Should find obo:BFO_0000001 in lookup items", bfoItem)
        assertTrue("Should contain 'entity' as a lookup string", bfoItem!!.allLookupStrings.contains("entity"))
    }

    fun testCompletionByTypingLabel() {
        val text = """
            Prefix obo: <http://purl.obolibrary.org/obo/> .
            Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
            
            @annotation(rdfs:label "biological entity"@en)
            Class obo:BFO_0000001 .
            
            Class obo:X ;
                is subclass of bio<caret>
        """.trimIndent()
        myFixture.configureByText("test.ams", text)
        
        myFixture.completeBasic()
        val strings = myFixture.lookupElementStrings
        assertNotNull(strings)
        assertTrue("Should suggest obo:BFO_0000001 when typing its label 'biological entity'", strings!!.contains("obo:BFO_0000001"))
    }

    fun testExtraLetterOnCompletion() {
        val text = """
            Prefix obo: <http://purl.obolibrary.org/obo/> .
            Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
            
            @annotation(rdfs:label "entity"@en)
            Class obo:BFO_0000001 .
            
            Class obo:X ;
                is subclass of e<caret>
        """.trimIndent()
        myFixture.configureByText("test.ams", text)
        myFixture.completeBasic()
        val lookupElements = myFixture.lookupElements
        assertNotNull(lookupElements)
        val bfoItem = lookupElements!!.find { it.lookupString == "obo:BFO_0000001" }
        assertNotNull(bfoItem)
        myFixture.lookup.currentItem = bfoItem
        
        myFixture.type('\n')
        val actualText = myFixture.editor.document.text
        if (!actualText.contains("is subclass of obo:BFO_0000001")) {
            println("[DEBUG_LOG] Actual text after completion:\n$actualText")
        }
        myFixture.checkResult("""
            Prefix obo: <http://purl.obolibrary.org/obo/> .
            Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
            
            @annotation(rdfs:label "entity"@en)
            Class obo:BFO_0000001 .
            
            Class obo:X ;
                is subclass of obo:BFO_0000001
        """.trimIndent())
    }
}
