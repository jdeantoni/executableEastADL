/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_toPort;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Failure Propagation Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePropagationLinkImpl#getImmediatePropagation <em>Immediate Propagation</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePropagationLinkImpl#getFromPort <em>From Port</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePropagationLinkImpl#getToPort <em>To Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultFailurePropagationLinkImpl extends EAElementImpl implements FaultFailurePropagationLink {
	/**
	 * The default value of the '{@link #getImmediatePropagation() <em>Immediate Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediatePropagation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IMMEDIATE_PROPAGATION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getImmediatePropagation() <em>Immediate Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediatePropagation()
	 * @generated
	 * @ordered
	 */
	protected Boolean immediatePropagation = IMMEDIATE_PROPAGATION_EDEFAULT;

	/**
	 * This is true if the Immediate Propagation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean immediatePropagationESet;

	/**
	 * The cached value of the '{@link #getFromPort() <em>From Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPort()
	 * @generated
	 * @ordered
	 */
	protected FaultFailurePropagationLink_fromPort fromPort;

	/**
	 * The cached value of the '{@link #getToPort() <em>To Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort()
	 * @generated
	 * @ordered
	 */
	protected FaultFailurePropagationLink_toPort toPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultFailurePropagationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrormodelPackage.Literals.FAULT_FAILURE_PROPAGATION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getImmediatePropagation() {
		return immediatePropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmediatePropagation(Boolean newImmediatePropagation) {
		Boolean oldImmediatePropagation = immediatePropagation;
		immediatePropagation = newImmediatePropagation;
		boolean oldImmediatePropagationESet = immediatePropagationESet;
		immediatePropagationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION, oldImmediatePropagation, immediatePropagation, !oldImmediatePropagationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImmediatePropagation() {
		Boolean oldImmediatePropagation = immediatePropagation;
		boolean oldImmediatePropagationESet = immediatePropagationESet;
		immediatePropagation = IMMEDIATE_PROPAGATION_EDEFAULT;
		immediatePropagationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION, oldImmediatePropagation, IMMEDIATE_PROPAGATION_EDEFAULT, oldImmediatePropagationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImmediatePropagation() {
		return immediatePropagationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePropagationLink_fromPort getFromPort() {
		return fromPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromPort(FaultFailurePropagationLink_fromPort newFromPort, NotificationChain msgs) {
		FaultFailurePropagationLink_fromPort oldFromPort = fromPort;
		fromPort = newFromPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT, oldFromPort, newFromPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPort(FaultFailurePropagationLink_fromPort newFromPort) {
		if (newFromPort != fromPort) {
			NotificationChain msgs = null;
			if (fromPort != null)
				msgs = ((InternalEObject)fromPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT, null, msgs);
			if (newFromPort != null)
				msgs = ((InternalEObject)newFromPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT, null, msgs);
			msgs = basicSetFromPort(newFromPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT, newFromPort, newFromPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePropagationLink_toPort getToPort() {
		return toPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToPort(FaultFailurePropagationLink_toPort newToPort, NotificationChain msgs) {
		FaultFailurePropagationLink_toPort oldToPort = toPort;
		toPort = newToPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT, oldToPort, newToPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPort(FaultFailurePropagationLink_toPort newToPort) {
		if (newToPort != toPort) {
			NotificationChain msgs = null;
			if (toPort != null)
				msgs = ((InternalEObject)toPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT, null, msgs);
			if (newToPort != null)
				msgs = ((InternalEObject)newToPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT, null, msgs);
			msgs = basicSetToPort(newToPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT, newToPort, newToPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT:
				return basicSetFromPort(null, msgs);
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT:
				return basicSetToPort(null, msgs);
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
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION:
				return getImmediatePropagation();
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT:
				return getFromPort();
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT:
				return getToPort();
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
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION:
				setImmediatePropagation((Boolean)newValue);
				return;
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT:
				setFromPort((FaultFailurePropagationLink_fromPort)newValue);
				return;
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT:
				setToPort((FaultFailurePropagationLink_toPort)newValue);
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
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION:
				unsetImmediatePropagation();
				return;
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT:
				setFromPort((FaultFailurePropagationLink_fromPort)null);
				return;
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT:
				setToPort((FaultFailurePropagationLink_toPort)null);
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
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION:
				return isSetImmediatePropagation();
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT:
				return fromPort != null;
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT:
				return toPort != null;
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
		result.append(" (immediatePropagation: ");
		if (immediatePropagationESet) result.append(immediatePropagation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FaultFailurePropagationLinkImpl
