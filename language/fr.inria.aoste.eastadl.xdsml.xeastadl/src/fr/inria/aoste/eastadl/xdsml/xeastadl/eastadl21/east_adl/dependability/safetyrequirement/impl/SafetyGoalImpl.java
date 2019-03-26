/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyrequirement.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.Mode;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.ASILKind;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.Requirement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyrequirement.impl.SafetyGoalImpl#getHazardClassification <em>Hazard Classification</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyrequirement.impl.SafetyGoalImpl#getSafeStates <em>Safe States</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyrequirement.impl.SafetyGoalImpl#getSafeModes <em>Safe Modes</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyrequirement.impl.SafetyGoalImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyrequirement.impl.SafetyGoalImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyGoalImpl extends EAElementImpl implements SafetyGoal {
	/**
	 * The default value of the '{@link #getHazardClassification() <em>Hazard Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardClassification()
	 * @generated
	 * @ordered
	 */
	protected static final ASILKind HAZARD_CLASSIFICATION_EDEFAULT = ASILKind.ASIL_A;

	/**
	 * The cached value of the '{@link #getHazardClassification() <em>Hazard Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardClassification()
	 * @generated
	 * @ordered
	 */
	protected ASILKind hazardClassification = HAZARD_CLASSIFICATION_EDEFAULT;

	/**
	 * This is true if the Hazard Classification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hazardClassificationESet;

	/**
	 * The default value of the '{@link #getSafeStates() <em>Safe States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafeStates()
	 * @generated
	 * @ordered
	 */
	protected static final String SAFE_STATES_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSafeStates() <em>Safe States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafeStates()
	 * @generated
	 * @ordered
	 */
	protected String safeStates = SAFE_STATES_EDEFAULT;

	/**
	 * This is true if the Safe States attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean safeStatesESet;

	/**
	 * The cached value of the '{@link #getSafeModes() <em>Safe Modes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafeModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> safeModes;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardousEvent> derivedFrom;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetyrequirementPackage.Literals.SAFETY_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASILKind getHazardClassification() {
		return hazardClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardClassification(ASILKind newHazardClassification) {
		ASILKind oldHazardClassification = hazardClassification;
		hazardClassification = newHazardClassification == null ? HAZARD_CLASSIFICATION_EDEFAULT : newHazardClassification;
		boolean oldHazardClassificationESet = hazardClassificationESet;
		hazardClassificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyrequirementPackage.SAFETY_GOAL__HAZARD_CLASSIFICATION, oldHazardClassification, hazardClassification, !oldHazardClassificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHazardClassification() {
		ASILKind oldHazardClassification = hazardClassification;
		boolean oldHazardClassificationESet = hazardClassificationESet;
		hazardClassification = HAZARD_CLASSIFICATION_EDEFAULT;
		hazardClassificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SafetyrequirementPackage.SAFETY_GOAL__HAZARD_CLASSIFICATION, oldHazardClassification, HAZARD_CLASSIFICATION_EDEFAULT, oldHazardClassificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHazardClassification() {
		return hazardClassificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSafeStates() {
		return safeStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafeStates(String newSafeStates) {
		String oldSafeStates = safeStates;
		safeStates = newSafeStates;
		boolean oldSafeStatesESet = safeStatesESet;
		safeStatesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyrequirementPackage.SAFETY_GOAL__SAFE_STATES, oldSafeStates, safeStates, !oldSafeStatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSafeStates() {
		String oldSafeStates = safeStates;
		boolean oldSafeStatesESet = safeStatesESet;
		safeStates = SAFE_STATES_EDEFAULT;
		safeStatesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SafetyrequirementPackage.SAFETY_GOAL__SAFE_STATES, oldSafeStates, SAFE_STATES_EDEFAULT, oldSafeStatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSafeStates() {
		return safeStatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getSafeModes() {
		if (safeModes == null) {
			safeModes = new EObjectResolvingEList<Mode>(Mode.class, this, SafetyrequirementPackage.SAFETY_GOAL__SAFE_MODES);
		}
		return safeModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardousEvent> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectResolvingEList<HazardousEvent>(HazardousEvent.class, this, SafetyrequirementPackage.SAFETY_GOAL__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirement() {
		if (requirement == null) {
			requirement = new EObjectResolvingEList<Requirement>(Requirement.class, this, SafetyrequirementPackage.SAFETY_GOAL__REQUIREMENT);
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SafetyrequirementPackage.SAFETY_GOAL__HAZARD_CLASSIFICATION:
				return getHazardClassification();
			case SafetyrequirementPackage.SAFETY_GOAL__SAFE_STATES:
				return getSafeStates();
			case SafetyrequirementPackage.SAFETY_GOAL__SAFE_MODES:
				return getSafeModes();
			case SafetyrequirementPackage.SAFETY_GOAL__DERIVED_FROM:
				return getDerivedFrom();
			case SafetyrequirementPackage.SAFETY_GOAL__REQUIREMENT:
				return getRequirement();
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
			case SafetyrequirementPackage.SAFETY_GOAL__HAZARD_CLASSIFICATION:
				setHazardClassification((ASILKind)newValue);
				return;
			case SafetyrequirementPackage.SAFETY_GOAL__SAFE_STATES:
				setSafeStates((String)newValue);
				return;
			case SafetyrequirementPackage.SAFETY_GOAL__SAFE_MODES:
				getSafeModes().clear();
				getSafeModes().addAll((Collection<? extends Mode>)newValue);
				return;
			case SafetyrequirementPackage.SAFETY_GOAL__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends HazardousEvent>)newValue);
				return;
			case SafetyrequirementPackage.SAFETY_GOAL__REQUIREMENT:
				getRequirement().clear();
				getRequirement().addAll((Collection<? extends Requirement>)newValue);
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
			case SafetyrequirementPackage.SAFETY_GOAL__HAZARD_CLASSIFICATION:
				unsetHazardClassification();
				return;
			case SafetyrequirementPackage.SAFETY_GOAL__SAFE_STATES:
				unsetSafeStates();
				return;
			case SafetyrequirementPackage.SAFETY_GOAL__SAFE_MODES:
				getSafeModes().clear();
				return;
			case SafetyrequirementPackage.SAFETY_GOAL__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case SafetyrequirementPackage.SAFETY_GOAL__REQUIREMENT:
				getRequirement().clear();
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
			case SafetyrequirementPackage.SAFETY_GOAL__HAZARD_CLASSIFICATION:
				return isSetHazardClassification();
			case SafetyrequirementPackage.SAFETY_GOAL__SAFE_STATES:
				return isSetSafeStates();
			case SafetyrequirementPackage.SAFETY_GOAL__SAFE_MODES:
				return safeModes != null && !safeModes.isEmpty();
			case SafetyrequirementPackage.SAFETY_GOAL__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case SafetyrequirementPackage.SAFETY_GOAL__REQUIREMENT:
				return requirement != null && !requirement.isEmpty();
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
		result.append(" (hazardClassification: ");
		if (hazardClassificationESet) result.append(hazardClassification); else result.append("<unset>");
		result.append(", safeStates: ");
		if (safeStatesESet) result.append(safeStates); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SafetyGoalImpl
