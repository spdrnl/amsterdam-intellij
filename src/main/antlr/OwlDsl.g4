grammar OwlDsl;

/*
 * Top-level
 */

ontology
    : (prefixDecl | ontologyPropertyBlock | annotatedAxiom | bareAxiom | annotatedOntologyHeader | ontologyHeader | INTELLIJ_DUMMY)* EOF
    ;

/*
 * Prefix declarations
 */

prefixDecl
    : PREFIX_KW ( PREFIX_NAME | COLON ) namespaceIRI DOT
    ;

/*
 * Annotations (can prefix any axiom or declaration)
 */

annotatedAxiom
    : annotationBlock+ bareAxiom
    ;

bareAxiom
    : axiom (DOT)?
    ;

annotationBlock
    : ANNOTATION LPAREN annotationList RPAREN
    ;

annotationList
    : annotation (COMMA annotation)*
    ;

annotation
    : entityUsage ( literal | entityUsage )
    ;

/*
 * Ontology header + ontology-level properties (@property)
 */

ontologyHeader
    : ONTOLOGY_KW fullIRI ( VERSION_IRI_KW fullIRI )? DOT
    ;

ontologyPropertyBlock
    : PROPERTY LPAREN ontologyPropertyList RPAREN
    ;

ontologyPropertyList
    : ontologyProperty (COMMA ontologyProperty)*
    ;

ontologyProperty
    : entityUsage ( literal | entityUsage )
    ;

// Allow ontology annotations to precede the ontology header using the same
// @annotation(...) mechanism that prefixes axioms/declarations.
annotatedOntologyHeader
    : annotationBlock+ ontologyHeader
    ;

/*
 * Axioms (unannotated core)
 */

axiom
    : classAxiom
    | objectPropertyAxiom
    | dataPropertyAxiom
    | annotationPropertyAxiom
    | datatypeAxiom
    | subPropertyChainAxiom
    | individualAxiom
    ;

/*
 * Class axioms
 */

classAxiom
    : CLASS_KW commentOpt? classId                                      # ClassDeclAxiom
    | classSubOrEqAxiom                                                # ClassSubOrEqAxiomAlt
    | allDisjointClassesPhrase LPAREN classExprList RPAREN             # AllDisjointClassesAxiom
    ;

classSubOrEqAxiom
    : CLASS_KW commentOpt? classId? (SEMICOLON)? classClause ( SEMICOLON classClause )* (SEMICOLON)?
    ;

classClause
    : subClassOfPhrase commentOpt? classExpr                         # ClassSubClause
    | equivalentToPhrase commentOpt? classExpr                       # ClassEquivalentClause
    | disjointWithPhrase commentOpt? classExpr                       # ClassDisjointClause
    | disjointUnionOfPhrase LPAREN classExprList RPAREN              # ClassDisjointUnionClause
    | hasKeyPhrase LPAREN propExprWithCommentList RPAREN             # ClassHasKeyClause
    ;

subClassOfPhrase
    : SUBSET_EQ
    | LE_SEQ
    | isA
    | (IS_KW)? SUBCLASS_KW OF_KW
    ;

equivalentToPhrase
    : isEquivalent TO_KW
    ;

disjointWithPhrase
    : isDisjoint WITH_KW
    ;

disjointUnionOfPhrase
    : isDisjoint UNION_KW OF_KW
    ;

allDisjointClassesPhrase
    : ALL_KW DISJOINT_KW CLASSES_KW
    ;

hasKeyPhrase
    : has KEY_KW
    ;

isA : IS_KW ( A_KW | AN_KW ) ;
isEquivalent : (IS_KW)? EQUIVALENT_KW ;
isDisjoint : (IS_KW)? DISJOINT_KW ;
has : (HAS_KW)? ;

// Optional inline literal comment to aid readability (no semantic effect)
commentOpt
    : literal
    ;

/*
 * Object property axioms
 */

