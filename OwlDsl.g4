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
    : 'Prefix' ( PREFIX_NAME | ':' ) IRI '.'
    ;

/*
 * Annotations (can prefix any axiom or declaration)
 */

annotatedAxiom
    : annotationBlock+ bareAxiom
    ;

bareAxiom
    : axiom ('.')?
    ;

annotationBlock
    : ANNOTATION '(' annotationList ')'
    ;

annotationList
    : annotation (',' annotation)*
    ;

annotation
    : propId ( literal | individualId | IRI )
    ;

/*
 * Ontology header + ontology-level properties (@property)
 */

ontologyHeader
    : 'Ontology' IRI ( 'versionIRI' IRI )? '.'
    ;

ontologyPropertyBlock
    : PROPERTY '(' ontologyPropertyList ')'
    ;

ontologyPropertyList
    : ontologyProperty (',' ontologyProperty)*
    ;

ontologyProperty
    : propId ( literal | individualId | IRI )
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
    : 'Class' commentOpt? classId                                      # ClassDeclAxiom
    | classSubOrEqAxiom                                                # ClassSubOrEqAxiomAlt
    | 'EquivalentClasses' '(' classExprList ')'                        # EquivalentClassesAxiom
    | 'AllDisjointClasses' '(' classExprList ')'                       # AllDisjointClassesAxiom
    ;

// classDeclarationTail removed (was empty), to avoid optional-empty warning

classSubOrEqAxiom
    : 'Class' commentOpt? classId (';')? classClause ( ';' classClause )* (';')?
    ;

classClause
    : ( 'subClassOf'
      | 'is' 'a'
      | 'is' 'an'
      | 'is' 'subclass' 'of'
      | '⊑'
      | '<=:'
      ) commentOpt? classExpr                         # ClassSubClause
    | ( 'equivalentTo' | 'equivalent' 'to' | 'is' 'equivalent' 'to' ) classExpr               # ClassEquivalentClause
    | ( 'disjointWith' | 'disjoint' 'with' | 'is' 'disjoint' 'with' ) classExpr               # ClassDisjointClause
    | ( 'disjointUnionOf' | 'is' 'disjoint' 'union' 'of' ) '(' classExprList ')'              # ClassDisjointUnionClause
    | ( 'has' 'key' ) '(' propExprWithCommentList ')'                                        # ClassHasKeyClause
    ;

// Optional inline literal comment to aid readability (no semantic effect)
commentOpt
    : literal
    ;

/*
 * Object property axioms
 */

objectPropertyAxiom
    : ( 'ObjectProperty' | 'Object' 'property' ) commentOpt? propId     # ObjectPropertyDecl
    | objectPropertyDomainRangeAxiom                                    # ObjectPropertyDomainRangeAlt
    | objectSubPropertyAxiom                                            # ObjectSubPropertyAlt
    | objectInversePropertyAxiom                                        # ObjectInversePropertyAlt
    | 'EquivalentObjectProperties' '(' propExprWithCommentList ')'      # EquivalentObjectPropertiesAxiom
    | 'DisjointObjectProperties' '(' propExprWithCommentList ')'        # DisjointObjectPropertiesAxiom
    ;

// objectPropertyDeclTail removed (was empty), to avoid optional-empty warning

objectSubPropertyAxiom
    : ( 'ObjectProperty' | 'Object' 'property' ) commentOpt? propId (';')? ( 'subPropertyOf' | '⊑' | '<=:' | 'is' 'subproperty' 'of' | 'subproperty' 'of' ) commentOpt? propExpr (';')?
    ;

objectPropertyDomainRangeAxiom
    : ( 'ObjectProperty' | 'Object' 'property' ) commentOpt? propId (';')? objectPropertyClause ((';' )? objectPropertyClause)* (';')?
    ;

objectPropertyClause
    : ( 'domain' | 'has' 'domain' ) commentOpt? classExpr                                        # ObjectPropDomainClause
    | ( 'range'  | 'has' 'range' )  commentOpt? classExpr                                        # ObjectPropRangeClause
    | ( 'characteristics' | 'has' 'characteristics' ) '(' characteristicList ')'                 # ObjectPropCharacteristicsClause
    | ( 'subPropertyOf' | '⊑' | '<=:' | 'is' 'subproperty' 'of' | 'subproperty' 'of' ) commentOpt? propExpr           # ObjectPropSubPropertyOfClause
    | ( 'inverse' '(' commentOpt? propExpr ')' | 'inverse' 'of' commentOpt? propExpr | 'is' 'inverse' 'of' commentOpt? propExpr )           # ObjectPropInverseClause
    ;

