package org.tetrabox.minijava.xtext.typing

import org.tetrabox.minijava.xtext.miniJava.Assignment
import org.tetrabox.minijava.xtext.miniJava.BoolConstant
import org.tetrabox.minijava.xtext.miniJava.BooleanTypeRef
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.ClassRef
import org.tetrabox.minijava.xtext.miniJava.Expression
import org.tetrabox.minijava.xtext.miniJava.IntConstant
import org.tetrabox.minijava.xtext.miniJava.IntegerTypeRef
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage
import org.tetrabox.minijava.xtext.miniJava.Null
import org.tetrabox.minijava.xtext.miniJava.Return
import org.tetrabox.minijava.xtext.miniJava.StringConstant
import org.tetrabox.minijava.xtext.miniJava.StringTypeRef
import org.tetrabox.minijava.xtext.miniJava.Super
import org.tetrabox.minijava.xtext.miniJava.SymbolRef
import org.tetrabox.minijava.xtext.miniJava.This
import org.tetrabox.minijava.xtext.miniJava.TypeRef
import org.tetrabox.minijava.xtext.miniJava.VariableDeclaration

import static extension org.eclipse.xtext.EcoreUtil2.*
import org.tetrabox.minijava.xtext.miniJava.FieldAccess
import org.tetrabox.minijava.xtext.miniJava.MethodCall
import org.tetrabox.minijava.xtext.miniJava.VoidTypeRef
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration
import org.tetrabox.minijava.xtext.miniJava.NewObject
import org.tetrabox.minijava.xtext.miniJava.Not
import org.tetrabox.minijava.xtext.miniJava.Neg
import org.tetrabox.minijava.xtext.miniJava.Or
import org.tetrabox.minijava.xtext.miniJava.And
import org.tetrabox.minijava.xtext.miniJava.Equality
import org.tetrabox.minijava.xtext.miniJava.SuperiorOrEqual
import org.tetrabox.minijava.xtext.miniJava.InferiorOrEqual
import org.tetrabox.minijava.xtext.miniJava.Plus
import org.tetrabox.minijava.xtext.miniJava.Minus
import org.tetrabox.minijava.xtext.miniJava.Multiplication
import org.tetrabox.minijava.xtext.miniJava.Division
import org.tetrabox.minijava.xtext.miniJava.ArrayAccess
import org.tetrabox.minijava.xtext.miniJava.ArrayLength
import org.tetrabox.minijava.xtext.miniJava.NewArray
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.Inequality
import org.tetrabox.minijava.xtext.miniJava.ArrayTypeRef
import java.util.HashMap
import java.util.Map
import org.tetrabox.minijava.xtext.miniJava.FloatTypeRef
import org.tetrabox.minijava.xtext.miniJava.CharTypeRef
import org.tetrabox.minijava.xtext.miniJava.ShortTypeRef
import org.tetrabox.minijava.xtext.miniJava.DoubleTypeRef
import org.tetrabox.minijava.xtext.miniJava.ByteTypeRef
import org.tetrabox.minijava.xtext.miniJava.LongTypeRef
import org.tetrabox.minijava.xtext.miniJava.LongConstant
import org.tetrabox.minijava.xtext.miniJava.DoubleConstant
import org.tetrabox.minijava.xtext.miniJava.Superior
import org.tetrabox.minijava.xtext.miniJava.Inferior

class MiniJavaTypeComputer {
	protected static val factory = MiniJavaFactory.eINSTANCE
	
	public static val STRING_TYPE = factory.createClass => [name = 'stringType']
	public static val CHAR_TYPE = factory.createClass => [name = 'charType']
	public static val BOOLEAN_TYPE = factory.createClass => [name = 'booleanType']
	
	public static val LONG_TYPE = factory.createClass => [name = 'longType']
	public static val INT_TYPE = factory.createClass => [
		name = 'intType'
		superClass = LONG_TYPE
	]
	public static val SHORT_TYPE = factory.createClass => [
		name = 'shortType'
		superClass = INT_TYPE
	]
	public static val BYTE_TYPE = factory.createClass => [
		name = 'byteType'
		superClass = SHORT_TYPE
	]
	
