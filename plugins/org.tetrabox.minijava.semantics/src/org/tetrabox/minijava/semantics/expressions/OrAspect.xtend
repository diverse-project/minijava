package org.tetrabox.minijava.semantics.expressions

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.tetrabox.minijava.dynamic.minijavadynamicdata.BooleanValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataFactory
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.xtext.miniJava.Or

@Aspect(className=Or)
class OrAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = _self.left.evaluateExpression(state)
		val right = _self.right.evaluateExpression(state)
		if (left instanceof BooleanValue) {
			if (right instanceof BooleanValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
					value = left.value || right.value
				]
			}
		}
		throw new RuntimeException('''Unsupported or operands: «left» || «right».''')
	}
}