package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser
import javax.swing.Icon
import kotlin.jvm.java

class amsStructureViewElement(private val element: PsiElement) : StructureViewTreeElement {

    override fun getValue(): Any = element

    override fun navigate(requestFocus: Boolean) {
        if (element is NavigatablePsiElement) {
            element.navigate(requestFocus)
        }
    }

    fun getPresentableText(): String {
        if (element is amsFile) {
            return element.name
        }
        if (element is ANTLRPsiNode) {
            val elementType = element.node.elementType
            if (elementType is RuleIElementType) {
                return when (elementType.ruleIndex) {
                    OwlDslParser.RULE_prefixDecl -> {
                        val prefixName = element.children.find { it.text.endsWith(":") || it.text == ":" }?.text ?: ""
                        val iri = element.children.find { it is ANTLRPsiNode && it.node.elementType is RuleIElementType && 
                            (it.node.elementType as RuleIElementType).ruleIndex == OwlDslParser.RULE_namespaceIRI }?.text 
                            ?: element.children.find { it.node.elementType.toString().contains("IRI") }?.text ?: ""
                        "Prefix $prefixName $iri"
                    }
                    OwlDslParser.RULE_ontologyHeader -> {
                        val iri = element.children.find { it is ANTLRPsiNode && it.node.elementType is RuleIElementType && 
                            (it.node.elementType as RuleIElementType).ruleIndex == OwlDslParser.RULE_fullIRI }?.text 
                            ?: element.children.find { it.node.elementType.toString().contains("IRI") }?.text ?: ""
                        "Ontology $iri"
                    }
                    OwlDslParser.RULE_classAxiom,
                    OwlDslParser.RULE_objectPropertyAxiom,
                    OwlDslParser.RULE_dataPropertyAxiom,
                    OwlDslParser.RULE_individualAxiom,
                    OwlDslParser.RULE_annotationPropertyAxiom,
                    OwlDslParser.RULE_datatypeAxiom,
                    OwlDslParser.RULE_subPropertyChainAxiom -> {
                        AmsPsiUtil.getAxiomLabel(element)
                    }
                    OwlDslParser.RULE_classClause,
                    OwlDslParser.RULE_objectPropertyClause,
                    OwlDslParser.RULE_dataPropertyClause,
                    OwlDslParser.RULE_annotationPropertyClause,
                    OwlDslParser.RULE_primaryClassExpr,
                    OwlDslParser.RULE_boolClassExpr,
                    OwlDslParser.RULE_classExpr -> {
                        element.text.take(30)
                    }
                    else -> element.text.take(20)
                }
            }
        }
        return element.text
    }

    fun getType(): Int {
        if (element is ANTLRPsiNode) {
            val elementType = element.node.elementType
            if (elementType is RuleIElementType) {
                return when (elementType.ruleIndex) {
                    OwlDslParser.RULE_ontologyHeader -> 0
                    OwlDslParser.RULE_prefixDecl -> 1
                    OwlDslParser.RULE_annotationPropertyAxiom -> 2
                    OwlDslParser.RULE_classAxiom -> {
                        if (element.text.startsWith("AllDisjointClasses")) 4 // Disjoint Unions
                        else 3 // Classes
                    }
                    OwlDslParser.RULE_objectPropertyAxiom -> 5
                    OwlDslParser.RULE_dataPropertyAxiom -> 6
                    OwlDslParser.RULE_datatypeAxiom -> 7
                    OwlDslParser.RULE_individualAxiom -> 8
                    OwlDslParser.RULE_subPropertyChainAxiom -> 9
                    else -> 9 // Other
                }
            }
        }
        return 9
    }

    fun getIcon(): Icon? {
        if (element is ANTLRPsiNode) {
            val elementType = element.node.elementType
            if (elementType is RuleIElementType) {
                return when (elementType.ruleIndex) {
                    OwlDslParser.RULE_prefixDecl -> AmsIcons.PREFIX
                    OwlDslParser.RULE_classAxiom -> {
                        if (element.text.startsWith("AllDisjointClasses")) {
                            AmsIcons.ALL_DISJOINT_CLASSES
                        } else {
                            AmsIcons.CLASS
                        }
                    }
                    OwlDslParser.RULE_objectPropertyAxiom -> AmsIcons.OBJECT_PROPERTY
                    OwlDslParser.RULE_dataPropertyAxiom -> AmsIcons.DATA_PROPERTY
                    OwlDslParser.RULE_annotationPropertyAxiom -> AmsIcons.ANNOTATION_PROPERTY
                    OwlDslParser.RULE_individualAxiom -> com.intellij.util.PlatformIcons.ANONYMOUS_CLASS_ICON
                    OwlDslParser.RULE_datatypeAxiom -> com.intellij.util.PlatformIcons.CLASS_ICON
                    else -> null
                }
            }
        }
        return null
    }

