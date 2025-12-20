package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

class amsBreadcrumbsTest : BasePlatformTestCase() {

    fun testBreadcrumbs() {
        val text = """
            Prefix : <http://example.org/> .
            Ontology <http://example.org/test> .
            
            Class :Person 
                subclass of :Thing .
        """.trimIndent()

        myFixture.configureByText("test.ams", text)
        val provider = amsBreadcrumbsProvider()

        // Find Class :Person
        val classNode = PsiTreeUtil.findChildrenOfType(myFixture.file, ANTLRPsiNode::class.java)
            .find { (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_classAxiom }

        assertNotNull(classNode)
        assertTrue(provider.acceptElement(classNode!!))
        assertEquals(":Person", provider.getElementInfo(classNode))
        assertEquals(AmsIcons.CLASS, provider.getElementIcon(classNode))

        // Find Ontology
        val ontologyNode = PsiTreeUtil.findChildrenOfType(myFixture.file, ANTLRPsiNode::class.java)
            .find { (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_ontologyHeader }

        assertNotNull(ontologyNode)
        assertTrue(provider.acceptElement(ontologyNode!!))
        assertEquals("Ontology <http://example.org/test>", provider.getElementInfo(ontologyNode))

        // Find Prefix
        val prefixNode = PsiTreeUtil.findChildrenOfType(myFixture.file, ANTLRPsiNode::class.java)
            .find { (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_prefixDecl }

        assertNotNull(prefixNode)
        assertTrue(provider.acceptElement(prefixNode!!))
        assertEquals("Prefix : <http://example.org/>", provider.getElementInfo(prefixNode))

        // Find Class Clause
        val clauseNode = PsiTreeUtil.findChildrenOfType(myFixture.file, ANTLRPsiNode::class.java)
            .find { (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_classClause }

        assertNotNull(clauseNode)
        assertTrue(provider.acceptElement(clauseNode!!))
        assertEquals("subclass of :Thing", provider.getElementInfo(clauseNode).trim())
    }

    fun testDeepBreadcrumbs() {
        val text = """
            Class "process"@en obo:BFO_0000015 ;
                ⊑ ∀ "has occurrent part"@en obo:BFO_0000117 ( "process"@en obo:BFO_0000015 ⊔ "process boundary"@en obo:BFO_0000035 ) .
        """.trimIndent()

        myFixture.configureByText("test_deep.ams", text)
        val provider = amsBreadcrumbsProvider()

        // Find Intersection/Union or Parenthesized expression
        // In OwlDsl.g4:
        // primaryClassExpr : LPAREN classExpr RPAREN
        // boolClassExpr : primaryClassExpr (binaryBoolOp primaryClassExpr)*

        val nodes = PsiTreeUtil.findChildrenOfType(myFixture.file, ANTLRPsiNode::class.java)

        // Look for the classExpr inside brackets
        val bracketedExpr = nodes.find {
            val type = (it.node.elementType as? RuleIElementType)?.ruleIndex
            type == OwlDslParser.RULE_primaryClassExpr && it.text.startsWith("(")
        }

        assertNotNull("Should find bracketed expression", bracketedExpr)
        assertFalse(
            "Breadcrumbs should NOT accept bracketed expression (primaryClassExpr) to avoid recursion",
            provider.acceptElement(bracketedExpr!!)
        )

        // Check for "recursion" (redundancy)
        // classExpr -> boolClassExpr -> primaryClassExpr -> ( classExpr )
        val nestedClassExpr = bracketedExpr.children.find {
            (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_classExpr
        }
        if (nestedClassExpr != null) {
            assertFalse("classExpr should NOT be accepted", provider.acceptElement(nestedClassExpr))

            val nestedBoolExpr = nestedClassExpr.children.find {
                (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_boolClassExpr
            }
            if (nestedBoolExpr != null) {
                assertFalse("boolClassExpr should NOT be accepted", provider.acceptElement(nestedBoolExpr))
            }
        }
    }
}
