/*
 * generated by Xtext 2.10.0
 */
package org.tetrabox.minijava.xtext.ui.contentassist

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.StyledString
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.tetrabox.minijava.xtext.MiniJavaModelUtil
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.Member
import org.tetrabox.minijava.xtext.validation.MiniJavaAccessibility

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class MiniJavaProposalProvider extends AbstractMiniJavaProposalProvider {
	@Inject extension MiniJavaModelUtil
	@Inject extension MiniJavaAccessibility

	override getStyledDisplayString(EObject element, String qualifiedNameAsString, String shortName) {
		if (element instanceof Member) {
			new StyledString(element.memberAsStringWithType).append(
				new StyledString(" - " + (element.eContainer as Class).name, StyledString.QUALIFIER_STYLER))
		} else
			super.getStyledDisplayString(element, qualifiedNameAsString, shortName)
	}

	override void completeSJSelectionExpression_Member(EObject model, Assignment a, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(a.getTerminal() as CrossReference, context, acceptor) [ description |
			(description.getEObjectOrProxy as Member).isAccessibleFrom(model)
		]
	}
}
