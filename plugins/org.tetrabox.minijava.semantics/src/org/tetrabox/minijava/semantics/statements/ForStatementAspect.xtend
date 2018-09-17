package org.tetrabox.minijava.semantics.statements

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.tetrabox.minijava.dynamic.minijavadynamicdata.BooleanValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.xtext.miniJava.ForStatement
import static extension org.tetrabox.minijava.semantics.utils.StateAspect.*
import static extension org.tetrabox.minijava.semantics.expressions.ExpressionAspect.*

@Aspect(className=ForStatement)
class ForStatementAspect extends StatementAspect {
	@OverrideAspectMethod
	@Step
	def void evaluateStatement(State state) {
		state.pushNewContext
		for (_self.declaration.evaluateStatement(state); (_self.condition.evaluateExpression(state) as BooleanValue).
			value; _self.progression.evaluateStatement(state)) {
			_self.block.evaluateStatement(state)
		}
		state.popCurrentContext
	}
}