objectPropertyAxiom
    : ( OBJECT_KW PROPERTY_KW ) commentOpt? propId                         # ObjectPropertyDecl
    | objectPropertyDomainRangeAxiom                                    # ObjectPropertyDomainRangeAlt
    | objectSubPropertyAxiom                                            # ObjectSubPropertyAlt
    | objectInversePropertyAxiom                                        # ObjectInversePropertyAlt
    ;

objectSubPropertyAxiom
    : ( OBJECT_KW PROPERTY_KW ) commentOpt? propId (SEMICOLON)? subPropertyOfPhrase commentOpt? propExpr (SEMICOLON)?
    ;

objectPropertyDomainRangeAxiom
    : ( OBJECT_KW PROPERTY_KW ) commentOpt? propId (SEMICOLON)? objectPropertyClause ((SEMICOLON )? objectPropertyClause)* (SEMICOLON)?
    ;

objectPropertyClause
    : domainPhrase commentOpt? classExpr                                        # ObjectPropDomainClause
    | rangePhrase  commentOpt? classExpr                                        # ObjectPropRangeClause
    | characteristicsPhrase LPAREN characteristicList RPAREN                    # ObjectPropCharacteristicsClause
    | subPropertyOfPhrase commentOpt? propExpr                                  # ObjectPropSubPropertyOfClause
    | equivalentToPhrase commentOpt? propExprList                               # ObjectPropEquivalentClause
    | disjointWithPhrase commentOpt? propExprList                               # ObjectPropDisjointClause
    | inverseOfPhrase commentOpt? propExpr                                      # ObjectPropInverseClause
    | INVERSE_KW LPAREN commentOpt? propExpr RPAREN                             # ObjectPropInverseFunction
    ;

subPropertyOfPhrase
    : SUBSET_EQ
    | LE_SEQ
    | (IS_KW)? SUBPROPERTY_KW OF_KW
    ;

domainPhrase
    : has DOMAIN_KW
    ;

rangePhrase
    : has RANGE_KW
    ;

characteristicsPhrase
    : has CHARACTERISTICS_KW
    ;

inverseOfPhrase
    : (IS_KW)? INVERSE_KW OF_KW
    ;

// Standalone inverse axiom for object properties
objectInversePropertyAxiom
    : ( OBJECT_KW PROPERTY_KW ) commentOpt? propId (SEMICOLON)? ( inverseOfPhrase commentOpt? propExpr | INVERSE_KW LPAREN commentOpt? propExpr RPAREN ) (SEMICOLON)?
    ;

/*
 * Data property axioms
 */

dataPropertyAxiom
    : ( DATA_KW PROPERTY_KW ) commentOpt? propId                        # DataPropertyDecl
    | dataPropertyDomainRangeAxiom                                      # DataPropertyDomainRangeAlt
    | dataSubPropertyAxiom                                              # DataSubPropertyAlt
    ;

dataSubPropertyAxiom
    : ( DATA_KW PROPERTY_KW ) commentOpt? propId (SEMICOLON)? subPropertyOfPhrase propExpr (SEMICOLON)?
    ;

dataPropertyDomainRangeAxiom
    : ( DATA_KW PROPERTY_KW ) commentOpt? propId (SEMICOLON)? dataPropertyClause ((SEMICOLON )? dataPropertyClause)* (SEMICOLON)?
    ;

dataPropertyClause
    : domainPhrase classExpr                                                   # DataPropDomainClause
    | rangePhrase  dataRangeExpr                                               # DataPropRangeClause
    | characteristicsPhrase LPAREN dataCharacteristicList RPAREN               # DataPropCharacteristicsClause
    | subPropertyOfPhrase propExpr                                             # DataPropSubPropertyOfClause
    | equivalentToPhrase propExprList                                          # DataPropEquivalentClause
    | disjointWithPhrase propExprList                                          # DataPropDisjointClause
    ;

/*
 * Annotation property axioms
 */

annotationPropertyAxiom
    : ( ANNOTATION_KW PROPERTY_KW ) commentOpt? propId (SEMICOLON)? annotationPropertyClause ((SEMICOLON )? annotationPropertyClause)* (SEMICOLON)?  # AnnotationPropertyWithClauses
    | ( ANNOTATION_KW PROPERTY_KW ) commentOpt? propId                                                                             # AnnotationPropertyDecl
    ;

