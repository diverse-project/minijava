package org.tetrabox.minijava.semantics.statements

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.xtext.miniJava.PrintStatement
import static extension org.tetrabox.minijava.semantics.utils.StateAspect.*
import static extension org.tetrabox.minijava.semantics.expressions.ExpressionAspect.*
import static extension org.tetrabox.minijava.semantics.value.ValueToStringAspect.*

@Aspect(className=PrintStatement)
class PrintStatementAspect extends StatementAspect {
	@OverrideAspectMethod
	@Step
	def void evaluateStatement(State state) {
		val string = _self.expression.evaluateExpression(state).customToString
		state.println(string)
	}
}