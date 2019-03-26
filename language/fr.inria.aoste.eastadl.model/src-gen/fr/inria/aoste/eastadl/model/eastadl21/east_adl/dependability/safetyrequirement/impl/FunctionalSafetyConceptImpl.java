/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.FunctionalSafetyConcept;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Requirement;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl.RequirementsContainerImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Safety Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.impl.FunctionalSafetyConceptImpl#getFunctionalSafetyRequirement <em>Functional Safety Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalSafetyConceptImpl extends RequirementsContainerImpl implements FunctionalSafetyConcept {
	/**
	 * The cached value of the '{@link #getFunctionalSafetyRequirement() <em>Functional Safety Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalSafetyRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> functionalSafetyRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalSafetyConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetyrequirementPackage.Literals.FUNCTIONAL_SAFETY_CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getFunctionalSafetyRequirement() {
		if (functionalSafetyRequirement == null) {
			functionalSafetyRequirement = new EObjectResolvingEList<Requirement>(Requirement.class, this, SafetyrequirementPackage.FUNCTIONAL_SAFETY_CONCEPT__FUNCTIONAL_SAFETY_REQUIREMENT);
		}
		return functionalSafetyRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SafetyrequirementPackage.FUNCTIONAL_SAFETY_CONCEPT__FUNCTIONAL_SAFETY_REQUIREMENT:
				return getFunctionalSafetyRequirement();
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
			case SafetyrequirementPackage.FUNCTIONAL_SAFETY_CONCEPT__FUNCTIONAL_SAFETY_REQUIREMENT:
				getFunctionalSafetyRequirement().clear();
				getFunctionalSafetyRequirement().addAll((Collection<? extends Requirement>)newValue);
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
			case SafetyrequirementPackage.FUNCTIONAL_SAFETY_CONCEPT__FUNCTIONAL_SAFETY_REQUIREMENT:
				getFunctionalSafetyRequirement().clear();
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
			case SafetyrequirementPackage.FUNCTIONAL_SAFETY_CONCEPT__FUNCTIONAL_SAFETY_REQUIREMENT:
				return functionalSafetyRequirement != null && !functionalSafetyRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalSafetyConceptImpl
