/**
 */
package org.tetrabox.minijava.semantics.minijavadynamicdata;

import org.eclipse.emf.ecore.EObject;

import org.tetrabox.minijava.xtext.miniJava.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.semantics.minijavadynamicdata.Binding#getValue <em>Value</em>}</li>
 *   <li>{@link org.tetrabox.minijava.semantics.minijavadynamicdata.Binding#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.semantics.minijavadynamicdata.MinijavadynamicdataPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see org.tetrabox.minijava.semantics.minijavadynamicdata.MinijavadynamicdataPackage#getBinding_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.semantics.minijavadynamicdata.Binding#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see org.tetrabox.minijava.semantics.minijavadynamicdata.MinijavadynamicdataPackage#getBinding_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.semantics.minijavadynamicdata.Binding#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // Binding