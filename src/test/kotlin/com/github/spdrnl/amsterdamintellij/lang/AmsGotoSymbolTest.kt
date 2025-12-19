package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.testFramework.fixtures.BasePlatformTestCase

class AmsGotoSymbolTest : BasePlatformTestCase() {

    fun testGotoSymbol() {
        val text = """
            Prefix : <http://example.org/> .
            Class :MyClass .
            ObjectProperty :myProp .
            Individual :myIndiv .
        """.trimIndent()

        myFixture.configureByText("test.ams", text)

        val contributor = AmsSymbolContributor()
        val names = contributor.getNames(project, true)

        assertTrue("Names should contain :MyClass", names.contains(":MyClass"))
        assertTrue("Names should contain :myProp", names.contains(":myProp"))
        assertTrue("Names should contain :myIndiv", names.contains(":myIndiv"))

        val items = contributor.getItemsByName(":MyClass", ":MyClass", project, true)
        assertEquals(1, items.size)
        assertEquals(":MyClass", items[0].name)
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

        val items = contributor.getItemsByName(":C1", ":C1", project, true)
        assertEquals(1, items.size)
        assertEquals("My Labeled Class", items[0].name)
    }
}
