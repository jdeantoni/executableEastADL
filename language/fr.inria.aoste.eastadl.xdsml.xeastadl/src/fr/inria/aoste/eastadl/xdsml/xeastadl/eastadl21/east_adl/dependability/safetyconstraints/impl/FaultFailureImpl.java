/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Failure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.FaultFailureImpl#getAnomaly <em>Anomaly</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.FaultFailureImpl#getFaultFailureValue <em>Fault Failure Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultFailureImpl extends TraceableSpecificationImpl implements FaultFailure {
	/**
	 * The cached value of the '{@link #getAnomaly() <em>Anomaly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnomaly()
	 * @generated
	 * @ordered
	 */
	protected FaultFailure_anomaly anomaly;

	/**
	 * The cached value of the '{@link #getFaultFailureValue() <em>Fault Failure Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultFailureValue()
	 * @generated
	 * @ordered
	 */
	protected EADatatypePrototype faultFailureValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultFailureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetyconstraintsPackage.Literals.FAULT_FAILURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailure_anomaly getAnomaly() {
		return anomaly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnomaly(FaultFailure_anomaly newAnomaly, NotificationChain msgs) {
		FaultFailure_anomaly oldAnomaly = anomaly;
		anomaly = newAnomaly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY, oldAnomaly, newAnomaly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnomaly(FaultFailure_anomaly newAnomaly) {
		if (newAnomaly != anomaly) {
			NotificationChain msgs = null;
			if (anomaly != null)
				msgs = ((InternalEObject)anomaly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY, null, msgs);
			if (newAnomaly != null)
				msgs = ((InternalEObject)newAnomaly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY, null, msgs);
			msgs = basicSetAnomaly(newAnomaly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY, newAnomaly, newAnomaly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADatatypePrototype getFaultFailureValue() {
		return faultFailureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaultFailureValue(EADatatypePrototype newFaultFailureValue, NotificationChain msgs) {
		EADatatypePrototype oldFaultFailureValue = faultFailureValue;
		faultFailureValue = newFaultFailureValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SafetyconstraintsPackage.FAULT_FAILURE__FAULT_FAILURE_VALUE, oldFaultFailureValue, newFaultFailureValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultFailureValue(EADatatypePrototype newFaultFailureValue) {
		if (newFaultFailureValue != faultFailureValue) {
			NotificationChain msgs = null;
			if (faultFailureValue != null)
				msgs = ((InternalEObject)faultFailureValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SafetyconstraintsPackage.FAULT_FAILURE__FAULT_FAILURE_VALUE, null, msgs);
			if (newFaultFailureValue != null)
				msgs = ((InternalEObject)newFaultFailureValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SafetyconstraintsPackage.FAULT_FAILURE__FAULT_FAILURE_VALUE, null, msgs);
			msgs = basicSetFaultFailureValue(newFaultFailureValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyconstraintsPackage.FAULT_FAILURE__FAULT_FAILURE_VALUE, newFaultFailureValue, newFaultFailureValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY:
				return basicSetAnomaly(null, msgs);
			case SafetyconstraintsPackage.FAULT_FAILURE__FAULT_FAILURE_VALUE:
				return basicSetFaultFailureValue(null, msgs);
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
			case SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY:
				return getAnomaly();
			case SafetyconstraintsPackage.FAULT_FAILURE__FAULT_FAILURE_VALUE:
				return getFaultFailureValue();
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
			case SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY:
				setAnomaly((FaultFailure_anomaly)newValue);
				return;
			case SafetyconstraintsPackage.FAULT_FAILURE__FAULT_FAILURE_VALUE:
				setFaultFailureValue((EADatatypePrototype)newValue);
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
			case SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY:
				setAnomaly((FaultFailure_anomaly)null);
				return;
			case SafetyconstraintsPackage.FAULT_FAILURE__FAULT_FAILURE_VALUE:
				setFaultFailureValue((EADatatypePrototype)null);
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
			case SafetyconstraintsPackage.FAULT_FAILURE__ANOMALY:
				return anomaly != null;
			case SafetyconstraintsPackage.FAULT_FAILURE__FAULT_FAILURE_VALUE:
				return faultFailureValue != null;
		}
		return super.eIsSet(featureID);
	}

} //FaultFailureImpl
