/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.minijava.xtext.scoping

import java.util.LinkedList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.tetrabox.minijava.xtext.lookup.AuxiliaryFunctions
import org.tetrabox.minijava.xtext.miniJava.Class
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.Program
import org.tetrabox.minijava.xtext.miniJava.Selection
import org.tetrabox.minijava.xtext.typing.MiniJavaTypeSystem
import org.tetrabox.minijava.xtext.typing.TypeResult
import org.tetrabox.minijava.xtext.util.ModelPrinter
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MiniJavaScopeProvider extends AbstractDeclarativeScopeProvider {

	// static ModelPrinter modelPrinter = new ModelPrinter();
	MiniJavaTypeSystem typeSystem = new MiniJavaTypeSystem();

	AuxiliaryFunctions auxiliaryFunctions = new AuxiliaryFunctions();

	def static void print(EObject o, String prefix) {
		System.out.println(prefix + new ModelPrinter().doSwitch(o));
	}

	def public IScope scope_Variable_variable(Method meth, EReference ref) {
		return Scopes.scopeFor(meth.getParams());
	}


	/**
	 * Computes all the fields available in the class of the receiver
	 * in a field selection expression
	 * 
	 * @param sel
	 * @param ref
	 * @return the scope containing all the fields reachable
	 */
	def public IScope scope_FieldSelection_name(Selection sel, EReference ref) {
		val TypeResult selectionExpressionType = typeSystem.getType(sel.getReceiver());
		val Class receiverType = selectionExpressionType.getClassref();
		if (receiverType !== null) {
			return Scopes.scopeFor(auxiliaryFunctions.getFields(receiverType));
		}

		// do not return null, otherwise the default implementation of scope
		// will use all the Fields available in the resource.
		// return an empty scope instead
		return Scopes.scopeFor(new LinkedList<EObject>());
	}

	/**
	 * Computes all the methods available in the class of the receiver
	 * in a field selection expression
	 * 
	 * @param sel
	 * @param ref
	 * @return the scope containing all the fields reachable
	 */
	def public IScope scope_MethodCall_name(Selection sel, EReference ref) {
		val TypeResult selectionExpressionType = typeSystem.getType(sel.getReceiver());
		val Class receiverType = selectionExpressionType.getClassref();
		if (receiverType !== null) {
			return Scopes.scopeFor(auxiliaryFunctions.getMethods(receiverType));
		}

		// do not return null, otherwise the default implementation of scope
		// will use all the Methods available in the resource.
		// return an empty scope instead
		return Scopes.scopeFor(new LinkedList<EObject>());
	}

	/**
	 * In each part of the program, the scope for classes is the list
	 * of all the classes available in the program (including the implicit one)
	 * 
	 * @param p
	 * @param type
	 * @return
	 */
	def public IScope scope_Class(Program p, EReference type) {
		return Scopes.scopeFor(auxiliaryFunctions.collectClasses(p));
	}

	override public IScope getScope(EObject context, EReference reference) {
		val IScope scope = super.getScope(context, reference);
		return scope
	}

}