package org.tetrabox.minijava.semantics.expressions

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.tetrabox.minijava.xtext.miniJava.Parameter
import static extension org.tetrabox.minijava.semantics.expressions.TypeRefAspect.*;

@Aspect(className=Parameter)
class ParameterAspect {
	def boolean compare(Parameter other) {
		return _self.name == other.name && _self.typeRef.compare(other.typeRef)
	}
}