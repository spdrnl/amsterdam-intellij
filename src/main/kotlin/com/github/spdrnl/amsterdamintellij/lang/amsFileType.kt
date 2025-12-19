package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

class amsFileType : LanguageFileType(amsLanguage.INSTANCE) {
    companion object {
        val INSTANCE = amsFileType()
    }

    override fun getName(): String = "ams"

    override fun getDescription(): String = "Amsterdam language file"

    override fun getDefaultExtension(): String = "ams"

    override fun getIcon(): Icon? = null
}
