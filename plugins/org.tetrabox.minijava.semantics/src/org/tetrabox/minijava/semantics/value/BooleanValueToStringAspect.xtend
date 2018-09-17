package org.tetrabox.minijava.semantics.value

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.tetrabox.minijava.dynamic.minijavadynamicdata.BooleanValue
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=BooleanValue)
class BooleanValueToStringAspect extends ValueToStringAspect {
	@OverrideAspectMethod
	def String customToString() {
		return _self.value.toString
	}
}