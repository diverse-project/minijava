/**
 */
package org.tetrabox.minijava.xminijavamt.miniJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xminijavamt.miniJava.Method#getReturntype <em>Returntype</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xminijavamt.miniJava.Method#getName <em>Name</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xminijavamt.miniJava.Method#getParams <em>Params</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xminijavamt.miniJava.Method#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returntype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returntype</em>' containment reference.
	 * @see #setReturntype(Type)
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage#getMethod_Returntype()
	 * @model containment="true"
	 * @generated
	 */
	Type getReturntype();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xminijavamt.miniJava.Method#getReturntype <em>Returntype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returntype</em>' containment reference.
	 * @see #getReturntype()
	 * @generated
	 */
	void setReturntype(Type value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage#getMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xminijavamt.miniJava.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.minijava.xminijavamt.miniJava.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage#getMethod_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParams();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(MethodBody)
	 * @see org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage#getMethod_Body()
	 * @model containment="true"
	 * @generated
	 */
	MethodBody getBody();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xminijavamt.miniJava.Method#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(MethodBody value);

} // Method