// Standalone inverse axiom for object properties
objectInversePropertyAxiom
    : ( 'ObjectProperty' | 'Object' 'property' ) commentOpt? propId (';')? ( 'inverse' '(' commentOpt? propExpr ')' | 'inverse' 'of' commentOpt? propExpr | 'is' 'inverse' 'of' commentOpt? propExpr ) (';')?
    ;

/*
 * Data property axioms
 */

dataPropertyAxiom
    : ( 'DataProperty' | 'Data' 'property' ) propId                     # DataPropertyDecl
    | dataPropertyDomainRangeAxiom                                      # DataPropertyDomainRangeAlt
    | dataSubPropertyAxiom                                              # DataSubPropertyAlt
    | 'EquivalentDataProperties' '(' propExprList ')'                   # EquivalentDataPropertiesAxiom
    | 'DisjointDataProperties' '(' propExprList ')'                     # DisjointDataPropertiesAxiom
    ;

// dataPropertyDeclTail removed (was empty), to avoid optional-empty warning

dataSubPropertyAxiom
    : ( 'DataProperty' | 'Data' 'property' ) propId (';')? ( 'subPropertyOf' | '⊑' | '<=:' | 'is' 'subproperty' 'of' | 'subproperty' 'of' ) propExpr (';')?
    ;

dataPropertyDomainRangeAxiom
    : ( 'DataProperty' | 'Data' 'property' ) propId (';')? dataPropertyClause ((';' )? dataPropertyClause)* (';')?
    ;

dataPropertyClause
    : ( 'domain' | 'has' 'domain' ) classExpr                                                   # DataPropDomainClause
    | ( 'range'  | 'has' 'range' )  dataRangeExpr                                               # DataPropRangeClause
    | ( 'characteristics' | 'has' 'characteristics' ) '(' dataCharacteristicList ')'            # DataPropCharacteristicsClause
    | ( 'subPropertyOf' | '⊑' | '<=:' | 'is' 'subproperty' 'of' | 'subproperty' 'of' ) propExpr                      # DataPropSubPropertyOfClause
    ;

/*
 * Annotation property axioms
 */

annotationPropertyAxiom
    : ( 'AnnotationProperty' | 'Annotation' 'property' ) commentOpt? propId (';')? annotationPropertyClause ((';' )? annotationPropertyClause)* (';')?  # AnnotationPropertyWithClauses
    | ( 'AnnotationProperty' | 'Annotation' 'property' ) commentOpt? propId                                                                             # AnnotationPropertyDecl
    ;

annotationPropertyClause
    : ( 'subPropertyOf' | '⊑' | '<=:' | 'is' 'subproperty' 'of' ) commentOpt? propExpr                                      # AnnotationPropSubPropertyOfClause
    ;

/*
 * Datatype axioms
 */

datatypeAxiom
    : 'Datatype' datatypeId                              // declaration
    | 'DatatypeDefinition' datatypeId dataRangeExpr
    ;

// Note: Standalone HasKey axiom removed to align with Turtle-style inline class clause

/*
 * Subproperty chain axioms
 */

subPropertyChainAxiom
    : ( 'SubPropertyChain' | 'Subproperty' 'chain' ) '(' chain=propExprChainWithComments ')' ( 'subPropertyOf' | '⊑' | '<=:' | 'is' 'subproperty' 'of' | 'subproperty' 'of' ) commentOpt? superProp=propExpr (';')?
    ;

/*
 * Individual (ABox) axioms
 */

individualAxiom
    : 'Individual' commentOpt? individualId (';')? individualAxiomBody (';')?   # IndividualWithBody
    | 'Individual' commentOpt? individualId (';')?                               # IndividualBareDecl
    ;

// Allow minimal composite body for individuals:
//  - A type body optionally followed by ';' and then a property assertions list
//  - Or any of the original single-body alternatives
individualAxiomBody
    : typeBody (';' propAssertionList)* (';' sameOrDifferentBody)*
    | propAssertionList (';' propAssertionList)* (';' sameOrDifferentBody)*
    | sameOrDifferentBody
    ;

// Factor out the three type assertion sugar forms
typeBody
    : 'type' classExprList                               # TypeAssertionBody
    | 'is' 'a' classExprList                             # TypeAssertionBodySugar
    | 'is' 'an' classExprList                            # TypeAssertionBodySugar_An
    ;

// Group same/different variants for reuse at the end of an individual block
sameOrDifferentBody
    : 'sameAs' individualList                            # SameAsBody
    | 'same' 'as' individualList                         # SameAsBodySugar
    | 'is' 'same' 'as' individualList                    # SameAsBodySugar
    | 'differentFrom' individualList                     # DifferentFromBody
    | 'different' 'from' individualList                  # DifferentFromBodySugar
    | 'is' 'different' 'from' individualList             # DifferentFromBodySugar
    ;

propAssertionList
    : propAssertion (',' propAssertion)*
    ;

