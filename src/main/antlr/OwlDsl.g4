grammar OwlDsl;

/*
 * Top-level
 */

ontology
    : (prefixDecl | ontologyPropertyBlock | annotatedAxiom | bareAxiom | annotatedOntologyHeader | ontologyHeader)* EOF
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
    | EQUIVALENT_CLASSES_KW LPAREN classExprList RPAREN                        # EquivalentClassesAxiom
    | ALL_DISJOINT_CLASSES_KW LPAREN classExprList RPAREN                       # AllDisjointClassesAxiom
    ;

// classDeclarationTail removed (was empty), to avoid optional-empty warning

classSubOrEqAxiom
    : CLASS_KW commentOpt? classId (SEMICOLON)? classClause ( SEMICOLON classClause )* (SEMICOLON)?
    ;

classClause
    : subClassOfPhrase commentOpt? classExpr                         # ClassSubClause
    | equivalentToPhrase classExpr                                   # ClassEquivalentClause
    | disjointWithPhrase classExpr                                   # ClassDisjointClause
    | disjointUnionOfPhrase LPAREN classExprList RPAREN              # ClassDisjointUnionClause
    | hasKeyPhrase LPAREN propExprWithCommentList RPAREN             # ClassHasKeyClause
    ;

subClassOfPhrase
    : SUB_CLASS_OF_KW
    | IS_KW A_KW
    | IS_KW AN_KW
    | IS_KW SUBCLASS_KW OF_KW
    | SUBSET_EQ
    | LE_SEQ
    ;

equivalentToPhrase
    : EQUIVALENT_TO_KW
    | EQUIVALENT_KW TO_KW
    | IS_KW EQUIVALENT_KW TO_KW
    ;

disjointWithPhrase
    : DISJOINT_WITH_KW
    | DISJOINT_KW WITH_KW
    | IS_KW DISJOINT_KW WITH_KW
    ;

disjointUnionOfPhrase
    : DISJOINT_UNION_OF_KW
    | IS_KW DISJOINT_KW UNION_KW OF_KW
    ;

hasKeyPhrase
    : HAS_KW KEY_KW
    ;

// Optional inline literal comment to aid readability (no semantic effect)
commentOpt
    : literal
    ;

/*
 * Object property axioms
 */

objectPropertyAxiom
    : ( OBJECT_PROPERTY_KW | OBJECT_KW PROPERTY_KW ) commentOpt? propId     # ObjectPropertyDecl
    | objectPropertyDomainRangeAxiom                                    # ObjectPropertyDomainRangeAlt
    | objectSubPropertyAxiom                                            # ObjectSubPropertyAlt
    | objectInversePropertyAxiom                                        # ObjectInversePropertyAlt
    | EQUIVALENT_OBJECT_PROPERTIES_KW LPAREN propExprWithCommentList RPAREN      # EquivalentObjectPropertiesAxiom
    | DISJOINT_OBJECT_PROPERTIES_KW LPAREN propExprWithCommentList RPAREN        # DisjointObjectPropertiesAxiom
    ;

// objectPropertyDeclTail removed (was empty), to avoid optional-empty warning

objectSubPropertyAxiom
    : ( OBJECT_PROPERTY_KW | OBJECT_KW PROPERTY_KW ) commentOpt? propId (SEMICOLON)? subPropertyOfPhrase commentOpt? propExpr (SEMICOLON)?
    ;

objectPropertyDomainRangeAxiom
    : ( OBJECT_PROPERTY_KW | OBJECT_KW PROPERTY_KW ) commentOpt? propId (SEMICOLON)? objectPropertyClause ((SEMICOLON )? objectPropertyClause)* (SEMICOLON)?
    ;

