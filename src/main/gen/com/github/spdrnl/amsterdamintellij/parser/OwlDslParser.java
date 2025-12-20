// Generated from OwlDsl.g4 by ANTLR 4.13.2
package com.github.spdrnl.amsterdamintellij.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class OwlDslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INTELLIJ_DUMMY=6, PREFIX_NAME=7, 
		CURIE=8, CURIE_EMPTY=9, IRI=10, ANNOTATION=11, PROPERTY=12, LANGTAG=13, 
		STRING3=14, STRING=15, INTEGER=16, DECIMAL=17, DOUBLE=18, FACET=19, GE=20, 
		LE=21, GT=22, LT=23, EQ=24, GE_SYM=25, LE_SYM=26, GE_ASC=27, LE_ASC=28, 
		GT_SYM=29, LT_SYM=30, EQ_SYM=31, WS=32, LINE_COMMENT=33, BLOCK_COMMENT=34, 
		PREFIX_KW=35, ONTOLOGY_KW=36, VERSION_IRI_KW=37, CLASS_KW=38, CLASSES_KW=39, 
		IS_KW=40, A_KW=41, AN_KW=42, SUBCLASS_KW=43, OF_KW=44, EQUIVALENT_KW=45, 
		TO_KW=46, DISJOINT_KW=47, WITH_KW=48, UNION_KW=49, HAS_KW=50, KEY_KW=51, 
		OBJECT_KW=52, PROPERTY_KW=53, SUBPROPERTY_KW=54, DOMAIN_KW=55, RANGE_KW=56, 
		CHARACTERISTICS_KW=57, INVERSE_KW=58, DATA_KW=59, ANNOTATION_KW=60, DATATYPE_KW=61, 
		DATATYPE_DEFINITION_KW=62, CHAIN_KW=63, INDIVIDUAL_KW=64, TYPE_KW=65, 
		SAME_KW=66, AS_KW=67, DIFFERENT_KW=68, FROM_KW=69, NOT_KW=70, AND_KW=71, 
		OR_KW=72, THING_KW=73, NOTHING_KW=74, SOME_KW=75, ONLY_KW=76, VALUE_KW=77, 
		MIN_KW=78, MAX_KW=79, EXACTLY_KW=80, THAT_KW=81, AT_KW=82, LEAST_KW=83, 
		MOST_KW=84, ONE_KW=85, ALL_KW=86, ANY_KW=87, FUNCTIONAL_KW=88, TRANSITIVE_KW=89, 
		SYMMETRIC_KW=90, ASYMMETRIC_KW=91, REFLEXIVE_KW=92, IRREFLEXIVE_KW=93, 
		IR_KW=94, RESTRICTION_KW=95, GREATER_KW=96, THAN_KW=97, LESS_KW=98, EQUAL_KW=99, 
		TRUE_KW=100, FALSE_KW=101, DOT=102, COMMA=103, COLON=104, SEMICOLON=105, 
		LPAREN=106, RPAREN=107, LBRACE=108, RBRACE=109, SUBSET_EQ=110, LE_SEQ=111, 
		NOT_SYM=112, INTERSECTION=113, UNION_SYM=114, SOME_SYM=115, ONLY_SYM=116, 
		COMPOSITION=117, THEN=118, DATATYPE_SEP=119, IDENTIFIER=120;
	public static final int
		RULE_ontology = 0, RULE_prefixDecl = 1, RULE_annotatedAxiom = 2, RULE_bareAxiom = 3, 
		RULE_annotationBlock = 4, RULE_annotationList = 5, RULE_annotation = 6, 
		RULE_ontologyHeader = 7, RULE_ontologyPropertyBlock = 8, RULE_ontologyPropertyList = 9, 
		RULE_ontologyProperty = 10, RULE_annotatedOntologyHeader = 11, RULE_axiom = 12, 
		RULE_classAxiom = 13, RULE_classSubOrEqAxiom = 14, RULE_classClause = 15, 
		RULE_subClassOfPhrase = 16, RULE_equivalentToPhrase = 17, RULE_disjointWithPhrase = 18, 
		RULE_disjointUnionOfPhrase = 19, RULE_allDisjointClassesPhrase = 20, RULE_hasKeyPhrase = 21, 
		RULE_isA = 22, RULE_isEquivalent = 23, RULE_isDisjoint = 24, RULE_has = 25, 
		RULE_commentOpt = 26, RULE_objectPropertyAxiom = 27, RULE_objectSubPropertyAxiom = 28, 
		RULE_objectPropertyDomainRangeAxiom = 29, RULE_objectPropertyClause = 30, 
		RULE_subPropertyOfPhrase = 31, RULE_domainPhrase = 32, RULE_rangePhrase = 33, 
		RULE_characteristicsPhrase = 34, RULE_inverseOfPhrase = 35, RULE_objectInversePropertyAxiom = 36, 
		RULE_dataPropertyAxiom = 37, RULE_dataSubPropertyAxiom = 38, RULE_dataPropertyDomainRangeAxiom = 39, 
		RULE_dataPropertyClause = 40, RULE_annotationPropertyAxiom = 41, RULE_annotationPropertyClause = 42, 
		RULE_datatypeAxiom = 43, RULE_subPropertyChainAxiom = 44, RULE_subPropertyChainPhrase = 45, 
		RULE_individualAxiom = 46, RULE_individualAxiomBody = 47, RULE_typeBody = 48, 
		RULE_isAPhrase = 49, RULE_sameOrDifferentBody = 50, RULE_sameAsPhrase = 51, 
		RULE_differentFromPhrase = 52, RULE_propAssertionList = 53, RULE_propAssertion = 54, 
		RULE_classExprList = 55, RULE_classExprNaryList = 56, RULE_classExpr = 57, 
		RULE_boolClassExpr = 58, RULE_primaryClassExpr = 59, RULE_atomicClassExpr = 60, 
		RULE_atLeastPhrase = 61, RULE_atMostPhrase = 62, RULE_oneOfPhrase = 63, 
		RULE_allOfPhrase = 64, RULE_anyOfPhrase = 65, RULE_thatConnector = 66, 
		RULE_thatRestriction = 67, RULE_binaryBoolOp = 68, RULE_propExpr = 69, 
		RULE_propExprChain = 70, RULE_propExprChainWithComments = 71, RULE_propExprList = 72, 
		RULE_propExprWithCommentList = 73, RULE_characteristicList = 74, RULE_characteristic = 75, 
		RULE_dataCharacteristicList = 76, RULE_dataCharacteristic = 77, RULE_dataRangeExpr = 78, 
		RULE_dataRangeOrExpr = 79, RULE_dataRangeAndExpr = 80, RULE_dataRangePrimary = 81, 
		RULE_facetRestrictionList = 82, RULE_facetRestriction = 83, RULE_greaterThanPhrase = 84, 
		RULE_lessThanPhrase = 85, RULE_equalToPhrase = 86, RULE_literalList = 87, 
		RULE_individualList = 88, RULE_entityUsage = 89, RULE_entityId = 90, RULE_classId = 91, 
		RULE_propId = 92, RULE_individualId = 93, RULE_datatypeId = 94, RULE_namespaceIRI = 95, 
		RULE_fullIRI = 96, RULE_literal = 97, RULE_ge = 98, RULE_le = 99, RULE_gt = 100, 
		RULE_lt = 101, RULE_eq = 102;
	private static String[] makeRuleNames() {
		return new String[] {
			"ontology", "prefixDecl", "annotatedAxiom", "bareAxiom", "annotationBlock", 
			"annotationList", "annotation", "ontologyHeader", "ontologyPropertyBlock", 
			"ontologyPropertyList", "ontologyProperty", "annotatedOntologyHeader", 
			"axiom", "classAxiom", "classSubOrEqAxiom", "classClause", "subClassOfPhrase", 
			"equivalentToPhrase", "disjointWithPhrase", "disjointUnionOfPhrase", 
			"allDisjointClassesPhrase", "hasKeyPhrase", "isA", "isEquivalent", "isDisjoint", 
			"has", "commentOpt", "objectPropertyAxiom", "objectSubPropertyAxiom", 
			"objectPropertyDomainRangeAxiom", "objectPropertyClause", "subPropertyOfPhrase", 
			"domainPhrase", "rangePhrase", "characteristicsPhrase", "inverseOfPhrase", 
			"objectInversePropertyAxiom", "dataPropertyAxiom", "dataSubPropertyAxiom", 
			"dataPropertyDomainRangeAxiom", "dataPropertyClause", "annotationPropertyAxiom", 
			"annotationPropertyClause", "datatypeAxiom", "subPropertyChainAxiom", 
			"subPropertyChainPhrase", "individualAxiom", "individualAxiomBody", "typeBody", 
			"isAPhrase", "sameOrDifferentBody", "sameAsPhrase", "differentFromPhrase", 
			"propAssertionList", "propAssertion", "classExprList", "classExprNaryList", 
			"classExpr", "boolClassExpr", "primaryClassExpr", "atomicClassExpr", 
			"atLeastPhrase", "atMostPhrase", "oneOfPhrase", "allOfPhrase", "anyOfPhrase", 
			"thatConnector", "thatRestriction", "binaryBoolOp", "propExpr", "propExprChain", 
			"propExprChainWithComments", "propExprList", "propExprWithCommentList", 
			"characteristicList", "characteristic", "dataCharacteristicList", "dataCharacteristic", 
			"dataRangeExpr", "dataRangeOrExpr", "dataRangeAndExpr", "dataRangePrimary", 
			"facetRestrictionList", "facetRestriction", "greaterThanPhrase", "lessThanPhrase", 
			"equalToPhrase", "literalList", "individualList", "entityUsage", "entityId", 
			"classId", "propId", "individualId", "datatypeId", "namespaceIRI", "fullIRI", 
			"literal", "ge", "le", "gt", "lt", "eq"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ge'", "'le'", "'gt'", "'lt'", "'eq'", "'IntellijIdeaRulezzz'", 
			null, null, null, null, "'@annotation'", "'@property'", null, null, null, 
			null, null, null, null, "'GE'", "'LE'", "'GT'", "'LT'", "'EQ'", "'\\u2265'", 
			"'\\u2264'", "'>='", "'<='", "'>'", "'<'", "'='", null, null, null, null, 
			null, "'versionIRI'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'.'", "','", "':'", 
			"';'", "'('", "')'", "'{'", "'}'", "'\\u2291'", "'<=:'", "'\\u00AC'", 
			"'\\u2293'", "'\\u2294'", "'\\u2203'", "'\\u2200'", "'o'", "'then'", 
			"'^^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INTELLIJ_DUMMY", "PREFIX_NAME", 
			"CURIE", "CURIE_EMPTY", "IRI", "ANNOTATION", "PROPERTY", "LANGTAG", "STRING3", 
			"STRING", "INTEGER", "DECIMAL", "DOUBLE", "FACET", "GE", "LE", "GT", 
			"LT", "EQ", "GE_SYM", "LE_SYM", "GE_ASC", "LE_ASC", "GT_SYM", "LT_SYM", 
			"EQ_SYM", "WS", "LINE_COMMENT", "BLOCK_COMMENT", "PREFIX_KW", "ONTOLOGY_KW", 
			"VERSION_IRI_KW", "CLASS_KW", "CLASSES_KW", "IS_KW", "A_KW", "AN_KW", 
			"SUBCLASS_KW", "OF_KW", "EQUIVALENT_KW", "TO_KW", "DISJOINT_KW", "WITH_KW", 
			"UNION_KW", "HAS_KW", "KEY_KW", "OBJECT_KW", "PROPERTY_KW", "SUBPROPERTY_KW", 
			"DOMAIN_KW", "RANGE_KW", "CHARACTERISTICS_KW", "INVERSE_KW", "DATA_KW", 
			"ANNOTATION_KW", "DATATYPE_KW", "DATATYPE_DEFINITION_KW", "CHAIN_KW", 
			"INDIVIDUAL_KW", "TYPE_KW", "SAME_KW", "AS_KW", "DIFFERENT_KW", "FROM_KW", 
			"NOT_KW", "AND_KW", "OR_KW", "THING_KW", "NOTHING_KW", "SOME_KW", "ONLY_KW", 
			"VALUE_KW", "MIN_KW", "MAX_KW", "EXACTLY_KW", "THAT_KW", "AT_KW", "LEAST_KW", 
			"MOST_KW", "ONE_KW", "ALL_KW", "ANY_KW", "FUNCTIONAL_KW", "TRANSITIVE_KW", 
			"SYMMETRIC_KW", "ASYMMETRIC_KW", "REFLEXIVE_KW", "IRREFLEXIVE_KW", "IR_KW", 
			"RESTRICTION_KW", "GREATER_KW", "THAN_KW", "LESS_KW", "EQUAL_KW", "TRUE_KW", 
			"FALSE_KW", "DOT", "COMMA", "COLON", "SEMICOLON", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "SUBSET_EQ", "LE_SEQ", "NOT_SYM", "INTERSECTION", 
			"UNION_SYM", "SOME_SYM", "ONLY_SYM", "COMPOSITION", "THEN", "DATATYPE_SEP", 
			"IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "OwlDsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OwlDslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OntologyContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(OwlDslParser.EOF, 0); }
		public List<PrefixDeclContext> prefixDecl() {
			return getRuleContexts(PrefixDeclContext.class);
		}
		public PrefixDeclContext prefixDecl(int i) {
			return getRuleContext(PrefixDeclContext.class,i);
		}
		public List<OntologyPropertyBlockContext> ontologyPropertyBlock() {
			return getRuleContexts(OntologyPropertyBlockContext.class);
		}
		public OntologyPropertyBlockContext ontologyPropertyBlock(int i) {
			return getRuleContext(OntologyPropertyBlockContext.class,i);
		}
		public List<AnnotatedAxiomContext> annotatedAxiom() {
			return getRuleContexts(AnnotatedAxiomContext.class);
		}
		public AnnotatedAxiomContext annotatedAxiom(int i) {
			return getRuleContext(AnnotatedAxiomContext.class,i);
		}
		public List<BareAxiomContext> bareAxiom() {
			return getRuleContexts(BareAxiomContext.class);
		}
		public BareAxiomContext bareAxiom(int i) {
			return getRuleContext(BareAxiomContext.class,i);
		}
		public List<AnnotatedOntologyHeaderContext> annotatedOntologyHeader() {
			return getRuleContexts(AnnotatedOntologyHeaderContext.class);
		}
		public AnnotatedOntologyHeaderContext annotatedOntologyHeader(int i) {
			return getRuleContext(AnnotatedOntologyHeaderContext.class,i);
		}
		public List<OntologyHeaderContext> ontologyHeader() {
			return getRuleContexts(OntologyHeaderContext.class);
		}
		public OntologyHeaderContext ontologyHeader(int i) {
			return getRuleContext(OntologyHeaderContext.class,i);
		}
		public List<TerminalNode> INTELLIJ_DUMMY() { return getTokens(OwlDslParser.INTELLIJ_DUMMY); }
		public TerminalNode INTELLIJ_DUMMY(int i) {
			return getToken(OwlDslParser.INTELLIJ_DUMMY, i);
		}
		public OntologyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ontology; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitOntology(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OntologyContext ontology() throws RecognitionException {
		OntologyContext _localctx = new OntologyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ontology);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8669429660645333056L) != 0) || _la==INDIVIDUAL_KW || _la==ALL_KW) {
				{
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(206);
					prefixDecl();
					}
					break;
				case 2:
					{
					setState(207);
					ontologyPropertyBlock();
					}
					break;
				case 3:
					{
					setState(208);
					annotatedAxiom();
					}
					break;
				case 4:
					{
					setState(209);
					bareAxiom();
					}
					break;
				case 5:
					{
					setState(210);
					annotatedOntologyHeader();
					}
					break;
				case 6:
					{
					setState(211);
					ontologyHeader();
					}
					break;
				case 7:
					{
					setState(212);
					match(INTELLIJ_DUMMY);
					}
					break;
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixDeclContext extends ParserRuleContext {
		public TerminalNode PREFIX_KW() { return getToken(OwlDslParser.PREFIX_KW, 0); }
		public NamespaceIRIContext namespaceIRI() {
			return getRuleContext(NamespaceIRIContext.class,0);
		}
		public TerminalNode DOT() { return getToken(OwlDslParser.DOT, 0); }
		public TerminalNode PREFIX_NAME() { return getToken(OwlDslParser.PREFIX_NAME, 0); }
		public TerminalNode COLON() { return getToken(OwlDslParser.COLON, 0); }
		public PrefixDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitPrefixDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixDeclContext prefixDecl() throws RecognitionException {
		PrefixDeclContext _localctx = new PrefixDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prefixDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(PREFIX_KW);
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==PREFIX_NAME || _la==COLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(222);
			namespaceIRI();
			setState(223);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotatedAxiomContext extends ParserRuleContext {
		public BareAxiomContext bareAxiom() {
			return getRuleContext(BareAxiomContext.class,0);
		}
		public List<AnnotationBlockContext> annotationBlock() {
			return getRuleContexts(AnnotationBlockContext.class);
		}
		public AnnotationBlockContext annotationBlock(int i) {
			return getRuleContext(AnnotationBlockContext.class,i);
		}
		public AnnotatedAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedAxiom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAnnotatedAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotatedAxiomContext annotatedAxiom() throws RecognitionException {
		AnnotatedAxiomContext _localctx = new AnnotatedAxiomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_annotatedAxiom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				annotationBlock();
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANNOTATION );
			setState(230);
			bareAxiom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BareAxiomContext extends ParserRuleContext {
		public AxiomContext axiom() {
			return getRuleContext(AxiomContext.class,0);
		}
		public TerminalNode DOT() { return getToken(OwlDslParser.DOT, 0); }
		public BareAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bareAxiom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitBareAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BareAxiomContext bareAxiom() throws RecognitionException {
		BareAxiomContext _localctx = new BareAxiomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bareAxiom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			axiom();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(233);
				match(DOT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationBlockContext extends ParserRuleContext {
		public TerminalNode ANNOTATION() { return getToken(OwlDslParser.ANNOTATION, 0); }
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public AnnotationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAnnotationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationBlockContext annotationBlock() throws RecognitionException {
		AnnotationBlockContext _localctx = new AnnotationBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_annotationBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ANNOTATION);
			setState(237);
			match(LPAREN);
			setState(238);
			annotationList();
			setState(239);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationListContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OwlDslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OwlDslParser.COMMA, i);
		}
		public AnnotationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAnnotationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationListContext annotationList() throws RecognitionException {
		AnnotationListContext _localctx = new AnnotationListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_annotationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			annotation();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				annotation();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public List<EntityUsageContext> entityUsage() {
			return getRuleContexts(EntityUsageContext.class);
		}
		public EntityUsageContext entityUsage(int i) {
			return getRuleContext(EntityUsageContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			entityUsage();
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING3:
			case STRING:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case TRUE_KW:
			case FALSE_KW:
				{
				setState(250);
				literal();
				}
				break;
			case INTELLIJ_DUMMY:
			case CURIE:
			case CURIE_EMPTY:
			case IRI:
				{
				setState(251);
				entityUsage();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OntologyHeaderContext extends ParserRuleContext {
		public TerminalNode ONTOLOGY_KW() { return getToken(OwlDslParser.ONTOLOGY_KW, 0); }
		public List<FullIRIContext> fullIRI() {
			return getRuleContexts(FullIRIContext.class);
		}
		public FullIRIContext fullIRI(int i) {
			return getRuleContext(FullIRIContext.class,i);
		}
		public TerminalNode DOT() { return getToken(OwlDslParser.DOT, 0); }
		public TerminalNode VERSION_IRI_KW() { return getToken(OwlDslParser.VERSION_IRI_KW, 0); }
		public OntologyHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ontologyHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitOntologyHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OntologyHeaderContext ontologyHeader() throws RecognitionException {
		OntologyHeaderContext _localctx = new OntologyHeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ontologyHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ONTOLOGY_KW);
			setState(255);
			fullIRI();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERSION_IRI_KW) {
				{
				setState(256);
				match(VERSION_IRI_KW);
				setState(257);
				fullIRI();
				}
			}

			setState(260);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OntologyPropertyBlockContext extends ParserRuleContext {
		public TerminalNode PROPERTY() { return getToken(OwlDslParser.PROPERTY, 0); }
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public OntologyPropertyListContext ontologyPropertyList() {
			return getRuleContext(OntologyPropertyListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public OntologyPropertyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ontologyPropertyBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitOntologyPropertyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OntologyPropertyBlockContext ontologyPropertyBlock() throws RecognitionException {
		OntologyPropertyBlockContext _localctx = new OntologyPropertyBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ontologyPropertyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(PROPERTY);
			setState(263);
			match(LPAREN);
			setState(264);
			ontologyPropertyList();
			setState(265);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OntologyPropertyListContext extends ParserRuleContext {
		public List<OntologyPropertyContext> ontologyProperty() {
			return getRuleContexts(OntologyPropertyContext.class);
		}
		public OntologyPropertyContext ontologyProperty(int i) {
			return getRuleContext(OntologyPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OwlDslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OwlDslParser.COMMA, i);
		}
		public OntologyPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ontologyPropertyList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitOntologyPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OntologyPropertyListContext ontologyPropertyList() throws RecognitionException {
		OntologyPropertyListContext _localctx = new OntologyPropertyListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ontologyPropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			ontologyProperty();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(268);
				match(COMMA);
				setState(269);
				ontologyProperty();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OntologyPropertyContext extends ParserRuleContext {
		public List<EntityUsageContext> entityUsage() {
			return getRuleContexts(EntityUsageContext.class);
		}
		public EntityUsageContext entityUsage(int i) {
			return getRuleContext(EntityUsageContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OntologyPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ontologyProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitOntologyProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OntologyPropertyContext ontologyProperty() throws RecognitionException {
		OntologyPropertyContext _localctx = new OntologyPropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ontologyProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			entityUsage();
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING3:
			case STRING:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case TRUE_KW:
			case FALSE_KW:
				{
				setState(276);
				literal();
				}
				break;
			case INTELLIJ_DUMMY:
			case CURIE:
			case CURIE_EMPTY:
			case IRI:
				{
				setState(277);
				entityUsage();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotatedOntologyHeaderContext extends ParserRuleContext {
		public OntologyHeaderContext ontologyHeader() {
			return getRuleContext(OntologyHeaderContext.class,0);
		}
		public List<AnnotationBlockContext> annotationBlock() {
			return getRuleContexts(AnnotationBlockContext.class);
		}
		public AnnotationBlockContext annotationBlock(int i) {
			return getRuleContext(AnnotationBlockContext.class,i);
		}
		public AnnotatedOntologyHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedOntologyHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAnnotatedOntologyHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotatedOntologyHeaderContext annotatedOntologyHeader() throws RecognitionException {
		AnnotatedOntologyHeaderContext _localctx = new AnnotatedOntologyHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_annotatedOntologyHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(280);
				annotationBlock();
				}
				}
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANNOTATION );
			setState(285);
			ontologyHeader();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AxiomContext extends ParserRuleContext {
		public ClassAxiomContext classAxiom() {
			return getRuleContext(ClassAxiomContext.class,0);
		}
		public ObjectPropertyAxiomContext objectPropertyAxiom() {
			return getRuleContext(ObjectPropertyAxiomContext.class,0);
		}
		public DataPropertyAxiomContext dataPropertyAxiom() {
			return getRuleContext(DataPropertyAxiomContext.class,0);
		}
		public AnnotationPropertyAxiomContext annotationPropertyAxiom() {
			return getRuleContext(AnnotationPropertyAxiomContext.class,0);
		}
		public DatatypeAxiomContext datatypeAxiom() {
			return getRuleContext(DatatypeAxiomContext.class,0);
		}
		public SubPropertyChainAxiomContext subPropertyChainAxiom() {
			return getRuleContext(SubPropertyChainAxiomContext.class,0);
		}
		public IndividualAxiomContext individualAxiom() {
			return getRuleContext(IndividualAxiomContext.class,0);
		}
		public AxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axiom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxiomContext axiom() throws RecognitionException {
		AxiomContext _localctx = new AxiomContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_axiom);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_KW:
			case ALL_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				classAxiom();
				}
				break;
			case OBJECT_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				objectPropertyAxiom();
				}
				break;
			case DATA_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				dataPropertyAxiom();
				}
				break;
			case ANNOTATION_KW:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				annotationPropertyAxiom();
				}
				break;
			case DATATYPE_KW:
			case DATATYPE_DEFINITION_KW:
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
				datatypeAxiom();
				}
				break;
			case SUBPROPERTY_KW:
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				subPropertyChainAxiom();
				}
				break;
			case INDIVIDUAL_KW:
				enterOuterAlt(_localctx, 7);
				{
				setState(293);
				individualAxiom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassAxiomContext extends ParserRuleContext {
		public ClassAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAxiom; }
	 
		public ClassAxiomContext() { }
		public void copyFrom(ClassAxiomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllDisjointClassesAxiomContext extends ClassAxiomContext {
		public AllDisjointClassesPhraseContext allDisjointClassesPhrase() {
			return getRuleContext(AllDisjointClassesPhraseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public ClassExprListContext classExprList() {
			return getRuleContext(ClassExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public AllDisjointClassesAxiomContext(ClassAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAllDisjointClassesAxiom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclAxiomContext extends ClassAxiomContext {
		public TerminalNode CLASS_KW() { return getToken(OwlDslParser.CLASS_KW, 0); }
		public ClassIdContext classId() {
			return getRuleContext(ClassIdContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ClassDeclAxiomContext(ClassAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitClassDeclAxiom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSubOrEqAxiomAltContext extends ClassAxiomContext {
		public ClassSubOrEqAxiomContext classSubOrEqAxiom() {
			return getRuleContext(ClassSubOrEqAxiomContext.class,0);
		}
		public ClassSubOrEqAxiomAltContext(ClassAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitClassSubOrEqAxiomAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAxiomContext classAxiom() throws RecognitionException {
		ClassAxiomContext _localctx = new ClassAxiomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classAxiom);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ClassDeclAxiomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(CLASS_KW);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(297);
					commentOpt();
					}
				}

				setState(300);
				classId();
				}
				break;
			case 2:
				_localctx = new ClassSubOrEqAxiomAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				classSubOrEqAxiom();
				}
				break;
			case 3:
				_localctx = new AllDisjointClassesAxiomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				allDisjointClassesPhrase();
				setState(303);
				match(LPAREN);
				setState(304);
				classExprList();
				setState(305);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassSubOrEqAxiomContext extends ParserRuleContext {
		public TerminalNode CLASS_KW() { return getToken(OwlDslParser.CLASS_KW, 0); }
		public List<ClassClauseContext> classClause() {
			return getRuleContexts(ClassClauseContext.class);
		}
		public ClassClauseContext classClause(int i) {
			return getRuleContext(ClassClauseContext.class,i);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ClassIdContext classId() {
			return getRuleContext(ClassIdContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(OwlDslParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(OwlDslParser.SEMICOLON, i);
		}
		public ClassSubOrEqAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSubOrEqAxiom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitClassSubOrEqAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSubOrEqAxiomContext classSubOrEqAxiom() throws RecognitionException {
		ClassSubOrEqAxiomContext _localctx = new ClassSubOrEqAxiomContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classSubOrEqAxiom);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(CLASS_KW);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(310);
				commentOpt();
				}
			}

			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1856L) != 0)) {
				{
				setState(313);
				classId();
				}
			}

			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(316);
				match(SEMICOLON);
				}
			}

			setState(319);
			classClause();
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(320);
					match(SEMICOLON);
					setState(321);
					classClause();
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(327);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassClauseContext extends ParserRuleContext {
		public ClassClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classClause; }
	 
		public ClassClauseContext() { }
		public void copyFrom(ClassClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDisjointClauseContext extends ClassClauseContext {
		public DisjointWithPhraseContext disjointWithPhrase() {
			return getRuleContext(DisjointWithPhraseContext.class,0);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ClassDisjointClauseContext(ClassClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitClassDisjointClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassEquivalentClauseContext extends ClassClauseContext {
		public EquivalentToPhraseContext equivalentToPhrase() {
			return getRuleContext(EquivalentToPhraseContext.class,0);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ClassEquivalentClauseContext(ClassClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitClassEquivalentClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassHasKeyClauseContext extends ClassClauseContext {
		public HasKeyPhraseContext hasKeyPhrase() {
			return getRuleContext(HasKeyPhraseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public PropExprWithCommentListContext propExprWithCommentList() {
			return getRuleContext(PropExprWithCommentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public ClassHasKeyClauseContext(ClassClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitClassHasKeyClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSubClauseContext extends ClassClauseContext {
		public SubClassOfPhraseContext subClassOfPhrase() {
			return getRuleContext(SubClassOfPhraseContext.class,0);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ClassSubClauseContext(ClassClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitClassSubClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDisjointUnionClauseContext extends ClassClauseContext {
		public DisjointUnionOfPhraseContext disjointUnionOfPhrase() {
			return getRuleContext(DisjointUnionOfPhraseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public ClassExprListContext classExprList() {
			return getRuleContext(ClassExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public ClassDisjointUnionClauseContext(ClassClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitClassDisjointUnionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassClauseContext classClause() throws RecognitionException {
		ClassClauseContext _localctx = new ClassClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classClause);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ClassSubClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				subClassOfPhrase();
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(331);
					commentOpt();
					}
					break;
				}
				setState(334);
				classExpr();
				}
				break;
			case 2:
				_localctx = new ClassEquivalentClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				equivalentToPhrase();
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(337);
					commentOpt();
					}
					break;
				}
				setState(340);
				classExpr();
				}
				break;
			case 3:
				_localctx = new ClassDisjointClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				disjointWithPhrase();
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(343);
					commentOpt();
					}
					break;
				}
				setState(346);
				classExpr();
				}
				break;
			case 4:
				_localctx = new ClassDisjointUnionClauseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				disjointUnionOfPhrase();
				setState(349);
				match(LPAREN);
				setState(350);
				classExprList();
				setState(351);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new ClassHasKeyClauseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				hasKeyPhrase();
				setState(354);
				match(LPAREN);
				setState(355);
				propExprWithCommentList();
				setState(356);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubClassOfPhraseContext extends ParserRuleContext {
		public TerminalNode SUBSET_EQ() { return getToken(OwlDslParser.SUBSET_EQ, 0); }
		public TerminalNode LE_SEQ() { return getToken(OwlDslParser.LE_SEQ, 0); }
		public IsAContext isA() {
			return getRuleContext(IsAContext.class,0);
		}
		public TerminalNode SUBCLASS_KW() { return getToken(OwlDslParser.SUBCLASS_KW, 0); }
		public TerminalNode OF_KW() { return getToken(OwlDslParser.OF_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public SubClassOfPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subClassOfPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitSubClassOfPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubClassOfPhraseContext subClassOfPhrase() throws RecognitionException {
		SubClassOfPhraseContext _localctx = new SubClassOfPhraseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_subClassOfPhrase);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(SUBSET_EQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(LE_SEQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				isA();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS_KW) {
					{
					setState(363);
					match(IS_KW);
					}
				}

				setState(366);
				match(SUBCLASS_KW);
				setState(367);
				match(OF_KW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EquivalentToPhraseContext extends ParserRuleContext {
		public IsEquivalentContext isEquivalent() {
			return getRuleContext(IsEquivalentContext.class,0);
		}
		public TerminalNode TO_KW() { return getToken(OwlDslParser.TO_KW, 0); }
		public EquivalentToPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equivalentToPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitEquivalentToPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquivalentToPhraseContext equivalentToPhrase() throws RecognitionException {
		EquivalentToPhraseContext _localctx = new EquivalentToPhraseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equivalentToPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			isEquivalent();
			setState(371);
			match(TO_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DisjointWithPhraseContext extends ParserRuleContext {
		public IsDisjointContext isDisjoint() {
			return getRuleContext(IsDisjointContext.class,0);
		}
		public TerminalNode WITH_KW() { return getToken(OwlDslParser.WITH_KW, 0); }
		public DisjointWithPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjointWithPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDisjointWithPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjointWithPhraseContext disjointWithPhrase() throws RecognitionException {
		DisjointWithPhraseContext _localctx = new DisjointWithPhraseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_disjointWithPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			isDisjoint();
			setState(374);
			match(WITH_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DisjointUnionOfPhraseContext extends ParserRuleContext {
		public IsDisjointContext isDisjoint() {
			return getRuleContext(IsDisjointContext.class,0);
		}
		public TerminalNode UNION_KW() { return getToken(OwlDslParser.UNION_KW, 0); }
		public TerminalNode OF_KW() { return getToken(OwlDslParser.OF_KW, 0); }
		public DisjointUnionOfPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjointUnionOfPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDisjointUnionOfPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjointUnionOfPhraseContext disjointUnionOfPhrase() throws RecognitionException {
		DisjointUnionOfPhraseContext _localctx = new DisjointUnionOfPhraseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_disjointUnionOfPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			isDisjoint();
			setState(377);
			match(UNION_KW);
			setState(378);
			match(OF_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllDisjointClassesPhraseContext extends ParserRuleContext {
		public TerminalNode ALL_KW() { return getToken(OwlDslParser.ALL_KW, 0); }
		public TerminalNode DISJOINT_KW() { return getToken(OwlDslParser.DISJOINT_KW, 0); }
		public TerminalNode CLASSES_KW() { return getToken(OwlDslParser.CLASSES_KW, 0); }
		public AllDisjointClassesPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allDisjointClassesPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAllDisjointClassesPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllDisjointClassesPhraseContext allDisjointClassesPhrase() throws RecognitionException {
		AllDisjointClassesPhraseContext _localctx = new AllDisjointClassesPhraseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_allDisjointClassesPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(ALL_KW);
			setState(381);
			match(DISJOINT_KW);
			setState(382);
			match(CLASSES_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HasKeyPhraseContext extends ParserRuleContext {
		public HasContext has() {
			return getRuleContext(HasContext.class,0);
		}
		public TerminalNode KEY_KW() { return getToken(OwlDslParser.KEY_KW, 0); }
		public HasKeyPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasKeyPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitHasKeyPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HasKeyPhraseContext hasKeyPhrase() throws RecognitionException {
		HasKeyPhraseContext _localctx = new HasKeyPhraseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_hasKeyPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			has();
			setState(385);
			match(KEY_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsAContext extends ParserRuleContext {
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public TerminalNode A_KW() { return getToken(OwlDslParser.A_KW, 0); }
		public TerminalNode AN_KW() { return getToken(OwlDslParser.AN_KW, 0); }
		public IsAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isA; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitIsA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsAContext isA() throws RecognitionException {
		IsAContext _localctx = new IsAContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_isA);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(IS_KW);
			setState(388);
			_la = _input.LA(1);
			if ( !(_la==A_KW || _la==AN_KW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsEquivalentContext extends ParserRuleContext {
		public TerminalNode EQUIVALENT_KW() { return getToken(OwlDslParser.EQUIVALENT_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public IsEquivalentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isEquivalent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitIsEquivalent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsEquivalentContext isEquivalent() throws RecognitionException {
		IsEquivalentContext _localctx = new IsEquivalentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_isEquivalent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS_KW) {
				{
				setState(390);
				match(IS_KW);
				}
			}

			setState(393);
			match(EQUIVALENT_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsDisjointContext extends ParserRuleContext {
		public TerminalNode DISJOINT_KW() { return getToken(OwlDslParser.DISJOINT_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public IsDisjointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isDisjoint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitIsDisjoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsDisjointContext isDisjoint() throws RecognitionException {
		IsDisjointContext _localctx = new IsDisjointContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_isDisjoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS_KW) {
				{
				setState(395);
				match(IS_KW);
				}
			}

			setState(398);
			match(DISJOINT_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HasContext extends ParserRuleContext {
		public TerminalNode HAS_KW() { return getToken(OwlDslParser.HAS_KW, 0); }
		public HasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_has; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitHas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HasContext has() throws RecognitionException {
		HasContext _localctx = new HasContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_has);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAS_KW) {
				{
				setState(400);
				match(HAS_KW);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentOptContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CommentOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentOpt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitCommentOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentOptContext commentOpt() throws RecognitionException {
		CommentOptContext _localctx = new CommentOptContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_commentOpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyAxiomContext extends ParserRuleContext {
		public ObjectPropertyAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPropertyAxiom; }
	 
		public ObjectPropertyAxiomContext() { }
		public void copyFrom(ObjectPropertyAxiomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectSubPropertyAltContext extends ObjectPropertyAxiomContext {
		public ObjectSubPropertyAxiomContext objectSubPropertyAxiom() {
			return getRuleContext(ObjectSubPropertyAxiomContext.class,0);
		}
		public ObjectSubPropertyAltContext(ObjectPropertyAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectSubPropertyAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyDomainRangeAltContext extends ObjectPropertyAxiomContext {
		public ObjectPropertyDomainRangeAxiomContext objectPropertyDomainRangeAxiom() {
			return getRuleContext(ObjectPropertyDomainRangeAxiomContext.class,0);
		}
		public ObjectPropertyDomainRangeAltContext(ObjectPropertyAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectPropertyDomainRangeAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInversePropertyAltContext extends ObjectPropertyAxiomContext {
		public ObjectInversePropertyAxiomContext objectInversePropertyAxiom() {
			return getRuleContext(ObjectInversePropertyAxiomContext.class,0);
		}
		public ObjectInversePropertyAltContext(ObjectPropertyAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectInversePropertyAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyDeclContext extends ObjectPropertyAxiomContext {
		public PropIdContext propId() {
			return getRuleContext(PropIdContext.class,0);
		}
		public TerminalNode OBJECT_KW() { return getToken(OwlDslParser.OBJECT_KW, 0); }
		public TerminalNode PROPERTY_KW() { return getToken(OwlDslParser.PROPERTY_KW, 0); }
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ObjectPropertyDeclContext(ObjectPropertyAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectPropertyDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyAxiomContext objectPropertyAxiom() throws RecognitionException {
		ObjectPropertyAxiomContext _localctx = new ObjectPropertyAxiomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_objectPropertyAxiom);
		int _la;
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ObjectPropertyDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(405);
				match(OBJECT_KW);
				setState(406);
				match(PROPERTY_KW);
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(408);
					commentOpt();
					}
				}

				setState(411);
				propId();
				}
				break;
			case 2:
				_localctx = new ObjectPropertyDomainRangeAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				objectPropertyDomainRangeAxiom();
				}
				break;
			case 3:
				_localctx = new ObjectSubPropertyAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				objectSubPropertyAxiom();
				}
				break;
			case 4:
				_localctx = new ObjectInversePropertyAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				objectInversePropertyAxiom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectSubPropertyAxiomContext extends ParserRuleContext {
		public PropIdContext propId() {
			return getRuleContext(PropIdContext.class,0);
		}
		public SubPropertyOfPhraseContext subPropertyOfPhrase() {
			return getRuleContext(SubPropertyOfPhraseContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public TerminalNode OBJECT_KW() { return getToken(OwlDslParser.OBJECT_KW, 0); }
		public TerminalNode PROPERTY_KW() { return getToken(OwlDslParser.PROPERTY_KW, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(OwlDslParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(OwlDslParser.SEMICOLON, i);
		}
		public ObjectSubPropertyAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectSubPropertyAxiom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectSubPropertyAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectSubPropertyAxiomContext objectSubPropertyAxiom() throws RecognitionException {
		ObjectSubPropertyAxiomContext _localctx = new ObjectSubPropertyAxiomContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_objectSubPropertyAxiom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(417);
			match(OBJECT_KW);
			setState(418);
			match(PROPERTY_KW);
			}
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(420);
				commentOpt();
				}
			}

			setState(423);
			propId();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(424);
				match(SEMICOLON);
				}
			}

			setState(427);
			subPropertyOfPhrase();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(428);
				commentOpt();
				}
			}

			setState(431);
			propExpr();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(432);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyDomainRangeAxiomContext extends ParserRuleContext {
		public PropIdContext propId() {
			return getRuleContext(PropIdContext.class,0);
		}
		public List<ObjectPropertyClauseContext> objectPropertyClause() {
			return getRuleContexts(ObjectPropertyClauseContext.class);
		}
		public ObjectPropertyClauseContext objectPropertyClause(int i) {
			return getRuleContext(ObjectPropertyClauseContext.class,i);
		}
		public TerminalNode OBJECT_KW() { return getToken(OwlDslParser.OBJECT_KW, 0); }
		public TerminalNode PROPERTY_KW() { return getToken(OwlDslParser.PROPERTY_KW, 0); }
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(OwlDslParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(OwlDslParser.SEMICOLON, i);
		}
		public ObjectPropertyDomainRangeAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPropertyDomainRangeAxiom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectPropertyDomainRangeAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyDomainRangeAxiomContext objectPropertyDomainRangeAxiom() throws RecognitionException {
		ObjectPropertyDomainRangeAxiomContext _localctx = new ObjectPropertyDomainRangeAxiomContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectPropertyDomainRangeAxiom);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(435);
			match(OBJECT_KW);
			setState(436);
			match(PROPERTY_KW);
			}
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(438);
				commentOpt();
				}
			}

			setState(441);
			propId();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(442);
				match(SEMICOLON);
				}
			}

			setState(445);
			objectPropertyClause();
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(446);
						match(SEMICOLON);
						}
					}

					setState(449);
					objectPropertyClause();
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(455);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyClauseContext extends ParserRuleContext {
		public ObjectPropertyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPropertyClause; }
	 
		public ObjectPropertyClauseContext() { }
		public void copyFrom(ObjectPropertyClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropDisjointClauseContext extends ObjectPropertyClauseContext {
		public DisjointWithPhraseContext disjointWithPhrase() {
			return getRuleContext(DisjointWithPhraseContext.class,0);
		}
		public PropExprListContext propExprList() {
			return getRuleContext(PropExprListContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ObjectPropDisjointClauseContext(ObjectPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectPropDisjointClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropRangeClauseContext extends ObjectPropertyClauseContext {
		public RangePhraseContext rangePhrase() {
			return getRuleContext(RangePhraseContext.class,0);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ObjectPropRangeClauseContext(ObjectPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectPropRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropDomainClauseContext extends ObjectPropertyClauseContext {
		public DomainPhraseContext domainPhrase() {
			return getRuleContext(DomainPhraseContext.class,0);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ObjectPropDomainClauseContext(ObjectPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectPropDomainClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropSubPropertyOfClauseContext extends ObjectPropertyClauseContext {
		public SubPropertyOfPhraseContext subPropertyOfPhrase() {
			return getRuleContext(SubPropertyOfPhraseContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ObjectPropSubPropertyOfClauseContext(ObjectPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectPropSubPropertyOfClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropEquivalentClauseContext extends ObjectPropertyClauseContext {
		public EquivalentToPhraseContext equivalentToPhrase() {
			return getRuleContext(EquivalentToPhraseContext.class,0);
		}
		public PropExprListContext propExprList() {
			return getRuleContext(PropExprListContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ObjectPropEquivalentClauseContext(ObjectPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectPropEquivalentClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropInverseFunctionContext extends ObjectPropertyClauseContext {
		public TerminalNode INVERSE_KW() { return getToken(OwlDslParser.INVERSE_KW, 0); }
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ObjectPropInverseFunctionContext(ObjectPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectPropInverseFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropCharacteristicsClauseContext extends ObjectPropertyClauseContext {
		public CharacteristicsPhraseContext characteristicsPhrase() {
			return getRuleContext(CharacteristicsPhraseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public CharacteristicListContext characteristicList() {
			return getRuleContext(CharacteristicListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public ObjectPropCharacteristicsClauseContext(ObjectPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectPropCharacteristicsClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropInverseClauseContext extends ObjectPropertyClauseContext {
		public InverseOfPhraseContext inverseOfPhrase() {
			return getRuleContext(InverseOfPhraseContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ObjectPropInverseClauseContext(ObjectPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectPropInverseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyClauseContext objectPropertyClause() throws RecognitionException {
		ObjectPropertyClauseContext _localctx = new ObjectPropertyClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_objectPropertyClause);
		int _la;
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new ObjectPropDomainClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				domainPhrase();
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(459);
					commentOpt();
					}
					break;
				}
				setState(462);
				classExpr();
				}
				break;
			case 2:
				_localctx = new ObjectPropRangeClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				rangePhrase();
				setState(466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(465);
					commentOpt();
					}
					break;
				}
				setState(468);
				classExpr();
				}
				break;
			case 3:
				_localctx = new ObjectPropCharacteristicsClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				characteristicsPhrase();
				setState(471);
				match(LPAREN);
				setState(472);
				characteristicList();
				setState(473);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ObjectPropSubPropertyOfClauseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				subPropertyOfPhrase();
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(476);
					commentOpt();
					}
				}

				setState(479);
				propExpr();
				}
				break;
			case 5:
				_localctx = new ObjectPropEquivalentClauseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(481);
				equivalentToPhrase();
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(482);
					commentOpt();
					}
				}

				setState(485);
				propExprList();
				}
				break;
			case 6:
				_localctx = new ObjectPropDisjointClauseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(487);
				disjointWithPhrase();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(488);
					commentOpt();
					}
				}

				setState(491);
				propExprList();
				}
				break;
			case 7:
				_localctx = new ObjectPropInverseClauseContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(493);
				inverseOfPhrase();
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(494);
					commentOpt();
					}
				}

				setState(497);
				propExpr();
				}
				break;
			case 8:
				_localctx = new ObjectPropInverseFunctionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(499);
				match(INVERSE_KW);
				setState(500);
				match(LPAREN);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(501);
					commentOpt();
					}
				}

				setState(504);
				propExpr();
				setState(505);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubPropertyOfPhraseContext extends ParserRuleContext {
		public TerminalNode SUBSET_EQ() { return getToken(OwlDslParser.SUBSET_EQ, 0); }
		public TerminalNode LE_SEQ() { return getToken(OwlDslParser.LE_SEQ, 0); }
		public TerminalNode SUBPROPERTY_KW() { return getToken(OwlDslParser.SUBPROPERTY_KW, 0); }
		public TerminalNode OF_KW() { return getToken(OwlDslParser.OF_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public SubPropertyOfPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subPropertyOfPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitSubPropertyOfPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubPropertyOfPhraseContext subPropertyOfPhrase() throws RecognitionException {
		SubPropertyOfPhraseContext _localctx = new SubPropertyOfPhraseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_subPropertyOfPhrase);
		int _la;
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBSET_EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(SUBSET_EQ);
				}
				break;
			case LE_SEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(LE_SEQ);
				}
				break;
			case IS_KW:
			case SUBPROPERTY_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS_KW) {
					{
					setState(511);
					match(IS_KW);
					}
				}

				setState(514);
				match(SUBPROPERTY_KW);
				setState(515);
				match(OF_KW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DomainPhraseContext extends ParserRuleContext {
		public HasContext has() {
			return getRuleContext(HasContext.class,0);
		}
		public TerminalNode DOMAIN_KW() { return getToken(OwlDslParser.DOMAIN_KW, 0); }
		public DomainPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDomainPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainPhraseContext domainPhrase() throws RecognitionException {
		DomainPhraseContext _localctx = new DomainPhraseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_domainPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			has();
			setState(519);
			match(DOMAIN_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangePhraseContext extends ParserRuleContext {
		public HasContext has() {
			return getRuleContext(HasContext.class,0);
		}
		public TerminalNode RANGE_KW() { return getToken(OwlDslParser.RANGE_KW, 0); }
		public RangePhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangePhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitRangePhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangePhraseContext rangePhrase() throws RecognitionException {
		RangePhraseContext _localctx = new RangePhraseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_rangePhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			has();
			setState(522);
			match(RANGE_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacteristicsPhraseContext extends ParserRuleContext {
		public HasContext has() {
			return getRuleContext(HasContext.class,0);
		}
		public TerminalNode CHARACTERISTICS_KW() { return getToken(OwlDslParser.CHARACTERISTICS_KW, 0); }
		public CharacteristicsPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characteristicsPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitCharacteristicsPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacteristicsPhraseContext characteristicsPhrase() throws RecognitionException {
		CharacteristicsPhraseContext _localctx = new CharacteristicsPhraseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_characteristicsPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			has();
			setState(525);
			match(CHARACTERISTICS_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InverseOfPhraseContext extends ParserRuleContext {
		public TerminalNode INVERSE_KW() { return getToken(OwlDslParser.INVERSE_KW, 0); }
		public TerminalNode OF_KW() { return getToken(OwlDslParser.OF_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public InverseOfPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inverseOfPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitInverseOfPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InverseOfPhraseContext inverseOfPhrase() throws RecognitionException {
		InverseOfPhraseContext _localctx = new InverseOfPhraseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_inverseOfPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS_KW) {
				{
				setState(527);
				match(IS_KW);
				}
			}

			setState(530);
			match(INVERSE_KW);
			setState(531);
			match(OF_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInversePropertyAxiomContext extends ParserRuleContext {
		public PropIdContext propId() {
			return getRuleContext(PropIdContext.class,0);
		}
		public TerminalNode OBJECT_KW() { return getToken(OwlDslParser.OBJECT_KW, 0); }
		public TerminalNode PROPERTY_KW() { return getToken(OwlDslParser.PROPERTY_KW, 0); }
		public InverseOfPhraseContext inverseOfPhrase() {
			return getRuleContext(InverseOfPhraseContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public TerminalNode INVERSE_KW() { return getToken(OwlDslParser.INVERSE_KW, 0); }
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(OwlDslParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(OwlDslParser.SEMICOLON, i);
		}
		public ObjectInversePropertyAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInversePropertyAxiom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectInversePropertyAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInversePropertyAxiomContext objectInversePropertyAxiom() throws RecognitionException {
		ObjectInversePropertyAxiomContext _localctx = new ObjectInversePropertyAxiomContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_objectInversePropertyAxiom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(533);
			match(OBJECT_KW);
			setState(534);
			match(PROPERTY_KW);
			}
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(536);
				commentOpt();
				}
			}

			setState(539);
			propId();
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(540);
				match(SEMICOLON);
				}
			}

			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(543);
				inverseOfPhrase();
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(544);
					commentOpt();
					}
				}

				setState(547);
				propExpr();
				}
				break;
			case 2:
				{
				setState(549);
				match(INVERSE_KW);
				setState(550);
				match(LPAREN);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(551);
					commentOpt();
					}
				}

				setState(554);
				propExpr();
				setState(555);
				match(RPAREN);
				}
				break;
			}
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(559);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataPropertyAxiomContext extends ParserRuleContext {
		public DataPropertyAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataPropertyAxiom; }
	 
		public DataPropertyAxiomContext() { }
		public void copyFrom(DataPropertyAxiomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataPropertyDomainRangeAltContext extends DataPropertyAxiomContext {
		public DataPropertyDomainRangeAxiomContext dataPropertyDomainRangeAxiom() {
			return getRuleContext(DataPropertyDomainRangeAxiomContext.class,0);
		}
		public DataPropertyDomainRangeAltContext(DataPropertyAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataPropertyDomainRangeAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataSubPropertyAltContext extends DataPropertyAxiomContext {
		public DataSubPropertyAxiomContext dataSubPropertyAxiom() {
			return getRuleContext(DataSubPropertyAxiomContext.class,0);
		}
		public DataSubPropertyAltContext(DataPropertyAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataSubPropertyAlt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataPropertyDeclContext extends DataPropertyAxiomContext {
		public PropIdContext propId() {
			return getRuleContext(PropIdContext.class,0);
		}
		public TerminalNode DATA_KW() { return getToken(OwlDslParser.DATA_KW, 0); }
		public TerminalNode PROPERTY_KW() { return getToken(OwlDslParser.PROPERTY_KW, 0); }
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public DataPropertyDeclContext(DataPropertyAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataPropertyDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataPropertyAxiomContext dataPropertyAxiom() throws RecognitionException {
		DataPropertyAxiomContext _localctx = new DataPropertyAxiomContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_dataPropertyAxiom);
		int _la;
		try {
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new DataPropertyDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(562);
				match(DATA_KW);
				setState(563);
				match(PROPERTY_KW);
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(565);
					commentOpt();
					}
				}

				setState(568);
				propId();
				}
				break;
			case 2:
				_localctx = new DataPropertyDomainRangeAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				dataPropertyDomainRangeAxiom();
				}
				break;
			case 3:
				_localctx = new DataSubPropertyAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				dataSubPropertyAxiom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataSubPropertyAxiomContext extends ParserRuleContext {
		public PropIdContext propId() {
			return getRuleContext(PropIdContext.class,0);
		}
		public SubPropertyOfPhraseContext subPropertyOfPhrase() {
			return getRuleContext(SubPropertyOfPhraseContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public TerminalNode DATA_KW() { return getToken(OwlDslParser.DATA_KW, 0); }
		public TerminalNode PROPERTY_KW() { return getToken(OwlDslParser.PROPERTY_KW, 0); }
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(OwlDslParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(OwlDslParser.SEMICOLON, i);
		}
		public DataSubPropertyAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSubPropertyAxiom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataSubPropertyAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSubPropertyAxiomContext dataSubPropertyAxiom() throws RecognitionException {
		DataSubPropertyAxiomContext _localctx = new DataSubPropertyAxiomContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dataSubPropertyAxiom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(573);
			match(DATA_KW);
			setState(574);
			match(PROPERTY_KW);
			}
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(576);
				commentOpt();
				}
			}

			setState(579);
			propId();
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(580);
				match(SEMICOLON);
				}
			}

			setState(583);
			subPropertyOfPhrase();
			setState(584);
			propExpr();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(585);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataPropertyDomainRangeAxiomContext extends ParserRuleContext {
		public PropIdContext propId() {
			return getRuleContext(PropIdContext.class,0);
		}
		public List<DataPropertyClauseContext> dataPropertyClause() {
			return getRuleContexts(DataPropertyClauseContext.class);
		}
		public DataPropertyClauseContext dataPropertyClause(int i) {
			return getRuleContext(DataPropertyClauseContext.class,i);
		}
		public TerminalNode DATA_KW() { return getToken(OwlDslParser.DATA_KW, 0); }
		public TerminalNode PROPERTY_KW() { return getToken(OwlDslParser.PROPERTY_KW, 0); }
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(OwlDslParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(OwlDslParser.SEMICOLON, i);
		}
		public DataPropertyDomainRangeAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataPropertyDomainRangeAxiom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataPropertyDomainRangeAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataPropertyDomainRangeAxiomContext dataPropertyDomainRangeAxiom() throws RecognitionException {
		DataPropertyDomainRangeAxiomContext _localctx = new DataPropertyDomainRangeAxiomContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dataPropertyDomainRangeAxiom);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(588);
			match(DATA_KW);
			setState(589);
			match(PROPERTY_KW);
			}
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(591);
				commentOpt();
				}
			}

			setState(594);
			propId();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(595);
				match(SEMICOLON);
				}
			}

			setState(598);
			dataPropertyClause();
			setState(605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(600);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(599);
						match(SEMICOLON);
						}
					}

					setState(602);
					dataPropertyClause();
					}
					} 
				}
				setState(607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(608);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataPropertyClauseContext extends ParserRuleContext {
		public DataPropertyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataPropertyClause; }
	 
		public DataPropertyClauseContext() { }
		public void copyFrom(DataPropertyClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataPropDomainClauseContext extends DataPropertyClauseContext {
		public DomainPhraseContext domainPhrase() {
			return getRuleContext(DomainPhraseContext.class,0);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public DataPropDomainClauseContext(DataPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataPropDomainClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataPropSubPropertyOfClauseContext extends DataPropertyClauseContext {
		public SubPropertyOfPhraseContext subPropertyOfPhrase() {
			return getRuleContext(SubPropertyOfPhraseContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public DataPropSubPropertyOfClauseContext(DataPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataPropSubPropertyOfClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataPropCharacteristicsClauseContext extends DataPropertyClauseContext {
		public CharacteristicsPhraseContext characteristicsPhrase() {
			return getRuleContext(CharacteristicsPhraseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public DataCharacteristicListContext dataCharacteristicList() {
			return getRuleContext(DataCharacteristicListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public DataPropCharacteristicsClauseContext(DataPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataPropCharacteristicsClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataPropDisjointClauseContext extends DataPropertyClauseContext {
		public DisjointWithPhraseContext disjointWithPhrase() {
			return getRuleContext(DisjointWithPhraseContext.class,0);
		}
		public PropExprListContext propExprList() {
			return getRuleContext(PropExprListContext.class,0);
		}
		public DataPropDisjointClauseContext(DataPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataPropDisjointClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataPropRangeClauseContext extends DataPropertyClauseContext {
		public RangePhraseContext rangePhrase() {
			return getRuleContext(RangePhraseContext.class,0);
		}
		public DataRangeExprContext dataRangeExpr() {
			return getRuleContext(DataRangeExprContext.class,0);
		}
		public DataPropRangeClauseContext(DataPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataPropRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataPropEquivalentClauseContext extends DataPropertyClauseContext {
		public EquivalentToPhraseContext equivalentToPhrase() {
			return getRuleContext(EquivalentToPhraseContext.class,0);
		}
		public PropExprListContext propExprList() {
			return getRuleContext(PropExprListContext.class,0);
		}
		public DataPropEquivalentClauseContext(DataPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataPropEquivalentClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataPropertyClauseContext dataPropertyClause() throws RecognitionException {
		DataPropertyClauseContext _localctx = new DataPropertyClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dataPropertyClause);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new DataPropDomainClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				domainPhrase();
				setState(612);
				classExpr();
				}
				break;
			case 2:
				_localctx = new DataPropRangeClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				rangePhrase();
				setState(615);
				dataRangeExpr();
				}
				break;
			case 3:
				_localctx = new DataPropCharacteristicsClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(617);
				characteristicsPhrase();
				setState(618);
				match(LPAREN);
				setState(619);
				dataCharacteristicList();
				setState(620);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new DataPropSubPropertyOfClauseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(622);
				subPropertyOfPhrase();
				setState(623);
				propExpr();
				}
				break;
			case 5:
				_localctx = new DataPropEquivalentClauseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(625);
				equivalentToPhrase();
				setState(626);
				propExprList();
				}
				break;
			case 6:
				_localctx = new DataPropDisjointClauseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(628);
				disjointWithPhrase();
				setState(629);
				propExprList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationPropertyAxiomContext extends ParserRuleContext {
		public AnnotationPropertyAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationPropertyAxiom; }
	 
		public AnnotationPropertyAxiomContext() { }
		public void copyFrom(AnnotationPropertyAxiomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationPropertyWithClausesContext extends AnnotationPropertyAxiomContext {
		public PropIdContext propId() {
			return getRuleContext(PropIdContext.class,0);
		}
		public List<AnnotationPropertyClauseContext> annotationPropertyClause() {
			return getRuleContexts(AnnotationPropertyClauseContext.class);
		}
		public AnnotationPropertyClauseContext annotationPropertyClause(int i) {
			return getRuleContext(AnnotationPropertyClauseContext.class,i);
		}
		public TerminalNode ANNOTATION_KW() { return getToken(OwlDslParser.ANNOTATION_KW, 0); }
		public TerminalNode PROPERTY_KW() { return getToken(OwlDslParser.PROPERTY_KW, 0); }
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(OwlDslParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(OwlDslParser.SEMICOLON, i);
		}
		public AnnotationPropertyWithClausesContext(AnnotationPropertyAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAnnotationPropertyWithClauses(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationPropertyDeclContext extends AnnotationPropertyAxiomContext {
		public PropIdContext propId() {
			return getRuleContext(PropIdContext.class,0);
		}
		public TerminalNode ANNOTATION_KW() { return getToken(OwlDslParser.ANNOTATION_KW, 0); }
		public TerminalNode PROPERTY_KW() { return getToken(OwlDslParser.PROPERTY_KW, 0); }
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public AnnotationPropertyDeclContext(AnnotationPropertyAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAnnotationPropertyDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationPropertyAxiomContext annotationPropertyAxiom() throws RecognitionException {
		AnnotationPropertyAxiomContext _localctx = new AnnotationPropertyAxiomContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_annotationPropertyAxiom);
		int _la;
		try {
			int _alt;
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new AnnotationPropertyWithClausesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(633);
				match(ANNOTATION_KW);
				setState(634);
				match(PROPERTY_KW);
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(636);
					commentOpt();
					}
				}

				setState(639);
				propId();
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(640);
					match(SEMICOLON);
					}
				}

				setState(643);
				annotationPropertyClause();
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(645);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SEMICOLON) {
							{
							setState(644);
							match(SEMICOLON);
							}
						}

						setState(647);
						annotationPropertyClause();
						}
						} 
					}
					setState(652);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(653);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				_localctx = new AnnotationPropertyDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(656);
				match(ANNOTATION_KW);
				setState(657);
				match(PROPERTY_KW);
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(659);
					commentOpt();
					}
				}

				setState(662);
				propId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationPropertyClauseContext extends ParserRuleContext {
		public AnnotationPropertyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationPropertyClause; }
	 
		public AnnotationPropertyClauseContext() { }
		public void copyFrom(AnnotationPropertyClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationPropSubPropertyOfClauseContext extends AnnotationPropertyClauseContext {
		public SubPropertyOfPhraseContext subPropertyOfPhrase() {
			return getRuleContext(SubPropertyOfPhraseContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public AnnotationPropSubPropertyOfClauseContext(AnnotationPropertyClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAnnotationPropSubPropertyOfClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationPropertyClauseContext annotationPropertyClause() throws RecognitionException {
		AnnotationPropertyClauseContext _localctx = new AnnotationPropertyClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_annotationPropertyClause);
		int _la;
		try {
			_localctx = new AnnotationPropSubPropertyOfClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			subPropertyOfPhrase();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(666);
				commentOpt();
				}
			}

			setState(669);
			propExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DatatypeAxiomContext extends ParserRuleContext {
		public TerminalNode DATATYPE_KW() { return getToken(OwlDslParser.DATATYPE_KW, 0); }
		public DatatypeIdContext datatypeId() {
			return getRuleContext(DatatypeIdContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public TerminalNode DATATYPE_DEFINITION_KW() { return getToken(OwlDslParser.DATATYPE_DEFINITION_KW, 0); }
		public DataRangeExprContext dataRangeExpr() {
			return getRuleContext(DataRangeExprContext.class,0);
		}
		public DatatypeAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatypeAxiom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDatatypeAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeAxiomContext datatypeAxiom() throws RecognitionException {
		DatatypeAxiomContext _localctx = new DatatypeAxiomContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_datatypeAxiom);
		int _la;
		try {
			setState(683);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATATYPE_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(DATATYPE_KW);
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(672);
					commentOpt();
					}
				}

				setState(675);
				datatypeId();
				}
				break;
			case DATATYPE_DEFINITION_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				match(DATATYPE_DEFINITION_KW);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(677);
					commentOpt();
					}
				}

				setState(680);
				datatypeId();
				setState(681);
				dataRangeExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubPropertyChainAxiomContext extends ParserRuleContext {
		public PropExprChainWithCommentsContext chain;
		public PropExprContext superProp;
		public SubPropertyChainPhraseContext subPropertyChainPhrase() {
			return getRuleContext(SubPropertyChainPhraseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public SubPropertyOfPhraseContext subPropertyOfPhrase() {
			return getRuleContext(SubPropertyOfPhraseContext.class,0);
		}
		public PropExprChainWithCommentsContext propExprChainWithComments() {
			return getRuleContext(PropExprChainWithCommentsContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(OwlDslParser.SEMICOLON, 0); }
		public SubPropertyChainAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subPropertyChainAxiom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitSubPropertyChainAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubPropertyChainAxiomContext subPropertyChainAxiom() throws RecognitionException {
		SubPropertyChainAxiomContext _localctx = new SubPropertyChainAxiomContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_subPropertyChainAxiom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			subPropertyChainPhrase();
			setState(686);
			match(LPAREN);
			setState(687);
			((SubPropertyChainAxiomContext)_localctx).chain = propExprChainWithComments();
			setState(688);
			match(RPAREN);
			setState(689);
			subPropertyOfPhrase();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(690);
				commentOpt();
				}
			}

			setState(693);
			((SubPropertyChainAxiomContext)_localctx).superProp = propExpr();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(694);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubPropertyChainPhraseContext extends ParserRuleContext {
		public TerminalNode SUBPROPERTY_KW() { return getToken(OwlDslParser.SUBPROPERTY_KW, 0); }
		public TerminalNode CHAIN_KW() { return getToken(OwlDslParser.CHAIN_KW, 0); }
		public SubPropertyChainPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subPropertyChainPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitSubPropertyChainPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubPropertyChainPhraseContext subPropertyChainPhrase() throws RecognitionException {
		SubPropertyChainPhraseContext _localctx = new SubPropertyChainPhraseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_subPropertyChainPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(SUBPROPERTY_KW);
			setState(698);
			match(CHAIN_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndividualAxiomContext extends ParserRuleContext {
		public IndividualAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individualAxiom; }
	 
		public IndividualAxiomContext() { }
		public void copyFrom(IndividualAxiomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndividualBareDeclContext extends IndividualAxiomContext {
		public TerminalNode INDIVIDUAL_KW() { return getToken(OwlDslParser.INDIVIDUAL_KW, 0); }
		public IndividualIdContext individualId() {
			return getRuleContext(IndividualIdContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(OwlDslParser.SEMICOLON, 0); }
		public IndividualBareDeclContext(IndividualAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitIndividualBareDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndividualWithBodyContext extends IndividualAxiomContext {
		public TerminalNode INDIVIDUAL_KW() { return getToken(OwlDslParser.INDIVIDUAL_KW, 0); }
		public IndividualIdContext individualId() {
			return getRuleContext(IndividualIdContext.class,0);
		}
		public IndividualAxiomBodyContext individualAxiomBody() {
			return getRuleContext(IndividualAxiomBodyContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(OwlDslParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(OwlDslParser.SEMICOLON, i);
		}
		public IndividualWithBodyContext(IndividualAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitIndividualWithBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndividualAxiomContext individualAxiom() throws RecognitionException {
		IndividualAxiomContext _localctx = new IndividualAxiomContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_individualAxiom);
		int _la;
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new IndividualWithBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				match(INDIVIDUAL_KW);
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(701);
					commentOpt();
					}
				}

				setState(704);
				individualId();
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(705);
					match(SEMICOLON);
					}
				}

				setState(708);
				individualAxiomBody();
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(709);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				_localctx = new IndividualBareDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				match(INDIVIDUAL_KW);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(713);
					commentOpt();
					}
				}

				setState(716);
				individualId();
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(717);
					match(SEMICOLON);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndividualAxiomBodyContext extends ParserRuleContext {
		public TypeBodyContext typeBody() {
			return getRuleContext(TypeBodyContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(OwlDslParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(OwlDslParser.SEMICOLON, i);
		}
		public List<PropAssertionListContext> propAssertionList() {
			return getRuleContexts(PropAssertionListContext.class);
		}
		public PropAssertionListContext propAssertionList(int i) {
			return getRuleContext(PropAssertionListContext.class,i);
		}
		public List<SameOrDifferentBodyContext> sameOrDifferentBody() {
			return getRuleContexts(SameOrDifferentBodyContext.class);
		}
		public SameOrDifferentBodyContext sameOrDifferentBody(int i) {
			return getRuleContext(SameOrDifferentBodyContext.class,i);
		}
		public IndividualAxiomBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individualAxiomBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitIndividualAxiomBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndividualAxiomBodyContext individualAxiomBody() throws RecognitionException {
		IndividualAxiomBodyContext _localctx = new IndividualAxiomBodyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_individualAxiomBody);
		try {
			int _alt;
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				typeBody();
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(723);
						match(SEMICOLON);
						setState(724);
						propAssertionList();
						}
						} 
					}
					setState(729);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(730);
						match(SEMICOLON);
						setState(731);
						sameOrDifferentBody();
						}
						} 
					}
					setState(736);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				propAssertionList();
				setState(742);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(738);
						match(SEMICOLON);
						setState(739);
						propAssertionList();
						}
						} 
					}
					setState(744);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				setState(749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(745);
						match(SEMICOLON);
						setState(746);
						sameOrDifferentBody();
						}
						} 
					}
					setState(751);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(752);
				sameOrDifferentBody();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeBodyContext extends ParserRuleContext {
		public TypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBody; }
	 
		public TypeBodyContext() { }
		public void copyFrom(TypeBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAssertionBodyContext extends TypeBodyContext {
		public TerminalNode TYPE_KW() { return getToken(OwlDslParser.TYPE_KW, 0); }
		public ClassExprListContext classExprList() {
			return getRuleContext(ClassExprListContext.class,0);
		}
		public TypeAssertionBodyContext(TypeBodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitTypeAssertionBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAssertionBodySugarContext extends TypeBodyContext {
		public IsAPhraseContext isAPhrase() {
			return getRuleContext(IsAPhraseContext.class,0);
		}
		public ClassExprListContext classExprList() {
			return getRuleContext(ClassExprListContext.class,0);
		}
		public TypeAssertionBodySugarContext(TypeBodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitTypeAssertionBodySugar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBodyContext typeBody() throws RecognitionException {
		TypeBodyContext _localctx = new TypeBodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeBody);
		try {
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_KW:
				_localctx = new TypeAssertionBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				match(TYPE_KW);
				setState(756);
				classExprList();
				}
				break;
			case IS_KW:
				_localctx = new TypeAssertionBodySugarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				isAPhrase();
				setState(758);
				classExprList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsAPhraseContext extends ParserRuleContext {
		public IsAContext isA() {
			return getRuleContext(IsAContext.class,0);
		}
		public IsAPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isAPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitIsAPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsAPhraseContext isAPhrase() throws RecognitionException {
		IsAPhraseContext _localctx = new IsAPhraseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_isAPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			isA();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SameOrDifferentBodyContext extends ParserRuleContext {
		public SameOrDifferentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sameOrDifferentBody; }
	 
		public SameOrDifferentBodyContext() { }
		public void copyFrom(SameOrDifferentBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SameAsBodyContext extends SameOrDifferentBodyContext {
		public SameAsPhraseContext sameAsPhrase() {
			return getRuleContext(SameAsPhraseContext.class,0);
		}
		public IndividualListContext individualList() {
			return getRuleContext(IndividualListContext.class,0);
		}
		public SameAsBodyContext(SameOrDifferentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitSameAsBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DifferentFromBodyContext extends SameOrDifferentBodyContext {
		public DifferentFromPhraseContext differentFromPhrase() {
			return getRuleContext(DifferentFromPhraseContext.class,0);
		}
		public IndividualListContext individualList() {
			return getRuleContext(IndividualListContext.class,0);
		}
		public DifferentFromBodyContext(SameOrDifferentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDifferentFromBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SameOrDifferentBodyContext sameOrDifferentBody() throws RecognitionException {
		SameOrDifferentBodyContext _localctx = new SameOrDifferentBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_sameOrDifferentBody);
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new SameAsBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				sameAsPhrase();
				setState(765);
				individualList();
				}
				break;
			case 2:
				_localctx = new DifferentFromBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				differentFromPhrase();
				setState(768);
				individualList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SameAsPhraseContext extends ParserRuleContext {
		public TerminalNode SAME_KW() { return getToken(OwlDslParser.SAME_KW, 0); }
		public TerminalNode AS_KW() { return getToken(OwlDslParser.AS_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public SameAsPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sameAsPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitSameAsPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SameAsPhraseContext sameAsPhrase() throws RecognitionException {
		SameAsPhraseContext _localctx = new SameAsPhraseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_sameAsPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS_KW) {
				{
				setState(772);
				match(IS_KW);
				}
			}

			setState(775);
			match(SAME_KW);
			setState(776);
			match(AS_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DifferentFromPhraseContext extends ParserRuleContext {
		public TerminalNode DIFFERENT_KW() { return getToken(OwlDslParser.DIFFERENT_KW, 0); }
		public TerminalNode FROM_KW() { return getToken(OwlDslParser.FROM_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public DifferentFromPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_differentFromPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDifferentFromPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DifferentFromPhraseContext differentFromPhrase() throws RecognitionException {
		DifferentFromPhraseContext _localctx = new DifferentFromPhraseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_differentFromPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS_KW) {
				{
				setState(778);
				match(IS_KW);
				}
			}

			setState(781);
			match(DIFFERENT_KW);
			setState(782);
			match(FROM_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropAssertionListContext extends ParserRuleContext {
		public List<PropAssertionContext> propAssertion() {
			return getRuleContexts(PropAssertionContext.class);
		}
		public PropAssertionContext propAssertion(int i) {
			return getRuleContext(PropAssertionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OwlDslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OwlDslParser.COMMA, i);
		}
		public PropAssertionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propAssertionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitPropAssertionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropAssertionListContext propAssertionList() throws RecognitionException {
		PropAssertionListContext _localctx = new PropAssertionListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_propAssertionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			propAssertion();
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(785);
				match(COMMA);
				setState(786);
				propAssertion();
				}
				}
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropAssertionContext extends ParserRuleContext {
		public PropAssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propAssertion; }
	 
		public PropAssertionContext() { }
		public void copyFrom(PropAssertionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegativeDataPropertyAssertionContext extends PropAssertionContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NOT_KW() { return getToken(OwlDslParser.NOT_KW, 0); }
		public TerminalNode NOT_SYM() { return getToken(OwlDslParser.NOT_SYM, 0); }
		public NegativeDataPropertyAssertionContext(PropAssertionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitNegativeDataPropertyAssertion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataPropertyAssertionContext extends PropAssertionContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public DataPropertyAssertionContext(PropAssertionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataPropertyAssertion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyAssertionContext extends PropAssertionContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public EntityUsageContext entityUsage() {
			return getRuleContext(EntityUsageContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ObjectPropertyAssertionContext(PropAssertionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectPropertyAssertion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegativeObjectPropertyAssertionContext extends PropAssertionContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public EntityUsageContext entityUsage() {
			return getRuleContext(EntityUsageContext.class,0);
		}
		public TerminalNode NOT_KW() { return getToken(OwlDslParser.NOT_KW, 0); }
		public TerminalNode NOT_SYM() { return getToken(OwlDslParser.NOT_SYM, 0); }
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public NegativeObjectPropertyAssertionContext(PropAssertionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitNegativeObjectPropertyAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropAssertionContext propAssertion() throws RecognitionException {
		PropAssertionContext _localctx = new PropAssertionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_propAssertion);
		int _la;
		try {
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				_localctx = new ObjectPropertyAssertionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(792);
					commentOpt();
					}
				}

				setState(795);
				propExpr();
				setState(796);
				entityUsage();
				}
				break;
			case 2:
				_localctx = new DataPropertyAssertionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				propExpr();
				setState(799);
				literal();
				}
				break;
			case 3:
				_localctx = new NegativeObjectPropertyAssertionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(801);
				_la = _input.LA(1);
				if ( !(_la==NOT_KW || _la==NOT_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(802);
					commentOpt();
					}
				}

				setState(805);
				propExpr();
				setState(806);
				entityUsage();
				}
				break;
			case 4:
				_localctx = new NegativeDataPropertyAssertionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(808);
				_la = _input.LA(1);
				if ( !(_la==NOT_KW || _la==NOT_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(809);
				propExpr();
				setState(810);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassExprListContext extends ParserRuleContext {
		public List<ClassExprContext> classExpr() {
			return getRuleContexts(ClassExprContext.class);
		}
		public ClassExprContext classExpr(int i) {
			return getRuleContext(ClassExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OwlDslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OwlDslParser.COMMA, i);
		}
		public ClassExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitClassExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassExprListContext classExprList() throws RecognitionException {
		ClassExprListContext _localctx = new ClassExprListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_classExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			classExpr();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(815);
				match(COMMA);
				setState(816);
				classExpr();
				}
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassExprNaryListContext extends ParserRuleContext {
		public List<ClassExprContext> classExpr() {
			return getRuleContexts(ClassExprContext.class);
		}
		public ClassExprContext classExpr(int i) {
			return getRuleContext(ClassExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OwlDslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OwlDslParser.COMMA, i);
		}
		public List<TerminalNode> AND_KW() { return getTokens(OwlDslParser.AND_KW); }
		public TerminalNode AND_KW(int i) {
			return getToken(OwlDslParser.AND_KW, i);
		}
		public ClassExprNaryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExprNaryList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitClassExprNaryList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassExprNaryListContext classExprNaryList() throws RecognitionException {
		ClassExprNaryListContext _localctx = new ClassExprNaryListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_classExprNaryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			classExpr();
			setState(835);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				{
				setState(825); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(823);
					match(COMMA);
					setState(824);
					classExpr();
					}
					}
					setState(827); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case AND_KW:
				{
				setState(831); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(829);
					match(AND_KW);
					setState(830);
					classExpr();
					}
					}
					setState(833); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AND_KW );
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassExprContext extends ParserRuleContext {
		public BoolClassExprContext boolClassExpr() {
			return getRuleContext(BoolClassExprContext.class,0);
		}
		public ClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassExprContext classExpr() throws RecognitionException {
		ClassExprContext _localctx = new ClassExprContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_classExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			boolClassExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolClassExprContext extends ParserRuleContext {
		public List<PrimaryClassExprContext> primaryClassExpr() {
			return getRuleContexts(PrimaryClassExprContext.class);
		}
		public PrimaryClassExprContext primaryClassExpr(int i) {
			return getRuleContext(PrimaryClassExprContext.class,i);
		}
		public List<BinaryBoolOpContext> binaryBoolOp() {
			return getRuleContexts(BinaryBoolOpContext.class);
		}
		public BinaryBoolOpContext binaryBoolOp(int i) {
			return getRuleContext(BinaryBoolOpContext.class,i);
		}
		public BoolClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolClassExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitBoolClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolClassExprContext boolClassExpr() throws RecognitionException {
		BoolClassExprContext _localctx = new BoolClassExprContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_boolClassExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			primaryClassExpr();
			setState(845);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(840);
					binaryBoolOp();
					setState(841);
					primaryClassExpr();
					}
					} 
				}
				setState(847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryClassExprContext extends ParserRuleContext {
		public AtomicClassExprContext atomicClassExpr() {
			return getRuleContext(AtomicClassExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public PrimaryClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryClassExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitPrimaryClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryClassExprContext primaryClassExpr() throws RecognitionException {
		PrimaryClassExprContext _localctx = new PrimaryClassExprContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_primaryClassExpr);
		try {
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTELLIJ_DUMMY:
			case CURIE:
			case CURIE_EMPTY:
			case IRI:
			case STRING3:
			case STRING:
			case INTEGER:
			case DECIMAL:
			case DOUBLE:
			case IS_KW:
			case HAS_KW:
			case INVERSE_KW:
			case NOT_KW:
			case THING_KW:
			case NOTHING_KW:
			case SOME_KW:
			case ONLY_KW:
			case VALUE_KW:
			case MIN_KW:
			case MAX_KW:
			case EXACTLY_KW:
			case THAT_KW:
			case AT_KW:
			case ONE_KW:
			case ALL_KW:
			case ANY_KW:
			case TRUE_KW:
			case FALSE_KW:
			case NOT_SYM:
			case SOME_SYM:
			case ONLY_SYM:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				atomicClassExpr();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				match(LPAREN);
				setState(850);
				classExpr();
				setState(851);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicClassExprContext extends ParserRuleContext {
		public AtomicClassExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicClassExpr; }
	 
		public AtomicClassExprContext() { }
		public void copyFrom(AtomicClassExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectHasValueExprContext extends AtomicClassExprContext {
		public HasContext has() {
			return getRuleContext(HasContext.class,0);
		}
		public TerminalNode VALUE_KW() { return getToken(OwlDslParser.VALUE_KW, 0); }
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public EntityUsageContext entityUsage() {
			return getRuleContext(EntityUsageContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ObjectHasValueExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectHasValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExactCardinalityExpr_MContext extends AtomicClassExprContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public TerminalNode EXACTLY_KW() { return getToken(OwlDslParser.EXACTLY_KW, 0); }
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public TerminalNode THAT_KW() { return getToken(OwlDslParser.THAT_KW, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public ExactCardinalityExpr_MContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitExactCardinalityExpr_M(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataHasValueExpr_MContext extends AtomicClassExprContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public HasContext has() {
			return getRuleContext(HasContext.class,0);
		}
		public TerminalNode VALUE_KW() { return getToken(OwlDslParser.VALUE_KW, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THAT_KW() { return getToken(OwlDslParser.THAT_KW, 0); }
		public DataHasValueExpr_MContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataHasValueExpr_M(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnionExprContext extends AtomicClassExprContext {
		public AnyOfPhraseContext anyOfPhrase() {
			return getRuleContext(AnyOfPhraseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public ClassExprNaryListContext classExprNaryList() {
			return getRuleContext(ClassExprNaryListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public UnionExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitUnionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedClassWithThatExprContext extends AtomicClassExprContext {
		public EntityUsageContext entityUsage() {
			return getRuleContext(EntityUsageContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public List<ThatRestrictionContext> thatRestriction() {
			return getRuleContexts(ThatRestrictionContext.class);
		}
		public ThatRestrictionContext thatRestriction(int i) {
			return getRuleContext(ThatRestrictionContext.class,i);
		}
		public NamedClassWithThatExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitNamedClassWithThatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectHasValueExpr_MContext extends AtomicClassExprContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public HasContext has() {
			return getRuleContext(HasContext.class,0);
		}
		public TerminalNode VALUE_KW() { return getToken(OwlDslParser.VALUE_KW, 0); }
		public EntityUsageContext entityUsage() {
			return getRuleContext(EntityUsageContext.class,0);
		}
		public TerminalNode THAT_KW() { return getToken(OwlDslParser.THAT_KW, 0); }
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ObjectHasValueExpr_MContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectHasValueExpr_M(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinCardinalityFriendlyContext extends AtomicClassExprContext {
		public AtLeastPhraseContext atLeastPhrase() {
			return getRuleContext(AtLeastPhraseContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public MinCardinalityFriendlyContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitMinCardinalityFriendly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinCardinalityFriendly_MContext extends AtomicClassExprContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public AtLeastPhraseContext atLeastPhrase() {
			return getRuleContext(AtLeastPhraseContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public TerminalNode THAT_KW() { return getToken(OwlDslParser.THAT_KW, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public MinCardinalityFriendly_MContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitMinCardinalityFriendly_M(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxCardinalityFriendlyContext extends AtomicClassExprContext {
		public AtMostPhraseContext atMostPhrase() {
			return getRuleContext(AtMostPhraseContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public MaxCardinalityFriendlyContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitMaxCardinalityFriendly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllValuesFromExprContext extends AtomicClassExprContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public TerminalNode ONLY_KW() { return getToken(OwlDslParser.ONLY_KW, 0); }
		public TerminalNode ONLY_SYM() { return getToken(OwlDslParser.ONLY_SYM, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public AllValuesFromExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAllValuesFromExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllValuesFromExpr_MContext extends AtomicClassExprContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public TerminalNode ONLY_KW() { return getToken(OwlDslParser.ONLY_KW, 0); }
		public TerminalNode ONLY_SYM() { return getToken(OwlDslParser.ONLY_SYM, 0); }
		public TerminalNode THAT_KW() { return getToken(OwlDslParser.THAT_KW, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public AllValuesFromExpr_MContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAllValuesFromExpr_M(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntersectionExprContext extends AtomicClassExprContext {
		public AllOfPhraseContext allOfPhrase() {
			return getRuleContext(AllOfPhraseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public ClassExprNaryListContext classExprNaryList() {
			return getRuleContext(ClassExprNaryListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public IntersectionExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitIntersectionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataHasValueExprContext extends AtomicClassExprContext {
		public HasContext has() {
			return getRuleContext(HasContext.class,0);
		}
		public TerminalNode VALUE_KW() { return getToken(OwlDslParser.VALUE_KW, 0); }
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public DataHasValueExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataHasValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BottomClassExprContext extends AtomicClassExprContext {
		public TerminalNode NOTHING_KW() { return getToken(OwlDslParser.NOTHING_KW, 0); }
		public BottomClassExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitBottomClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinCardinalityExpr_MContext extends AtomicClassExprContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public TerminalNode MIN_KW() { return getToken(OwlDslParser.MIN_KW, 0); }
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public TerminalNode THAT_KW() { return getToken(OwlDslParser.THAT_KW, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public MinCardinalityExpr_MContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitMinCardinalityExpr_M(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SomeValuesFromExpr_MContext extends AtomicClassExprContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public TerminalNode SOME_KW() { return getToken(OwlDslParser.SOME_KW, 0); }
		public TerminalNode SOME_SYM() { return getToken(OwlDslParser.SOME_SYM, 0); }
		public TerminalNode THAT_KW() { return getToken(OwlDslParser.THAT_KW, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public SomeValuesFromExpr_MContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitSomeValuesFromExpr_M(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedClassExprContext extends AtomicClassExprContext {
		public EntityUsageContext entityUsage() {
			return getRuleContext(EntityUsageContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public NamedClassExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitNamedClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SomeValuesFromExprContext extends AtomicClassExprContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public TerminalNode SOME_KW() { return getToken(OwlDslParser.SOME_KW, 0); }
		public TerminalNode SOME_SYM() { return getToken(OwlDslParser.SOME_SYM, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public SomeValuesFromExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitSomeValuesFromExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxCardinalityExpr_MContext extends AtomicClassExprContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public TerminalNode MAX_KW() { return getToken(OwlDslParser.MAX_KW, 0); }
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public TerminalNode THAT_KW() { return getToken(OwlDslParser.THAT_KW, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public MaxCardinalityExpr_MContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitMaxCardinalityExpr_M(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinCardinalityExprContext extends AtomicClassExprContext {
		public TerminalNode MIN_KW() { return getToken(OwlDslParser.MIN_KW, 0); }
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public MinCardinalityExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitMinCardinalityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExactCardinalityExprContext extends AtomicClassExprContext {
		public TerminalNode EXACTLY_KW() { return getToken(OwlDslParser.EXACTLY_KW, 0); }
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public ExactCardinalityExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitExactCardinalityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxCardinalityFriendly_MContext extends AtomicClassExprContext {
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public AtMostPhraseContext atMostPhrase() {
			return getRuleContext(AtMostPhraseContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public TerminalNode THAT_KW() { return getToken(OwlDslParser.THAT_KW, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public MaxCardinalityFriendly_MContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitMaxCardinalityFriendly_M(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TopClassExprContext extends AtomicClassExprContext {
		public TerminalNode THING_KW() { return getToken(OwlDslParser.THING_KW, 0); }
		public TopClassExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitTopClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplementClassExprContext extends AtomicClassExprContext {
		public PrimaryClassExprContext primaryClassExpr() {
			return getRuleContext(PrimaryClassExprContext.class,0);
		}
		public TerminalNode NOT_KW() { return getToken(OwlDslParser.NOT_KW, 0); }
		public TerminalNode NOT_SYM() { return getToken(OwlDslParser.NOT_SYM, 0); }
		public ComplementClassExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitComplementClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxCardinalityExprContext extends AtomicClassExprContext {
		public TerminalNode MAX_KW() { return getToken(OwlDslParser.MAX_KW, 0); }
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public MaxCardinalityExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitMaxCardinalityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectOneOfExprContext extends AtomicClassExprContext {
		public OneOfPhraseContext oneOfPhrase() {
			return getRuleContext(OneOfPhraseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public IndividualListContext individualList() {
			return getRuleContext(IndividualListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public ObjectOneOfExprContext(AtomicClassExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitObjectOneOfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicClassExprContext atomicClassExpr() throws RecognitionException {
		AtomicClassExprContext _localctx = new AtomicClassExprContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_atomicClassExpr);
		int _la;
		try {
			int _alt;
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				_localctx = new NamedClassWithThatExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(855);
					commentOpt();
					}
				}

				setState(858);
				entityUsage();
				setState(860); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(859);
						thatRestriction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(862); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new NamedClassExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(864);
					commentOpt();
					}
				}

				setState(867);
				entityUsage();
				}
				break;
			case 3:
				_localctx = new TopClassExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(868);
				match(THING_KW);
				}
				break;
			case 4:
				_localctx = new BottomClassExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(869);
				match(NOTHING_KW);
				}
				break;
			case 5:
				_localctx = new ComplementClassExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(870);
				_la = _input.LA(1);
				if ( !(_la==NOT_KW || _la==NOT_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(871);
				primaryClassExpr();
				}
				break;
			case 6:
				_localctx = new SomeValuesFromExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(872);
				_la = _input.LA(1);
				if ( !(_la==SOME_KW || _la==SOME_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(873);
					commentOpt();
					}
				}

				setState(876);
				propExpr();
				setState(878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(877);
					commentOpt();
					}
					break;
				}
				setState(880);
				classExpr();
				}
				break;
			case 7:
				_localctx = new AllValuesFromExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(882);
				_la = _input.LA(1);
				if ( !(_la==ONLY_KW || _la==ONLY_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(883);
					commentOpt();
					}
				}

				setState(886);
				propExpr();
				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(887);
					commentOpt();
					}
					break;
				}
				setState(890);
				classExpr();
				}
				break;
			case 8:
				_localctx = new ObjectHasValueExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(892);
				has();
				setState(893);
				match(VALUE_KW);
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(894);
					commentOpt();
					}
				}

				setState(897);
				propExpr();
				setState(898);
				entityUsage();
				}
				break;
			case 9:
				_localctx = new DataHasValueExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(900);
				has();
				setState(901);
				match(VALUE_KW);
				setState(902);
				propExpr();
				setState(903);
				literal();
				}
				break;
			case 10:
				_localctx = new MinCardinalityExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(905);
				match(MIN_KW);
				setState(906);
				match(INTEGER);
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(907);
					commentOpt();
					}
				}

				setState(910);
				propExpr();
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(912);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						setState(911);
						commentOpt();
						}
						break;
					}
					setState(914);
					classExpr();
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new MaxCardinalityExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(917);
				match(MAX_KW);
				setState(918);
				match(INTEGER);
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(919);
					commentOpt();
					}
				}

				setState(922);
				propExpr();
				setState(927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(924);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						setState(923);
						commentOpt();
						}
						break;
					}
					setState(926);
					classExpr();
					}
					break;
				}
				}
				break;
			case 12:
				_localctx = new ExactCardinalityExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(929);
				match(EXACTLY_KW);
				setState(930);
				match(INTEGER);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(931);
					commentOpt();
					}
				}

				setState(934);
				propExpr();
				setState(939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(936);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						setState(935);
						commentOpt();
						}
						break;
					}
					setState(938);
					classExpr();
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new SomeValuesFromExpr_MContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(941);
					match(THAT_KW);
					}
				}

				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(944);
					commentOpt();
					}
				}

				setState(947);
				propExpr();
				setState(948);
				_la = _input.LA(1);
				if ( !(_la==SOME_KW || _la==SOME_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(950);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(949);
					commentOpt();
					}
					break;
				}
				setState(952);
				classExpr();
				}
				break;
			case 14:
				_localctx = new AllValuesFromExpr_MContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(954);
					match(THAT_KW);
					}
				}

				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(957);
					commentOpt();
					}
				}

				setState(960);
				propExpr();
				setState(961);
				_la = _input.LA(1);
				if ( !(_la==ONLY_KW || _la==ONLY_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(963);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(962);
					commentOpt();
					}
					break;
				}
				setState(965);
				classExpr();
				}
				break;
			case 15:
				_localctx = new ObjectHasValueExpr_MContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(967);
					match(THAT_KW);
					}
				}

				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(970);
					commentOpt();
					}
				}

				setState(973);
				propExpr();
				setState(974);
				has();
				setState(975);
				match(VALUE_KW);
				setState(976);
				entityUsage();
				}
				break;
			case 16:
				_localctx = new DataHasValueExpr_MContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(978);
					match(THAT_KW);
					}
				}

				setState(981);
				propExpr();
				setState(982);
				has();
				setState(983);
				match(VALUE_KW);
				setState(984);
				literal();
				}
				break;
			case 17:
				_localctx = new MinCardinalityExpr_MContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(986);
					match(THAT_KW);
					}
				}

				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(989);
					commentOpt();
					}
				}

				setState(992);
				propExpr();
				setState(993);
				match(MIN_KW);
				setState(994);
				match(INTEGER);
				setState(999);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(996);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						setState(995);
						commentOpt();
						}
						break;
					}
					setState(998);
					classExpr();
					}
					break;
				}
				}
				break;
			case 18:
				_localctx = new MaxCardinalityExpr_MContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(1001);
					match(THAT_KW);
					}
				}

				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1004);
					commentOpt();
					}
				}

				setState(1007);
				propExpr();
				setState(1008);
				match(MAX_KW);
				setState(1009);
				match(INTEGER);
				setState(1014);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1011);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
					case 1:
						{
						setState(1010);
						commentOpt();
						}
						break;
					}
					setState(1013);
					classExpr();
					}
					break;
				}
				}
				break;
			case 19:
				_localctx = new ExactCardinalityExpr_MContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(1016);
					match(THAT_KW);
					}
				}

				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1019);
					commentOpt();
					}
				}

				setState(1022);
				propExpr();
				setState(1023);
				match(EXACTLY_KW);
				setState(1024);
				match(INTEGER);
				setState(1029);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1026);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
					case 1:
						{
						setState(1025);
						commentOpt();
						}
						break;
					}
					setState(1028);
					classExpr();
					}
					break;
				}
				}
				break;
			case 20:
				_localctx = new MinCardinalityFriendlyContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1031);
				atLeastPhrase();
				setState(1032);
				match(INTEGER);
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1033);
					commentOpt();
					}
				}

				setState(1036);
				propExpr();
				setState(1041);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1038);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
					case 1:
						{
						setState(1037);
						commentOpt();
						}
						break;
					}
					setState(1040);
					classExpr();
					}
					break;
				}
				}
				break;
			case 21:
				_localctx = new MaxCardinalityFriendlyContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(1043);
				atMostPhrase();
				setState(1044);
				match(INTEGER);
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1045);
					commentOpt();
					}
				}

				setState(1048);
				propExpr();
				setState(1053);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1050);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
					case 1:
						{
						setState(1049);
						commentOpt();
						}
						break;
					}
					setState(1052);
					classExpr();
					}
					break;
				}
				}
				break;
			case 22:
				_localctx = new MinCardinalityFriendly_MContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(1055);
					match(THAT_KW);
					}
				}

				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1058);
					commentOpt();
					}
				}

				setState(1061);
				propExpr();
				setState(1062);
				atLeastPhrase();
				setState(1063);
				match(INTEGER);
				setState(1068);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1065);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
					case 1:
						{
						setState(1064);
						commentOpt();
						}
						break;
					}
					setState(1067);
					classExpr();
					}
					break;
				}
				}
				break;
			case 23:
				_localctx = new MaxCardinalityFriendly_MContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(1070);
					match(THAT_KW);
					}
				}

				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1073);
					commentOpt();
					}
				}

				setState(1076);
				propExpr();
				setState(1077);
				atMostPhrase();
				setState(1078);
				match(INTEGER);
				setState(1083);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1080);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
					case 1:
						{
						setState(1079);
						commentOpt();
						}
						break;
					}
					setState(1082);
					classExpr();
					}
					break;
				}
				}
				break;
			case 24:
				_localctx = new ObjectOneOfExprContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(1085);
				oneOfPhrase();
				setState(1086);
				match(LPAREN);
				setState(1087);
				individualList();
				setState(1088);
				match(RPAREN);
				}
				break;
			case 25:
				_localctx = new IntersectionExprContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(1090);
				allOfPhrase();
				setState(1091);
				match(LPAREN);
				setState(1092);
				classExprNaryList();
				setState(1093);
				match(RPAREN);
				}
				break;
			case 26:
				_localctx = new UnionExprContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(1095);
				anyOfPhrase();
				setState(1096);
				match(LPAREN);
				setState(1097);
				classExprNaryList();
				setState(1098);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtLeastPhraseContext extends ParserRuleContext {
		public TerminalNode AT_KW() { return getToken(OwlDslParser.AT_KW, 0); }
		public TerminalNode LEAST_KW() { return getToken(OwlDslParser.LEAST_KW, 0); }
		public AtLeastPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atLeastPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAtLeastPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtLeastPhraseContext atLeastPhrase() throws RecognitionException {
		AtLeastPhraseContext _localctx = new AtLeastPhraseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_atLeastPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			match(AT_KW);
			setState(1103);
			match(LEAST_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtMostPhraseContext extends ParserRuleContext {
		public TerminalNode AT_KW() { return getToken(OwlDslParser.AT_KW, 0); }
		public TerminalNode MOST_KW() { return getToken(OwlDslParser.MOST_KW, 0); }
		public AtMostPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atMostPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAtMostPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtMostPhraseContext atMostPhrase() throws RecognitionException {
		AtMostPhraseContext _localctx = new AtMostPhraseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_atMostPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(AT_KW);
			setState(1106);
			match(MOST_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OneOfPhraseContext extends ParserRuleContext {
		public TerminalNode ONE_KW() { return getToken(OwlDslParser.ONE_KW, 0); }
		public TerminalNode OF_KW() { return getToken(OwlDslParser.OF_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public OneOfPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneOfPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitOneOfPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneOfPhraseContext oneOfPhrase() throws RecognitionException {
		OneOfPhraseContext _localctx = new OneOfPhraseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_oneOfPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS_KW) {
				{
				setState(1108);
				match(IS_KW);
				}
			}

			setState(1111);
			match(ONE_KW);
			setState(1112);
			match(OF_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllOfPhraseContext extends ParserRuleContext {
		public TerminalNode ALL_KW() { return getToken(OwlDslParser.ALL_KW, 0); }
		public TerminalNode OF_KW() { return getToken(OwlDslParser.OF_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public AllOfPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allOfPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAllOfPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllOfPhraseContext allOfPhrase() throws RecognitionException {
		AllOfPhraseContext _localctx = new AllOfPhraseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_allOfPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS_KW) {
				{
				setState(1114);
				match(IS_KW);
				}
			}

			setState(1117);
			match(ALL_KW);
			setState(1118);
			match(OF_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnyOfPhraseContext extends ParserRuleContext {
		public TerminalNode ANY_KW() { return getToken(OwlDslParser.ANY_KW, 0); }
		public TerminalNode OF_KW() { return getToken(OwlDslParser.OF_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public AnyOfPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyOfPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAnyOfPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyOfPhraseContext anyOfPhrase() throws RecognitionException {
		AnyOfPhraseContext _localctx = new AnyOfPhraseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_anyOfPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS_KW) {
				{
				setState(1120);
				match(IS_KW);
				}
			}

			setState(1123);
			match(ANY_KW);
			setState(1124);
			match(OF_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThatConnectorContext extends ParserRuleContext {
		public TerminalNode THAT_KW() { return getToken(OwlDslParser.THAT_KW, 0); }
		public TerminalNode AND_KW() { return getToken(OwlDslParser.AND_KW, 0); }
		public ThatConnectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thatConnector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitThatConnector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThatConnectorContext thatConnector() throws RecognitionException {
		ThatConnectorContext _localctx = new ThatConnectorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_thatConnector);
		try {
			setState(1129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THAT_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				match(THAT_KW);
				}
				break;
			case AND_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				match(AND_KW);
				setState(1128);
				match(THAT_KW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThatRestrictionContext extends ParserRuleContext {
		public ThatRestrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thatRestriction; }
	 
		public ThatRestrictionContext() { }
		public void copyFrom(ThatRestrictionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThatAllValuesFromContext extends ThatRestrictionContext {
		public ThatConnectorContext thatConnector() {
			return getRuleContext(ThatConnectorContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public TerminalNode ONLY_KW() { return getToken(OwlDslParser.ONLY_KW, 0); }
		public TerminalNode ONLY_SYM() { return getToken(OwlDslParser.ONLY_SYM, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ThatAllValuesFromContext(ThatRestrictionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitThatAllValuesFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThatMaxCardinalityFriendlyContext extends ThatRestrictionContext {
		public ThatConnectorContext thatConnector() {
			return getRuleContext(ThatConnectorContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public AtMostPhraseContext atMostPhrase() {
			return getRuleContext(AtMostPhraseContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public ThatMaxCardinalityFriendlyContext(ThatRestrictionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitThatMaxCardinalityFriendly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThatDataHasValueContext extends ThatRestrictionContext {
		public ThatConnectorContext thatConnector() {
			return getRuleContext(ThatConnectorContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public HasContext has() {
			return getRuleContext(HasContext.class,0);
		}
		public TerminalNode VALUE_KW() { return getToken(OwlDslParser.VALUE_KW, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ThatDataHasValueContext(ThatRestrictionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitThatDataHasValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThatMinCardinalityContext extends ThatRestrictionContext {
		public ThatConnectorContext thatConnector() {
			return getRuleContext(ThatConnectorContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public TerminalNode MIN_KW() { return getToken(OwlDslParser.MIN_KW, 0); }
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public ThatMinCardinalityContext(ThatRestrictionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitThatMinCardinality(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThatObjectHasValueContext extends ThatRestrictionContext {
		public ThatConnectorContext thatConnector() {
			return getRuleContext(ThatConnectorContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public HasContext has() {
			return getRuleContext(HasContext.class,0);
		}
		public TerminalNode VALUE_KW() { return getToken(OwlDslParser.VALUE_KW, 0); }
		public EntityUsageContext entityUsage() {
			return getRuleContext(EntityUsageContext.class,0);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
		}
		public ThatObjectHasValueContext(ThatRestrictionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitThatObjectHasValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThatMinCardinalityFriendlyContext extends ThatRestrictionContext {
		public ThatConnectorContext thatConnector() {
			return getRuleContext(ThatConnectorContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public AtLeastPhraseContext atLeastPhrase() {
			return getRuleContext(AtLeastPhraseContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public ThatMinCardinalityFriendlyContext(ThatRestrictionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitThatMinCardinalityFriendly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThatExactCardinalityContext extends ThatRestrictionContext {
		public ThatConnectorContext thatConnector() {
			return getRuleContext(ThatConnectorContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public TerminalNode EXACTLY_KW() { return getToken(OwlDslParser.EXACTLY_KW, 0); }
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public ThatExactCardinalityContext(ThatRestrictionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitThatExactCardinality(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThatMaxCardinalityContext extends ThatRestrictionContext {
		public ThatConnectorContext thatConnector() {
			return getRuleContext(ThatConnectorContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public TerminalNode MAX_KW() { return getToken(OwlDslParser.MAX_KW, 0); }
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public ThatMaxCardinalityContext(ThatRestrictionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitThatMaxCardinality(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThatSomeValuesFromContext extends ThatRestrictionContext {
		public ThatConnectorContext thatConnector() {
			return getRuleContext(ThatConnectorContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public ClassExprContext classExpr() {
			return getRuleContext(ClassExprContext.class,0);
		}
		public TerminalNode SOME_KW() { return getToken(OwlDslParser.SOME_KW, 0); }
		public TerminalNode SOME_SYM() { return getToken(OwlDslParser.SOME_SYM, 0); }
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public ThatSomeValuesFromContext(ThatRestrictionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitThatSomeValuesFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThatRestrictionContext thatRestriction() throws RecognitionException {
		ThatRestrictionContext _localctx = new ThatRestrictionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_thatRestriction);
		int _la;
		try {
			setState(1233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				_localctx = new ThatSomeValuesFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				thatConnector();
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1132);
					commentOpt();
					}
				}

				setState(1135);
				propExpr();
				setState(1136);
				_la = _input.LA(1);
				if ( !(_la==SOME_KW || _la==SOME_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1137);
					commentOpt();
					}
					break;
				}
				setState(1140);
				classExpr();
				}
				break;
			case 2:
				_localctx = new ThatAllValuesFromContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1142);
				thatConnector();
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1143);
					commentOpt();
					}
				}

				setState(1146);
				propExpr();
				setState(1147);
				_la = _input.LA(1);
				if ( !(_la==ONLY_KW || _la==ONLY_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1148);
					commentOpt();
					}
					break;
				}
				setState(1151);
				classExpr();
				}
				break;
			case 3:
				_localctx = new ThatObjectHasValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1153);
				thatConnector();
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1154);
					commentOpt();
					}
				}

				setState(1157);
				propExpr();
				setState(1158);
				has();
				setState(1159);
				match(VALUE_KW);
				setState(1160);
				entityUsage();
				}
				break;
			case 4:
				_localctx = new ThatDataHasValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1162);
				thatConnector();
				setState(1163);
				propExpr();
				setState(1164);
				has();
				setState(1165);
				match(VALUE_KW);
				setState(1166);
				literal();
				}
				break;
			case 5:
				_localctx = new ThatMinCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1168);
				thatConnector();
				setState(1170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1169);
					commentOpt();
					}
				}

				setState(1172);
				propExpr();
				setState(1173);
				match(MIN_KW);
				setState(1174);
				match(INTEGER);
				setState(1179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
					case 1:
						{
						setState(1175);
						commentOpt();
						}
						break;
					}
					setState(1178);
					classExpr();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new ThatMaxCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1181);
				thatConnector();
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1182);
					commentOpt();
					}
				}

				setState(1185);
				propExpr();
				setState(1186);
				match(MAX_KW);
				setState(1187);
				match(INTEGER);
				setState(1192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
					case 1:
						{
						setState(1188);
						commentOpt();
						}
						break;
					}
					setState(1191);
					classExpr();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new ThatExactCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1194);
				thatConnector();
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1195);
					commentOpt();
					}
				}

				setState(1198);
				propExpr();
				setState(1199);
				match(EXACTLY_KW);
				setState(1200);
				match(INTEGER);
				setState(1205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						setState(1201);
						commentOpt();
						}
						break;
					}
					setState(1204);
					classExpr();
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new ThatMinCardinalityFriendlyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1207);
				thatConnector();
				setState(1209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1208);
					commentOpt();
					}
				}

				setState(1211);
				propExpr();
				setState(1212);
				atLeastPhrase();
				setState(1213);
				match(INTEGER);
				setState(1218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						setState(1214);
						commentOpt();
						}
						break;
					}
					setState(1217);
					classExpr();
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new ThatMaxCardinalityFriendlyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1220);
				thatConnector();
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1221);
					commentOpt();
					}
				}

				setState(1224);
				propExpr();
				setState(1225);
				atMostPhrase();
				setState(1226);
				match(INTEGER);
				setState(1231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						setState(1227);
						commentOpt();
						}
						break;
					}
					setState(1230);
					classExpr();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryBoolOpContext extends ParserRuleContext {
		public BinaryBoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryBoolOp; }
	 
		public BinaryBoolOpContext() { }
		public void copyFrom(BinaryBoolOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndOpASCIIContext extends BinaryBoolOpContext {
		public TerminalNode AND_KW() { return getToken(OwlDslParser.AND_KW, 0); }
		public AndOpASCIIContext(BinaryBoolOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAndOpASCII(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrOpASCIIContext extends BinaryBoolOpContext {
		public TerminalNode OR_KW() { return getToken(OwlDslParser.OR_KW, 0); }
		public OrOpASCIIContext(BinaryBoolOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitOrOpASCII(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndOpUnicodeContext extends BinaryBoolOpContext {
		public TerminalNode INTERSECTION() { return getToken(OwlDslParser.INTERSECTION, 0); }
		public AndOpUnicodeContext(BinaryBoolOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitAndOpUnicode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrOpUnicodeContext extends BinaryBoolOpContext {
		public TerminalNode UNION_SYM() { return getToken(OwlDslParser.UNION_SYM, 0); }
		public OrOpUnicodeContext(BinaryBoolOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitOrOpUnicode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryBoolOpContext binaryBoolOp() throws RecognitionException {
		BinaryBoolOpContext _localctx = new BinaryBoolOpContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_binaryBoolOp);
		try {
			setState(1239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND_KW:
				_localctx = new AndOpASCIIContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1235);
				match(AND_KW);
				}
				break;
			case INTERSECTION:
				_localctx = new AndOpUnicodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1236);
				match(INTERSECTION);
				}
				break;
			case OR_KW:
				_localctx = new OrOpASCIIContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1237);
				match(OR_KW);
				}
				break;
			case UNION_SYM:
				_localctx = new OrOpUnicodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1238);
				match(UNION_SYM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropExprContext extends ParserRuleContext {
		public PropExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propExpr; }
	 
		public PropExprContext() { }
		public void copyFrom(PropExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InversePropertyPhraseContext extends PropExprContext {
		public InverseOfPhraseContext inverseOfPhrase() {
			return getRuleContext(InverseOfPhraseContext.class,0);
		}
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public InversePropertyPhraseContext(PropExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitInversePropertyPhrase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedPropertyExprContext extends PropExprContext {
		public EntityUsageContext entityUsage() {
			return getRuleContext(EntityUsageContext.class,0);
		}
		public NamedPropertyExprContext(PropExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitNamedPropertyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InversePropertyFunctionContext extends PropExprContext {
		public TerminalNode INVERSE_KW() { return getToken(OwlDslParser.INVERSE_KW, 0); }
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public PropExprContext propExpr() {
			return getRuleContext(PropExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public InversePropertyFunctionContext(PropExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitInversePropertyFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropExprContext propExpr() throws RecognitionException {
		PropExprContext _localctx = new PropExprContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_propExpr);
		try {
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				_localctx = new NamedPropertyExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1241);
				entityUsage();
				}
				break;
			case 2:
				_localctx = new InversePropertyFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1242);
				match(INVERSE_KW);
				setState(1243);
				match(LPAREN);
				setState(1244);
				propExpr();
				setState(1245);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new InversePropertyPhraseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1247);
				inverseOfPhrase();
				setState(1248);
				propExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropExprChainContext extends ParserRuleContext {
		public List<PropExprContext> propExpr() {
			return getRuleContexts(PropExprContext.class);
		}
		public PropExprContext propExpr(int i) {
			return getRuleContext(PropExprContext.class,i);
		}
		public List<TerminalNode> COMPOSITION() { return getTokens(OwlDslParser.COMPOSITION); }
		public TerminalNode COMPOSITION(int i) {
			return getToken(OwlDslParser.COMPOSITION, i);
		}
		public List<TerminalNode> THEN() { return getTokens(OwlDslParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(OwlDslParser.THEN, i);
		}
		public PropExprChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propExprChain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitPropExprChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropExprChainContext propExprChain() throws RecognitionException {
		PropExprChainContext _localctx = new PropExprChainContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_propExprChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			propExpr();
			setState(1257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPOSITION || _la==THEN) {
				{
				{
				setState(1253);
				_la = _input.LA(1);
				if ( !(_la==COMPOSITION || _la==THEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1254);
				propExpr();
				}
				}
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropExprChainWithCommentsContext extends ParserRuleContext {
		public List<PropExprContext> propExpr() {
			return getRuleContexts(PropExprContext.class);
		}
		public PropExprContext propExpr(int i) {
			return getRuleContext(PropExprContext.class,i);
		}
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public List<TerminalNode> COMPOSITION() { return getTokens(OwlDslParser.COMPOSITION); }
		public TerminalNode COMPOSITION(int i) {
			return getToken(OwlDslParser.COMPOSITION, i);
		}
		public List<TerminalNode> THEN() { return getTokens(OwlDslParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(OwlDslParser.THEN, i);
		}
		public PropExprChainWithCommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propExprChainWithComments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitPropExprChainWithComments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropExprChainWithCommentsContext propExprChainWithComments() throws RecognitionException {
		PropExprChainWithCommentsContext _localctx = new PropExprChainWithCommentsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_propExprChainWithComments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(1260);
				commentOpt();
				}
			}

			setState(1263);
			propExpr();
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPOSITION || _la==THEN) {
				{
				{
				setState(1264);
				_la = _input.LA(1);
				if ( !(_la==COMPOSITION || _la==THEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1265);
					commentOpt();
					}
				}

				setState(1268);
				propExpr();
				}
				}
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropExprListContext extends ParserRuleContext {
		public List<PropExprContext> propExpr() {
			return getRuleContexts(PropExprContext.class);
		}
		public PropExprContext propExpr(int i) {
			return getRuleContext(PropExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OwlDslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OwlDslParser.COMMA, i);
		}
		public PropExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propExprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitPropExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropExprListContext propExprList() throws RecognitionException {
		PropExprListContext _localctx = new PropExprListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_propExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			propExpr();
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1275);
				match(COMMA);
				setState(1276);
				propExpr();
				}
				}
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropExprWithCommentListContext extends ParserRuleContext {
		public List<PropExprContext> propExpr() {
			return getRuleContexts(PropExprContext.class);
		}
		public PropExprContext propExpr(int i) {
			return getRuleContext(PropExprContext.class,i);
		}
		public List<CommentOptContext> commentOpt() {
			return getRuleContexts(CommentOptContext.class);
		}
		public CommentOptContext commentOpt(int i) {
			return getRuleContext(CommentOptContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OwlDslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OwlDslParser.COMMA, i);
		}
		public PropExprWithCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propExprWithCommentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitPropExprWithCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropExprWithCommentListContext propExprWithCommentList() throws RecognitionException {
		PropExprWithCommentListContext _localctx = new PropExprWithCommentListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_propExprWithCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(1282);
				commentOpt();
				}
			}

			setState(1285);
			propExpr();
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1286);
				match(COMMA);
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1287);
					commentOpt();
					}
				}

				setState(1290);
				propExpr();
				}
				}
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacteristicListContext extends ParserRuleContext {
		public List<CharacteristicContext> characteristic() {
			return getRuleContexts(CharacteristicContext.class);
		}
		public CharacteristicContext characteristic(int i) {
			return getRuleContext(CharacteristicContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OwlDslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OwlDslParser.COMMA, i);
		}
		public CharacteristicListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characteristicList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitCharacteristicList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacteristicListContext characteristicList() throws RecognitionException {
		CharacteristicListContext _localctx = new CharacteristicListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_characteristicList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			characteristic();
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1297);
				match(COMMA);
				setState(1298);
				characteristic();
				}
				}
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacteristicContext extends ParserRuleContext {
		public TerminalNode FUNCTIONAL_KW() { return getToken(OwlDslParser.FUNCTIONAL_KW, 0); }
		public TerminalNode INVERSE_KW() { return getToken(OwlDslParser.INVERSE_KW, 0); }
		public TerminalNode TRANSITIVE_KW() { return getToken(OwlDslParser.TRANSITIVE_KW, 0); }
		public TerminalNode SYMMETRIC_KW() { return getToken(OwlDslParser.SYMMETRIC_KW, 0); }
		public TerminalNode ASYMMETRIC_KW() { return getToken(OwlDslParser.ASYMMETRIC_KW, 0); }
		public TerminalNode A_KW() { return getToken(OwlDslParser.A_KW, 0); }
		public TerminalNode REFLEXIVE_KW() { return getToken(OwlDslParser.REFLEXIVE_KW, 0); }
		public TerminalNode IRREFLEXIVE_KW() { return getToken(OwlDslParser.IRREFLEXIVE_KW, 0); }
		public TerminalNode IR_KW() { return getToken(OwlDslParser.IR_KW, 0); }
		public CharacteristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characteristic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitCharacteristic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacteristicContext characteristic() throws RecognitionException {
		CharacteristicContext _localctx = new CharacteristicContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_characteristic);
		try {
			setState(1316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTIONAL_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				match(FUNCTIONAL_KW);
				}
				break;
			case INVERSE_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				match(INVERSE_KW);
				setState(1306);
				match(FUNCTIONAL_KW);
				}
				break;
			case TRANSITIVE_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(1307);
				match(TRANSITIVE_KW);
				}
				break;
			case SYMMETRIC_KW:
				enterOuterAlt(_localctx, 4);
				{
				setState(1308);
				match(SYMMETRIC_KW);
				}
				break;
			case ASYMMETRIC_KW:
				enterOuterAlt(_localctx, 5);
				{
				setState(1309);
				match(ASYMMETRIC_KW);
				}
				break;
			case A_KW:
				enterOuterAlt(_localctx, 6);
				{
				setState(1310);
				match(A_KW);
				setState(1311);
				match(SYMMETRIC_KW);
				}
				break;
			case REFLEXIVE_KW:
				enterOuterAlt(_localctx, 7);
				{
				setState(1312);
				match(REFLEXIVE_KW);
				}
				break;
			case IRREFLEXIVE_KW:
				enterOuterAlt(_localctx, 8);
				{
				setState(1313);
				match(IRREFLEXIVE_KW);
				}
				break;
			case IR_KW:
				enterOuterAlt(_localctx, 9);
				{
				setState(1314);
				match(IR_KW);
				setState(1315);
				match(REFLEXIVE_KW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataCharacteristicListContext extends ParserRuleContext {
		public List<DataCharacteristicContext> dataCharacteristic() {
			return getRuleContexts(DataCharacteristicContext.class);
		}
		public DataCharacteristicContext dataCharacteristic(int i) {
			return getRuleContext(DataCharacteristicContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OwlDslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OwlDslParser.COMMA, i);
		}
		public DataCharacteristicListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataCharacteristicList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataCharacteristicList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataCharacteristicListContext dataCharacteristicList() throws RecognitionException {
		DataCharacteristicListContext _localctx = new DataCharacteristicListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_dataCharacteristicList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			dataCharacteristic();
			setState(1323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1319);
				match(COMMA);
				setState(1320);
				dataCharacteristic();
				}
				}
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataCharacteristicContext extends ParserRuleContext {
		public TerminalNode FUNCTIONAL_KW() { return getToken(OwlDslParser.FUNCTIONAL_KW, 0); }
		public DataCharacteristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataCharacteristic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataCharacteristic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataCharacteristicContext dataCharacteristic() throws RecognitionException {
		DataCharacteristicContext _localctx = new DataCharacteristicContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_dataCharacteristic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			match(FUNCTIONAL_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataRangeExprContext extends ParserRuleContext {
		public DataRangeOrExprContext dataRangeOrExpr() {
			return getRuleContext(DataRangeOrExprContext.class,0);
		}
		public DataRangeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRangeExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataRangeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataRangeExprContext dataRangeExpr() throws RecognitionException {
		DataRangeExprContext _localctx = new DataRangeExprContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_dataRangeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			dataRangeOrExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataRangeOrExprContext extends ParserRuleContext {
		public List<DataRangeAndExprContext> dataRangeAndExpr() {
			return getRuleContexts(DataRangeAndExprContext.class);
		}
		public DataRangeAndExprContext dataRangeAndExpr(int i) {
			return getRuleContext(DataRangeAndExprContext.class,i);
		}
		public List<TerminalNode> OR_KW() { return getTokens(OwlDslParser.OR_KW); }
		public TerminalNode OR_KW(int i) {
			return getToken(OwlDslParser.OR_KW, i);
		}
		public DataRangeOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRangeOrExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataRangeOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataRangeOrExprContext dataRangeOrExpr() throws RecognitionException {
		DataRangeOrExprContext _localctx = new DataRangeOrExprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_dataRangeOrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			dataRangeAndExpr();
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_KW) {
				{
				{
				setState(1331);
				match(OR_KW);
				setState(1332);
				dataRangeAndExpr();
				}
				}
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataRangeAndExprContext extends ParserRuleContext {
		public List<DataRangePrimaryContext> dataRangePrimary() {
			return getRuleContexts(DataRangePrimaryContext.class);
		}
		public DataRangePrimaryContext dataRangePrimary(int i) {
			return getRuleContext(DataRangePrimaryContext.class,i);
		}
		public List<TerminalNode> AND_KW() { return getTokens(OwlDslParser.AND_KW); }
		public TerminalNode AND_KW(int i) {
			return getToken(OwlDslParser.AND_KW, i);
		}
		public DataRangeAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRangeAndExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataRangeAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataRangeAndExprContext dataRangeAndExpr() throws RecognitionException {
		DataRangeAndExprContext _localctx = new DataRangeAndExprContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_dataRangeAndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			dataRangePrimary();
			setState(1343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_KW) {
				{
				{
				setState(1339);
				match(AND_KW);
				setState(1340);
				dataRangePrimary();
				}
				}
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataRangePrimaryContext extends ParserRuleContext {
		public DataRangePrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRangePrimary; }
	 
		public DataRangePrimaryContext() { }
		public void copyFrom(DataRangePrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedDatatypeContext extends DataRangePrimaryContext {
		public EntityUsageContext entityUsage() {
			return getRuleContext(EntityUsageContext.class,0);
		}
		public NamedDatatypeContext(DataRangePrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitNamedDatatype(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DatatypeRestrictionContext extends DataRangePrimaryContext {
		public TerminalNode RESTRICTION_KW() { return getToken(OwlDslParser.RESTRICTION_KW, 0); }
		public EntityUsageContext entityUsage() {
			return getRuleContext(EntityUsageContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(OwlDslParser.LBRACE, 0); }
		public FacetRestrictionListContext facetRestrictionList() {
			return getRuleContext(FacetRestrictionListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(OwlDslParser.RBRACE, 0); }
		public DatatypeRestrictionContext(DataRangePrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDatatypeRestriction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataOneOfContext extends DataRangePrimaryContext {
		public OneOfPhraseContext oneOfPhrase() {
			return getRuleContext(OneOfPhraseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public LiteralListContext literalList() {
			return getRuleContext(LiteralListContext.class,0);
		}
		public DataOneOfContext(DataRangePrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataOneOf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedDataRangeContext extends DataRangePrimaryContext {
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public DataRangeExprContext dataRangeExpr() {
			return getRuleContext(DataRangeExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public ParenthesizedDataRangeContext(DataRangePrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitParenthesizedDataRange(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataComplementOfContext extends DataRangePrimaryContext {
		public TerminalNode NOT_KW() { return getToken(OwlDslParser.NOT_KW, 0); }
		public DataRangePrimaryContext dataRangePrimary() {
			return getRuleContext(DataRangePrimaryContext.class,0);
		}
		public DataComplementOfContext(DataRangePrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDataComplementOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataRangePrimaryContext dataRangePrimary() throws RecognitionException {
		DataRangePrimaryContext _localctx = new DataRangePrimaryContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_dataRangePrimary);
		int _la;
		try {
			setState(1366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTELLIJ_DUMMY:
			case CURIE:
			case CURIE_EMPTY:
			case IRI:
				_localctx = new NamedDatatypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1346);
				entityUsage();
				}
				break;
			case LPAREN:
				_localctx = new ParenthesizedDataRangeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1347);
				match(LPAREN);
				setState(1348);
				dataRangeExpr();
				setState(1349);
				match(RPAREN);
				}
				break;
			case IS_KW:
			case ONE_KW:
				_localctx = new DataOneOfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1351);
				oneOfPhrase();
				setState(1352);
				match(LPAREN);
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1353);
					literalList();
					}
				}

				setState(1356);
				match(RPAREN);
				}
				break;
			case NOT_KW:
				_localctx = new DataComplementOfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1358);
				match(NOT_KW);
				setState(1359);
				dataRangePrimary();
				}
				break;
			case RESTRICTION_KW:
				_localctx = new DatatypeRestrictionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1360);
				match(RESTRICTION_KW);
				setState(1361);
				entityUsage();
				setState(1362);
				match(LBRACE);
				setState(1363);
				facetRestrictionList();
				setState(1364);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FacetRestrictionListContext extends ParserRuleContext {
		public List<FacetRestrictionContext> facetRestriction() {
			return getRuleContexts(FacetRestrictionContext.class);
		}
		public FacetRestrictionContext facetRestriction(int i) {
			return getRuleContext(FacetRestrictionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OwlDslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OwlDslParser.COMMA, i);
		}
		public FacetRestrictionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facetRestrictionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitFacetRestrictionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacetRestrictionListContext facetRestrictionList() throws RecognitionException {
		FacetRestrictionListContext _localctx = new FacetRestrictionListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_facetRestrictionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			facetRestriction();
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1369);
				match(COMMA);
				setState(1370);
				facetRestriction();
				}
				}
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FacetRestrictionContext extends ParserRuleContext {
		public TerminalNode FACET() { return getToken(OwlDslParser.FACET, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AtLeastPhraseContext atLeastPhrase() {
			return getRuleContext(AtLeastPhraseContext.class,0);
		}
		public TerminalNode GE() { return getToken(OwlDslParser.GE, 0); }
		public GeContext ge() {
			return getRuleContext(GeContext.class,0);
		}
		public TerminalNode GE_SYM() { return getToken(OwlDslParser.GE_SYM, 0); }
		public TerminalNode GE_ASC() { return getToken(OwlDslParser.GE_ASC, 0); }
		public AtMostPhraseContext atMostPhrase() {
			return getRuleContext(AtMostPhraseContext.class,0);
		}
		public TerminalNode LE() { return getToken(OwlDslParser.LE, 0); }
		public LeContext le() {
			return getRuleContext(LeContext.class,0);
		}
		public TerminalNode LE_SYM() { return getToken(OwlDslParser.LE_SYM, 0); }
		public TerminalNode LE_ASC() { return getToken(OwlDslParser.LE_ASC, 0); }
		public GreaterThanPhraseContext greaterThanPhrase() {
			return getRuleContext(GreaterThanPhraseContext.class,0);
		}
		public TerminalNode GT() { return getToken(OwlDslParser.GT, 0); }
		public GtContext gt() {
			return getRuleContext(GtContext.class,0);
		}
		public TerminalNode GT_SYM() { return getToken(OwlDslParser.GT_SYM, 0); }
		public LessThanPhraseContext lessThanPhrase() {
			return getRuleContext(LessThanPhraseContext.class,0);
		}
		public TerminalNode LT() { return getToken(OwlDslParser.LT, 0); }
		public LtContext lt() {
			return getRuleContext(LtContext.class,0);
		}
		public TerminalNode LT_SYM() { return getToken(OwlDslParser.LT_SYM, 0); }
		public EqualToPhraseContext equalToPhrase() {
			return getRuleContext(EqualToPhraseContext.class,0);
		}
		public TerminalNode EQ() { return getToken(OwlDslParser.EQ, 0); }
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public TerminalNode EQ_SYM() { return getToken(OwlDslParser.EQ_SYM, 0); }
		public FacetRestrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facetRestriction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitFacetRestriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacetRestrictionContext facetRestriction() throws RecognitionException {
		FacetRestrictionContext _localctx = new FacetRestrictionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_facetRestriction);
		try {
			setState(1415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376);
				match(FACET);
				setState(1377);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1383);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AT_KW:
					{
					setState(1378);
					atLeastPhrase();
					}
					break;
				case GE:
					{
					setState(1379);
					match(GE);
					}
					break;
				case T__0:
					{
					setState(1380);
					ge();
					}
					break;
				case GE_SYM:
					{
					setState(1381);
					match(GE_SYM);
					}
					break;
				case GE_ASC:
					{
					setState(1382);
					match(GE_ASC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1385);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1391);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AT_KW:
					{
					setState(1386);
					atMostPhrase();
					}
					break;
				case LE:
					{
					setState(1387);
					match(LE);
					}
					break;
				case T__1:
					{
					setState(1388);
					le();
					}
					break;
				case LE_SYM:
					{
					setState(1389);
					match(LE_SYM);
					}
					break;
				case LE_ASC:
					{
					setState(1390);
					match(LE_ASC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1393);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1398);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_KW:
					{
					setState(1394);
					greaterThanPhrase();
					}
					break;
				case GT:
					{
					setState(1395);
					match(GT);
					}
					break;
				case T__2:
					{
					setState(1396);
					gt();
					}
					break;
				case GT_SYM:
					{
					setState(1397);
					match(GT_SYM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1400);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1405);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS_KW:
					{
					setState(1401);
					lessThanPhrase();
					}
					break;
				case LT:
					{
					setState(1402);
					match(LT);
					}
					break;
				case T__3:
					{
					setState(1403);
					lt();
					}
					break;
				case LT_SYM:
					{
					setState(1404);
					match(LT_SYM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1407);
				literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1412);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL_KW:
					{
					setState(1408);
					equalToPhrase();
					}
					break;
				case EQ:
					{
					setState(1409);
					match(EQ);
					}
					break;
				case T__4:
					{
					setState(1410);
					eq();
					}
					break;
				case EQ_SYM:
					{
					setState(1411);
					match(EQ_SYM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1414);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanPhraseContext extends ParserRuleContext {
		public TerminalNode GREATER_KW() { return getToken(OwlDslParser.GREATER_KW, 0); }
		public TerminalNode THAN_KW() { return getToken(OwlDslParser.THAN_KW, 0); }
		public GreaterThanPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitGreaterThanPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterThanPhraseContext greaterThanPhrase() throws RecognitionException {
		GreaterThanPhraseContext _localctx = new GreaterThanPhraseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_greaterThanPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			match(GREATER_KW);
			setState(1418);
			match(THAN_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LessThanPhraseContext extends ParserRuleContext {
		public TerminalNode LESS_KW() { return getToken(OwlDslParser.LESS_KW, 0); }
		public TerminalNode THAN_KW() { return getToken(OwlDslParser.THAN_KW, 0); }
		public LessThanPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitLessThanPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanPhraseContext lessThanPhrase() throws RecognitionException {
		LessThanPhraseContext _localctx = new LessThanPhraseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_lessThanPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			match(LESS_KW);
			setState(1421);
			match(THAN_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualToPhraseContext extends ParserRuleContext {
		public TerminalNode EQUAL_KW() { return getToken(OwlDslParser.EQUAL_KW, 0); }
		public TerminalNode TO_KW() { return getToken(OwlDslParser.TO_KW, 0); }
		public EqualToPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalToPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitEqualToPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualToPhraseContext equalToPhrase() throws RecognitionException {
		EqualToPhraseContext _localctx = new EqualToPhraseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_equalToPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			match(EQUAL_KW);
			setState(1424);
			match(TO_KW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralListContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OwlDslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OwlDslParser.COMMA, i);
		}
		public LiteralListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitLiteralList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralListContext literalList() throws RecognitionException {
		LiteralListContext _localctx = new LiteralListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_literalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			literal();
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1427);
				match(COMMA);
				setState(1428);
				literal();
				}
				}
				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndividualListContext extends ParserRuleContext {
		public List<EntityUsageContext> entityUsage() {
			return getRuleContexts(EntityUsageContext.class);
		}
		public EntityUsageContext entityUsage(int i) {
			return getRuleContext(EntityUsageContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OwlDslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OwlDslParser.COMMA, i);
		}
		public IndividualListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individualList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitIndividualList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndividualListContext individualList() throws RecognitionException {
		IndividualListContext _localctx = new IndividualListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_individualList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			entityUsage();
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1435);
				match(COMMA);
				setState(1436);
				entityUsage();
				}
				}
				setState(1441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EntityUsageContext extends ParserRuleContext {
		public TerminalNode CURIE() { return getToken(OwlDslParser.CURIE, 0); }
		public TerminalNode CURIE_EMPTY() { return getToken(OwlDslParser.CURIE_EMPTY, 0); }
		public FullIRIContext fullIRI() {
			return getRuleContext(FullIRIContext.class,0);
		}
		public TerminalNode INTELLIJ_DUMMY() { return getToken(OwlDslParser.INTELLIJ_DUMMY, 0); }
		public EntityUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityUsage; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitEntityUsage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityUsageContext entityUsage() throws RecognitionException {
		EntityUsageContext _localctx = new EntityUsageContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_entityUsage);
		try {
			setState(1446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				match(CURIE);
				}
				break;
			case CURIE_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				match(CURIE_EMPTY);
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1444);
				fullIRI();
				}
				break;
			case INTELLIJ_DUMMY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1445);
				match(INTELLIJ_DUMMY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EntityIdContext extends ParserRuleContext {
		public TerminalNode CURIE() { return getToken(OwlDslParser.CURIE, 0); }
		public TerminalNode CURIE_EMPTY() { return getToken(OwlDslParser.CURIE_EMPTY, 0); }
		public FullIRIContext fullIRI() {
			return getRuleContext(FullIRIContext.class,0);
		}
		public TerminalNode INTELLIJ_DUMMY() { return getToken(OwlDslParser.INTELLIJ_DUMMY, 0); }
		public EntityIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitEntityId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityIdContext entityId() throws RecognitionException {
		EntityIdContext _localctx = new EntityIdContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_entityId);
		try {
			setState(1452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1448);
				match(CURIE);
				}
				break;
			case CURIE_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1449);
				match(CURIE_EMPTY);
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1450);
				fullIRI();
				}
				break;
			case INTELLIJ_DUMMY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1451);
				match(INTELLIJ_DUMMY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassIdContext extends ParserRuleContext {
		public TerminalNode CURIE() { return getToken(OwlDslParser.CURIE, 0); }
		public TerminalNode CURIE_EMPTY() { return getToken(OwlDslParser.CURIE_EMPTY, 0); }
		public FullIRIContext fullIRI() {
			return getRuleContext(FullIRIContext.class,0);
		}
		public TerminalNode INTELLIJ_DUMMY() { return getToken(OwlDslParser.INTELLIJ_DUMMY, 0); }
		public ClassIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitClassId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassIdContext classId() throws RecognitionException {
		ClassIdContext _localctx = new ClassIdContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_classId);
		try {
			setState(1458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1454);
				match(CURIE);
				}
				break;
			case CURIE_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1455);
				match(CURIE_EMPTY);
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1456);
				fullIRI();
				}
				break;
			case INTELLIJ_DUMMY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1457);
				match(INTELLIJ_DUMMY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropIdContext extends ParserRuleContext {
		public TerminalNode CURIE() { return getToken(OwlDslParser.CURIE, 0); }
		public TerminalNode CURIE_EMPTY() { return getToken(OwlDslParser.CURIE_EMPTY, 0); }
		public FullIRIContext fullIRI() {
			return getRuleContext(FullIRIContext.class,0);
		}
		public TerminalNode INTELLIJ_DUMMY() { return getToken(OwlDslParser.INTELLIJ_DUMMY, 0); }
		public PropIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitPropId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropIdContext propId() throws RecognitionException {
		PropIdContext _localctx = new PropIdContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_propId);
		try {
			setState(1464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1460);
				match(CURIE);
				}
				break;
			case CURIE_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1461);
				match(CURIE_EMPTY);
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1462);
				fullIRI();
				}
				break;
			case INTELLIJ_DUMMY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1463);
				match(INTELLIJ_DUMMY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndividualIdContext extends ParserRuleContext {
		public TerminalNode CURIE() { return getToken(OwlDslParser.CURIE, 0); }
		public TerminalNode CURIE_EMPTY() { return getToken(OwlDslParser.CURIE_EMPTY, 0); }
		public FullIRIContext fullIRI() {
			return getRuleContext(FullIRIContext.class,0);
		}
		public TerminalNode INTELLIJ_DUMMY() { return getToken(OwlDslParser.INTELLIJ_DUMMY, 0); }
		public IndividualIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individualId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitIndividualId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndividualIdContext individualId() throws RecognitionException {
		IndividualIdContext _localctx = new IndividualIdContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_individualId);
		try {
			setState(1470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				match(CURIE);
				}
				break;
			case CURIE_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
				match(CURIE_EMPTY);
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1468);
				fullIRI();
				}
				break;
			case INTELLIJ_DUMMY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1469);
				match(INTELLIJ_DUMMY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DatatypeIdContext extends ParserRuleContext {
		public TerminalNode CURIE() { return getToken(OwlDslParser.CURIE, 0); }
		public TerminalNode CURIE_EMPTY() { return getToken(OwlDslParser.CURIE_EMPTY, 0); }
		public FullIRIContext fullIRI() {
			return getRuleContext(FullIRIContext.class,0);
		}
		public TerminalNode INTELLIJ_DUMMY() { return getToken(OwlDslParser.INTELLIJ_DUMMY, 0); }
		public DatatypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatypeId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDatatypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeIdContext datatypeId() throws RecognitionException {
		DatatypeIdContext _localctx = new DatatypeIdContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_datatypeId);
		try {
			setState(1476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1472);
				match(CURIE);
				}
				break;
			case CURIE_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				match(CURIE_EMPTY);
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1474);
				fullIRI();
				}
				break;
			case INTELLIJ_DUMMY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1475);
				match(INTELLIJ_DUMMY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceIRIContext extends ParserRuleContext {
		public TerminalNode IRI() { return getToken(OwlDslParser.IRI, 0); }
		public NamespaceIRIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceIRI; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitNamespaceIRI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceIRIContext namespaceIRI() throws RecognitionException {
		NamespaceIRIContext _localctx = new NamespaceIRIContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namespaceIRI);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(IRI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FullIRIContext extends ParserRuleContext {
		public TerminalNode IRI() { return getToken(OwlDslParser.IRI, 0); }
		public FullIRIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullIRI; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitFullIRI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullIRIContext fullIRI() throws RecognitionException {
		FullIRIContext _localctx = new FullIRIContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_fullIRI);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			match(IRI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OwlDslParser.STRING, 0); }
		public TerminalNode STRING3() { return getToken(OwlDslParser.STRING3, 0); }
		public TerminalNode LANGTAG() { return getToken(OwlDslParser.LANGTAG, 0); }
		public TerminalNode DATATYPE_SEP() { return getToken(OwlDslParser.DATATYPE_SEP, 0); }
		public EntityUsageContext entityUsage() {
			return getRuleContext(EntityUsageContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(OwlDslParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(OwlDslParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(OwlDslParser.DOUBLE, 0); }
		public TerminalNode TRUE_KW() { return getToken(OwlDslParser.TRUE_KW, 0); }
		public TerminalNode FALSE_KW() { return getToken(OwlDslParser.FALSE_KW, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_literal);
		int _la;
		try {
			setState(1493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING3:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1482);
				_la = _input.LA(1);
				if ( !(_la==STRING3 || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1486);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(1483);
					match(LANGTAG);
					}
					break;
				case DATATYPE_SEP:
					{
					setState(1484);
					match(DATATYPE_SEP);
					setState(1485);
					entityUsage();
					}
					break;
				case EOF:
				case INTELLIJ_DUMMY:
				case CURIE:
				case CURIE_EMPTY:
				case IRI:
				case ANNOTATION:
				case PROPERTY:
				case STRING3:
				case STRING:
				case INTEGER:
				case DECIMAL:
				case DOUBLE:
				case PREFIX_KW:
				case ONTOLOGY_KW:
				case CLASS_KW:
				case IS_KW:
				case SUBCLASS_KW:
				case EQUIVALENT_KW:
				case DISJOINT_KW:
				case HAS_KW:
				case KEY_KW:
				case OBJECT_KW:
				case SUBPROPERTY_KW:
				case DOMAIN_KW:
				case RANGE_KW:
				case CHARACTERISTICS_KW:
				case INVERSE_KW:
				case DATA_KW:
				case ANNOTATION_KW:
				case DATATYPE_KW:
				case DATATYPE_DEFINITION_KW:
				case INDIVIDUAL_KW:
				case NOT_KW:
				case AND_KW:
				case OR_KW:
				case THING_KW:
				case NOTHING_KW:
				case SOME_KW:
				case ONLY_KW:
				case VALUE_KW:
				case MIN_KW:
				case MAX_KW:
				case EXACTLY_KW:
				case THAT_KW:
				case AT_KW:
				case ONE_KW:
				case ALL_KW:
				case ANY_KW:
				case TRUE_KW:
				case FALSE_KW:
				case DOT:
				case COMMA:
				case SEMICOLON:
				case LPAREN:
				case RPAREN:
				case RBRACE:
				case SUBSET_EQ:
				case LE_SEQ:
				case NOT_SYM:
				case INTERSECTION:
				case UNION_SYM:
				case SOME_SYM:
				case ONLY_SYM:
					break;
				default:
					break;
				}
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1488);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1489);
				match(DECIMAL);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1490);
				match(DOUBLE);
				}
				break;
			case TRUE_KW:
				enterOuterAlt(_localctx, 5);
				{
				setState(1491);
				match(TRUE_KW);
				}
				break;
			case FALSE_KW:
				enterOuterAlt(_localctx, 6);
				{
				setState(1492);
				match(FALSE_KW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GeContext extends ParserRuleContext {
		public GeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ge; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitGe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeContext ge() throws RecognitionException {
		GeContext _localctx = new GeContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_ge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeContext extends ParserRuleContext {
		public LeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_le; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitLe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeContext le() throws RecognitionException {
		LeContext _localctx = new LeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_le);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GtContext extends ParserRuleContext {
		public GtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtContext gt() throws RecognitionException {
		GtContext _localctx = new GtContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_gt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LtContext extends ParserRuleContext {
		public LtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtContext lt() throws RecognitionException {
		LtContext _localctx = new LtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_lt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqContext extends ParserRuleContext {
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001x\u05e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00d6\b\u0000"+
		"\n\u0000\f\u0000\u00d9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002\u00e3"+
		"\b\u0002\u000b\u0002\f\u0002\u00e4\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00eb\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00f5\b\u0005\n\u0005\f\u0005\u00f8\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00fd\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0103\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u010f\b\t\n"+
		"\t\f\t\u0112\t\t\u0001\n\u0001\n\u0001\n\u0003\n\u0117\b\n\u0001\u000b"+
		"\u0004\u000b\u011a\b\u000b\u000b\u000b\f\u000b\u011b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u0127\b\f\u0001\r\u0001\r\u0003\r\u012b\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0134\b\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0138\b\u000e\u0001\u000e\u0003\u000e\u013b\b\u000e\u0001\u000e"+
		"\u0003\u000e\u013e\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0143\b\u000e\n\u000e\f\u000e\u0146\t\u000e\u0001\u000e\u0003\u000e\u0149"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u014d\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0153\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0159\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0167\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u016d\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0171\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0003\u0017\u0188\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0003\u0018\u018d\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0003\u0019\u0192\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u019a\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01a0\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01a6\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01aa\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01ae"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01b2\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01b8\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u01bc\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u01c0\b\u001d\u0001\u001d\u0005\u001d\u01c3\b\u001d\n\u001d\f\u001d\u01c6"+
		"\t\u001d\u0001\u001d\u0003\u001d\u01c9\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u01cd\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u01d3\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01de\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01e4\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01ea\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01f0\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u01f7\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01fc\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0201\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0205\b\u001f\u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0003#\u0211"+
		"\b#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0003$\u021a\b$\u0001"+
		"$\u0001$\u0003$\u021e\b$\u0001$\u0001$\u0003$\u0222\b$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u0229\b$\u0001$\u0001$\u0001$\u0003$\u022e\b$\u0001"+
		"$\u0003$\u0231\b$\u0001%\u0001%\u0001%\u0001%\u0003%\u0237\b%\u0001%\u0001"+
		"%\u0001%\u0003%\u023c\b%\u0001&\u0001&\u0001&\u0001&\u0003&\u0242\b&\u0001"+
		"&\u0001&\u0003&\u0246\b&\u0001&\u0001&\u0001&\u0003&\u024b\b&\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0003\'\u0251\b\'\u0001\'\u0001\'\u0003\'\u0255"+
		"\b\'\u0001\'\u0001\'\u0003\'\u0259\b\'\u0001\'\u0005\'\u025c\b\'\n\'\f"+
		"\'\u025f\t\'\u0001\'\u0003\'\u0262\b\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0278\b(\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u027e\b)\u0001)\u0001)\u0003)\u0282\b)\u0001)\u0001)\u0003"+
		")\u0286\b)\u0001)\u0005)\u0289\b)\n)\f)\u028c\t)\u0001)\u0003)\u028f\b"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u0295\b)\u0001)\u0003)\u0298\b)\u0001"+
		"*\u0001*\u0003*\u029c\b*\u0001*\u0001*\u0001+\u0001+\u0003+\u02a2\b+\u0001"+
		"+\u0001+\u0001+\u0003+\u02a7\b+\u0001+\u0001+\u0001+\u0003+\u02ac\b+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u02b4\b,\u0001,\u0001,\u0003"+
		",\u02b8\b,\u0001-\u0001-\u0001-\u0001.\u0001.\u0003.\u02bf\b.\u0001.\u0001"+
		".\u0003.\u02c3\b.\u0001.\u0001.\u0003.\u02c7\b.\u0001.\u0001.\u0003.\u02cb"+
		"\b.\u0001.\u0001.\u0003.\u02cf\b.\u0003.\u02d1\b.\u0001/\u0001/\u0001"+
		"/\u0005/\u02d6\b/\n/\f/\u02d9\t/\u0001/\u0001/\u0005/\u02dd\b/\n/\f/\u02e0"+
		"\t/\u0001/\u0001/\u0001/\u0005/\u02e5\b/\n/\f/\u02e8\t/\u0001/\u0001/"+
		"\u0005/\u02ec\b/\n/\f/\u02ef\t/\u0001/\u0003/\u02f2\b/\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u02f9\b0\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00032\u0303\b2\u00013\u00033\u0306\b3\u00013\u00013\u0001"+
		"3\u00014\u00034\u030c\b4\u00014\u00014\u00014\u00015\u00015\u00015\u0005"+
		"5\u0314\b5\n5\f5\u0317\t5\u00016\u00036\u031a\b6\u00016\u00016\u00016"+
		"\u00016\u00016\u00016\u00016\u00016\u00036\u0324\b6\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00036\u032d\b6\u00017\u00017\u00017\u0005"+
		"7\u0332\b7\n7\f7\u0335\t7\u00018\u00018\u00018\u00048\u033a\b8\u000b8"+
		"\f8\u033b\u00018\u00018\u00048\u0340\b8\u000b8\f8\u0341\u00038\u0344\b"+
		"8\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0005:\u034c\b:\n:\f:\u034f"+
		"\t:\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0356\b;\u0001<\u0003<\u0359"+
		"\b<\u0001<\u0001<\u0004<\u035d\b<\u000b<\f<\u035e\u0001<\u0003<\u0362"+
		"\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u036b\b<\u0001"+
		"<\u0001<\u0003<\u036f\b<\u0001<\u0001<\u0001<\u0001<\u0003<\u0375\b<\u0001"+
		"<\u0001<\u0003<\u0379\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u0380"+
		"\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0003<\u038d\b<\u0001<\u0001<\u0003<\u0391\b<\u0001<\u0003<\u0394"+
		"\b<\u0001<\u0001<\u0001<\u0003<\u0399\b<\u0001<\u0001<\u0003<\u039d\b"+
		"<\u0001<\u0003<\u03a0\b<\u0001<\u0001<\u0001<\u0003<\u03a5\b<\u0001<\u0001"+
		"<\u0003<\u03a9\b<\u0001<\u0003<\u03ac\b<\u0001<\u0003<\u03af\b<\u0001"+
		"<\u0003<\u03b2\b<\u0001<\u0001<\u0001<\u0003<\u03b7\b<\u0001<\u0001<\u0001"+
		"<\u0003<\u03bc\b<\u0001<\u0003<\u03bf\b<\u0001<\u0001<\u0001<\u0003<\u03c4"+
		"\b<\u0001<\u0001<\u0001<\u0003<\u03c9\b<\u0001<\u0003<\u03cc\b<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u03d4\b<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0003<\u03dc\b<\u0001<\u0003<\u03df\b<\u0001<\u0001"+
		"<\u0001<\u0001<\u0003<\u03e5\b<\u0001<\u0003<\u03e8\b<\u0001<\u0003<\u03eb"+
		"\b<\u0001<\u0003<\u03ee\b<\u0001<\u0001<\u0001<\u0001<\u0003<\u03f4\b"+
		"<\u0001<\u0003<\u03f7\b<\u0001<\u0003<\u03fa\b<\u0001<\u0003<\u03fd\b"+
		"<\u0001<\u0001<\u0001<\u0001<\u0003<\u0403\b<\u0001<\u0003<\u0406\b<\u0001"+
		"<\u0001<\u0001<\u0003<\u040b\b<\u0001<\u0001<\u0003<\u040f\b<\u0001<\u0003"+
		"<\u0412\b<\u0001<\u0001<\u0001<\u0003<\u0417\b<\u0001<\u0001<\u0003<\u041b"+
		"\b<\u0001<\u0003<\u041e\b<\u0001<\u0003<\u0421\b<\u0001<\u0003<\u0424"+
		"\b<\u0001<\u0001<\u0001<\u0001<\u0003<\u042a\b<\u0001<\u0003<\u042d\b"+
		"<\u0001<\u0003<\u0430\b<\u0001<\u0003<\u0433\b<\u0001<\u0001<\u0001<\u0001"+
		"<\u0003<\u0439\b<\u0001<\u0003<\u043c\b<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0003<\u044d\b<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001?\u0003"+
		"?\u0456\b?\u0001?\u0001?\u0001?\u0001@\u0003@\u045c\b@\u0001@\u0001@\u0001"+
		"@\u0001A\u0003A\u0462\bA\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0003"+
		"B\u046a\bB\u0001C\u0001C\u0003C\u046e\bC\u0001C\u0001C\u0001C\u0003C\u0473"+
		"\bC\u0001C\u0001C\u0001C\u0001C\u0003C\u0479\bC\u0001C\u0001C\u0001C\u0003"+
		"C\u047e\bC\u0001C\u0001C\u0001C\u0001C\u0003C\u0484\bC\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0003C\u0493\bC\u0001C\u0001C\u0001C\u0001C\u0003C\u0499\bC\u0001C\u0003"+
		"C\u049c\bC\u0001C\u0001C\u0003C\u04a0\bC\u0001C\u0001C\u0001C\u0001C\u0003"+
		"C\u04a6\bC\u0001C\u0003C\u04a9\bC\u0001C\u0001C\u0003C\u04ad\bC\u0001"+
		"C\u0001C\u0001C\u0001C\u0003C\u04b3\bC\u0001C\u0003C\u04b6\bC\u0001C\u0001"+
		"C\u0003C\u04ba\bC\u0001C\u0001C\u0001C\u0001C\u0003C\u04c0\bC\u0001C\u0003"+
		"C\u04c3\bC\u0001C\u0001C\u0003C\u04c7\bC\u0001C\u0001C\u0001C\u0001C\u0003"+
		"C\u04cd\bC\u0001C\u0003C\u04d0\bC\u0003C\u04d2\bC\u0001D\u0001D\u0001"+
		"D\u0001D\u0003D\u04d8\bD\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0003E\u04e3\bE\u0001F\u0001F\u0001F\u0005F\u04e8\bF\n"+
		"F\fF\u04eb\tF\u0001G\u0003G\u04ee\bG\u0001G\u0001G\u0001G\u0003G\u04f3"+
		"\bG\u0001G\u0005G\u04f6\bG\nG\fG\u04f9\tG\u0001H\u0001H\u0001H\u0005H"+
		"\u04fe\bH\nH\fH\u0501\tH\u0001I\u0003I\u0504\bI\u0001I\u0001I\u0001I\u0003"+
		"I\u0509\bI\u0001I\u0005I\u050c\bI\nI\fI\u050f\tI\u0001J\u0001J\u0001J"+
		"\u0005J\u0514\bJ\nJ\fJ\u0517\tJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u0525\bK\u0001L\u0001"+
		"L\u0001L\u0005L\u052a\bL\nL\fL\u052d\tL\u0001M\u0001M\u0001N\u0001N\u0001"+
		"O\u0001O\u0001O\u0005O\u0536\bO\nO\fO\u0539\tO\u0001P\u0001P\u0001P\u0005"+
		"P\u053e\bP\nP\fP\u0541\tP\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0003Q\u054b\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0003Q\u0557\bQ\u0001R\u0001R\u0001R\u0005R\u055c"+
		"\bR\nR\fR\u055f\tR\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003"+
		"S\u0568\bS\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u0570\bS\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0003S\u0577\bS\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0003S\u057e\bS\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u0585"+
		"\bS\u0001S\u0003S\u0588\bS\u0001T\u0001T\u0001T\u0001U\u0001U\u0001U\u0001"+
		"V\u0001V\u0001V\u0001W\u0001W\u0001W\u0005W\u0596\bW\nW\fW\u0599\tW\u0001"+
		"X\u0001X\u0001X\u0005X\u059e\bX\nX\fX\u05a1\tX\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0003Y\u05a7\bY\u0001Z\u0001Z\u0001Z\u0001Z\u0003Z\u05ad\bZ\u0001[\u0001"+
		"[\u0001[\u0001[\u0003[\u05b3\b[\u0001\\\u0001\\\u0001\\\u0001\\\u0003"+
		"\\\u05b9\b\\\u0001]\u0001]\u0001]\u0001]\u0003]\u05bf\b]\u0001^\u0001"+
		"^\u0001^\u0001^\u0003^\u05c5\b^\u0001_\u0001_\u0001`\u0001`\u0001a\u0001"+
		"a\u0001a\u0001a\u0003a\u05cf\ba\u0001a\u0001a\u0001a\u0001a\u0001a\u0003"+
		"a\u05d6\ba\u0001b\u0001b\u0001c\u0001c\u0001d\u0001d\u0001e\u0001e\u0001"+
		"f\u0001f\u0001f\u0000\u0000g\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u0000\u0007\u0002\u0000\u0007"+
		"\u0007hh\u0001\u0000)*\u0002\u0000FFpp\u0002\u0000KKss\u0002\u0000LLt"+
		"t\u0001\u0000uv\u0001\u0000\u000e\u000f\u06c1\u0000\u00d7\u0001\u0000"+
		"\u0000\u0000\u0002\u00dc\u0001\u0000\u0000\u0000\u0004\u00e2\u0001\u0000"+
		"\u0000\u0000\u0006\u00e8\u0001\u0000\u0000\u0000\b\u00ec\u0001\u0000\u0000"+
		"\u0000\n\u00f1\u0001\u0000\u0000\u0000\f\u00f9\u0001\u0000\u0000\u0000"+
		"\u000e\u00fe\u0001\u0000\u0000\u0000\u0010\u0106\u0001\u0000\u0000\u0000"+
		"\u0012\u010b\u0001\u0000\u0000\u0000\u0014\u0113\u0001\u0000\u0000\u0000"+
		"\u0016\u0119\u0001\u0000\u0000\u0000\u0018\u0126\u0001\u0000\u0000\u0000"+
		"\u001a\u0133\u0001\u0000\u0000\u0000\u001c\u0135\u0001\u0000\u0000\u0000"+
		"\u001e\u0166\u0001\u0000\u0000\u0000 \u0170\u0001\u0000\u0000\u0000\""+
		"\u0172\u0001\u0000\u0000\u0000$\u0175\u0001\u0000\u0000\u0000&\u0178\u0001"+
		"\u0000\u0000\u0000(\u017c\u0001\u0000\u0000\u0000*\u0180\u0001\u0000\u0000"+
		"\u0000,\u0183\u0001\u0000\u0000\u0000.\u0187\u0001\u0000\u0000\u00000"+
		"\u018c\u0001\u0000\u0000\u00002\u0191\u0001\u0000\u0000\u00004\u0193\u0001"+
		"\u0000\u0000\u00006\u019f\u0001\u0000\u0000\u00008\u01a1\u0001\u0000\u0000"+
		"\u0000:\u01b3\u0001\u0000\u0000\u0000<\u01fb\u0001\u0000\u0000\u0000>"+
		"\u0204\u0001\u0000\u0000\u0000@\u0206\u0001\u0000\u0000\u0000B\u0209\u0001"+
		"\u0000\u0000\u0000D\u020c\u0001\u0000\u0000\u0000F\u0210\u0001\u0000\u0000"+
		"\u0000H\u0215\u0001\u0000\u0000\u0000J\u023b\u0001\u0000\u0000\u0000L"+
		"\u023d\u0001\u0000\u0000\u0000N\u024c\u0001\u0000\u0000\u0000P\u0277\u0001"+
		"\u0000\u0000\u0000R\u0297\u0001\u0000\u0000\u0000T\u0299\u0001\u0000\u0000"+
		"\u0000V\u02ab\u0001\u0000\u0000\u0000X\u02ad\u0001\u0000\u0000\u0000Z"+
		"\u02b9\u0001\u0000\u0000\u0000\\\u02d0\u0001\u0000\u0000\u0000^\u02f1"+
		"\u0001\u0000\u0000\u0000`\u02f8\u0001\u0000\u0000\u0000b\u02fa\u0001\u0000"+
		"\u0000\u0000d\u0302\u0001\u0000\u0000\u0000f\u0305\u0001\u0000\u0000\u0000"+
		"h\u030b\u0001\u0000\u0000\u0000j\u0310\u0001\u0000\u0000\u0000l\u032c"+
		"\u0001\u0000\u0000\u0000n\u032e\u0001\u0000\u0000\u0000p\u0336\u0001\u0000"+
		"\u0000\u0000r\u0345\u0001\u0000\u0000\u0000t\u0347\u0001\u0000\u0000\u0000"+
		"v\u0355\u0001\u0000\u0000\u0000x\u044c\u0001\u0000\u0000\u0000z\u044e"+
		"\u0001\u0000\u0000\u0000|\u0451\u0001\u0000\u0000\u0000~\u0455\u0001\u0000"+
		"\u0000\u0000\u0080\u045b\u0001\u0000\u0000\u0000\u0082\u0461\u0001\u0000"+
		"\u0000\u0000\u0084\u0469\u0001\u0000\u0000\u0000\u0086\u04d1\u0001\u0000"+
		"\u0000\u0000\u0088\u04d7\u0001\u0000\u0000\u0000\u008a\u04e2\u0001\u0000"+
		"\u0000\u0000\u008c\u04e4\u0001\u0000\u0000\u0000\u008e\u04ed\u0001\u0000"+
		"\u0000\u0000\u0090\u04fa\u0001\u0000\u0000\u0000\u0092\u0503\u0001\u0000"+
		"\u0000\u0000\u0094\u0510\u0001\u0000\u0000\u0000\u0096\u0524\u0001\u0000"+
		"\u0000\u0000\u0098\u0526\u0001\u0000\u0000\u0000\u009a\u052e\u0001\u0000"+
		"\u0000\u0000\u009c\u0530\u0001\u0000\u0000\u0000\u009e\u0532\u0001\u0000"+
		"\u0000\u0000\u00a0\u053a\u0001\u0000\u0000\u0000\u00a2\u0556\u0001\u0000"+
		"\u0000\u0000\u00a4\u0558\u0001\u0000\u0000\u0000\u00a6\u0587\u0001\u0000"+
		"\u0000\u0000\u00a8\u0589\u0001\u0000\u0000\u0000\u00aa\u058c\u0001\u0000"+
		"\u0000\u0000\u00ac\u058f\u0001\u0000\u0000\u0000\u00ae\u0592\u0001\u0000"+
		"\u0000\u0000\u00b0\u059a\u0001\u0000\u0000\u0000\u00b2\u05a6\u0001\u0000"+
		"\u0000\u0000\u00b4\u05ac\u0001\u0000\u0000\u0000\u00b6\u05b2\u0001\u0000"+
		"\u0000\u0000\u00b8\u05b8\u0001\u0000\u0000\u0000\u00ba\u05be\u0001\u0000"+
		"\u0000\u0000\u00bc\u05c4\u0001\u0000\u0000\u0000\u00be\u05c6\u0001\u0000"+
		"\u0000\u0000\u00c0\u05c8\u0001\u0000\u0000\u0000\u00c2\u05d5\u0001\u0000"+
		"\u0000\u0000\u00c4\u05d7\u0001\u0000\u0000\u0000\u00c6\u05d9\u0001\u0000"+
		"\u0000\u0000\u00c8\u05db\u0001\u0000\u0000\u0000\u00ca\u05dd\u0001\u0000"+
		"\u0000\u0000\u00cc\u05df\u0001\u0000\u0000\u0000\u00ce\u00d6\u0003\u0002"+
		"\u0001\u0000\u00cf\u00d6\u0003\u0010\b\u0000\u00d0\u00d6\u0003\u0004\u0002"+
		"\u0000\u00d1\u00d6\u0003\u0006\u0003\u0000\u00d2\u00d6\u0003\u0016\u000b"+
		"\u0000\u00d3\u00d6\u0003\u000e\u0007\u0000\u00d4\u00d6\u0005\u0006\u0000"+
		"\u0000\u00d5\u00ce\u0001\u0000\u0000\u0000\u00d5\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d0\u0001\u0000\u0000\u0000\u00d5\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0005\u0000\u0000\u0001\u00db\u0001\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005#\u0000\u0000\u00dd\u00de\u0007\u0000\u0000\u0000"+
		"\u00de\u00df\u0003\u00be_\u0000\u00df\u00e0\u0005f\u0000\u0000\u00e0\u0003"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e3\u0003\b\u0004\u0000\u00e2\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0003\u0006\u0003\u0000\u00e7\u0005\u0001"+
		"\u0000\u0000\u0000\u00e8\u00ea\u0003\u0018\f\u0000\u00e9\u00eb\u0005f"+
		"\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u0007\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u000b"+
		"\u0000\u0000\u00ed\u00ee\u0005j\u0000\u0000\u00ee\u00ef\u0003\n\u0005"+
		"\u0000\u00ef\u00f0\u0005k\u0000\u0000\u00f0\t\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f6\u0003\f\u0006\u0000\u00f2\u00f3\u0005g\u0000\u0000\u00f3"+
		"\u00f5\u0003\f\u0006\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f7\u000b\u0001\u0000\u0000\u0000\u00f8\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fc\u0003\u00b2Y\u0000\u00fa\u00fd\u0003"+
		"\u00c2a\u0000\u00fb\u00fd\u0003\u00b2Y\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\r\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0005$\u0000\u0000\u00ff\u0102\u0003\u00c0`\u0000\u0100\u0101"+
		"\u0005%\u0000\u0000\u0101\u0103\u0003\u00c0`\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0005f\u0000\u0000\u0105\u000f\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005\f\u0000\u0000\u0107\u0108\u0005j\u0000\u0000"+
		"\u0108\u0109\u0003\u0012\t\u0000\u0109\u010a\u0005k\u0000\u0000\u010a"+
		"\u0011\u0001\u0000\u0000\u0000\u010b\u0110\u0003\u0014\n\u0000\u010c\u010d"+
		"\u0005g\u0000\u0000\u010d\u010f\u0003\u0014\n\u0000\u010e\u010c\u0001"+
		"\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0013\u0001"+
		"\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0116\u0003"+
		"\u00b2Y\u0000\u0114\u0117\u0003\u00c2a\u0000\u0115\u0117\u0003\u00b2Y"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u0015\u0001\u0000\u0000\u0000\u0118\u011a\u0003\b\u0004\u0000"+
		"\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0003\u000e\u0007\u0000"+
		"\u011e\u0017\u0001\u0000\u0000\u0000\u011f\u0127\u0003\u001a\r\u0000\u0120"+
		"\u0127\u00036\u001b\u0000\u0121\u0127\u0003J%\u0000\u0122\u0127\u0003"+
		"R)\u0000\u0123\u0127\u0003V+\u0000\u0124\u0127\u0003X,\u0000\u0125\u0127"+
		"\u0003\\.\u0000\u0126\u011f\u0001\u0000\u0000\u0000\u0126\u0120\u0001"+
		"\u0000\u0000\u0000\u0126\u0121\u0001\u0000\u0000\u0000\u0126\u0122\u0001"+
		"\u0000\u0000\u0000\u0126\u0123\u0001\u0000\u0000\u0000\u0126\u0124\u0001"+
		"\u0000\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u0019\u0001"+
		"\u0000\u0000\u0000\u0128\u012a\u0005&\u0000\u0000\u0129\u012b\u00034\u001a"+
		"\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u0134\u0003\u00b6[\u0000"+
		"\u012d\u0134\u0003\u001c\u000e\u0000\u012e\u012f\u0003(\u0014\u0000\u012f"+
		"\u0130\u0005j\u0000\u0000\u0130\u0131\u0003n7\u0000\u0131\u0132\u0005"+
		"k\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0128\u0001\u0000"+
		"\u0000\u0000\u0133\u012d\u0001\u0000\u0000\u0000\u0133\u012e\u0001\u0000"+
		"\u0000\u0000\u0134\u001b\u0001\u0000\u0000\u0000\u0135\u0137\u0005&\u0000"+
		"\u0000\u0136\u0138\u00034\u001a\u0000\u0137\u0136\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000"+
		"\u0139\u013b\u0003\u00b6[\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c"+
		"\u013e\u0005i\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0144"+
		"\u0003\u001e\u000f\u0000\u0140\u0141\u0005i\u0000\u0000\u0141\u0143\u0003"+
		"\u001e\u000f\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0146\u0001"+
		"\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0144\u0001"+
		"\u0000\u0000\u0000\u0147\u0149\u0005i\u0000\u0000\u0148\u0147\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u001d\u0001\u0000"+
		"\u0000\u0000\u014a\u014c\u0003 \u0010\u0000\u014b\u014d\u00034\u001a\u0000"+
		"\u014c\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0003r9\u0000\u014f\u0167"+
		"\u0001\u0000\u0000\u0000\u0150\u0152\u0003\"\u0011\u0000\u0151\u0153\u0003"+
		"4\u001a\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155\u0003r9\u0000"+
		"\u0155\u0167\u0001\u0000\u0000\u0000\u0156\u0158\u0003$\u0012\u0000\u0157"+
		"\u0159\u00034\u001a\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0003r9\u0000\u015b\u0167\u0001\u0000\u0000\u0000\u015c\u015d\u0003&"+
		"\u0013\u0000\u015d\u015e\u0005j\u0000\u0000\u015e\u015f\u0003n7\u0000"+
		"\u015f\u0160\u0005k\u0000\u0000\u0160\u0167\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0003*\u0015\u0000\u0162\u0163\u0005j\u0000\u0000\u0163\u0164\u0003"+
		"\u0092I\u0000\u0164\u0165\u0005k\u0000\u0000\u0165\u0167\u0001\u0000\u0000"+
		"\u0000\u0166\u014a\u0001\u0000\u0000\u0000\u0166\u0150\u0001\u0000\u0000"+
		"\u0000\u0166\u0156\u0001\u0000\u0000\u0000\u0166\u015c\u0001\u0000\u0000"+
		"\u0000\u0166\u0161\u0001\u0000\u0000\u0000\u0167\u001f\u0001\u0000\u0000"+
		"\u0000\u0168\u0171\u0005n\u0000\u0000\u0169\u0171\u0005o\u0000\u0000\u016a"+
		"\u0171\u0003,\u0016\u0000\u016b\u016d\u0005(\u0000\u0000\u016c\u016b\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0005+\u0000\u0000\u016f\u0171\u0005,\u0000"+
		"\u0000\u0170\u0168\u0001\u0000\u0000\u0000\u0170\u0169\u0001\u0000\u0000"+
		"\u0000\u0170\u016a\u0001\u0000\u0000\u0000\u0170\u016c\u0001\u0000\u0000"+
		"\u0000\u0171!\u0001\u0000\u0000\u0000\u0172\u0173\u0003.\u0017\u0000\u0173"+
		"\u0174\u0005.\u0000\u0000\u0174#\u0001\u0000\u0000\u0000\u0175\u0176\u0003"+
		"0\u0018\u0000\u0176\u0177\u00050\u0000\u0000\u0177%\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u00030\u0018\u0000\u0179\u017a\u00051\u0000\u0000\u017a"+
		"\u017b\u0005,\u0000\u0000\u017b\'\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0005V\u0000\u0000\u017d\u017e\u0005/\u0000\u0000\u017e\u017f\u0005\'"+
		"\u0000\u0000\u017f)\u0001\u0000\u0000\u0000\u0180\u0181\u00032\u0019\u0000"+
		"\u0181\u0182\u00053\u0000\u0000\u0182+\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\u0005(\u0000\u0000\u0184\u0185\u0007\u0001\u0000\u0000\u0185-\u0001\u0000"+
		"\u0000\u0000\u0186\u0188\u0005(\u0000\u0000\u0187\u0186\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0005-\u0000\u0000\u018a/\u0001\u0000\u0000\u0000\u018b"+
		"\u018d\u0005(\u0000\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0005/\u0000\u0000\u018f1\u0001\u0000\u0000\u0000\u0190\u0192\u00052"+
		"\u0000\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000"+
		"\u0000\u0000\u01923\u0001\u0000\u0000\u0000\u0193\u0194\u0003\u00c2a\u0000"+
		"\u01945\u0001\u0000\u0000\u0000\u0195\u0196\u00054\u0000\u0000\u0196\u0197"+
		"\u00055\u0000\u0000\u0197\u0199\u0001\u0000\u0000\u0000\u0198\u019a\u0003"+
		"4\u001a\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u01a0\u0003\u00b8"+
		"\\\u0000\u019c\u01a0\u0003:\u001d\u0000\u019d\u01a0\u00038\u001c\u0000"+
		"\u019e\u01a0\u0003H$\u0000\u019f\u0195\u0001\u0000\u0000\u0000\u019f\u019c"+
		"\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u019e"+
		"\u0001\u0000\u0000\u0000\u01a07\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005"+
		"4\u0000\u0000\u01a2\u01a3\u00055\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a6\u00034\u001a\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a9\u0003\u00b8\\\u0000\u01a8\u01aa\u0005i\u0000\u0000\u01a9"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ad\u0003>\u001f\u0000\u01ac\u01ae"+
		"\u00034\u001a\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001"+
		"\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0003"+
		"\u008aE\u0000\u01b0\u01b2\u0005i\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b29\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u00054\u0000\u0000\u01b4\u01b5\u00055\u0000\u0000\u01b5\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b8\u00034\u001a\u0000\u01b7\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b9\u01bb\u0003\u00b8\\\u0000\u01ba\u01bc\u0005i"+
		"\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01c4\u0003<\u001e"+
		"\u0000\u01be\u01c0\u0005i\u0000\u0000\u01bf\u01be\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c3\u0003<\u001e\u0000\u01c2\u01bf\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c9\u0005i\u0000\u0000\u01c8\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9;\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cc\u0003@ \u0000\u01cb\u01cd\u00034\u001a"+
		"\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01cf\u0003r9\u0000\u01cf"+
		"\u01fc\u0001\u0000\u0000\u0000\u01d0\u01d2\u0003B!\u0000\u01d1\u01d3\u0003"+
		"4\u001a\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u0003r9\u0000"+
		"\u01d5\u01fc\u0001\u0000\u0000\u0000\u01d6\u01d7\u0003D\"\u0000\u01d7"+
		"\u01d8\u0005j\u0000\u0000\u01d8\u01d9\u0003\u0094J\u0000\u01d9\u01da\u0005"+
		"k\u0000\u0000\u01da\u01fc\u0001\u0000\u0000\u0000\u01db\u01dd\u0003>\u001f"+
		"\u0000\u01dc\u01de\u00034\u001a\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000"+
		"\u01df\u01e0\u0003\u008aE\u0000\u01e0\u01fc\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e3\u0003\"\u0011\u0000\u01e2\u01e4\u00034\u001a\u0000\u01e3\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0003\u0090H\u0000\u01e6\u01fc\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e9\u0003$\u0012\u0000\u01e8\u01ea\u00034\u001a"+
		"\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ec\u0003\u0090H\u0000"+
		"\u01ec\u01fc\u0001\u0000\u0000\u0000\u01ed\u01ef\u0003F#\u0000\u01ee\u01f0"+
		"\u00034\u001a\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0003"+
		"\u008aE\u0000\u01f2\u01fc\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005:\u0000"+
		"\u0000\u01f4\u01f6\u0005j\u0000\u0000\u01f5\u01f7\u00034\u001a\u0000\u01f6"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7"+
		"\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0003\u008aE\u0000\u01f9\u01fa"+
		"\u0005k\u0000\u0000\u01fa\u01fc\u0001\u0000\u0000\u0000\u01fb\u01ca\u0001"+
		"\u0000\u0000\u0000\u01fb\u01d0\u0001\u0000\u0000\u0000\u01fb\u01d6\u0001"+
		"\u0000\u0000\u0000\u01fb\u01db\u0001\u0000\u0000\u0000\u01fb\u01e1\u0001"+
		"\u0000\u0000\u0000\u01fb\u01e7\u0001\u0000\u0000\u0000\u01fb\u01ed\u0001"+
		"\u0000\u0000\u0000\u01fb\u01f3\u0001\u0000\u0000\u0000\u01fc=\u0001\u0000"+
		"\u0000\u0000\u01fd\u0205\u0005n\u0000\u0000\u01fe\u0205\u0005o\u0000\u0000"+
		"\u01ff\u0201\u0005(\u0000\u0000\u0200\u01ff\u0001\u0000\u0000\u0000\u0200"+
		"\u0201\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u00056\u0000\u0000\u0203\u0205\u0005,\u0000\u0000\u0204\u01fd\u0001"+
		"\u0000\u0000\u0000\u0204\u01fe\u0001\u0000\u0000\u0000\u0204\u0200\u0001"+
		"\u0000\u0000\u0000\u0205?\u0001\u0000\u0000\u0000\u0206\u0207\u00032\u0019"+
		"\u0000\u0207\u0208\u00057\u0000\u0000\u0208A\u0001\u0000\u0000\u0000\u0209"+
		"\u020a\u00032\u0019\u0000\u020a\u020b\u00058\u0000\u0000\u020bC\u0001"+
		"\u0000\u0000\u0000\u020c\u020d\u00032\u0019\u0000\u020d\u020e\u00059\u0000"+
		"\u0000\u020eE\u0001\u0000\u0000\u0000\u020f\u0211\u0005(\u0000\u0000\u0210"+
		"\u020f\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211"+
		"\u0212\u0001\u0000\u0000\u0000\u0212\u0213\u0005:\u0000\u0000\u0213\u0214"+
		"\u0005,\u0000\u0000\u0214G\u0001\u0000\u0000\u0000\u0215\u0216\u00054"+
		"\u0000\u0000\u0216\u0217\u00055\u0000\u0000\u0217\u0219\u0001\u0000\u0000"+
		"\u0000\u0218\u021a\u00034\u001a\u0000\u0219\u0218\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000"+
		"\u021b\u021d\u0003\u00b8\\\u0000\u021c\u021e\u0005i\u0000\u0000\u021d"+
		"\u021c\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e"+
		"\u022d\u0001\u0000\u0000\u0000\u021f\u0221\u0003F#\u0000\u0220\u0222\u0003"+
		"4\u001a\u0000\u0221\u0220\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000"+
		"\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0224\u0003\u008a"+
		"E\u0000\u0224\u022e\u0001\u0000\u0000\u0000\u0225\u0226\u0005:\u0000\u0000"+
		"\u0226\u0228\u0005j\u0000\u0000\u0227\u0229\u00034\u001a\u0000\u0228\u0227"+
		"\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022a"+
		"\u0001\u0000\u0000\u0000\u022a\u022b\u0003\u008aE\u0000\u022b\u022c\u0005"+
		"k\u0000\u0000\u022c\u022e\u0001\u0000\u0000\u0000\u022d\u021f\u0001\u0000"+
		"\u0000\u0000\u022d\u0225\u0001\u0000\u0000\u0000\u022e\u0230\u0001\u0000"+
		"\u0000\u0000\u022f\u0231\u0005i\u0000\u0000\u0230\u022f\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231I\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0005;\u0000\u0000\u0233\u0234\u00055\u0000\u0000\u0234\u0236"+
		"\u0001\u0000\u0000\u0000\u0235\u0237\u00034\u001a\u0000\u0236\u0235\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0238\u0001"+
		"\u0000\u0000\u0000\u0238\u023c\u0003\u00b8\\\u0000\u0239\u023c\u0003N"+
		"\'\u0000\u023a\u023c\u0003L&\u0000\u023b\u0232\u0001\u0000\u0000\u0000"+
		"\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023a\u0001\u0000\u0000\u0000"+
		"\u023cK\u0001\u0000\u0000\u0000\u023d\u023e\u0005;\u0000\u0000\u023e\u023f"+
		"\u00055\u0000\u0000\u023f\u0241\u0001\u0000\u0000\u0000\u0240\u0242\u0003"+
		"4\u001a\u0000\u0241\u0240\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000"+
		"\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0245\u0003\u00b8"+
		"\\\u0000\u0244\u0246\u0005i\u0000\u0000\u0245\u0244\u0001\u0000\u0000"+
		"\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000"+
		"\u0000\u0247\u0248\u0003>\u001f\u0000\u0248\u024a\u0003\u008aE\u0000\u0249"+
		"\u024b\u0005i\u0000\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024a\u024b"+
		"\u0001\u0000\u0000\u0000\u024bM\u0001\u0000\u0000\u0000\u024c\u024d\u0005"+
		";\u0000\u0000\u024d\u024e\u00055\u0000\u0000\u024e\u0250\u0001\u0000\u0000"+
		"\u0000\u024f\u0251\u00034\u001a\u0000\u0250\u024f\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000"+
		"\u0252\u0254\u0003\u00b8\\\u0000\u0253\u0255\u0005i\u0000\u0000\u0254"+
		"\u0253\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255"+
		"\u0256\u0001\u0000\u0000\u0000\u0256\u025d\u0003P(\u0000\u0257\u0259\u0005"+
		"i\u0000\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000"+
		"\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025c\u0003P(\u0000"+
		"\u025b\u0258\u0001\u0000\u0000\u0000\u025c\u025f\u0001\u0000\u0000\u0000"+
		"\u025d\u025b\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000"+
		"\u025e\u0261\u0001\u0000\u0000\u0000\u025f\u025d\u0001\u0000\u0000\u0000"+
		"\u0260\u0262\u0005i\u0000\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0261"+
		"\u0262\u0001\u0000\u0000\u0000\u0262O\u0001\u0000\u0000\u0000\u0263\u0264"+
		"\u0003@ \u0000\u0264\u0265\u0003r9\u0000\u0265\u0278\u0001\u0000\u0000"+
		"\u0000\u0266\u0267\u0003B!\u0000\u0267\u0268\u0003\u009cN\u0000\u0268"+
		"\u0278\u0001\u0000\u0000\u0000\u0269\u026a\u0003D\"\u0000\u026a\u026b"+
		"\u0005j\u0000\u0000\u026b\u026c\u0003\u0098L\u0000\u026c\u026d\u0005k"+
		"\u0000\u0000\u026d\u0278\u0001\u0000\u0000\u0000\u026e\u026f\u0003>\u001f"+
		"\u0000\u026f\u0270\u0003\u008aE\u0000\u0270\u0278\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0003\"\u0011\u0000\u0272\u0273\u0003\u0090H\u0000\u0273"+
		"\u0278\u0001\u0000\u0000\u0000\u0274\u0275\u0003$\u0012\u0000\u0275\u0276"+
		"\u0003\u0090H\u0000\u0276\u0278\u0001\u0000\u0000\u0000\u0277\u0263\u0001"+
		"\u0000\u0000\u0000\u0277\u0266\u0001\u0000\u0000\u0000\u0277\u0269\u0001"+
		"\u0000\u0000\u0000\u0277\u026e\u0001\u0000\u0000\u0000\u0277\u0271\u0001"+
		"\u0000\u0000\u0000\u0277\u0274\u0001\u0000\u0000\u0000\u0278Q\u0001\u0000"+
		"\u0000\u0000\u0279\u027a\u0005<\u0000\u0000\u027a\u027b\u00055\u0000\u0000"+
		"\u027b\u027d\u0001\u0000\u0000\u0000\u027c\u027e\u00034\u001a\u0000\u027d"+
		"\u027c\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e"+
		"\u027f\u0001\u0000\u0000\u0000\u027f\u0281\u0003\u00b8\\\u0000\u0280\u0282"+
		"\u0005i\u0000\u0000\u0281\u0280\u0001\u0000\u0000\u0000\u0281\u0282\u0001"+
		"\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u028a\u0003"+
		"T*\u0000\u0284\u0286\u0005i\u0000\u0000\u0285\u0284\u0001\u0000\u0000"+
		"\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000"+
		"\u0000\u0287\u0289\u0003T*\u0000\u0288\u0285\u0001\u0000\u0000\u0000\u0289"+
		"\u028c\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028a"+
		"\u028b\u0001\u0000\u0000\u0000\u028b\u028e\u0001\u0000\u0000\u0000\u028c"+
		"\u028a\u0001\u0000\u0000\u0000\u028d\u028f\u0005i\u0000\u0000\u028e\u028d"+
		"\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0298"+
		"\u0001\u0000\u0000\u0000\u0290\u0291\u0005<\u0000\u0000\u0291\u0292\u0005"+
		"5\u0000\u0000\u0292\u0294\u0001\u0000\u0000\u0000\u0293\u0295\u00034\u001a"+
		"\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000"+
		"\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u0298\u0003\u00b8\\\u0000"+
		"\u0297\u0279\u0001\u0000\u0000\u0000\u0297\u0290\u0001\u0000\u0000\u0000"+
		"\u0298S\u0001\u0000\u0000\u0000\u0299\u029b\u0003>\u001f\u0000\u029a\u029c"+
		"\u00034\u001a\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029b\u029c\u0001"+
		"\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u029e\u0003"+
		"\u008aE\u0000\u029eU\u0001\u0000\u0000\u0000\u029f\u02a1\u0005=\u0000"+
		"\u0000\u02a0\u02a2\u00034\u001a\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000"+
		"\u02a3\u02ac\u0003\u00bc^\u0000\u02a4\u02a6\u0005>\u0000\u0000\u02a5\u02a7"+
		"\u00034\u001a\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02a9\u0003"+
		"\u00bc^\u0000\u02a9\u02aa\u0003\u009cN\u0000\u02aa\u02ac\u0001\u0000\u0000"+
		"\u0000\u02ab\u029f\u0001\u0000\u0000\u0000\u02ab\u02a4\u0001\u0000\u0000"+
		"\u0000\u02acW\u0001\u0000\u0000\u0000\u02ad\u02ae\u0003Z-\u0000\u02ae"+
		"\u02af\u0005j\u0000\u0000\u02af\u02b0\u0003\u008eG\u0000\u02b0\u02b1\u0005"+
		"k\u0000\u0000\u02b1\u02b3\u0003>\u001f\u0000\u02b2\u02b4\u00034\u001a"+
		"\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b7\u0003\u008aE\u0000"+
		"\u02b6\u02b8\u0005i\u0000\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b8Y\u0001\u0000\u0000\u0000\u02b9\u02ba"+
		"\u00056\u0000\u0000\u02ba\u02bb\u0005?\u0000\u0000\u02bb[\u0001\u0000"+
		"\u0000\u0000\u02bc\u02be\u0005@\u0000\u0000\u02bd\u02bf\u00034\u001a\u0000"+
		"\u02be\u02bd\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c2\u0003\u00ba]\u0000\u02c1"+
		"\u02c3\u0005i\u0000\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c2\u02c3"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c6"+
		"\u0003^/\u0000\u02c5\u02c7\u0005i\u0000\u0000\u02c6\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02d1\u0001\u0000"+
		"\u0000\u0000\u02c8\u02ca\u0005@\u0000\u0000\u02c9\u02cb\u00034\u001a\u0000"+
		"\u02ca\u02c9\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000"+
		"\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02ce\u0003\u00ba]\u0000\u02cd"+
		"\u02cf\u0005i\u0000\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02ce\u02cf"+
		"\u0001\u0000\u0000\u0000\u02cf\u02d1\u0001\u0000\u0000\u0000\u02d0\u02bc"+
		"\u0001\u0000\u0000\u0000\u02d0\u02c8\u0001\u0000\u0000\u0000\u02d1]\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d7\u0003`0\u0000\u02d3\u02d4\u0005i\u0000"+
		"\u0000\u02d4\u02d6\u0003j5\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d9\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d7"+
		"\u02d8\u0001\u0000\u0000\u0000\u02d8\u02de\u0001\u0000\u0000\u0000\u02d9"+
		"\u02d7\u0001\u0000\u0000\u0000\u02da\u02db\u0005i\u0000\u0000\u02db\u02dd"+
		"\u0003d2\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dd\u02e0\u0001\u0000"+
		"\u0000\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000"+
		"\u0000\u0000\u02df\u02f2\u0001\u0000\u0000\u0000\u02e0\u02de\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e6\u0003j5\u0000\u02e2\u02e3\u0005i\u0000\u0000"+
		"\u02e3\u02e5\u0003j5\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e5\u02e8"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e7\u02ed\u0001\u0000\u0000\u0000\u02e8\u02e6"+
		"\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005i\u0000\u0000\u02ea\u02ec\u0003"+
		"d2\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02ec\u02ef\u0001\u0000\u0000"+
		"\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000"+
		"\u0000\u02ee\u02f2\u0001\u0000\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000"+
		"\u0000\u02f0\u02f2\u0003d2\u0000\u02f1\u02d2\u0001\u0000\u0000\u0000\u02f1"+
		"\u02e1\u0001\u0000\u0000\u0000\u02f1\u02f0\u0001\u0000\u0000\u0000\u02f2"+
		"_\u0001\u0000\u0000\u0000\u02f3\u02f4\u0005A\u0000\u0000\u02f4\u02f9\u0003"+
		"n7\u0000\u02f5\u02f6\u0003b1\u0000\u02f6\u02f7\u0003n7\u0000\u02f7\u02f9"+
		"\u0001\u0000\u0000\u0000\u02f8\u02f3\u0001\u0000\u0000\u0000\u02f8\u02f5"+
		"\u0001\u0000\u0000\u0000\u02f9a\u0001\u0000\u0000\u0000\u02fa\u02fb\u0003"+
		",\u0016\u0000\u02fbc\u0001\u0000\u0000\u0000\u02fc\u02fd\u0003f3\u0000"+
		"\u02fd\u02fe\u0003\u00b0X\u0000\u02fe\u0303\u0001\u0000\u0000\u0000\u02ff"+
		"\u0300\u0003h4\u0000\u0300\u0301\u0003\u00b0X\u0000\u0301\u0303\u0001"+
		"\u0000\u0000\u0000\u0302\u02fc\u0001\u0000\u0000\u0000\u0302\u02ff\u0001"+
		"\u0000\u0000\u0000\u0303e\u0001\u0000\u0000\u0000\u0304\u0306\u0005(\u0000"+
		"\u0000\u0305\u0304\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000"+
		"\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0308\u0005B\u0000\u0000"+
		"\u0308\u0309\u0005C\u0000\u0000\u0309g\u0001\u0000\u0000\u0000\u030a\u030c"+
		"\u0005(\u0000\u0000\u030b\u030a\u0001\u0000\u0000\u0000\u030b\u030c\u0001"+
		"\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d\u030e\u0005"+
		"D\u0000\u0000\u030e\u030f\u0005E\u0000\u0000\u030fi\u0001\u0000\u0000"+
		"\u0000\u0310\u0315\u0003l6\u0000\u0311\u0312\u0005g\u0000\u0000\u0312"+
		"\u0314\u0003l6\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0314\u0317\u0001"+
		"\u0000\u0000\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001"+
		"\u0000\u0000\u0000\u0316k\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000"+
		"\u0000\u0000\u0318\u031a\u00034\u001a\u0000\u0319\u0318\u0001\u0000\u0000"+
		"\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000"+
		"\u0000\u031b\u031c\u0003\u008aE\u0000\u031c\u031d\u0003\u00b2Y\u0000\u031d"+
		"\u032d\u0001\u0000\u0000\u0000\u031e\u031f\u0003\u008aE\u0000\u031f\u0320"+
		"\u0003\u00c2a\u0000\u0320\u032d\u0001\u0000\u0000\u0000\u0321\u0323\u0007"+
		"\u0002\u0000\u0000\u0322\u0324\u00034\u001a\u0000\u0323\u0322\u0001\u0000"+
		"\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000"+
		"\u0000\u0000\u0325\u0326\u0003\u008aE\u0000\u0326\u0327\u0003\u00b2Y\u0000"+
		"\u0327\u032d\u0001\u0000\u0000\u0000\u0328\u0329\u0007\u0002\u0000\u0000"+
		"\u0329\u032a\u0003\u008aE\u0000\u032a\u032b\u0003\u00c2a\u0000\u032b\u032d"+
		"\u0001\u0000\u0000\u0000\u032c\u0319\u0001\u0000\u0000\u0000\u032c\u031e"+
		"\u0001\u0000\u0000\u0000\u032c\u0321\u0001\u0000\u0000\u0000\u032c\u0328"+
		"\u0001\u0000\u0000\u0000\u032dm\u0001\u0000\u0000\u0000\u032e\u0333\u0003"+
		"r9\u0000\u032f\u0330\u0005g\u0000\u0000\u0330\u0332\u0003r9\u0000\u0331"+
		"\u032f\u0001\u0000\u0000\u0000\u0332\u0335\u0001\u0000\u0000\u0000\u0333"+
		"\u0331\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0334"+
		"o\u0001\u0000\u0000\u0000\u0335\u0333\u0001\u0000\u0000\u0000\u0336\u0343"+
		"\u0003r9\u0000\u0337\u0338\u0005g\u0000\u0000\u0338\u033a\u0003r9\u0000"+
		"\u0339\u0337\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000"+
		"\u033b\u0339\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000"+
		"\u033c\u0344\u0001\u0000\u0000\u0000\u033d\u033e\u0005G\u0000\u0000\u033e"+
		"\u0340\u0003r9\u0000\u033f\u033d\u0001\u0000\u0000\u0000\u0340\u0341\u0001"+
		"\u0000\u0000\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0341\u0342\u0001"+
		"\u0000\u0000\u0000\u0342\u0344\u0001\u0000\u0000\u0000\u0343\u0339\u0001"+
		"\u0000\u0000\u0000\u0343\u033f\u0001\u0000\u0000\u0000\u0343\u0344\u0001"+
		"\u0000\u0000\u0000\u0344q\u0001\u0000\u0000\u0000\u0345\u0346\u0003t:"+
		"\u0000\u0346s\u0001\u0000\u0000\u0000\u0347\u034d\u0003v;\u0000\u0348"+
		"\u0349\u0003\u0088D\u0000\u0349\u034a\u0003v;\u0000\u034a\u034c\u0001"+
		"\u0000\u0000\u0000\u034b\u0348\u0001\u0000\u0000\u0000\u034c\u034f\u0001"+
		"\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034d\u034e\u0001"+
		"\u0000\u0000\u0000\u034eu\u0001\u0000\u0000\u0000\u034f\u034d\u0001\u0000"+
		"\u0000\u0000\u0350\u0356\u0003x<\u0000\u0351\u0352\u0005j\u0000\u0000"+
		"\u0352\u0353\u0003r9\u0000\u0353\u0354\u0005k\u0000\u0000\u0354\u0356"+
		"\u0001\u0000\u0000\u0000\u0355\u0350\u0001\u0000\u0000\u0000\u0355\u0351"+
		"\u0001\u0000\u0000\u0000\u0356w\u0001\u0000\u0000\u0000\u0357\u0359\u0003"+
		"4\u001a\u0000\u0358\u0357\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000"+
		"\u0000\u0000\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u035c\u0003\u00b2"+
		"Y\u0000\u035b\u035d\u0003\u0086C\u0000\u035c\u035b\u0001\u0000\u0000\u0000"+
		"\u035d\u035e\u0001\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000\u0000"+
		"\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u044d\u0001\u0000\u0000\u0000"+
		"\u0360\u0362\u00034\u001a\u0000\u0361\u0360\u0001\u0000\u0000\u0000\u0361"+
		"\u0362\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363"+
		"\u044d\u0003\u00b2Y\u0000\u0364\u044d\u0005I\u0000\u0000\u0365\u044d\u0005"+
		"J\u0000\u0000\u0366\u0367\u0007\u0002\u0000\u0000\u0367\u044d\u0003v;"+
		"\u0000\u0368\u036a\u0007\u0003\u0000\u0000\u0369\u036b\u00034\u001a\u0000"+
		"\u036a\u0369\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000"+
		"\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036e\u0003\u008aE\u0000\u036d"+
		"\u036f\u00034\u001a\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036e\u036f"+
		"\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000\u0370\u0371"+
		"\u0003r9\u0000\u0371\u044d\u0001\u0000\u0000\u0000\u0372\u0374\u0007\u0004"+
		"\u0000\u0000\u0373\u0375\u00034\u001a\u0000\u0374\u0373\u0001\u0000\u0000"+
		"\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000"+
		"\u0000\u0376\u0378\u0003\u008aE\u0000\u0377\u0379\u00034\u001a\u0000\u0378"+
		"\u0377\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379"+
		"\u037a\u0001\u0000\u0000\u0000\u037a\u037b\u0003r9\u0000\u037b\u044d\u0001"+
		"\u0000\u0000\u0000\u037c\u037d\u00032\u0019\u0000\u037d\u037f\u0005M\u0000"+
		"\u0000\u037e\u0380\u00034\u001a\u0000\u037f\u037e\u0001\u0000\u0000\u0000"+
		"\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000"+
		"\u0381\u0382\u0003\u008aE\u0000\u0382\u0383\u0003\u00b2Y\u0000\u0383\u044d"+
		"\u0001\u0000\u0000\u0000\u0384\u0385\u00032\u0019\u0000\u0385\u0386\u0005"+
		"M\u0000\u0000\u0386\u0387\u0003\u008aE\u0000\u0387\u0388\u0003\u00c2a"+
		"\u0000\u0388\u044d\u0001\u0000\u0000\u0000\u0389\u038a\u0005N\u0000\u0000"+
		"\u038a\u038c\u0005\u0010\u0000\u0000\u038b\u038d\u00034\u001a\u0000\u038c"+
		"\u038b\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d"+
		"\u038e\u0001\u0000\u0000\u0000\u038e\u0393\u0003\u008aE\u0000\u038f\u0391"+
		"\u00034\u001a\u0000\u0390\u038f\u0001\u0000\u0000\u0000\u0390\u0391\u0001"+
		"\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392\u0394\u0003"+
		"r9\u0000\u0393\u0390\u0001\u0000\u0000\u0000\u0393\u0394\u0001\u0000\u0000"+
		"\u0000\u0394\u044d\u0001\u0000\u0000\u0000\u0395\u0396\u0005O\u0000\u0000"+
		"\u0396\u0398\u0005\u0010\u0000\u0000\u0397\u0399\u00034\u001a\u0000\u0398"+
		"\u0397\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399"+
		"\u039a\u0001\u0000\u0000\u0000\u039a\u039f\u0003\u008aE\u0000\u039b\u039d"+
		"\u00034\u001a\u0000\u039c\u039b\u0001\u0000\u0000\u0000\u039c\u039d\u0001"+
		"\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u03a0\u0003"+
		"r9\u0000\u039f\u039c\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000\u0000"+
		"\u0000\u03a0\u044d\u0001\u0000\u0000\u0000\u03a1\u03a2\u0005P\u0000\u0000"+
		"\u03a2\u03a4\u0005\u0010\u0000\u0000\u03a3\u03a5\u00034\u001a\u0000\u03a4"+
		"\u03a3\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5"+
		"\u03a6\u0001\u0000\u0000\u0000\u03a6\u03ab\u0003\u008aE\u0000\u03a7\u03a9"+
		"\u00034\u001a\u0000\u03a8\u03a7\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001"+
		"\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ac\u0003"+
		"r9\u0000\u03ab\u03a8\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000"+
		"\u0000\u03ac\u044d\u0001\u0000\u0000\u0000\u03ad\u03af\u0005Q\u0000\u0000"+
		"\u03ae\u03ad\u0001\u0000\u0000\u0000\u03ae\u03af\u0001\u0000\u0000\u0000"+
		"\u03af\u03b1\u0001\u0000\u0000\u0000\u03b0\u03b2\u00034\u001a\u0000\u03b1"+
		"\u03b0\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2"+
		"\u03b3\u0001\u0000\u0000\u0000\u03b3\u03b4\u0003\u008aE\u0000\u03b4\u03b6"+
		"\u0007\u0003\u0000\u0000\u03b5\u03b7\u00034\u001a\u0000\u03b6\u03b5\u0001"+
		"\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001"+
		"\u0000\u0000\u0000\u03b8\u03b9\u0003r9\u0000\u03b9\u044d\u0001\u0000\u0000"+
		"\u0000\u03ba\u03bc\u0005Q\u0000\u0000\u03bb\u03ba\u0001\u0000\u0000\u0000"+
		"\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u03be\u0001\u0000\u0000\u0000"+
		"\u03bd\u03bf\u00034\u001a\u0000\u03be\u03bd\u0001\u0000\u0000\u0000\u03be"+
		"\u03bf\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0"+
		"\u03c1\u0003\u008aE\u0000\u03c1\u03c3\u0007\u0004\u0000\u0000\u03c2\u03c4"+
		"\u00034\u001a\u0000\u03c3\u03c2\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001"+
		"\u0000\u0000\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5\u03c6\u0003"+
		"r9\u0000\u03c6\u044d\u0001\u0000\u0000\u0000\u03c7\u03c9\u0005Q\u0000"+
		"\u0000\u03c8\u03c7\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000"+
		"\u0000\u03c9\u03cb\u0001\u0000\u0000\u0000\u03ca\u03cc\u00034\u001a\u0000"+
		"\u03cb\u03ca\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000"+
		"\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03ce\u0003\u008aE\u0000\u03ce"+
		"\u03cf\u00032\u0019\u0000\u03cf\u03d0\u0005M\u0000\u0000\u03d0\u03d1\u0003"+
		"\u00b2Y\u0000\u03d1\u044d\u0001\u0000\u0000\u0000\u03d2\u03d4\u0005Q\u0000"+
		"\u0000\u03d3\u03d2\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d6\u0003\u008aE\u0000"+
		"\u03d6\u03d7\u00032\u0019\u0000\u03d7\u03d8\u0005M\u0000\u0000\u03d8\u03d9"+
		"\u0003\u00c2a\u0000\u03d9\u044d\u0001\u0000\u0000\u0000\u03da\u03dc\u0005"+
		"Q\u0000\u0000\u03db\u03da\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000"+
		"\u0000\u0000\u03dc\u03de\u0001\u0000\u0000\u0000\u03dd\u03df\u00034\u001a"+
		"\u0000\u03de\u03dd\u0001\u0000\u0000\u0000\u03de\u03df\u0001\u0000\u0000"+
		"\u0000\u03df\u03e0\u0001\u0000\u0000\u0000\u03e0\u03e1\u0003\u008aE\u0000"+
		"\u03e1\u03e2\u0005N\u0000\u0000\u03e2\u03e7\u0005\u0010\u0000\u0000\u03e3"+
		"\u03e5\u00034\u001a\u0000\u03e4\u03e3\u0001\u0000\u0000\u0000\u03e4\u03e5"+
		"\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6\u03e8"+
		"\u0003r9\u0000\u03e7\u03e4\u0001\u0000\u0000\u0000\u03e7\u03e8\u0001\u0000"+
		"\u0000\u0000\u03e8\u044d\u0001\u0000\u0000\u0000\u03e9\u03eb\u0005Q\u0000"+
		"\u0000\u03ea\u03e9\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000"+
		"\u0000\u03eb\u03ed\u0001\u0000\u0000\u0000\u03ec\u03ee\u00034\u001a\u0000"+
		"\u03ed\u03ec\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000"+
		"\u03ee\u03ef\u0001\u0000\u0000\u0000\u03ef\u03f0\u0003\u008aE\u0000\u03f0"+
		"\u03f1\u0005O\u0000\u0000\u03f1\u03f6\u0005\u0010\u0000\u0000\u03f2\u03f4"+
		"\u00034\u001a\u0000\u03f3\u03f2\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001"+
		"\u0000\u0000\u0000\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f7\u0003"+
		"r9\u0000\u03f6\u03f3\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000"+
		"\u0000\u03f7\u044d\u0001\u0000\u0000\u0000\u03f8\u03fa\u0005Q\u0000\u0000"+
		"\u03f9\u03f8\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000"+
		"\u03fa\u03fc\u0001\u0000\u0000\u0000\u03fb\u03fd\u00034\u001a\u0000\u03fc"+
		"\u03fb\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000\u0000\u0000\u03fd"+
		"\u03fe\u0001\u0000\u0000\u0000\u03fe\u03ff\u0003\u008aE\u0000\u03ff\u0400"+
		"\u0005P\u0000\u0000\u0400\u0405\u0005\u0010\u0000\u0000\u0401\u0403\u0003"+
		"4\u001a\u0000\u0402\u0401\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000"+
		"\u0000\u0000\u0403\u0404\u0001\u0000\u0000\u0000\u0404\u0406\u0003r9\u0000"+
		"\u0405\u0402\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000"+
		"\u0406\u044d\u0001\u0000\u0000\u0000\u0407\u0408\u0003z=\u0000\u0408\u040a"+
		"\u0005\u0010\u0000\u0000\u0409\u040b\u00034\u001a\u0000\u040a\u0409\u0001"+
		"\u0000\u0000\u0000\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u040c\u0001"+
		"\u0000\u0000\u0000\u040c\u0411\u0003\u008aE\u0000\u040d\u040f\u00034\u001a"+
		"\u0000\u040e\u040d\u0001\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000"+
		"\u0000\u040f\u0410\u0001\u0000\u0000\u0000\u0410\u0412\u0003r9\u0000\u0411"+
		"\u040e\u0001\u0000\u0000\u0000\u0411\u0412\u0001\u0000\u0000\u0000\u0412"+
		"\u044d\u0001\u0000\u0000\u0000\u0413\u0414\u0003|>\u0000\u0414\u0416\u0005"+
		"\u0010\u0000\u0000\u0415\u0417\u00034\u001a\u0000\u0416\u0415\u0001\u0000"+
		"\u0000\u0000\u0416\u0417\u0001\u0000\u0000\u0000\u0417\u0418\u0001\u0000"+
		"\u0000\u0000\u0418\u041d\u0003\u008aE\u0000\u0419\u041b\u00034\u001a\u0000"+
		"\u041a\u0419\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000"+
		"\u041b\u041c\u0001\u0000\u0000\u0000\u041c\u041e\u0003r9\u0000\u041d\u041a"+
		"\u0001\u0000\u0000\u0000\u041d\u041e\u0001\u0000\u0000\u0000\u041e\u044d"+
		"\u0001\u0000\u0000\u0000\u041f\u0421\u0005Q\u0000\u0000\u0420\u041f\u0001"+
		"\u0000\u0000\u0000\u0420\u0421\u0001\u0000\u0000\u0000\u0421\u0423\u0001"+
		"\u0000\u0000\u0000\u0422\u0424\u00034\u001a\u0000\u0423\u0422\u0001\u0000"+
		"\u0000\u0000\u0423\u0424\u0001\u0000\u0000\u0000\u0424\u0425\u0001\u0000"+
		"\u0000\u0000\u0425\u0426\u0003\u008aE\u0000\u0426\u0427\u0003z=\u0000"+
		"\u0427\u042c\u0005\u0010\u0000\u0000\u0428\u042a\u00034\u001a\u0000\u0429"+
		"\u0428\u0001\u0000\u0000\u0000\u0429\u042a\u0001\u0000\u0000\u0000\u042a"+
		"\u042b\u0001\u0000\u0000\u0000\u042b\u042d\u0003r9\u0000\u042c\u0429\u0001"+
		"\u0000\u0000\u0000\u042c\u042d\u0001\u0000\u0000\u0000\u042d\u044d\u0001"+
		"\u0000\u0000\u0000\u042e\u0430\u0005Q\u0000\u0000\u042f\u042e\u0001\u0000"+
		"\u0000\u0000\u042f\u0430\u0001\u0000\u0000\u0000\u0430\u0432\u0001\u0000"+
		"\u0000\u0000\u0431\u0433\u00034\u001a\u0000\u0432\u0431\u0001\u0000\u0000"+
		"\u0000\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000"+
		"\u0000\u0434\u0435\u0003\u008aE\u0000\u0435\u0436\u0003|>\u0000\u0436"+
		"\u043b\u0005\u0010\u0000\u0000\u0437\u0439\u00034\u001a\u0000\u0438\u0437"+
		"\u0001\u0000\u0000\u0000\u0438\u0439\u0001\u0000\u0000\u0000\u0439\u043a"+
		"\u0001\u0000\u0000\u0000\u043a\u043c\u0003r9\u0000\u043b\u0438\u0001\u0000"+
		"\u0000\u0000\u043b\u043c\u0001\u0000\u0000\u0000\u043c\u044d\u0001\u0000"+
		"\u0000\u0000\u043d\u043e\u0003~?\u0000\u043e\u043f\u0005j\u0000\u0000"+
		"\u043f\u0440\u0003\u00b0X\u0000\u0440\u0441\u0005k\u0000\u0000\u0441\u044d"+
		"\u0001\u0000\u0000\u0000\u0442\u0443\u0003\u0080@\u0000\u0443\u0444\u0005"+
		"j\u0000\u0000\u0444\u0445\u0003p8\u0000\u0445\u0446\u0005k\u0000\u0000"+
		"\u0446\u044d\u0001\u0000\u0000\u0000\u0447\u0448\u0003\u0082A\u0000\u0448"+
		"\u0449\u0005j\u0000\u0000\u0449\u044a\u0003p8\u0000\u044a\u044b\u0005"+
		"k\u0000\u0000\u044b\u044d\u0001\u0000\u0000\u0000\u044c\u0358\u0001\u0000"+
		"\u0000\u0000\u044c\u0361\u0001\u0000\u0000\u0000\u044c\u0364\u0001\u0000"+
		"\u0000\u0000\u044c\u0365\u0001\u0000\u0000\u0000\u044c\u0366\u0001\u0000"+
		"\u0000\u0000\u044c\u0368\u0001\u0000\u0000\u0000\u044c\u0372\u0001\u0000"+
		"\u0000\u0000\u044c\u037c\u0001\u0000\u0000\u0000\u044c\u0384\u0001\u0000"+
		"\u0000\u0000\u044c\u0389\u0001\u0000\u0000\u0000\u044c\u0395\u0001\u0000"+
		"\u0000\u0000\u044c\u03a1\u0001\u0000\u0000\u0000\u044c\u03ae\u0001\u0000"+
		"\u0000\u0000\u044c\u03bb\u0001\u0000\u0000\u0000\u044c\u03c8\u0001\u0000"+
		"\u0000\u0000\u044c\u03d3\u0001\u0000\u0000\u0000\u044c\u03db\u0001\u0000"+
		"\u0000\u0000\u044c\u03ea\u0001\u0000\u0000\u0000\u044c\u03f9\u0001\u0000"+
		"\u0000\u0000\u044c\u0407\u0001\u0000\u0000\u0000\u044c\u0413\u0001\u0000"+
		"\u0000\u0000\u044c\u0420\u0001\u0000\u0000\u0000\u044c\u042f\u0001\u0000"+
		"\u0000\u0000\u044c\u043d\u0001\u0000\u0000\u0000\u044c\u0442\u0001\u0000"+
		"\u0000\u0000\u044c\u0447\u0001\u0000\u0000\u0000\u044dy\u0001\u0000\u0000"+
		"\u0000\u044e\u044f\u0005R\u0000\u0000\u044f\u0450\u0005S\u0000\u0000\u0450"+
		"{\u0001\u0000\u0000\u0000\u0451\u0452\u0005R\u0000\u0000\u0452\u0453\u0005"+
		"T\u0000\u0000\u0453}\u0001\u0000\u0000\u0000\u0454\u0456\u0005(\u0000"+
		"\u0000\u0455\u0454\u0001\u0000\u0000\u0000\u0455\u0456\u0001\u0000\u0000"+
		"\u0000\u0456\u0457\u0001\u0000\u0000\u0000\u0457\u0458\u0005U\u0000\u0000"+
		"\u0458\u0459\u0005,\u0000\u0000\u0459\u007f\u0001\u0000\u0000\u0000\u045a"+
		"\u045c\u0005(\u0000\u0000\u045b\u045a\u0001\u0000\u0000\u0000\u045b\u045c"+
		"\u0001\u0000\u0000\u0000\u045c\u045d\u0001\u0000\u0000\u0000\u045d\u045e"+
		"\u0005V\u0000\u0000\u045e\u045f\u0005,\u0000\u0000\u045f\u0081\u0001\u0000"+
		"\u0000\u0000\u0460\u0462\u0005(\u0000\u0000\u0461\u0460\u0001\u0000\u0000"+
		"\u0000\u0461\u0462\u0001\u0000\u0000\u0000\u0462\u0463\u0001\u0000\u0000"+
		"\u0000\u0463\u0464\u0005W\u0000\u0000\u0464\u0465\u0005,\u0000\u0000\u0465"+
		"\u0083\u0001\u0000\u0000\u0000\u0466\u046a\u0005Q\u0000\u0000\u0467\u0468"+
		"\u0005G\u0000\u0000\u0468\u046a\u0005Q\u0000\u0000\u0469\u0466\u0001\u0000"+
		"\u0000\u0000\u0469\u0467\u0001\u0000\u0000\u0000\u046a\u0085\u0001\u0000"+
		"\u0000\u0000\u046b\u046d\u0003\u0084B\u0000\u046c\u046e\u00034\u001a\u0000"+
		"\u046d\u046c\u0001\u0000\u0000\u0000\u046d\u046e\u0001\u0000\u0000\u0000"+
		"\u046e\u046f\u0001\u0000\u0000\u0000\u046f\u0470\u0003\u008aE\u0000\u0470"+
		"\u0472\u0007\u0003\u0000\u0000\u0471\u0473\u00034\u001a\u0000\u0472\u0471"+
		"\u0001\u0000\u0000\u0000\u0472\u0473\u0001\u0000\u0000\u0000\u0473\u0474"+
		"\u0001\u0000\u0000\u0000\u0474\u0475\u0003r9\u0000\u0475\u04d2\u0001\u0000"+
		"\u0000\u0000\u0476\u0478\u0003\u0084B\u0000\u0477\u0479\u00034\u001a\u0000"+
		"\u0478\u0477\u0001\u0000\u0000\u0000\u0478\u0479\u0001\u0000\u0000\u0000"+
		"\u0479\u047a\u0001\u0000\u0000\u0000\u047a\u047b\u0003\u008aE\u0000\u047b"+
		"\u047d\u0007\u0004\u0000\u0000\u047c\u047e\u00034\u001a\u0000\u047d\u047c"+
		"\u0001\u0000\u0000\u0000\u047d\u047e\u0001\u0000\u0000\u0000\u047e\u047f"+
		"\u0001\u0000\u0000\u0000\u047f\u0480\u0003r9\u0000\u0480\u04d2\u0001\u0000"+
		"\u0000\u0000\u0481\u0483\u0003\u0084B\u0000\u0482\u0484\u00034\u001a\u0000"+
		"\u0483\u0482\u0001\u0000\u0000\u0000\u0483\u0484\u0001\u0000\u0000\u0000"+
		"\u0484\u0485\u0001\u0000\u0000\u0000\u0485\u0486\u0003\u008aE\u0000\u0486"+
		"\u0487\u00032\u0019\u0000\u0487\u0488\u0005M\u0000\u0000\u0488\u0489\u0003"+
		"\u00b2Y\u0000\u0489\u04d2\u0001\u0000\u0000\u0000\u048a\u048b\u0003\u0084"+
		"B\u0000\u048b\u048c\u0003\u008aE\u0000\u048c\u048d\u00032\u0019\u0000"+
		"\u048d\u048e\u0005M\u0000\u0000\u048e\u048f\u0003\u00c2a\u0000\u048f\u04d2"+
		"\u0001\u0000\u0000\u0000\u0490\u0492\u0003\u0084B\u0000\u0491\u0493\u0003"+
		"4\u001a\u0000\u0492\u0491\u0001\u0000\u0000\u0000\u0492\u0493\u0001\u0000"+
		"\u0000\u0000\u0493\u0494\u0001\u0000\u0000\u0000\u0494\u0495\u0003\u008a"+
		"E\u0000\u0495\u0496\u0005N\u0000\u0000\u0496\u049b\u0005\u0010\u0000\u0000"+
		"\u0497\u0499\u00034\u001a\u0000\u0498\u0497\u0001\u0000\u0000\u0000\u0498"+
		"\u0499\u0001\u0000\u0000\u0000\u0499\u049a\u0001\u0000\u0000\u0000\u049a"+
		"\u049c\u0003r9\u0000\u049b\u0498\u0001\u0000\u0000\u0000\u049b\u049c\u0001"+
		"\u0000\u0000\u0000\u049c\u04d2\u0001\u0000\u0000\u0000\u049d\u049f\u0003"+
		"\u0084B\u0000\u049e\u04a0\u00034\u001a\u0000\u049f\u049e\u0001\u0000\u0000"+
		"\u0000\u049f\u04a0\u0001\u0000\u0000\u0000\u04a0\u04a1\u0001\u0000\u0000"+
		"\u0000\u04a1\u04a2\u0003\u008aE\u0000\u04a2\u04a3\u0005O\u0000\u0000\u04a3"+
		"\u04a8\u0005\u0010\u0000\u0000\u04a4\u04a6\u00034\u001a\u0000\u04a5\u04a4"+
		"\u0001\u0000\u0000\u0000\u04a5\u04a6\u0001\u0000\u0000\u0000\u04a6\u04a7"+
		"\u0001\u0000\u0000\u0000\u04a7\u04a9\u0003r9\u0000\u04a8\u04a5\u0001\u0000"+
		"\u0000\u0000\u04a8\u04a9\u0001\u0000\u0000\u0000\u04a9\u04d2\u0001\u0000"+
		"\u0000\u0000\u04aa\u04ac\u0003\u0084B\u0000\u04ab\u04ad\u00034\u001a\u0000"+
		"\u04ac\u04ab\u0001\u0000\u0000\u0000\u04ac\u04ad\u0001\u0000\u0000\u0000"+
		"\u04ad\u04ae\u0001\u0000\u0000\u0000\u04ae\u04af\u0003\u008aE\u0000\u04af"+
		"\u04b0\u0005P\u0000\u0000\u04b0\u04b5\u0005\u0010\u0000\u0000\u04b1\u04b3"+
		"\u00034\u001a\u0000\u04b2\u04b1\u0001\u0000\u0000\u0000\u04b2\u04b3\u0001"+
		"\u0000\u0000\u0000\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4\u04b6\u0003"+
		"r9\u0000\u04b5\u04b2\u0001\u0000\u0000\u0000\u04b5\u04b6\u0001\u0000\u0000"+
		"\u0000\u04b6\u04d2\u0001\u0000\u0000\u0000\u04b7\u04b9\u0003\u0084B\u0000"+
		"\u04b8\u04ba\u00034\u001a\u0000\u04b9\u04b8\u0001\u0000\u0000\u0000\u04b9"+
		"\u04ba\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000\u04bb"+
		"\u04bc\u0003\u008aE\u0000\u04bc\u04bd\u0003z=\u0000\u04bd\u04c2\u0005"+
		"\u0010\u0000\u0000\u04be\u04c0\u00034\u001a\u0000\u04bf\u04be\u0001\u0000"+
		"\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0\u04c1\u0001\u0000"+
		"\u0000\u0000\u04c1\u04c3\u0003r9\u0000\u04c2\u04bf\u0001\u0000\u0000\u0000"+
		"\u04c2\u04c3\u0001\u0000\u0000\u0000\u04c3\u04d2\u0001\u0000\u0000\u0000"+
		"\u04c4\u04c6\u0003\u0084B\u0000\u04c5\u04c7\u00034\u001a\u0000\u04c6\u04c5"+
		"\u0001\u0000\u0000\u0000\u04c6\u04c7\u0001\u0000\u0000\u0000\u04c7\u04c8"+
		"\u0001\u0000\u0000\u0000\u04c8\u04c9\u0003\u008aE\u0000\u04c9\u04ca\u0003"+
		"|>\u0000\u04ca\u04cf\u0005\u0010\u0000\u0000\u04cb\u04cd\u00034\u001a"+
		"\u0000\u04cc\u04cb\u0001\u0000\u0000\u0000\u04cc\u04cd\u0001\u0000\u0000"+
		"\u0000\u04cd\u04ce\u0001\u0000\u0000\u0000\u04ce\u04d0\u0003r9\u0000\u04cf"+
		"\u04cc\u0001\u0000\u0000\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000\u04d0"+
		"\u04d2\u0001\u0000\u0000\u0000\u04d1\u046b\u0001\u0000\u0000\u0000\u04d1"+
		"\u0476\u0001\u0000\u0000\u0000\u04d1\u0481\u0001\u0000\u0000\u0000\u04d1"+
		"\u048a\u0001\u0000\u0000\u0000\u04d1\u0490\u0001\u0000\u0000\u0000\u04d1"+
		"\u049d\u0001\u0000\u0000\u0000\u04d1\u04aa\u0001\u0000\u0000\u0000\u04d1"+
		"\u04b7\u0001\u0000\u0000\u0000\u04d1\u04c4\u0001\u0000\u0000\u0000\u04d2"+
		"\u0087\u0001\u0000\u0000\u0000\u04d3\u04d8\u0005G\u0000\u0000\u04d4\u04d8"+
		"\u0005q\u0000\u0000\u04d5\u04d8\u0005H\u0000\u0000\u04d6\u04d8\u0005r"+
		"\u0000\u0000\u04d7\u04d3\u0001\u0000\u0000\u0000\u04d7\u04d4\u0001\u0000"+
		"\u0000\u0000\u04d7\u04d5\u0001\u0000\u0000\u0000\u04d7\u04d6\u0001\u0000"+
		"\u0000\u0000\u04d8\u0089\u0001\u0000\u0000\u0000\u04d9\u04e3\u0003\u00b2"+
		"Y\u0000\u04da\u04db\u0005:\u0000\u0000\u04db\u04dc\u0005j\u0000\u0000"+
		"\u04dc\u04dd\u0003\u008aE\u0000\u04dd\u04de\u0005k\u0000\u0000\u04de\u04e3"+
		"\u0001\u0000\u0000\u0000\u04df\u04e0\u0003F#\u0000\u04e0\u04e1\u0003\u008a"+
		"E\u0000\u04e1\u04e3\u0001\u0000\u0000\u0000\u04e2\u04d9\u0001\u0000\u0000"+
		"\u0000\u04e2\u04da\u0001\u0000\u0000\u0000\u04e2\u04df\u0001\u0000\u0000"+
		"\u0000\u04e3\u008b\u0001\u0000\u0000\u0000\u04e4\u04e9\u0003\u008aE\u0000"+
		"\u04e5\u04e6\u0007\u0005\u0000\u0000\u04e6\u04e8\u0003\u008aE\u0000\u04e7"+
		"\u04e5\u0001\u0000\u0000\u0000\u04e8\u04eb\u0001\u0000\u0000\u0000\u04e9"+
		"\u04e7\u0001\u0000\u0000\u0000\u04e9\u04ea\u0001\u0000\u0000\u0000\u04ea"+
		"\u008d\u0001\u0000\u0000\u0000\u04eb\u04e9\u0001\u0000\u0000\u0000\u04ec"+
		"\u04ee\u00034\u001a\u0000\u04ed\u04ec\u0001\u0000\u0000\u0000\u04ed\u04ee"+
		"\u0001\u0000\u0000\u0000\u04ee\u04ef\u0001\u0000\u0000\u0000\u04ef\u04f7"+
		"\u0003\u008aE\u0000\u04f0\u04f2\u0007\u0005\u0000\u0000\u04f1\u04f3\u0003"+
		"4\u001a\u0000\u04f2\u04f1\u0001\u0000\u0000\u0000\u04f2\u04f3\u0001\u0000"+
		"\u0000\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f6\u0003\u008a"+
		"E\u0000\u04f5\u04f0\u0001\u0000\u0000\u0000\u04f6\u04f9\u0001\u0000\u0000"+
		"\u0000\u04f7\u04f5\u0001\u0000\u0000\u0000\u04f7\u04f8\u0001\u0000\u0000"+
		"\u0000\u04f8\u008f\u0001\u0000\u0000\u0000\u04f9\u04f7\u0001\u0000\u0000"+
		"\u0000\u04fa\u04ff\u0003\u008aE\u0000\u04fb\u04fc\u0005g\u0000\u0000\u04fc"+
		"\u04fe\u0003\u008aE\u0000\u04fd\u04fb\u0001\u0000\u0000\u0000\u04fe\u0501"+
		"\u0001\u0000\u0000\u0000\u04ff\u04fd\u0001\u0000\u0000\u0000\u04ff\u0500"+
		"\u0001\u0000\u0000\u0000\u0500\u0091\u0001\u0000\u0000\u0000\u0501\u04ff"+
		"\u0001\u0000\u0000\u0000\u0502\u0504\u00034\u001a\u0000\u0503\u0502\u0001"+
		"\u0000\u0000\u0000\u0503\u0504\u0001\u0000\u0000\u0000\u0504\u0505\u0001"+
		"\u0000\u0000\u0000\u0505\u050d\u0003\u008aE\u0000\u0506\u0508\u0005g\u0000"+
		"\u0000\u0507\u0509\u00034\u001a\u0000\u0508\u0507\u0001\u0000\u0000\u0000"+
		"\u0508\u0509\u0001\u0000\u0000\u0000\u0509\u050a\u0001\u0000\u0000\u0000"+
		"\u050a\u050c\u0003\u008aE\u0000\u050b\u0506\u0001\u0000\u0000\u0000\u050c"+
		"\u050f\u0001\u0000\u0000\u0000\u050d\u050b\u0001\u0000\u0000\u0000\u050d"+
		"\u050e\u0001\u0000\u0000\u0000\u050e\u0093\u0001\u0000\u0000\u0000\u050f"+
		"\u050d\u0001\u0000\u0000\u0000\u0510\u0515\u0003\u0096K\u0000\u0511\u0512"+
		"\u0005g\u0000\u0000\u0512\u0514\u0003\u0096K\u0000\u0513\u0511\u0001\u0000"+
		"\u0000\u0000\u0514\u0517\u0001\u0000\u0000\u0000\u0515\u0513\u0001\u0000"+
		"\u0000\u0000\u0515\u0516\u0001\u0000\u0000\u0000\u0516\u0095\u0001\u0000"+
		"\u0000\u0000\u0517\u0515\u0001\u0000\u0000\u0000\u0518\u0525\u0005X\u0000"+
		"\u0000\u0519\u051a\u0005:\u0000\u0000\u051a\u0525\u0005X\u0000\u0000\u051b"+
		"\u0525\u0005Y\u0000\u0000\u051c\u0525\u0005Z\u0000\u0000\u051d\u0525\u0005"+
		"[\u0000\u0000\u051e\u051f\u0005)\u0000\u0000\u051f\u0525\u0005Z\u0000"+
		"\u0000\u0520\u0525\u0005\\\u0000\u0000\u0521\u0525\u0005]\u0000\u0000"+
		"\u0522\u0523\u0005^\u0000\u0000\u0523\u0525\u0005\\\u0000\u0000\u0524"+
		"\u0518\u0001\u0000\u0000\u0000\u0524\u0519\u0001\u0000\u0000\u0000\u0524"+
		"\u051b\u0001\u0000\u0000\u0000\u0524\u051c\u0001\u0000\u0000\u0000\u0524"+
		"\u051d\u0001\u0000\u0000\u0000\u0524\u051e\u0001\u0000\u0000\u0000\u0524"+
		"\u0520\u0001\u0000\u0000\u0000\u0524\u0521\u0001\u0000\u0000\u0000\u0524"+
		"\u0522\u0001\u0000\u0000\u0000\u0525\u0097\u0001\u0000\u0000\u0000\u0526"+
		"\u052b\u0003\u009aM\u0000\u0527\u0528\u0005g\u0000\u0000\u0528\u052a\u0003"+
		"\u009aM\u0000\u0529\u0527\u0001\u0000\u0000\u0000\u052a\u052d\u0001\u0000"+
		"\u0000\u0000\u052b\u0529\u0001\u0000\u0000\u0000\u052b\u052c\u0001\u0000"+
		"\u0000\u0000\u052c\u0099\u0001\u0000\u0000\u0000\u052d\u052b\u0001\u0000"+
		"\u0000\u0000\u052e\u052f\u0005X\u0000\u0000\u052f\u009b\u0001\u0000\u0000"+
		"\u0000\u0530\u0531\u0003\u009eO\u0000\u0531\u009d\u0001\u0000\u0000\u0000"+
		"\u0532\u0537\u0003\u00a0P\u0000\u0533\u0534\u0005H\u0000\u0000\u0534\u0536"+
		"\u0003\u00a0P\u0000\u0535\u0533\u0001\u0000\u0000\u0000\u0536\u0539\u0001"+
		"\u0000\u0000\u0000\u0537\u0535\u0001\u0000\u0000\u0000\u0537\u0538\u0001"+
		"\u0000\u0000\u0000\u0538\u009f\u0001\u0000\u0000\u0000\u0539\u0537\u0001"+
		"\u0000\u0000\u0000\u053a\u053f\u0003\u00a2Q\u0000\u053b\u053c\u0005G\u0000"+
		"\u0000\u053c\u053e\u0003\u00a2Q\u0000\u053d\u053b\u0001\u0000\u0000\u0000"+
		"\u053e\u0541\u0001\u0000\u0000\u0000\u053f\u053d\u0001\u0000\u0000\u0000"+
		"\u053f\u0540\u0001\u0000\u0000\u0000\u0540\u00a1\u0001\u0000\u0000\u0000"+
		"\u0541\u053f\u0001\u0000\u0000\u0000\u0542\u0557\u0003\u00b2Y\u0000\u0543"+
		"\u0544\u0005j\u0000\u0000\u0544\u0545\u0003\u009cN\u0000\u0545\u0546\u0005"+
		"k\u0000\u0000\u0546\u0557\u0001\u0000\u0000\u0000\u0547\u0548\u0003~?"+
		"\u0000\u0548\u054a\u0005j\u0000\u0000\u0549\u054b\u0003\u00aeW\u0000\u054a"+
		"\u0549\u0001\u0000\u0000\u0000\u054a\u054b\u0001\u0000\u0000\u0000\u054b"+
		"\u054c\u0001\u0000\u0000\u0000\u054c\u054d\u0005k\u0000\u0000\u054d\u0557"+
		"\u0001\u0000\u0000\u0000\u054e\u054f\u0005F\u0000\u0000\u054f\u0557\u0003"+
		"\u00a2Q\u0000\u0550\u0551\u0005_\u0000\u0000\u0551\u0552\u0003\u00b2Y"+
		"\u0000\u0552\u0553\u0005l\u0000\u0000\u0553\u0554\u0003\u00a4R\u0000\u0554"+
		"\u0555\u0005m\u0000\u0000\u0555\u0557\u0001\u0000\u0000\u0000\u0556\u0542"+
		"\u0001\u0000\u0000\u0000\u0556\u0543\u0001\u0000\u0000\u0000\u0556\u0547"+
		"\u0001\u0000\u0000\u0000\u0556\u054e\u0001\u0000\u0000\u0000\u0556\u0550"+
		"\u0001\u0000\u0000\u0000\u0557\u00a3\u0001\u0000\u0000\u0000\u0558\u055d"+
		"\u0003\u00a6S\u0000\u0559\u055a\u0005g\u0000\u0000\u055a\u055c\u0003\u00a6"+
		"S\u0000\u055b\u0559\u0001\u0000\u0000\u0000\u055c\u055f\u0001\u0000\u0000"+
		"\u0000\u055d\u055b\u0001\u0000\u0000\u0000\u055d\u055e\u0001\u0000\u0000"+
		"\u0000\u055e\u00a5\u0001\u0000\u0000\u0000\u055f\u055d\u0001\u0000\u0000"+
		"\u0000\u0560\u0561\u0005\u0013\u0000\u0000\u0561\u0588\u0003\u00c2a\u0000"+
		"\u0562\u0568\u0003z=\u0000\u0563\u0568\u0005\u0014\u0000\u0000\u0564\u0568"+
		"\u0003\u00c4b\u0000\u0565\u0568\u0005\u0019\u0000\u0000\u0566\u0568\u0005"+
		"\u001b\u0000\u0000\u0567\u0562\u0001\u0000\u0000\u0000\u0567\u0563\u0001"+
		"\u0000\u0000\u0000\u0567\u0564\u0001\u0000\u0000\u0000\u0567\u0565\u0001"+
		"\u0000\u0000\u0000\u0567\u0566\u0001\u0000\u0000\u0000\u0568\u0569\u0001"+
		"\u0000\u0000\u0000\u0569\u0588\u0003\u00c2a\u0000\u056a\u0570\u0003|>"+
		"\u0000\u056b\u0570\u0005\u0015\u0000\u0000\u056c\u0570\u0003\u00c6c\u0000"+
		"\u056d\u0570\u0005\u001a\u0000\u0000\u056e\u0570\u0005\u001c\u0000\u0000"+
		"\u056f\u056a\u0001\u0000\u0000\u0000\u056f\u056b\u0001\u0000\u0000\u0000"+
		"\u056f\u056c\u0001\u0000\u0000\u0000\u056f\u056d\u0001\u0000\u0000\u0000"+
		"\u056f\u056e\u0001\u0000\u0000\u0000\u0570\u0571\u0001\u0000\u0000\u0000"+
		"\u0571\u0588\u0003\u00c2a\u0000\u0572\u0577\u0003\u00a8T\u0000\u0573\u0577"+
		"\u0005\u0016\u0000\u0000\u0574\u0577\u0003\u00c8d\u0000\u0575\u0577\u0005"+
		"\u001d\u0000\u0000\u0576\u0572\u0001\u0000\u0000\u0000\u0576\u0573\u0001"+
		"\u0000\u0000\u0000\u0576\u0574\u0001\u0000\u0000\u0000\u0576\u0575\u0001"+
		"\u0000\u0000\u0000\u0577\u0578\u0001\u0000\u0000\u0000\u0578\u0588\u0003"+
		"\u00c2a\u0000\u0579\u057e\u0003\u00aaU\u0000\u057a\u057e\u0005\u0017\u0000"+
		"\u0000\u057b\u057e\u0003\u00cae\u0000\u057c\u057e\u0005\u001e\u0000\u0000"+
		"\u057d\u0579\u0001\u0000\u0000\u0000\u057d\u057a\u0001\u0000\u0000\u0000"+
		"\u057d\u057b\u0001\u0000\u0000\u0000\u057d\u057c\u0001\u0000\u0000\u0000"+
		"\u057e\u057f\u0001\u0000\u0000\u0000\u057f\u0588\u0003\u00c2a\u0000\u0580"+
		"\u0585\u0003\u00acV\u0000\u0581\u0585\u0005\u0018\u0000\u0000\u0582\u0585"+
		"\u0003\u00ccf\u0000\u0583\u0585\u0005\u001f\u0000\u0000\u0584\u0580\u0001"+
		"\u0000\u0000\u0000\u0584\u0581\u0001\u0000\u0000\u0000\u0584\u0582\u0001"+
		"\u0000\u0000\u0000\u0584\u0583\u0001\u0000\u0000\u0000\u0585\u0586\u0001"+
		"\u0000\u0000\u0000\u0586\u0588\u0003\u00c2a\u0000\u0587\u0560\u0001\u0000"+
		"\u0000\u0000\u0587\u0567\u0001\u0000\u0000\u0000\u0587\u056f\u0001\u0000"+
		"\u0000\u0000\u0587\u0576\u0001\u0000\u0000\u0000\u0587\u057d\u0001\u0000"+
		"\u0000\u0000\u0587\u0584\u0001\u0000\u0000\u0000\u0588\u00a7\u0001\u0000"+
		"\u0000\u0000\u0589\u058a\u0005`\u0000\u0000\u058a\u058b\u0005a\u0000\u0000"+
		"\u058b\u00a9\u0001\u0000\u0000\u0000\u058c\u058d\u0005b\u0000\u0000\u058d"+
		"\u058e\u0005a\u0000\u0000\u058e\u00ab\u0001\u0000\u0000\u0000\u058f\u0590"+
		"\u0005c\u0000\u0000\u0590\u0591\u0005.\u0000\u0000\u0591\u00ad\u0001\u0000"+
		"\u0000\u0000\u0592\u0597\u0003\u00c2a\u0000\u0593\u0594\u0005g\u0000\u0000"+
		"\u0594\u0596\u0003\u00c2a\u0000\u0595\u0593\u0001\u0000\u0000\u0000\u0596"+
		"\u0599\u0001\u0000\u0000\u0000\u0597\u0595\u0001\u0000\u0000\u0000\u0597"+
		"\u0598\u0001\u0000\u0000\u0000\u0598\u00af\u0001\u0000\u0000\u0000\u0599"+
		"\u0597\u0001\u0000\u0000\u0000\u059a\u059f\u0003\u00b2Y\u0000\u059b\u059c"+
		"\u0005g\u0000\u0000\u059c\u059e\u0003\u00b2Y\u0000\u059d\u059b\u0001\u0000"+
		"\u0000\u0000\u059e\u05a1\u0001\u0000\u0000\u0000\u059f\u059d\u0001\u0000"+
		"\u0000\u0000\u059f\u05a0\u0001\u0000\u0000\u0000\u05a0\u00b1\u0001\u0000"+
		"\u0000\u0000\u05a1\u059f\u0001\u0000\u0000\u0000\u05a2\u05a7\u0005\b\u0000"+
		"\u0000\u05a3\u05a7\u0005\t\u0000\u0000\u05a4\u05a7\u0003\u00c0`\u0000"+
		"\u05a5\u05a7\u0005\u0006\u0000\u0000\u05a6\u05a2\u0001\u0000\u0000\u0000"+
		"\u05a6\u05a3\u0001\u0000\u0000\u0000\u05a6\u05a4\u0001\u0000\u0000\u0000"+
		"\u05a6\u05a5\u0001\u0000\u0000\u0000\u05a7\u00b3\u0001\u0000\u0000\u0000"+
		"\u05a8\u05ad\u0005\b\u0000\u0000\u05a9\u05ad\u0005\t\u0000\u0000\u05aa"+
		"\u05ad\u0003\u00c0`\u0000\u05ab\u05ad\u0005\u0006\u0000\u0000\u05ac\u05a8"+
		"\u0001\u0000\u0000\u0000\u05ac\u05a9\u0001\u0000\u0000\u0000\u05ac\u05aa"+
		"\u0001\u0000\u0000\u0000\u05ac\u05ab\u0001\u0000\u0000\u0000\u05ad\u00b5"+
		"\u0001\u0000\u0000\u0000\u05ae\u05b3\u0005\b\u0000\u0000\u05af\u05b3\u0005"+
		"\t\u0000\u0000\u05b0\u05b3\u0003\u00c0`\u0000\u05b1\u05b3\u0005\u0006"+
		"\u0000\u0000\u05b2\u05ae\u0001\u0000\u0000\u0000\u05b2\u05af\u0001\u0000"+
		"\u0000\u0000\u05b2\u05b0\u0001\u0000\u0000\u0000\u05b2\u05b1\u0001\u0000"+
		"\u0000\u0000\u05b3\u00b7\u0001\u0000\u0000\u0000\u05b4\u05b9\u0005\b\u0000"+
		"\u0000\u05b5\u05b9\u0005\t\u0000\u0000\u05b6\u05b9\u0003\u00c0`\u0000"+
		"\u05b7\u05b9\u0005\u0006\u0000\u0000\u05b8\u05b4\u0001\u0000\u0000\u0000"+
		"\u05b8\u05b5\u0001\u0000\u0000\u0000\u05b8\u05b6\u0001\u0000\u0000\u0000"+
		"\u05b8\u05b7\u0001\u0000\u0000\u0000\u05b9\u00b9\u0001\u0000\u0000\u0000"+
		"\u05ba\u05bf\u0005\b\u0000\u0000\u05bb\u05bf\u0005\t\u0000\u0000\u05bc"+
		"\u05bf\u0003\u00c0`\u0000\u05bd\u05bf\u0005\u0006\u0000\u0000\u05be\u05ba"+
		"\u0001\u0000\u0000\u0000\u05be\u05bb\u0001\u0000\u0000\u0000\u05be\u05bc"+
		"\u0001\u0000\u0000\u0000\u05be\u05bd\u0001\u0000\u0000\u0000\u05bf\u00bb"+
		"\u0001\u0000\u0000\u0000\u05c0\u05c5\u0005\b\u0000\u0000\u05c1\u05c5\u0005"+
		"\t\u0000\u0000\u05c2\u05c5\u0003\u00c0`\u0000\u05c3\u05c5\u0005\u0006"+
		"\u0000\u0000\u05c4\u05c0\u0001\u0000\u0000\u0000\u05c4\u05c1\u0001\u0000"+
		"\u0000\u0000\u05c4\u05c2\u0001\u0000\u0000\u0000\u05c4\u05c3\u0001\u0000"+
		"\u0000\u0000\u05c5\u00bd\u0001\u0000\u0000\u0000\u05c6\u05c7\u0005\n\u0000"+
		"\u0000\u05c7\u00bf\u0001\u0000\u0000\u0000\u05c8\u05c9\u0005\n\u0000\u0000"+
		"\u05c9\u00c1\u0001\u0000\u0000\u0000\u05ca\u05ce\u0007\u0006\u0000\u0000"+
		"\u05cb\u05cf\u0005\r\u0000\u0000\u05cc\u05cd\u0005w\u0000\u0000\u05cd"+
		"\u05cf\u0003\u00b2Y\u0000\u05ce\u05cb\u0001\u0000\u0000\u0000\u05ce\u05cc"+
		"\u0001\u0000\u0000\u0000\u05ce\u05cf\u0001\u0000\u0000\u0000\u05cf\u05d6"+
		"\u0001\u0000\u0000\u0000\u05d0\u05d6\u0005\u0010\u0000\u0000\u05d1\u05d6"+
		"\u0005\u0011\u0000\u0000\u05d2\u05d6\u0005\u0012\u0000\u0000\u05d3\u05d6"+
		"\u0005d\u0000\u0000\u05d4\u05d6\u0005e\u0000\u0000\u05d5\u05ca\u0001\u0000"+
		"\u0000\u0000\u05d5\u05d0\u0001\u0000\u0000\u0000\u05d5\u05d1\u0001\u0000"+
		"\u0000\u0000\u05d5\u05d2\u0001\u0000\u0000\u0000\u05d5\u05d3\u0001\u0000"+
		"\u0000\u0000\u05d5\u05d4\u0001\u0000\u0000\u0000\u05d6\u00c3\u0001\u0000"+
		"\u0000\u0000\u05d7\u05d8\u0005\u0001\u0000\u0000\u05d8\u00c5\u0001\u0000"+
		"\u0000\u0000\u05d9\u05da\u0005\u0002\u0000\u0000\u05da\u00c7\u0001\u0000"+
		"\u0000\u0000\u05db\u05dc\u0005\u0003\u0000\u0000\u05dc\u00c9\u0001\u0000"+
		"\u0000\u0000\u05dd\u05de\u0005\u0004\u0000\u0000\u05de\u00cb\u0001\u0000"+
		"\u0000\u0000\u05df\u05e0\u0005\u0005\u0000\u0000\u05e0\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d5\u00d7\u00e4\u00ea\u00f6\u00fc\u0102\u0110\u0116"+
		"\u011b\u0126\u012a\u0133\u0137\u013a\u013d\u0144\u0148\u014c\u0152\u0158"+
		"\u0166\u016c\u0170\u0187\u018c\u0191\u0199\u019f\u01a5\u01a9\u01ad\u01b1"+
		"\u01b7\u01bb\u01bf\u01c4\u01c8\u01cc\u01d2\u01dd\u01e3\u01e9\u01ef\u01f6"+
		"\u01fb\u0200\u0204\u0210\u0219\u021d\u0221\u0228\u022d\u0230\u0236\u023b"+
		"\u0241\u0245\u024a\u0250\u0254\u0258\u025d\u0261\u0277\u027d\u0281\u0285"+
		"\u028a\u028e\u0294\u0297\u029b\u02a1\u02a6\u02ab\u02b3\u02b7\u02be\u02c2"+
		"\u02c6\u02ca\u02ce\u02d0\u02d7\u02de\u02e6\u02ed\u02f1\u02f8\u0302\u0305"+
		"\u030b\u0315\u0319\u0323\u032c\u0333\u033b\u0341\u0343\u034d\u0355\u0358"+
		"\u035e\u0361\u036a\u036e\u0374\u0378\u037f\u038c\u0390\u0393\u0398\u039c"+
		"\u039f\u03a4\u03a8\u03ab\u03ae\u03b1\u03b6\u03bb\u03be\u03c3\u03c8\u03cb"+
		"\u03d3\u03db\u03de\u03e4\u03e7\u03ea\u03ed\u03f3\u03f6\u03f9\u03fc\u0402"+
		"\u0405\u040a\u040e\u0411\u0416\u041a\u041d\u0420\u0423\u0429\u042c\u042f"+
		"\u0432\u0438\u043b\u044c\u0455\u045b\u0461\u0469\u046d\u0472\u0478\u047d"+
		"\u0483\u0492\u0498\u049b\u049f\u04a5\u04a8\u04ac\u04b2\u04b5\u04b9\u04bf"+
		"\u04c2\u04c6\u04cc\u04cf\u04d1\u04d7\u04e2\u04e9\u04ed\u04f2\u04f7\u04ff"+
		"\u0503\u0508\u050d\u0515\u0524\u052b\u0537\u053f\u054a\u0556\u055d\u0567"+
		"\u056f\u0576\u057d\u0584\u0587\u0597\u059f\u05a6\u05ac\u05b2\u05b8\u05be"+
		"\u05c4\u05ce\u05d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}