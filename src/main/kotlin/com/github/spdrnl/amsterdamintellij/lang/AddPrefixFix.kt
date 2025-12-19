package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.psi.AmsElementFactory
import com.intellij.codeInsight.intention.IntentionAction
import com.intellij.codeInsight.intention.impl.BaseIntentionAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile
import com.intellij.psi.util.PsiTreeUtil
import com.github.spdrnl.amsterdamintellij.psi.AmsPrefixHeader
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import com.github.spdrnl.amsterdamintellij.parser.OwlDslParser

class AddPrefixFix(private val prefix: String) : BaseIntentionAction(), IntentionAction {
    override fun getFamilyName(): String = "Amsterdam"

    override fun getText(): String = "Add prefix declaration for '$prefix'"

    override fun isAvailable(project: Project, editor: Editor?, file: PsiFile?): Boolean = file is amsFile

    override fun invoke(project: Project, editor: Editor?, file: PsiFile?) {
        if (file !is amsFile) return
        
        val prefixDecl = "Prefix $prefix: <http://example.org/> .\n"
        val newFile = AmsElementFactory.createFile(project, prefixDecl)
        
        // Find the prefixDecl node in the new file
        val prefixNode = PsiTreeUtil.findChildOfType(newFile, AmsPrefixHeader::class.java) ?: return
        
        // Find the ontology node in the original file
        val ontology = PsiTreeUtil.findChildOfType(file, org.antlr.intellij.adaptor.psi.ANTLRPsiNode::class.java)
        if (ontology != null && (ontology.node.elementType as? RuleIElementType)?.ruleIndex == OwlDslParser.RULE_ontology) {
             val added = ontology.addBefore(prefixNode, ontology.firstChild)
             val newline = com.intellij.psi.PsiParserFacade.getInstance(project).createWhiteSpaceFromText("\n")
             ontology.addAfter(newline, added)
        } else {
             // Fallback
             val added = file.addBefore(prefixNode, file.firstChild)
             val newline = com.intellij.psi.PsiParserFacade.getInstance(project).createWhiteSpaceFromText("\n")
             file.addAfter(newline, added)
        }
    }
}
