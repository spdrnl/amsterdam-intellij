package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.util.ProcessingContext
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

class AmsCompletionContributor : CompletionContributor() {
    init {
        // Keyword completion
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(),
            object : CompletionProvider<CompletionParameters>() {
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    result: CompletionResultSet
                ) {
                    val position = parameters.position
                    val parent = position.parent

                    val subclassSynonyms = listOf(
                        "subclass of", "is a", "is an", "⊑", "<=:"
                    )
                    val subpropertySynonyms = listOf(
                        "subproperty of", "is subproperty of", "⊑", "<=:"
                    )

                    fun addKeywords(keywords: List<String>) {
                        val matcher = result.prefixMatcher
                        val prefix = matcher.prefix

                        val allSubclassMatch = subclassSynonyms.any { s ->
                            matcher.prefixMatches(s) || (prefix.isNotEmpty() && s.contains(prefix, ignoreCase = true))
                        }
                        val allSubpropMatch = subpropertySynonyms.any { s ->
                            matcher.prefixMatches(s) || (prefix.isNotEmpty() && s.contains(prefix, ignoreCase = true))
                        }

                        keywords.forEach { kw ->
                            val builder = LookupElementBuilder.create(kw)
                            val isMatch = matcher.prefixMatches(kw) ||
                                    (kw in subclassSynonyms && allSubclassMatch) ||
                                    (kw in subpropertySynonyms && allSubpropMatch)

                            if (isMatch) {
                                if (!matcher.prefixMatches(kw)) {
                                    result.withPrefixMatcher(PlainPrefixMatcher(prefix, true))
                                        .addElement(builder.withLookupString(prefix))
                                } else {
                                    result.addElement(builder)
                                }
                            }
                        }
                    }

                    // Top-level keywords
                    if (parent is amsFile || (parent is ANTLRPsiNode && (parent.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_ontology)) {
                        val topLevelKeywords = listOf(
                            "Prefix", "Ontology", "Class", "ObjectProperty", "DataProperty",
                            "AnnotationProperty", "Individual", "Datatype", "AllDisjointClasses"
                        )
                        addKeywords(topLevelKeywords)

                        // If at top-level but preceded by an axiom, also suggest its keywords
                        val prev = PsiTreeUtil.prevVisibleLeaf(position)
                        if (prev != null) {
                            var foundAxiom: ANTLRPsiNode? = null
                            
                            // Find the preceding axiom by scanning backward from the current position
                            var p: com.intellij.psi.PsiElement? = prev
                            while (p != null && p !is amsFile) {
                                if (p is ANTLRPsiNode) {
                                    val idx = (p.node.elementType as? RuleIElementType)?.ruleIndex
                                    if (idx == OwlDslParser.RULE_classAxiom || 
                                        idx == OwlDslParser.RULE_objectPropertyAxiom || 
                                        idx == OwlDslParser.RULE_dataPropertyAxiom ||
                                        idx == OwlDslParser.RULE_classSubOrEqAxiom ||
                                        idx == OwlDslParser.RULE_objectPropertyDomainRangeAxiom ||
                                        idx == OwlDslParser.RULE_objectSubPropertyAxiom ||
                                        idx == OwlDslParser.RULE_dataPropertyDomainRangeAxiom ||
                                        idx == OwlDslParser.RULE_dataSubPropertyAxiom
                                        ) {
                                        foundAxiom = p
                                        break
                                    }
                                }
                                
                                // Check siblings of p
                                var ps = p.prevSibling
                                while (ps != null) {
                                    if (ps is ANTLRPsiNode) {
                                        val idx = (ps.node.elementType as? RuleIElementType)?.ruleIndex
                                        if (idx == OwlDslParser.RULE_classAxiom || 
                                            idx == OwlDslParser.RULE_objectPropertyAxiom || 
                                            idx == OwlDslParser.RULE_dataPropertyAxiom ||
                                            idx == OwlDslParser.RULE_classSubOrEqAxiom ||
                                            idx == OwlDslParser.RULE_objectPropertyDomainRangeAxiom ||
                                            idx == OwlDslParser.RULE_objectSubPropertyAxiom ||
                                            idx == OwlDslParser.RULE_dataPropertyDomainRangeAxiom ||
                                            idx == OwlDslParser.RULE_dataSubPropertyAxiom
                                            ) {
                                            foundAxiom = ps
                                            break
                                        }
                                    }
                                    ps = ps.prevSibling
                                }
                                if (foundAxiom != null) break
                                p = p.parent
                            }
                            
                            // If still nothing, check children of the file (top-level)
                            if (foundAxiom == null) {
                                val file = position.containingFile as? amsFile
                                file?.children?.forEach { child ->
                                    if (child.textRange.endOffset <= prev.textRange.startOffset) {
                                        if (child is ANTLRPsiNode) {
                                            val idx = (child.node.elementType as? RuleIElementType)?.ruleIndex
                                            if (idx == OwlDslParser.RULE_classAxiom || 
                                                idx == OwlDslParser.RULE_objectPropertyAxiom || 
                                                idx == OwlDslParser.RULE_dataPropertyAxiom ||
                                                idx == OwlDslParser.RULE_classSubOrEqAxiom ||
                                                idx == OwlDslParser.RULE_objectPropertyDomainRangeAxiom ||
                                                idx == OwlDslParser.RULE_objectSubPropertyAxiom ||
                                                idx == OwlDslParser.RULE_dataPropertyDomainRangeAxiom ||
                                                idx == OwlDslParser.RULE_dataSubPropertyAxiom
                                                ) {
                                                foundAxiom = child
                                            }
                                        }
                                    }
                                }
                            }
                            
                            // Special case: if prev leaf was an ID and we're at top level, 
                            // it's likely the start of a declaration.
                            if (foundAxiom == null) {
                                val prevText = prev.text
                                if (prevText.startsWith(":") || prevText.startsWith("<")) {
                                    // Look at the leaf before THAT to see if it's a keyword
                                    val beforePrev = PsiTreeUtil.prevVisibleLeaf(prev)
                                    if (beforePrev != null) {
                                        val bpText = beforePrev.text.lowercase()
                                        if (bpText == "class") {
                                            addKeywords(subclassSynonyms + listOf("equivalentTo", "disjointWith", "disjointUnionOf", "hasKey"))
                                        } else if (bpText == "objectproperty" || (bpText == "property" && PsiTreeUtil.prevVisibleLeaf(beforePrev)?.text?.lowercase() == "object")) {
                                            addKeywords(subpropertySynonyms + listOf("domain", "range", "characteristics", "inverseOf"))
                                        } else if (bpText == "dataproperty" || (bpText == "property" && PsiTreeUtil.prevVisibleLeaf(beforePrev)?.text?.lowercase() == "data")) {
                                            addKeywords(subpropertySynonyms + listOf("domain", "range", "characteristics"))
                                        }
                                    }
                                }
                            }

                            if (foundAxiom != null) {
                                val ruleIndex = (foundAxiom.node.elementType as? RuleIElementType)?.ruleIndex
                                if (ruleIndex == OwlDslParser.RULE_classAxiom || ruleIndex == OwlDslParser.RULE_classSubOrEqAxiom) {
                                    val classKeywords = subclassSynonyms + listOf(
                                        "equivalentTo", "disjointWith", "disjointUnionOf", "hasKey"
                                    )
                                    addKeywords(classKeywords)
                                } else if (ruleIndex == OwlDslParser.RULE_objectPropertyAxiom || 
                                           ruleIndex == OwlDslParser.RULE_objectPropertyDomainRangeAxiom || 
                                           ruleIndex == OwlDslParser.RULE_objectSubPropertyAxiom) {
                                    val opKeywords = subpropertySynonyms + listOf(
                                        "domain", "range", "characteristics", "inverseOf"
                                    )
                                    addKeywords(opKeywords)
                                } else if (ruleIndex == OwlDslParser.RULE_dataPropertyAxiom ||
                                           ruleIndex == OwlDslParser.RULE_dataPropertyDomainRangeAxiom ||
                                           ruleIndex == OwlDslParser.RULE_dataSubPropertyAxiom) {
                                    val dpKeywords = subpropertySynonyms + listOf(
                                        "domain", "range", "characteristics"
                                    )
                                    addKeywords(dpKeywords)
                                }
                            }
                        }
                    }

                    fun isInside(ruleIndex: Int): Boolean {
                        var curr: com.intellij.psi.PsiElement? = position
                        while (curr != null && curr !is amsFile) {
                            if (curr is ANTLRPsiNode) {
                                val index = (curr.node.elementType as? RuleIElementType)?.ruleIndex
                                if (index == ruleIndex) return true
                            }
                            curr = curr.parent
                        }
                        return false
                    }

                    // Inside Class Axiom
                    if (isInside(OwlDslParser.RULE_classAxiom) || isInside(OwlDslParser.RULE_classSubOrEqAxiom) || isInside(OwlDslParser.RULE_classClause)) {
                        val classKeywords = subclassSynonyms + listOf(
                            "equivalentTo", "disjointWith", "disjointUnionOf", "hasKey"
                        )
                        addKeywords(classKeywords)
                    }

                    // Inside Object Property Axiom
                    if (isInside(OwlDslParser.RULE_objectPropertyAxiom) || isInside(OwlDslParser.RULE_objectPropertyClause) || isInside(OwlDslParser.RULE_objectPropertyDomainRangeAxiom) || isInside(OwlDslParser.RULE_objectSubPropertyAxiom)) {
                        val opKeywords = subpropertySynonyms + listOf(
                            "domain", "range", "characteristics", "inverseOf"
                        )
                        addKeywords(opKeywords)
                    }

                    // Inside Data Property Axiom
                    if (isInside(OwlDslParser.RULE_dataPropertyAxiom) || isInside(OwlDslParser.RULE_dataPropertyClause) || isInside(OwlDslParser.RULE_dataPropertyDomainRangeAxiom) || isInside(OwlDslParser.RULE_dataSubPropertyAxiom)) {
                        val dpKeywords = subpropertySynonyms + listOf(
                            "domain", "range", "characteristics"
                        )
                        addKeywords(dpKeywords)
                    }
                }
            }
        )

