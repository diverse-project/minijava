package org.tetrabox.minijava.semantics.expressions

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.tetrabox.minijava.xtext.miniJava.Expression
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State

@Aspect(className=Expression)
class ExpressionAspect {

	def Value evaluateExpression(State state) {
		throw new RuntimeException('''evaluate should be overriden for type «_self.class.name»''')
	}
}