/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTarget;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model Prototype function Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl.ErrorModelPrototype_functionTargetImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl.ErrorModelPrototype_functionTargetImpl#getFunctionPrototype_context <em>Function Prototype context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorModelPrototype_functionTargetImpl extends MinimalEObjectImpl.Container implements ErrorModelPrototype_functionTarget {
	/**
	 * The cached value of the '{@link #getFunctionPrototype() <em>Function Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPrototype()
	 * @generated
	 * @ordered
	 */
	protected FunctionPrototype functionPrototype;

	/**
	 * The cached value of the '{@link #getFunctionPrototype_context() <em>Function Prototype context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPrototype_context()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPrototype> functionPrototype_context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModelPrototype_functionTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPrototype getFunctionPrototype() {
		if (functionPrototype != null && functionPrototype.eIsProxy()) {
			InternalEObject oldFunctionPrototype = (InternalEObject)functionPrototype;
			functionPrototype = (FunctionPrototype)eResolveProxy(oldFunctionPrototype);
			if (functionPrototype != oldFunctionPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
			}
		}
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPrototype basicGetFunctionPrototype() {
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionPrototype(FunctionPrototype newFunctionPrototype) {
		FunctionPrototype oldFunctionPrototype = functionPrototype;
		functionPrototype = newFunctionPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPrototype> getFunctionPrototype_context() {
		if (functionPrototype_context == null) {
			functionPrototype_context = new EObjectResolvingEList<FunctionPrototype>(FunctionPrototype.class, this, _instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE_CONTEXT);
		}
		return functionPrototype_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
				if (resolve) return getFunctionPrototype();
				return basicGetFunctionPrototype();
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE_CONTEXT:
				return getFunctionPrototype_context();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
				setFunctionPrototype((FunctionPrototype)newValue);
				return;
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE_CONTEXT:
				getFunctionPrototype_context().clear();
				getFunctionPrototype_context().addAll((Collection<? extends FunctionPrototype>)newValue);
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
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
				setFunctionPrototype((FunctionPrototype)null);
				return;
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE_CONTEXT:
				getFunctionPrototype_context().clear();
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
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
				return functionPrototype != null;
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE_CONTEXT:
				return functionPrototype_context != null && !functionPrototype_context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErrorModelPrototype_functionTargetImpl