        // Entity ID completion
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(),
            object : CompletionProvider<CompletionParameters>() {
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    result: CompletionResultSet
                ) {
                    val position = parameters.position
                    val file = parameters.originalFile as? amsFile ?: return

                    // Check if we're in a context where entity completion makes sense
                    val isEntityContext = position.parent is AmsCurie ||
                            AmsPsiUtil.findAxiom(position) != null ||
                            isInsideEntityUsage(position) ||
                            isAfterEntityExpectingKeyword(position) ||
                            isAfterWhitespaceInEntityContext(position) ||
                            position.node.elementType.toString().contains("IDENTIFIER") ||
                            position.node.elementType.toString().contains("CURIE") ||
                            position.node.elementType.toString().contains("IRI")

                    if (!isEntityContext) return

                    val allDefs = file.getAllDefinitions()

                    // Use case-insensitive matching for labels
                    val prefix = result.prefixMatcher.prefix
                    val caseInsensitiveResult = if (prefix.isNotEmpty()) {
                        result.withPrefixMatcher(PlainPrefixMatcher(prefix, false))
                    } else {
                        result
                    }

                    for (def in allDefs) {
                        val text = def.text
                        if (text != null) {
                            // Add icon and type info
                            val axiom = AmsPsiUtil.findAxiom(def)
                            if (axiom != null) {
                                val label = AmsPsiUtil.getAxiomLabel(axiom)

                                // Create a builder with the actual ID as the completion string
                                var builder = LookupElementBuilder.create(def, text)
                                    .withIcon(amsStructureViewElement(axiom).getIcon())

                                if (label != text) {
                                    builder = builder.withTailText(" ($label)", true)
                                    // Add label as lookup string to allow completion by label
                                    builder = builder.withLookupString(label)
                                }

                                // Also add all labels of this axiom as lookup strings
                                val allLabels =
                                    AmsPsiUtil.findAllAnnotations(axiom, setOf("rdfs:label", "skos:definition"))
                                for (l in allLabels) {
                                    if (l.first != text && l.first != label) {
                                        builder = builder.withLookupString(l.first)
                                    }
                                }

                                caseInsensitiveResult.addElement(builder)
                            } else {
                                // No axiom, just add the text
                                caseInsensitiveResult.addElement(LookupElementBuilder.create(text))
                            }
                        }
                    }

                    // Prefix completion for CURIEs
                    val prefixMap = file.getPrefixMap()
                    for (prefixName in prefixMap.keys) {
                        caseInsensitiveResult.addElement(
                            LookupElementBuilder.create("$prefixName:").withPresentableText(prefixName)
                                .withTypeText("Prefix")
                        )
                    }
                }

