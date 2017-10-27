/**
 */
package org.tetrabox.minijava.xminijava.miniJava.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.minijava.xminijava.miniJava.ClassType;
import org.tetrabox.minijava.xminijava.miniJava.MiniJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xminijava.miniJava.impl.ClassTypeImpl#getClassref <em>Classref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassTypeImpl extends TypeImpl implements ClassType {
	/**
	 * The cached value of the '{@link #getClassref() <em>Classref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassref()
	 * @generated
	 * @ordered
	 */
	protected org.tetrabox.minijava.xminijava.miniJava.Class classref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.CLASS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.tetrabox.minijava.xminijava.miniJava.Class getClassref() {
		if (classref != null && classref.eIsProxy()) {
			InternalEObject oldClassref = (InternalEObject)classref;
			classref = (org.tetrabox.minijava.xminijava.miniJava.Class)eResolveProxy(oldClassref);
			if (classref != oldClassref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.CLASS_TYPE__CLASSREF, oldClassref, classref));
			}
		}
		return classref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.tetrabox.minijava.xminijava.miniJava.Class basicGetClassref() {
		return classref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassref(org.tetrabox.minijava.xminijava.miniJava.Class newClassref) {
		org.tetrabox.minijava.xminijava.miniJava.Class oldClassref = classref;
		classref = newClassref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CLASS_TYPE__CLASSREF, oldClassref, classref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiniJavaPackage.CLASS_TYPE__CLASSREF:
				if (resolve) return getClassref();
				return basicGetClassref();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MiniJavaPackage.CLASS_TYPE__CLASSREF:
				setClassref((org.tetrabox.minijava.xminijava.miniJava.Class)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MiniJavaPackage.CLASS_TYPE__CLASSREF:
				setClassref((org.tetrabox.minijava.xminijava.miniJava.Class)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MiniJavaPackage.CLASS_TYPE__CLASSREF:
				return classref != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassTypeImpl
