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
		PREFIX_KW=35, ONTOLOGY_KW=36, VERSION_IRI_KW=37, CLASS_KW=38, EQUIVALENT_CLASSES_KW=39, 
		ALL_DISJOINT_CLASSES_KW=40, SUB_CLASS_OF_KW=41, IS_KW=42, A_KW=43, AN_KW=44, 
		SUBCLASS_KW=45, OF_KW=46, EQUIVALENT_TO_KW=47, EQUIVALENT_KW=48, TO_KW=49, 
		DISJOINT_WITH_KW=50, DISJOINT_KW=51, WITH_KW=52, DISJOINT_UNION_OF_KW=53, 
		UNION_KW=54, HAS_KW=55, KEY_KW=56, OBJECT_PROPERTY_KW=57, OBJECT_KW=58, 
		PROPERTY_KW=59, EQUIVALENT_OBJECT_PROPERTIES_KW=60, DISJOINT_OBJECT_PROPERTIES_KW=61, 
		SUB_PROPERTY_OF_KW=62, SUBPROPERTY_KW=63, DOMAIN_KW=64, RANGE_KW=65, CHARACTERISTICS_KW=66, 
		INVERSE_KW=67, DATA_PROPERTY_KW=68, DATA_KW=69, EQUIVALENT_DATA_PROPERTIES_KW=70, 
		DISJOINT_DATA_PROPERTIES_KW=71, ANNOTATION_PROPERTY_KW=72, ANNOTATION_KW=73, 
		DATATYPE_KW=74, DATATYPE_DEFINITION_KW=75, SUB_PROPERTY_CHAIN_KW=76, SUBPROPERTY_CHAIN_KW=77, 
		CHAIN_KW=78, INDIVIDUAL_KW=79, TYPE_KW=80, SAME_AS_KW=81, SAME_KW=82, 
		AS_KW=83, DIFFERENT_FROM_KW=84, DIFFERENT_KW=85, FROM_KW=86, NOT_KW=87, 
		AND_KW=88, OR_KW=89, THING_KW=90, NOTHING_KW=91, SOME_KW=92, ONLY_KW=93, 
		HAS_VALUE_KW=94, MIN_KW=95, MAX_KW=96, EXACTLY_KW=97, THAT_KW=98, AT_KW=99, 
		LEAST_KW=100, MOST_KW=101, ONE_OF_KW=102, ONE_KW=103, ALL_OF_KW=104, ALL_KW=105, 
		ANY_OF_KW=106, ANY_KW=107, FUNCTIONAL_KW=108, INVERSE_FUNCTIONAL_KW=109, 
		TRANSITIVE_KW=110, SYMMETRIC_KW=111, ASYMMETRIC_KW=112, REFLEXIVE_KW=113, 
		IRREFLEXIVE_KW=114, RESTRICTION_KW=115, GREATER_KW=116, THAN_KW=117, LESS_KW=118, 
		EQUAL_KW=119, TRUE_KW=120, FALSE_KW=121, IDENTIFIER=122, DOT=123, COMMA=124, 
		COLON=125, SEMICOLON=126, LPAREN=127, RPAREN=128, LBRACE=129, RBRACE=130, 
		SUBSET_EQ=131, LE_SEQ=132, NOT_SYM=133, INTERSECTION=134, UNION_SYM=135, 
		SOME_SYM=136, ONLY_SYM=137, COMPOSITION=138, THEN=139, DATATYPE_SEP=140;
	public static final int
		RULE_ontology = 0, RULE_prefixDecl = 1, RULE_annotatedAxiom = 2, RULE_bareAxiom = 3, 
		RULE_annotationBlock = 4, RULE_annotationList = 5, RULE_annotation = 6, 
		RULE_ontologyHeader = 7, RULE_ontologyPropertyBlock = 8, RULE_ontologyPropertyList = 9, 
		RULE_ontologyProperty = 10, RULE_annotatedOntologyHeader = 11, RULE_axiom = 12, 
		RULE_classAxiom = 13, RULE_classSubOrEqAxiom = 14, RULE_classClause = 15, 
		RULE_subClassOfPhrase = 16, RULE_equivalentToPhrase = 17, RULE_disjointWithPhrase = 18, 
		RULE_disjointUnionOfPhrase = 19, RULE_hasKeyPhrase = 20, RULE_commentOpt = 21, 
		RULE_objectPropertyAxiom = 22, RULE_objectSubPropertyAxiom = 23, RULE_objectPropertyDomainRangeAxiom = 24, 
		RULE_objectPropertyClause = 25, RULE_subPropertyOfPhrase = 26, RULE_domainPhrase = 27, 
		RULE_rangePhrase = 28, RULE_characteristicsPhrase = 29, RULE_inverseOfPhrase = 30, 
		RULE_objectInversePropertyAxiom = 31, RULE_dataPropertyAxiom = 32, RULE_dataSubPropertyAxiom = 33, 
		RULE_dataPropertyDomainRangeAxiom = 34, RULE_dataPropertyClause = 35, 
		RULE_annotationPropertyAxiom = 36, RULE_annotationPropertyClause = 37, 
		RULE_datatypeAxiom = 38, RULE_subPropertyChainAxiom = 39, RULE_subPropertyChainPhrase = 40, 
		RULE_individualAxiom = 41, RULE_individualAxiomBody = 42, RULE_typeBody = 43, 
		RULE_isAPhrase = 44, RULE_sameOrDifferentBody = 45, RULE_sameAsPhrase = 46, 
		RULE_differentFromPhrase = 47, RULE_propAssertionList = 48, RULE_propAssertion = 49, 
		RULE_classExprList = 50, RULE_classExprNaryList = 51, RULE_classExpr = 52, 
		RULE_boolClassExpr = 53, RULE_primaryClassExpr = 54, RULE_atomicClassExpr = 55, 
		RULE_atLeastPhrase = 56, RULE_atMostPhrase = 57, RULE_oneOfPhrase = 58, 
		RULE_allOfPhrase = 59, RULE_anyOfPhrase = 60, RULE_thatConnector = 61, 
		RULE_thatRestriction = 62, RULE_binaryBoolOp = 63, RULE_propExpr = 64, 
		RULE_propExprChain = 65, RULE_propExprChainWithComments = 66, RULE_propExprList = 67, 
		RULE_propExprWithCommentList = 68, RULE_characteristicList = 69, RULE_characteristic = 70, 
		RULE_dataCharacteristicList = 71, RULE_dataCharacteristic = 72, RULE_dataRangeExpr = 73, 
		RULE_dataRangeOrExpr = 74, RULE_dataRangeAndExpr = 75, RULE_dataRangePrimary = 76, 
		RULE_facetRestrictionList = 77, RULE_facetRestriction = 78, RULE_greaterThanPhrase = 79, 
		RULE_lessThanPhrase = 80, RULE_equalToPhrase = 81, RULE_literalList = 82, 
		RULE_individualList = 83, RULE_entityUsage = 84, RULE_entityId = 85, RULE_classId = 86, 
		RULE_propId = 87, RULE_individualId = 88, RULE_datatypeId = 89, RULE_namespaceIRI = 90, 
		RULE_fullIRI = 91, RULE_literal = 92, RULE_ge = 93, RULE_le = 94, RULE_gt = 95, 
		RULE_lt = 96, RULE_eq = 97;
	private static String[] makeRuleNames() {
		return new String[] {
			"ontology", "prefixDecl", "annotatedAxiom", "bareAxiom", "annotationBlock", 
			"annotationList", "annotation", "ontologyHeader", "ontologyPropertyBlock", 
			"ontologyPropertyList", "ontologyProperty", "annotatedOntologyHeader", 
			"axiom", "classAxiom", "classSubOrEqAxiom", "classClause", "subClassOfPhrase", 
			"equivalentToPhrase", "disjointWithPhrase", "disjointUnionOfPhrase", 
			"hasKeyPhrase", "commentOpt", "objectPropertyAxiom", "objectSubPropertyAxiom", 
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
			"'\\u2264'", "'>='", "'<='", "'>'", "'<'", "'='", null, null, null, "'Prefix'", 
			"'Ontology'", "'versionIRI'", "'Class'", "'EquivalentClasses'", "'AllDisjointClasses'", 
			"'subClassOf'", "'is'", "'a'", "'an'", "'subclass'", "'of'", "'equivalentTo'", 
			"'equivalent'", "'to'", "'disjointWith'", "'disjoint'", "'with'", "'disjointUnionOf'", 
			"'union'", "'has'", "'key'", "'ObjectProperty'", "'Object'", "'property'", 
			"'EquivalentObjectProperties'", "'DisjointObjectProperties'", "'subPropertyOf'", 
			"'subproperty'", "'domain'", "'range'", "'characteristics'", "'inverse'", 
			"'DataProperty'", "'Data'", "'EquivalentDataProperties'", "'DisjointDataProperties'", 
			"'AnnotationProperty'", "'Annotation'", "'Datatype'", "'DatatypeDefinition'", 
			"'SubPropertyChain'", "'Subproperty'", "'chain'", "'Individual'", "'type'", 
			"'sameAs'", "'same'", "'as'", "'differentFrom'", "'different'", "'from'", 
			"'not'", "'and'", "'or'", "'Thing'", "'Nothing'", "'some'", "'only'", 
			"'hasValue'", "'min'", "'max'", "'exactly'", "'that'", "'at'", "'least'", 
			"'most'", "'oneOf'", "'one'", "'allOf'", "'all'", "'anyOf'", "'any'", 
			"'functional'", "'inverseFunctional'", "'transitive'", "'symmetric'", 
			"'asymmetric'", "'reflexive'", "'irreflexive'", "'restriction'", "'greater'", 
			"'than'", "'less'", "'equal'", "'true'", "'false'", null, "'.'", "','", 
			"':'", "';'", "'('", "')'", "'{'", "'}'", "'\\u2291'", "'<=:'", "'\\u00AC'", 
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
			"VERSION_IRI_KW", "CLASS_KW", "EQUIVALENT_CLASSES_KW", "ALL_DISJOINT_CLASSES_KW", 
			"SUB_CLASS_OF_KW", "IS_KW", "A_KW", "AN_KW", "SUBCLASS_KW", "OF_KW", 
			"EQUIVALENT_TO_KW", "EQUIVALENT_KW", "TO_KW", "DISJOINT_WITH_KW", "DISJOINT_KW", 
			"WITH_KW", "DISJOINT_UNION_OF_KW", "UNION_KW", "HAS_KW", "KEY_KW", "OBJECT_PROPERTY_KW", 
			"OBJECT_KW", "PROPERTY_KW", "EQUIVALENT_OBJECT_PROPERTIES_KW", "DISJOINT_OBJECT_PROPERTIES_KW", 
			"SUB_PROPERTY_OF_KW", "SUBPROPERTY_KW", "DOMAIN_KW", "RANGE_KW", "CHARACTERISTICS_KW", 
			"INVERSE_KW", "DATA_PROPERTY_KW", "DATA_KW", "EQUIVALENT_DATA_PROPERTIES_KW", 
			"DISJOINT_DATA_PROPERTIES_KW", "ANNOTATION_PROPERTY_KW", "ANNOTATION_KW", 
			"DATATYPE_KW", "DATATYPE_DEFINITION_KW", "SUB_PROPERTY_CHAIN_KW", "SUBPROPERTY_CHAIN_KW", 
			"CHAIN_KW", "INDIVIDUAL_KW", "TYPE_KW", "SAME_AS_KW", "SAME_KW", "AS_KW", 
			"DIFFERENT_FROM_KW", "DIFFERENT_KW", "FROM_KW", "NOT_KW", "AND_KW", "OR_KW", 
			"THING_KW", "NOTHING_KW", "SOME_KW", "ONLY_KW", "HAS_VALUE_KW", "MIN_KW", 
			"MAX_KW", "EXACTLY_KW", "THAT_KW", "AT_KW", "LEAST_KW", "MOST_KW", "ONE_OF_KW", 
			"ONE_KW", "ALL_OF_KW", "ALL_KW", "ANY_OF_KW", "ANY_KW", "FUNCTIONAL_KW", 
			"INVERSE_FUNCTIONAL_KW", "TRANSITIVE_KW", "SYMMETRIC_KW", "ASYMMETRIC_KW", 
			"REFLEXIVE_KW", "IRREFLEXIVE_KW", "RESTRICTION_KW", "GREATER_KW", "THAN_KW", 
			"LESS_KW", "EQUAL_KW", "TRUE_KW", "FALSE_KW", "IDENTIFIER", "DOT", "COMMA", 
			"COLON", "SEMICOLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SUBSET_EQ", 
			"LE_SEQ", "NOT_SYM", "INTERSECTION", "UNION_SYM", "SOME_SYM", "ONLY_SYM", 
			"COMPOSITION", "THEN", "DATATYPE_SEP"
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
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3891112105272678464L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 3071L) != 0)) {
				{
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(196);
					prefixDecl();
					}
					break;
				case 2:
					{
					setState(197);
					ontologyPropertyBlock();
					}
					break;
				case 3:
					{
					setState(198);
					annotatedAxiom();
					}
					break;
				case 4:
					{
					setState(199);
					bareAxiom();
					}
					break;
				case 5:
					{
					setState(200);
					annotatedOntologyHeader();
					}
					break;
				case 6:
					{
					setState(201);
					ontologyHeader();
					}
					break;
				case 7:
					{
					setState(202);
					match(INTELLIJ_DUMMY);
					}
					break;
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
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
			setState(210);
			match(PREFIX_KW);
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==PREFIX_NAME || _la==COLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(212);
			namespaceIRI();
			setState(213);
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
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				annotationBlock();
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANNOTATION );
			setState(220);
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
			setState(222);
			axiom();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(223);
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
			setState(226);
			match(ANNOTATION);
			setState(227);
			match(LPAREN);
			setState(228);
			annotationList();
			setState(229);
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
			setState(231);
			annotation();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(232);
				match(COMMA);
				setState(233);
				annotation();
				}
				}
				setState(238);
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
			setState(239);
			entityUsage();
			setState(242);
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
				setState(240);
				literal();
				}
				break;
			case INTELLIJ_DUMMY:
			case CURIE:
			case CURIE_EMPTY:
			case IRI:
			case IDENTIFIER:
				{
				setState(241);
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
			setState(244);
			match(ONTOLOGY_KW);
			setState(245);
			fullIRI();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VERSION_IRI_KW) {
				{
				setState(246);
				match(VERSION_IRI_KW);
				setState(247);
				fullIRI();
				}
			}

			setState(250);
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
			setState(252);
			match(PROPERTY);
			setState(253);
			match(LPAREN);
			setState(254);
			ontologyPropertyList();
			setState(255);
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
			setState(257);
			ontologyProperty();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(258);
				match(COMMA);
				setState(259);
				ontologyProperty();
				}
				}
				setState(264);
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
			setState(265);
			entityUsage();
			setState(268);
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
				setState(266);
				literal();
				}
				break;
			case INTELLIJ_DUMMY:
			case CURIE:
			case CURIE_EMPTY:
			case IRI:
			case IDENTIFIER:
				{
				setState(267);
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
			setState(271); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(270);
				annotationBlock();
				}
				}
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANNOTATION );
			setState(275);
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
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_KW:
			case EQUIVALENT_CLASSES_KW:
			case ALL_DISJOINT_CLASSES_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				classAxiom();
				}
				break;
			case OBJECT_PROPERTY_KW:
			case OBJECT_KW:
			case EQUIVALENT_OBJECT_PROPERTIES_KW:
			case DISJOINT_OBJECT_PROPERTIES_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				objectPropertyAxiom();
				}
				break;
			case DATA_PROPERTY_KW:
			case DATA_KW:
			case EQUIVALENT_DATA_PROPERTIES_KW:
			case DISJOINT_DATA_PROPERTIES_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				dataPropertyAxiom();
				}
				break;
			case ANNOTATION_PROPERTY_KW:
			case ANNOTATION_KW:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				annotationPropertyAxiom();
				}
				break;
			case DATATYPE_KW:
			case DATATYPE_DEFINITION_KW:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				datatypeAxiom();
				}
				break;
			case SUB_PROPERTY_CHAIN_KW:
			case SUBPROPERTY_CHAIN_KW:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				subPropertyChainAxiom();
				}
				break;
			case INDIVIDUAL_KW:
				enterOuterAlt(_localctx, 7);
				{
				setState(283);
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
		public TerminalNode ALL_DISJOINT_CLASSES_KW() { return getToken(OwlDslParser.ALL_DISJOINT_CLASSES_KW, 0); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class EquivalentClassesAxiomContext extends ClassAxiomContext {
		public TerminalNode EQUIVALENT_CLASSES_KW() { return getToken(OwlDslParser.EQUIVALENT_CLASSES_KW, 0); }
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public ClassExprListContext classExprList() {
			return getRuleContext(ClassExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public EquivalentClassesAxiomContext(ClassAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitEquivalentClassesAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAxiomContext classAxiom() throws RecognitionException {
		ClassAxiomContext _localctx = new ClassAxiomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classAxiom);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ClassDeclAxiomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(CLASS_KW);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(287);
					commentOpt();
					}
				}

				setState(290);
				classId();
				}
				break;
			case 2:
				_localctx = new ClassSubOrEqAxiomAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				classSubOrEqAxiom();
				}
				break;
			case 3:
				_localctx = new EquivalentClassesAxiomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(EQUIVALENT_CLASSES_KW);
				setState(293);
				match(LPAREN);
				setState(294);
				classExprList();
				setState(295);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new AllDisjointClassesAxiomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				match(ALL_DISJOINT_CLASSES_KW);
				setState(298);
				match(LPAREN);
				setState(299);
				classExprList();
				setState(300);
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
		public ClassIdContext classId() {
			return getRuleContext(ClassIdContext.class,0);
		}
		public List<ClassClauseContext> classClause() {
			return getRuleContexts(ClassClauseContext.class);
		}
		public ClassClauseContext classClause(int i) {
			return getRuleContext(ClassClauseContext.class,i);
		}
		public CommentOptContext commentOpt() {
			return getRuleContext(CommentOptContext.class,0);
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
			setState(304);
			match(CLASS_KW);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(305);
				commentOpt();
				}
			}

			setState(308);
			classId();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(309);
				match(SEMICOLON);
				}
			}

			setState(312);
			classClause();
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					match(SEMICOLON);
					setState(314);
					classClause();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(320);
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
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ClassSubClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				subClassOfPhrase();
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(324);
					commentOpt();
					}
					break;
				}
				setState(327);
				classExpr();
				}
				break;
			case 2:
				_localctx = new ClassEquivalentClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				equivalentToPhrase();
				setState(330);
				classExpr();
				}
				break;
			case 3:
				_localctx = new ClassDisjointClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				disjointWithPhrase();
				setState(333);
				classExpr();
				}
				break;
			case 4:
				_localctx = new ClassDisjointUnionClauseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				disjointUnionOfPhrase();
				setState(336);
				match(LPAREN);
				setState(337);
				classExprList();
				setState(338);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new ClassHasKeyClauseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				hasKeyPhrase();
				setState(341);
				match(LPAREN);
				setState(342);
				propExprWithCommentList();
				setState(343);
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
		public TerminalNode SUB_CLASS_OF_KW() { return getToken(OwlDslParser.SUB_CLASS_OF_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public TerminalNode A_KW() { return getToken(OwlDslParser.A_KW, 0); }
		public TerminalNode AN_KW() { return getToken(OwlDslParser.AN_KW, 0); }
		public TerminalNode SUBCLASS_KW() { return getToken(OwlDslParser.SUBCLASS_KW, 0); }
		public TerminalNode OF_KW() { return getToken(OwlDslParser.OF_KW, 0); }
		public TerminalNode SUBSET_EQ() { return getToken(OwlDslParser.SUBSET_EQ, 0); }
		public TerminalNode LE_SEQ() { return getToken(OwlDslParser.LE_SEQ, 0); }
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
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(SUB_CLASS_OF_KW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(IS_KW);
				setState(349);
				match(A_KW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				match(IS_KW);
				setState(351);
				match(AN_KW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				match(IS_KW);
				setState(353);
				match(SUBCLASS_KW);
				setState(354);
				match(OF_KW);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				match(SUBSET_EQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				match(LE_SEQ);
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
		public TerminalNode EQUIVALENT_TO_KW() { return getToken(OwlDslParser.EQUIVALENT_TO_KW, 0); }
		public TerminalNode EQUIVALENT_KW() { return getToken(OwlDslParser.EQUIVALENT_KW, 0); }
		public TerminalNode TO_KW() { return getToken(OwlDslParser.TO_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
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
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUIVALENT_TO_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(EQUIVALENT_TO_KW);
				}
				break;
			case EQUIVALENT_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(EQUIVALENT_KW);
				setState(361);
				match(TO_KW);
				}
				break;
			case IS_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				match(IS_KW);
				setState(363);
				match(EQUIVALENT_KW);
				setState(364);
				match(TO_KW);
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
	public static class DisjointWithPhraseContext extends ParserRuleContext {
		public TerminalNode DISJOINT_WITH_KW() { return getToken(OwlDslParser.DISJOINT_WITH_KW, 0); }
		public TerminalNode DISJOINT_KW() { return getToken(OwlDslParser.DISJOINT_KW, 0); }
		public TerminalNode WITH_KW() { return getToken(OwlDslParser.WITH_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
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
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISJOINT_WITH_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(DISJOINT_WITH_KW);
				}
				break;
			case DISJOINT_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(DISJOINT_KW);
				setState(369);
				match(WITH_KW);
				}
				break;
			case IS_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(IS_KW);
				setState(371);
				match(DISJOINT_KW);
				setState(372);
				match(WITH_KW);
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
	public static class DisjointUnionOfPhraseContext extends ParserRuleContext {
		public TerminalNode DISJOINT_UNION_OF_KW() { return getToken(OwlDslParser.DISJOINT_UNION_OF_KW, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public TerminalNode DISJOINT_KW() { return getToken(OwlDslParser.DISJOINT_KW, 0); }
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
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISJOINT_UNION_OF_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(DISJOINT_UNION_OF_KW);
				}
				break;
			case IS_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(IS_KW);
				setState(377);
				match(DISJOINT_KW);
				setState(378);
				match(UNION_KW);
				setState(379);
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
	public static class HasKeyPhraseContext extends ParserRuleContext {
		public TerminalNode HAS_KW() { return getToken(OwlDslParser.HAS_KW, 0); }
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
		enterRule(_localctx, 40, RULE_hasKeyPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(HAS_KW);
			setState(383);
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
		enterRule(_localctx, 42, RULE_commentOpt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
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
	public static class EquivalentObjectPropertiesAxiomContext extends ObjectPropertyAxiomContext {
		public TerminalNode EQUIVALENT_OBJECT_PROPERTIES_KW() { return getToken(OwlDslParser.EQUIVALENT_OBJECT_PROPERTIES_KW, 0); }
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public PropExprWithCommentListContext propExprWithCommentList() {
			return getRuleContext(PropExprWithCommentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public EquivalentObjectPropertiesAxiomContext(ObjectPropertyAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitEquivalentObjectPropertiesAxiom(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode OBJECT_PROPERTY_KW() { return getToken(OwlDslParser.OBJECT_PROPERTY_KW, 0); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class DisjointObjectPropertiesAxiomContext extends ObjectPropertyAxiomContext {
		public TerminalNode DISJOINT_OBJECT_PROPERTIES_KW() { return getToken(OwlDslParser.DISJOINT_OBJECT_PROPERTIES_KW, 0); }
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public PropExprWithCommentListContext propExprWithCommentList() {
			return getRuleContext(PropExprWithCommentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public DisjointObjectPropertiesAxiomContext(ObjectPropertyAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDisjointObjectPropertiesAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyAxiomContext objectPropertyAxiom() throws RecognitionException {
		ObjectPropertyAxiomContext _localctx = new ObjectPropertyAxiomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_objectPropertyAxiom);
		int _la;
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ObjectPropertyDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OBJECT_PROPERTY_KW:
					{
					setState(387);
					match(OBJECT_PROPERTY_KW);
					}
					break;
				case OBJECT_KW:
					{
					setState(388);
					match(OBJECT_KW);
					setState(389);
					match(PROPERTY_KW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(392);
					commentOpt();
					}
				}

				setState(395);
				propId();
				}
				break;
			case 2:
				_localctx = new ObjectPropertyDomainRangeAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				objectPropertyDomainRangeAxiom();
				}
				break;
			case 3:
				_localctx = new ObjectSubPropertyAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				objectSubPropertyAxiom();
				}
				break;
			case 4:
				_localctx = new ObjectInversePropertyAltContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				objectInversePropertyAxiom();
				}
				break;
			case 5:
				_localctx = new EquivalentObjectPropertiesAxiomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(399);
				match(EQUIVALENT_OBJECT_PROPERTIES_KW);
				setState(400);
				match(LPAREN);
				setState(401);
				propExprWithCommentList();
				setState(402);
				match(RPAREN);
				}
				break;
			case 6:
				_localctx = new DisjointObjectPropertiesAxiomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(404);
				match(DISJOINT_OBJECT_PROPERTIES_KW);
				setState(405);
				match(LPAREN);
				setState(406);
				propExprWithCommentList();
				setState(407);
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
		public TerminalNode OBJECT_PROPERTY_KW() { return getToken(OwlDslParser.OBJECT_PROPERTY_KW, 0); }
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
		enterRule(_localctx, 46, RULE_objectSubPropertyAxiom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECT_PROPERTY_KW:
				{
				setState(411);
				match(OBJECT_PROPERTY_KW);
				}
				break;
			case OBJECT_KW:
				{
				setState(412);
				match(OBJECT_KW);
				setState(413);
				match(PROPERTY_KW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(416);
				commentOpt();
				}
			}

			setState(419);
			propId();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(420);
				match(SEMICOLON);
				}
			}

			setState(423);
			subPropertyOfPhrase();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(424);
				commentOpt();
				}
			}

			setState(427);
			propExpr();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(428);
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
		public TerminalNode OBJECT_PROPERTY_KW() { return getToken(OwlDslParser.OBJECT_PROPERTY_KW, 0); }
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
		enterRule(_localctx, 48, RULE_objectPropertyDomainRangeAxiom);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECT_PROPERTY_KW:
				{
				setState(431);
				match(OBJECT_PROPERTY_KW);
				}
				break;
			case OBJECT_KW:
				{
				setState(432);
				match(OBJECT_KW);
				setState(433);
				match(PROPERTY_KW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(436);
				commentOpt();
				}
			}

			setState(439);
			propId();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(440);
				match(SEMICOLON);
				}
			}

			setState(443);
			objectPropertyClause();
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(444);
						match(SEMICOLON);
						}
					}

					setState(447);
					objectPropertyClause();
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(453);
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
		enterRule(_localctx, 50, RULE_objectPropertyClause);
		int _la;
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new ObjectPropDomainClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				domainPhrase();
				setState(458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(457);
					commentOpt();
					}
					break;
				}
				setState(460);
				classExpr();
				}
				break;
			case 2:
				_localctx = new ObjectPropRangeClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				rangePhrase();
				setState(464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(463);
					commentOpt();
					}
					break;
				}
				setState(466);
				classExpr();
				}
				break;
			case 3:
				_localctx = new ObjectPropCharacteristicsClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				characteristicsPhrase();
				setState(469);
				match(LPAREN);
				setState(470);
				characteristicList();
				setState(471);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ObjectPropSubPropertyOfClauseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				subPropertyOfPhrase();
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(474);
					commentOpt();
					}
				}

				setState(477);
				propExpr();
				}
				break;
			case 5:
				_localctx = new ObjectPropInverseClauseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(479);
				inverseOfPhrase();
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(480);
					commentOpt();
					}
				}

				setState(483);
				propExpr();
				}
				break;
			case 6:
				_localctx = new ObjectPropInverseFunctionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(485);
				match(INVERSE_KW);
				setState(486);
				match(LPAREN);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(487);
					commentOpt();
					}
				}

				setState(490);
				propExpr();
				setState(491);
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
		public TerminalNode SUB_PROPERTY_OF_KW() { return getToken(OwlDslParser.SUB_PROPERTY_OF_KW, 0); }
		public TerminalNode SUBSET_EQ() { return getToken(OwlDslParser.SUBSET_EQ, 0); }
		public TerminalNode LE_SEQ() { return getToken(OwlDslParser.LE_SEQ, 0); }
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public TerminalNode SUBPROPERTY_KW() { return getToken(OwlDslParser.SUBPROPERTY_KW, 0); }
		public TerminalNode OF_KW() { return getToken(OwlDslParser.OF_KW, 0); }
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
		enterRule(_localctx, 52, RULE_subPropertyOfPhrase);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB_PROPERTY_OF_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				match(SUB_PROPERTY_OF_KW);
				}
				break;
			case SUBSET_EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(SUBSET_EQ);
				}
				break;
			case LE_SEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				match(LE_SEQ);
				}
				break;
			case IS_KW:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				match(IS_KW);
				setState(499);
				match(SUBPROPERTY_KW);
				setState(500);
				match(OF_KW);
				}
				break;
			case SUBPROPERTY_KW:
				enterOuterAlt(_localctx, 5);
				{
				setState(501);
				match(SUBPROPERTY_KW);
				setState(502);
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
		public TerminalNode DOMAIN_KW() { return getToken(OwlDslParser.DOMAIN_KW, 0); }
		public TerminalNode HAS_KW() { return getToken(OwlDslParser.HAS_KW, 0); }
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
		enterRule(_localctx, 54, RULE_domainPhrase);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOMAIN_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(DOMAIN_KW);
				}
				break;
			case HAS_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(HAS_KW);
				setState(507);
				match(DOMAIN_KW);
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
	public static class RangePhraseContext extends ParserRuleContext {
		public TerminalNode RANGE_KW() { return getToken(OwlDslParser.RANGE_KW, 0); }
		public TerminalNode HAS_KW() { return getToken(OwlDslParser.HAS_KW, 0); }
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
		enterRule(_localctx, 56, RULE_rangePhrase);
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANGE_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				match(RANGE_KW);
				}
				break;
			case HAS_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				match(HAS_KW);
				setState(512);
				match(RANGE_KW);
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
	public static class CharacteristicsPhraseContext extends ParserRuleContext {
		public TerminalNode CHARACTERISTICS_KW() { return getToken(OwlDslParser.CHARACTERISTICS_KW, 0); }
		public TerminalNode HAS_KW() { return getToken(OwlDslParser.HAS_KW, 0); }
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
		enterRule(_localctx, 58, RULE_characteristicsPhrase);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARACTERISTICS_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(CHARACTERISTICS_KW);
				}
				break;
			case HAS_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(HAS_KW);
				setState(517);
				match(CHARACTERISTICS_KW);
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
		enterRule(_localctx, 60, RULE_inverseOfPhrase);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INVERSE_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(INVERSE_KW);
				setState(521);
				match(OF_KW);
				}
				break;
			case IS_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(IS_KW);
				setState(523);
				match(INVERSE_KW);
				setState(524);
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
	public static class ObjectInversePropertyAxiomContext extends ParserRuleContext {
		public PropIdContext propId() {
			return getRuleContext(PropIdContext.class,0);
		}
		public TerminalNode OBJECT_PROPERTY_KW() { return getToken(OwlDslParser.OBJECT_PROPERTY_KW, 0); }
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
		enterRule(_localctx, 62, RULE_objectInversePropertyAxiom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECT_PROPERTY_KW:
				{
				setState(527);
				match(OBJECT_PROPERTY_KW);
				}
				break;
			case OBJECT_KW:
				{
				setState(528);
				match(OBJECT_KW);
				setState(529);
				match(PROPERTY_KW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(532);
				commentOpt();
				}
			}

			setState(535);
			propId();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(536);
				match(SEMICOLON);
				}
			}

			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(539);
				inverseOfPhrase();
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(540);
					commentOpt();
					}
				}

				setState(543);
				propExpr();
				}
				break;
			case 2:
				{
				setState(545);
				match(INVERSE_KW);
				setState(546);
				match(LPAREN);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(547);
					commentOpt();
					}
				}

				setState(550);
				propExpr();
				setState(551);
				match(RPAREN);
				}
				break;
			}
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(555);
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
		public TerminalNode DATA_PROPERTY_KW() { return getToken(OwlDslParser.DATA_PROPERTY_KW, 0); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class EquivalentDataPropertiesAxiomContext extends DataPropertyAxiomContext {
		public TerminalNode EQUIVALENT_DATA_PROPERTIES_KW() { return getToken(OwlDslParser.EQUIVALENT_DATA_PROPERTIES_KW, 0); }
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public PropExprListContext propExprList() {
			return getRuleContext(PropExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public EquivalentDataPropertiesAxiomContext(DataPropertyAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitEquivalentDataPropertiesAxiom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisjointDataPropertiesAxiomContext extends DataPropertyAxiomContext {
		public TerminalNode DISJOINT_DATA_PROPERTIES_KW() { return getToken(OwlDslParser.DISJOINT_DATA_PROPERTIES_KW, 0); }
		public TerminalNode LPAREN() { return getToken(OwlDslParser.LPAREN, 0); }
		public PropExprListContext propExprList() {
			return getRuleContext(PropExprListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(OwlDslParser.RPAREN, 0); }
		public DisjointDataPropertiesAxiomContext(DataPropertyAxiomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OwlDslVisitor ) return ((OwlDslVisitor<? extends T>)visitor).visitDisjointDataPropertiesAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataPropertyAxiomContext dataPropertyAxiom() throws RecognitionException {
		DataPropertyAxiomContext _localctx = new DataPropertyAxiomContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dataPropertyAxiom);
		int _la;
		try {
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new DataPropertyDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATA_PROPERTY_KW:
					{
					setState(558);
					match(DATA_PROPERTY_KW);
					}
					break;
				case DATA_KW:
					{
					setState(559);
					match(DATA_KW);
					setState(560);
					match(PROPERTY_KW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(563);
					commentOpt();
					}
				}

				setState(566);
				propId();
				}
				break;
			case 2:
				_localctx = new DataPropertyDomainRangeAltContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				dataPropertyDomainRangeAxiom();
				}
				break;
			case 3:
				_localctx = new DataSubPropertyAltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(568);
				dataSubPropertyAxiom();
				}
				break;
			case 4:
				_localctx = new EquivalentDataPropertiesAxiomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(569);
				match(EQUIVALENT_DATA_PROPERTIES_KW);
				setState(570);
				match(LPAREN);
				setState(571);
				propExprList();
				setState(572);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new DisjointDataPropertiesAxiomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(574);
				match(DISJOINT_DATA_PROPERTIES_KW);
				setState(575);
				match(LPAREN);
				setState(576);
				propExprList();
				setState(577);
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
		public TerminalNode DATA_PROPERTY_KW() { return getToken(OwlDslParser.DATA_PROPERTY_KW, 0); }
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
		enterRule(_localctx, 66, RULE_dataSubPropertyAxiom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATA_PROPERTY_KW:
				{
				setState(581);
				match(DATA_PROPERTY_KW);
				}
				break;
			case DATA_KW:
				{
				setState(582);
				match(DATA_KW);
				setState(583);
				match(PROPERTY_KW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(586);
				commentOpt();
				}
			}

			setState(589);
			propId();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(590);
				match(SEMICOLON);
				}
			}

			setState(593);
			subPropertyOfPhrase();
			setState(594);
			propExpr();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(595);
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
		public TerminalNode DATA_PROPERTY_KW() { return getToken(OwlDslParser.DATA_PROPERTY_KW, 0); }
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
		enterRule(_localctx, 68, RULE_dataPropertyDomainRangeAxiom);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATA_PROPERTY_KW:
				{
				setState(598);
				match(DATA_PROPERTY_KW);
				}
				break;
			case DATA_KW:
				{
				setState(599);
				match(DATA_KW);
				setState(600);
				match(PROPERTY_KW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(603);
				commentOpt();
				}
			}

			setState(606);
			propId();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(607);
				match(SEMICOLON);
				}
			}

			setState(610);
			dataPropertyClause();
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(611);
						match(SEMICOLON);
						}
					}

					setState(614);
					dataPropertyClause();
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(620);
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

	public final DataPropertyClauseContext dataPropertyClause() throws RecognitionException {
		DataPropertyClauseContext _localctx = new DataPropertyClauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dataPropertyClause);
		try {
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new DataPropDomainClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				domainPhrase();
				setState(624);
				classExpr();
				}
				break;
			case 2:
				_localctx = new DataPropRangeClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				rangePhrase();
				setState(627);
				dataRangeExpr();
				}
				break;
			case 3:
				_localctx = new DataPropCharacteristicsClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				characteristicsPhrase();
				setState(630);
				match(LPAREN);
				setState(631);
				dataCharacteristicList();
				setState(632);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new DataPropSubPropertyOfClauseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(634);
				subPropertyOfPhrase();
				setState(635);
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
		public TerminalNode ANNOTATION_PROPERTY_KW() { return getToken(OwlDslParser.ANNOTATION_PROPERTY_KW, 0); }
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
		public TerminalNode ANNOTATION_PROPERTY_KW() { return getToken(OwlDslParser.ANNOTATION_PROPERTY_KW, 0); }
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
		enterRule(_localctx, 72, RULE_annotationPropertyAxiom);
		int _la;
		try {
			int _alt;
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				_localctx = new AnnotationPropertyWithClausesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANNOTATION_PROPERTY_KW:
					{
					setState(639);
					match(ANNOTATION_PROPERTY_KW);
					}
					break;
				case ANNOTATION_KW:
					{
					setState(640);
					match(ANNOTATION_KW);
					setState(641);
					match(PROPERTY_KW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(644);
					commentOpt();
					}
				}

				setState(647);
				propId();
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(648);
					match(SEMICOLON);
					}
				}

				setState(651);
				annotationPropertyClause();
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(653);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SEMICOLON) {
							{
							setState(652);
							match(SEMICOLON);
							}
						}

						setState(655);
						annotationPropertyClause();
						}
						} 
					}
					setState(660);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(661);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				_localctx = new AnnotationPropertyDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANNOTATION_PROPERTY_KW:
					{
					setState(664);
					match(ANNOTATION_PROPERTY_KW);
					}
					break;
				case ANNOTATION_KW:
					{
					setState(665);
					match(ANNOTATION_KW);
					setState(666);
					match(PROPERTY_KW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(669);
					commentOpt();
					}
				}

				setState(672);
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
		enterRule(_localctx, 74, RULE_annotationPropertyClause);
		int _la;
		try {
			_localctx = new AnnotationPropSubPropertyOfClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			subPropertyOfPhrase();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(676);
				commentOpt();
				}
			}

			setState(679);
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
		enterRule(_localctx, 76, RULE_datatypeAxiom);
		int _la;
		try {
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATATYPE_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(DATATYPE_KW);
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(682);
					commentOpt();
					}
				}

				setState(685);
				datatypeId();
				}
				break;
			case DATATYPE_DEFINITION_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				match(DATATYPE_DEFINITION_KW);
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(687);
					commentOpt();
					}
				}

				setState(690);
				datatypeId();
				setState(691);
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
		enterRule(_localctx, 78, RULE_subPropertyChainAxiom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			subPropertyChainPhrase();
			setState(696);
			match(LPAREN);
			setState(697);
			((SubPropertyChainAxiomContext)_localctx).chain = propExprChainWithComments();
			setState(698);
			match(RPAREN);
			setState(699);
			subPropertyOfPhrase();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(700);
				commentOpt();
				}
			}

			setState(703);
			((SubPropertyChainAxiomContext)_localctx).superProp = propExpr();
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(704);
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
		public TerminalNode SUB_PROPERTY_CHAIN_KW() { return getToken(OwlDslParser.SUB_PROPERTY_CHAIN_KW, 0); }
		public TerminalNode SUBPROPERTY_CHAIN_KW() { return getToken(OwlDslParser.SUBPROPERTY_CHAIN_KW, 0); }
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
		enterRule(_localctx, 80, RULE_subPropertyChainPhrase);
		try {
			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB_PROPERTY_CHAIN_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				match(SUB_PROPERTY_CHAIN_KW);
				}
				break;
			case SUBPROPERTY_CHAIN_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				match(SUBPROPERTY_CHAIN_KW);
				setState(709);
				match(CHAIN_KW);
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
		enterRule(_localctx, 82, RULE_individualAxiom);
		int _la;
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				_localctx = new IndividualWithBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
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

				setState(720);
				individualAxiomBody();
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(721);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				_localctx = new IndividualBareDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				match(INDIVIDUAL_KW);
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(725);
					commentOpt();
					}
				}

				setState(728);
				individualId();
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(729);
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
		enterRule(_localctx, 84, RULE_individualAxiomBody);
		try {
			int _alt;
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				typeBody();
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(735);
						match(SEMICOLON);
						setState(736);
						propAssertionList();
						}
						} 
					}
					setState(741);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				setState(746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(742);
						match(SEMICOLON);
						setState(743);
						sameOrDifferentBody();
						}
						} 
					}
					setState(748);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				propAssertionList();
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(750);
						match(SEMICOLON);
						setState(751);
						propAssertionList();
						}
						} 
					}
					setState(756);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				setState(761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(757);
						match(SEMICOLON);
						setState(758);
						sameOrDifferentBody();
						}
						} 
					}
					setState(763);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
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
		enterRule(_localctx, 86, RULE_typeBody);
		try {
			setState(772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_KW:
				_localctx = new TypeAssertionBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				match(TYPE_KW);
				setState(768);
				classExprList();
				}
				break;
			case IS_KW:
				_localctx = new TypeAssertionBodySugarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				isAPhrase();
				setState(770);
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
		public TerminalNode IS_KW() { return getToken(OwlDslParser.IS_KW, 0); }
		public TerminalNode A_KW() { return getToken(OwlDslParser.A_KW, 0); }
		public TerminalNode AN_KW() { return getToken(OwlDslParser.AN_KW, 0); }
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
		enterRule(_localctx, 88, RULE_isAPhrase);
		try {
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				match(IS_KW);
				setState(775);
				match(A_KW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				match(IS_KW);
				setState(777);
				match(AN_KW);
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
		enterRule(_localctx, 90, RULE_sameOrDifferentBody);
		try {
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				_localctx = new SameAsBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				sameAsPhrase();
				setState(781);
				individualList();
				}
				break;
			case 2:
				_localctx = new DifferentFromBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				differentFromPhrase();
				setState(784);
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
		public TerminalNode SAME_AS_KW() { return getToken(OwlDslParser.SAME_AS_KW, 0); }
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
		enterRule(_localctx, 92, RULE_sameAsPhrase);
		try {
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SAME_AS_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				match(SAME_AS_KW);
				}
				break;
			case SAME_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				match(SAME_KW);
				setState(790);
				match(AS_KW);
				}
				break;
			case IS_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(791);
				match(IS_KW);
				setState(792);
				match(SAME_KW);
				setState(793);
				match(AS_KW);
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
	public static class DifferentFromPhraseContext extends ParserRuleContext {
		public TerminalNode DIFFERENT_FROM_KW() { return getToken(OwlDslParser.DIFFERENT_FROM_KW, 0); }
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
		enterRule(_localctx, 94, RULE_differentFromPhrase);
		try {
			setState(802);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIFFERENT_FROM_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				match(DIFFERENT_FROM_KW);
				}
				break;
			case DIFFERENT_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				match(DIFFERENT_KW);
				setState(798);
				match(FROM_KW);
				}
				break;
			case IS_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
				match(IS_KW);
				setState(800);
				match(DIFFERENT_KW);
				setState(801);
				match(FROM_KW);
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
		enterRule(_localctx, 96, RULE_propAssertionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			propAssertion();
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(805);
				match(COMMA);
				setState(806);
				propAssertion();
				}
				}
				setState(811);
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
		enterRule(_localctx, 98, RULE_propAssertion);
		int _la;
		try {
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				_localctx = new ObjectPropertyAssertionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(812);
					commentOpt();
					}
				}

				setState(815);
				propExpr();
				setState(816);
				entityUsage();
				}
				break;
			case 2:
				_localctx = new DataPropertyAssertionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				propExpr();
				setState(819);
				literal();
				}
				break;
			case 3:
				_localctx = new NegativeObjectPropertyAssertionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(821);
				_la = _input.LA(1);
				if ( !(_la==NOT_KW || _la==NOT_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(822);
					commentOpt();
					}
				}

				setState(825);
				propExpr();
				setState(826);
				entityUsage();
				}
				break;
			case 4:
				_localctx = new NegativeDataPropertyAssertionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(828);
				_la = _input.LA(1);
				if ( !(_la==NOT_KW || _la==NOT_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(829);
				propExpr();
				setState(830);
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
		enterRule(_localctx, 100, RULE_classExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			classExpr();
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(835);
				match(COMMA);
				setState(836);
				classExpr();
				}
				}
				setState(841);
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
		enterRule(_localctx, 102, RULE_classExprNaryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			classExpr();
			setState(855);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				{
				setState(845); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(843);
					match(COMMA);
					setState(844);
					classExpr();
					}
					}
					setState(847); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case AND_KW:
				{
				setState(851); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(849);
					match(AND_KW);
					setState(850);
					classExpr();
					}
					}
					setState(853); 
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
		enterRule(_localctx, 104, RULE_classExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
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
		enterRule(_localctx, 106, RULE_boolClassExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			primaryClassExpr();
			setState(865);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(860);
					binaryBoolOp();
					setState(861);
					primaryClassExpr();
					}
					} 
				}
				setState(867);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
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
		enterRule(_localctx, 108, RULE_primaryClassExpr);
		try {
			setState(873);
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
			case INVERSE_KW:
			case NOT_KW:
			case THING_KW:
			case NOTHING_KW:
			case SOME_KW:
			case ONLY_KW:
			case HAS_VALUE_KW:
			case MIN_KW:
			case MAX_KW:
			case EXACTLY_KW:
			case THAT_KW:
			case AT_KW:
			case ONE_OF_KW:
			case ONE_KW:
			case ALL_OF_KW:
			case ALL_KW:
			case ANY_OF_KW:
			case ANY_KW:
			case TRUE_KW:
			case FALSE_KW:
			case IDENTIFIER:
			case NOT_SYM:
			case SOME_SYM:
			case ONLY_SYM:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				atomicClassExpr();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				match(LPAREN);
				setState(870);
				classExpr();
				setState(871);
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
		public TerminalNode HAS_VALUE_KW() { return getToken(OwlDslParser.HAS_VALUE_KW, 0); }
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
		public TerminalNode HAS_VALUE_KW() { return getToken(OwlDslParser.HAS_VALUE_KW, 0); }
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
		public TerminalNode HAS_VALUE_KW() { return getToken(OwlDslParser.HAS_VALUE_KW, 0); }
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
		public TerminalNode HAS_VALUE_KW() { return getToken(OwlDslParser.HAS_VALUE_KW, 0); }
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
		enterRule(_localctx, 110, RULE_atomicClassExpr);
		int _la;
		try {
			int _alt;
			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				_localctx = new NamedClassWithThatExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(875);
					commentOpt();
					}
				}

				setState(878);
				entityUsage();
				setState(880); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(879);
						thatRestriction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(882); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new NamedClassExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(884);
					commentOpt();
					}
				}

				setState(887);
				entityUsage();
				}
				break;
			case 3:
				_localctx = new TopClassExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(888);
				match(THING_KW);
				}
				break;
			case 4:
				_localctx = new BottomClassExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(889);
				match(NOTHING_KW);
				}
				break;
			case 5:
				_localctx = new ComplementClassExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(890);
				_la = _input.LA(1);
				if ( !(_la==NOT_KW || _la==NOT_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(891);
				primaryClassExpr();
				}
				break;
			case 6:
				_localctx = new SomeValuesFromExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(892);
				_la = _input.LA(1);
				if ( !(_la==SOME_KW || _la==SOME_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(893);
					commentOpt();
					}
				}

				setState(896);
				propExpr();
				setState(898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(897);
					commentOpt();
					}
					break;
				}
				setState(900);
				classExpr();
				}
				break;
			case 7:
				_localctx = new AllValuesFromExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(902);
				_la = _input.LA(1);
				if ( !(_la==ONLY_KW || _la==ONLY_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(903);
					commentOpt();
					}
				}

				setState(906);
				propExpr();
				setState(908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(907);
					commentOpt();
					}
					break;
				}
				setState(910);
				classExpr();
				}
				break;
			case 8:
				_localctx = new ObjectHasValueExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(912);
				match(HAS_VALUE_KW);
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(913);
					commentOpt();
					}
				}

				setState(916);
				propExpr();
				setState(917);
				entityUsage();
				}
				break;
			case 9:
				_localctx = new DataHasValueExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(919);
				match(HAS_VALUE_KW);
				setState(920);
				propExpr();
				setState(921);
				literal();
				}
				break;
			case 10:
				_localctx = new MinCardinalityExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(923);
				match(MIN_KW);
				setState(924);
				match(INTEGER);
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(925);
					commentOpt();
					}
				}

				setState(928);
				propExpr();
				setState(933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(930);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						setState(929);
						commentOpt();
						}
						break;
					}
					setState(932);
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
				setState(935);
				match(MAX_KW);
				setState(936);
				match(INTEGER);
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(937);
					commentOpt();
					}
				}

				setState(940);
				propExpr();
				setState(945);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(942);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
					case 1:
						{
						setState(941);
						commentOpt();
						}
						break;
					}
					setState(944);
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
				setState(947);
				match(EXACTLY_KW);
				setState(948);
				match(INTEGER);
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(949);
					commentOpt();
					}
				}

				setState(952);
				propExpr();
				setState(957);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(954);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						setState(953);
						commentOpt();
						}
						break;
					}
					setState(956);
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
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(959);
					match(THAT_KW);
					}
				}

				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(962);
					commentOpt();
					}
				}

				setState(965);
				propExpr();
				setState(966);
				_la = _input.LA(1);
				if ( !(_la==SOME_KW || _la==SOME_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(968);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(967);
					commentOpt();
					}
					break;
				}
				setState(970);
				classExpr();
				}
				break;
			case 14:
				_localctx = new AllValuesFromExpr_MContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(972);
					match(THAT_KW);
					}
				}

				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(975);
					commentOpt();
					}
				}

				setState(978);
				propExpr();
				setState(979);
				_la = _input.LA(1);
				if ( !(_la==ONLY_KW || _la==ONLY_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(981);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(980);
					commentOpt();
					}
					break;
				}
				setState(983);
				classExpr();
				}
				break;
			case 15:
				_localctx = new ObjectHasValueExpr_MContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(985);
					match(THAT_KW);
					}
				}

				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(988);
					commentOpt();
					}
				}

				setState(991);
				propExpr();
				setState(992);
				match(HAS_VALUE_KW);
				setState(993);
				entityUsage();
				}
				break;
			case 16:
				_localctx = new DataHasValueExpr_MContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(995);
					match(THAT_KW);
					}
				}

				setState(998);
				propExpr();
				setState(999);
				match(HAS_VALUE_KW);
				setState(1000);
				literal();
				}
				break;
			case 17:
				_localctx = new MinCardinalityExpr_MContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(1002);
					match(THAT_KW);
					}
				}

				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1005);
					commentOpt();
					}
				}

				setState(1008);
				propExpr();
				setState(1009);
				match(MIN_KW);
				setState(1010);
				match(INTEGER);
				setState(1015);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1012);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
					case 1:
						{
						setState(1011);
						commentOpt();
						}
						break;
					}
					setState(1014);
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
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(1017);
					match(THAT_KW);
					}
				}

				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1020);
					commentOpt();
					}
				}

				setState(1023);
				propExpr();
				setState(1024);
				match(MAX_KW);
				setState(1025);
				match(INTEGER);
				setState(1030);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1027);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
					case 1:
						{
						setState(1026);
						commentOpt();
						}
						break;
					}
					setState(1029);
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
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(1032);
					match(THAT_KW);
					}
				}

				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1035);
					commentOpt();
					}
				}

				setState(1038);
				propExpr();
				setState(1039);
				match(EXACTLY_KW);
				setState(1040);
				match(INTEGER);
				setState(1045);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1042);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
					case 1:
						{
						setState(1041);
						commentOpt();
						}
						break;
					}
					setState(1044);
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
				setState(1047);
				atLeastPhrase();
				setState(1048);
				match(INTEGER);
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1049);
					commentOpt();
					}
				}

				setState(1052);
				propExpr();
				setState(1057);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1054);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
					case 1:
						{
						setState(1053);
						commentOpt();
						}
						break;
					}
					setState(1056);
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
				setState(1059);
				atMostPhrase();
				setState(1060);
				match(INTEGER);
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1061);
					commentOpt();
					}
				}

				setState(1064);
				propExpr();
				setState(1069);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1066);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
					case 1:
						{
						setState(1065);
						commentOpt();
						}
						break;
					}
					setState(1068);
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
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(1071);
					match(THAT_KW);
					}
				}

				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1074);
					commentOpt();
					}
				}

				setState(1077);
				propExpr();
				setState(1078);
				atLeastPhrase();
				setState(1079);
				match(INTEGER);
				setState(1084);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1081);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(1080);
						commentOpt();
						}
						break;
					}
					setState(1083);
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
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THAT_KW) {
					{
					setState(1086);
					match(THAT_KW);
					}
				}

				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1089);
					commentOpt();
					}
				}

				setState(1092);
				propExpr();
				setState(1093);
				atMostPhrase();
				setState(1094);
				match(INTEGER);
				setState(1099);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1096);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
					case 1:
						{
						setState(1095);
						commentOpt();
						}
						break;
					}
					setState(1098);
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
				setState(1101);
				oneOfPhrase();
				setState(1102);
				match(LPAREN);
				setState(1103);
				individualList();
				setState(1104);
				match(RPAREN);
				}
				break;
			case 25:
				_localctx = new IntersectionExprContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(1106);
				allOfPhrase();
				setState(1107);
				match(LPAREN);
				setState(1108);
				classExprNaryList();
				setState(1109);
				match(RPAREN);
				}
				break;
			case 26:
				_localctx = new UnionExprContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(1111);
				anyOfPhrase();
				setState(1112);
				match(LPAREN);
				setState(1113);
				classExprNaryList();
				setState(1114);
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
		enterRule(_localctx, 112, RULE_atLeastPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			match(AT_KW);
			setState(1119);
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
		enterRule(_localctx, 114, RULE_atMostPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			match(AT_KW);
			setState(1122);
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
		public TerminalNode ONE_OF_KW() { return getToken(OwlDslParser.ONE_OF_KW, 0); }
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
		enterRule(_localctx, 116, RULE_oneOfPhrase);
		try {
			setState(1130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONE_OF_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1124);
				match(ONE_OF_KW);
				}
				break;
			case ONE_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1125);
				match(ONE_KW);
				setState(1126);
				match(OF_KW);
				}
				break;
			case IS_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(1127);
				match(IS_KW);
				setState(1128);
				match(ONE_KW);
				setState(1129);
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
	public static class AllOfPhraseContext extends ParserRuleContext {
		public TerminalNode ALL_OF_KW() { return getToken(OwlDslParser.ALL_OF_KW, 0); }
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
		enterRule(_localctx, 118, RULE_allOfPhrase);
		try {
			setState(1138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_OF_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1132);
				match(ALL_OF_KW);
				}
				break;
			case ALL_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1133);
				match(ALL_KW);
				setState(1134);
				match(OF_KW);
				}
				break;
			case IS_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(1135);
				match(IS_KW);
				setState(1136);
				match(ALL_KW);
				setState(1137);
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
	public static class AnyOfPhraseContext extends ParserRuleContext {
		public TerminalNode ANY_OF_KW() { return getToken(OwlDslParser.ANY_OF_KW, 0); }
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
		enterRule(_localctx, 120, RULE_anyOfPhrase);
		try {
			setState(1146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY_OF_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				match(ANY_OF_KW);
				}
				break;
			case ANY_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				match(ANY_KW);
				setState(1142);
				match(OF_KW);
				}
				break;
			case IS_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(1143);
				match(IS_KW);
				setState(1144);
				match(ANY_KW);
				setState(1145);
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
		enterRule(_localctx, 122, RULE_thatConnector);
		try {
			setState(1151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THAT_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1148);
				match(THAT_KW);
				}
				break;
			case AND_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149);
				match(AND_KW);
				setState(1150);
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
		public TerminalNode HAS_VALUE_KW() { return getToken(OwlDslParser.HAS_VALUE_KW, 0); }
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
		public TerminalNode HAS_VALUE_KW() { return getToken(OwlDslParser.HAS_VALUE_KW, 0); }
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
		enterRule(_localctx, 124, RULE_thatRestriction);
		int _la;
		try {
			setState(1253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				_localctx = new ThatSomeValuesFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
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
				_la = _input.LA(1);
				if ( !(_la==SOME_KW || _la==SOME_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1159);
					commentOpt();
					}
					break;
				}
				setState(1162);
				classExpr();
				}
				break;
			case 2:
				_localctx = new ThatAllValuesFromContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1164);
				thatConnector();
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1165);
					commentOpt();
					}
				}

				setState(1168);
				propExpr();
				setState(1169);
				_la = _input.LA(1);
				if ( !(_la==ONLY_KW || _la==ONLY_SYM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1170);
					commentOpt();
					}
					break;
				}
				setState(1173);
				classExpr();
				}
				break;
			case 3:
				_localctx = new ThatObjectHasValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1175);
				thatConnector();
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1176);
					commentOpt();
					}
				}

				setState(1179);
				propExpr();
				setState(1180);
				match(HAS_VALUE_KW);
				setState(1181);
				entityUsage();
				}
				break;
			case 4:
				_localctx = new ThatDataHasValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1183);
				thatConnector();
				setState(1184);
				propExpr();
				setState(1185);
				match(HAS_VALUE_KW);
				setState(1186);
				literal();
				}
				break;
			case 5:
				_localctx = new ThatMinCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1188);
				thatConnector();
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1189);
					commentOpt();
					}
				}

				setState(1192);
				propExpr();
				setState(1193);
				match(MIN_KW);
				setState(1194);
				match(INTEGER);
				setState(1199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						setState(1195);
						commentOpt();
						}
						break;
					}
					setState(1198);
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
				setState(1201);
				thatConnector();
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1202);
					commentOpt();
					}
				}

				setState(1205);
				propExpr();
				setState(1206);
				match(MAX_KW);
				setState(1207);
				match(INTEGER);
				setState(1212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						setState(1208);
						commentOpt();
						}
						break;
					}
					setState(1211);
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
				setState(1214);
				thatConnector();
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1215);
					commentOpt();
					}
				}

				setState(1218);
				propExpr();
				setState(1219);
				match(EXACTLY_KW);
				setState(1220);
				match(INTEGER);
				setState(1225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(1221);
						commentOpt();
						}
						break;
					}
					setState(1224);
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
				setState(1227);
				thatConnector();
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1228);
					commentOpt();
					}
				}

				setState(1231);
				propExpr();
				setState(1232);
				atLeastPhrase();
				setState(1233);
				match(INTEGER);
				setState(1238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						setState(1234);
						commentOpt();
						}
						break;
					}
					setState(1237);
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
				setState(1240);
				thatConnector();
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1241);
					commentOpt();
					}
				}

				setState(1244);
				propExpr();
				setState(1245);
				atMostPhrase();
				setState(1246);
				match(INTEGER);
				setState(1251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
					case 1:
						{
						setState(1247);
						commentOpt();
						}
						break;
					}
					setState(1250);
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
		enterRule(_localctx, 126, RULE_binaryBoolOp);
		try {
			setState(1259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND_KW:
				_localctx = new AndOpASCIIContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				match(AND_KW);
				}
				break;
			case INTERSECTION:
				_localctx = new AndOpUnicodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1256);
				match(INTERSECTION);
				}
				break;
			case OR_KW:
				_localctx = new OrOpASCIIContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1257);
				match(OR_KW);
				}
				break;
			case UNION_SYM:
				_localctx = new OrOpUnicodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1258);
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
		enterRule(_localctx, 128, RULE_propExpr);
		try {
			setState(1270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				_localctx = new NamedPropertyExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				entityUsage();
				}
				break;
			case 2:
				_localctx = new InversePropertyFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				match(INVERSE_KW);
				setState(1263);
				match(LPAREN);
				setState(1264);
				propExpr();
				setState(1265);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new InversePropertyPhraseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1267);
				inverseOfPhrase();
				setState(1268);
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
		enterRule(_localctx, 130, RULE_propExprChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			propExpr();
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPOSITION || _la==THEN) {
				{
				{
				setState(1273);
				_la = _input.LA(1);
				if ( !(_la==COMPOSITION || _la==THEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1274);
				propExpr();
				}
				}
				setState(1279);
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
		enterRule(_localctx, 132, RULE_propExprChainWithComments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(1280);
				commentOpt();
				}
			}

			setState(1283);
			propExpr();
			setState(1291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPOSITION || _la==THEN) {
				{
				{
				setState(1284);
				_la = _input.LA(1);
				if ( !(_la==COMPOSITION || _la==THEN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1285);
					commentOpt();
					}
				}

				setState(1288);
				propExpr();
				}
				}
				setState(1293);
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
		enterRule(_localctx, 134, RULE_propExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			propExpr();
			setState(1299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1295);
				match(COMMA);
				setState(1296);
				propExpr();
				}
				}
				setState(1301);
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
		enterRule(_localctx, 136, RULE_propExprWithCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
				{
				setState(1302);
				commentOpt();
				}
			}

			setState(1305);
			propExpr();
			setState(1313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1306);
				match(COMMA);
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1307);
					commentOpt();
					}
				}

				setState(1310);
				propExpr();
				}
				}
				setState(1315);
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
		enterRule(_localctx, 138, RULE_characteristicList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			characteristic();
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1317);
				match(COMMA);
				setState(1318);
				characteristic();
				}
				}
				setState(1323);
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
		public TerminalNode INVERSE_FUNCTIONAL_KW() { return getToken(OwlDslParser.INVERSE_FUNCTIONAL_KW, 0); }
		public TerminalNode TRANSITIVE_KW() { return getToken(OwlDslParser.TRANSITIVE_KW, 0); }
		public TerminalNode SYMMETRIC_KW() { return getToken(OwlDslParser.SYMMETRIC_KW, 0); }
		public TerminalNode ASYMMETRIC_KW() { return getToken(OwlDslParser.ASYMMETRIC_KW, 0); }
		public TerminalNode REFLEXIVE_KW() { return getToken(OwlDslParser.REFLEXIVE_KW, 0); }
		public TerminalNode IRREFLEXIVE_KW() { return getToken(OwlDslParser.IRREFLEXIVE_KW, 0); }
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
		enterRule(_localctx, 140, RULE_characteristic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 127L) != 0)) ) {
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
		enterRule(_localctx, 142, RULE_dataCharacteristicList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			dataCharacteristic();
			setState(1331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1327);
				match(COMMA);
				setState(1328);
				dataCharacteristic();
				}
				}
				setState(1333);
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
		enterRule(_localctx, 144, RULE_dataCharacteristic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
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
		enterRule(_localctx, 146, RULE_dataRangeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
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
		enterRule(_localctx, 148, RULE_dataRangeOrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			dataRangeAndExpr();
			setState(1343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_KW) {
				{
				{
				setState(1339);
				match(OR_KW);
				setState(1340);
				dataRangeAndExpr();
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
		enterRule(_localctx, 150, RULE_dataRangeAndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			dataRangePrimary();
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_KW) {
				{
				{
				setState(1347);
				match(AND_KW);
				setState(1348);
				dataRangePrimary();
				}
				}
				setState(1353);
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
		enterRule(_localctx, 152, RULE_dataRangePrimary);
		int _la;
		try {
			setState(1374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTELLIJ_DUMMY:
			case CURIE:
			case CURIE_EMPTY:
			case IRI:
			case IDENTIFIER:
				_localctx = new NamedDatatypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1354);
				entityUsage();
				}
				break;
			case LPAREN:
				_localctx = new ParenthesizedDataRangeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1355);
				match(LPAREN);
				setState(1356);
				dataRangeExpr();
				setState(1357);
				match(RPAREN);
				}
				break;
			case IS_KW:
			case ONE_OF_KW:
			case ONE_KW:
				_localctx = new DataOneOfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1359);
				oneOfPhrase();
				setState(1360);
				match(LPAREN);
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0) || _la==TRUE_KW || _la==FALSE_KW) {
					{
					setState(1361);
					literalList();
					}
				}

				setState(1364);
				match(RPAREN);
				}
				break;
			case NOT_KW:
				_localctx = new DataComplementOfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1366);
				match(NOT_KW);
				setState(1367);
				dataRangePrimary();
				}
				break;
			case RESTRICTION_KW:
				_localctx = new DatatypeRestrictionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1368);
				match(RESTRICTION_KW);
				setState(1369);
				entityUsage();
				setState(1370);
				match(LBRACE);
				setState(1371);
				facetRestrictionList();
				setState(1372);
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
		enterRule(_localctx, 154, RULE_facetRestrictionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			facetRestriction();
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1377);
				match(COMMA);
				setState(1378);
				facetRestriction();
				}
				}
				setState(1383);
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
		enterRule(_localctx, 156, RULE_facetRestriction);
		try {
			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1384);
				match(FACET);
				setState(1385);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AT_KW:
					{
					setState(1386);
					atLeastPhrase();
					}
					break;
				case GE:
					{
					setState(1387);
					match(GE);
					}
					break;
				case T__0:
					{
					setState(1388);
					ge();
					}
					break;
				case GE_SYM:
					{
					setState(1389);
					match(GE_SYM);
					}
					break;
				case GE_ASC:
					{
					setState(1390);
					match(GE_ASC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1393);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1399);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AT_KW:
					{
					setState(1394);
					atMostPhrase();
					}
					break;
				case LE:
					{
					setState(1395);
					match(LE);
					}
					break;
				case T__1:
					{
					setState(1396);
					le();
					}
					break;
				case LE_SYM:
					{
					setState(1397);
					match(LE_SYM);
					}
					break;
				case LE_ASC:
					{
					setState(1398);
					match(LE_ASC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1401);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1406);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_KW:
					{
					setState(1402);
					greaterThanPhrase();
					}
					break;
				case GT:
					{
					setState(1403);
					match(GT);
					}
					break;
				case T__2:
					{
					setState(1404);
					gt();
					}
					break;
				case GT_SYM:
					{
					setState(1405);
					match(GT_SYM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1408);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1413);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS_KW:
					{
					setState(1409);
					lessThanPhrase();
					}
					break;
				case LT:
					{
					setState(1410);
					match(LT);
					}
					break;
				case T__3:
					{
					setState(1411);
					lt();
					}
					break;
				case LT_SYM:
					{
					setState(1412);
					match(LT_SYM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1415);
				literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1420);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL_KW:
					{
					setState(1416);
					equalToPhrase();
					}
					break;
				case EQ:
					{
					setState(1417);
					match(EQ);
					}
					break;
				case T__4:
					{
					setState(1418);
					eq();
					}
					break;
				case EQ_SYM:
					{
					setState(1419);
					match(EQ_SYM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1422);
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
		enterRule(_localctx, 158, RULE_greaterThanPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			match(GREATER_KW);
			setState(1426);
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
		enterRule(_localctx, 160, RULE_lessThanPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			match(LESS_KW);
			setState(1429);
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
		enterRule(_localctx, 162, RULE_equalToPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			match(EQUAL_KW);
			setState(1432);
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
		enterRule(_localctx, 164, RULE_literalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			literal();
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1435);
				match(COMMA);
				setState(1436);
				literal();
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
		enterRule(_localctx, 166, RULE_individualList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			entityUsage();
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1443);
				match(COMMA);
				setState(1444);
				entityUsage();
				}
				}
				setState(1449);
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
		public TerminalNode IDENTIFIER() { return getToken(OwlDslParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 168, RULE_entityUsage);
		try {
			setState(1455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1450);
				match(CURIE);
				}
				break;
			case CURIE_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1451);
				match(CURIE_EMPTY);
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1452);
				fullIRI();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1453);
				match(IDENTIFIER);
				}
				break;
			case INTELLIJ_DUMMY:
				enterOuterAlt(_localctx, 5);
				{
				setState(1454);
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
		public TerminalNode IDENTIFIER() { return getToken(OwlDslParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 170, RULE_entityId);
		try {
			setState(1462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1457);
				match(CURIE);
				}
				break;
			case CURIE_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1458);
				match(CURIE_EMPTY);
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1459);
				fullIRI();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1460);
				match(IDENTIFIER);
				}
				break;
			case INTELLIJ_DUMMY:
				enterOuterAlt(_localctx, 5);
				{
				setState(1461);
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
		public TerminalNode IDENTIFIER() { return getToken(OwlDslParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 172, RULE_classId);
		try {
			setState(1469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1464);
				match(CURIE);
				}
				break;
			case CURIE_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1465);
				match(CURIE_EMPTY);
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1466);
				fullIRI();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1467);
				match(IDENTIFIER);
				}
				break;
			case INTELLIJ_DUMMY:
				enterOuterAlt(_localctx, 5);
				{
				setState(1468);
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
		public TerminalNode IDENTIFIER() { return getToken(OwlDslParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 174, RULE_propId);
		try {
			setState(1476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1471);
				match(CURIE);
				}
				break;
			case CURIE_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1472);
				match(CURIE_EMPTY);
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1473);
				fullIRI();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1474);
				match(IDENTIFIER);
				}
				break;
			case INTELLIJ_DUMMY:
				enterOuterAlt(_localctx, 5);
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
	public static class IndividualIdContext extends ParserRuleContext {
		public TerminalNode CURIE() { return getToken(OwlDslParser.CURIE, 0); }
		public TerminalNode CURIE_EMPTY() { return getToken(OwlDslParser.CURIE_EMPTY, 0); }
		public FullIRIContext fullIRI() {
			return getRuleContext(FullIRIContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(OwlDslParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 176, RULE_individualId);
		try {
			setState(1483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1478);
				match(CURIE);
				}
				break;
			case CURIE_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1479);
				match(CURIE_EMPTY);
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1480);
				fullIRI();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1481);
				match(IDENTIFIER);
				}
				break;
			case INTELLIJ_DUMMY:
				enterOuterAlt(_localctx, 5);
				{
				setState(1482);
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
		public TerminalNode IDENTIFIER() { return getToken(OwlDslParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 178, RULE_datatypeId);
		try {
			setState(1490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1485);
				match(CURIE);
				}
				break;
			case CURIE_EMPTY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1486);
				match(CURIE_EMPTY);
				}
				break;
			case IRI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1487);
				fullIRI();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1488);
				match(IDENTIFIER);
				}
				break;
			case INTELLIJ_DUMMY:
				enterOuterAlt(_localctx, 5);
				{
				setState(1489);
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
		enterRule(_localctx, 180, RULE_namespaceIRI);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
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
		enterRule(_localctx, 182, RULE_fullIRI);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
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
		enterRule(_localctx, 184, RULE_literal);
		int _la;
		try {
			setState(1507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING3:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				_la = _input.LA(1);
				if ( !(_la==STRING3 || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1500);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(1497);
					match(LANGTAG);
					}
					break;
				case DATATYPE_SEP:
					{
					setState(1498);
					match(DATATYPE_SEP);
					setState(1499);
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
				case EQUIVALENT_CLASSES_KW:
				case ALL_DISJOINT_CLASSES_KW:
				case IS_KW:
				case HAS_KW:
				case OBJECT_PROPERTY_KW:
				case OBJECT_KW:
				case EQUIVALENT_OBJECT_PROPERTIES_KW:
				case DISJOINT_OBJECT_PROPERTIES_KW:
				case SUB_PROPERTY_OF_KW:
				case SUBPROPERTY_KW:
				case DOMAIN_KW:
				case RANGE_KW:
				case CHARACTERISTICS_KW:
				case INVERSE_KW:
				case DATA_PROPERTY_KW:
				case DATA_KW:
				case EQUIVALENT_DATA_PROPERTIES_KW:
				case DISJOINT_DATA_PROPERTIES_KW:
				case ANNOTATION_PROPERTY_KW:
				case ANNOTATION_KW:
				case DATATYPE_KW:
				case DATATYPE_DEFINITION_KW:
				case SUB_PROPERTY_CHAIN_KW:
				case SUBPROPERTY_CHAIN_KW:
				case INDIVIDUAL_KW:
				case NOT_KW:
				case AND_KW:
				case OR_KW:
				case THING_KW:
				case NOTHING_KW:
				case SOME_KW:
				case ONLY_KW:
				case HAS_VALUE_KW:
				case MIN_KW:
				case MAX_KW:
				case EXACTLY_KW:
				case THAT_KW:
				case AT_KW:
				case ONE_OF_KW:
				case ONE_KW:
				case ALL_OF_KW:
				case ALL_KW:
				case ANY_OF_KW:
				case ANY_KW:
				case TRUE_KW:
				case FALSE_KW:
				case IDENTIFIER:
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
				setState(1502);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1503);
				match(DECIMAL);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1504);
				match(DOUBLE);
				}
				break;
			case TRUE_KW:
				enterOuterAlt(_localctx, 5);
				{
				setState(1505);
				match(TRUE_KW);
				}
				break;
			case FALSE_KW:
				enterOuterAlt(_localctx, 6);
				{
				setState(1506);
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
		enterRule(_localctx, 186, RULE_ge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
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
		enterRule(_localctx, 188, RULE_le);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511);
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
		enterRule(_localctx, 190, RULE_gt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
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
		enterRule(_localctx, 192, RULE_lt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
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
		enterRule(_localctx, 194, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
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
		"\u0004\u0001\u008c\u05f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00cc"+
		"\b\u0000\n\u0000\f\u0000\u00cf\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002"+
		"\u00d9\b\u0002\u000b\u0002\f\u0002\u00da\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00e1\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00eb\b\u0005\n\u0005\f\u0005\u00ee\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00f3\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00f9\b\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u0105"+
		"\b\t\n\t\f\t\u0108\t\t\u0001\n\u0001\n\u0001\n\u0003\n\u010d\b\n\u0001"+
		"\u000b\u0004\u000b\u0110\b\u000b\u000b\u000b\f\u000b\u0111\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u011d\b\f\u0001\r\u0001\r\u0003\r\u0121\b\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u012f\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u0133\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0137\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u013c\b\u000e\n\u000e\f\u000e\u013f\t\u000e\u0001"+
		"\u000e\u0003\u000e\u0142\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u0146"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u015a\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0166\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u016e\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0176"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u017d\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0187\b\u0016\u0001"+
		"\u0016\u0003\u0016\u018a\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u019a"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u019f\b\u0017"+
		"\u0001\u0017\u0003\u0017\u01a2\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u01a6\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01aa\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u01ae\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u01b3\b\u0018\u0001\u0018\u0003\u0018\u01b6\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u01ba\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u01be\b\u0018\u0001\u0018\u0005\u0018\u01c1\b\u0018\n\u0018"+
		"\f\u0018\u01c4\t\u0018\u0001\u0018\u0003\u0018\u01c7\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01cb\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01d1\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u01dc\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u01e2\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01e9\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u01ee\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01f8\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01fd\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0202\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0207\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u020e\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0213\b\u001f\u0001\u001f\u0003\u001f\u0216\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u021a\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u021e\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0225\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u022a\b\u001f\u0001\u001f\u0003\u001f\u022d\b\u001f"+
		"\u0001 \u0001 \u0001 \u0003 \u0232\b \u0001 \u0003 \u0235\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0244\b \u0001!\u0001!\u0001!\u0003!\u0249\b!\u0001!\u0003"+
		"!\u024c\b!\u0001!\u0001!\u0003!\u0250\b!\u0001!\u0001!\u0001!\u0003!\u0255"+
		"\b!\u0001\"\u0001\"\u0001\"\u0003\"\u025a\b\"\u0001\"\u0003\"\u025d\b"+
		"\"\u0001\"\u0001\"\u0003\"\u0261\b\"\u0001\"\u0001\"\u0003\"\u0265\b\""+
		"\u0001\"\u0005\"\u0268\b\"\n\"\f\"\u026b\t\"\u0001\"\u0003\"\u026e\b\""+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u027e\b#\u0001$\u0001$\u0001$\u0003"+
		"$\u0283\b$\u0001$\u0003$\u0286\b$\u0001$\u0001$\u0003$\u028a\b$\u0001"+
		"$\u0001$\u0003$\u028e\b$\u0001$\u0005$\u0291\b$\n$\f$\u0294\t$\u0001$"+
		"\u0003$\u0297\b$\u0001$\u0001$\u0001$\u0003$\u029c\b$\u0001$\u0003$\u029f"+
		"\b$\u0001$\u0003$\u02a2\b$\u0001%\u0001%\u0003%\u02a6\b%\u0001%\u0001"+
		"%\u0001&\u0001&\u0003&\u02ac\b&\u0001&\u0001&\u0001&\u0003&\u02b1\b&\u0001"+
		"&\u0001&\u0001&\u0003&\u02b6\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u02be\b\'\u0001\'\u0001\'\u0003\'\u02c2\b\'\u0001("+
		"\u0001(\u0001(\u0003(\u02c7\b(\u0001)\u0001)\u0003)\u02cb\b)\u0001)\u0001"+
		")\u0003)\u02cf\b)\u0001)\u0001)\u0003)\u02d3\b)\u0001)\u0001)\u0003)\u02d7"+
		"\b)\u0001)\u0001)\u0003)\u02db\b)\u0003)\u02dd\b)\u0001*\u0001*\u0001"+
		"*\u0005*\u02e2\b*\n*\f*\u02e5\t*\u0001*\u0001*\u0005*\u02e9\b*\n*\f*\u02ec"+
		"\t*\u0001*\u0001*\u0001*\u0005*\u02f1\b*\n*\f*\u02f4\t*\u0001*\u0001*"+
		"\u0005*\u02f8\b*\n*\f*\u02fb\t*\u0001*\u0003*\u02fe\b*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0003+\u0305\b+\u0001,\u0001,\u0001,\u0001,\u0003,\u030b"+
		"\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0313\b-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u031b\b.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u0323\b/\u00010\u00010\u00010\u00050\u0328\b0\n"+
		"0\f0\u032b\t0\u00011\u00031\u032e\b1\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00031\u0338\b1\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u0341\b1\u00012\u00012\u00012\u00052\u0346\b2\n"+
		"2\f2\u0349\t2\u00013\u00013\u00013\u00043\u034e\b3\u000b3\f3\u034f\u0001"+
		"3\u00013\u00043\u0354\b3\u000b3\f3\u0355\u00033\u0358\b3\u00014\u0001"+
		"4\u00015\u00015\u00015\u00015\u00055\u0360\b5\n5\f5\u0363\t5\u00016\u0001"+
		"6\u00016\u00016\u00016\u00036\u036a\b6\u00017\u00037\u036d\b7\u00017\u0001"+
		"7\u00047\u0371\b7\u000b7\f7\u0372\u00017\u00037\u0376\b7\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00037\u037f\b7\u00017\u00017\u0003"+
		"7\u0383\b7\u00017\u00017\u00017\u00017\u00037\u0389\b7\u00017\u00017\u0003"+
		"7\u038d\b7\u00017\u00017\u00017\u00017\u00037\u0393\b7\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u039f\b7\u0001"+
		"7\u00017\u00037\u03a3\b7\u00017\u00037\u03a6\b7\u00017\u00017\u00017\u0003"+
		"7\u03ab\b7\u00017\u00017\u00037\u03af\b7\u00017\u00037\u03b2\b7\u0001"+
		"7\u00017\u00017\u00037\u03b7\b7\u00017\u00017\u00037\u03bb\b7\u00017\u0003"+
		"7\u03be\b7\u00017\u00037\u03c1\b7\u00017\u00037\u03c4\b7\u00017\u0001"+
		"7\u00017\u00037\u03c9\b7\u00017\u00017\u00017\u00037\u03ce\b7\u00017\u0003"+
		"7\u03d1\b7\u00017\u00017\u00017\u00037\u03d6\b7\u00017\u00017\u00017\u0003"+
		"7\u03db\b7\u00017\u00037\u03de\b7\u00017\u00017\u00017\u00017\u00017\u0003"+
		"7\u03e5\b7\u00017\u00017\u00017\u00017\u00017\u00037\u03ec\b7\u00017\u0003"+
		"7\u03ef\b7\u00017\u00017\u00017\u00017\u00037\u03f5\b7\u00017\u00037\u03f8"+
		"\b7\u00017\u00037\u03fb\b7\u00017\u00037\u03fe\b7\u00017\u00017\u0001"+
		"7\u00017\u00037\u0404\b7\u00017\u00037\u0407\b7\u00017\u00037\u040a\b"+
		"7\u00017\u00037\u040d\b7\u00017\u00017\u00017\u00017\u00037\u0413\b7\u0001"+
		"7\u00037\u0416\b7\u00017\u00017\u00017\u00037\u041b\b7\u00017\u00017\u0003"+
		"7\u041f\b7\u00017\u00037\u0422\b7\u00017\u00017\u00017\u00037\u0427\b"+
		"7\u00017\u00017\u00037\u042b\b7\u00017\u00037\u042e\b7\u00017\u00037\u0431"+
		"\b7\u00017\u00037\u0434\b7\u00017\u00017\u00017\u00017\u00037\u043a\b"+
		"7\u00017\u00037\u043d\b7\u00017\u00037\u0440\b7\u00017\u00037\u0443\b"+
		"7\u00017\u00017\u00017\u00017\u00037\u0449\b7\u00017\u00037\u044c\b7\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00037\u045d\b7\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u046b"+
		"\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0473\b;\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0003<\u047b\b<\u0001=\u0001=\u0001=\u0003"+
		"=\u0480\b=\u0001>\u0001>\u0003>\u0484\b>\u0001>\u0001>\u0001>\u0003>\u0489"+
		"\b>\u0001>\u0001>\u0001>\u0001>\u0003>\u048f\b>\u0001>\u0001>\u0001>\u0003"+
		">\u0494\b>\u0001>\u0001>\u0001>\u0001>\u0003>\u049a\b>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u04a7"+
		"\b>\u0001>\u0001>\u0001>\u0001>\u0003>\u04ad\b>\u0001>\u0003>\u04b0\b"+
		">\u0001>\u0001>\u0003>\u04b4\b>\u0001>\u0001>\u0001>\u0001>\u0003>\u04ba"+
		"\b>\u0001>\u0003>\u04bd\b>\u0001>\u0001>\u0003>\u04c1\b>\u0001>\u0001"+
		">\u0001>\u0001>\u0003>\u04c7\b>\u0001>\u0003>\u04ca\b>\u0001>\u0001>\u0003"+
		">\u04ce\b>\u0001>\u0001>\u0001>\u0001>\u0003>\u04d4\b>\u0001>\u0003>\u04d7"+
		"\b>\u0001>\u0001>\u0003>\u04db\b>\u0001>\u0001>\u0001>\u0001>\u0003>\u04e1"+
		"\b>\u0001>\u0003>\u04e4\b>\u0003>\u04e6\b>\u0001?\u0001?\u0001?\u0001"+
		"?\u0003?\u04ec\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0003@\u04f7\b@\u0001A\u0001A\u0001A\u0005A\u04fc\bA\nA\fA\u04ff"+
		"\tA\u0001B\u0003B\u0502\bB\u0001B\u0001B\u0001B\u0003B\u0507\bB\u0001"+
		"B\u0005B\u050a\bB\nB\fB\u050d\tB\u0001C\u0001C\u0001C\u0005C\u0512\bC"+
		"\nC\fC\u0515\tC\u0001D\u0003D\u0518\bD\u0001D\u0001D\u0001D\u0003D\u051d"+
		"\bD\u0001D\u0005D\u0520\bD\nD\fD\u0523\tD\u0001E\u0001E\u0001E\u0005E"+
		"\u0528\bE\nE\fE\u052b\tE\u0001F\u0001F\u0001G\u0001G\u0001G\u0005G\u0532"+
		"\bG\nG\fG\u0535\tG\u0001H\u0001H\u0001I\u0001I\u0001J\u0001J\u0001J\u0005"+
		"J\u053e\bJ\nJ\fJ\u0541\tJ\u0001K\u0001K\u0001K\u0005K\u0546\bK\nK\fK\u0549"+
		"\tK\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0003L\u0553"+
		"\bL\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0003L\u055f\bL\u0001M\u0001M\u0001M\u0005M\u0564\bM\nM\fM\u0567\tM"+
		"\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u0570\bN\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u0578\bN\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0003N\u057f\bN\u0001N\u0001N\u0001N\u0001N\u0001N\u0003"+
		"N\u0586\bN\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u058d\bN\u0001N\u0003"+
		"N\u0590\bN\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001"+
		"Q\u0001R\u0001R\u0001R\u0005R\u059e\bR\nR\fR\u05a1\tR\u0001S\u0001S\u0001"+
		"S\u0005S\u05a6\bS\nS\fS\u05a9\tS\u0001T\u0001T\u0001T\u0001T\u0001T\u0003"+
		"T\u05b0\bT\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u05b7\bU\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0003V\u05be\bV\u0001W\u0001W\u0001W\u0001W\u0001"+
		"W\u0003W\u05c5\bW\u0001X\u0001X\u0001X\u0001X\u0001X\u0003X\u05cc\bX\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0003Y\u05d3\bY\u0001Z\u0001Z\u0001[\u0001"+
		"[\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u05dd\b\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0003\\\u05e4\b\\\u0001]\u0001]\u0001^\u0001^\u0001"+
		"_\u0001_\u0001`\u0001`\u0001a\u0001a\u0001a\u0000\u0000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u0000\u0007\u0002\u0000\u0007\u0007"+
		"}}\u0002\u0000WW\u0085\u0085\u0002\u0000\\\\\u0088\u0088\u0002\u0000]"+
		"]\u0089\u0089\u0001\u0000\u008a\u008b\u0001\u0000lr\u0001\u0000\u000e"+
		"\u000f\u06e5\u0000\u00cd\u0001\u0000\u0000\u0000\u0002\u00d2\u0001\u0000"+
		"\u0000\u0000\u0004\u00d8\u0001\u0000\u0000\u0000\u0006\u00de\u0001\u0000"+
		"\u0000\u0000\b\u00e2\u0001\u0000\u0000\u0000\n\u00e7\u0001\u0000\u0000"+
		"\u0000\f\u00ef\u0001\u0000\u0000\u0000\u000e\u00f4\u0001\u0000\u0000\u0000"+
		"\u0010\u00fc\u0001\u0000\u0000\u0000\u0012\u0101\u0001\u0000\u0000\u0000"+
		"\u0014\u0109\u0001\u0000\u0000\u0000\u0016\u010f\u0001\u0000\u0000\u0000"+
		"\u0018\u011c\u0001\u0000\u0000\u0000\u001a\u012e\u0001\u0000\u0000\u0000"+
		"\u001c\u0130\u0001\u0000\u0000\u0000\u001e\u0159\u0001\u0000\u0000\u0000"+
		" \u0165\u0001\u0000\u0000\u0000\"\u016d\u0001\u0000\u0000\u0000$\u0175"+
		"\u0001\u0000\u0000\u0000&\u017c\u0001\u0000\u0000\u0000(\u017e\u0001\u0000"+
		"\u0000\u0000*\u0181\u0001\u0000\u0000\u0000,\u0199\u0001\u0000\u0000\u0000"+
		".\u019e\u0001\u0000\u0000\u00000\u01b2\u0001\u0000\u0000\u00002\u01ed"+
		"\u0001\u0000\u0000\u00004\u01f7\u0001\u0000\u0000\u00006\u01fc\u0001\u0000"+
		"\u0000\u00008\u0201\u0001\u0000\u0000\u0000:\u0206\u0001\u0000\u0000\u0000"+
		"<\u020d\u0001\u0000\u0000\u0000>\u0212\u0001\u0000\u0000\u0000@\u0243"+
		"\u0001\u0000\u0000\u0000B\u0248\u0001\u0000\u0000\u0000D\u0259\u0001\u0000"+
		"\u0000\u0000F\u027d\u0001\u0000\u0000\u0000H\u02a1\u0001\u0000\u0000\u0000"+
		"J\u02a3\u0001\u0000\u0000\u0000L\u02b5\u0001\u0000\u0000\u0000N\u02b7"+
		"\u0001\u0000\u0000\u0000P\u02c6\u0001\u0000\u0000\u0000R\u02dc\u0001\u0000"+
		"\u0000\u0000T\u02fd\u0001\u0000\u0000\u0000V\u0304\u0001\u0000\u0000\u0000"+
		"X\u030a\u0001\u0000\u0000\u0000Z\u0312\u0001\u0000\u0000\u0000\\\u031a"+
		"\u0001\u0000\u0000\u0000^\u0322\u0001\u0000\u0000\u0000`\u0324\u0001\u0000"+
		"\u0000\u0000b\u0340\u0001\u0000\u0000\u0000d\u0342\u0001\u0000\u0000\u0000"+
		"f\u034a\u0001\u0000\u0000\u0000h\u0359\u0001\u0000\u0000\u0000j\u035b"+
		"\u0001\u0000\u0000\u0000l\u0369\u0001\u0000\u0000\u0000n\u045c\u0001\u0000"+
		"\u0000\u0000p\u045e\u0001\u0000\u0000\u0000r\u0461\u0001\u0000\u0000\u0000"+
		"t\u046a\u0001\u0000\u0000\u0000v\u0472\u0001\u0000\u0000\u0000x\u047a"+
		"\u0001\u0000\u0000\u0000z\u047f\u0001\u0000\u0000\u0000|\u04e5\u0001\u0000"+
		"\u0000\u0000~\u04eb\u0001\u0000\u0000\u0000\u0080\u04f6\u0001\u0000\u0000"+
		"\u0000\u0082\u04f8\u0001\u0000\u0000\u0000\u0084\u0501\u0001\u0000\u0000"+
		"\u0000\u0086\u050e\u0001\u0000\u0000\u0000\u0088\u0517\u0001\u0000\u0000"+
		"\u0000\u008a\u0524\u0001\u0000\u0000\u0000\u008c\u052c\u0001\u0000\u0000"+
		"\u0000\u008e\u052e\u0001\u0000\u0000\u0000\u0090\u0536\u0001\u0000\u0000"+
		"\u0000\u0092\u0538\u0001\u0000\u0000\u0000\u0094\u053a\u0001\u0000\u0000"+
		"\u0000\u0096\u0542\u0001\u0000\u0000\u0000\u0098\u055e\u0001\u0000\u0000"+
		"\u0000\u009a\u0560\u0001\u0000\u0000\u0000\u009c\u058f\u0001\u0000\u0000"+
		"\u0000\u009e\u0591\u0001\u0000\u0000\u0000\u00a0\u0594\u0001\u0000\u0000"+
		"\u0000\u00a2\u0597\u0001\u0000\u0000\u0000\u00a4\u059a\u0001\u0000\u0000"+
		"\u0000\u00a6\u05a2\u0001\u0000\u0000\u0000\u00a8\u05af\u0001\u0000\u0000"+
		"\u0000\u00aa\u05b6\u0001\u0000\u0000\u0000\u00ac\u05bd\u0001\u0000\u0000"+
		"\u0000\u00ae\u05c4\u0001\u0000\u0000\u0000\u00b0\u05cb\u0001\u0000\u0000"+
		"\u0000\u00b2\u05d2\u0001\u0000\u0000\u0000\u00b4\u05d4\u0001\u0000\u0000"+
		"\u0000\u00b6\u05d6\u0001\u0000\u0000\u0000\u00b8\u05e3\u0001\u0000\u0000"+
		"\u0000\u00ba\u05e5\u0001\u0000\u0000\u0000\u00bc\u05e7\u0001\u0000\u0000"+
		"\u0000\u00be\u05e9\u0001\u0000\u0000\u0000\u00c0\u05eb\u0001\u0000\u0000"+
		"\u0000\u00c2\u05ed\u0001\u0000\u0000\u0000\u00c4\u00cc\u0003\u0002\u0001"+
		"\u0000\u00c5\u00cc\u0003\u0010\b\u0000\u00c6\u00cc\u0003\u0004\u0002\u0000"+
		"\u00c7\u00cc\u0003\u0006\u0003\u0000\u00c8\u00cc\u0003\u0016\u000b\u0000"+
		"\u00c9\u00cc\u0003\u000e\u0007\u0000\u00ca\u00cc\u0005\u0006\u0000\u0000"+
		"\u00cb\u00c4\u0001\u0000\u0000\u0000\u00cb\u00c5\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c6\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0005\u0000\u0000\u0001\u00d1\u0001\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005#\u0000\u0000\u00d3\u00d4\u0007\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0003\u00b4Z\u0000\u00d5\u00d6\u0005{\u0000\u0000\u00d6\u0003\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d9\u0003\b\u0004\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0003\u0006\u0003\u0000\u00dd\u0005\u0001\u0000"+
		"\u0000\u0000\u00de\u00e0\u0003\u0018\f\u0000\u00df\u00e1\u0005{\u0000"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u0007\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u000b\u0000"+
		"\u0000\u00e3\u00e4\u0005\u007f\u0000\u0000\u00e4\u00e5\u0003\n\u0005\u0000"+
		"\u00e5\u00e6\u0005\u0080\u0000\u0000\u00e6\t\u0001\u0000\u0000\u0000\u00e7"+
		"\u00ec\u0003\f\u0006\u0000\u00e8\u00e9\u0005|\u0000\u0000\u00e9\u00eb"+
		"\u0003\f\u0006\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u000b\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f2\u0003\u00a8T\u0000\u00f0\u00f3\u0003\u00b8"+
		"\\\u0000\u00f1\u00f3\u0003\u00a8T\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\r\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005$\u0000\u0000\u00f5\u00f8\u0003\u00b6[\u0000\u00f6\u00f7"+
		"\u0005%\u0000\u0000\u00f7\u00f9\u0003\u00b6[\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0005{\u0000\u0000\u00fb\u000f\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005\f\u0000\u0000\u00fd\u00fe\u0005\u007f\u0000\u0000"+
		"\u00fe\u00ff\u0003\u0012\t\u0000\u00ff\u0100\u0005\u0080\u0000\u0000\u0100"+
		"\u0011\u0001\u0000\u0000\u0000\u0101\u0106\u0003\u0014\n\u0000\u0102\u0103"+
		"\u0005|\u0000\u0000\u0103\u0105\u0003\u0014\n\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0013\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010c\u0003"+
		"\u00a8T\u0000\u010a\u010d\u0003\u00b8\\\u0000\u010b\u010d\u0003\u00a8"+
		"T\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\u0015\u0001\u0000\u0000\u0000\u010e\u0110\u0003\b\u0004\u0000"+
		"\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000"+
		"\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0003\u000e\u0007\u0000"+
		"\u0114\u0017\u0001\u0000\u0000\u0000\u0115\u011d\u0003\u001a\r\u0000\u0116"+
		"\u011d\u0003,\u0016\u0000\u0117\u011d\u0003@ \u0000\u0118\u011d\u0003"+
		"H$\u0000\u0119\u011d\u0003L&\u0000\u011a\u011d\u0003N\'\u0000\u011b\u011d"+
		"\u0003R)\u0000\u011c\u0115\u0001\u0000\u0000\u0000\u011c\u0116\u0001\u0000"+
		"\u0000\u0000\u011c\u0117\u0001\u0000\u0000\u0000\u011c\u0118\u0001\u0000"+
		"\u0000\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u0019\u0001\u0000"+
		"\u0000\u0000\u011e\u0120\u0005&\u0000\u0000\u011f\u0121\u0003*\u0015\u0000"+
		"\u0120\u011f\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u012f\u0003\u00acV\u0000\u0123"+
		"\u012f\u0003\u001c\u000e\u0000\u0124\u0125\u0005\'\u0000\u0000\u0125\u0126"+
		"\u0005\u007f\u0000\u0000\u0126\u0127\u0003d2\u0000\u0127\u0128\u0005\u0080"+
		"\u0000\u0000\u0128\u012f\u0001\u0000\u0000\u0000\u0129\u012a\u0005(\u0000"+
		"\u0000\u012a\u012b\u0005\u007f\u0000\u0000\u012b\u012c\u0003d2\u0000\u012c"+
		"\u012d\u0005\u0080\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e"+
		"\u011e\u0001\u0000\u0000\u0000\u012e\u0123\u0001\u0000\u0000\u0000\u012e"+
		"\u0124\u0001\u0000\u0000\u0000\u012e\u0129\u0001\u0000\u0000\u0000\u012f"+
		"\u001b\u0001\u0000\u0000\u0000\u0130\u0132\u0005&\u0000\u0000\u0131\u0133"+
		"\u0003*\u0015\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136\u0003"+
		"\u00acV\u0000\u0135\u0137\u0005~\u0000\u0000\u0136\u0135\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000"+
		"\u0000\u0138\u013d\u0003\u001e\u000f\u0000\u0139\u013a\u0005~\u0000\u0000"+
		"\u013a\u013c\u0003\u001e\u000f\u0000\u013b\u0139\u0001\u0000\u0000\u0000"+
		"\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000"+
		"\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0142\u0005~\u0000\u0000\u0141"+
		"\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142"+
		"\u001d\u0001\u0000\u0000\u0000\u0143\u0145\u0003 \u0010\u0000\u0144\u0146"+
		"\u0003*\u0015\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0003"+
		"h4\u0000\u0148\u015a\u0001\u0000\u0000\u0000\u0149\u014a\u0003\"\u0011"+
		"\u0000\u014a\u014b\u0003h4\u0000\u014b\u015a\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0003$\u0012\u0000\u014d\u014e\u0003h4\u0000\u014e\u015a\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0003&\u0013\u0000\u0150\u0151\u0005\u007f"+
		"\u0000\u0000\u0151\u0152\u0003d2\u0000\u0152\u0153\u0005\u0080\u0000\u0000"+
		"\u0153\u015a\u0001\u0000\u0000\u0000\u0154\u0155\u0003(\u0014\u0000\u0155"+
		"\u0156\u0005\u007f\u0000\u0000\u0156\u0157\u0003\u0088D\u0000\u0157\u0158"+
		"\u0005\u0080\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0143"+
		"\u0001\u0000\u0000\u0000\u0159\u0149\u0001\u0000\u0000\u0000\u0159\u014c"+
		"\u0001\u0000\u0000\u0000\u0159\u014f\u0001\u0000\u0000\u0000\u0159\u0154"+
		"\u0001\u0000\u0000\u0000\u015a\u001f\u0001\u0000\u0000\u0000\u015b\u0166"+
		"\u0005)\u0000\u0000\u015c\u015d\u0005*\u0000\u0000\u015d\u0166\u0005+"+
		"\u0000\u0000\u015e\u015f\u0005*\u0000\u0000\u015f\u0166\u0005,\u0000\u0000"+
		"\u0160\u0161\u0005*\u0000\u0000\u0161\u0162\u0005-\u0000\u0000\u0162\u0166"+
		"\u0005.\u0000\u0000\u0163\u0166\u0005\u0083\u0000\u0000\u0164\u0166\u0005"+
		"\u0084\u0000\u0000\u0165\u015b\u0001\u0000\u0000\u0000\u0165\u015c\u0001"+
		"\u0000\u0000\u0000\u0165\u015e\u0001\u0000\u0000\u0000\u0165\u0160\u0001"+
		"\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0164\u0001"+
		"\u0000\u0000\u0000\u0166!\u0001\u0000\u0000\u0000\u0167\u016e\u0005/\u0000"+
		"\u0000\u0168\u0169\u00050\u0000\u0000\u0169\u016e\u00051\u0000\u0000\u016a"+
		"\u016b\u0005*\u0000\u0000\u016b\u016c\u00050\u0000\u0000\u016c\u016e\u0005"+
		"1\u0000\u0000\u016d\u0167\u0001\u0000\u0000\u0000\u016d\u0168\u0001\u0000"+
		"\u0000\u0000\u016d\u016a\u0001\u0000\u0000\u0000\u016e#\u0001\u0000\u0000"+
		"\u0000\u016f\u0176\u00052\u0000\u0000\u0170\u0171\u00053\u0000\u0000\u0171"+
		"\u0176\u00054\u0000\u0000\u0172\u0173\u0005*\u0000\u0000\u0173\u0174\u0005"+
		"3\u0000\u0000\u0174\u0176\u00054\u0000\u0000\u0175\u016f\u0001\u0000\u0000"+
		"\u0000\u0175\u0170\u0001\u0000\u0000\u0000\u0175\u0172\u0001\u0000\u0000"+
		"\u0000\u0176%\u0001\u0000\u0000\u0000\u0177\u017d\u00055\u0000\u0000\u0178"+
		"\u0179\u0005*\u0000\u0000\u0179\u017a\u00053\u0000\u0000\u017a\u017b\u0005"+
		"6\u0000\u0000\u017b\u017d\u0005.\u0000\u0000\u017c\u0177\u0001\u0000\u0000"+
		"\u0000\u017c\u0178\u0001\u0000\u0000\u0000\u017d\'\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u00057\u0000\u0000\u017f\u0180\u00058\u0000\u0000\u0180)"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0003\u00b8\\\u0000\u0182+\u0001"+
		"\u0000\u0000\u0000\u0183\u0187\u00059\u0000\u0000\u0184\u0185\u0005:\u0000"+
		"\u0000\u0185\u0187\u0005;\u0000\u0000\u0186\u0183\u0001\u0000\u0000\u0000"+
		"\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000"+
		"\u0188\u018a\u0003*\u0015\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b"+
		"\u019a\u0003\u00aeW\u0000\u018c\u019a\u00030\u0018\u0000\u018d\u019a\u0003"+
		".\u0017\u0000\u018e\u019a\u0003>\u001f\u0000\u018f\u0190\u0005<\u0000"+
		"\u0000\u0190\u0191\u0005\u007f\u0000\u0000\u0191\u0192\u0003\u0088D\u0000"+
		"\u0192\u0193\u0005\u0080\u0000\u0000\u0193\u019a\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0005=\u0000\u0000\u0195\u0196\u0005\u007f\u0000\u0000\u0196"+
		"\u0197\u0003\u0088D\u0000\u0197\u0198\u0005\u0080\u0000\u0000\u0198\u019a"+
		"\u0001\u0000\u0000\u0000\u0199\u0186\u0001\u0000\u0000\u0000\u0199\u018c"+
		"\u0001\u0000\u0000\u0000\u0199\u018d\u0001\u0000\u0000\u0000\u0199\u018e"+
		"\u0001\u0000\u0000\u0000\u0199\u018f\u0001\u0000\u0000\u0000\u0199\u0194"+
		"\u0001\u0000\u0000\u0000\u019a-\u0001\u0000\u0000\u0000\u019b\u019f\u0005"+
		"9\u0000\u0000\u019c\u019d\u0005:\u0000\u0000\u019d\u019f\u0005;\u0000"+
		"\u0000\u019e\u019b\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000"+
		"\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u01a2\u0003*\u0015\u0000"+
		"\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5\u0003\u00aeW\u0000\u01a4"+
		"\u01a6\u0005~\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a9"+
		"\u00034\u001a\u0000\u01a8\u01aa\u0003*\u0015\u0000\u01a9\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ad\u0003\u0080@\u0000\u01ac\u01ae\u0005~\u0000\u0000"+
		"\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000"+
		"\u01ae/\u0001\u0000\u0000\u0000\u01af\u01b3\u00059\u0000\u0000\u01b0\u01b1"+
		"\u0005:\u0000\u0000\u01b1\u01b3\u0005;\u0000\u0000\u01b2\u01af\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b6\u0003*\u0015\u0000\u01b5\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b9\u0003\u00aeW\u0000\u01b8\u01ba\u0005~\u0000\u0000\u01b9"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0001\u0000\u0000\u0000\u01bb\u01c2\u00032\u0019\u0000\u01bc\u01be"+
		"\u0005~\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0003"+
		"2\u0019\u0000\u01c0\u01bd\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c7\u0005~\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c71\u0001\u0000\u0000\u0000"+
		"\u01c8\u01ca\u00036\u001b\u0000\u01c9\u01cb\u0003*\u0015\u0000\u01ca\u01c9"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u0003h4\u0000\u01cd\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ce\u01d0\u00038\u001c\u0000\u01cf\u01d1\u0003*\u0015\u0000"+
		"\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0003h4\u0000\u01d3\u01ee"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d5\u0003:\u001d\u0000\u01d5\u01d6\u0005"+
		"\u007f\u0000\u0000\u01d6\u01d7\u0003\u008aE\u0000\u01d7\u01d8\u0005\u0080"+
		"\u0000\u0000\u01d8\u01ee\u0001\u0000\u0000\u0000\u01d9\u01db\u00034\u001a"+
		"\u0000\u01da\u01dc\u0003*\u0015\u0000\u01db\u01da\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u0003\u0080@\u0000\u01de\u01ee\u0001\u0000\u0000\u0000\u01df"+
		"\u01e1\u0003<\u001e\u0000\u01e0\u01e2\u0003*\u0015\u0000\u01e1\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0003\u0080@\u0000\u01e4\u01ee\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0005C\u0000\u0000\u01e6\u01e8\u0005\u007f\u0000"+
		"\u0000\u01e7\u01e9\u0003*\u0015\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0003\u0080@\u0000\u01eb\u01ec\u0005\u0080\u0000\u0000\u01ec"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ed\u01c8\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ce\u0001\u0000\u0000\u0000\u01ed\u01d4\u0001\u0000\u0000\u0000\u01ed"+
		"\u01d9\u0001\u0000\u0000\u0000\u01ed\u01df\u0001\u0000\u0000\u0000\u01ed"+
		"\u01e5\u0001\u0000\u0000\u0000\u01ee3\u0001\u0000\u0000\u0000\u01ef\u01f8"+
		"\u0005>\u0000\u0000\u01f0\u01f8\u0005\u0083\u0000\u0000\u01f1\u01f8\u0005"+
		"\u0084\u0000\u0000\u01f2\u01f3\u0005*\u0000\u0000\u01f3\u01f4\u0005?\u0000"+
		"\u0000\u01f4\u01f8\u0005.\u0000\u0000\u01f5\u01f6\u0005?\u0000\u0000\u01f6"+
		"\u01f8\u0005.\u0000\u0000\u01f7\u01ef\u0001\u0000\u0000\u0000\u01f7\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f1\u0001\u0000\u0000\u0000\u01f7\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f85\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fd\u0005@\u0000\u0000\u01fa\u01fb\u00057\u0000"+
		"\u0000\u01fb\u01fd\u0005@\u0000\u0000\u01fc\u01f9\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fd7\u0001\u0000\u0000\u0000\u01fe"+
		"\u0202\u0005A\u0000\u0000\u01ff\u0200\u00057\u0000\u0000\u0200\u0202\u0005"+
		"A\u0000\u0000\u0201\u01fe\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000"+
		"\u0000\u0000\u02029\u0001\u0000\u0000\u0000\u0203\u0207\u0005B\u0000\u0000"+
		"\u0204\u0205\u00057\u0000\u0000\u0205\u0207\u0005B\u0000\u0000\u0206\u0203"+
		"\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207;\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0005C\u0000\u0000\u0209\u020e\u0005.\u0000"+
		"\u0000\u020a\u020b\u0005*\u0000\u0000\u020b\u020c\u0005C\u0000\u0000\u020c"+
		"\u020e\u0005.\u0000\u0000\u020d\u0208\u0001\u0000\u0000\u0000\u020d\u020a"+
		"\u0001\u0000\u0000\u0000\u020e=\u0001\u0000\u0000\u0000\u020f\u0213\u0005"+
		"9\u0000\u0000\u0210\u0211\u0005:\u0000\u0000\u0211\u0213\u0005;\u0000"+
		"\u0000\u0212\u020f\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000"+
		"\u0000\u0213\u0215\u0001\u0000\u0000\u0000\u0214\u0216\u0003*\u0015\u0000"+
		"\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000"+
		"\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0219\u0003\u00aeW\u0000\u0218"+
		"\u021a\u0005~\u0000\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u0219\u021a"+
		"\u0001\u0000\u0000\u0000\u021a\u0229\u0001\u0000\u0000\u0000\u021b\u021d"+
		"\u0003<\u001e\u0000\u021c\u021e\u0003*\u0015\u0000\u021d\u021c\u0001\u0000"+
		"\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000"+
		"\u0000\u0000\u021f\u0220\u0003\u0080@\u0000\u0220\u022a\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\u0005C\u0000\u0000\u0222\u0224\u0005\u007f\u0000\u0000"+
		"\u0223\u0225\u0003*\u0015\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226"+
		"\u0227\u0003\u0080@\u0000\u0227\u0228\u0005\u0080\u0000\u0000\u0228\u022a"+
		"\u0001\u0000\u0000\u0000\u0229\u021b\u0001\u0000\u0000\u0000\u0229\u0221"+
		"\u0001\u0000\u0000\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b\u022d"+
		"\u0005~\u0000\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022c\u022d\u0001"+
		"\u0000\u0000\u0000\u022d?\u0001\u0000\u0000\u0000\u022e\u0232\u0005D\u0000"+
		"\u0000\u022f\u0230\u0005E\u0000\u0000\u0230\u0232\u0005;\u0000\u0000\u0231"+
		"\u022e\u0001\u0000\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0232"+
		"\u0234\u0001\u0000\u0000\u0000\u0233\u0235\u0003*\u0015\u0000\u0234\u0233"+
		"\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0001\u0000\u0000\u0000\u0236\u0244\u0003\u00aeW\u0000\u0237\u0244\u0003"+
		"D\"\u0000\u0238\u0244\u0003B!\u0000\u0239\u023a\u0005F\u0000\u0000\u023a"+
		"\u023b\u0005\u007f\u0000\u0000\u023b\u023c\u0003\u0086C\u0000\u023c\u023d"+
		"\u0005\u0080\u0000\u0000\u023d\u0244\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0005G\u0000\u0000\u023f\u0240\u0005\u007f\u0000\u0000\u0240\u0241\u0003"+
		"\u0086C\u0000\u0241\u0242\u0005\u0080\u0000\u0000\u0242\u0244\u0001\u0000"+
		"\u0000\u0000\u0243\u0231\u0001\u0000\u0000\u0000\u0243\u0237\u0001\u0000"+
		"\u0000\u0000\u0243\u0238\u0001\u0000\u0000\u0000\u0243\u0239\u0001\u0000"+
		"\u0000\u0000\u0243\u023e\u0001\u0000\u0000\u0000\u0244A\u0001\u0000\u0000"+
		"\u0000\u0245\u0249\u0005D\u0000\u0000\u0246\u0247\u0005E\u0000\u0000\u0247"+
		"\u0249\u0005;\u0000\u0000\u0248\u0245\u0001\u0000\u0000\u0000\u0248\u0246"+
		"\u0001\u0000\u0000\u0000\u0249\u024b\u0001\u0000\u0000\u0000\u024a\u024c"+
		"\u0003*\u0015\u0000\u024b\u024a\u0001\u0000\u0000\u0000\u024b\u024c\u0001"+
		"\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024f\u0003"+
		"\u00aeW\u0000\u024e\u0250\u0005~\u0000\u0000\u024f\u024e\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000"+
		"\u0000\u0251\u0252\u00034\u001a\u0000\u0252\u0254\u0003\u0080@\u0000\u0253"+
		"\u0255\u0005~\u0000\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0254\u0255"+
		"\u0001\u0000\u0000\u0000\u0255C\u0001\u0000\u0000\u0000\u0256\u025a\u0005"+
		"D\u0000\u0000\u0257\u0258\u0005E\u0000\u0000\u0258\u025a\u0005;\u0000"+
		"\u0000\u0259\u0256\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000"+
		"\u0000\u025a\u025c\u0001\u0000\u0000\u0000\u025b\u025d\u0003*\u0015\u0000"+
		"\u025c\u025b\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u0260\u0003\u00aeW\u0000\u025f"+
		"\u0261\u0005~\u0000\u0000\u0260\u025f\u0001\u0000\u0000\u0000\u0260\u0261"+
		"\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0269"+
		"\u0003F#\u0000\u0263\u0265\u0005~\u0000\u0000\u0264\u0263\u0001\u0000"+
		"\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000"+
		"\u0000\u0000\u0266\u0268\u0003F#\u0000\u0267\u0264\u0001\u0000\u0000\u0000"+
		"\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026d\u0001\u0000\u0000\u0000"+
		"\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026e\u0005~\u0000\u0000\u026d"+
		"\u026c\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e"+
		"E\u0001\u0000\u0000\u0000\u026f\u0270\u00036\u001b\u0000\u0270\u0271\u0003"+
		"h4\u0000\u0271\u027e\u0001\u0000\u0000\u0000\u0272\u0273\u00038\u001c"+
		"\u0000\u0273\u0274\u0003\u0092I\u0000\u0274\u027e\u0001\u0000\u0000\u0000"+
		"\u0275\u0276\u0003:\u001d\u0000\u0276\u0277\u0005\u007f\u0000\u0000\u0277"+
		"\u0278\u0003\u008eG\u0000\u0278\u0279\u0005\u0080\u0000\u0000\u0279\u027e"+
		"\u0001\u0000\u0000\u0000\u027a\u027b\u00034\u001a\u0000\u027b\u027c\u0003"+
		"\u0080@\u0000\u027c\u027e\u0001\u0000\u0000\u0000\u027d\u026f\u0001\u0000"+
		"\u0000\u0000\u027d\u0272\u0001\u0000\u0000\u0000\u027d\u0275\u0001\u0000"+
		"\u0000\u0000\u027d\u027a\u0001\u0000\u0000\u0000\u027eG\u0001\u0000\u0000"+
		"\u0000\u027f\u0283\u0005H\u0000\u0000\u0280\u0281\u0005I\u0000\u0000\u0281"+
		"\u0283\u0005;\u0000\u0000\u0282\u027f\u0001\u0000\u0000\u0000\u0282\u0280"+
		"\u0001\u0000\u0000\u0000\u0283\u0285\u0001\u0000\u0000\u0000\u0284\u0286"+
		"\u0003*\u0015\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0285\u0286\u0001"+
		"\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0289\u0003"+
		"\u00aeW\u0000\u0288\u028a\u0005~\u0000\u0000\u0289\u0288\u0001\u0000\u0000"+
		"\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000"+
		"\u0000\u028b\u0292\u0003J%\u0000\u028c\u028e\u0005~\u0000\u0000\u028d"+
		"\u028c\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e"+
		"\u028f\u0001\u0000\u0000\u0000\u028f\u0291\u0003J%\u0000\u0290\u028d\u0001"+
		"\u0000\u0000\u0000\u0291\u0294\u0001\u0000\u0000\u0000\u0292\u0290\u0001"+
		"\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0296\u0001"+
		"\u0000\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0295\u0297\u0005"+
		"~\u0000\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000"+
		"\u0000\u0000\u0297\u02a2\u0001\u0000\u0000\u0000\u0298\u029c\u0005H\u0000"+
		"\u0000\u0299\u029a\u0005I\u0000\u0000\u029a\u029c\u0005;\u0000\u0000\u029b"+
		"\u0298\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029c"+
		"\u029e\u0001\u0000\u0000\u0000\u029d\u029f\u0003*\u0015\u0000\u029e\u029d"+
		"\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a0"+
		"\u0001\u0000\u0000\u0000\u02a0\u02a2\u0003\u00aeW\u0000\u02a1\u0282\u0001"+
		"\u0000\u0000\u0000\u02a1\u029b\u0001\u0000\u0000\u0000\u02a2I\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a5\u00034\u001a\u0000\u02a4\u02a6\u0003*\u0015\u0000"+
		"\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8\u0003\u0080@\u0000\u02a8"+
		"K\u0001\u0000\u0000\u0000\u02a9\u02ab\u0005J\u0000\u0000\u02aa\u02ac\u0003"+
		"*\u0015\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02b6\u0003\u00b2"+
		"Y\u0000\u02ae\u02b0\u0005K\u0000\u0000\u02af\u02b1\u0003*\u0015\u0000"+
		"\u02b0\u02af\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b3\u0003\u00b2Y\u0000\u02b3"+
		"\u02b4\u0003\u0092I\u0000\u02b4\u02b6\u0001\u0000\u0000\u0000\u02b5\u02a9"+
		"\u0001\u0000\u0000\u0000\u02b5\u02ae\u0001\u0000\u0000\u0000\u02b6M\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b8\u0003P(\u0000\u02b8\u02b9\u0005\u007f\u0000"+
		"\u0000\u02b9\u02ba\u0003\u0084B\u0000\u02ba\u02bb\u0005\u0080\u0000\u0000"+
		"\u02bb\u02bd\u00034\u001a\u0000\u02bc\u02be\u0003*\u0015\u0000\u02bd\u02bc"+
		"\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02bf"+
		"\u0001\u0000\u0000\u0000\u02bf\u02c1\u0003\u0080@\u0000\u02c0\u02c2\u0005"+
		"~\u0000\u0000\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000"+
		"\u0000\u0000\u02c2O\u0001\u0000\u0000\u0000\u02c3\u02c7\u0005L\u0000\u0000"+
		"\u02c4\u02c5\u0005M\u0000\u0000\u02c5\u02c7\u0005N\u0000\u0000\u02c6\u02c3"+
		"\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c7Q\u0001"+
		"\u0000\u0000\u0000\u02c8\u02ca\u0005O\u0000\u0000\u02c9\u02cb\u0003*\u0015"+
		"\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02ce\u0003\u00b0X\u0000"+
		"\u02cd\u02cf\u0005~\u0000\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02ce"+
		"\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0"+
		"\u02d2\u0003T*\u0000\u02d1\u02d3\u0005~\u0000\u0000\u02d2\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02dd\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d6\u0005O\u0000\u0000\u02d5\u02d7\u0003*\u0015"+
		"\u0000\u02d6\u02d5\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02da\u0003\u00b0X\u0000"+
		"\u02d9\u02db\u0005~\u0000\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02da"+
		"\u02db\u0001\u0000\u0000\u0000\u02db\u02dd\u0001\u0000\u0000\u0000\u02dc"+
		"\u02c8\u0001\u0000\u0000\u0000\u02dc\u02d4\u0001\u0000\u0000\u0000\u02dd"+
		"S\u0001\u0000\u0000\u0000\u02de\u02e3\u0003V+\u0000\u02df\u02e0\u0005"+
		"~\u0000\u0000\u02e0\u02e2\u0003`0\u0000\u02e1\u02df\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e5\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4\u02ea\u0001\u0000\u0000"+
		"\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e7\u0005~\u0000\u0000"+
		"\u02e7\u02e9\u0003Z-\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e9\u02ec"+
		"\u0001\u0000\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02ea\u02eb"+
		"\u0001\u0000\u0000\u0000\u02eb\u02fe\u0001\u0000\u0000\u0000\u02ec\u02ea"+
		"\u0001\u0000\u0000\u0000\u02ed\u02f2\u0003`0\u0000\u02ee\u02ef\u0005~"+
		"\u0000\u0000\u02ef\u02f1\u0003`0\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000"+
		"\u02f1\u02f4\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000"+
		"\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f9\u0001\u0000\u0000\u0000"+
		"\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005~\u0000\u0000\u02f6"+
		"\u02f8\u0003Z-\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f8\u02fb\u0001"+
		"\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001"+
		"\u0000\u0000\u0000\u02fa\u02fe\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001"+
		"\u0000\u0000\u0000\u02fc\u02fe\u0003Z-\u0000\u02fd\u02de\u0001\u0000\u0000"+
		"\u0000\u02fd\u02ed\u0001\u0000\u0000\u0000\u02fd\u02fc\u0001\u0000\u0000"+
		"\u0000\u02feU\u0001\u0000\u0000\u0000\u02ff\u0300\u0005P\u0000\u0000\u0300"+
		"\u0305\u0003d2\u0000\u0301\u0302\u0003X,\u0000\u0302\u0303\u0003d2\u0000"+
		"\u0303\u0305\u0001\u0000\u0000\u0000\u0304\u02ff\u0001\u0000\u0000\u0000"+
		"\u0304\u0301\u0001\u0000\u0000\u0000\u0305W\u0001\u0000\u0000\u0000\u0306"+
		"\u0307\u0005*\u0000\u0000\u0307\u030b\u0005+\u0000\u0000\u0308\u0309\u0005"+
		"*\u0000\u0000\u0309\u030b\u0005,\u0000\u0000\u030a\u0306\u0001\u0000\u0000"+
		"\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030bY\u0001\u0000\u0000\u0000"+
		"\u030c\u030d\u0003\\.\u0000\u030d\u030e\u0003\u00a6S\u0000\u030e\u0313"+
		"\u0001\u0000\u0000\u0000\u030f\u0310\u0003^/\u0000\u0310\u0311\u0003\u00a6"+
		"S\u0000\u0311\u0313\u0001\u0000\u0000\u0000\u0312\u030c\u0001\u0000\u0000"+
		"\u0000\u0312\u030f\u0001\u0000\u0000\u0000\u0313[\u0001\u0000\u0000\u0000"+
		"\u0314\u031b\u0005Q\u0000\u0000\u0315\u0316\u0005R\u0000\u0000\u0316\u031b"+
		"\u0005S\u0000\u0000\u0317\u0318\u0005*\u0000\u0000\u0318\u0319\u0005R"+
		"\u0000\u0000\u0319\u031b\u0005S\u0000\u0000\u031a\u0314\u0001\u0000\u0000"+
		"\u0000\u031a\u0315\u0001\u0000\u0000\u0000\u031a\u0317\u0001\u0000\u0000"+
		"\u0000\u031b]\u0001\u0000\u0000\u0000\u031c\u0323\u0005T\u0000\u0000\u031d"+
		"\u031e\u0005U\u0000\u0000\u031e\u0323\u0005V\u0000\u0000\u031f\u0320\u0005"+
		"*\u0000\u0000\u0320\u0321\u0005U\u0000\u0000\u0321\u0323\u0005V\u0000"+
		"\u0000\u0322\u031c\u0001\u0000\u0000\u0000\u0322\u031d\u0001\u0000\u0000"+
		"\u0000\u0322\u031f\u0001\u0000\u0000\u0000\u0323_\u0001\u0000\u0000\u0000"+
		"\u0324\u0329\u0003b1\u0000\u0325\u0326\u0005|\u0000\u0000\u0326\u0328"+
		"\u0003b1\u0000\u0327\u0325\u0001\u0000\u0000\u0000\u0328\u032b\u0001\u0000"+
		"\u0000\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000"+
		"\u0000\u0000\u032aa\u0001\u0000\u0000\u0000\u032b\u0329\u0001\u0000\u0000"+
		"\u0000\u032c\u032e\u0003*\u0015\u0000\u032d\u032c\u0001\u0000\u0000\u0000"+
		"\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000"+
		"\u032f\u0330\u0003\u0080@\u0000\u0330\u0331\u0003\u00a8T\u0000\u0331\u0341"+
		"\u0001\u0000\u0000\u0000\u0332\u0333\u0003\u0080@\u0000\u0333\u0334\u0003"+
		"\u00b8\\\u0000\u0334\u0341\u0001\u0000\u0000\u0000\u0335\u0337\u0007\u0001"+
		"\u0000\u0000\u0336\u0338\u0003*\u0015\u0000\u0337\u0336\u0001\u0000\u0000"+
		"\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000"+
		"\u0000\u0339\u033a\u0003\u0080@\u0000\u033a\u033b\u0003\u00a8T\u0000\u033b"+
		"\u0341\u0001\u0000\u0000\u0000\u033c\u033d\u0007\u0001\u0000\u0000\u033d"+
		"\u033e\u0003\u0080@\u0000\u033e\u033f\u0003\u00b8\\\u0000\u033f\u0341"+
		"\u0001\u0000\u0000\u0000\u0340\u032d\u0001\u0000\u0000\u0000\u0340\u0332"+
		"\u0001\u0000\u0000\u0000\u0340\u0335\u0001\u0000\u0000\u0000\u0340\u033c"+
		"\u0001\u0000\u0000\u0000\u0341c\u0001\u0000\u0000\u0000\u0342\u0347\u0003"+
		"h4\u0000\u0343\u0344\u0005|\u0000\u0000\u0344\u0346\u0003h4\u0000\u0345"+
		"\u0343\u0001\u0000\u0000\u0000\u0346\u0349\u0001\u0000\u0000\u0000\u0347"+
		"\u0345\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000\u0000\u0348"+
		"e\u0001\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u034a\u0357"+
		"\u0003h4\u0000\u034b\u034c\u0005|\u0000\u0000\u034c\u034e\u0003h4\u0000"+
		"\u034d\u034b\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000"+
		"\u034f\u034d\u0001\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000"+
		"\u0350\u0358\u0001\u0000\u0000\u0000\u0351\u0352\u0005X\u0000\u0000\u0352"+
		"\u0354\u0003h4\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0354\u0355\u0001"+
		"\u0000\u0000\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0356\u0001"+
		"\u0000\u0000\u0000\u0356\u0358\u0001\u0000\u0000\u0000\u0357\u034d\u0001"+
		"\u0000\u0000\u0000\u0357\u0353\u0001\u0000\u0000\u0000\u0357\u0358\u0001"+
		"\u0000\u0000\u0000\u0358g\u0001\u0000\u0000\u0000\u0359\u035a\u0003j5"+
		"\u0000\u035ai\u0001\u0000\u0000\u0000\u035b\u0361\u0003l6\u0000\u035c"+
		"\u035d\u0003~?\u0000\u035d\u035e\u0003l6\u0000\u035e\u0360\u0001\u0000"+
		"\u0000\u0000\u035f\u035c\u0001\u0000\u0000\u0000\u0360\u0363\u0001\u0000"+
		"\u0000\u0000\u0361\u035f\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000"+
		"\u0000\u0000\u0362k\u0001\u0000\u0000\u0000\u0363\u0361\u0001\u0000\u0000"+
		"\u0000\u0364\u036a\u0003n7\u0000\u0365\u0366\u0005\u007f\u0000\u0000\u0366"+
		"\u0367\u0003h4\u0000\u0367\u0368\u0005\u0080\u0000\u0000\u0368\u036a\u0001"+
		"\u0000\u0000\u0000\u0369\u0364\u0001\u0000\u0000\u0000\u0369\u0365\u0001"+
		"\u0000\u0000\u0000\u036am\u0001\u0000\u0000\u0000\u036b\u036d\u0003*\u0015"+
		"\u0000\u036c\u036b\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000"+
		"\u0000\u036d\u036e\u0001\u0000\u0000\u0000\u036e\u0370\u0003\u00a8T\u0000"+
		"\u036f\u0371\u0003|>\u0000\u0370\u036f\u0001\u0000\u0000\u0000\u0371\u0372"+
		"\u0001\u0000\u0000\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0372\u0373"+
		"\u0001\u0000\u0000\u0000\u0373\u045d\u0001\u0000\u0000\u0000\u0374\u0376"+
		"\u0003*\u0015\u0000\u0375\u0374\u0001\u0000\u0000\u0000\u0375\u0376\u0001"+
		"\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u045d\u0003"+
		"\u00a8T\u0000\u0378\u045d\u0005Z\u0000\u0000\u0379\u045d\u0005[\u0000"+
		"\u0000\u037a\u037b\u0007\u0001\u0000\u0000\u037b\u045d\u0003l6\u0000\u037c"+
		"\u037e\u0007\u0002\u0000\u0000\u037d\u037f\u0003*\u0015\u0000\u037e\u037d"+
		"\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0380"+
		"\u0001\u0000\u0000\u0000\u0380\u0382\u0003\u0080@\u0000\u0381\u0383\u0003"+
		"*\u0015\u0000\u0382\u0381\u0001\u0000\u0000\u0000\u0382\u0383\u0001\u0000"+
		"\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0385\u0003h4\u0000"+
		"\u0385\u045d\u0001\u0000\u0000\u0000\u0386\u0388\u0007\u0003\u0000\u0000"+
		"\u0387\u0389\u0003*\u0015\u0000\u0388\u0387\u0001\u0000\u0000\u0000\u0388"+
		"\u0389\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000\u0000\u0000\u038a"+
		"\u038c\u0003\u0080@\u0000\u038b\u038d\u0003*\u0015\u0000\u038c\u038b\u0001"+
		"\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u038e\u0001"+
		"\u0000\u0000\u0000\u038e\u038f\u0003h4\u0000\u038f\u045d\u0001\u0000\u0000"+
		"\u0000\u0390\u0392\u0005^\u0000\u0000\u0391\u0393\u0003*\u0015\u0000\u0392"+
		"\u0391\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000\u0000\u0393"+
		"\u0394\u0001\u0000\u0000\u0000\u0394\u0395\u0003\u0080@\u0000\u0395\u0396"+
		"\u0003\u00a8T\u0000\u0396\u045d\u0001\u0000\u0000\u0000\u0397\u0398\u0005"+
		"^\u0000\u0000\u0398\u0399\u0003\u0080@\u0000\u0399\u039a\u0003\u00b8\\"+
		"\u0000\u039a\u045d\u0001\u0000\u0000\u0000\u039b\u039c\u0005_\u0000\u0000"+
		"\u039c\u039e\u0005\u0010\u0000\u0000\u039d\u039f\u0003*\u0015\u0000\u039e"+
		"\u039d\u0001\u0000\u0000\u0000\u039e\u039f\u0001\u0000\u0000\u0000\u039f"+
		"\u03a0\u0001\u0000\u0000\u0000\u03a0\u03a5\u0003\u0080@\u0000\u03a1\u03a3"+
		"\u0003*\u0015\u0000\u03a2\u03a1\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001"+
		"\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4\u03a6\u0003"+
		"h4\u0000\u03a5\u03a2\u0001\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000"+
		"\u0000\u03a6\u045d\u0001\u0000\u0000\u0000\u03a7\u03a8\u0005`\u0000\u0000"+
		"\u03a8\u03aa\u0005\u0010\u0000\u0000\u03a9\u03ab\u0003*\u0015\u0000\u03aa"+
		"\u03a9\u0001\u0000\u0000\u0000\u03aa\u03ab\u0001\u0000\u0000\u0000\u03ab"+
		"\u03ac\u0001\u0000\u0000\u0000\u03ac\u03b1\u0003\u0080@\u0000\u03ad\u03af"+
		"\u0003*\u0015\u0000\u03ae\u03ad\u0001\u0000\u0000\u0000\u03ae\u03af\u0001"+
		"\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000\u03b0\u03b2\u0003"+
		"h4\u0000\u03b1\u03ae\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000"+
		"\u0000\u03b2\u045d\u0001\u0000\u0000\u0000\u03b3\u03b4\u0005a\u0000\u0000"+
		"\u03b4\u03b6\u0005\u0010\u0000\u0000\u03b5\u03b7\u0003*\u0015\u0000\u03b6"+
		"\u03b5\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7"+
		"\u03b8\u0001\u0000\u0000\u0000\u03b8\u03bd\u0003\u0080@\u0000\u03b9\u03bb"+
		"\u0003*\u0015\u0000\u03ba\u03b9\u0001\u0000\u0000\u0000\u03ba\u03bb\u0001"+
		"\u0000\u0000\u0000\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u03be\u0003"+
		"h4\u0000\u03bd\u03ba\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000"+
		"\u0000\u03be\u045d\u0001\u0000\u0000\u0000\u03bf\u03c1\u0005b\u0000\u0000"+
		"\u03c0\u03bf\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000"+
		"\u03c1\u03c3\u0001\u0000\u0000\u0000\u03c2\u03c4\u0003*\u0015\u0000\u03c3"+
		"\u03c2\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000\u0000\u03c4"+
		"\u03c5\u0001\u0000\u0000\u0000\u03c5\u03c6\u0003\u0080@\u0000\u03c6\u03c8"+
		"\u0007\u0002\u0000\u0000\u03c7\u03c9\u0003*\u0015\u0000\u03c8\u03c7\u0001"+
		"\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03ca\u0001"+
		"\u0000\u0000\u0000\u03ca\u03cb\u0003h4\u0000\u03cb\u045d\u0001\u0000\u0000"+
		"\u0000\u03cc\u03ce\u0005b\u0000\u0000\u03cd\u03cc\u0001\u0000\u0000\u0000"+
		"\u03cd\u03ce\u0001\u0000\u0000\u0000\u03ce\u03d0\u0001\u0000\u0000\u0000"+
		"\u03cf\u03d1\u0003*\u0015\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d0"+
		"\u03d1\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000\u0000\u03d2"+
		"\u03d3\u0003\u0080@\u0000\u03d3\u03d5\u0007\u0003\u0000\u0000\u03d4\u03d6"+
		"\u0003*\u0015\u0000\u03d5\u03d4\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001"+
		"\u0000\u0000\u0000\u03d6\u03d7\u0001\u0000\u0000\u0000\u03d7\u03d8\u0003"+
		"h4\u0000\u03d8\u045d\u0001\u0000\u0000\u0000\u03d9\u03db\u0005b\u0000"+
		"\u0000\u03da\u03d9\u0001\u0000\u0000\u0000\u03da\u03db\u0001\u0000\u0000"+
		"\u0000\u03db\u03dd\u0001\u0000\u0000\u0000\u03dc\u03de\u0003*\u0015\u0000"+
		"\u03dd\u03dc\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000\u0000"+
		"\u03de\u03df\u0001\u0000\u0000\u0000\u03df\u03e0\u0003\u0080@\u0000\u03e0"+
		"\u03e1\u0005^\u0000\u0000\u03e1\u03e2\u0003\u00a8T\u0000\u03e2\u045d\u0001"+
		"\u0000\u0000\u0000\u03e3\u03e5\u0005b\u0000\u0000\u03e4\u03e3\u0001\u0000"+
		"\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000"+
		"\u0000\u0000\u03e6\u03e7\u0003\u0080@\u0000\u03e7\u03e8\u0005^\u0000\u0000"+
		"\u03e8\u03e9\u0003\u00b8\\\u0000\u03e9\u045d\u0001\u0000\u0000\u0000\u03ea"+
		"\u03ec\u0005b\u0000\u0000\u03eb\u03ea\u0001\u0000\u0000\u0000\u03eb\u03ec"+
		"\u0001\u0000\u0000\u0000\u03ec\u03ee\u0001\u0000\u0000\u0000\u03ed\u03ef"+
		"\u0003*\u0015\u0000\u03ee\u03ed\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001"+
		"\u0000\u0000\u0000\u03ef\u03f0\u0001\u0000\u0000\u0000\u03f0\u03f1\u0003"+
		"\u0080@\u0000\u03f1\u03f2\u0005_\u0000\u0000\u03f2\u03f7\u0005\u0010\u0000"+
		"\u0000\u03f3\u03f5\u0003*\u0015\u0000\u03f4\u03f3\u0001\u0000\u0000\u0000"+
		"\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000"+
		"\u03f6\u03f8\u0003h4\u0000\u03f7\u03f4\u0001\u0000\u0000\u0000\u03f7\u03f8"+
		"\u0001\u0000\u0000\u0000\u03f8\u045d\u0001\u0000\u0000\u0000\u03f9\u03fb"+
		"\u0005b\u0000\u0000\u03fa\u03f9\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001"+
		"\u0000\u0000\u0000\u03fb\u03fd\u0001\u0000\u0000\u0000\u03fc\u03fe\u0003"+
		"*\u0015\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000"+
		"\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0400\u0003\u0080"+
		"@\u0000\u0400\u0401\u0005`\u0000\u0000\u0401\u0406\u0005\u0010\u0000\u0000"+
		"\u0402\u0404\u0003*\u0015\u0000\u0403\u0402\u0001\u0000\u0000\u0000\u0403"+
		"\u0404\u0001\u0000\u0000\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405"+
		"\u0407\u0003h4\u0000\u0406\u0403\u0001\u0000\u0000\u0000\u0406\u0407\u0001"+
		"\u0000\u0000\u0000\u0407\u045d\u0001\u0000\u0000\u0000\u0408\u040a\u0005"+
		"b\u0000\u0000\u0409\u0408\u0001\u0000\u0000\u0000\u0409\u040a\u0001\u0000"+
		"\u0000\u0000\u040a\u040c\u0001\u0000\u0000\u0000\u040b\u040d\u0003*\u0015"+
		"\u0000\u040c\u040b\u0001\u0000\u0000\u0000\u040c\u040d\u0001\u0000\u0000"+
		"\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040e\u040f\u0003\u0080@\u0000"+
		"\u040f\u0410\u0005a\u0000\u0000\u0410\u0415\u0005\u0010\u0000\u0000\u0411"+
		"\u0413\u0003*\u0015\u0000\u0412\u0411\u0001\u0000\u0000\u0000\u0412\u0413"+
		"\u0001\u0000\u0000\u0000\u0413\u0414\u0001\u0000\u0000\u0000\u0414\u0416"+
		"\u0003h4\u0000\u0415\u0412\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000"+
		"\u0000\u0000\u0416\u045d\u0001\u0000\u0000\u0000\u0417\u0418\u0003p8\u0000"+
		"\u0418\u041a\u0005\u0010\u0000\u0000\u0419\u041b\u0003*\u0015\u0000\u041a"+
		"\u0419\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b"+
		"\u041c\u0001\u0000\u0000\u0000\u041c\u0421\u0003\u0080@\u0000\u041d\u041f"+
		"\u0003*\u0015\u0000\u041e\u041d\u0001\u0000\u0000\u0000\u041e\u041f\u0001"+
		"\u0000\u0000\u0000\u041f\u0420\u0001\u0000\u0000\u0000\u0420\u0422\u0003"+
		"h4\u0000\u0421\u041e\u0001\u0000\u0000\u0000\u0421\u0422\u0001\u0000\u0000"+
		"\u0000\u0422\u045d\u0001\u0000\u0000\u0000\u0423\u0424\u0003r9\u0000\u0424"+
		"\u0426\u0005\u0010\u0000\u0000\u0425\u0427\u0003*\u0015\u0000\u0426\u0425"+
		"\u0001\u0000\u0000\u0000\u0426\u0427\u0001\u0000\u0000\u0000\u0427\u0428"+
		"\u0001\u0000\u0000\u0000\u0428\u042d\u0003\u0080@\u0000\u0429\u042b\u0003"+
		"*\u0015\u0000\u042a\u0429\u0001\u0000\u0000\u0000\u042a\u042b\u0001\u0000"+
		"\u0000\u0000\u042b\u042c\u0001\u0000\u0000\u0000\u042c\u042e\u0003h4\u0000"+
		"\u042d\u042a\u0001\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000"+
		"\u042e\u045d\u0001\u0000\u0000\u0000\u042f\u0431\u0005b\u0000\u0000\u0430"+
		"\u042f\u0001\u0000\u0000\u0000\u0430\u0431\u0001\u0000\u0000\u0000\u0431"+
		"\u0433\u0001\u0000\u0000\u0000\u0432\u0434\u0003*\u0015\u0000\u0433\u0432"+
		"\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434\u0435"+
		"\u0001\u0000\u0000\u0000\u0435\u0436\u0003\u0080@\u0000\u0436\u0437\u0003"+
		"p8\u0000\u0437\u043c\u0005\u0010\u0000\u0000\u0438\u043a\u0003*\u0015"+
		"\u0000\u0439\u0438\u0001\u0000\u0000\u0000\u0439\u043a\u0001\u0000\u0000"+
		"\u0000\u043a\u043b\u0001\u0000\u0000\u0000\u043b\u043d\u0003h4\u0000\u043c"+
		"\u0439\u0001\u0000\u0000\u0000\u043c\u043d\u0001\u0000\u0000\u0000\u043d"+
		"\u045d\u0001\u0000\u0000\u0000\u043e\u0440\u0005b\u0000\u0000\u043f\u043e"+
		"\u0001\u0000\u0000\u0000\u043f\u0440\u0001\u0000\u0000\u0000\u0440\u0442"+
		"\u0001\u0000\u0000\u0000\u0441\u0443\u0003*\u0015\u0000\u0442\u0441\u0001"+
		"\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000\u0000\u0443\u0444\u0001"+
		"\u0000\u0000\u0000\u0444\u0445\u0003\u0080@\u0000\u0445\u0446\u0003r9"+
		"\u0000\u0446\u044b\u0005\u0010\u0000\u0000\u0447\u0449\u0003*\u0015\u0000"+
		"\u0448\u0447\u0001\u0000\u0000\u0000\u0448\u0449\u0001\u0000\u0000\u0000"+
		"\u0449\u044a\u0001\u0000\u0000\u0000\u044a\u044c\u0003h4\u0000\u044b\u0448"+
		"\u0001\u0000\u0000\u0000\u044b\u044c\u0001\u0000\u0000\u0000\u044c\u045d"+
		"\u0001\u0000\u0000\u0000\u044d\u044e\u0003t:\u0000\u044e\u044f\u0005\u007f"+
		"\u0000\u0000\u044f\u0450\u0003\u00a6S\u0000\u0450\u0451\u0005\u0080\u0000"+
		"\u0000\u0451\u045d\u0001\u0000\u0000\u0000\u0452\u0453\u0003v;\u0000\u0453"+
		"\u0454\u0005\u007f\u0000\u0000\u0454\u0455\u0003f3\u0000\u0455\u0456\u0005"+
		"\u0080\u0000\u0000\u0456\u045d\u0001\u0000\u0000\u0000\u0457\u0458\u0003"+
		"x<\u0000\u0458\u0459\u0005\u007f\u0000\u0000\u0459\u045a\u0003f3\u0000"+
		"\u045a\u045b\u0005\u0080\u0000\u0000\u045b\u045d\u0001\u0000\u0000\u0000"+
		"\u045c\u036c\u0001\u0000\u0000\u0000\u045c\u0375\u0001\u0000\u0000\u0000"+
		"\u045c\u0378\u0001\u0000\u0000\u0000\u045c\u0379\u0001\u0000\u0000\u0000"+
		"\u045c\u037a\u0001\u0000\u0000\u0000\u045c\u037c\u0001\u0000\u0000\u0000"+
		"\u045c\u0386\u0001\u0000\u0000\u0000\u045c\u0390\u0001\u0000\u0000\u0000"+
		"\u045c\u0397\u0001\u0000\u0000\u0000\u045c\u039b\u0001\u0000\u0000\u0000"+
		"\u045c\u03a7\u0001\u0000\u0000\u0000\u045c\u03b3\u0001\u0000\u0000\u0000"+
		"\u045c\u03c0\u0001\u0000\u0000\u0000\u045c\u03cd\u0001\u0000\u0000\u0000"+
		"\u045c\u03da\u0001\u0000\u0000\u0000\u045c\u03e4\u0001\u0000\u0000\u0000"+
		"\u045c\u03eb\u0001\u0000\u0000\u0000\u045c\u03fa\u0001\u0000\u0000\u0000"+
		"\u045c\u0409\u0001\u0000\u0000\u0000\u045c\u0417\u0001\u0000\u0000\u0000"+
		"\u045c\u0423\u0001\u0000\u0000\u0000\u045c\u0430\u0001\u0000\u0000\u0000"+
		"\u045c\u043f\u0001\u0000\u0000\u0000\u045c\u044d\u0001\u0000\u0000\u0000"+
		"\u045c\u0452\u0001\u0000\u0000\u0000\u045c\u0457\u0001\u0000\u0000\u0000"+
		"\u045do\u0001\u0000\u0000\u0000\u045e\u045f\u0005c\u0000\u0000\u045f\u0460"+
		"\u0005d\u0000\u0000\u0460q\u0001\u0000\u0000\u0000\u0461\u0462\u0005c"+
		"\u0000\u0000\u0462\u0463\u0005e\u0000\u0000\u0463s\u0001\u0000\u0000\u0000"+
		"\u0464\u046b\u0005f\u0000\u0000\u0465\u0466\u0005g\u0000\u0000\u0466\u046b"+
		"\u0005.\u0000\u0000\u0467\u0468\u0005*\u0000\u0000\u0468\u0469\u0005g"+
		"\u0000\u0000\u0469\u046b\u0005.\u0000\u0000\u046a\u0464\u0001\u0000\u0000"+
		"\u0000\u046a\u0465\u0001\u0000\u0000\u0000\u046a\u0467\u0001\u0000\u0000"+
		"\u0000\u046bu\u0001\u0000\u0000\u0000\u046c\u0473\u0005h\u0000\u0000\u046d"+
		"\u046e\u0005i\u0000\u0000\u046e\u0473\u0005.\u0000\u0000\u046f\u0470\u0005"+
		"*\u0000\u0000\u0470\u0471\u0005i\u0000\u0000\u0471\u0473\u0005.\u0000"+
		"\u0000\u0472\u046c\u0001\u0000\u0000\u0000\u0472\u046d\u0001\u0000\u0000"+
		"\u0000\u0472\u046f\u0001\u0000\u0000\u0000\u0473w\u0001\u0000\u0000\u0000"+
		"\u0474\u047b\u0005j\u0000\u0000\u0475\u0476\u0005k\u0000\u0000\u0476\u047b"+
		"\u0005.\u0000\u0000\u0477\u0478\u0005*\u0000\u0000\u0478\u0479\u0005k"+
		"\u0000\u0000\u0479\u047b\u0005.\u0000\u0000\u047a\u0474\u0001\u0000\u0000"+
		"\u0000\u047a\u0475\u0001\u0000\u0000\u0000\u047a\u0477\u0001\u0000\u0000"+
		"\u0000\u047by\u0001\u0000\u0000\u0000\u047c\u0480\u0005b\u0000\u0000\u047d"+
		"\u047e\u0005X\u0000\u0000\u047e\u0480\u0005b\u0000\u0000\u047f\u047c\u0001"+
		"\u0000\u0000\u0000\u047f\u047d\u0001\u0000\u0000\u0000\u0480{\u0001\u0000"+
		"\u0000\u0000\u0481\u0483\u0003z=\u0000\u0482\u0484\u0003*\u0015\u0000"+
		"\u0483\u0482\u0001\u0000\u0000\u0000\u0483\u0484\u0001\u0000\u0000\u0000"+
		"\u0484\u0485\u0001\u0000\u0000\u0000\u0485\u0486\u0003\u0080@\u0000\u0486"+
		"\u0488\u0007\u0002\u0000\u0000\u0487\u0489\u0003*\u0015\u0000\u0488\u0487"+
		"\u0001\u0000\u0000\u0000\u0488\u0489\u0001\u0000\u0000\u0000\u0489\u048a"+
		"\u0001\u0000\u0000\u0000\u048a\u048b\u0003h4\u0000\u048b\u04e6\u0001\u0000"+
		"\u0000\u0000\u048c\u048e\u0003z=\u0000\u048d\u048f\u0003*\u0015\u0000"+
		"\u048e\u048d\u0001\u0000\u0000\u0000\u048e\u048f\u0001\u0000\u0000\u0000"+
		"\u048f\u0490\u0001\u0000\u0000\u0000\u0490\u0491\u0003\u0080@\u0000\u0491"+
		"\u0493\u0007\u0003\u0000\u0000\u0492\u0494\u0003*\u0015\u0000\u0493\u0492"+
		"\u0001\u0000\u0000\u0000\u0493\u0494\u0001\u0000\u0000\u0000\u0494\u0495"+
		"\u0001\u0000\u0000\u0000\u0495\u0496\u0003h4\u0000\u0496\u04e6\u0001\u0000"+
		"\u0000\u0000\u0497\u0499\u0003z=\u0000\u0498\u049a\u0003*\u0015\u0000"+
		"\u0499\u0498\u0001\u0000\u0000\u0000\u0499\u049a\u0001\u0000\u0000\u0000"+
		"\u049a\u049b\u0001\u0000\u0000\u0000\u049b\u049c\u0003\u0080@\u0000\u049c"+
		"\u049d\u0005^\u0000\u0000\u049d\u049e\u0003\u00a8T\u0000\u049e\u04e6\u0001"+
		"\u0000\u0000\u0000\u049f\u04a0\u0003z=\u0000\u04a0\u04a1\u0003\u0080@"+
		"\u0000\u04a1\u04a2\u0005^\u0000\u0000\u04a2\u04a3\u0003\u00b8\\\u0000"+
		"\u04a3\u04e6\u0001\u0000\u0000\u0000\u04a4\u04a6\u0003z=\u0000\u04a5\u04a7"+
		"\u0003*\u0015\u0000\u04a6\u04a5\u0001\u0000\u0000\u0000\u04a6\u04a7\u0001"+
		"\u0000\u0000\u0000\u04a7\u04a8\u0001\u0000\u0000\u0000\u04a8\u04a9\u0003"+
		"\u0080@\u0000\u04a9\u04aa\u0005_\u0000\u0000\u04aa\u04af\u0005\u0010\u0000"+
		"\u0000\u04ab\u04ad\u0003*\u0015\u0000\u04ac\u04ab\u0001\u0000\u0000\u0000"+
		"\u04ac\u04ad\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000\u0000"+
		"\u04ae\u04b0\u0003h4\u0000\u04af\u04ac\u0001\u0000\u0000\u0000\u04af\u04b0"+
		"\u0001\u0000\u0000\u0000\u04b0\u04e6\u0001\u0000\u0000\u0000\u04b1\u04b3"+
		"\u0003z=\u0000\u04b2\u04b4\u0003*\u0015\u0000\u04b3\u04b2\u0001\u0000"+
		"\u0000\u0000\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4\u04b5\u0001\u0000"+
		"\u0000\u0000\u04b5\u04b6\u0003\u0080@\u0000\u04b6\u04b7\u0005`\u0000\u0000"+
		"\u04b7\u04bc\u0005\u0010\u0000\u0000\u04b8\u04ba\u0003*\u0015\u0000\u04b9"+
		"\u04b8\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001\u0000\u0000\u0000\u04ba"+
		"\u04bb\u0001\u0000\u0000\u0000\u04bb\u04bd\u0003h4\u0000\u04bc\u04b9\u0001"+
		"\u0000\u0000\u0000\u04bc\u04bd\u0001\u0000\u0000\u0000\u04bd\u04e6\u0001"+
		"\u0000\u0000\u0000\u04be\u04c0\u0003z=\u0000\u04bf\u04c1\u0003*\u0015"+
		"\u0000\u04c0\u04bf\u0001\u0000\u0000\u0000\u04c0\u04c1\u0001\u0000\u0000"+
		"\u0000\u04c1\u04c2\u0001\u0000\u0000\u0000\u04c2\u04c3\u0003\u0080@\u0000"+
		"\u04c3\u04c4\u0005a\u0000\u0000\u04c4\u04c9\u0005\u0010\u0000\u0000\u04c5"+
		"\u04c7\u0003*\u0015\u0000\u04c6\u04c5\u0001\u0000\u0000\u0000\u04c6\u04c7"+
		"\u0001\u0000\u0000\u0000\u04c7\u04c8\u0001\u0000\u0000\u0000\u04c8\u04ca"+
		"\u0003h4\u0000\u04c9\u04c6\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000"+
		"\u0000\u0000\u04ca\u04e6\u0001\u0000\u0000\u0000\u04cb\u04cd\u0003z=\u0000"+
		"\u04cc\u04ce\u0003*\u0015\u0000\u04cd\u04cc\u0001\u0000\u0000\u0000\u04cd"+
		"\u04ce\u0001\u0000\u0000\u0000\u04ce\u04cf\u0001\u0000\u0000\u0000\u04cf"+
		"\u04d0\u0003\u0080@\u0000\u04d0\u04d1\u0003p8\u0000\u04d1\u04d6\u0005"+
		"\u0010\u0000\u0000\u04d2\u04d4\u0003*\u0015\u0000\u04d3\u04d2\u0001\u0000"+
		"\u0000\u0000\u04d3\u04d4\u0001\u0000\u0000\u0000\u04d4\u04d5\u0001\u0000"+
		"\u0000\u0000\u04d5\u04d7\u0003h4\u0000\u04d6\u04d3\u0001\u0000\u0000\u0000"+
		"\u04d6\u04d7\u0001\u0000\u0000\u0000\u04d7\u04e6\u0001\u0000\u0000\u0000"+
		"\u04d8\u04da\u0003z=\u0000\u04d9\u04db\u0003*\u0015\u0000\u04da\u04d9"+
		"\u0001\u0000\u0000\u0000\u04da\u04db\u0001\u0000\u0000\u0000\u04db\u04dc"+
		"\u0001\u0000\u0000\u0000\u04dc\u04dd\u0003\u0080@\u0000\u04dd\u04de\u0003"+
		"r9\u0000\u04de\u04e3\u0005\u0010\u0000\u0000\u04df\u04e1\u0003*\u0015"+
		"\u0000\u04e0\u04df\u0001\u0000\u0000\u0000\u04e0\u04e1\u0001\u0000\u0000"+
		"\u0000\u04e1\u04e2\u0001\u0000\u0000\u0000\u04e2\u04e4\u0003h4\u0000\u04e3"+
		"\u04e0\u0001\u0000\u0000\u0000\u04e3\u04e4\u0001\u0000\u0000\u0000\u04e4"+
		"\u04e6\u0001\u0000\u0000\u0000\u04e5\u0481\u0001\u0000\u0000\u0000\u04e5"+
		"\u048c\u0001\u0000\u0000\u0000\u04e5\u0497\u0001\u0000\u0000\u0000\u04e5"+
		"\u049f\u0001\u0000\u0000\u0000\u04e5\u04a4\u0001\u0000\u0000\u0000\u04e5"+
		"\u04b1\u0001\u0000\u0000\u0000\u04e5\u04be\u0001\u0000\u0000\u0000\u04e5"+
		"\u04cb\u0001\u0000\u0000\u0000\u04e5\u04d8\u0001\u0000\u0000\u0000\u04e6"+
		"}\u0001\u0000\u0000\u0000\u04e7\u04ec\u0005X\u0000\u0000\u04e8\u04ec\u0005"+
		"\u0086\u0000\u0000\u04e9\u04ec\u0005Y\u0000\u0000\u04ea\u04ec\u0005\u0087"+
		"\u0000\u0000\u04eb\u04e7\u0001\u0000\u0000\u0000\u04eb\u04e8\u0001\u0000"+
		"\u0000\u0000\u04eb\u04e9\u0001\u0000\u0000\u0000\u04eb\u04ea\u0001\u0000"+
		"\u0000\u0000\u04ec\u007f\u0001\u0000\u0000\u0000\u04ed\u04f7\u0003\u00a8"+
		"T\u0000\u04ee\u04ef\u0005C\u0000\u0000\u04ef\u04f0\u0005\u007f\u0000\u0000"+
		"\u04f0\u04f1\u0003\u0080@\u0000\u04f1\u04f2\u0005\u0080\u0000\u0000\u04f2"+
		"\u04f7\u0001\u0000\u0000\u0000\u04f3\u04f4\u0003<\u001e\u0000\u04f4\u04f5"+
		"\u0003\u0080@\u0000\u04f5\u04f7\u0001\u0000\u0000\u0000\u04f6\u04ed\u0001"+
		"\u0000\u0000\u0000\u04f6\u04ee\u0001\u0000\u0000\u0000\u04f6\u04f3\u0001"+
		"\u0000\u0000\u0000\u04f7\u0081\u0001\u0000\u0000\u0000\u04f8\u04fd\u0003"+
		"\u0080@\u0000\u04f9\u04fa\u0007\u0004\u0000\u0000\u04fa\u04fc\u0003\u0080"+
		"@\u0000\u04fb\u04f9\u0001\u0000\u0000\u0000\u04fc\u04ff\u0001\u0000\u0000"+
		"\u0000\u04fd\u04fb\u0001\u0000\u0000\u0000\u04fd\u04fe\u0001\u0000\u0000"+
		"\u0000\u04fe\u0083\u0001\u0000\u0000\u0000\u04ff\u04fd\u0001\u0000\u0000"+
		"\u0000\u0500\u0502\u0003*\u0015\u0000\u0501\u0500\u0001\u0000\u0000\u0000"+
		"\u0501\u0502\u0001\u0000\u0000\u0000\u0502\u0503\u0001\u0000\u0000\u0000"+
		"\u0503\u050b\u0003\u0080@\u0000\u0504\u0506\u0007\u0004\u0000\u0000\u0505"+
		"\u0507\u0003*\u0015\u0000\u0506\u0505\u0001\u0000\u0000\u0000\u0506\u0507"+
		"\u0001\u0000\u0000\u0000\u0507\u0508\u0001\u0000\u0000\u0000\u0508\u050a"+
		"\u0003\u0080@\u0000\u0509\u0504\u0001\u0000\u0000\u0000\u050a\u050d\u0001"+
		"\u0000\u0000\u0000\u050b\u0509\u0001\u0000\u0000\u0000\u050b\u050c\u0001"+
		"\u0000\u0000\u0000\u050c\u0085\u0001\u0000\u0000\u0000\u050d\u050b\u0001"+
		"\u0000\u0000\u0000\u050e\u0513\u0003\u0080@\u0000\u050f\u0510\u0005|\u0000"+
		"\u0000\u0510\u0512\u0003\u0080@\u0000\u0511\u050f\u0001\u0000\u0000\u0000"+
		"\u0512\u0515\u0001\u0000\u0000\u0000\u0513\u0511\u0001\u0000\u0000\u0000"+
		"\u0513\u0514\u0001\u0000\u0000\u0000\u0514\u0087\u0001\u0000\u0000\u0000"+
		"\u0515\u0513\u0001\u0000\u0000\u0000\u0516\u0518\u0003*\u0015\u0000\u0517"+
		"\u0516\u0001\u0000\u0000\u0000\u0517\u0518\u0001\u0000\u0000\u0000\u0518"+
		"\u0519\u0001\u0000\u0000\u0000\u0519\u0521\u0003\u0080@\u0000\u051a\u051c"+
		"\u0005|\u0000\u0000\u051b\u051d\u0003*\u0015\u0000\u051c\u051b\u0001\u0000"+
		"\u0000\u0000\u051c\u051d\u0001\u0000\u0000\u0000\u051d\u051e\u0001\u0000"+
		"\u0000\u0000\u051e\u0520\u0003\u0080@\u0000\u051f\u051a\u0001\u0000\u0000"+
		"\u0000\u0520\u0523\u0001\u0000\u0000\u0000\u0521\u051f\u0001\u0000\u0000"+
		"\u0000\u0521\u0522\u0001\u0000\u0000\u0000\u0522\u0089\u0001\u0000\u0000"+
		"\u0000\u0523\u0521\u0001\u0000\u0000\u0000\u0524\u0529\u0003\u008cF\u0000"+
		"\u0525\u0526\u0005|\u0000\u0000\u0526\u0528\u0003\u008cF\u0000\u0527\u0525"+
		"\u0001\u0000\u0000\u0000\u0528\u052b\u0001\u0000\u0000\u0000\u0529\u0527"+
		"\u0001\u0000\u0000\u0000\u0529\u052a\u0001\u0000\u0000\u0000\u052a\u008b"+
		"\u0001\u0000\u0000\u0000\u052b\u0529\u0001\u0000\u0000\u0000\u052c\u052d"+
		"\u0007\u0005\u0000\u0000\u052d\u008d\u0001\u0000\u0000\u0000\u052e\u0533"+
		"\u0003\u0090H\u0000\u052f\u0530\u0005|\u0000\u0000\u0530\u0532\u0003\u0090"+
		"H\u0000\u0531\u052f\u0001\u0000\u0000\u0000\u0532\u0535\u0001\u0000\u0000"+
		"\u0000\u0533\u0531\u0001\u0000\u0000\u0000\u0533\u0534\u0001\u0000\u0000"+
		"\u0000\u0534\u008f\u0001\u0000\u0000\u0000\u0535\u0533\u0001\u0000\u0000"+
		"\u0000\u0536\u0537\u0005l\u0000\u0000\u0537\u0091\u0001\u0000\u0000\u0000"+
		"\u0538\u0539\u0003\u0094J\u0000\u0539\u0093\u0001\u0000\u0000\u0000\u053a"+
		"\u053f\u0003\u0096K\u0000\u053b\u053c\u0005Y\u0000\u0000\u053c\u053e\u0003"+
		"\u0096K\u0000\u053d\u053b\u0001\u0000\u0000\u0000\u053e\u0541\u0001\u0000"+
		"\u0000\u0000\u053f\u053d\u0001\u0000\u0000\u0000\u053f\u0540\u0001\u0000"+
		"\u0000\u0000\u0540\u0095\u0001\u0000\u0000\u0000\u0541\u053f\u0001\u0000"+
		"\u0000\u0000\u0542\u0547\u0003\u0098L\u0000\u0543\u0544\u0005X\u0000\u0000"+
		"\u0544\u0546\u0003\u0098L\u0000\u0545\u0543\u0001\u0000\u0000\u0000\u0546"+
		"\u0549\u0001\u0000\u0000\u0000\u0547\u0545\u0001\u0000\u0000\u0000\u0547"+
		"\u0548\u0001\u0000\u0000\u0000\u0548\u0097\u0001\u0000\u0000\u0000\u0549"+
		"\u0547\u0001\u0000\u0000\u0000\u054a\u055f\u0003\u00a8T\u0000\u054b\u054c"+
		"\u0005\u007f\u0000\u0000\u054c\u054d\u0003\u0092I\u0000\u054d\u054e\u0005"+
		"\u0080\u0000\u0000\u054e\u055f\u0001\u0000\u0000\u0000\u054f\u0550\u0003"+
		"t:\u0000\u0550\u0552\u0005\u007f\u0000\u0000\u0551\u0553\u0003\u00a4R"+
		"\u0000\u0552\u0551\u0001\u0000\u0000\u0000\u0552\u0553\u0001\u0000\u0000"+
		"\u0000\u0553\u0554\u0001\u0000\u0000\u0000\u0554\u0555\u0005\u0080\u0000"+
		"\u0000\u0555\u055f\u0001\u0000\u0000\u0000\u0556\u0557\u0005W\u0000\u0000"+
		"\u0557\u055f\u0003\u0098L\u0000\u0558\u0559\u0005s\u0000\u0000\u0559\u055a"+
		"\u0003\u00a8T\u0000\u055a\u055b\u0005\u0081\u0000\u0000\u055b\u055c\u0003"+
		"\u009aM\u0000\u055c\u055d\u0005\u0082\u0000\u0000\u055d\u055f\u0001\u0000"+
		"\u0000\u0000\u055e\u054a\u0001\u0000\u0000\u0000\u055e\u054b\u0001\u0000"+
		"\u0000\u0000\u055e\u054f\u0001\u0000\u0000\u0000\u055e\u0556\u0001\u0000"+
		"\u0000\u0000\u055e\u0558\u0001\u0000\u0000\u0000\u055f\u0099\u0001\u0000"+
		"\u0000\u0000\u0560\u0565\u0003\u009cN\u0000\u0561\u0562\u0005|\u0000\u0000"+
		"\u0562\u0564\u0003\u009cN\u0000\u0563\u0561\u0001\u0000\u0000\u0000\u0564"+
		"\u0567\u0001\u0000\u0000\u0000\u0565\u0563\u0001\u0000\u0000\u0000\u0565"+
		"\u0566\u0001\u0000\u0000\u0000\u0566\u009b\u0001\u0000\u0000\u0000\u0567"+
		"\u0565\u0001\u0000\u0000\u0000\u0568\u0569\u0005\u0013\u0000\u0000\u0569"+
		"\u0590\u0003\u00b8\\\u0000\u056a\u0570\u0003p8\u0000\u056b\u0570\u0005"+
		"\u0014\u0000\u0000\u056c\u0570\u0003\u00ba]\u0000\u056d\u0570\u0005\u0019"+
		"\u0000\u0000\u056e\u0570\u0005\u001b\u0000\u0000\u056f\u056a\u0001\u0000"+
		"\u0000\u0000\u056f\u056b\u0001\u0000\u0000\u0000\u056f\u056c\u0001\u0000"+
		"\u0000\u0000\u056f\u056d\u0001\u0000\u0000\u0000\u056f\u056e\u0001\u0000"+
		"\u0000\u0000\u0570\u0571\u0001\u0000\u0000\u0000\u0571\u0590\u0003\u00b8"+
		"\\\u0000\u0572\u0578\u0003r9\u0000\u0573\u0578\u0005\u0015\u0000\u0000"+
		"\u0574\u0578\u0003\u00bc^\u0000\u0575\u0578\u0005\u001a\u0000\u0000\u0576"+
		"\u0578\u0005\u001c\u0000\u0000\u0577\u0572\u0001\u0000\u0000\u0000\u0577"+
		"\u0573\u0001\u0000\u0000\u0000\u0577\u0574\u0001\u0000\u0000\u0000\u0577"+
		"\u0575\u0001\u0000\u0000\u0000\u0577\u0576\u0001\u0000\u0000\u0000\u0578"+
		"\u0579\u0001\u0000\u0000\u0000\u0579\u0590\u0003\u00b8\\\u0000\u057a\u057f"+
		"\u0003\u009eO\u0000\u057b\u057f\u0005\u0016\u0000\u0000\u057c\u057f\u0003"+
		"\u00be_\u0000\u057d\u057f\u0005\u001d\u0000\u0000\u057e\u057a\u0001\u0000"+
		"\u0000\u0000\u057e\u057b\u0001\u0000\u0000\u0000\u057e\u057c\u0001\u0000"+
		"\u0000\u0000\u057e\u057d\u0001\u0000\u0000\u0000\u057f\u0580\u0001\u0000"+
		"\u0000\u0000\u0580\u0590\u0003\u00b8\\\u0000\u0581\u0586\u0003\u00a0P"+
		"\u0000\u0582\u0586\u0005\u0017\u0000\u0000\u0583\u0586\u0003\u00c0`\u0000"+
		"\u0584\u0586\u0005\u001e\u0000\u0000\u0585\u0581\u0001\u0000\u0000\u0000"+
		"\u0585\u0582\u0001\u0000\u0000\u0000\u0585\u0583\u0001\u0000\u0000\u0000"+
		"\u0585\u0584\u0001\u0000\u0000\u0000\u0586\u0587\u0001\u0000\u0000\u0000"+
		"\u0587\u0590\u0003\u00b8\\\u0000\u0588\u058d\u0003\u00a2Q\u0000\u0589"+
		"\u058d\u0005\u0018\u0000\u0000\u058a\u058d\u0003\u00c2a\u0000\u058b\u058d"+
		"\u0005\u001f\u0000\u0000\u058c\u0588\u0001\u0000\u0000\u0000\u058c\u0589"+
		"\u0001\u0000\u0000\u0000\u058c\u058a\u0001\u0000\u0000\u0000\u058c\u058b"+
		"\u0001\u0000\u0000\u0000\u058d\u058e\u0001\u0000\u0000\u0000\u058e\u0590"+
		"\u0003\u00b8\\\u0000\u058f\u0568\u0001\u0000\u0000\u0000\u058f\u056f\u0001"+
		"\u0000\u0000\u0000\u058f\u0577\u0001\u0000\u0000\u0000\u058f\u057e\u0001"+
		"\u0000\u0000\u0000\u058f\u0585\u0001\u0000\u0000\u0000\u058f\u058c\u0001"+
		"\u0000\u0000\u0000\u0590\u009d\u0001\u0000\u0000\u0000\u0591\u0592\u0005"+
		"t\u0000\u0000\u0592\u0593\u0005u\u0000\u0000\u0593\u009f\u0001\u0000\u0000"+
		"\u0000\u0594\u0595\u0005v\u0000\u0000\u0595\u0596\u0005u\u0000\u0000\u0596"+
		"\u00a1\u0001\u0000\u0000\u0000\u0597\u0598\u0005w\u0000\u0000\u0598\u0599"+
		"\u00051\u0000\u0000\u0599\u00a3\u0001\u0000\u0000\u0000\u059a\u059f\u0003"+
		"\u00b8\\\u0000\u059b\u059c\u0005|\u0000\u0000\u059c\u059e\u0003\u00b8"+
		"\\\u0000\u059d\u059b\u0001\u0000\u0000\u0000\u059e\u05a1\u0001\u0000\u0000"+
		"\u0000\u059f\u059d\u0001\u0000\u0000\u0000\u059f\u05a0\u0001\u0000\u0000"+
		"\u0000\u05a0\u00a5\u0001\u0000\u0000\u0000\u05a1\u059f\u0001\u0000\u0000"+
		"\u0000\u05a2\u05a7\u0003\u00a8T\u0000\u05a3\u05a4\u0005|\u0000\u0000\u05a4"+
		"\u05a6\u0003\u00a8T\u0000\u05a5\u05a3\u0001\u0000\u0000\u0000\u05a6\u05a9"+
		"\u0001\u0000\u0000\u0000\u05a7\u05a5\u0001\u0000\u0000\u0000\u05a7\u05a8"+
		"\u0001\u0000\u0000\u0000\u05a8\u00a7\u0001\u0000\u0000\u0000\u05a9\u05a7"+
		"\u0001\u0000\u0000\u0000\u05aa\u05b0\u0005\b\u0000\u0000\u05ab\u05b0\u0005"+
		"\t\u0000\u0000\u05ac\u05b0\u0003\u00b6[\u0000\u05ad\u05b0\u0005z\u0000"+
		"\u0000\u05ae\u05b0\u0005\u0006\u0000\u0000\u05af\u05aa\u0001\u0000\u0000"+
		"\u0000\u05af\u05ab\u0001\u0000\u0000\u0000\u05af\u05ac\u0001\u0000\u0000"+
		"\u0000\u05af\u05ad\u0001\u0000\u0000\u0000\u05af\u05ae\u0001\u0000\u0000"+
		"\u0000\u05b0\u00a9\u0001\u0000\u0000\u0000\u05b1\u05b7\u0005\b\u0000\u0000"+
		"\u05b2\u05b7\u0005\t\u0000\u0000\u05b3\u05b7\u0003\u00b6[\u0000\u05b4"+
		"\u05b7\u0005z\u0000\u0000\u05b5\u05b7\u0005\u0006\u0000\u0000\u05b6\u05b1"+
		"\u0001\u0000\u0000\u0000\u05b6\u05b2\u0001\u0000\u0000\u0000\u05b6\u05b3"+
		"\u0001\u0000\u0000\u0000\u05b6\u05b4\u0001\u0000\u0000\u0000\u05b6\u05b5"+
		"\u0001\u0000\u0000\u0000\u05b7\u00ab\u0001\u0000\u0000\u0000\u05b8\u05be"+
		"\u0005\b\u0000\u0000\u05b9\u05be\u0005\t\u0000\u0000\u05ba\u05be\u0003"+
		"\u00b6[\u0000\u05bb\u05be\u0005z\u0000\u0000\u05bc\u05be\u0005\u0006\u0000"+
		"\u0000\u05bd\u05b8\u0001\u0000\u0000\u0000\u05bd\u05b9\u0001\u0000\u0000"+
		"\u0000\u05bd\u05ba\u0001\u0000\u0000\u0000\u05bd\u05bb\u0001\u0000\u0000"+
		"\u0000\u05bd\u05bc\u0001\u0000\u0000\u0000\u05be\u00ad\u0001\u0000\u0000"+
		"\u0000\u05bf\u05c5\u0005\b\u0000\u0000\u05c0\u05c5\u0005\t\u0000\u0000"+
		"\u05c1\u05c5\u0003\u00b6[\u0000\u05c2\u05c5\u0005z\u0000\u0000\u05c3\u05c5"+
		"\u0005\u0006\u0000\u0000\u05c4\u05bf\u0001\u0000\u0000\u0000\u05c4\u05c0"+
		"\u0001\u0000\u0000\u0000\u05c4\u05c1\u0001\u0000\u0000\u0000\u05c4\u05c2"+
		"\u0001\u0000\u0000\u0000\u05c4\u05c3\u0001\u0000\u0000\u0000\u05c5\u00af"+
		"\u0001\u0000\u0000\u0000\u05c6\u05cc\u0005\b\u0000\u0000\u05c7\u05cc\u0005"+
		"\t\u0000\u0000\u05c8\u05cc\u0003\u00b6[\u0000\u05c9\u05cc\u0005z\u0000"+
		"\u0000\u05ca\u05cc\u0005\u0006\u0000\u0000\u05cb\u05c6\u0001\u0000\u0000"+
		"\u0000\u05cb\u05c7\u0001\u0000\u0000\u0000\u05cb\u05c8\u0001\u0000\u0000"+
		"\u0000\u05cb\u05c9\u0001\u0000\u0000\u0000\u05cb\u05ca\u0001\u0000\u0000"+
		"\u0000\u05cc\u00b1\u0001\u0000\u0000\u0000\u05cd\u05d3\u0005\b\u0000\u0000"+
		"\u05ce\u05d3\u0005\t\u0000\u0000\u05cf\u05d3\u0003\u00b6[\u0000\u05d0"+
		"\u05d3\u0005z\u0000\u0000\u05d1\u05d3\u0005\u0006\u0000\u0000\u05d2\u05cd"+
		"\u0001\u0000\u0000\u0000\u05d2\u05ce\u0001\u0000\u0000\u0000\u05d2\u05cf"+
		"\u0001\u0000\u0000\u0000\u05d2\u05d0\u0001\u0000\u0000\u0000\u05d2\u05d1"+
		"\u0001\u0000\u0000\u0000\u05d3\u00b3\u0001\u0000\u0000\u0000\u05d4\u05d5"+
		"\u0005\n\u0000\u0000\u05d5\u00b5\u0001\u0000\u0000\u0000\u05d6\u05d7\u0005"+
		"\n\u0000\u0000\u05d7\u00b7\u0001\u0000\u0000\u0000\u05d8\u05dc\u0007\u0006"+
		"\u0000\u0000\u05d9\u05dd\u0005\r\u0000\u0000\u05da\u05db\u0005\u008c\u0000"+
		"\u0000\u05db\u05dd\u0003\u00a8T\u0000\u05dc\u05d9\u0001\u0000\u0000\u0000"+
		"\u05dc\u05da\u0001\u0000\u0000\u0000\u05dc\u05dd\u0001\u0000\u0000\u0000"+
		"\u05dd\u05e4\u0001\u0000\u0000\u0000\u05de\u05e4\u0005\u0010\u0000\u0000"+
		"\u05df\u05e4\u0005\u0011\u0000\u0000\u05e0\u05e4\u0005\u0012\u0000\u0000"+
		"\u05e1\u05e4\u0005x\u0000\u0000\u05e2\u05e4\u0005y\u0000\u0000\u05e3\u05d8"+
		"\u0001\u0000\u0000\u0000\u05e3\u05de\u0001\u0000\u0000\u0000\u05e3\u05df"+
		"\u0001\u0000\u0000\u0000\u05e3\u05e0\u0001\u0000\u0000\u0000\u05e3\u05e1"+
		"\u0001\u0000\u0000\u0000\u05e3\u05e2\u0001\u0000\u0000\u0000\u05e4\u00b9"+
		"\u0001\u0000\u0000\u0000\u05e5\u05e6\u0005\u0001\u0000\u0000\u05e6\u00bb"+
		"\u0001\u0000\u0000\u0000\u05e7\u05e8\u0005\u0002\u0000\u0000\u05e8\u00bd"+
		"\u0001\u0000\u0000\u0000\u05e9\u05ea\u0005\u0003\u0000\u0000\u05ea\u00bf"+
		"\u0001\u0000\u0000\u0000\u05eb\u05ec\u0005\u0004\u0000\u0000\u05ec\u00c1"+
		"\u0001\u0000\u0000\u0000\u05ed\u05ee\u0005\u0005\u0000\u0000\u05ee\u00c3"+
		"\u0001\u0000\u0000\u0000\u00de\u00cb\u00cd\u00da\u00e0\u00ec\u00f2\u00f8"+
		"\u0106\u010c\u0111\u011c\u0120\u012e\u0132\u0136\u013d\u0141\u0145\u0159"+
		"\u0165\u016d\u0175\u017c\u0186\u0189\u0199\u019e\u01a1\u01a5\u01a9\u01ad"+
		"\u01b2\u01b5\u01b9\u01bd\u01c2\u01c6\u01ca\u01d0\u01db\u01e1\u01e8\u01ed"+
		"\u01f7\u01fc\u0201\u0206\u020d\u0212\u0215\u0219\u021d\u0224\u0229\u022c"+
		"\u0231\u0234\u0243\u0248\u024b\u024f\u0254\u0259\u025c\u0260\u0264\u0269"+
		"\u026d\u027d\u0282\u0285\u0289\u028d\u0292\u0296\u029b\u029e\u02a1\u02a5"+
		"\u02ab\u02b0\u02b5\u02bd\u02c1\u02c6\u02ca\u02ce\u02d2\u02d6\u02da\u02dc"+
		"\u02e3\u02ea\u02f2\u02f9\u02fd\u0304\u030a\u0312\u031a\u0322\u0329\u032d"+
		"\u0337\u0340\u0347\u034f\u0355\u0357\u0361\u0369\u036c\u0372\u0375\u037e"+
		"\u0382\u0388\u038c\u0392\u039e\u03a2\u03a5\u03aa\u03ae\u03b1\u03b6\u03ba"+
		"\u03bd\u03c0\u03c3\u03c8\u03cd\u03d0\u03d5\u03da\u03dd\u03e4\u03eb\u03ee"+
		"\u03f4\u03f7\u03fa\u03fd\u0403\u0406\u0409\u040c\u0412\u0415\u041a\u041e"+
		"\u0421\u0426\u042a\u042d\u0430\u0433\u0439\u043c\u043f\u0442\u0448\u044b"+
		"\u045c\u046a\u0472\u047a\u047f\u0483\u0488\u048e\u0493\u0499\u04a6\u04ac"+
		"\u04af\u04b3\u04b9\u04bc\u04c0\u04c6\u04c9\u04cd\u04d3\u04d6\u04da\u04e0"+
		"\u04e3\u04e5\u04eb\u04f6\u04fd\u0501\u0506\u050b\u0513\u0517\u051c\u0521"+
		"\u0529\u0533\u053f\u0547\u0552\u055e\u0565\u056f\u0577\u057e\u0585\u058c"+
		"\u058f\u059f\u05a7\u05af\u05b6\u05bd\u05c4\u05cb\u05d2\u05dc\u05e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}