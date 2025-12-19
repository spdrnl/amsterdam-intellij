package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.codeInsight.template.impl.TemplateSettings
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class AmsLiveTemplatesTest : BasePlatformTestCase() {

    fun testLiveTemplatesAreRegistered() {
        val templateSettings = TemplateSettings.getInstance()
        val amsterdamTemplates = templateSettings.templates.filter { it.groupName == "Amsterdam" }
        
        val expectedShortcuts = listOf("on", "ap", "cl", "op", "dp", "dt", "in", "ax", "@a")
        val actualShortcuts = amsterdamTemplates.map { it.key }
        
        for (shortcut in expectedShortcuts) {
            assertTrue("Template '$shortcut' should be registered", actualShortcuts.contains(shortcut))
        }
    }
}
