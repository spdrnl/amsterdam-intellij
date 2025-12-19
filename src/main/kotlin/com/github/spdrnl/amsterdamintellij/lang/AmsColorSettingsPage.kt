package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class AmsColorSettingsPage : ColorSettingsPage {
    companion object {
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Identifier", AmsSyntaxHighlighter.ID),
            AttributesDescriptor("Keyword", AmsSyntaxHighlighter.KEYWORD),
            AttributesDescriptor("String", AmsSyntaxHighlighter.STRING),
            AttributesDescriptor("Line Comment", AmsSyntaxHighlighter.LINE_COMMENT),
            AttributesDescriptor("Block Comment", AmsSyntaxHighlighter.BLOCK_COMMENT),
            AttributesDescriptor("Number", AmsSyntaxHighlighter.NUMBER),
            AttributesDescriptor("Operator", AmsSyntaxHighlighter.OPERATOR),
            AttributesDescriptor("Braces", AmsSyntaxHighlighter.BRACES),
            AttributesDescriptor("Parentheses", AmsSyntaxHighlighter.PARENTHESES),
            AttributesDescriptor("Dot", AmsSyntaxHighlighter.DOT),
            AttributesDescriptor("Comma", AmsSyntaxHighlighter.COMMA),
            AttributesDescriptor("Semicolon", AmsSyntaxHighlighter.SEMICOLON),
            AttributesDescriptor("Metadata (Prefix/Language Tag)", AmsSyntaxHighlighter.PRE_IRI),
            AttributesDescriptor("Annotation Mention (@annotation/@property)", AmsSyntaxHighlighter.ANNOTATION_MENTION),
            AttributesDescriptor("IRI", AmsSyntaxHighlighter.IRI),
            AttributesDescriptor("Default Text", AmsSyntaxHighlighter.DEFAULT_TEXT),
            AttributesDescriptor("Semantic/Inlined Label", AmsSyntaxHighlighter.SEMANTIC_LABEL),
            AttributesDescriptor("Semantic/Inlined ID (Definition)", AmsSyntaxHighlighter.SEMANTIC_ID),
            AttributesDescriptor("Semantic/Inlined ID (Reference)", AmsSyntaxHighlighter.SEMANTIC_ID_REF),
            AttributesDescriptor("Inlay Hints Label", AmsSyntaxHighlighter.INLAY_TEXT),
            AttributesDescriptor("Semantic/Class Keyword", AmsSyntaxHighlighter.CLASS_KW),
            AttributesDescriptor("Semantic/Property Keyword", AmsSyntaxHighlighter.PROP_KW),
            AttributesDescriptor("Semantic/Individual Keyword", AmsSyntaxHighlighter.INDIVIDUAL_KW)
        )
    }

    override fun getAttributeDescriptors() = DESCRIPTORS

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() = "Amsterdam"

    override fun getIcon(): Icon? = null

    override fun getHighlighter() = AmsSyntaxHighlighter()

    override fun getDemoText() = """
        <metadata>Prefix</metadata> : <iri><http://example.org/></iri> .
        <metadata>Ontology</metadata> <iri><http://example.org/ontology></iri> .

        <ann>@annotation</ann>(rdfs:label <string>"Example Class"</string>)
        <class_kw>Class</class_kw> <label>"occurrent"@en</label> <id>obo:BFO_0000003</id> ;
            subClassOf <id_ref>:Thing</id_ref> ;
            ⊑ <id_ref>:Human</id_ref> ;
            equivalentTo <id_ref>:Individual</id_ref> .
            
        <ann>@property</ann>(rdfs:comment <string>"A numeric value"</string>)
        <prop_kw>DataProperty</prop_kw> :hasAge
            range <id_ref>xsd:integer</id_ref> .

        <individual_kw>Individual</individual_kw> :JohnDoe
            type <id_ref>:Person</id_ref> ;
            <id_ref>:hasAge</id_ref> 42 .

        // This is a line comment
        /* This is a 
           block comment */
    """.trimIndent()

    override fun getAdditionalHighlightingTagToDescriptorMap() = mapOf(
        "metadata" to AmsSyntaxHighlighter.PRE_IRI,
        "ann" to AmsSyntaxHighlighter.ANNOTATION_MENTION,
        "iri" to AmsSyntaxHighlighter.IRI,
        "string" to AmsSyntaxHighlighter.STRING,
        "label" to AmsSyntaxHighlighter.SEMANTIC_LABEL,
        "id" to AmsSyntaxHighlighter.SEMANTIC_ID,
        "id_ref" to AmsSyntaxHighlighter.SEMANTIC_ID_REF,
        "class_kw" to AmsSyntaxHighlighter.CLASS_KW,
        "prop_kw" to AmsSyntaxHighlighter.PROP_KW,
        "individual_kw" to AmsSyntaxHighlighter.INDIVIDUAL_KW
    )
}