	public static val DOUBLE_TYPE = factory.createClass => [name = 'doubleType']
	public static val FLOAT_TYPE = factory.createClass => [
		name = 'floatType'
		superClass = DOUBLE_TYPE
	]
	
	
	public static val STRING_ARRAY_TYPE = factory.createClass => [name = 'stringArrayType']
	public static val INT_ARRAY_TYPE = factory.createClass => [name = 'intArrayType']
	public static val BOOLEAN_ARRAY_TYPE = factory.createClass => [name = 'booleanArrayType']
	public static val BYTE_ARRAY_TYPE = factory.createClass => [name = 'byteArrayType']
	public static val LONG_ARRAY_TYPE = factory.createClass => [name = 'longArrayType']
	public static val DOUBLE_ARRAY_TYPE = factory.createClass => [name = 'doubleArrayType']
	public static val SHORT_ARRAY_TYPE = factory.createClass => [name = 'shortArrayType']
	public static val FLOAT_ARRAY_TYPE = factory.createClass => [name = 'floatArrayType']
	public static val CHAR_ARRAY_TYPE = factory.createClass => [name = 'charArrayType']
	
	public static val NULL_TYPE = factory.createClass => [name = 'nullType']
	
	public static val UNRECOGNIZED_TYPE = factory.createClass => [name = 'unrecognizedType']
	
	// class name -> class array type
	public static val Map<String, Class> CLASS_ARRAY_TYPE = new HashMap
	
	// class array type name -> class
	public static val Map<String, TypeDeclaration> CLASS_ARRAY_TYPE_REVERSE = new HashMap

	protected static val ep = MiniJavaPackage.eINSTANCE

	def TypeDeclaration getType(TypeRef r) {
		switch r {
			ClassRef: r.referencedClass
			IntegerTypeRef: INT_TYPE
			BooleanTypeRef: BOOLEAN_TYPE
			StringTypeRef: STRING_TYPE
			VoidTypeRef : NULL_TYPE
			FloatTypeRef: FLOAT_TYPE
			CharTypeRef: CHAR_TYPE
			ShortTypeRef: SHORT_TYPE
			DoubleTypeRef: DOUBLE_TYPE
			ByteTypeRef: BYTE_TYPE
			LongTypeRef: LONG_TYPE
			ArrayTypeRef:{
				switch(r.typeRef) {
					IntegerTypeRef: INT_ARRAY_TYPE
					BooleanTypeRef: BOOLEAN_ARRAY_TYPE
					StringTypeRef: STRING_ARRAY_TYPE
					FloatTypeRef: FLOAT_ARRAY_TYPE
					CharTypeRef: CHAR_ARRAY_TYPE
					ShortTypeRef: SHORT_ARRAY_TYPE
					DoubleTypeRef: DOUBLE_ARRAY_TYPE
					ByteTypeRef: BYTE_ARRAY_TYPE
					LongTypeRef: LONG_ARRAY_TYPE
					ClassRef: getOrCreateClassRefType(r.typeRef as ClassRef)
				}
			}
			default: UNRECOGNIZED_TYPE
		}
	}
	
	protected def getOrCreateClassRefType(ClassRef classRef) {
		val className = classRef.referencedClass.name
		var res = CLASS_ARRAY_TYPE.get(className)
		if(res === null) {
			res = factory.createClass => [name = '''«className»ArrayType''']
			CLASS_ARRAY_TYPE.put(className, res)
			CLASS_ARRAY_TYPE_REVERSE.put('''«className»ArrayType''', classRef.referencedClass)
		}
		return res
	}

