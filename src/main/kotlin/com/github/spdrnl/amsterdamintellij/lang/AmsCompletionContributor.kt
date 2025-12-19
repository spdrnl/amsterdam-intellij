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
            PlatformPatterns.psiElement().withParent(AmsCurie::class.java),
            object : CompletionProvider<CompletionParameters>() {
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    result: CompletionResultSet
                ) {
                    val file = parameters.originalFile as? amsFile ?: return
                    val allDefs = file.getAllDefinitions()

                    for (def in allDefs) {
                        val text = def.text
                        if (text != null) {
                            var builder = LookupElementBuilder.create(text)

                            // Add icon and type info
                            val axiom = AmsPsiUtil.findAxiom(def)
                            if (axiom != null) {
                                builder = builder.withIcon(amsStructureViewElement(axiom).getIcon())
                                val label = AmsPsiUtil.getAxiomLabel(axiom)
                                if (label != text) {
                                    builder = builder.withTailText(" ($label)", true)
                                    // Add label as lookup string to allow completion by label
                                    builder = builder.withLookupString(label)
                                }

                                // Also add all labels of this axiom as lookup strings
                                val allLabels = AmsPsiUtil.findAllAnnotations(axiom, "rdfs:label")
                                for (l in allLabels) {
                                    if (l.first != text && l.first != label) {
                                        builder = builder.withLookupString(l.first)
                                    }
                                }
                            }

                            result.addElement(builder)
                        }
                    }

                    // Prefix completion for CURIEs
                    val prefixMap = file.getPrefixMap()
                    for (prefix in prefixMap.keys) {
                        result.addElement(
                            LookupElementBuilder.create("$prefix:").withPresentableText(prefix).withTypeText("Prefix")
                        )
                    }
                }
            }
        )
    }
}
