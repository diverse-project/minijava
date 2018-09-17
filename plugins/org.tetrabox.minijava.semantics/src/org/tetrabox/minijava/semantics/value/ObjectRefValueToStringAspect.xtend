package org.tetrabox.minijava.semantics.value

import org.tetrabox.minijava.semantics.value.ValueToStringAspect
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.tetrabox.minijava.dynamic.minijavadynamicdata.ObjectRefValue
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=ObjectRefValue)
class ObjectRefValueToStringAspect extends ValueToStringAspect {
	@OverrideAspectMethod
	def String customToString() {
		return '''«_self.instance.type.name» {«FOR b : _self.instance.fieldbindings SEPARATOR "\n\t"»«b.field.name»: «b.value.customToString »«ENDFOR»}''';
	}
}