annotationPropertyClause
    : subPropertyOfPhrase commentOpt? propExpr                                      # AnnotationPropSubPropertyOfClause
    ;

/*
 * Datatype axioms
 */

datatypeAxiom
    : DATATYPE_KW commentOpt? datatypeId                              // declaration
    | DATATYPE_DEFINITION_KW commentOpt? datatypeId dataRangeExpr
    ;

/*
 * Subproperty chain axioms
 */

subPropertyChainAxiom
    : subPropertyChainPhrase LPAREN chain=propExprChainWithComments RPAREN subPropertyOfPhrase commentOpt? superProp=propExpr (SEMICOLON)?
    ;

subPropertyChainPhrase
    : SUBPROPERTY_KW CHAIN_KW
    ;

/*
 * Individual (ABox) axioms
 */

individualAxiom
    : INDIVIDUAL_KW commentOpt? individualId (SEMICOLON)? individualAxiomBody (SEMICOLON)?   # IndividualWithBody
    | INDIVIDUAL_KW commentOpt? individualId (SEMICOLON)?                               # IndividualBareDecl
    ;

// Allow minimal composite body for individuals:
//  - A type body optionally followed by ';' and then a property assertions list
//  - Or any of the original single-body alternatives
individualAxiomBody
    : typeBody (SEMICOLON propAssertionList)* (SEMICOLON sameOrDifferentBody)*
    | propAssertionList (SEMICOLON propAssertionList)* (SEMICOLON sameOrDifferentBody)*
    | sameOrDifferentBody
    ;

// Factor out the three type assertion sugar forms
typeBody
    : TYPE_KW classExprList                               # TypeAssertionBody
    | isAPhrase classExprList                             # TypeAssertionBodySugar
    ;

isAPhrase
    : isA
    ;

// Group same/different variants for reuse at the end of an individual block
sameOrDifferentBody
    : sameAsPhrase individualList                         # SameAsBody
    | differentFromPhrase individualList                  # DifferentFromBody
    ;

sameAsPhrase
    : (IS_KW)? SAME_KW AS_KW
    ;

differentFromPhrase
    : (IS_KW)? DIFFERENT_KW FROM_KW
    ;

propAssertionList
    : propAssertion (COMMA propAssertion)*
    ;

propAssertion
    : commentOpt? propExpr entityUsage                              # ObjectPropertyAssertion
    | propExpr literal                                   # DataPropertyAssertion
    | ( NOT_KW | NOT_SYM ) commentOpt? propExpr entityUsage               # NegativeObjectPropertyAssertion
    | ( NOT_KW | NOT_SYM ) propExpr literal                    # NegativeDataPropertyAssertion
    ;

/*
 * Class expressions (OWL 2 complete at expression level)
 */

classExprList
    : classExpr (COMMA classExpr)*
    ;

// For n-ary boolean constructors: allow either comma-separated or 'and'-separated lists
classExprNaryList
    : classExpr ( (COMMA classExpr)+ | (AND_KW classExpr)+ )?
    ;

classExpr
    : boolClassExpr
    ;

boolClassExpr
    : primaryClassExpr (binaryBoolOp primaryClassExpr)*  // left-associative and/or
    ;

primaryClassExpr
    : atomicClassExpr
    | LPAREN classExpr RPAREN
    ;