    override fun getPresentation(): ItemPresentation {
        return object : ItemPresentation {
            override fun getPresentableText(): String? = this@amsStructureViewElement.getPresentableText()

            override fun getLocationString(): String? = null

            override fun getIcon(unused: Boolean): Icon? = this@amsStructureViewElement.getIcon()
        }
    }

    override fun getChildren(): Array<TreeElement> {
        if (element is amsFile) {
            val allElements = mutableListOf<amsStructureViewElement>()
            var ontologyNode: ANTLRPsiNode? = null
            
            fun findOntology(node: PsiElement) {
                if (node is ANTLRPsiNode && (node.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_ontology) {
                    ontologyNode = node
                    return
                }
                for (child in node.children) {
                    findOntology(child)
                    if (ontologyNode != null) return
                }
            }
            
            findOntology(element)

            ontologyNode?.children?.forEach { node ->
                collectTopLevel(node, allElements)
            }

            val groups = listOf(
                amsStructureGroup("Ontology", 0, allElements.filter { it.getType() == 0 }),
                amsStructureGroup("Prefixes", 1, allElements.filter { it.getType() == 1 }),
                amsStructureGroup("Annotation Properties", 2, allElements.filter { it.getType() == 2 }),
                amsStructureGroup("Classes", 3, allElements.filter { it.getType() == 3 }),
                amsStructureGroup("Disjoint Unions", 4, allElements.filter { it.getType() == 4 }),
                amsStructureGroup("Object Properties", 5, allElements.filter { it.getType() == 5 }),
                amsStructureGroup("Data Properties", 6, allElements.filter { it.getType() == 6 }),
                amsStructureGroup("Data Types", 7, allElements.filter { it.getType() == 7 }),
                amsStructureGroup("Individuals", 8, allElements.filter { it.getType() == 8 }),
                amsStructureGroup("Other", 9, allElements.filter { it.getType() == 9 })
            )

            return groups.filter { it.children.isNotEmpty() }.toTypedArray()
        }
        return emptyArray()
    }

    private fun collectTopLevel(node: PsiElement, children: MutableList<amsStructureViewElement>) {
        if (node is ANTLRPsiNode) {
            val elementType = node.node.elementType
            if (elementType is RuleIElementType) {
                when (elementType.ruleIndex) {
                    OwlDslParser.RULE_ontology -> {
                        node.children.forEach { collectTopLevel(it, children) }
                        return
                    }
                    OwlDslParser.RULE_prefixDecl,
                    OwlDslParser.RULE_ontologyHeader -> {
                        children.add(amsStructureViewElement(node))
                        return
                    }
                    OwlDslParser.RULE_classAxiom,
                    OwlDslParser.RULE_objectPropertyAxiom,
                    OwlDslParser.RULE_dataPropertyAxiom,
                    OwlDslParser.RULE_individualAxiom,
                    OwlDslParser.RULE_annotationPropertyAxiom,
                    OwlDslParser.RULE_datatypeAxiom,
                    OwlDslParser.RULE_subPropertyChainAxiom -> {
                        children.add(amsStructureViewElement(node))
                        return
                    }
                    OwlDslParser.RULE_annotatedAxiom,
                    OwlDslParser.RULE_bareAxiom -> {
                        // Find the axiom node which contains classAxiom etc.
                        val axiom = AmsPsiUtil.findRecursively(node, OwlDslParser.RULE_axiom)
                        if (axiom is ANTLRPsiNode) {
                            // axiom -> classAxiom
                            val concreteAxiom = axiom.children.firstOrNull { 
                                it is ANTLRPsiNode && it.node.elementType is RuleIElementType 
                            }
                            if (concreteAxiom != null) {
                                children.add(amsStructureViewElement(concreteAxiom))
                                return
                            }
                        }
                    }
                    OwlDslParser.RULE_annotatedOntologyHeader -> {
                        val header = AmsPsiUtil.findRecursively(node, OwlDslParser.RULE_ontologyHeader)
                        if (header is PsiElement) {
                            children.add(amsStructureViewElement(header))
                            return
                        }
                    }
                }
            }
        }
        node.children.forEach { collectTopLevel(it, children) }
    }
}

class amsStructureGroup(
    private val name: String,
    private val type: Int,
    private val elements: List<amsStructureViewElement>
) : StructureViewTreeElement {
    override fun getValue(): Any = name
    override fun navigate(requestFocus: Boolean) {}
    override fun canNavigate(): Boolean = false
    override fun canNavigateToSource(): Boolean = false

    fun getType(): Int = type

    override fun getPresentation(): ItemPresentation = object : ItemPresentation {
        override fun getPresentableText(): String = name
        override fun getLocationString(): String? = null
        override fun getIcon(unused: Boolean): Icon? = null
    }

    override fun getChildren(): Array<TreeElement> = elements.toTypedArray()
}
