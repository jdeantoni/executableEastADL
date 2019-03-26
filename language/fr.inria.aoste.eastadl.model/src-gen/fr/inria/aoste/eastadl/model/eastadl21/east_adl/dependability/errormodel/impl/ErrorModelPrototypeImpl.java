/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FailureOutPortProxy;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultInPortProxy;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTarget;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTarget;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelPrototypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelPrototypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelPrototypeImpl#getFunctionTarget <em>Function Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelPrototypeImpl#getHwTarget <em>Hw Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelPrototypeImpl#getExternalFault_proxy <em>External Fault proxy</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelPrototypeImpl#getFailure_proxy <em>Failure proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorModelPrototypeImpl extends EAElementImpl implements ErrorModelPrototype {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Identifiable target;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ErrorModelType type;

	/**
	 * The cached value of the '{@link #getFunctionTarget() <em>Function Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelPrototype_functionTarget> functionTarget;

	/**
	 * The cached value of the '{@link #getHwTarget() <em>Hw Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelPrototype_hwTarget> hwTarget;

	/**
	 * The cached value of the '{@link #getExternalFault_proxy() <em>External Fault proxy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFault_proxy()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultInPortProxy> externalFault_proxy;

	/**
	 * The cached value of the '{@link #getFailure_proxy() <em>Failure proxy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure_proxy()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureOutPortProxy> failure_proxy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModelPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrormodelPackage.Literals.ERROR_MODEL_PROTOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Identifiable)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Identifiable newTarget) {
		Identifiable oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ErrorModelType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ErrorModelType newType) {
		ErrorModelType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorModelPrototype_functionTarget> getFunctionTarget() {
		if (functionTarget == null) {
			functionTarget = new EObjectContainmentEList<ErrorModelPrototype_functionTarget>(ErrorModelPrototype_functionTarget.class, this, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET);
		}
		return functionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorModelPrototype_hwTarget> getHwTarget() {
		if (hwTarget == null) {
			hwTarget = new EObjectContainmentEList<ErrorModelPrototype_hwTarget>(ErrorModelPrototype_hwTarget.class, this, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__HW_TARGET);
		}
		return hwTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FaultInPortProxy> getExternalFault_proxy() {
		if (externalFault_proxy == null) {
			externalFault_proxy = new EObjectContainmentEList<FaultInPortProxy>(FaultInPortProxy.class, this, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__EXTERNAL_FAULT_PROXY);
		}
		return externalFault_proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureOutPortProxy> getFailure_proxy() {
		if (failure_proxy == null) {
			failure_proxy = new EObjectContainmentEList<FailureOutPortProxy>(FailureOutPortProxy.class, this, ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FAILURE_PROXY);
		}
		return failure_proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET:
				return ((InternalEList<?>)getFunctionTarget()).basicRemove(otherEnd, msgs);
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__HW_TARGET:
				return ((InternalEList<?>)getHwTarget()).basicRemove(otherEnd, msgs);
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__EXTERNAL_FAULT_PROXY:
				return ((InternalEList<?>)getExternalFault_proxy()).basicRemove(otherEnd, msgs);
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FAILURE_PROXY:
				return ((InternalEList<?>)getFailure_proxy()).basicRemove(otherEnd, msgs);
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
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET:
				return getFunctionTarget();
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__HW_TARGET:
				return getHwTarget();
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__EXTERNAL_FAULT_PROXY:
				return getExternalFault_proxy();
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FAILURE_PROXY:
				return getFailure_proxy();
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
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TARGET:
				setTarget((Identifiable)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TYPE:
				setType((ErrorModelType)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET:
				getFunctionTarget().clear();
				getFunctionTarget().addAll((Collection<? extends ErrorModelPrototype_functionTarget>)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__HW_TARGET:
				getHwTarget().clear();
				getHwTarget().addAll((Collection<? extends ErrorModelPrototype_hwTarget>)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__EXTERNAL_FAULT_PROXY:
				getExternalFault_proxy().clear();
				getExternalFault_proxy().addAll((Collection<? extends FaultInPortProxy>)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FAILURE_PROXY:
				getFailure_proxy().clear();
				getFailure_proxy().addAll((Collection<? extends FailureOutPortProxy>)newValue);
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
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TARGET:
				setTarget((Identifiable)null);
				return;
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TYPE:
				setType((ErrorModelType)null);
				return;
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET:
				getFunctionTarget().clear();
				return;
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__HW_TARGET:
				getHwTarget().clear();
				return;
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__EXTERNAL_FAULT_PROXY:
				getExternalFault_proxy().clear();
				return;
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FAILURE_PROXY:
				getFailure_proxy().clear();
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
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TARGET:
				return target != null;
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__TYPE:
				return type != null;
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET:
				return functionTarget != null && !functionTarget.isEmpty();
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__HW_TARGET:
				return hwTarget != null && !hwTarget.isEmpty();
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__EXTERNAL_FAULT_PROXY:
				return externalFault_proxy != null && !externalFault_proxy.isEmpty();
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FAILURE_PROXY:
				return failure_proxy != null && !failure_proxy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErrorModelPrototypeImpl
