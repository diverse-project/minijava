/**
 *
 * $Id$
 */
package org.tetrabox.minijava.dynamic.minijavadynamicdata.validation;

import org.eclipse.emf.common.util.EList;

import org.tetrabox.minijava.dynamic.minijavadynamicdata.Context;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.SymbolBinding;

/**
 * A sample validator interface for {@link org.tetrabox.minijava.dynamic.minijavadynamicdata.Context}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ContextValidator {
	boolean validate();

	boolean validateBindings(EList<SymbolBinding> value);
	boolean validateParentContext(Context value);
	boolean validateChildContext(Context value);
}
