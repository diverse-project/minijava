package org.tetrabox.minijava.semantics.expressions

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.tetrabox.minijava.xtext.miniJava.Multiplication
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value
import org.tetrabox.minijava.dynamic.minijavadynamicdata.State
import org.tetrabox.minijava.dynamic.minijavadynamicdata.DoubleValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataFactory
import org.tetrabox.minijava.dynamic.minijavadynamicdata.FloatValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.IntegerValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.LongValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.ShortValue
import org.tetrabox.minijava.dynamic.minijavadynamicdata.ByteValue

@Aspect(className=Multiplication)
class MultiplicationAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def Value evaluateExpression(State state) {
		val left = _self.left.evaluateExpression(state)
		val right = _self.right.evaluateExpression(state)
		
		if(left instanceof DoubleValue) {
			if(right instanceof DoubleValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createDoubleValue => [value = left.value * right.value]
			} else if(right instanceof FloatValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createDoubleValue => [value = left.value * right.value]
			} else if(right instanceof IntegerValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createDoubleValue => [value = left.value * right.value]
			} else if(right instanceof LongValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createDoubleValue => [value = left.value * right.value]
			} else if(right instanceof ShortValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createDoubleValue => [value = left.value * right.value]
			} else if(right instanceof ByteValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createDoubleValue => [value = left.value * right.value]
			} else {
				throw new RuntimeException("Unrecognized value type: " + right.getClass().name)
			}
		} else if(left instanceof FloatValue) {
			if(right instanceof DoubleValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createDoubleValue => [value = left.value * right.value]
			} else if(right instanceof FloatValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createFloatValue => [value = left.value * right.value]
			} else if(right instanceof IntegerValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createFloatValue => [value = left.value * right.value]
			} else if(right instanceof LongValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createFloatValue => [value = left.value * right.value]
			} else if(right instanceof ShortValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createFloatValue => [value = left.value * right.value]
			} else if(right instanceof ByteValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createFloatValue => [value = left.value * right.value]
			} else {
				throw new RuntimeException("Unrecognized value type: " + right.getClass().name)
			}
		} else if(left instanceof LongValue) {
			if(right instanceof DoubleValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createDoubleValue => [value = left.value * right.value]
			} else if(right instanceof FloatValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createFloatValue => [value = left.value * right.value]
			} else if(right instanceof IntegerValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createLongValue => [value = left.value * right.value]
			} else if(right instanceof LongValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createLongValue => [value = left.value * right.value]
			} else if(right instanceof ShortValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createLongValue => [value = left.value * right.value]
			} else if(right instanceof ByteValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createLongValue => [value = left.value * right.value]
			} else {
				throw new RuntimeException("Unrecognized value type: " + right.getClass().name)
			}
		} else if(left instanceof IntegerValue) {
			if(right instanceof DoubleValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createDoubleValue => [value = left.value * right.value]
			} else if(right instanceof FloatValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createFloatValue => [value = left.value * right.value]
			} else if(right instanceof IntegerValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [value = left.value * right.value]
			} else if(right instanceof LongValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createLongValue => [value = left.value * right.value]
			} else if(right instanceof ShortValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [value = left.value * right.value]
			} else if(right instanceof ByteValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [value = left.value * right.value]
			} else {
				throw new RuntimeException("Unrecognized value type: " + right.getClass().name)
			}
		} else if(left instanceof ShortValue) {
			if(right instanceof DoubleValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createDoubleValue => [value = left.value * right.value]
			} else if(right instanceof FloatValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createFloatValue => [value = left.value * right.value]
			} else if(right instanceof IntegerValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [value = left.value * right.value]
			} else if(right instanceof LongValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createLongValue => [value = left.value * right.value]
			} else if(right instanceof ShortValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createShortValue => [value = ((left.value * right.value) as short)]
			} else if(right instanceof ByteValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createShortValue => [value = ((left.value * right.value) as short)]
			} else {
				throw new RuntimeException("Unrecognized value type: " + right.getClass().name)
			}
		} else if(left instanceof ByteValue) {
			if(right instanceof DoubleValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createDoubleValue => [value = left.value * right.value]
			} else if(right instanceof FloatValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createFloatValue => [value = left.value * right.value]
			} else if(right instanceof IntegerValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createIntegerValue => [value = left.value * right.value]
			} else if(right instanceof LongValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createLongValue => [value = left.value * right.value]
			} else if(right instanceof ShortValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createShortValue => [value = ((left.value * right.value) as short)]
			} else if(right instanceof ByteValue) {
				return MinijavadynamicdataFactory::eINSTANCE.createByteValue => [value = ((left.value * right.value) as byte)]
			} else {
				throw new RuntimeException("Unrecognized value type: " + right.getClass().name)
			}
		} else {
			throw new RuntimeException("Unrecognized value type: " + left.getClass().name)
		}
	}
}