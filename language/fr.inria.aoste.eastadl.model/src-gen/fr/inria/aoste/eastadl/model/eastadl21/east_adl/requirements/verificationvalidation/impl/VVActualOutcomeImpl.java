/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcome;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VV Actual Outcome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VVActualOutcomeImpl#getIntendedOutcome <em>Intended Outcome</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VVActualOutcomeImpl extends TraceableSpecificationImpl implements VVActualOutcome {
	/**
	 * The cached value of the '{@link #getIntendedOutcome() <em>Intended Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedOutcome()
	 * @generated
	 * @ordered
	 */
	protected VVIntendedOutcome intendedOutcome;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VVActualOutcomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerificationvalidationPackage.Literals.VV_ACTUAL_OUTCOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVIntendedOutcome getIntendedOutcome() {
		if (intendedOutcome != null && intendedOutcome.eIsProxy()) {
			InternalEObject oldIntendedOutcome = (InternalEObject)intendedOutcome;
			intendedOutcome = (VVIntendedOutcome)eResolveProxy(oldIntendedOutcome);
			if (intendedOutcome != oldIntendedOutcome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerificationvalidationPackage.VV_ACTUAL_OUTCOME__INTENDED_OUTCOME, oldIntendedOutcome, intendedOutcome));
			}
		}
		return intendedOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVIntendedOutcome basicGetIntendedOutcome() {
		return intendedOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntendedOutcome(VVIntendedOutcome newIntendedOutcome) {
		VVIntendedOutcome oldIntendedOutcome = intendedOutcome;
		intendedOutcome = newIntendedOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerificationvalidationPackage.VV_ACTUAL_OUTCOME__INTENDED_OUTCOME, oldIntendedOutcome, intendedOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerificationvalidationPackage.VV_ACTUAL_OUTCOME__INTENDED_OUTCOME:
				if (resolve) return getIntendedOutcome();
				return basicGetIntendedOutcome();
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
			case VerificationvalidationPackage.VV_ACTUAL_OUTCOME__INTENDED_OUTCOME:
				setIntendedOutcome((VVIntendedOutcome)newValue);
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
			case VerificationvalidationPackage.VV_ACTUAL_OUTCOME__INTENDED_OUTCOME:
				setIntendedOutcome((VVIntendedOutcome)null);
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
			case VerificationvalidationPackage.VV_ACTUAL_OUTCOME__INTENDED_OUTCOME:
				return intendedOutcome != null;
		}
		return super.eIsSet(featureID);
	}

} //VVActualOutcomeImpl
