package org.tetrabox.minijava.semantics.expressions

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.xtext.miniJava.SymbolRef
import static extension org.tetrabox.minijava.semantics.utils.StateAspect.*
import static extension org.tetrabox.minijava.semantics.utils.ContextAspect.*
import static extension org.tetrabox.minijava.semantics.utils.ValueAspect.*

@Aspect(className=SymbolRef)
class SymbolRefAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		state.findCurrentContext.findBinding(_self.symbol).value.copy
	}
}