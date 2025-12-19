package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.intellij.psi.PsiElement
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.intellij.psi.util.PsiTreeUtil

class AmsFindUsagesTest : BasePlatformTestCase() {
    fun testFindUsages() {
        myFixture.configureByText("test.ams", """
            Prefix : <http://example.org/>.
            
            Class :MyClass .
            
            Class :OtherClass
                subClassOf :MyClass .
                
            Class :ThirdClass
                equivalentTo :MyClass .
        """.trimIndent())
        
        val curies = PsiTreeUtil.findChildrenOfType(myFixture.file, AmsCurie::class.java)
        val declaration = curies.find { it.text == ":MyClass" && it.isDef() }
        assertNotNull("Declaration not found for :MyClass", declaration)
        
        val usages = myFixture.findUsages(declaration!!)
        assertEquals("Should find 2 usages", 2, usages.size)
    }

    fun testFindUsagesObjectProperty() {
        myFixture.configureByText("test.ams", """
            Prefix : <http://example.org/>.
            
            ObjectProperty :myProp .
            
            Class :MyClass
                subClassOf :myProp some :OtherClass .
        """.trimIndent())

        val curies = PsiTreeUtil.findChildrenOfType(myFixture.file, AmsCurie::class.java)
        val declaration = curies.find { it.text == ":myProp" && it.isDef() }
        assertNotNull("Declaration not found", declaration)

        val usages = myFixture.findUsages(declaration!!)
        assertEquals("Should find 1 usage", 1, usages.size)
    }
}
