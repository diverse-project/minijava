/**
 */
package org.tetrabox.minijava.dynamic.minijavadynamicdata.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.tetrabox.minijava.dynamic.minijavadynamicdata.Context;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Frame;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Instance;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.MinijavadynamicdataPackage;
import org.tetrabox.minijava.dynamic.minijavadynamicdata.Value;

import org.tetrabox.minijava.xtext.miniJava.MethodCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.FrameImpl#getMethodcall <em>Methodcall</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.FrameImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.FrameImpl#getChildFrame <em>Child Frame</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.FrameImpl#getParentFrame <em>Parent Frame</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.FrameImpl#getRootContext <em>Root Context</em>}</li>
 *   <li>{@link org.tetrabox.minijava.dynamic.minijavadynamicdata.impl.FrameImpl#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrameImpl extends MinimalEObjectImpl.Container implements Frame {
	/**
	 * The cached value of the '{@link #getMethodcall() <em>Methodcall</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodcall()
	 * @generated
	 * @ordered
	 */
	protected MethodCall methodcall;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected Instance instance;

	/**
	 * The cached value of the '{@link #getChildFrame() <em>Child Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildFrame()
	 * @generated
	 * @ordered
	 */
	protected Frame childFrame;

	/**
	 * The cached value of the '{@link #getRootContext() <em>Root Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootContext()
	 * @generated
	 * @ordered
	 */
	protected Context rootContext;

	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected Value returnValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinijavadynamicdataPackage.Literals.FRAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCall getMethodcall() {
		if (methodcall != null && methodcall.eIsProxy()) {
			InternalEObject oldMethodcall = (InternalEObject)methodcall;
			methodcall = (MethodCall)eResolveProxy(oldMethodcall);
			if (methodcall != oldMethodcall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MinijavadynamicdataPackage.FRAME__METHODCALL, oldMethodcall, methodcall));
			}
		}
		return methodcall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCall basicGetMethodcall() {
		return methodcall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodcall(MethodCall newMethodcall) {
		MethodCall oldMethodcall = methodcall;
		methodcall = newMethodcall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.FRAME__METHODCALL, oldMethodcall, methodcall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject)instance;
			instance = (Instance)eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MinijavadynamicdataPackage.FRAME__INSTANCE, oldInstance, instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(Instance newInstance) {
		Instance oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.FRAME__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame getChildFrame() {
		return childFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildFrame(Frame newChildFrame, NotificationChain msgs) {
		Frame oldChildFrame = childFrame;
		childFrame = newChildFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.FRAME__CHILD_FRAME, oldChildFrame, newChildFrame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildFrame(Frame newChildFrame) {
		if (newChildFrame != childFrame) {
			NotificationChain msgs = null;
			if (childFrame != null)
				msgs = ((InternalEObject)childFrame).eInverseRemove(this, MinijavadynamicdataPackage.FRAME__PARENT_FRAME, Frame.class, msgs);
			if (newChildFrame != null)
				msgs = ((InternalEObject)newChildFrame).eInverseAdd(this, MinijavadynamicdataPackage.FRAME__PARENT_FRAME, Frame.class, msgs);
			msgs = basicSetChildFrame(newChildFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.FRAME__CHILD_FRAME, newChildFrame, newChildFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame getParentFrame() {
		if (eContainerFeatureID() != MinijavadynamicdataPackage.FRAME__PARENT_FRAME) return null;
		return (Frame)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFrame(Frame newParentFrame, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFrame, MinijavadynamicdataPackage.FRAME__PARENT_FRAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFrame(Frame newParentFrame) {
		if (newParentFrame != eInternalContainer() || (eContainerFeatureID() != MinijavadynamicdataPackage.FRAME__PARENT_FRAME && newParentFrame != null)) {
			if (EcoreUtil.isAncestor(this, newParentFrame))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFrame != null)
				msgs = ((InternalEObject)newParentFrame).eInverseAdd(this, MinijavadynamicdataPackage.FRAME__CHILD_FRAME, Frame.class, msgs);
			msgs = basicSetParentFrame(newParentFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.FRAME__PARENT_FRAME, newParentFrame, newParentFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getRootContext() {
		return rootContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootContext(Context newRootContext, NotificationChain msgs) {
		Context oldRootContext = rootContext;
		rootContext = newRootContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.FRAME__ROOT_CONTEXT, oldRootContext, newRootContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootContext(Context newRootContext) {
		if (newRootContext != rootContext) {
			NotificationChain msgs = null;
			if (rootContext != null)
				msgs = ((InternalEObject)rootContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinijavadynamicdataPackage.FRAME__ROOT_CONTEXT, null, msgs);
			if (newRootContext != null)
				msgs = ((InternalEObject)newRootContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinijavadynamicdataPackage.FRAME__ROOT_CONTEXT, null, msgs);
			msgs = basicSetRootContext(newRootContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.FRAME__ROOT_CONTEXT, newRootContext, newRootContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnValue(Value newReturnValue, NotificationChain msgs) {
		Value oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.FRAME__RETURN_VALUE, oldReturnValue, newReturnValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(Value newReturnValue) {
		if (newReturnValue != returnValue) {
			NotificationChain msgs = null;
			if (returnValue != null)
				msgs = ((InternalEObject)returnValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinijavadynamicdataPackage.FRAME__RETURN_VALUE, null, msgs);
			if (newReturnValue != null)
				msgs = ((InternalEObject)newReturnValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinijavadynamicdataPackage.FRAME__RETURN_VALUE, null, msgs);
			msgs = basicSetReturnValue(newReturnValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinijavadynamicdataPackage.FRAME__RETURN_VALUE, newReturnValue, newReturnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MinijavadynamicdataPackage.FRAME__CHILD_FRAME:
				if (childFrame != null)
					msgs = ((InternalEObject)childFrame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinijavadynamicdataPackage.FRAME__CHILD_FRAME, null, msgs);
				return basicSetChildFrame((Frame)otherEnd, msgs);
			case MinijavadynamicdataPackage.FRAME__PARENT_FRAME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentFrame((Frame)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MinijavadynamicdataPackage.FRAME__CHILD_FRAME:
				return basicSetChildFrame(null, msgs);
			case MinijavadynamicdataPackage.FRAME__PARENT_FRAME:
				return basicSetParentFrame(null, msgs);
			case MinijavadynamicdataPackage.FRAME__ROOT_CONTEXT:
				return basicSetRootContext(null, msgs);
			case MinijavadynamicdataPackage.FRAME__RETURN_VALUE:
				return basicSetReturnValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MinijavadynamicdataPackage.FRAME__PARENT_FRAME:
				return eInternalContainer().eInverseRemove(this, MinijavadynamicdataPackage.FRAME__CHILD_FRAME, Frame.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MinijavadynamicdataPackage.FRAME__METHODCALL:
				if (resolve) return getMethodcall();
				return basicGetMethodcall();
			case MinijavadynamicdataPackage.FRAME__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
			case MinijavadynamicdataPackage.FRAME__CHILD_FRAME:
				return getChildFrame();
			case MinijavadynamicdataPackage.FRAME__PARENT_FRAME:
				return getParentFrame();
			case MinijavadynamicdataPackage.FRAME__ROOT_CONTEXT:
				return getRootContext();
			case MinijavadynamicdataPackage.FRAME__RETURN_VALUE:
				return getReturnValue();
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
			case MinijavadynamicdataPackage.FRAME__METHODCALL:
				setMethodcall((MethodCall)newValue);
				return;
			case MinijavadynamicdataPackage.FRAME__INSTANCE:
				setInstance((Instance)newValue);
				return;
			case MinijavadynamicdataPackage.FRAME__CHILD_FRAME:
				setChildFrame((Frame)newValue);
				return;
			case MinijavadynamicdataPackage.FRAME__PARENT_FRAME:
				setParentFrame((Frame)newValue);
				return;
			case MinijavadynamicdataPackage.FRAME__ROOT_CONTEXT:
				setRootContext((Context)newValue);
				return;
			case MinijavadynamicdataPackage.FRAME__RETURN_VALUE:
				setReturnValue((Value)newValue);
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
			case MinijavadynamicdataPackage.FRAME__METHODCALL:
				setMethodcall((MethodCall)null);
				return;
			case MinijavadynamicdataPackage.FRAME__INSTANCE:
				setInstance((Instance)null);
				return;
			case MinijavadynamicdataPackage.FRAME__CHILD_FRAME:
				setChildFrame((Frame)null);
				return;
			case MinijavadynamicdataPackage.FRAME__PARENT_FRAME:
				setParentFrame((Frame)null);
				return;
			case MinijavadynamicdataPackage.FRAME__ROOT_CONTEXT:
				setRootContext((Context)null);
				return;
			case MinijavadynamicdataPackage.FRAME__RETURN_VALUE:
				setReturnValue((Value)null);
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
			case MinijavadynamicdataPackage.FRAME__METHODCALL:
				return methodcall != null;
			case MinijavadynamicdataPackage.FRAME__INSTANCE:
				return instance != null;
			case MinijavadynamicdataPackage.FRAME__CHILD_FRAME:
				return childFrame != null;
			case MinijavadynamicdataPackage.FRAME__PARENT_FRAME:
				return getParentFrame() != null;
			case MinijavadynamicdataPackage.FRAME__ROOT_CONTEXT:
				return rootContext != null;
			case MinijavadynamicdataPackage.FRAME__RETURN_VALUE:
				return returnValue != null;
		}
		return super.eIsSet(featureID);
	}

} //FrameImpl
