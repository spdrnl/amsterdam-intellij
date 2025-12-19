package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.psi.AmsCurie
import com.intellij.codeInsight.hints.*
import com.intellij.codeInsight.hints.presentation.InlayPresentation
import com.intellij.codeInsight.hints.presentation.PresentationFactory
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import javax.swing.JComponent
import javax.swing.JPanel

@Suppress("UnstableApiUsage")
class AmsInlayHintsProvider : InlayHintsProvider<AmsInlayHintsProvider.Settings> {

    data class Settings(var languagePreference: String = "@en")

    override val key: SettingsKey<Settings> = SettingsKey("ams.inlay.hints")
    override val name: String = "Amsterdam Inlay Hints"
    override val previewText: String = """
        Prefix : <http://example.org/> .
        @annotation(rdfs:label "Person"@en)
        Class :Person .
        
        Class :Student subClassOf :Person .
    """.trimIndent()

    override fun createSettings(): Settings = Settings()

    override fun getCollectorFor(
        file: PsiFile,
        editor: Editor,
        settings: Settings,
        sink: InlayHintsSink
    ): InlayHintsCollector {
        return object : FactoryInlayHintsCollector(editor) {
            override fun collect(element: PsiElement, editor: Editor, sink: InlayHintsSink): Boolean {
                if (element is AmsCurie) {
                    val definition = element.references
                        .filterIsInstance<com.github.spdrnl.amsterdamintellij.psi.AmsCurieLocalNameReference>()
                        .firstOrNull()?.resolve() ?: if (element.isDef()) element else null
                    
                    if (definition != null) {
                        val axiom = AmsPsiUtil.findAxiom(definition)
                        if (axiom != null) {
                            val label = AmsPsiUtil.findLabelAnnotation(axiom, settings.languagePreference)
                            if (label != null) {
                                val presentation = factory.inset(
                                    factory.roundWithBackground(factory.smallText(label)),
                                    left = 1,
                                    right = 1
                                )
                                sink.addInlineElement(
                                    element.textOffset,
                                    true,
                                    presentation,
                                    false
                                )
                            }
                        }
                    }
                }
                return true
            }
        }
    }

    override fun createConfigurable(settings: Settings): ImmediateConfigurable {
        return object : ImmediateConfigurable {
            override fun createComponent(listener: ChangeListener): JComponent = JPanel()
            override val mainCheckboxText: String = "Show rdfs:label for CURIEs and IRIs"
        }
    }
}
