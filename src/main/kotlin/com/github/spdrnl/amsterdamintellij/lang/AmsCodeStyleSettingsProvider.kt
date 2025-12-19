package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.application.options.CodeStyleAbstractConfigurable
import com.intellij.application.options.CodeStyleAbstractPanel
import com.intellij.application.options.TabbedLanguageCodeStylePanel
import com.intellij.psi.codeStyle.CodeStyleConfigurable
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CodeStyleSettingsProvider
import com.intellij.psi.codeStyle.CustomCodeStyleSettings

class AmsCodeStyleSettingsProvider : CodeStyleSettingsProvider() {
    override fun createCustomSettings(settings: CodeStyleSettings): CustomCodeStyleSettings {
        return AmsCodeStyleSettings(settings)
    }

    override fun getConfigurableDisplayName(): String = "Amsterdam"

    override fun createConfigurable(
        settings: CodeStyleSettings,
        modelSettings: CodeStyleSettings
    ): CodeStyleConfigurable {
        return object : CodeStyleAbstractConfigurable(settings, modelSettings, configurableDisplayName) {
            override fun createPanel(settings: CodeStyleSettings): CodeStyleAbstractPanel {
                return AmsCodeStyleMainPanel(currentSettings, settings)
            }
        }
    }

    private class AmsCodeStyleMainPanel(currentSettings: CodeStyleSettings, settings: CodeStyleSettings) :
        TabbedLanguageCodeStylePanel(amsLanguage.INSTANCE, currentSettings, settings)
}

class AmsCodeStyleSettings(container: CodeStyleSettings) :
    CustomCodeStyleSettings("AmsCodeStyleSettings", container) {
    @JvmField
    var SPACE_BEFORE_COLON = true
}
