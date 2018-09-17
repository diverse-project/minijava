package org.tetrabox.minijava.semantics.expressions

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.tetrabox.minijava.dynamic.minijavadynamicdata.ArrayRefValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.IntegerValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.xtext.miniJava.ArrayAccess
import static extension org.tetrabox.minijava.semantics.utils.ValueAspect.copy

@Aspect(className=ArrayAccess)
class ArrayAccessAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val array = (_self.object.evaluateExpression(state) as ArrayRefValue).instance
		val index = (_self.index.evaluateExpression(state) as IntegerValue).value
		return array.value.get(index).copy
	}

}