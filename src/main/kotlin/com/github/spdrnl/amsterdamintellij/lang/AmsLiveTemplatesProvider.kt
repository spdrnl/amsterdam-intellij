package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider

class AmsLiveTemplatesProvider : DefaultLiveTemplatesProvider {
    override fun getDefaultLiveTemplateFiles(): Array<String> {
        return arrayOf("liveTemplates/Amsterdam")
    }

    override fun getHiddenLiveTemplateFiles(): Array<String>? {
        return null
    }
}
