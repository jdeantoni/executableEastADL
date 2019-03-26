/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.Refine;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.Requirement;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsPackage;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.impl.RefineImpl#getRefinedRequirement <em>Refined Requirement</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.impl.RefineImpl#getRefinedBy <em>Refined By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefineImpl extends RequirementsRelationshipImpl implements Refine {
	/**
	 * The cached value of the '{@link #getRefinedRequirement() <em>Refined Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> refinedRequirement;

	/**
	 * The cached value of the '{@link #getRefinedBy() <em>Refined By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Refine_refinedBy> refinedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REFINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRefinedRequirement() {
		if (refinedRequirement == null) {
			refinedRequirement = new EObjectResolvingEList<Requirement>(Requirement.class, this, RequirementsPackage.REFINE__REFINED_REQUIREMENT);
		}
		return refinedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Refine_refinedBy> getRefinedBy() {
		if (refinedBy == null) {
			refinedBy = new EObjectContainmentEList<Refine_refinedBy>(Refine_refinedBy.class, this, RequirementsPackage.REFINE__REFINED_BY);
		}
		return refinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.REFINE__REFINED_BY:
				return ((InternalEList<?>)getRefinedBy()).basicRemove(otherEnd, msgs);
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
			case RequirementsPackage.REFINE__REFINED_REQUIREMENT:
				return getRefinedRequirement();
			case RequirementsPackage.REFINE__REFINED_BY:
				return getRefinedBy();
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
			case RequirementsPackage.REFINE__REFINED_REQUIREMENT:
				getRefinedRequirement().clear();
				getRefinedRequirement().addAll((Collection<? extends Requirement>)newValue);
				return;
			case RequirementsPackage.REFINE__REFINED_BY:
				getRefinedBy().clear();
				getRefinedBy().addAll((Collection<? extends Refine_refinedBy>)newValue);
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
			case RequirementsPackage.REFINE__REFINED_REQUIREMENT:
				getRefinedRequirement().clear();
				return;
			case RequirementsPackage.REFINE__REFINED_BY:
				getRefinedBy().clear();
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
			case RequirementsPackage.REFINE__REFINED_REQUIREMENT:
				return refinedRequirement != null && !refinedRequirement.isEmpty();
			case RequirementsPackage.REFINE__REFINED_BY:
				return refinedBy != null && !refinedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RefineImpl
