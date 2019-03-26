/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.verificationvalidation.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.verificationvalidation.VVLog;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage;

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
 * An implementation of the model object '<em><b>VV Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.verificationvalidation.impl.VVLogImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.verificationvalidation.impl.VVLogImpl#getVvActualOutcome <em>Vv Actual Outcome</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.verificationvalidation.impl.VVLogImpl#getPerformedVVProcedure <em>Performed VV Procedure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VVLogImpl extends TraceableSpecificationImpl implements VVLog {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * This is true if the Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dateESet;

	/**
	 * The cached value of the '{@link #getVvActualOutcome() <em>Vv Actual Outcome</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVvActualOutcome()
	 * @generated
	 * @ordered
	 */
	protected EList<VVActualOutcome> vvActualOutcome;

	/**
	 * The cached value of the '{@link #getPerformedVVProcedure() <em>Performed VV Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedVVProcedure()
	 * @generated
	 * @ordered
	 */
	protected VVProcedure performedVVProcedure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VVLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerificationvalidationPackage.Literals.VV_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		boolean oldDateESet = dateESet;
		dateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerificationvalidationPackage.VV_LOG__DATE, oldDate, date, !oldDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDate() {
		String oldDate = date;
		boolean oldDateESet = dateESet;
		date = DATE_EDEFAULT;
		dateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VerificationvalidationPackage.VV_LOG__DATE, oldDate, DATE_EDEFAULT, oldDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDate() {
		return dateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVActualOutcome> getVvActualOutcome() {
		if (vvActualOutcome == null) {
			vvActualOutcome = new EObjectContainmentEList<VVActualOutcome>(VVActualOutcome.class, this, VerificationvalidationPackage.VV_LOG__VV_ACTUAL_OUTCOME);
		}
		return vvActualOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVProcedure getPerformedVVProcedure() {
		if (performedVVProcedure != null && performedVVProcedure.eIsProxy()) {
			InternalEObject oldPerformedVVProcedure = (InternalEObject)performedVVProcedure;
			performedVVProcedure = (VVProcedure)eResolveProxy(oldPerformedVVProcedure);
			if (performedVVProcedure != oldPerformedVVProcedure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerificationvalidationPackage.VV_LOG__PERFORMED_VV_PROCEDURE, oldPerformedVVProcedure, performedVVProcedure));
			}
		}
		return performedVVProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVProcedure basicGetPerformedVVProcedure() {
		return performedVVProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedVVProcedure(VVProcedure newPerformedVVProcedure) {
		VVProcedure oldPerformedVVProcedure = performedVVProcedure;
		performedVVProcedure = newPerformedVVProcedure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerificationvalidationPackage.VV_LOG__PERFORMED_VV_PROCEDURE, oldPerformedVVProcedure, performedVVProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VerificationvalidationPackage.VV_LOG__VV_ACTUAL_OUTCOME:
				return ((InternalEList<?>)getVvActualOutcome()).basicRemove(otherEnd, msgs);
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
			case VerificationvalidationPackage.VV_LOG__DATE:
				return getDate();
			case VerificationvalidationPackage.VV_LOG__VV_ACTUAL_OUTCOME:
				return getVvActualOutcome();
			case VerificationvalidationPackage.VV_LOG__PERFORMED_VV_PROCEDURE:
				if (resolve) return getPerformedVVProcedure();
				return basicGetPerformedVVProcedure();
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
			case VerificationvalidationPackage.VV_LOG__DATE:
				setDate((String)newValue);
				return;
			case VerificationvalidationPackage.VV_LOG__VV_ACTUAL_OUTCOME:
				getVvActualOutcome().clear();
				getVvActualOutcome().addAll((Collection<? extends VVActualOutcome>)newValue);
				return;
			case VerificationvalidationPackage.VV_LOG__PERFORMED_VV_PROCEDURE:
				setPerformedVVProcedure((VVProcedure)newValue);
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
			case VerificationvalidationPackage.VV_LOG__DATE:
				unsetDate();
				return;
			case VerificationvalidationPackage.VV_LOG__VV_ACTUAL_OUTCOME:
				getVvActualOutcome().clear();
				return;
			case VerificationvalidationPackage.VV_LOG__PERFORMED_VV_PROCEDURE:
				setPerformedVVProcedure((VVProcedure)null);
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
			case VerificationvalidationPackage.VV_LOG__DATE:
				return isSetDate();
			case VerificationvalidationPackage.VV_LOG__VV_ACTUAL_OUTCOME:
				return vvActualOutcome != null && !vvActualOutcome.isEmpty();
			case VerificationvalidationPackage.VV_LOG__PERFORMED_VV_PROCEDURE:
				return performedVVProcedure != null;
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
		result.append(" (date: ");
		if (dateESet) result.append(date); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VVLogImpl
