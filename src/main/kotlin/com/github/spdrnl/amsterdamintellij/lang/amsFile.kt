package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.util.CachedValueProvider
import com.intellij.psi.util.CachedValuesManager
import com.intellij.psi.util.PsiTreeUtil
import com.github.spdrnl.amsterdamintellij.psi.AmsPrefixHeader
import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
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

    fun getAllLabels(): List<Pair<PsiElement, Pair<String, String?>>> {
        return CachedValuesManager.getCachedValue(this) {
            val results = mutableListOf<Pair<PsiElement, Pair<String, String?>>>()
            val annotations = PsiTreeUtil.findChildrenOfType(this, ANTLRPsiNode::class.java)
                .filter { (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_annotation }
            
            for (ann in annotations) {
                val propId = ann.children.find { 
                    it is ANTLRPsiNode && (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_entityUsage 
                }
                if (propId?.text?.endsWith("rdfs:label") == true || propId?.text == "rdfs:label") {
                    val literal = ann.children.find { 
                        it is ANTLRPsiNode && (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_literal 
                    }
                    if (literal != null) {
                        val langTag = literal.children.find { it.node.elementType.toString().contains("LANGTAG") }?.text
                        val rawText = literal.text
                        val content = when {
                            rawText.startsWith("\"\"\"") -> rawText.substringAfter("\"\"\"").substringBeforeLast("\"\"\"")
                            rawText.startsWith("\"") -> rawText.substringAfter("\"").substringBeforeLast("\"")
                            else -> rawText
                        }
                        results.add(literal to (content to langTag))
                    }
                }
            }
            CachedValueProvider.Result.create(results, this)
        }
    }

    fun getAllSkosDefinitions(): List<Pair<PsiElement, Pair<String, String?>>> {
        return CachedValuesManager.getCachedValue(this) {
            val results = mutableListOf<Pair<PsiElement, Pair<String, String?>>>()
            val annotations = PsiTreeUtil.findChildrenOfType(this, ANTLRPsiNode::class.java)
                .filter { (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_annotation }
            
            for (ann in annotations) {
                val propId = ann.children.find { 
                    it is ANTLRPsiNode && (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_entityUsage 
                }
                if (propId?.text?.endsWith("skos:definition") == true || propId?.text == "skos:definition") {
                    val literal = ann.children.find { 
                        it is ANTLRPsiNode && (it.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_literal 
                    }
                    if (literal != null) {
                        val langTag = literal.children.find { it.node.elementType.toString().contains("LANGTAG") }?.text
                        val rawText = literal.text
                        val content = when {
                            rawText.startsWith("\"\"\"") -> rawText.substringAfter("\"\"\"").substringBeforeLast("\"\"\"")
                            rawText.startsWith("\"") -> rawText.substringAfter("\"").substringBeforeLast("\"")
                            else -> rawText
                        }
                        results.add(literal to (content to langTag))
                    }
                }
            }
            CachedValueProvider.Result.create(results, this)
        }
    }
}