                private fun isInsideEntityUsage(position: com.intellij.psi.PsiElement): Boolean {
                    var curr: com.intellij.psi.PsiElement? = position
                    while (curr != null && curr !is amsFile) {
                        if (curr is ANTLRPsiNode) {
                            val index = (curr.node.elementType as? RuleIElementType)?.ruleIndex
                            if (index == OwlDslParser.RULE_entityUsage ||
                                index == OwlDslParser.RULE_classExpr ||
                                index == OwlDslParser.RULE_propExpr ||
                                index == OwlDslParser.RULE_individualList ||
                                index == OwlDslParser.RULE_datatypeId
                            ) return true
                        }
                        curr = curr.parent
                    }
                    return false
                }

                private fun isAfterEntityExpectingKeyword(position: com.intellij.psi.PsiElement): Boolean {
                    val prev = PsiTreeUtil.prevVisibleLeaf(position) ?: return false
                    val text = prev.text
                    val entityKeywords = listOf(
                        "subClassOf",
                        "equivalentTo",
                        "disjointWith",
                        "domain",
                        "range",
                        "inverseOf",
                        "type",
                        "subPropertyOf",
                        "is",
                        "a",
                        "an",
                        "of",
                        "to",
                        "with",
                        "as",
                        "from",
                        "that",
                        "some",
                        "only",
                        "hasValue"
                    )
                    return entityKeywords.any { text.equals(it, ignoreCase = true) } ||
                            text == ":" || text == "⊑" || text == "<=:" || text == "∃" || text == "∀"
                }

                private fun isAfterWhitespaceInEntityContext(position: com.intellij.psi.PsiElement): Boolean {
                    // Check if we're within a class axiom or other entity-using context
                    val axiom = AmsPsiUtil.findAxiom(position)
                    if (axiom != null) {
                        // We're inside an axiom, so entity completion is likely appropriate
                        // Check if there's a keyword before us that suggests entity usage
                        var prev: com.intellij.psi.PsiElement? = position
                        var depth = 0
                        while (prev != null && depth < 10) {
                            prev = PsiTreeUtil.prevVisibleLeaf(prev)
                            if (prev != null) {
                                val text = prev.text
                                val entityKeywords = listOf(
                                    "subClassOf", "equivalentTo", "disjointWith", "domain", "range",
                                    "inverseOf", "type", "subPropertyOf", "of", "to", "with"
                                )
                                if (entityKeywords.any { text.equals(it, ignoreCase = true) } ||
                                    text == "⊑" || text == "<=:") {
                                    return true
                                }
                            }
                            depth++
                        }
                    }
                    return false
                }
            }
        )
    }
}
