/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.QualityRequirement;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.QualityRequirementKind;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.impl.QualityRequirementImpl#getQualityRequirementType <em>Quality Requirement Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityRequirementImpl extends RequirementImpl implements QualityRequirement {
	/**
	 * The default value of the '{@link #getQualityRequirementType() <em>Quality Requirement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityRequirementType()
	 * @generated
	 * @ordered
	 */
	protected static final QualityRequirementKind QUALITY_REQUIREMENT_TYPE_EDEFAULT = QualityRequirementKind.PERFORMANCE;

	/**
	 * The cached value of the '{@link #getQualityRequirementType() <em>Quality Requirement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityRequirementType()
	 * @generated
	 * @ordered
	 */
	protected QualityRequirementKind qualityRequirementType = QUALITY_REQUIREMENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Quality Requirement Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualityRequirementTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.QUALITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityRequirementKind getQualityRequirementType() {
		return qualityRequirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityRequirementType(QualityRequirementKind newQualityRequirementType) {
		QualityRequirementKind oldQualityRequirementType = qualityRequirementType;
		qualityRequirementType = newQualityRequirementType == null ? QUALITY_REQUIREMENT_TYPE_EDEFAULT : newQualityRequirementType;
		boolean oldQualityRequirementTypeESet = qualityRequirementTypeESet;
		qualityRequirementTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.QUALITY_REQUIREMENT__QUALITY_REQUIREMENT_TYPE, oldQualityRequirementType, qualityRequirementType, !oldQualityRequirementTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualityRequirementType() {
		QualityRequirementKind oldQualityRequirementType = qualityRequirementType;
		boolean oldQualityRequirementTypeESet = qualityRequirementTypeESet;
		qualityRequirementType = QUALITY_REQUIREMENT_TYPE_EDEFAULT;
		qualityRequirementTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RequirementsPackage.QUALITY_REQUIREMENT__QUALITY_REQUIREMENT_TYPE, oldQualityRequirementType, QUALITY_REQUIREMENT_TYPE_EDEFAULT, oldQualityRequirementTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualityRequirementType() {
		return qualityRequirementTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.QUALITY_REQUIREMENT__QUALITY_REQUIREMENT_TYPE:
				return getQualityRequirementType();
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
			case RequirementsPackage.QUALITY_REQUIREMENT__QUALITY_REQUIREMENT_TYPE:
				setQualityRequirementType((QualityRequirementKind)newValue);
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
			case RequirementsPackage.QUALITY_REQUIREMENT__QUALITY_REQUIREMENT_TYPE:
				unsetQualityRequirementType();
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
			case RequirementsPackage.QUALITY_REQUIREMENT__QUALITY_REQUIREMENT_TYPE:
				return isSetQualityRequirementType();
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
		result.append(" (qualityRequirementType: ");
		if (qualityRequirementTypeESet) result.append(qualityRequirementType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QualityRequirementImpl
