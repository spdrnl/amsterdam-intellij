package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.util.CachedValueProvider
import com.intellij.psi.util.CachedValuesManager
import com.intellij.psi.util.PsiTreeUtil
import com.github.spdrnl.amsterdamintellij.psi.AmsPrefixHeader
import com.github.spdrnl.amsterdamintellij.psi.AmsCurie

class amsFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, amsLanguage.INSTANCE) {
    override fun getFileType(): FileType = amsFileType.INSTANCE

    override fun toString(): String = "Amsterdam File"

    fun getPrefixMap(): Map<String, String> {
        return CachedValuesManager.getCachedValue(this) {
            val prefixDecls = PsiTreeUtil.findChildrenOfType(this, AmsPrefixHeader::class.java)
            val map = mutableMapOf<String, String>()
            for (decl in prefixDecls) {
                val prefix = decl.name ?: ""
                val namespace = decl.children.find { 
                    it is AmsCurie && it.text.startsWith('<') 
                }?.text?.let { it.substring(1, it.length - 1) }
                if (namespace != null) {
                    map[prefix] = namespace
                }
            }
            CachedValueProvider.Result.create(map, this)
        }
    }

    fun getDefinitionsByIri(): Map<String, List<AmsCurie>> {
        return CachedValuesManager.getCachedValue(this) {
            val allCuries = PsiTreeUtil.findChildrenOfType(this, AmsCurie::class.java)
            val map = allCuries.filter { it.isDef() }
                .groupBy { it.getFullIri() ?: "" }
                .filterKeys { it.isNotEmpty() }
            CachedValueProvider.Result.create(map, this)
        }
    }

    fun getAllDefinitions(): List<AmsCurie> {
        return CachedValuesManager.getCachedValue(this) {
            val allCuries = PsiTreeUtil.findChildrenOfType(this, AmsCurie::class.java)
            val defs = allCuries.filter { it.isDef() }
            CachedValueProvider.Result.create(defs, this)
        }
    }
}