atomicClassExpr
    // Named class with one or more trailing property-first restrictions introduced by 'that'
    // Example: :Painting that :hasPart some :Frame
    // This is syntactic sugar for an intersection between the named class and each restriction.
    : commentOpt? entityUsage thatRestriction+               # NamedClassWithThatExpr
    | commentOpt? entityUsage                                # NamedClassExpr
    | THING_KW                                            # TopClassExpr
    | NOTHING_KW                                          # BottomClassExpr
    | ( NOT_KW | NOT_SYM ) primaryClassExpr                   # ComplementClassExpr
    | ( SOME_KW | SOME_SYM ) commentOpt? propExpr commentOpt? classExpr                 # SomeValuesFromExpr
    | ( ONLY_KW | ONLY_SYM ) commentOpt? propExpr commentOpt? classExpr                 # AllValuesFromExpr
    | has VALUE_KW commentOpt? propExpr entityUsage                   # ObjectHasValueExpr
    | has VALUE_KW propExpr literal                        # DataHasValueExpr
    | MIN_KW INTEGER commentOpt? propExpr ( commentOpt? classExpr )?  # MinCardinalityExpr
    | MAX_KW INTEGER commentOpt? propExpr ( commentOpt? classExpr )?  # MaxCardinalityExpr
    | EXACTLY_KW INTEGER commentOpt? propExpr ( commentOpt? classExpr )?              # ExactCardinalityExpr
    // Manchester-style, property-first variants (sugar):
    | (THAT_KW)? commentOpt? propExpr ( SOME_KW | SOME_SYM ) commentOpt? classExpr                 # SomeValuesFromExpr_M
    | (THAT_KW)? commentOpt? propExpr ( ONLY_KW | ONLY_SYM ) commentOpt? classExpr                 # AllValuesFromExpr_M
    | (THAT_KW)? commentOpt? propExpr has VALUE_KW entityUsage                               # ObjectHasValueExpr_M
    | (THAT_KW)? propExpr has VALUE_KW literal                                                # DataHasValueExpr_M
    | (THAT_KW)? commentOpt? propExpr MIN_KW INTEGER ( commentOpt? classExpr )?              # MinCardinalityExpr_M
    | (THAT_KW)? commentOpt? propExpr MAX_KW INTEGER ( commentOpt? classExpr )?              # MaxCardinalityExpr_M
    | (THAT_KW)? commentOpt? propExpr EXACTLY_KW INTEGER ( commentOpt? classExpr )?          # ExactCardinalityExpr_M
    // Friendly cardinality synonyms
    | atLeastPhrase INTEGER commentOpt? propExpr ( commentOpt? classExpr )?       # MinCardinalityFriendly
    | atMostPhrase  INTEGER commentOpt? propExpr ( commentOpt? classExpr )?       # MaxCardinalityFriendly
    | (THAT_KW)? commentOpt? propExpr atLeastPhrase INTEGER ( commentOpt? classExpr )?       # MinCardinalityFriendly_M
    | (THAT_KW)? commentOpt? propExpr atMostPhrase  INTEGER ( commentOpt? classExpr )?       # MaxCardinalityFriendly_M
    | oneOfPhrase LPAREN individualList RPAREN                     # ObjectOneOfExpr
    // Readable n-ary lists: allow 'and' as a separator inside allOf/anyOf
    | allOfPhrase LPAREN classExprNaryList RPAREN     # IntersectionExpr
    | anyOfPhrase LPAREN classExprNaryList RPAREN     # UnionExpr
    ;

atLeastPhrase
    : AT_KW LEAST_KW
    ;

atMostPhrase
    : AT_KW MOST_KW
    ;

oneOfPhrase
    : (IS_KW)? ONE_KW OF_KW
    ;

allOfPhrase
    : (IS_KW)? ALL_KW OF_KW
    ;

anyOfPhrase
    : (IS_KW)? ANY_KW OF_KW
    ;

// Connector used inside named-class-with-that sugar; allows optional 'and' before 'that'
thatConnector
    : THAT_KW
    | AND_KW THAT_KW
    ;

