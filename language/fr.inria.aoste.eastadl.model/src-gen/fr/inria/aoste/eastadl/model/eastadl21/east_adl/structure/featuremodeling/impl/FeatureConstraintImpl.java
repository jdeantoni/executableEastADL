/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureConstraintImpl#getCriterion <em>Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureConstraintImpl extends EAElementImpl implements FeatureConstraint {
	/**
	 * The default value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected String criterion = CRITERION_EDEFAULT;

	/**
	 * This is true if the Criterion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean criterionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturemodelingPackage.Literals.FEATURE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCriterion() {
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriterion(String newCriterion) {
		String oldCriterion = criterion;
		criterion = newCriterion;
		boolean oldCriterionESet = criterionESet;
		criterionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelingPackage.FEATURE_CONSTRAINT__CRITERION, oldCriterion, criterion, !oldCriterionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCriterion() {
		String oldCriterion = criterion;
		boolean oldCriterionESet = criterionESet;
		criterion = CRITERION_EDEFAULT;
		criterionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FeaturemodelingPackage.FEATURE_CONSTRAINT__CRITERION, oldCriterion, CRITERION_EDEFAULT, oldCriterionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCriterion() {
		return criterionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturemodelingPackage.FEATURE_CONSTRAINT__CRITERION:
				return getCriterion();
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
			case FeaturemodelingPackage.FEATURE_CONSTRAINT__CRITERION:
				setCriterion((String)newValue);
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
			case FeaturemodelingPackage.FEATURE_CONSTRAINT__CRITERION:
				unsetCriterion();
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
			case FeaturemodelingPackage.FEATURE_CONSTRAINT__CRITERION:
				return isSetCriterion();
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
		result.append(" (criterion: ");
		if (criterionESet) result.append(criterion); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FeatureConstraintImpl