objectPropertyClause
    : domainPhrase commentOpt? classExpr                                        # ObjectPropDomainClause
    | rangePhrase  commentOpt? classExpr                                        # ObjectPropRangeClause
    | characteristicsPhrase LPAREN characteristicList RPAREN                    # ObjectPropCharacteristicsClause
    | subPropertyOfPhrase commentOpt? propExpr                                  # ObjectPropSubPropertyOfClause
    | inverseOfPhrase commentOpt? propExpr                                      # ObjectPropInverseClause
    | INVERSE_KW LPAREN commentOpt? propExpr RPAREN                             # ObjectPropInverseFunction
    ;

subPropertyOfPhrase
    : SUB_PROPERTY_OF_KW
    | SUBSET_EQ
    | LE_SEQ
    | IS_KW SUBPROPERTY_KW OF_KW
    | SUBPROPERTY_KW OF_KW
    ;

domainPhrase
    : DOMAIN_KW
    | HAS_KW DOMAIN_KW
    ;

rangePhrase
    : RANGE_KW
    | HAS_KW RANGE_KW
    ;

characteristicsPhrase
    : CHARACTERISTICS_KW
    | HAS_KW CHARACTERISTICS_KW
    ;

inverseOfPhrase
    : INVERSE_KW OF_KW
    | IS_KW INVERSE_KW OF_KW
    ;

// Standalone inverse axiom for object properties
objectInversePropertyAxiom
    : ( OBJECT_PROPERTY_KW | OBJECT_KW PROPERTY_KW ) commentOpt? propId (SEMICOLON)? ( inverseOfPhrase commentOpt? propExpr | INVERSE_KW LPAREN commentOpt? propExpr RPAREN ) (SEMICOLON)?
    ;

/*
 * Data property axioms
 */

dataPropertyAxiom
    : ( DATA_PROPERTY_KW | DATA_KW PROPERTY_KW ) propId                     # DataPropertyDecl
    | dataPropertyDomainRangeAxiom                                      # DataPropertyDomainRangeAlt
    | dataSubPropertyAxiom                                              # DataSubPropertyAlt
    | EQUIVALENT_DATA_PROPERTIES_KW LPAREN propExprList RPAREN                   # EquivalentDataPropertiesAxiom
    | DISJOINT_DATA_PROPERTIES_KW LPAREN propExprList RPAREN                     # DisjointDataPropertiesAxiom
    ;

// dataPropertyDeclTail removed (was empty), to avoid optional-empty warning

dataSubPropertyAxiom
    : ( DATA_PROPERTY_KW | DATA_KW PROPERTY_KW ) propId (SEMICOLON)? subPropertyOfPhrase propExpr (SEMICOLON)?
    ;

dataPropertyDomainRangeAxiom
    : ( DATA_PROPERTY_KW | DATA_KW PROPERTY_KW ) propId (SEMICOLON)? dataPropertyClause ((SEMICOLON )? dataPropertyClause)* (SEMICOLON)?
    ;

dataPropertyClause
    : domainPhrase classExpr                                                   # DataPropDomainClause
    | rangePhrase  dataRangeExpr                                               # DataPropRangeClause
    | characteristicsPhrase LPAREN dataCharacteristicList RPAREN               # DataPropCharacteristicsClause
    | subPropertyOfPhrase propExpr                                             # DataPropSubPropertyOfClause
    ;

/*
 * Annotation property axioms
 */

annotationPropertyAxiom
    : ( ANNOTATION_PROPERTY_KW | ANNOTATION_KW PROPERTY_KW ) commentOpt? propId (SEMICOLON)? annotationPropertyClause ((SEMICOLON )? annotationPropertyClause)* (SEMICOLON)?  # AnnotationPropertyWithClauses
    | ( ANNOTATION_PROPERTY_KW | ANNOTATION_KW PROPERTY_KW ) commentOpt? propId                                                                             # AnnotationPropertyDecl
    ;

annotationPropertyClause
    : subPropertyOfPhrase commentOpt? propExpr                                      # AnnotationPropSubPropertyOfClause
    ;

/*
 * Datatype axioms
 */

