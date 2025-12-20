package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.testFramework.fixtures.BasePlatformTestCase

class AmsGotoSymbolTest : BasePlatformTestCase() {

    fun testGotoSymbol() {
        val text = """
            Prefix : <http://example.org/> .
            Class :MyClass .
            object property :myProp .
            Individual :myIndiv .
        """.trimIndent()

        myFixture.configureByText("test.ams", text)

        val contributor = AmsSymbolContributor()
        val names = contributor.getNames(project, true)

        assertTrue("Names should contain :MyClass", names.contains(":MyClass"))
        assertTrue("Names should contain http://example.org/MyClass", names.contains("http://example.org/MyClass"))
        assertTrue("Names should contain :myProp", names.contains(":myProp"))
        assertTrue("Names should contain :myIndiv", names.contains(":myIndiv"))

        val items = contributor.getItemsByName(":MyClass", ":MyClass", project, true)
        assertEquals(1, items.size)
        assertEquals("http://example.org/MyClass", items[0].name)
        assertNotNull(items[0].presentation)
        assertEquals(AmsIcons.CLASS, items[0].presentation?.getIcon(false))
    }

    fun testGotoSymbolWithLabel() {
        val text = """
            Prefix : <http://example.org/> .
            Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
            
            @annotation(rdfs:label "My Labeled Class")
            Class :C1 .
        """.trimIndent()

        myFixture.configureByText("test_label.ams", text)

        val contributor = AmsSymbolContributor()
        val names = contributor.getNames(project, true)

        assertTrue("Names should contain :C1", names.contains(":C1"))
        assertTrue("Names should contain My Labeled Class", names.contains("My Labeled Class"))

        val items = contributor.getItemsByName("My Labeled Class", "My Labeled Class", project, true)
        assertEquals(1, items.size)
        assertEquals("http://example.org/C1 My Labeled Class", items[0].name)
    }

    fun testGotoSymbolByFullIri() {
        val text = """
            Prefix : <http://example.org/> .
            Class :MyClass .
        """.trimIndent()

        myFixture.configureByText("test_iri.ams", text)

        val contributor = AmsSymbolContributor()
        val items = contributor.getItemsByName("http://example.org/MyClass", "http://example.org/MyClass", project, true)
        assertEquals(1, items.size)
        assertEquals("http://example.org/MyClass", items[0].name)
    }
}