// Trailing restriction forms allowed after a named class with 'that'.
// Keep this aligned with the Manchester-style property-first variants used elsewhere.
thatRestriction
    : thatConnector commentOpt? propExpr ( SOME_KW | SOME_SYM ) commentOpt? classExpr       # ThatSomeValuesFrom
    | thatConnector commentOpt? propExpr ( ONLY_KW | ONLY_SYM ) commentOpt? classExpr       # ThatAllValuesFrom
    | thatConnector commentOpt? propExpr has VALUE_KW entityUsage                      # ThatObjectHasValue
    | thatConnector propExpr has VALUE_KW literal                                       # ThatDataHasValue
    // Cardinalities (optional filler)
    | thatConnector commentOpt? propExpr MIN_KW INTEGER ( commentOpt? classExpr )?     # ThatMinCardinality
    | thatConnector commentOpt? propExpr MAX_KW INTEGER ( commentOpt? classExpr )?     # ThatMaxCardinality
    | thatConnector commentOpt? propExpr EXACTLY_KW INTEGER ( commentOpt? classExpr )? # ThatExactCardinality
    // Friendly cardinality synonyms
    | thatConnector commentOpt? propExpr atLeastPhrase INTEGER ( commentOpt? classExpr )?  # ThatMinCardinalityFriendly
    | thatConnector commentOpt? propExpr atMostPhrase  INTEGER ( commentOpt? classExpr )?  # ThatMaxCardinalityFriendly
    ;

binaryBoolOp
    : AND_KW   # AndOpASCII
    | INTERSECTION     # AndOpUnicode
    | OR_KW    # OrOpASCII
    | UNION_SYM     # OrOpUnicode
    ;

/*
 * Property expressions
 */

propExpr
    : entityUsage                                        # NamedPropertyExpr
    | INVERSE_KW LPAREN propExpr RPAREN                  # InversePropertyFunction
    | inverseOfPhrase propExpr                           # InversePropertyPhrase
    ;

propExprChain
    : propExpr ( ( COMPOSITION | THEN ) propExpr )*
    ;

// Same as propExprChain but allowing optional inline literal after each propExpr
propExprChainWithComments
    : commentOpt? propExpr ( ( COMPOSITION | THEN ) commentOpt? propExpr )*
    ;

propExprList
    : propExpr (COMMA propExpr)*
    ;

// propExpr list with optional inline literals after each property expression
propExprWithCommentList
    : commentOpt? propExpr (COMMA commentOpt? propExpr )*
    ;

/*
 * Property characteristics
 */

characteristicList
    : characteristic (COMMA characteristic)*
    ;

characteristic
    : FUNCTIONAL_KW
    | INVERSE_KW FUNCTIONAL_KW
    | TRANSITIVE_KW
    | SYMMETRIC_KW
    | A_KW SYMMETRIC_KW
    | REFLEXIVE_KW
    | IR_KW REFLEXIVE_KW
    ;

dataCharacteristicList
    : dataCharacteristic (COMMA dataCharacteristic)*
    ;

dataCharacteristic
    : FUNCTIONAL_KW
    ;

/*
 * Data ranges (OWL 2: union, intersection, complement, oneOf, restrictions)
 */

dataRangeExpr
    : dataRangeOrExpr
    ;

dataRangeOrExpr
    : dataRangeAndExpr ( OR_KW dataRangeAndExpr )*
    ;

dataRangeAndExpr
    : dataRangePrimary ( AND_KW dataRangePrimary )*
    ;

dataRangePrimary
    : entityUsage                                        # NamedDatatype
    | LPAREN dataRangeExpr RPAREN                        # ParenthesizedDataRange
    | oneOfPhrase LPAREN literalList? RPAREN             # DataOneOf
    | NOT_KW dataRangePrimary                            # DataComplementOf
    | RESTRICTION_KW entityUsage LBRACE facetRestrictionList RBRACE # DatatypeRestriction
    ;

facetRestrictionList
    : facetRestriction (COMMA facetRestriction)*
    ;

facetRestriction
    : FACET literal
    // Fluent/operator facet forms for phrase/classic modes and symbols
    | (atLeastPhrase     | GE | ge | GE_SYM | GE_ASC) literal
    | (atMostPhrase      | LE | le | LE_SYM | LE_ASC) literal
    | (greaterThanPhrase | GT | gt | GT_SYM) literal
    | (lessThanPhrase    | LT | lt | LT_SYM) literal
    | (equalToPhrase     | EQ | eq | EQ_SYM) literal
    ;

greaterThanPhrase
    : GREATER_KW THAN_KW
    ;

lessThanPhrase
    : LESS_KW THAN_KW
    ;

equalToPhrase
    : EQUAL_KW TO_KW
    ;

literalList
    : literal (COMMA literal)*
    ;