datatypeAxiom
    : DATATYPE_KW datatypeId                              // declaration
    | DATATYPE_DEFINITION_KW datatypeId dataRangeExpr
    ;

// Note: Standalone HasKey axiom removed to align with Turtle-style inline class clause

/*
 * Subproperty chain axioms
 */

subPropertyChainAxiom
    : subPropertyChainPhrase LPAREN chain=propExprChainWithComments RPAREN subPropertyOfPhrase commentOpt? superProp=propExpr (SEMICOLON)?
    ;

subPropertyChainPhrase
    : SUB_PROPERTY_CHAIN_KW
    | SUBPROPERTY_CHAIN_KW CHAIN_KW
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
    : IS_KW A_KW
    | IS_KW AN_KW
    ;

// Group same/different variants for reuse at the end of an individual block
sameOrDifferentBody
    : sameAsPhrase individualList                         # SameAsBody
    | differentFromPhrase individualList                  # DifferentFromBody
    ;

sameAsPhrase
    : SAME_AS_KW
    | SAME_KW AS_KW
    | IS_KW SAME_KW AS_KW
    ;

differentFromPhrase
    : DIFFERENT_FROM_KW
    | DIFFERENT_KW FROM_KW
    | IS_KW DIFFERENT_KW FROM_KW
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
    | HAS_VALUE_KW commentOpt? propExpr entityUsage                   # ObjectHasValueExpr
    | HAS_VALUE_KW propExpr literal                        # DataHasValueExpr
    | MIN_KW INTEGER commentOpt? propExpr ( commentOpt? classExpr )?  # MinCardinalityExpr
    | MAX_KW INTEGER commentOpt? propExpr ( commentOpt? classExpr )?  # MaxCardinalityExpr
    | EXACTLY_KW INTEGER commentOpt? propExpr ( commentOpt? classExpr )?              # ExactCardinalityExpr
    // Manchester-style, property-first variants (sugar):
    | (THAT_KW)? commentOpt? propExpr ( SOME_KW | SOME_SYM ) commentOpt? classExpr                 # SomeValuesFromExpr_M
    | (THAT_KW)? commentOpt? propExpr ( ONLY_KW | ONLY_SYM ) commentOpt? classExpr                 # AllValuesFromExpr_M
    | (THAT_KW)? commentOpt? propExpr HAS_VALUE_KW entityUsage                               # ObjectHasValueExpr_M
    | (THAT_KW)? propExpr HAS_VALUE_KW literal                                                # DataHasValueExpr_M
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
    : ONE_OF_KW
    | ONE_KW OF_KW
    | IS_KW ONE_KW OF_KW
    ;

allOfPhrase
    : ALL_OF_KW
    | ALL_KW OF_KW
    | IS_KW ALL_KW OF_KW
    ;

anyOfPhrase
    : ANY_OF_KW
    | ANY_KW OF_KW
    | IS_KW ANY_KW OF_KW
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
    | thatConnector commentOpt? propExpr HAS_VALUE_KW entityUsage                      # ThatObjectHasValue
    | thatConnector propExpr HAS_VALUE_KW literal                                       # ThatDataHasValue
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
    | INVERSE_FUNCTIONAL_KW
    | TRANSITIVE_KW
    | SYMMETRIC_KW
    | ASYMMETRIC_KW
    | REFLEXIVE_KW
    | IRREFLEXIVE_KW
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
    ;

entityId
    : CURIE
    | CURIE_EMPTY
    | fullIRI
    ;

classId
    : CURIE
    | CURIE_EMPTY
    | fullIRI
    ;

propId
    : CURIE
    | CURIE_EMPTY
    | fullIRI
    ;

individualId
    : CURIE
    | CURIE_EMPTY
    | fullIRI
    ;

