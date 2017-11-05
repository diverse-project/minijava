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
import org.tetrabox.minijava.xtext.miniJava.New
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

class MiniJavaTypeComputer {
	private static val factory = MiniJavaFactory.eINSTANCE
	public static val STRING_TYPE = factory.createClass => [name = 'stringType']
	public static val INT_TYPE = factory.createClass => [name = 'intType']
	public static val BOOLEAN_TYPE = factory.createClass => [name = 'booleanType']
	public static val NULL_TYPE = factory.createClass => [name = 'nullType']

	static val ep = MiniJavaPackage.eINSTANCE

	def getType(TypeRef r) {
		switch r {
			ClassRef: r.class_
			IntegerTypeRef: INT_TYPE
			BooleanTypeRef: BOOLEAN_TYPE
			StringTypeRef: STRING_TYPE
		}
	}

	def Class typeFor(Expression e) {
		switch (e) {
			New:
				e.type
			SymbolRef:
				e.symbol.typeRef.type
			FieldAccess:
				e.member.typeRef.type
			MethodCall:
				e.member.typeRef.type
			This:
				e.getContainerOfType(Class)
			Super:
				e.getContainerOfType(Class).getSuperclassOrObject
			Null:
				NULL_TYPE
			StringConstant:
				STRING_TYPE
			IntConstant:
				INT_TYPE
			BoolConstant:
				BOOLEAN_TYPE
		}
	}

	def getSuperclassOrObject(Class c) {
		c.superclass
	}

	def isPrimitive(Class c) {
		c.eResource === null
	}

	def Class expectedType(Expression e) {
		val c = e.eContainer
		val f = e.eContainingFeature
		switch (c) {
			VariableDeclaration:
				c.typeRef.type
			Assignment case f == ep.assignment_Value: {
				val assignee = c.assignee
				switch (assignee) {
					VariableDeclaration: assignee.typeRef.type
					FieldAccess: assignee.typeFor
				}
			}
			Return:
				c.getContainerOfType(Method).typeRef.type
			case f == ep.ifStatement_Expression:
				BOOLEAN_TYPE
			MethodCall case f == ep.methodCall_Args: {
				(c.member as Method).params.get(c.args.indexOf(e)).typeRef.type
			}
		}
	}
}
