package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.codeInsight.hints.InlayHintsSink
import com.intellij.codeInsight.hints.presentation.InlayPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiRecursiveElementVisitor
import com.intellij.testFramework.fixtures.BasePlatformTestCase

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

    fun testInlayHintsWithInlineComment() {
        val text = """
            Prefix : <http://example.org/> .
            Class "Human" :Person .
            
            Class :Student subClassOf :Person .
        """.trimIndent()

        myFixture.configureByText("test_inline.ams", text)
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
        assertTrue("Should have inlay hints from inline comment", hints.isNotEmpty())

        // Verify the label text if possible (it's wrapped in presentations)
        // For now just checking if it exists at the right offsets
        val personUsageHint = hints.find { it.offset == text.lastIndexOf(":Person") }
        assertNotNull("Hint for :Person usage missing", personUsageHint)
    }

    fun testInlayHintsWithSkosDefinition() {
        val text = """
            Prefix : <http://example.org/> .
            @annotation(skos:definition "A human being")
            Class :Person .
            
            Class :Student subClassOf :Person .
        """.trimIndent()

        myFixture.configureByText("test_skos.ams", text)
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
        assertTrue("Should have inlay hints from skos:definition", hints.isNotEmpty())
    }

    fun testInlayHintsWithDataPropertyInlineComment() {
        val text = """
            Prefix : <http://example.org/> .
            DataProperty "Age" :hasAge .
            
            Individual :John ; :hasAge 30 .
        """.trimIndent()

        myFixture.configureByText("test_data_inline.ams", text)
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
        val hasAgeUsageHint = hints.find { it.offset == text.lastIndexOf(":hasAge") }
        assertNotNull("Hint for :hasAge usage missing", hasAgeUsageHint)
    }

    fun testInlayHintsWithDatatypeInlineComment() {
        val text = """
            Prefix : <http://example.org/> .
            Datatype "Small Integer" :smallInt .
            
            Class :SmallThing subClassOf restriction(:hasValue { minInclusive 0 }) .
            // Just a dummy usage of :smallInt to trigger hint
            Class :Other subClassOf :smallInt .
        """.trimIndent()

        myFixture.configureByText("test_datatype_inline.ams", text)
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
        val smallIntUsageHint = hints.find { it.offset == text.lastIndexOf(":smallInt") }
        assertNotNull("Hint for :smallInt usage missing", smallIntUsageHint)
    }

    private class TestInlayHintsSink : InlayHintsSink {
        private val hints = mutableListOf<HintData>()

        data class HintData(val offset: Int, val relatesToPrecedingText: Boolean, val presentation: InlayPresentation)

        override fun addInlineElement(
            offset: Int,
            relatesToPrecedingText: Boolean,
            presentation: InlayPresentation,
            dummy: Boolean
        ) {
            hints.add(HintData(offset, relatesToPrecedingText, presentation))
        }

        @Deprecated("Deprecated in Java")
        override fun addBlockElement(
            offset: Int,
            relatesToPrecedingText: Boolean,
            showAbove: Boolean,
            priority: Int,
            presentation: InlayPresentation
        ) {
        }

        override fun addInlineElement(
            offset: Int,
            presentation: com.intellij.codeInsight.hints.presentation.RootInlayPresentation<*>,
            constraints: com.intellij.codeInsight.hints.HorizontalConstraints?
        ) {
        }

        override fun addBlockElement(
            logicalLine: Int,
            showAbove: Boolean,
            presentation: com.intellij.codeInsight.hints.presentation.RootInlayPresentation<*>,
            constraints: com.intellij.codeInsight.hints.BlockConstraints?
        ) {
        }

        fun getHints() = hints
    }
}
