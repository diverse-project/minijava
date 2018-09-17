package org.tetrabox.minijava.semantics.expressions

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.tetrabox.minijava.xtext.miniJava.Neg
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.dynamic.minijavadynamicdata.IntegerValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataFactory
import org.tetrabox.minijava.dynamic.minijavadynamicdata.LongValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.ShortValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.ByteValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.DoubleValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.FloatValue

@Aspect(className=Neg)
class NegAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val evaluated = _self.expression.evaluateExpression(state)
		
		if(evaluated instanceof IntegerValue) {
			return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [value = -evaluated.value]
		} else if(evaluated instanceof LongValue) {
			return MinijavadynamicdataFactory::eINSTANCE.createLongValue => [value = -evaluated.value]
		} else if(evaluated instanceof ShortValue) {
			val short valShort = ((-evaluated.value) as short)
			return MinijavadynamicdataFactory::eINSTANCE.createShortValue => [value = valShort]
		} else if(evaluated instanceof ByteValue) {
			val byte valByte = ((-evaluated.value) as byte)
			return MinijavadynamicdataFactory::eINSTANCE.createByteValue => [value = valByte]
		} else if (evaluated instanceof DoubleValue) {
			return MinijavadynamicdataFactory::eINSTANCE.createDoubleValue => [value = -evaluated.value]
		} else if (evaluated instanceof FloatValue) {
			return MinijavadynamicdataFactory::eINSTANCE.createFloatValue => [value = -evaluated.value]
		} else {
			throw new RuntimeException("Unrecognized value type: " + evaluated.getClass().name)
		}
		
	}
}