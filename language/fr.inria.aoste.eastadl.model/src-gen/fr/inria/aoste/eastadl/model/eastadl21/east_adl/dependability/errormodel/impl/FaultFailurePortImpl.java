/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePort;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTarget;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Failure Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePortImpl#getFunctionTarget <em>Function Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePortImpl#getHwTarget <em>Hw Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FaultFailurePortImpl extends AnomalyImpl implements FaultFailurePort {
	/**
	 * The cached value of the '{@link #getFunctionTarget() <em>Function Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultFailurePort_functionTarget> functionTarget;

	/**
	 * The cached value of the '{@link #getHwTarget() <em>Hw Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultFailurePort_hwTarget> hwTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultFailurePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrormodelPackage.Literals.FAULT_FAILURE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FaultFailurePort_functionTarget> getFunctionTarget() {
		if (functionTarget == null) {
			functionTarget = new EObjectContainmentEList<FaultFailurePort_functionTarget>(FaultFailurePort_functionTarget.class, this, ErrormodelPackage.FAULT_FAILURE_PORT__FUNCTION_TARGET);
		}
		return functionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FaultFailurePort_hwTarget> getHwTarget() {
		if (hwTarget == null) {
			hwTarget = new EObjectContainmentEList<FaultFailurePort_hwTarget>(FaultFailurePort_hwTarget.class, this, ErrormodelPackage.FAULT_FAILURE_PORT__HW_TARGET);
		}
		return hwTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrormodelPackage.FAULT_FAILURE_PORT__FUNCTION_TARGET:
				return ((InternalEList<?>)getFunctionTarget()).basicRemove(otherEnd, msgs);
			case ErrormodelPackage.FAULT_FAILURE_PORT__HW_TARGET:
				return ((InternalEList<?>)getHwTarget()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErrormodelPackage.FAULT_FAILURE_PORT__FUNCTION_TARGET:
				return getFunctionTarget();
			case ErrormodelPackage.FAULT_FAILURE_PORT__HW_TARGET:
				return getHwTarget();
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
			case ErrormodelPackage.FAULT_FAILURE_PORT__FUNCTION_TARGET:
				getFunctionTarget().clear();
				getFunctionTarget().addAll((Collection<? extends FaultFailurePort_functionTarget>)newValue);
				return;
			case ErrormodelPackage.FAULT_FAILURE_PORT__HW_TARGET:
				getHwTarget().clear();
				getHwTarget().addAll((Collection<? extends FaultFailurePort_hwTarget>)newValue);
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
			case ErrormodelPackage.FAULT_FAILURE_PORT__FUNCTION_TARGET:
				getFunctionTarget().clear();
				return;
			case ErrormodelPackage.FAULT_FAILURE_PORT__HW_TARGET:
				getHwTarget().clear();
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
			case ErrormodelPackage.FAULT_FAILURE_PORT__FUNCTION_TARGET:
				return functionTarget != null && !functionTarget.isEmpty();
			case ErrormodelPackage.FAULT_FAILURE_PORT__HW_TARGET:
				return hwTarget != null && !hwTarget.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FaultFailurePortImpl
