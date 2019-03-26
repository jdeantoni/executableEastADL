/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorBehavior;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.FailureOutPort;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.FaultInPort;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototype;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionType;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl#getGenericDescription <em>Generic Description</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl#getErrorBehaviorDescription <em>Error Behavior Description</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl#getHwTarget <em>Hw Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl#getFaultFailureConnector <em>Fault Failure Connector</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl#getExternalFault <em>External Fault</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl#getPart <em>Part</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl#getInternalFault <em>Internal Fault</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl#getProcessFault <em>Process Fault</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorModelTypeImpl extends TraceableSpecificationImpl implements ErrorModelType {
	/**
	 * The default value of the '{@link #getGenericDescription() <em>Generic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERIC_DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getGenericDescription() <em>Generic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericDescription()
	 * @generated
	 * @ordered
	 */
	protected String genericDescription = GENERIC_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Generic Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean genericDescriptionESet;

	/**
	 * The cached value of the '{@link #getErrorBehaviorDescription() <em>Error Behavior Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorBehaviorDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorBehavior> errorBehaviorDescription;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionType> target;

	/**
	 * The cached value of the '{@link #getHwTarget() <em>Hw Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareComponentType> hwTarget;

	/**
	 * The cached value of the '{@link #getFaultFailureConnector() <em>Fault Failure Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultFailureConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultFailurePropagationLink> faultFailureConnector;

	/**
	 * The cached value of the '{@link #getExternalFault() <em>External Fault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFault()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultInPort> externalFault;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelPrototype> part;

	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureOutPort> failure;

	/**
	 * The cached value of the '{@link #getInternalFault() <em>Internal Fault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFault()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalFaultPrototype> internalFault;

	/**
	 * The cached value of the '{@link #getProcessFault() <em>Process Fault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessFault()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessFaultPrototype> processFault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrormodelPackage.Literals.ERROR_MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenericDescription() {
		return genericDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericDescription(String newGenericDescription) {
		String oldGenericDescription = genericDescription;
		genericDescription = newGenericDescription;
		boolean oldGenericDescriptionESet = genericDescriptionESet;
		genericDescriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.ERROR_MODEL_TYPE__GENERIC_DESCRIPTION, oldGenericDescription, genericDescription, !oldGenericDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGenericDescription() {
		String oldGenericDescription = genericDescription;
		boolean oldGenericDescriptionESet = genericDescriptionESet;
		genericDescription = GENERIC_DESCRIPTION_EDEFAULT;
		genericDescriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErrormodelPackage.ERROR_MODEL_TYPE__GENERIC_DESCRIPTION, oldGenericDescription, GENERIC_DESCRIPTION_EDEFAULT, oldGenericDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGenericDescription() {
		return genericDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorBehavior> getErrorBehaviorDescription() {
		if (errorBehaviorDescription == null) {
			errorBehaviorDescription = new EObjectContainmentWithInverseEList<ErrorBehavior>(ErrorBehavior.class, this, ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION, ErrormodelPackage.ERROR_BEHAVIOR__OWNER);
		}
		return errorBehaviorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionType> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<FunctionType>(FunctionType.class, this, ErrormodelPackage.ERROR_MODEL_TYPE__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareComponentType> getHwTarget() {
		if (hwTarget == null) {
			hwTarget = new EObjectResolvingEList<HardwareComponentType>(HardwareComponentType.class, this, ErrormodelPackage.ERROR_MODEL_TYPE__HW_TARGET);
		}
		return hwTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FaultFailurePropagationLink> getFaultFailureConnector() {
		if (faultFailureConnector == null) {
			faultFailureConnector = new EObjectContainmentEList<FaultFailurePropagationLink>(FaultFailurePropagationLink.class, this, ErrormodelPackage.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR);
		}
		return faultFailureConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FaultInPort> getExternalFault() {
		if (externalFault == null) {
			externalFault = new EObjectContainmentEList<FaultInPort>(FaultInPort.class, this, ErrormodelPackage.ERROR_MODEL_TYPE__EXTERNAL_FAULT);
		}
		return externalFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorModelPrototype> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<ErrorModelPrototype>(ErrorModelPrototype.class, this, ErrormodelPackage.ERROR_MODEL_TYPE__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureOutPort> getFailure() {
		if (failure == null) {
			failure = new EObjectContainmentEList<FailureOutPort>(FailureOutPort.class, this, ErrormodelPackage.ERROR_MODEL_TYPE__FAILURE);
		}
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalFaultPrototype> getInternalFault() {
		if (internalFault == null) {
			internalFault = new EObjectContainmentEList<InternalFaultPrototype>(InternalFaultPrototype.class, this, ErrormodelPackage.ERROR_MODEL_TYPE__INTERNAL_FAULT);
		}
		return internalFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessFaultPrototype> getProcessFault() {
		if (processFault == null) {
			processFault = new EObjectContainmentEList<ProcessFaultPrototype>(ProcessFaultPrototype.class, this, ErrormodelPackage.ERROR_MODEL_TYPE__PROCESS_FAULT);
		}
		return processFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErrorBehaviorDescription()).basicAdd(otherEnd, msgs);
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
			case ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION:
				return ((InternalEList<?>)getErrorBehaviorDescription()).basicRemove(otherEnd, msgs);
			case ErrormodelPackage.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR:
				return ((InternalEList<?>)getFaultFailureConnector()).basicRemove(otherEnd, msgs);
			case ErrormodelPackage.ERROR_MODEL_TYPE__EXTERNAL_FAULT:
				return ((InternalEList<?>)getExternalFault()).basicRemove(otherEnd, msgs);
			case ErrormodelPackage.ERROR_MODEL_TYPE__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
			case ErrormodelPackage.ERROR_MODEL_TYPE__FAILURE:
				return ((InternalEList<?>)getFailure()).basicRemove(otherEnd, msgs);
			case ErrormodelPackage.ERROR_MODEL_TYPE__INTERNAL_FAULT:
				return ((InternalEList<?>)getInternalFault()).basicRemove(otherEnd, msgs);
			case ErrormodelPackage.ERROR_MODEL_TYPE__PROCESS_FAULT:
				return ((InternalEList<?>)getProcessFault()).basicRemove(otherEnd, msgs);
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
			case ErrormodelPackage.ERROR_MODEL_TYPE__GENERIC_DESCRIPTION:
				return getGenericDescription();
			case ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION:
				return getErrorBehaviorDescription();
			case ErrormodelPackage.ERROR_MODEL_TYPE__TARGET:
				return getTarget();
			case ErrormodelPackage.ERROR_MODEL_TYPE__HW_TARGET:
				return getHwTarget();
			case ErrormodelPackage.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR:
				return getFaultFailureConnector();
			case ErrormodelPackage.ERROR_MODEL_TYPE__EXTERNAL_FAULT:
				return getExternalFault();
			case ErrormodelPackage.ERROR_MODEL_TYPE__PART:
				return getPart();
			case ErrormodelPackage.ERROR_MODEL_TYPE__FAILURE:
				return getFailure();
			case ErrormodelPackage.ERROR_MODEL_TYPE__INTERNAL_FAULT:
				return getInternalFault();
			case ErrormodelPackage.ERROR_MODEL_TYPE__PROCESS_FAULT:
				return getProcessFault();
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
			case ErrormodelPackage.ERROR_MODEL_TYPE__GENERIC_DESCRIPTION:
				setGenericDescription((String)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION:
				getErrorBehaviorDescription().clear();
				getErrorBehaviorDescription().addAll((Collection<? extends ErrorBehavior>)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends FunctionType>)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__HW_TARGET:
				getHwTarget().clear();
				getHwTarget().addAll((Collection<? extends HardwareComponentType>)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR:
				getFaultFailureConnector().clear();
				getFaultFailureConnector().addAll((Collection<? extends FaultFailurePropagationLink>)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__EXTERNAL_FAULT:
				getExternalFault().clear();
				getExternalFault().addAll((Collection<? extends FaultInPort>)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends ErrorModelPrototype>)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__FAILURE:
				getFailure().clear();
				getFailure().addAll((Collection<? extends FailureOutPort>)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__INTERNAL_FAULT:
				getInternalFault().clear();
				getInternalFault().addAll((Collection<? extends InternalFaultPrototype>)newValue);
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__PROCESS_FAULT:
				getProcessFault().clear();
				getProcessFault().addAll((Collection<? extends ProcessFaultPrototype>)newValue);
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
			case ErrormodelPackage.ERROR_MODEL_TYPE__GENERIC_DESCRIPTION:
				unsetGenericDescription();
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION:
				getErrorBehaviorDescription().clear();
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__TARGET:
				getTarget().clear();
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__HW_TARGET:
				getHwTarget().clear();
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR:
				getFaultFailureConnector().clear();
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__EXTERNAL_FAULT:
				getExternalFault().clear();
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__PART:
				getPart().clear();
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__FAILURE:
				getFailure().clear();
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__INTERNAL_FAULT:
				getInternalFault().clear();
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__PROCESS_FAULT:
				getProcessFault().clear();
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
			case ErrormodelPackage.ERROR_MODEL_TYPE__GENERIC_DESCRIPTION:
				return isSetGenericDescription();
			case ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION:
				return errorBehaviorDescription != null && !errorBehaviorDescription.isEmpty();
			case ErrormodelPackage.ERROR_MODEL_TYPE__TARGET:
				return target != null && !target.isEmpty();
			case ErrormodelPackage.ERROR_MODEL_TYPE__HW_TARGET:
				return hwTarget != null && !hwTarget.isEmpty();
			case ErrormodelPackage.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR:
				return faultFailureConnector != null && !faultFailureConnector.isEmpty();
			case ErrormodelPackage.ERROR_MODEL_TYPE__EXTERNAL_FAULT:
				return externalFault != null && !externalFault.isEmpty();
			case ErrormodelPackage.ERROR_MODEL_TYPE__PART:
				return part != null && !part.isEmpty();
			case ErrormodelPackage.ERROR_MODEL_TYPE__FAILURE:
				return failure != null && !failure.isEmpty();
			case ErrormodelPackage.ERROR_MODEL_TYPE__INTERNAL_FAULT:
				return internalFault != null && !internalFault.isEmpty();
			case ErrormodelPackage.ERROR_MODEL_TYPE__PROCESS_FAULT:
				return processFault != null && !processFault.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (genericDescription: ");
		if (genericDescriptionESet) result.append(genericDescription); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ErrorModelTypeImpl
