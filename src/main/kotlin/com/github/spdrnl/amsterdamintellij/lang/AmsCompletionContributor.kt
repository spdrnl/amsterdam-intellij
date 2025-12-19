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
                        "subClassOf", "is a", "is an", "is subclass of", "⊑", "<=:"
                    )
                    val subpropertySynonyms = listOf(
                        "subPropertyOf", "is subproperty of", "⊑", "<=:"
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

                        // If at top-level but preceded by a class definition, also suggest class keywords
                        val prev = PsiTreeUtil.prevVisibleLeaf(position)
                        if (prev != null) {
                            val prevAxiom = PsiTreeUtil.getParentOfType(prev, ANTLRPsiNode::class.java)?.let {
                                AmsPsiUtil.findAxiom(it)
                            } as? ANTLRPsiNode

                            if (prevAxiom != null) {
                                val ruleIndex = (prevAxiom.node.elementType as? RuleIElementType)?.ruleIndex
                                if (ruleIndex == OwlDslParser.RULE_classAxiom) {
                                    val classKeywords = subclassSynonyms + listOf(
                                        "equivalentTo",
                                        "disjointWith",
                                        "disjointUnionOf",
                                        "hasKey"
                                    )
                                    addKeywords(classKeywords)
                                } else if (ruleIndex == OwlDslParser.RULE_objectPropertyAxiom) {
                                    val opKeywords = subpropertySynonyms + listOf(
                                        "domain", "range", "characteristics", "inverseOf"
                                    )
                                    addKeywords(opKeywords)
                                } else if (ruleIndex == OwlDslParser.RULE_dataPropertyAxiom) {
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
                    if (isInside(OwlDslParser.RULE_classAxiom) || isInside(OwlDslParser.RULE_classClause)) {
                        val classKeywords = subclassSynonyms + listOf(
                            "equivalentTo", "disjointWith", "disjointUnionOf", "hasKey"
                        )
                        addKeywords(classKeywords)
                    }

                    // Inside Object Property Axiom
                    if (isInside(OwlDslParser.RULE_objectPropertyAxiom) || isInside(OwlDslParser.RULE_objectPropertyClause)) {
                        val opKeywords = subpropertySynonyms + listOf(
                            "domain", "range", "characteristics", "inverseOf"
                        )
                        addKeywords(opKeywords)
                    }

                    // Inside Data Property Axiom
                    if (isInside(OwlDslParser.RULE_dataPropertyAxiom) || isInside(OwlDslParser.RULE_dataPropertyClause)) {
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
                            isAfterWhitespaceInEntityContext(position)

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
