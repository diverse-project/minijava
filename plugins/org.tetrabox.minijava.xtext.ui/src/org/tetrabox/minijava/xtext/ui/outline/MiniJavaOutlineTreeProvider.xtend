/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.minijava.xtext.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import org.tetrabox.minijava.xtext.miniJava.Expression
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.Program
import org.tetrabox.minijava.xtext.miniJava.TypedElement
import org.tetrabox.minijava.xtext.miniJava.Class

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class MiniJavaOutlineTreeProvider extends DefaultOutlineTreeProvider {

	def protected void _createChildren(DocumentRootNode parentNode, Program program) {
		for (Class c : program.getClasses()) {
			createNode(parentNode, c);
		}
		if (program.getMain() !== null)
			createNode(parentNode, program.getMain());
	}

	/**
	 * Don't show children of typed elements so to avoid showing the type of a
	 * field as a child (we're using our custom label provider anyway)
	 */
	def protected boolean _isLeaf(TypedElement o) {
		return true;
	}

	def protected boolean _isLeaf(Method o) {
		return true;
	}

	def protected boolean _isLeaf(Expression o) {
		return true;
	}
}