	def dispatch TypeDeclaration typeFor(Expression e) {
		switch (e) {
			SymbolRef:
				e.symbol.typeRef.type
			FieldAccess:
				e.field.typeRef.type
			MethodCall:
				e.method.typeRef.type
			NewObject:
				e.type
			This:
				e.getContainerOfType(Class)
			Super:
				e.getContainerOfType(Class).superClass
			Null:
				NULL_TYPE
			StringConstant:
				STRING_TYPE
			IntConstant: {
				if(e.value >= Byte.MIN_VALUE && e.value <= Byte.MAX_VALUE) {
					return BYTE_TYPE
				}
				if(e.value >= Short.MIN_VALUE && e.value <= Short.MAX_VALUE) {
					return SHORT_TYPE
				}
				if(e.value >= Integer.MIN_VALUE && e.value <= Integer.MAX_VALUE) {
					return INT_TYPE
				}
				return LONG_TYPE
			}
			LongConstant:
				LONG_TYPE
			DoubleConstant: {
				if(e.value >= Float.MIN_VALUE && e.value <= Float.MAX_VALUE) {
					return FLOAT_TYPE
				}
				return DOUBLE_TYPE
			}
			BoolConstant:
				BOOLEAN_TYPE
			Not:
				BOOLEAN_TYPE
			Neg:
				INT_TYPE
			Or:
				BOOLEAN_TYPE
			And:
				BOOLEAN_TYPE
			Equality:
				BOOLEAN_TYPE
			Inequality:
				BOOLEAN_TYPE
			SuperiorOrEqual:
				BOOLEAN_TYPE
			Superior:
				BOOLEAN_TYPE
			Inferior:
				BOOLEAN_TYPE
			InferiorOrEqual:
				BOOLEAN_TYPE
			Minus:
				INT_TYPE
			Multiplication:
				INT_TYPE
			Division:
				INT_TYPE
			ArrayAccess: {
				switch name: e.object.typeFor.name {
					case "stringArrayType": STRING_TYPE
					case "intArrayType": INT_TYPE
					case "booleanArrayType": BOOLEAN_TYPE
					default: CLASS_ARRAY_TYPE_REVERSE.get(name)
				}	
			}
			ArrayLength:
				INT_TYPE
			NewArray:
				switch(e.type) {
					IntegerTypeRef: INT_ARRAY_TYPE
					BooleanTypeRef: BOOLEAN_ARRAY_TYPE
					StringTypeRef: STRING_ARRAY_TYPE
					ClassRef: getOrCreateClassRefType(e.type as ClassRef)
				}
			default: UNRECOGNIZED_TYPE	
		}
	}
	
	def dispatch TypeDeclaration typeFor(Plus e) {
		val leftType = e.left.typeFor
		val rightType = e.right.typeFor
		
		if(leftType === STRING_TYPE || rightType === STRING_TYPE) {
			return STRING_TYPE
		} 
			
		if(leftType === DOUBLE_TYPE || rightType === DOUBLE_TYPE) {
			return DOUBLE_TYPE
		}
		
		if(leftType === FLOAT_TYPE || rightType === FLOAT_TYPE) {
			return FLOAT_TYPE
		}
		
		if(leftType === LONG_TYPE || rightType === LONG_TYPE) {
			return LONG_TYPE
		}
		
		if(leftType === INT_TYPE || rightType === INT_TYPE) {
			return INT_TYPE
		}
		
		if(leftType === SHORT_TYPE || rightType === SHORT_TYPE) {
			return SHORT_TYPE
		}
		
		return BYTE_TYPE
	}


	def isPrimitive(TypeDeclaration c) {
		c.eResource === null
	}

	def TypeDeclaration expectedType(Expression e) {
		val c = e.eContainer
		val f = e.eContainingFeature
		
		switch (c) {
			VariableDeclaration:
				c.typeRef.type
			Assignment case f == ep.assignment_Value: {
				val assignee = c.assignee
				switch (assignee) {
					VariableDeclaration:assignee.typeRef.type
					FieldAccess: assignee.typeFor
				}
			}
			Return:
				c.getContainerOfType(Method).typeRef.type
			case f == ep.ifStatement_Expression:
				BOOLEAN_TYPE
			MethodCall case f == ep.methodCall_Args: {
				if (c.method !== null) {
				if (c.method.params.size > c.args.indexOf(e))
					c.method.params.get(c.args.indexOf(e)).typeRef.type
				}
			}
			NewObject case f == ep.newObject_Args: {
				c.type.members.filter(Method).findFirst[it.name === null && it.params.size === c.args.size].params.get(c.args.indexOf(e)).typeRef.type
			}
			Field: {
				c.typeRef.type
			}
		}
	}
	
	def boolean isArray(TypeDeclaration typeDcl) {
		typeDcl === STRING_ARRAY_TYPE || 
		typeDcl === BOOLEAN_ARRAY_TYPE || 
		typeDcl === INT_ARRAY_TYPE ||
		CLASS_ARRAY_TYPE_REVERSE.containsKey(typeDcl.name)
	}
}
