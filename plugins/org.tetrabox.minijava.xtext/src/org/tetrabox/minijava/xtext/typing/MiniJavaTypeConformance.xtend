package org.tetrabox.minijava.xtext.typing

import com.google.inject.Inject
import org.tetrabox.minijava.xtext.MiniJavaModelUtil
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration

import static org.tetrabox.minijava.xtext.typing.MiniJavaTypeComputer.*

class MiniJavaTypeConformance {

	@Inject extension MiniJavaModelUtil

	def isConformant(TypeDeclaration c1, TypeDeclaration c2) {	
		c1 === NULL_TYPE || // null can be assigned to everything
		c2 === NULL_TYPE || // null can be assigned to everything
		(c1 === c2) ||
		(c1.name == c2.name) ||
		conforancePrimivite(c1,c2) ||
		c1.isSubclassOf(c2)
	}

	def isSubclassOf(TypeDeclaration c1, TypeDeclaration c2) {
		c1.classHierarchy.contains(c2)
	}
	
	def conforancePrimivite(TypeDeclaration t1, TypeDeclaration t2) {
		if(t2 === DOUBLE_TYPE || t2 === FLOAT_TYPE) {
			return t1 === INT_TYPE || t1.isSubclassOf(INT_TYPE)
		}
		return false
	}
}
