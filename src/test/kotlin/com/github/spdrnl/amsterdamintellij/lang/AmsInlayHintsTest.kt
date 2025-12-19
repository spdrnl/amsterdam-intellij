package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.testFramework.fixtures.BasePlatformTestCase
import com.intellij.codeInsight.hints.InlayHintsSink
import com.intellij.codeInsight.hints.InlayHintsCollector
import com.intellij.codeInsight.hints.presentation.InlayPresentation
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiRecursiveElementVisitor

@Suppress("UnstableApiUsage")
class AmsInlayHintsTest : BasePlatformTestCase() {

    fun testInlayHintsWithEnLabel() {
        val text = """
            Prefix : <http://example.org/> .
            @annotation(rdfs:label "Person"@en)
            Class :Person .
            
            Class :Student subClassOf :Person .
        """.trimIndent()
        
        myFixture.configureByText("test.ams", text)
        val file = myFixture.file
        val editor = myFixture.editor
        
        val provider = AmsInlayHintsProvider()
        val settings = provider.createSettings()
        val sink = TestInlayHintsSink()
        val collector = provider.getCollectorFor(file, editor, settings, sink)
        
        // Manually trigger collection
        file.accept(object : PsiRecursiveElementVisitor() {
            override fun visitElement(element: PsiElement) {
                collector.collect(element, editor, sink)
                super.visitElement(element)
            }
        })
        
        // Check sink results
        // :Person (def), :Student (def), :Person (usage)
        // Only :Person has label
        val hints = sink.getHints()
        assertTrue("Should have inlay hints", hints.isNotEmpty())
        
        // Hint for :Person definition
        val personDefHint = hints.find { it.offset == text.indexOf(":Person") }
        assertNotNull("Hint for :Person definition missing", personDefHint)
        
        // Hint for :Person usage
        val personUsageHint = hints.find { it.offset == text.lastIndexOf(":Person") }
        assertNotNull("Hint for :Person usage missing", personUsageHint)
    }

    fun testInlayHintsFallback() {
        val text = """
            Prefix : <http://example.org/> .
            @annotation(rdfs:label "Mensch"@de)
            Class :Person .
            
            Class :Student subClassOf :Person .
        """.trimIndent()
        
        myFixture.configureByText("test_fallback.ams", text)
        val file = myFixture.file
        val editor = myFixture.editor
        
        val provider = AmsInlayHintsProvider()
        val settings = provider.createSettings()
        val sink = TestInlayHintsSink()
        val collector = provider.getCollectorFor(file, editor, settings, sink)
        
        file.accept(object : PsiRecursiveElementVisitor() {
            override fun visitElement(element: PsiElement) {
                collector.collect(element, editor, sink)
                super.visitElement(element)
            }
        })
        
        val hints = sink.getHints()
        assertTrue("Should fallback to @de if @en is missing", hints.isNotEmpty())
    }

    private class TestInlayHintsSink : InlayHintsSink {
        private val hints = mutableListOf<HintData>()
        
        data class HintData(val offset: Int, val relatesToPrecedingText: Boolean, val presentation: InlayPresentation)

        override fun addInlineElement(offset: Int, relatesToPrecedingText: Boolean, presentation: InlayPresentation, dummy: Boolean) {
            hints.add(HintData(offset, relatesToPrecedingText, presentation))
        }

        @Deprecated("Deprecated in Java")
        override fun addBlockElement(offset: Int, relatesToPrecedingText: Boolean, showAbove: Boolean, priority: Int, presentation: InlayPresentation) {}

        override fun addInlineElement(offset: Int, presentation: com.intellij.codeInsight.hints.presentation.RootInlayPresentation<*>, constraints: com.intellij.codeInsight.hints.HorizontalConstraints?) {}
        override fun addBlockElement(logicalLine: Int, showAbove: Boolean, presentation: com.intellij.codeInsight.hints.presentation.RootInlayPresentation<*>, constraints: com.intellij.codeInsight.hints.BlockConstraints?) {}

        fun getHints() = hints
    }
}