propAssertion
    : commentOpt? propExpr individualId                              # ObjectPropertyAssertion
    | propExpr literal                                   # DataPropertyAssertion
    | ( 'not' | '¬' ) commentOpt? propExpr individualId               # NegativeObjectPropertyAssertion
    | ( 'not' | '¬' ) propExpr literal                    # NegativeDataPropertyAssertion
    ;

/*
 * Class expressions (OWL 2 complete at expression level)
 */

classExprList
    : classExpr (',' classExpr)*
    ;

// For n-ary boolean constructors: allow either comma-separated or 'and'-separated lists
classExprNaryList
    : classExpr ( (',' classExpr)+ | ('and' classExpr)+ )?
    ;

classExpr
    : boolClassExpr
    ;

boolClassExpr
    : primaryClassExpr (binaryBoolOp primaryClassExpr)*  // left-associative and/or
    ;

primaryClassExpr
    : atomicClassExpr
    | '(' classExpr ')'
    ;

atomicClassExpr
    // Named class with one or more trailing property-first restrictions introduced by 'that'
    // Example: :Painting that :hasPart some :Frame
    // This is syntactic sugar for an intersection between the named class and each restriction.
    : commentOpt? classId thatRestriction+               # NamedClassWithThatExpr
    | commentOpt? classId                                # NamedClassExpr
    | 'Thing'                                            # TopClassExpr
    | 'Nothing'                                          # BottomClassExpr
    | ( 'not' | '¬' ) primaryClassExpr                   # ComplementClassExpr
    | ( 'some' | '∃' ) commentOpt? propExpr commentOpt? classExpr                 # SomeValuesFromExpr
    | ( 'only' | '∀' ) commentOpt? propExpr commentOpt? classExpr                 # AllValuesFromExpr
    | 'hasValue' commentOpt? propExpr individualId                   # ObjectHasValueExpr
    | 'hasValue' propExpr literal                        # DataHasValueExpr
    | 'min' INTEGER commentOpt? propExpr ( commentOpt? classExpr )?  # MinCardinalityExpr
    | 'max' INTEGER commentOpt? propExpr ( commentOpt? classExpr )?  # MaxCardinalityExpr
    | 'exactly' INTEGER commentOpt? propExpr ( commentOpt? classExpr )?              # ExactCardinalityExpr
    // Manchester-style, property-first variants (sugar):
    | ('that')? commentOpt? propExpr ( 'some' | '∃' ) commentOpt? classExpr                 # SomeValuesFromExpr_M
    | ('that')? commentOpt? propExpr ( 'only' | '∀' ) commentOpt? classExpr                 # AllValuesFromExpr_M
    | ('that')? commentOpt? propExpr 'hasValue' individualId                               # ObjectHasValueExpr_M
    | ('that')? propExpr 'hasValue' literal                                                # DataHasValueExpr_M
    | ('that')? commentOpt? propExpr 'min' INTEGER ( commentOpt? classExpr )?              # MinCardinalityExpr_M
    | ('that')? commentOpt? propExpr 'max' INTEGER ( commentOpt? classExpr )?              # MaxCardinalityExpr_M
    | ('that')? commentOpt? propExpr 'exactly' INTEGER ( commentOpt? classExpr )?          # ExactCardinalityExpr_M
    // Friendly cardinality synonyms
    | 'at' 'least' INTEGER commentOpt? propExpr ( commentOpt? classExpr )?       # MinCardinalityFriendly
    | 'at' 'most'  INTEGER commentOpt? propExpr ( commentOpt? classExpr )?       # MaxCardinalityFriendly
    | ('that')? commentOpt? propExpr 'at' 'least' INTEGER ( commentOpt? classExpr )?       # MinCardinalityFriendly_M
    | ('that')? commentOpt? propExpr 'at' 'most'  INTEGER ( commentOpt? classExpr )?       # MaxCardinalityFriendly_M
    | ( 'oneOf' | 'one' 'of' | 'is' 'one' 'of' ) '(' individualList ')'                     # ObjectOneOfExpr
    // Readable n-ary lists: allow 'and' as a separator inside allOf/anyOf
    | ( 'allOf' | 'all' 'of' | 'is' 'all' 'of' ) '(' classExprNaryList ')'     # IntersectionExpr
    | ( 'anyOf' | 'any' 'of' | 'is' 'any' 'of' ) '(' classExprNaryList ')'     # UnionExpr
    ;

// Connector used inside named-class-with-that sugar; allows optional 'and' before 'that'
thatConnector
    : 'that'
    | 'and' 'that'
    ;

