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

    private fun findRecursively(node: PsiElement, ruleIndex: Int): PsiElement? {
        if (node is ANTLRPsiNode && node.node.elementType is RuleIElementType && 
            (node.node.elementType as RuleIElementType).ruleIndex == ruleIndex) {
            return node
        }
        for (child in node.children) {
            val found = findRecursively(child, ruleIndex)
            if (found != null) return found
        }
        return null
    }

    private fun findRecursivelyByName(node: PsiElement, name: String): PsiElement? {
        if (node is ANTLRPsiNode && node.node.elementType.toString().contains(name)) {
            return node
        }
        for (child in node.children) {
            val found = findRecursivelyByName(child, name)
            if (found != null) return found
        }
        return null
    }

    override fun canNavigate(): Boolean = element is NavigatablePsiElement

    override fun canNavigateToSource(): Boolean = element is NavigatablePsiElement

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
                        getAxiomLabel(element)
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
                    OwlDslParser.RULE_subPropertyChainAxiom -> 8
                    else -> 8 // Other
                }
            }
        }
        return 8
    }

    private fun getAxiomLabel(axiom: ANTLRPsiNode): String {
        val label = findLabelAnnotation(axiom)
        if (label != null) return label

        val idNode = findIdNode(axiom)
        return idNode?.text ?: axiom.text.take(20)
    }

    private fun findLabelAnnotation(node: ANTLRPsiNode): String? {
        // Look for @annotation(rdfs:label "...")
        // In OwlDsl.g4, annotatedAxiom : annotationBlock+ bareAxiom
        // But amsStructureViewElement might be called on the inner axiom node (ClassDeclAxiom etc.)
        // If it's a classAxiom, we might need to look at its parent (bareAxiom -> annotatedAxiom)
        
        var current: PsiElement? = node
        while (current != null && current !is amsFile) {
            if (current is ANTLRPsiNode && current.node.elementType is RuleIElementType) {
                val type = (current.node.elementType as RuleIElementType).ruleIndex
                if (type == OwlDslParser.RULE_annotatedAxiom || type == OwlDslParser.RULE_annotatedOntologyHeader) {
                    val blocks = current.children.filter { 
                        it is ANTLRPsiNode && it.node.elementType is RuleIElementType && 
                        (it.node.elementType as RuleIElementType).ruleIndex == OwlDslParser.RULE_annotationBlock 
                    }
                    for (block in blocks) {
                        val list = block.children.find { 
                            it is ANTLRPsiNode && it.node.elementType is RuleIElementType && 
                            (it.node.elementType as RuleIElementType).ruleIndex == OwlDslParser.RULE_annotationList 
                        }
                        val annotations = list?.children?.filter { 
                            it is ANTLRPsiNode && it.node.elementType is RuleIElementType && 
                            (it.node.elementType as RuleIElementType).ruleIndex == OwlDslParser.RULE_annotation 
                        } ?: emptyList()

                        for (ann in annotations) {
                            val propId = ann.children.find { 
                                it is ANTLRPsiNode && it.node.elementType is RuleIElementType && 
                                (it.node.elementType as RuleIElementType).ruleIndex == OwlDslParser.RULE_propId 
                            }
                            if (propId?.text?.endsWith("rdfs:label") == true || propId?.text == "rdfs:label") {
                                val literal = ann.children.find { 
                                    it is ANTLRPsiNode && it.node.elementType is RuleIElementType && 
                                    (it.node.elementType as RuleIElementType).ruleIndex == OwlDslParser.RULE_literal 
                                }
                                if (literal != null) {
                                    val text = literal.text
                                    return when {
                                        text.startsWith("\"\"\"") -> text.substringAfter("\"\"\"").substringBeforeLast("\"\"\"")
                                        text.startsWith("\"") -> text.substringAfter("\"").substringBeforeLast("\"")
                                        else -> text
                                    }
                                }
                            }
                        }
                    }
                }
            }
            current = current.parent
        }
        return null
    }

    private fun findIdNode(node: ANTLRPsiNode): PsiElement? {
        val ruleIElementType = node.node.elementType as? RuleIElementType ?: return null
        val targetRule = when (ruleIElementType.ruleIndex) {
            OwlDslParser.RULE_classAxiom -> OwlDslParser.RULE_classId
            OwlDslParser.RULE_objectPropertyAxiom, OwlDslParser.RULE_dataPropertyAxiom -> OwlDslParser.RULE_propId
            OwlDslParser.RULE_individualAxiom -> OwlDslParser.RULE_individualId
            OwlDslParser.RULE_annotationPropertyAxiom -> OwlDslParser.RULE_propId
            OwlDslParser.RULE_datatypeAxiom -> OwlDslParser.RULE_datatypeId
            OwlDslParser.RULE_subPropertyChainAxiom -> OwlDslParser.RULE_propId
            else -> null
        }
        
        if (targetRule != null) {
            val found = findRecursively(node, targetRule)
            if (found != null) {
                 // found is classId, we need its child (CURIE or IRI)
                 return found.children.firstOrNull() ?: found
            }
        }

        // Try common terminal names as fallback
        return findRecursivelyByName(node, "CURIE") ?: findRecursivelyByName(node, "IRI")
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
                amsStructureGroup("Other", 8, allElements.filter { it.getType() == 8 })
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
                        val axiom = findRecursively(node, OwlDslParser.RULE_axiom)
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
                        val header = findRecursively(node, OwlDslParser.RULE_ontologyHeader)
                        if (header != null) {
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
