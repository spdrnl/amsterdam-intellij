package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.application.options.IndentOptionsEditor
import com.intellij.application.options.SmartIndentOptionsEditor
import com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider

class AmsLanguageCodeStyleSettingsProvider : LanguageCodeStyleSettingsProvider() {
    override fun getLanguage() = amsLanguage.INSTANCE

    override fun customizeSettings(
        consumer: CodeStyleSettingsCustomizable,
        settingsType: SettingsType
    ) {
        if (settingsType == SettingsType.SPACING_SETTINGS) {
            consumer.showCustomOption(
                AmsCodeStyleSettings::class.java,
                "SPACE_BEFORE_COLON",
                "Space before colon",
                "Other"
            )
        } else if (settingsType == SettingsType.BLANK_LINES_SETTINGS) {
            consumer.showStandardOptions("KEEP_BLANK_LINES_IN_CODE")
        }
    }

    override fun getIndentOptionsEditor(): IndentOptionsEditor = SmartIndentOptionsEditor()

    override fun getCodeSample(settingsType: SettingsType): String = """
Prefix : <http://example.org/> .
Prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .

Ontology <http://example.org/test> .

Class :Person ;
    subClassOf :Thing ;
    disjointWith :Organism .

ObjectProperty :hasChild ;
    domain :Person ;
    range :Person .
    """.trimIndent()
}