// Trailing restriction forms allowed after a named class with 'that'.
// Keep this aligned with the Manchester-style property-first variants used elsewhere.
thatRestriction
    : thatConnector commentOpt? propExpr ( 'some' | '∃' ) commentOpt? classExpr       # ThatSomeValuesFrom
    | thatConnector commentOpt? propExpr ( 'only' | '∀' ) commentOpt? classExpr       # ThatAllValuesFrom
    | thatConnector commentOpt? propExpr 'hasValue' individualId                      # ThatObjectHasValue
    | thatConnector propExpr 'hasValue' literal                                       # ThatDataHasValue
    // Cardinalities (optional filler)
    | thatConnector commentOpt? propExpr 'min' INTEGER ( commentOpt? classExpr )?     # ThatMinCardinality
    | thatConnector commentOpt? propExpr 'max' INTEGER ( commentOpt? classExpr )?     # ThatMaxCardinality
    | thatConnector commentOpt? propExpr 'exactly' INTEGER ( commentOpt? classExpr )? # ThatExactCardinality
    // Friendly cardinality synonyms
    | thatConnector commentOpt? propExpr 'at' 'least' INTEGER ( commentOpt? classExpr )?  # ThatMinCardinalityFriendly
    | thatConnector commentOpt? propExpr 'at' 'most'  INTEGER ( commentOpt? classExpr )?  # ThatMaxCardinalityFriendly
    ;

binaryBoolOp
    : 'and'   # AndOpASCII
    | '⊓'     # AndOpUnicode
    | 'or'    # OrOpASCII
    | '⊔'     # OrOpUnicode
    ;

/*
 * Property expressions
 */

propExpr
    : propId                                             # NamedPropertyExpr
    | 'inverse' '(' propExpr ')'                         # InversePropertyExpr
    | 'inverse' 'of' propExpr                            # InversePropertyPhrase
    | 'is' 'inverse' 'of' propExpr                       # InversePropertyPhraseVerb
    ;

propExprChain
    : propExpr ( ( 'o' | 'then' ) propExpr )*
    ;

// Same as propExprChain but allowing optional inline literal after each propExpr
propExprChainWithComments
    : commentOpt? propExpr ( ( 'o' | 'then' ) commentOpt? propExpr )*
    ;

propExprList
    : propExpr (',' propExpr)*
    ;

// propExpr list with optional inline literals after each property expression
propExprWithCommentList
    : commentOpt? propExpr (',' commentOpt? propExpr )*
    ;

/*
 * Property characteristics
 */

characteristicList
    : characteristic (',' characteristic)*
    ;

characteristic
    : 'functional'
    | 'inverseFunctional'
    | 'transitive'
    | 'symmetric'
    | 'asymmetric'
    | 'reflexive'
    | 'irreflexive'
    ;

dataCharacteristicList
    : dataCharacteristic (',' dataCharacteristic)*
    ;

dataCharacteristic
    : 'functional'
    ;

/*
 * Data ranges (OWL 2: union, intersection, complement, oneOf, restrictions)
 */

dataRangeExpr
    : dataRangeOrExpr
    ;

dataRangeOrExpr
    : dataRangeAndExpr ( 'or' dataRangeAndExpr )*
    ;

dataRangeAndExpr
    : dataRangePrimary ( 'and' dataRangePrimary )*
    ;

dataRangePrimary
    : datatypeId                                         # NamedDatatype
    | '(' dataRangeExpr ')'                              # ParenthesizedDataRange
    | ( 'oneOf' | 'one' 'of' | 'is' 'one' 'of' ) '(' literalList? ')'                        # DataOneOf
    | 'not' dataRangePrimary                             # DataComplementOf
    | 'restriction' datatypeId '{' facetRestrictionList '}' # DatatypeRestriction
    ;

facetRestrictionList
    : facetRestriction (',' facetRestriction)*
    ;

facetRestriction
    : FACET literal
    // Fluent/operator facet forms for phrase/classic modes and symbols
    | ('at' 'least' | GE | ge | GE_SYM | GE_ASC) literal
    | ('at' 'most'  | LE | le | LE_SYM | LE_ASC) literal
    | ('greater' 'than' | GT | gt | GT_SYM) literal
    | ('less' 'than'    | LT | lt | LT_SYM) literal
    | ('equal' 'to'     | EQ | eq | EQ_SYM) literal
    ;

literalList
    : literal (',' literal)*
    ;

/*
 * IDs and lists
 */

classId
    : curieOrIri
    ;

propId
    : curieOrIri
    ;

individualId
    : curieOrIri
    ;

datatypeId
    : curieOrIri
    ;

individualList
    : individualId (',' individualId)*
    ;

curieOrIri
    : CURIE
    | CURIE_EMPTY
    | IRI
    ;

/*
 * Literals
 */

literal
    : (STRING | STRING3) ( LANGTAG | '^^' datatypeId )?
    | INTEGER
    | DECIMAL
    | DOUBLE
    | 'true'
    | 'false'
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


// (no separate AT token; '@' is part of LANGTAG or ANNOTATION)

