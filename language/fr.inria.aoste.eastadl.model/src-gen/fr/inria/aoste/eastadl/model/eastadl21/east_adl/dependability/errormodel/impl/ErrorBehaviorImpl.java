/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorKind;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FailureOutPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultInPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototype;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorBehaviorImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorBehaviorImpl#getFailureLogic <em>Failure Logic</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorBehaviorImpl#getInternalFault <em>Internal Fault</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorBehaviorImpl#getExternalFault <em>External Fault</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorBehaviorImpl#getExternalFailure <em>External Failure</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorBehaviorImpl#getProcessFault <em>Process Fault</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorBehaviorImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorBehaviorImpl extends EAElementImpl implements ErrorBehavior {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ErrorBehaviorKind TYPE_EDEFAULT = ErrorBehaviorKind.HIP_HOPS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ErrorBehaviorKind type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getFailureLogic() <em>Failure Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureLogic()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_LOGIC_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFailureLogic() <em>Failure Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureLogic()
	 * @generated
	 * @ordered
	 */
	protected String failureLogic = FAILURE_LOGIC_EDEFAULT;

	/**
	 * This is true if the Failure Logic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean failureLogicESet;

	/**
	 * The cached value of the '{@link #getInternalFault() <em>Internal Fault</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFault()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalFaultPrototype> internalFault;

	/**
	 * The cached value of the '{@link #getExternalFault() <em>External Fault</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFault()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultInPort> externalFault;

	/**
	 * The cached value of the '{@link #getExternalFailure() <em>External Failure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFailure()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureOutPort> externalFailure;

	/**
	 * The cached value of the '{@link #getProcessFault() <em>Process Fault</em>}' reference list.
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
	protected ErrorBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrormodelPackage.Literals.ERROR_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorKind getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ErrorBehaviorKind newType) {
		ErrorBehaviorKind oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.ERROR_BEHAVIOR__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		ErrorBehaviorKind oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErrormodelPackage.ERROR_BEHAVIOR__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFailureLogic() {
		return failureLogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureLogic(String newFailureLogic) {
		String oldFailureLogic = failureLogic;
		failureLogic = newFailureLogic;
		boolean oldFailureLogicESet = failureLogicESet;
		failureLogicESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.ERROR_BEHAVIOR__FAILURE_LOGIC, oldFailureLogic, failureLogic, !oldFailureLogicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFailureLogic() {
		String oldFailureLogic = failureLogic;
		boolean oldFailureLogicESet = failureLogicESet;
		failureLogic = FAILURE_LOGIC_EDEFAULT;
		failureLogicESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErrormodelPackage.ERROR_BEHAVIOR__FAILURE_LOGIC, oldFailureLogic, FAILURE_LOGIC_EDEFAULT, oldFailureLogicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFailureLogic() {
		return failureLogicESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalFaultPrototype> getInternalFault() {
		if (internalFault == null) {
			internalFault = new EObjectResolvingEList<InternalFaultPrototype>(InternalFaultPrototype.class, this, ErrormodelPackage.ERROR_BEHAVIOR__INTERNAL_FAULT);
		}
		return internalFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FaultInPort> getExternalFault() {
		if (externalFault == null) {
			externalFault = new EObjectResolvingEList<FaultInPort>(FaultInPort.class, this, ErrormodelPackage.ERROR_BEHAVIOR__EXTERNAL_FAULT);
		}
		return externalFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureOutPort> getExternalFailure() {
		if (externalFailure == null) {
			externalFailure = new EObjectResolvingEList<FailureOutPort>(FailureOutPort.class, this, ErrormodelPackage.ERROR_BEHAVIOR__EXTERNAL_FAILURE);
		}
		return externalFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessFaultPrototype> getProcessFault() {
		if (processFault == null) {
			processFault = new EObjectResolvingEList<ProcessFaultPrototype>(ProcessFaultPrototype.class, this, ErrormodelPackage.ERROR_BEHAVIOR__PROCESS_FAULT);
		}
		return processFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelType getOwner() {
		if (eContainerFeatureID() != ErrormodelPackage.ERROR_BEHAVIOR__OWNER) return null;
		return (ErrorModelType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(ErrorModelType newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, ErrormodelPackage.ERROR_BEHAVIOR__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(ErrorModelType newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != ErrormodelPackage.ERROR_BEHAVIOR__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION, ErrorModelType.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.ERROR_BEHAVIOR__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrormodelPackage.ERROR_BEHAVIOR__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((ErrorModelType)otherEnd, msgs);
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
			case ErrormodelPackage.ERROR_BEHAVIOR__OWNER:
				return basicSetOwner(null, msgs);
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
			case ErrormodelPackage.ERROR_BEHAVIOR__OWNER:
				return eInternalContainer().eInverseRemove(this, ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION, ErrorModelType.class, msgs);
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
			case ErrormodelPackage.ERROR_BEHAVIOR__TYPE:
				return getType();
			case ErrormodelPackage.ERROR_BEHAVIOR__FAILURE_LOGIC:
				return getFailureLogic();
			case ErrormodelPackage.ERROR_BEHAVIOR__INTERNAL_FAULT:
				return getInternalFault();
			case ErrormodelPackage.ERROR_BEHAVIOR__EXTERNAL_FAULT:
				return getExternalFault();
			case ErrormodelPackage.ERROR_BEHAVIOR__EXTERNAL_FAILURE:
				return getExternalFailure();
			case ErrormodelPackage.ERROR_BEHAVIOR__PROCESS_FAULT:
				return getProcessFault();
			case ErrormodelPackage.ERROR_BEHAVIOR__OWNER:
				return getOwner();
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
			case ErrormodelPackage.ERROR_BEHAVIOR__TYPE:
				setType((ErrorBehaviorKind)newValue);
				return;
			case ErrormodelPackage.ERROR_BEHAVIOR__FAILURE_LOGIC:
				setFailureLogic((String)newValue);
				return;
			case ErrormodelPackage.ERROR_BEHAVIOR__INTERNAL_FAULT:
				getInternalFault().clear();
				getInternalFault().addAll((Collection<? extends InternalFaultPrototype>)newValue);
				return;
			case ErrormodelPackage.ERROR_BEHAVIOR__EXTERNAL_FAULT:
				getExternalFault().clear();
				getExternalFault().addAll((Collection<? extends FaultInPort>)newValue);
				return;
			case ErrormodelPackage.ERROR_BEHAVIOR__EXTERNAL_FAILURE:
				getExternalFailure().clear();
				getExternalFailure().addAll((Collection<? extends FailureOutPort>)newValue);
				return;
			case ErrormodelPackage.ERROR_BEHAVIOR__PROCESS_FAULT:
				getProcessFault().clear();
				getProcessFault().addAll((Collection<? extends ProcessFaultPrototype>)newValue);
				return;
			case ErrormodelPackage.ERROR_BEHAVIOR__OWNER:
				setOwner((ErrorModelType)newValue);
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
			case ErrormodelPackage.ERROR_BEHAVIOR__TYPE:
				unsetType();
				return;
			case ErrormodelPackage.ERROR_BEHAVIOR__FAILURE_LOGIC:
				unsetFailureLogic();
				return;
			case ErrormodelPackage.ERROR_BEHAVIOR__INTERNAL_FAULT:
				getInternalFault().clear();
				return;
			case ErrormodelPackage.ERROR_BEHAVIOR__EXTERNAL_FAULT:
				getExternalFault().clear();
				return;
			case ErrormodelPackage.ERROR_BEHAVIOR__EXTERNAL_FAILURE:
				getExternalFailure().clear();
				return;
			case ErrormodelPackage.ERROR_BEHAVIOR__PROCESS_FAULT:
				getProcessFault().clear();
				return;
			case ErrormodelPackage.ERROR_BEHAVIOR__OWNER:
				setOwner((ErrorModelType)null);
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
			case ErrormodelPackage.ERROR_BEHAVIOR__TYPE:
				return isSetType();
			case ErrormodelPackage.ERROR_BEHAVIOR__FAILURE_LOGIC:
				return isSetFailureLogic();
			case ErrormodelPackage.ERROR_BEHAVIOR__INTERNAL_FAULT:
				return internalFault != null && !internalFault.isEmpty();
			case ErrormodelPackage.ERROR_BEHAVIOR__EXTERNAL_FAULT:
				return externalFault != null && !externalFault.isEmpty();
			case ErrormodelPackage.ERROR_BEHAVIOR__EXTERNAL_FAILURE:
				return externalFailure != null && !externalFailure.isEmpty();
			case ErrormodelPackage.ERROR_BEHAVIOR__PROCESS_FAULT:
				return processFault != null && !processFault.isEmpty();
			case ErrormodelPackage.ERROR_BEHAVIOR__OWNER:
				return getOwner() != null;
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", failureLogic: ");
		if (failureLogicESet) result.append(failureLogic); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ErrorBehaviorImpl
