package org.tetrabox.minijava.semantics.expressions

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.tetrabox.minijava.dynamic.minijavadynamicdata.BooleanValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.IntegerValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataFactory
import org.tetrabox.minijava.dynamic.minijavadynamicdata.NullValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.ObjectRefValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.dynamic.minijavadynamicdata.StringValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.xtext.miniJava.Equality

@Aspect(className=Equality)
class EqualityAspect extends ExpressionAspect {

	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = _self.left.evaluateExpression(state)
		val right = _self.right.evaluateExpression(state)

		val boolean result = if (left instanceof IntegerValue) {
				left.value === (right as IntegerValue).value
			} else if (left instanceof StringValue) {
				left.value == (right as StringValue).value
			} else if (left instanceof BooleanValue) {
				left.value === (right as BooleanValue).value
			} else if (left instanceof NullValue) {
				right instanceof NullValue
			} else if (left instanceof ObjectRefValue) {
				(right instanceof ObjectRefValue) && left.instance === (right as ObjectRefValue).instance
			} else {
				throw new RuntimeException('''Type unsupported for equality operator: «left.class»''')
			}

		return MinijavadynamicdataFactory::eINSTANCE.createBooleanValue => [
			value = result
		]
	}
}