package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.intellij.psi.util.PsiTreeUtil
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import org.antlr.intellij.adaptor.lexer.RuleIElementType

class amsBreadcrumbsTest : BasePlatformTestCase() {

    fun testBreadcrumbs() {
        val text = """
            Prefix : <http://example.org/> .
            Ontology <http://example.org/test> .
            
            Class :Person 
                subClassOf :Thing .
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
        assertEquals("subClassOf :Thing", provider.getElementInfo(clauseNode).trim())
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
        assertTrue("Breadcrumbs should accept bracketed expression", provider.acceptElement(bracketedExpr!!))
        
        val info = provider.getElementInfo(bracketedExpr)
        assertTrue("Breadcrumb should show content, got: $info", info.contains("process"))
    }
}
