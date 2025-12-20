package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.github.spdrnl.amsterdamintellij.psi.AmsPrefixHeader
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.util.CachedValueProvider
import com.intellij.psi.util.CachedValuesManager
import com.intellij.psi.util.PsiTreeUtil
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

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
        return getCaches().first
    }

    fun getDefinitionsByText(): Map<String, List<AmsCurie>> {
        return getCaches().second
    }

    private fun getCaches(): Triple<Map<String, List<AmsCurie>>, Map<String, List<AmsCurie>>, List<AmsCurie>> {
        return CachedValuesManager.getCachedValue(this) {
            val allCuries = mutableListOf<AmsCurie>()
            PsiTreeUtil.processElements(this) { element ->
                if (element is AmsCurie) {
                    allCuries.add(element)
                }
                true
            }
            val defs = allCuries.filter { it.isDef() }
            val iriMap = defs.groupBy { it.getFullIri() ?: "" }.filterKeys { it.isNotEmpty() }
            val textMap = defs.groupBy { it.text }
            CachedValueProvider.Result.create(Triple(iriMap, textMap, defs), this)
        }
    }

    fun getAllDefinitions(): List<AmsCurie> {
        return getCaches().third
    }

    fun getAllLabels(): List<Pair<PsiElement, Pair<String, String?>>> {
        return getAllAnnotationsByProperty(setOf("rdfs:label"))
            .filter { it.second.third == "rdfs:label" }
            .map { it.first to (it.second.first to it.second.second) }
    }

    fun getAllSkosDefinitions(): List<Pair<PsiElement, Pair<String, String?>>> {
        return getAllAnnotationsByProperty(setOf("skos:definition"))
            .filter { it.second.third == "skos:definition" }
            .map { it.first to (it.second.first to it.second.second) }
    }

    private fun getAllAnnotationsByProperty(propNames: Set<String>): List<Pair<PsiElement, Triple<String, String?, String>>> {
        return CachedValuesManager.getCachedValue(this) {
            val results = mutableListOf<Pair<PsiElement, Triple<String, String?, String>>>()
            val annotations = PsiTreeUtil.findChildrenOfType(this, ANTLRPsiNode::class.java)
                .filter { (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_annotation }

            for (ann in annotations) {
                val propId = ann.children.find {
                    it is ANTLRPsiNode && (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_entityUsage
                }
                val matchedProp = propNames.find { propId?.text?.endsWith(it) == true || propId?.text == it }
                if (matchedProp != null) {
                    val literal = ann.children.find {
                        it is ANTLRPsiNode && (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_literal
                    }
                    if (literal != null) {
                        val (content, langTag) = AmsPsiUtil.getLiteralContent(literal)
                        results.add(literal to Triple(content, langTag, matchedProp))
                    }
                }
            }
            CachedValueProvider.Result.create(results, this)
        }
    }
}
