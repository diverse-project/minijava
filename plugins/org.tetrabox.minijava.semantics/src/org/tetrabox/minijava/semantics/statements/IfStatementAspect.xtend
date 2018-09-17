package org.tetrabox.minijava.semantics.statements

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.tetrabox.minijava.dynamic.minijavadynamicdata.BooleanValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.xtext.miniJava.IfStatement
import static extension org.tetrabox.minijava.semantics.expressions.ExpressionAspect.*

@Aspect(className=IfStatement)
class IfStatementAspect extends StatementAspect {
	@OverrideAspectMethod
	@Step
	def void evaluateStatement(State state) {
		if ((_self.expression.evaluateExpression(state) as BooleanValue).value) {
			_self.thenBlock.evaluateStatement(state)
		} else if (_self.elseBlock !== null) {
			_self.elseBlock.evaluateStatement(state)
		}
	}
}