/*
 * IDs and lists
 */

individualList
    : entityUsage (COMMA entityUsage)*
    ;

entityUsage
    : CURIE
    | CURIE_EMPTY
    | fullIRI
    | INTELLIJ_DUMMY
    ;

entityId
    : CURIE
    | CURIE_EMPTY
    | fullIRI
    | INTELLIJ_DUMMY
    ;

classId
    : CURIE
    | CURIE_EMPTY
    | fullIRI
    | INTELLIJ_DUMMY
    ;

propId
    : CURIE
    | CURIE_EMPTY
    | fullIRI
    | INTELLIJ_DUMMY
    ;

individualId
    : CURIE
    | CURIE_EMPTY
    | fullIRI
    | INTELLIJ_DUMMY
    ;

datatypeId
    : CURIE
    | CURIE_EMPTY
    | fullIRI
    | INTELLIJ_DUMMY
    ;

namespaceIRI
    : IRI
    ;

fullIRI
    : IRI
    ;

/*
 * Literals
 */

literal
    : (STRING | STRING3) ( LANGTAG | DATATYPE_SEP entityUsage )?
    | INTEGER
    | DECIMAL
    | DOUBLE
    | TRUE_KW
    | FALSE_KW
    ;

/*
 * Lexer rules
 */

INTELLIJ_DUMMY
    : 'IntellijIdeaRulezzz'
    ;

PREFIX_NAME
    : [A-Za-z_] [A-Za-z0-9_]* ':'
    ;

/* CURIE-like prefix:LocalName */
CURIE
    : [A-Za-z_] [A-Za-z0-9_]* ':' [A-Za-z_0-9\-]+
    ;

// Allow default-prefix CURIEs like :local
CURIE_EMPTY
    : ':' [A-Za-z_0-9\-]+
    ;

