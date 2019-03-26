/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTarget;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
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
 * An implementation of the model object '<em><b>Fault Failure Port function Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl.FaultFailurePort_functionTargetImpl#getFunctionPort <em>Function Port</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl.FaultFailurePort_functionTargetImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultFailurePort_functionTargetImpl extends MinimalEObjectImpl.Container implements FaultFailurePort_functionTarget {
	/**
	 * The cached value of the '{@link #getFunctionPort() <em>Function Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionPort functionPort;

	/**
	 * The cached value of the '{@link #getFunctionPrototype() <em>Function Prototype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPrototype()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPrototype> functionPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultFailurePort_functionTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.FAULT_FAILURE_PORT_FUNCTION_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort getFunctionPort() {
		if (functionPort != null && functionPort.eIsProxy()) {
			InternalEObject oldFunctionPort = (InternalEObject)functionPort;
			functionPort = (FunctionPort)eResolveProxy(oldFunctionPort);
			if (functionPort != oldFunctionPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PORT, oldFunctionPort, functionPort));
			}
		}
		return functionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort basicGetFunctionPort() {
		return functionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionPort(FunctionPort newFunctionPort) {
		FunctionPort oldFunctionPort = functionPort;
		functionPort = newFunctionPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PORT, oldFunctionPort, functionPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPrototype> getFunctionPrototype() {
		if (functionPrototype == null) {
			functionPrototype = new EObjectResolvingEList<FunctionPrototype>(FunctionPrototype.class, this, _instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PROTOTYPE);
		}
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PORT:
				if (resolve) return getFunctionPort();
				return basicGetFunctionPort();
			case _instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
				return getFunctionPrototype();
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
			case _instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PORT:
				setFunctionPort((FunctionPort)newValue);
				return;
			case _instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
				getFunctionPrototype().clear();
				getFunctionPrototype().addAll((Collection<? extends FunctionPrototype>)newValue);
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
			case _instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PORT:
				setFunctionPort((FunctionPort)null);
				return;
			case _instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
				getFunctionPrototype().clear();
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
			case _instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PORT:
				return functionPort != null;
			case _instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
				return functionPrototype != null && !functionPrototype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FaultFailurePort_functionTargetImpl
