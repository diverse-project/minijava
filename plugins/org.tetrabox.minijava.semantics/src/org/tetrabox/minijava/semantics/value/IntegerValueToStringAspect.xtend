package org.tetrabox.minijava.semantics.value

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.tetrabox.minijava.dynamic.minijavadynamicdata.IntegerValue
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=IntegerValue)
class IntegerValueToStringAspect extends ValueToStringAspect {
	@OverrideAspectMethod
	def String customToString() {
		return _self.value.toString
	}
}