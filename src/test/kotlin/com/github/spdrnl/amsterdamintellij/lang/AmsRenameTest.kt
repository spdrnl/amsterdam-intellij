package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.github.spdrnl.amsterdamintellij.psi.AmsCurieLocalNameReference
import com.github.spdrnl.amsterdamintellij.psi.AmsPrefixHeader
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.refactoring.util.RefactoringDescriptionLocation
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class AmsRenameTest : BasePlatformTestCase() {

    fun testRenamePrefix() {
        val text = """
            Prefix obo: <http://purl.obolibrary.org/obo/> .
            Class obo:BFO_0000001 .
        """.trimIndent()

        myFixture.configureByText("test.ams", text)

        val prefixDecl = PsiTreeUtil.findChildOfType(myFixture.file, AmsPrefixHeader::class.java)
        assertNotNull(prefixDecl)

        myFixture.renameElement(prefixDecl!!, "bfo")

        val updatedText = myFixture.file.text
        assertTrue("Prefix declaration should be renamed", updatedText.contains("Prefix bfo:"))
        assertTrue("CURIE usage should be renamed", updatedText.contains("Class bfo:BFO_0000001"))
    }

    fun testRenamePrefixAtCaret() {
        val text = """
            Prefix o<caret>bo: <http://purl.obolibrary.org/obo/> .
            Class obo:BFO_0000001 .
        """.trimIndent()

        myFixture.configureByText("test_caret.ams", text)
        myFixture.renameElementAtCaret("bfo")

        val updatedText = myFixture.file.text
        assertTrue("Prefix declaration should be renamed", updatedText.contains("Prefix bfo:"))
        assertTrue("CURIE usage should be renamed", updatedText.contains("Class bfo:BFO_0000001"))
    }

    fun testRenamePrefixFromUsageAtCaret() {
        val text = """
            Prefix obo: <http://purl.obolibrary.org/obo/> .
            Class o<caret>bo:BFO_0000001 .
        """.trimIndent()

        myFixture.configureByText("test_usage_caret.ams", text)
        myFixture.renameElementAtCaret("bfo")

        val updatedText = myFixture.file.text
        assertTrue("Prefix declaration should be renamed", updatedText.contains("Prefix bfo:"))
        assertTrue("CURIE usage should be renamed", updatedText.contains("Class bfo:BFO_0000001"))
    }

    fun testRenameLocalName() {
        val text = """
            Prefix : <http://example.org/> .
            Class :OldName .
            Class :Other ;
                subClassOf :OldName .
        """.trimIndent()

        myFixture.configureByText("test2.ams", text)

        // Find the declaration CURIE
        val curies = PsiTreeUtil.findChildrenOfType(myFixture.file, AmsCurie::class.java)
        val decl = curies.find { it.text == ":OldName" }
        assertNotNull(decl)

        val usage = curies.find { it.text == ":OldName" && it != decl }
        assertNotNull("Usage should be found", usage)

        val ref = usage!!.references.find { it is AmsCurieLocalNameReference }
        assertNotNull("Usage should have a local name reference", ref)
        assertEquals("Reference should resolve to declaration", decl, ref!!.resolve())

        myFixture.renameElement(decl!!, ":NewName")

        val updatedText = myFixture.file.text
        assertTrue("Declaration should be renamed", updatedText.contains("Class :NewName"))
        assertTrue("Usage should be renamed", updatedText.contains("subClassOf :NewName"))
    }

    fun testRenameIri() {
        val text = """
            Prefix : <http://example.org/> .
            Class <http://example.org/OldIri> .
            Class :Other ;
                subClassOf <http://example.org/OldIri> .
        """.trimIndent()

        myFixture.configureByText("test_iri.ams", text)

        val curies = PsiTreeUtil.findChildrenOfType(myFixture.file, AmsCurie::class.java)
        val decl = curies.find { it.text == "<http://example.org/OldIri>" }
        assertNotNull("Declaration IRI should be found", decl)

        myFixture.renameElement(decl!!, "<http://example.org/NewIri>")

        val updatedText = myFixture.file.text
        assertTrue("Declaration IRI should be renamed", updatedText.contains("Class <http://example.org/NewIri>"))
        assertTrue("Usage IRI should be renamed", updatedText.contains("subClassOf <http://example.org/NewIri>"))
    }

    fun testRenameIriFromUsage() {
        val text = """
            Prefix : <http://example.org/> .
            Class <http://example.org/OldIri> .
            Class :Other ;
                subClassOf <http://example.org/Old<caret>Iri> .
        """.trimIndent()

        myFixture.configureByText("test_iri_usage.ams", text)
        myFixture.renameElementAtCaret("<http://example.org/NewIri>")

        val updatedText = myFixture.file.text
        assertTrue("Declaration IRI should be renamed", updatedText.contains("Class <http://example.org/NewIri>"))
        assertTrue("Usage IRI should be renamed", updatedText.contains("subClassOf <http://example.org/NewIri>"))
    }

    fun testRenameIriLocalName() {
        val text = """
            Prefix : <http://example.org/> .
            Class <http://example.org/OldIri> .
            Class :Other ;
                subClassOf <http://example.org/Old<caret>Iri> .
        """.trimIndent()

        myFixture.configureByText("test_iri_local.ams", text)
        // Rename to just a local name (should it be allowed? probably not for a full IRI)
        // If the user provides a full IRI, it should replace it.
        myFixture.renameElementAtCaret("NewIri")

        val updatedText = myFixture.file.text
        assertTrue("Declaration IRI should be renamed", updatedText.contains("Class <http://example.org/NewIri>"))
        assertTrue("Usage IRI should be renamed", updatedText.contains("subClassOf <http://example.org/NewIri>"))
    }

    fun testRenameCurieExperience() {
        val text = """
            Prefix obo: <http://purl.obolibrary.org/obo/> .
            Class obo:BFO_00000<caret>01 .
        """.trimIndent()
        myFixture.configureByText("experience.ams", text)

        val element = myFixture.elementAtCaret
        assertTrue("Element at caret should be AmsCurie", element is AmsCurie || element.parent is AmsCurie)

        val curie = if (element is AmsCurie) element else element.parent as AmsCurie
        assertEquals("getName() should return only local name", "BFO_0000001", curie.name)
    }

    fun testRenameIriExperience() {
        val text = """
            Class <http://example.org/OldI<caret>ri> .
        """.trimIndent()
        myFixture.configureByText("iri_experience.ams", text)

        val element = myFixture.elementAtCaret
        assertTrue("Element at caret should be AmsCurie", element is AmsCurie || element.parent is AmsCurie)

        val curie = if (element is AmsCurie) element else element.parent as AmsCurie
        assertEquals("getName() should return full IRI", "http://example.org/OldIri", curie.name)

        // Test renaming with full IRI
        myFixture.renameElementAtCaret("http://example.org/NewIri")
        assertTrue("IRI should be updated", myFixture.file.text.contains("<http://example.org/NewIri>"))
    }

    fun testRenameNamespaceIri() {
        val text = """
            Prefix : <http://purl.org/dc/elements/1.1/<caret>> .
        """.trimIndent()
        myFixture.configureByText("namespace_iri.ams", text)

        myFixture.renameElementAtCaret("http://purl.org/dc/elements/1.2/")
        assertTrue("IRI should be updated to 1.2", myFixture.file.text.contains("<http://purl.org/dc/elements/1.2/>"))
    }

    fun testRenameIriToFullIriWithoutBrackets() {
        val text = """
            Class <http://example.org/OldIri<caret>> .
        """.trimIndent()
        myFixture.configureByText("iri_no_brackets.ams", text)
        myFixture.renameElementAtCaret("http://example.org/NewIri")
        assertTrue(
            "IRI should be updated and wrapped in brackets",
            myFixture.file.text.contains("<http://example.org/NewIri>")
        )
    }

    fun testElementDescription() {
        val text = """
            Prefix obo: <http://purl.obolibrary.org/obo/> .
            Class obo:BFO_0000001 .
            Class <http://example.org/OldIri> .
        """.trimIndent()
        myFixture.configureByText("description.ams", text)

        val curies = PsiTreeUtil.findChildrenOfType(myFixture.file, AmsCurie::class.java).toList()

        val curieElement = curies.find { it.text == "obo:BFO_0000001" }
        assertNotNull("CURIE element should be found", curieElement)
        val provider = AmsElementDescriptionProvider()
        val curieDesc =
            provider.getElementDescription(curieElement!!, object : RefactoringDescriptionLocation(false) {})
        assertEquals("CURIE", curieDesc)

        val iriElement = curies.find { it.text == "<http://example.org/OldIri>" }
        assertNotNull("IRI element should be found", iriElement)
        val iriDesc = provider.getElementDescription(iriElement!!, object : RefactoringDescriptionLocation(false) {})
        assertEquals("IRI", iriDesc)
    }
}
