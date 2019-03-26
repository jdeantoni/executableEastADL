/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.NeedsPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Stakeholder;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl.StakeholderImpl#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl.StakeholderImpl#getSuccessCriteria <em>Success Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeholderImpl extends TraceableSpecificationImpl implements Stakeholder {
	/**
	 * The default value of the '{@link #getResponsibilities() <em>Responsibilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibilities()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBILITIES_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getResponsibilities() <em>Responsibilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibilities()
	 * @generated
	 * @ordered
	 */
	protected String responsibilities = RESPONSIBILITIES_EDEFAULT;

	/**
	 * This is true if the Responsibilities attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean responsibilitiesESet;

	/**
	 * The default value of the '{@link #getSuccessCriteria() <em>Success Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final String SUCCESS_CRITERIA_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSuccessCriteria() <em>Success Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessCriteria()
	 * @generated
	 * @ordered
	 */
	protected String successCriteria = SUCCESS_CRITERIA_EDEFAULT;

	/**
	 * This is true if the Success Criteria attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean successCriteriaESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeholderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeedsPackage.Literals.STAKEHOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsibilities() {
		return responsibilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibilities(String newResponsibilities) {
		String oldResponsibilities = responsibilities;
		responsibilities = newResponsibilities;
		boolean oldResponsibilitiesESet = responsibilitiesESet;
		responsibilitiesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.STAKEHOLDER__RESPONSIBILITIES, oldResponsibilities, responsibilities, !oldResponsibilitiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResponsibilities() {
		String oldResponsibilities = responsibilities;
		boolean oldResponsibilitiesESet = responsibilitiesESet;
		responsibilities = RESPONSIBILITIES_EDEFAULT;
		responsibilitiesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NeedsPackage.STAKEHOLDER__RESPONSIBILITIES, oldResponsibilities, RESPONSIBILITIES_EDEFAULT, oldResponsibilitiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResponsibilities() {
		return responsibilitiesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuccessCriteria() {
		return successCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessCriteria(String newSuccessCriteria) {
		String oldSuccessCriteria = successCriteria;
		successCriteria = newSuccessCriteria;
		boolean oldSuccessCriteriaESet = successCriteriaESet;
		successCriteriaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.STAKEHOLDER__SUCCESS_CRITERIA, oldSuccessCriteria, successCriteria, !oldSuccessCriteriaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSuccessCriteria() {
		String oldSuccessCriteria = successCriteria;
		boolean oldSuccessCriteriaESet = successCriteriaESet;
		successCriteria = SUCCESS_CRITERIA_EDEFAULT;
		successCriteriaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NeedsPackage.STAKEHOLDER__SUCCESS_CRITERIA, oldSuccessCriteria, SUCCESS_CRITERIA_EDEFAULT, oldSuccessCriteriaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuccessCriteria() {
		return successCriteriaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeedsPackage.STAKEHOLDER__RESPONSIBILITIES:
				return getResponsibilities();
			case NeedsPackage.STAKEHOLDER__SUCCESS_CRITERIA:
				return getSuccessCriteria();
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
			case NeedsPackage.STAKEHOLDER__RESPONSIBILITIES:
				setResponsibilities((String)newValue);
				return;
			case NeedsPackage.STAKEHOLDER__SUCCESS_CRITERIA:
				setSuccessCriteria((String)newValue);
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
			case NeedsPackage.STAKEHOLDER__RESPONSIBILITIES:
				unsetResponsibilities();
				return;
			case NeedsPackage.STAKEHOLDER__SUCCESS_CRITERIA:
				unsetSuccessCriteria();
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
			case NeedsPackage.STAKEHOLDER__RESPONSIBILITIES:
				return isSetResponsibilities();
			case NeedsPackage.STAKEHOLDER__SUCCESS_CRITERIA:
				return isSetSuccessCriteria();
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
		result.append(" (responsibilities: ");
		if (responsibilitiesESet) result.append(responsibilities); else result.append("<unset>");
		result.append(", successCriteria: ");
		if (successCriteriaESet) result.append(successCriteria); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StakeholderImpl
