package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.intellij.util.indexing.FileBasedIndex
import com.intellij.psi.search.GlobalSearchScope

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
}
