package com.github.spdrnl.amsterdamintellij.lang

import com.github.spdrnl.amsterdamintellij.parser.OwlDslLexer
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor

class amsLexerAdapter : ANTLRLexerAdaptor(amsLanguage.INSTANCE, OwlDslLexer(null))
