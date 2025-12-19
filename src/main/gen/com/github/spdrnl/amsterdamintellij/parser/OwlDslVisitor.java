// Generated from OwlDsl.g4 by ANTLR 4.13.2
package com.github.spdrnl.amsterdamintellij.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OwlDslParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OwlDslVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#ontology}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOntology(OwlDslParser.OntologyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#prefixDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixDecl(OwlDslParser.PrefixDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#annotatedAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedAxiom(OwlDslParser.AnnotatedAxiomContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#bareAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBareAxiom(OwlDslParser.BareAxiomContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#annotationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationBlock(OwlDslParser.AnnotationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#annotationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationList(OwlDslParser.AnnotationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(OwlDslParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#ontologyHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOntologyHeader(OwlDslParser.OntologyHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#ontologyPropertyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOntologyPropertyBlock(OwlDslParser.OntologyPropertyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#ontologyPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOntologyPropertyList(OwlDslParser.OntologyPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#ontologyProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOntologyProperty(OwlDslParser.OntologyPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#annotatedOntologyHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedOntologyHeader(OwlDslParser.AnnotatedOntologyHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#axiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxiom(OwlDslParser.AxiomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclAxiom}
	 * labeled alternative in {@link OwlDslParser#classAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclAxiom(OwlDslParser.ClassDeclAxiomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassSubOrEqAxiomAlt}
	 * labeled alternative in {@link OwlDslParser#classAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSubOrEqAxiomAlt(OwlDslParser.ClassSubOrEqAxiomAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EquivalentClassesAxiom}
	 * labeled alternative in {@link OwlDslParser#classAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalentClassesAxiom(OwlDslParser.EquivalentClassesAxiomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllDisjointClassesAxiom}
	 * labeled alternative in {@link OwlDslParser#classAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllDisjointClassesAxiom(OwlDslParser.AllDisjointClassesAxiomContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#classSubOrEqAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSubOrEqAxiom(OwlDslParser.ClassSubOrEqAxiomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassSubClause}
	 * labeled alternative in {@link OwlDslParser#classClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSubClause(OwlDslParser.ClassSubClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassEquivalentClause}
	 * labeled alternative in {@link OwlDslParser#classClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassEquivalentClause(OwlDslParser.ClassEquivalentClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDisjointClause}
	 * labeled alternative in {@link OwlDslParser#classClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDisjointClause(OwlDslParser.ClassDisjointClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDisjointUnionClause}
	 * labeled alternative in {@link OwlDslParser#classClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDisjointUnionClause(OwlDslParser.ClassDisjointUnionClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassHasKeyClause}
	 * labeled alternative in {@link OwlDslParser#classClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHasKeyClause(OwlDslParser.ClassHasKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#subClassOfPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubClassOfPhrase(OwlDslParser.SubClassOfPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#equivalentToPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalentToPhrase(OwlDslParser.EquivalentToPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#disjointWithPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjointWithPhrase(OwlDslParser.DisjointWithPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#disjointUnionOfPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjointUnionOfPhrase(OwlDslParser.DisjointUnionOfPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#hasKeyPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasKeyPhrase(OwlDslParser.HasKeyPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#commentOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentOpt(OwlDslParser.CommentOptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectPropertyDecl}
	 * labeled alternative in {@link OwlDslParser#objectPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPropertyDecl(OwlDslParser.ObjectPropertyDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectPropertyDomainRangeAlt}
	 * labeled alternative in {@link OwlDslParser#objectPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPropertyDomainRangeAlt(OwlDslParser.ObjectPropertyDomainRangeAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectSubPropertyAlt}
	 * labeled alternative in {@link OwlDslParser#objectPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectSubPropertyAlt(OwlDslParser.ObjectSubPropertyAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectInversePropertyAlt}
	 * labeled alternative in {@link OwlDslParser#objectPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInversePropertyAlt(OwlDslParser.ObjectInversePropertyAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EquivalentObjectPropertiesAxiom}
	 * labeled alternative in {@link OwlDslParser#objectPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalentObjectPropertiesAxiom(OwlDslParser.EquivalentObjectPropertiesAxiomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DisjointObjectPropertiesAxiom}
	 * labeled alternative in {@link OwlDslParser#objectPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjointObjectPropertiesAxiom(OwlDslParser.DisjointObjectPropertiesAxiomContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#objectSubPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectSubPropertyAxiom(OwlDslParser.ObjectSubPropertyAxiomContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#objectPropertyDomainRangeAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPropertyDomainRangeAxiom(OwlDslParser.ObjectPropertyDomainRangeAxiomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectPropDomainClause}
	 * labeled alternative in {@link OwlDslParser#objectPropertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPropDomainClause(OwlDslParser.ObjectPropDomainClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectPropRangeClause}
	 * labeled alternative in {@link OwlDslParser#objectPropertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPropRangeClause(OwlDslParser.ObjectPropRangeClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectPropCharacteristicsClause}
	 * labeled alternative in {@link OwlDslParser#objectPropertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPropCharacteristicsClause(OwlDslParser.ObjectPropCharacteristicsClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectPropSubPropertyOfClause}
	 * labeled alternative in {@link OwlDslParser#objectPropertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPropSubPropertyOfClause(OwlDslParser.ObjectPropSubPropertyOfClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectPropInverseClause}
	 * labeled alternative in {@link OwlDslParser#objectPropertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPropInverseClause(OwlDslParser.ObjectPropInverseClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectPropInverseFunction}
	 * labeled alternative in {@link OwlDslParser#objectPropertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPropInverseFunction(OwlDslParser.ObjectPropInverseFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#subPropertyOfPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPropertyOfPhrase(OwlDslParser.SubPropertyOfPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#domainPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainPhrase(OwlDslParser.DomainPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#rangePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangePhrase(OwlDslParser.RangePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#characteristicsPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacteristicsPhrase(OwlDslParser.CharacteristicsPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#inverseOfPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInverseOfPhrase(OwlDslParser.InverseOfPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#objectInversePropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInversePropertyAxiom(OwlDslParser.ObjectInversePropertyAxiomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataPropertyDecl}
	 * labeled alternative in {@link OwlDslParser#dataPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPropertyDecl(OwlDslParser.DataPropertyDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataPropertyDomainRangeAlt}
	 * labeled alternative in {@link OwlDslParser#dataPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPropertyDomainRangeAlt(OwlDslParser.DataPropertyDomainRangeAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataSubPropertyAlt}
	 * labeled alternative in {@link OwlDslParser#dataPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSubPropertyAlt(OwlDslParser.DataSubPropertyAltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EquivalentDataPropertiesAxiom}
	 * labeled alternative in {@link OwlDslParser#dataPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalentDataPropertiesAxiom(OwlDslParser.EquivalentDataPropertiesAxiomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DisjointDataPropertiesAxiom}
	 * labeled alternative in {@link OwlDslParser#dataPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjointDataPropertiesAxiom(OwlDslParser.DisjointDataPropertiesAxiomContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#dataSubPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSubPropertyAxiom(OwlDslParser.DataSubPropertyAxiomContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#dataPropertyDomainRangeAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPropertyDomainRangeAxiom(OwlDslParser.DataPropertyDomainRangeAxiomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataPropDomainClause}
	 * labeled alternative in {@link OwlDslParser#dataPropertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPropDomainClause(OwlDslParser.DataPropDomainClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataPropRangeClause}
	 * labeled alternative in {@link OwlDslParser#dataPropertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPropRangeClause(OwlDslParser.DataPropRangeClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataPropCharacteristicsClause}
	 * labeled alternative in {@link OwlDslParser#dataPropertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPropCharacteristicsClause(OwlDslParser.DataPropCharacteristicsClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataPropSubPropertyOfClause}
	 * labeled alternative in {@link OwlDslParser#dataPropertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPropSubPropertyOfClause(OwlDslParser.DataPropSubPropertyOfClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotationPropertyWithClauses}
	 * labeled alternative in {@link OwlDslParser#annotationPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationPropertyWithClauses(OwlDslParser.AnnotationPropertyWithClausesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotationPropertyDecl}
	 * labeled alternative in {@link OwlDslParser#annotationPropertyAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationPropertyDecl(OwlDslParser.AnnotationPropertyDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotationPropSubPropertyOfClause}
	 * labeled alternative in {@link OwlDslParser#annotationPropertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationPropSubPropertyOfClause(OwlDslParser.AnnotationPropSubPropertyOfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#datatypeAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeAxiom(OwlDslParser.DatatypeAxiomContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#subPropertyChainAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPropertyChainAxiom(OwlDslParser.SubPropertyChainAxiomContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#subPropertyChainPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPropertyChainPhrase(OwlDslParser.SubPropertyChainPhraseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndividualWithBody}
	 * labeled alternative in {@link OwlDslParser#individualAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividualWithBody(OwlDslParser.IndividualWithBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndividualBareDecl}
	 * labeled alternative in {@link OwlDslParser#individualAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividualBareDecl(OwlDslParser.IndividualBareDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#individualAxiomBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividualAxiomBody(OwlDslParser.IndividualAxiomBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAssertionBody}
	 * labeled alternative in {@link OwlDslParser#typeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssertionBody(OwlDslParser.TypeAssertionBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAssertionBodySugar}
	 * labeled alternative in {@link OwlDslParser#typeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssertionBodySugar(OwlDslParser.TypeAssertionBodySugarContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#isAPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsAPhrase(OwlDslParser.IsAPhraseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SameAsBody}
	 * labeled alternative in {@link OwlDslParser#sameOrDifferentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSameAsBody(OwlDslParser.SameAsBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DifferentFromBody}
	 * labeled alternative in {@link OwlDslParser#sameOrDifferentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferentFromBody(OwlDslParser.DifferentFromBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#sameAsPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSameAsPhrase(OwlDslParser.SameAsPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#differentFromPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferentFromPhrase(OwlDslParser.DifferentFromPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#propAssertionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropAssertionList(OwlDslParser.PropAssertionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectPropertyAssertion}
	 * labeled alternative in {@link OwlDslParser#propAssertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPropertyAssertion(OwlDslParser.ObjectPropertyAssertionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataPropertyAssertion}
	 * labeled alternative in {@link OwlDslParser#propAssertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPropertyAssertion(OwlDslParser.DataPropertyAssertionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegativeObjectPropertyAssertion}
	 * labeled alternative in {@link OwlDslParser#propAssertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeObjectPropertyAssertion(OwlDslParser.NegativeObjectPropertyAssertionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegativeDataPropertyAssertion}
	 * labeled alternative in {@link OwlDslParser#propAssertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeDataPropertyAssertion(OwlDslParser.NegativeDataPropertyAssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#classExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExprList(OwlDslParser.ClassExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#classExprNaryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExprNaryList(OwlDslParser.ClassExprNaryListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#classExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExpr(OwlDslParser.ClassExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#boolClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolClassExpr(OwlDslParser.BoolClassExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#primaryClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryClassExpr(OwlDslParser.PrimaryClassExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedClassWithThatExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedClassWithThatExpr(OwlDslParser.NamedClassWithThatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedClassExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedClassExpr(OwlDslParser.NamedClassExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TopClassExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopClassExpr(OwlDslParser.TopClassExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BottomClassExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottomClassExpr(OwlDslParser.BottomClassExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplementClassExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplementClassExpr(OwlDslParser.ComplementClassExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SomeValuesFromExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeValuesFromExpr(OwlDslParser.SomeValuesFromExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllValuesFromExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllValuesFromExpr(OwlDslParser.AllValuesFromExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectHasValueExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectHasValueExpr(OwlDslParser.ObjectHasValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataHasValueExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataHasValueExpr(OwlDslParser.DataHasValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinCardinalityExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinCardinalityExpr(OwlDslParser.MinCardinalityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaxCardinalityExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxCardinalityExpr(OwlDslParser.MaxCardinalityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExactCardinalityExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExactCardinalityExpr(OwlDslParser.ExactCardinalityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SomeValuesFromExpr_M}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeValuesFromExpr_M(OwlDslParser.SomeValuesFromExpr_MContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllValuesFromExpr_M}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllValuesFromExpr_M(OwlDslParser.AllValuesFromExpr_MContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectHasValueExpr_M}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectHasValueExpr_M(OwlDslParser.ObjectHasValueExpr_MContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataHasValueExpr_M}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataHasValueExpr_M(OwlDslParser.DataHasValueExpr_MContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinCardinalityExpr_M}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinCardinalityExpr_M(OwlDslParser.MinCardinalityExpr_MContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaxCardinalityExpr_M}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxCardinalityExpr_M(OwlDslParser.MaxCardinalityExpr_MContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExactCardinalityExpr_M}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExactCardinalityExpr_M(OwlDslParser.ExactCardinalityExpr_MContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinCardinalityFriendly}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinCardinalityFriendly(OwlDslParser.MinCardinalityFriendlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaxCardinalityFriendly}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxCardinalityFriendly(OwlDslParser.MaxCardinalityFriendlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinCardinalityFriendly_M}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinCardinalityFriendly_M(OwlDslParser.MinCardinalityFriendly_MContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaxCardinalityFriendly_M}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxCardinalityFriendly_M(OwlDslParser.MaxCardinalityFriendly_MContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectOneOfExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectOneOfExpr(OwlDslParser.ObjectOneOfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntersectionExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectionExpr(OwlDslParser.IntersectionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnionExpr}
	 * labeled alternative in {@link OwlDslParser#atomicClassExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionExpr(OwlDslParser.UnionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#atLeastPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtLeastPhrase(OwlDslParser.AtLeastPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#atMostPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtMostPhrase(OwlDslParser.AtMostPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#oneOfPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneOfPhrase(OwlDslParser.OneOfPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#allOfPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOfPhrase(OwlDslParser.AllOfPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#anyOfPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyOfPhrase(OwlDslParser.AnyOfPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#thatConnector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThatConnector(OwlDslParser.ThatConnectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThatSomeValuesFrom}
	 * labeled alternative in {@link OwlDslParser#thatRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThatSomeValuesFrom(OwlDslParser.ThatSomeValuesFromContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThatAllValuesFrom}
	 * labeled alternative in {@link OwlDslParser#thatRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThatAllValuesFrom(OwlDslParser.ThatAllValuesFromContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThatObjectHasValue}
	 * labeled alternative in {@link OwlDslParser#thatRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThatObjectHasValue(OwlDslParser.ThatObjectHasValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThatDataHasValue}
	 * labeled alternative in {@link OwlDslParser#thatRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThatDataHasValue(OwlDslParser.ThatDataHasValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThatMinCardinality}
	 * labeled alternative in {@link OwlDslParser#thatRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThatMinCardinality(OwlDslParser.ThatMinCardinalityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThatMaxCardinality}
	 * labeled alternative in {@link OwlDslParser#thatRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThatMaxCardinality(OwlDslParser.ThatMaxCardinalityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThatExactCardinality}
	 * labeled alternative in {@link OwlDslParser#thatRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThatExactCardinality(OwlDslParser.ThatExactCardinalityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThatMinCardinalityFriendly}
	 * labeled alternative in {@link OwlDslParser#thatRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThatMinCardinalityFriendly(OwlDslParser.ThatMinCardinalityFriendlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThatMaxCardinalityFriendly}
	 * labeled alternative in {@link OwlDslParser#thatRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThatMaxCardinalityFriendly(OwlDslParser.ThatMaxCardinalityFriendlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOpASCII}
	 * labeled alternative in {@link OwlDslParser#binaryBoolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOpASCII(OwlDslParser.AndOpASCIIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOpUnicode}
	 * labeled alternative in {@link OwlDslParser#binaryBoolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOpUnicode(OwlDslParser.AndOpUnicodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrOpASCII}
	 * labeled alternative in {@link OwlDslParser#binaryBoolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOpASCII(OwlDslParser.OrOpASCIIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrOpUnicode}
	 * labeled alternative in {@link OwlDslParser#binaryBoolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOpUnicode(OwlDslParser.OrOpUnicodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedPropertyExpr}
	 * labeled alternative in {@link OwlDslParser#propExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedPropertyExpr(OwlDslParser.NamedPropertyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InversePropertyFunction}
	 * labeled alternative in {@link OwlDslParser#propExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInversePropertyFunction(OwlDslParser.InversePropertyFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InversePropertyPhrase}
	 * labeled alternative in {@link OwlDslParser#propExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInversePropertyPhrase(OwlDslParser.InversePropertyPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#propExprChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropExprChain(OwlDslParser.PropExprChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#propExprChainWithComments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropExprChainWithComments(OwlDslParser.PropExprChainWithCommentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#propExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropExprList(OwlDslParser.PropExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#propExprWithCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropExprWithCommentList(OwlDslParser.PropExprWithCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#characteristicList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacteristicList(OwlDslParser.CharacteristicListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#characteristic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacteristic(OwlDslParser.CharacteristicContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#dataCharacteristicList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataCharacteristicList(OwlDslParser.DataCharacteristicListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#dataCharacteristic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataCharacteristic(OwlDslParser.DataCharacteristicContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#dataRangeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRangeExpr(OwlDslParser.DataRangeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#dataRangeOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRangeOrExpr(OwlDslParser.DataRangeOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#dataRangeAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRangeAndExpr(OwlDslParser.DataRangeAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedDatatype}
	 * labeled alternative in {@link OwlDslParser#dataRangePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedDatatype(OwlDslParser.NamedDatatypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedDataRange}
	 * labeled alternative in {@link OwlDslParser#dataRangePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedDataRange(OwlDslParser.ParenthesizedDataRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataOneOf}
	 * labeled alternative in {@link OwlDslParser#dataRangePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOneOf(OwlDslParser.DataOneOfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataComplementOf}
	 * labeled alternative in {@link OwlDslParser#dataRangePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataComplementOf(OwlDslParser.DataComplementOfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DatatypeRestriction}
	 * labeled alternative in {@link OwlDslParser#dataRangePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeRestriction(OwlDslParser.DatatypeRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#facetRestrictionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacetRestrictionList(OwlDslParser.FacetRestrictionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#facetRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacetRestriction(OwlDslParser.FacetRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#greaterThanPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanPhrase(OwlDslParser.GreaterThanPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#lessThanPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanPhrase(OwlDslParser.LessThanPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#equalToPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualToPhrase(OwlDslParser.EqualToPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#literalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralList(OwlDslParser.LiteralListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#individualList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividualList(OwlDslParser.IndividualListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#entityUsage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityUsage(OwlDslParser.EntityUsageContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#entityId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityId(OwlDslParser.EntityIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#classId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassId(OwlDslParser.ClassIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#propId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropId(OwlDslParser.PropIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#individualId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividualId(OwlDslParser.IndividualIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#datatypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeId(OwlDslParser.DatatypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#namespaceIRI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceIRI(OwlDslParser.NamespaceIRIContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#fullIRI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullIRI(OwlDslParser.FullIRIContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(OwlDslParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#ge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGe(OwlDslParser.GeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#le}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe(OwlDslParser.LeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#gt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(OwlDslParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#lt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(OwlDslParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by {@link OwlDslParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(OwlDslParser.EqContext ctx);
}