datatypeId
    : CURIE
    | CURIE_EMPTY
    | fullIRI
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
PREFIX_KW: 'Prefix';
ONTOLOGY_KW: 'Ontology';
VERSION_IRI_KW: 'versionIRI';
CLASS_KW: 'Class';
EQUIVALENT_CLASSES_KW: 'EquivalentClasses';
ALL_DISJOINT_CLASSES_KW: 'AllDisjointClasses';
SUB_CLASS_OF_KW: 'subClassOf';
IS_KW: 'is';
A_KW: 'a';
AN_KW: 'an';
SUBCLASS_KW: 'subclass';
OF_KW: 'of';
EQUIVALENT_TO_KW: 'equivalentTo';
EQUIVALENT_KW: 'equivalent';
TO_KW: 'to';
DISJOINT_WITH_KW: 'disjointWith';
DISJOINT_KW: 'disjoint';
WITH_KW: 'with';
DISJOINT_UNION_OF_KW: 'disjointUnionOf';
UNION_KW: 'union';
HAS_KW: 'has';
KEY_KW: 'key';
OBJECT_PROPERTY_KW: 'ObjectProperty';
OBJECT_KW: 'Object';
PROPERTY_KW: 'property';
EQUIVALENT_OBJECT_PROPERTIES_KW: 'EquivalentObjectProperties';
DISJOINT_OBJECT_PROPERTIES_KW: 'DisjointObjectProperties';
SUB_PROPERTY_OF_KW: 'subPropertyOf';
SUBPROPERTY_KW: 'subproperty';
DOMAIN_KW: 'domain';
RANGE_KW: 'range';
CHARACTERISTICS_KW: 'characteristics';
INVERSE_KW: 'inverse';
DATA_PROPERTY_KW: 'DataProperty';
DATA_KW: 'Data';
EQUIVALENT_DATA_PROPERTIES_KW: 'EquivalentDataProperties';
DISJOINT_DATA_PROPERTIES_KW: 'DisjointDataProperties';
ANNOTATION_PROPERTY_KW: 'AnnotationProperty';
ANNOTATION_KW: 'Annotation';
DATATYPE_KW: 'Datatype';
DATATYPE_DEFINITION_KW: 'DatatypeDefinition';
SUB_PROPERTY_CHAIN_KW: 'SubPropertyChain';
SUBPROPERTY_CHAIN_KW: 'Subproperty';
CHAIN_KW: 'chain';
INDIVIDUAL_KW: 'Individual';
TYPE_KW: 'type';
SAME_AS_KW: 'sameAs';
SAME_KW: 'same';
AS_KW: 'as';
DIFFERENT_FROM_KW: 'differentFrom';
DIFFERENT_KW: 'different';
FROM_KW: 'from';
NOT_KW: 'not';
AND_KW: 'and';
OR_KW: 'or';
THING_KW: 'Thing';
NOTHING_KW: 'Nothing';
SOME_KW: 'some';
ONLY_KW: 'only';
HAS_VALUE_KW: 'hasValue';
MIN_KW: 'min';
MAX_KW: 'max';
EXACTLY_KW: 'exactly';
THAT_KW: 'that';
AT_KW: 'at';
LEAST_KW: 'least';
MOST_KW: 'most';
ONE_OF_KW: 'oneOf';
ONE_KW: 'one';
ALL_OF_KW: 'allOf';
ALL_KW: 'all';
ANY_OF_KW: 'anyOf';
ANY_KW: 'any';
FUNCTIONAL_KW: 'functional';
INVERSE_FUNCTIONAL_KW: 'inverseFunctional';
TRANSITIVE_KW: 'transitive';
SYMMETRIC_KW: 'symmetric';
ASYMMETRIC_KW: 'asymmetric';
REFLEXIVE_KW: 'reflexive';
IRREFLEXIVE_KW: 'irreflexive';
RESTRICTION_KW: 'restriction';
GREATER_KW: 'greater';
THAN_KW: 'than';
LESS_KW: 'less';
EQUAL_KW: 'equal';
TRUE_KW: 'true';
FALSE_KW: 'false';

/* Operators & Symbols */
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


// (no separate AT token; '@' is part of LANGTAG or ANNOTATION)

