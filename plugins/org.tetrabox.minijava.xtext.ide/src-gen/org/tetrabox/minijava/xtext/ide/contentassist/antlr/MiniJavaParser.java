/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.minijava.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.tetrabox.minijava.xtext.ide.contentassist.antlr.internal.InternalMiniJavaParser;
import org.tetrabox.minijava.xtext.services.MiniJavaGrammarAccess;

public class MiniJavaParser extends AbstractContentAssistParser {

	@Inject
	private MiniJavaGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMiniJavaParser createParser() {
		InternalMiniJavaParser result = new InternalMiniJavaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMemberAccess().getAlternatives(), "rule__Member__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getIfBlockAccess().getAlternatives(), "rule__IfBlock__Alternatives");
					put(grammarAccess.getSymbolAccess().getAlternatives(), "rule__Symbol__Alternatives");
					put(grammarAccess.getNamedElementAccess().getAlternatives(), "rule__NamedElement__Alternatives");
					put(grammarAccess.getTerminalExpressionAccess().getAlternatives(), "rule__TerminalExpression__Alternatives");
					put(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_2_1_0(), "rule__TerminalExpression__ValueAlternatives_2_1_0");
					put(grammarAccess.getAccessLevelAccess().getAlternatives(), "rule__AccessLevel__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getProgramAccess().getGroup_0(), "rule__Program__Group_0__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getClassAccess().getGroup_2(), "rule__Class__Group_2__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_3(), "rule__Method__Group_3__0");
					put(grammarAccess.getMethodAccess().getGroup_3_1(), "rule__Method__Group_3_1__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getStatementAccess().getGroup_2(), "rule__Statement__Group_2__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getReturnAccess().getGroup(), "rule__Return__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup_5(), "rule__IfStatement__Group_5__0");
					put(grammarAccess.getTypedDeclarationAccess().getGroup(), "rule__TypedDeclaration__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1(), "rule__Assignment__Group_1__0");
					put(grammarAccess.getSelectionExpressionAccess().getGroup(), "rule__SelectionExpression__Group__0");
					put(grammarAccess.getSelectionExpressionAccess().getGroup_1(), "rule__SelectionExpression__Group_1__0");
					put(grammarAccess.getSelectionExpressionAccess().getGroup_1_3(), "rule__SelectionExpression__Group_1_3__0");
					put(grammarAccess.getSelectionExpressionAccess().getGroup_1_3_1(), "rule__SelectionExpression__Group_1_3_1__0");
					put(grammarAccess.getSelectionExpressionAccess().getGroup_1_3_1_1(), "rule__SelectionExpression__Group_1_3_1_1__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_0(), "rule__TerminalExpression__Group_0__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_1(), "rule__TerminalExpression__Group_1__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_2(), "rule__TerminalExpression__Group_2__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_3(), "rule__TerminalExpression__Group_3__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_4(), "rule__TerminalExpression__Group_4__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_5(), "rule__TerminalExpression__Group_5__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_6(), "rule__TerminalExpression__Group_6__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_7(), "rule__TerminalExpression__Group_7__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_8(), "rule__TerminalExpression__Group_8__0");
					put(grammarAccess.getProgramAccess().getNameAssignment_0_1(), "rule__Program__NameAssignment_0_1");
					put(grammarAccess.getProgramAccess().getImportsAssignment_1(), "rule__Program__ImportsAssignment_1");
					put(grammarAccess.getProgramAccess().getClassesAssignment_2(), "rule__Program__ClassesAssignment_2");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getClassAccess().getNameAssignment_1(), "rule__Class__NameAssignment_1");
					put(grammarAccess.getClassAccess().getSuperclassAssignment_2_1(), "rule__Class__SuperclassAssignment_2_1");
					put(grammarAccess.getClassAccess().getMembersAssignment_4(), "rule__Class__MembersAssignment_4");
					put(grammarAccess.getFieldAccess().getAccessAssignment_0(), "rule__Field__AccessAssignment_0");
					put(grammarAccess.getMethodAccess().getAccessAssignment_0(), "rule__Method__AccessAssignment_0");
					put(grammarAccess.getMethodAccess().getParamsAssignment_3_0(), "rule__Method__ParamsAssignment_3_0");
					put(grammarAccess.getMethodAccess().getParamsAssignment_3_1_1(), "rule__Method__ParamsAssignment_3_1_1");
					put(grammarAccess.getMethodAccess().getBodyAssignment_5(), "rule__Method__BodyAssignment_5");
					put(grammarAccess.getBlockAccess().getStatementsAssignment_2(), "rule__Block__StatementsAssignment_2");
					put(grammarAccess.getVariableDeclarationAccess().getExpressionAssignment_2(), "rule__VariableDeclaration__ExpressionAssignment_2");
					put(grammarAccess.getReturnAccess().getExpressionAssignment_1(), "rule__Return__ExpressionAssignment_1");
					put(grammarAccess.getIfStatementAccess().getExpressionAssignment_2(), "rule__IfStatement__ExpressionAssignment_2");
					put(grammarAccess.getIfStatementAccess().getThenBlockAssignment_4(), "rule__IfStatement__ThenBlockAssignment_4");
					put(grammarAccess.getIfStatementAccess().getElseBlockAssignment_5_1(), "rule__IfStatement__ElseBlockAssignment_5_1");
					put(grammarAccess.getIfBlockAccess().getStatementsAssignment_0(), "rule__IfBlock__StatementsAssignment_0");
					put(grammarAccess.getTypedDeclarationAccess().getTypeAssignment_0(), "rule__TypedDeclaration__TypeAssignment_0");
					put(grammarAccess.getTypedDeclarationAccess().getNameAssignment_1(), "rule__TypedDeclaration__NameAssignment_1");
					put(grammarAccess.getAssignmentAccess().getRightAssignment_1_2(), "rule__Assignment__RightAssignment_1_2");
					put(grammarAccess.getSelectionExpressionAccess().getMemberAssignment_1_2(), "rule__SelectionExpression__MemberAssignment_1_2");
					put(grammarAccess.getSelectionExpressionAccess().getMethodinvocationAssignment_1_3_0(), "rule__SelectionExpression__MethodinvocationAssignment_1_3_0");
					put(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_3_1_0(), "rule__SelectionExpression__ArgsAssignment_1_3_1_0");
					put(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_3_1_1_1(), "rule__SelectionExpression__ArgsAssignment_1_3_1_1_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1(), "rule__TerminalExpression__ValueAssignment_0_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1(), "rule__TerminalExpression__ValueAssignment_1_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1(), "rule__TerminalExpression__ValueAssignment_2_1");
					put(grammarAccess.getTerminalExpressionAccess().getSymbolAssignment_6_1(), "rule__TerminalExpression__SymbolAssignment_6_1");
					put(grammarAccess.getTerminalExpressionAccess().getTypeAssignment_7_2(), "rule__TerminalExpression__TypeAssignment_7_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MiniJavaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MiniJavaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
