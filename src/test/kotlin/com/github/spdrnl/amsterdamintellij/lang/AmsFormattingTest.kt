package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.openapi.command.WriteCommandAction
import com.intellij.psi.codeStyle.CodeStyleManager
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class AmsFormattingTest : BasePlatformTestCase() {

    fun testFormatter() {
        val text = """
Prefix : <http://example.org/> .
Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
Ontology <http://example.org/test> .
Class :Person ; subClassOf :Thing ; disjointWith :Organism .
ObjectProperty :hasChild ; domain :Person ; range :Person .
        """.trimIndent()

        val expected = """Prefix : <http://example.org/> .

Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .

Ontology <http://example.org/test> .

Class :Person ;
    subClassOf :Thing ;
    disjointWith :Organism .

ObjectProperty :hasChild ;
    domain :Person ;
    range :Person ."""

        myFixture.configureByText("test.ams", text)
        WriteCommandAction.runWriteCommandAction(project) {
            CodeStyleManager.getInstance(project).reformat(myFixture.file)
        }
        val result = myFixture.file.text
        if (expected != result) {
            println("[DEBUG_LOG] Expected (escaped):\n${expected.replace("\n", "\\n")}")
            println("[DEBUG_LOG] Result (escaped):\n${result.replace("\n", "\\n")}")
        }
        myFixture.checkResult(expected)
    }
}
