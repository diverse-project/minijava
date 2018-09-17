package org.tetrabox.minijava.semantics.value

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.tetrabox.minijava.dynamic.minijavadynamicdata.StringValue
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=StringValue)
class StringValueToStringAspect extends ValueToStringAspect {
	@OverrideAspectMethod
	def String customToString() {
		return _self.value.toString
	}
}