/* Angle-bracket IRI */
IRI
    : '<' ~[<>"{}|^`\\\r\n\t ]+ '>'
    ;

// Keyword token for leading annotation blocks must be recognized before LANGTAG
ANNOTATION
    : '@annotation'
    ;

// Ontology-level property directive
PROPERTY
    : '@property'
    ;

// Language tag (e.g., @en, @en-GB)
LANGTAG
    : '@' [A-Za-z]+ ( '-' [A-Za-z0-9]+ )*
    ;

// Triple-quoted multi-line string, supports embedded quotes/newlines
STRING3
    : '"""' ( '\\' . | . )*? '"""'
    ;

// Single-quoted string (may contain newlines due to prior requirement)
STRING
    : '"' ( '\\' . | ~["\\] )* '"'
    ;

INTEGER
    : [0-9]+
    ;

DECIMAL
    : [0-9]+ '.' [0-9]+
    ;

DOUBLE
    : [0-9]+ '.' [0-9]* [eE] [+\-]? [0-9]+
    ;

// Note: separate LANGTAG token is used with STRING in parser rule 'literal'.

FACET
    : 'minInclusive'
    | 'maxInclusive'
    | 'minExclusive'
    | 'maxExclusive'
    | 'length'
    | 'minLength'
    | 'maxLength'
    | 'pattern'
    ;

// Shorthand operator codes (upper/lowercase) for facets
GE  : 'GE' ;
LE  : 'LE' ;
GT  : 'GT' ;
LT  : 'LT' ;
EQ  : 'EQ' ;
ge  : 'ge' ;
le  : 'le' ;
gt  : 'gt' ;
lt  : 'lt' ;
eq  : 'eq' ;

// Unicode/symbol operators and ASCII two-char variants
GE_SYM  : '≥' ;
LE_SYM  : '≤' ;
GE_ASC  : '>=' ;
LE_ASC  : '<=' ;
GT_SYM  : '>' ;
LT_SYM  : '<' ;
EQ_SYM  : '=' ;

/* Whitespace and comments */

WS
    : ( [ \t\r\n] | '\u00A0' | '\u1680' | '\u2000' | '\u2001' | '\u2002' | '\u2003' | '\u2004' | '\u2005' | '\u2006' | '\u2007' | '\u2008' | '\u2009' | '\u200A' | '\u202F' | '\u205F' | '\u3000' )+ -> channel(HIDDEN)
    ;

LINE_COMMENT
    : ('//' | '#') ~[\r\n]* -> channel(HIDDEN)
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> channel(HIDDEN)
    ;

/* Keywords */
PREFIX_KW: [Pp] 'refix';
ONTOLOGY_KW: [Oo] 'ntology';
VERSION_IRI_KW: 'versionIRI';
CLASS_KW: [Cc] 'lass';
CLASSES_KW: [Cc] 'lasses';
IS_KW: [Ii] 's';
A_KW: [Aa];
AN_KW: [Aa] 'n';
SUBCLASS_KW: [Ss] 'ubclass';
OF_KW: [Oo] 'f';
EQUIVALENT_KW: [Ee] 'quivalent';
TO_KW: [Tt] 'o';
DISJOINT_KW: [Dd] 'isjoint';
WITH_KW: [Ww] 'ith';
UNION_KW: [Uu] 'nion';
HAS_KW: [Hh] 'as';
KEY_KW: [Kk] 'ey';
OBJECT_KW: [Oo] 'bject';
PROPERTY_KW: [Pp] 'roperty';
SUBPROPERTY_KW: [Ss] 'ubproperty';
DOMAIN_KW: [Dd] 'omain';
RANGE_KW: [Rr] 'ange';
CHARACTERISTICS_KW: [Cc] 'haracteristics';
INVERSE_KW: [Ii] 'nverse';
DATA_KW: [Dd] 'ata';
ANNOTATION_KW: [Aa] 'nnotation';
DATATYPE_KW: [Dd] 'atatype';
DATATYPE_DEFINITION_KW: [Dd] 'atatype' [Dd] 'efinition';
CHAIN_KW: [Cc] 'hain';
INDIVIDUAL_KW: [Ii] 'ndividual';
TYPE_KW: [Tt] 'ype';
SAME_KW: [Ss] 'ame';
AS_KW: [Aa] 's';
DIFFERENT_KW: [Dd] 'ifferent';
FROM_KW: [Ff] 'rom';
NOT_KW: [Nn] 'ot';
AND_KW: [Aa] 'nd';
OR_KW: [Oo] 'r';
THING_KW: [Tt] 'hing';
NOTHING_KW: [Nn] 'othing';
SOME_KW: [Ss] 'ome';
ONLY_KW: [Oo] 'nly';
VALUE_KW: [Vv] 'alue';
MIN_KW: [Mm] 'in';
MAX_KW: [Mm] 'ax';
EXACTLY_KW: [Ee] 'xactly';
THAT_KW: [Tt] 'hat';
AT_KW: [Aa] 't';
LEAST_KW: [Ll] 'east';
MOST_KW: [Mm] 'ost';
ONE_KW: [Oo] 'ne';
ALL_KW: [Aa] 'll';
ANY_KW: [Aa] 'ny';
FUNCTIONAL_KW: [Ff] 'unctional';
TRANSITIVE_KW: [Tt] 'ransitive';
SYMMETRIC_KW: [Ss] 'ymmetric';
REFLEXIVE_KW: [Rr] 'eflexive';
IR_KW: [Ii] 'r';
RESTRICTION_KW: [Rr] 'estriction';
GREATER_KW: [Gg] 'reater';
THAN_KW: [Tt] 'han';
LESS_KW: [Ll] 'ess';
EQUAL_KW: [Ee] 'qual';
TRUE_KW: [Tt] 'rue';
FALSE_KW: [Ff] 'alse';

DOT: '.';
COMMA: ',';
COLON: ':';
SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SUBSET_EQ: '⊑';
LE_SEQ: '<=:';
NOT_SYM: '¬';
INTERSECTION: '⊓';
UNION_SYM: '⊔';
SOME_SYM: '∃';
ONLY_SYM: '∀';
COMPOSITION: 'o';
THEN: 'then';
DATATYPE_SEP: '^^';

IDENTIFIER : [A-Za-z_] [A-Za-z0-9_]* ;

