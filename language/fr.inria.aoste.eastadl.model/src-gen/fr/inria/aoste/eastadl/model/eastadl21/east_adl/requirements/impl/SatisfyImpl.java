/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Requirement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Satisfy;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.UseCase;

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
 * An implementation of the model object '<em><b>Satisfy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl.SatisfyImpl#getSatisfiedRequirement <em>Satisfied Requirement</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl.SatisfyImpl#getSatisfiedUseCase <em>Satisfied Use Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl.SatisfyImpl#getSatisfiedBy <em>Satisfied By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SatisfyImpl extends RequirementsRelationshipImpl implements Satisfy {
	/**
	 * The cached value of the '{@link #getSatisfiedRequirement() <em>Satisfied Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> satisfiedRequirement;

	/**
	 * The cached value of the '{@link #getSatisfiedUseCase() <em>Satisfied Use Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiedUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> satisfiedUseCase;

	/**
	 * The cached value of the '{@link #getSatisfiedBy() <em>Satisfied By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Satisfy_satisfiedBy> satisfiedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatisfyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.SATISFY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getSatisfiedRequirement() {
		if (satisfiedRequirement == null) {
			satisfiedRequirement = new EObjectResolvingEList<Requirement>(Requirement.class, this, RequirementsPackage.SATISFY__SATISFIED_REQUIREMENT);
		}
		return satisfiedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getSatisfiedUseCase() {
		if (satisfiedUseCase == null) {
			satisfiedUseCase = new EObjectResolvingEList<UseCase>(UseCase.class, this, RequirementsPackage.SATISFY__SATISFIED_USE_CASE);
		}
		return satisfiedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Satisfy_satisfiedBy> getSatisfiedBy() {
		if (satisfiedBy == null) {
			satisfiedBy = new EObjectContainmentEList<Satisfy_satisfiedBy>(Satisfy_satisfiedBy.class, this, RequirementsPackage.SATISFY__SATISFIED_BY);
		}
		return satisfiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.SATISFY__SATISFIED_BY:
				return ((InternalEList<?>)getSatisfiedBy()).basicRemove(otherEnd, msgs);
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
			case RequirementsPackage.SATISFY__SATISFIED_REQUIREMENT:
				return getSatisfiedRequirement();
			case RequirementsPackage.SATISFY__SATISFIED_USE_CASE:
				return getSatisfiedUseCase();
			case RequirementsPackage.SATISFY__SATISFIED_BY:
				return getSatisfiedBy();
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
			case RequirementsPackage.SATISFY__SATISFIED_REQUIREMENT:
				getSatisfiedRequirement().clear();
				getSatisfiedRequirement().addAll((Collection<? extends Requirement>)newValue);
				return;
			case RequirementsPackage.SATISFY__SATISFIED_USE_CASE:
				getSatisfiedUseCase().clear();
				getSatisfiedUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case RequirementsPackage.SATISFY__SATISFIED_BY:
				getSatisfiedBy().clear();
				getSatisfiedBy().addAll((Collection<? extends Satisfy_satisfiedBy>)newValue);
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
			case RequirementsPackage.SATISFY__SATISFIED_REQUIREMENT:
				getSatisfiedRequirement().clear();
				return;
			case RequirementsPackage.SATISFY__SATISFIED_USE_CASE:
				getSatisfiedUseCase().clear();
				return;
			case RequirementsPackage.SATISFY__SATISFIED_BY:
				getSatisfiedBy().clear();
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
			case RequirementsPackage.SATISFY__SATISFIED_REQUIREMENT:
				return satisfiedRequirement != null && !satisfiedRequirement.isEmpty();
			case RequirementsPackage.SATISFY__SATISFIED_USE_CASE:
				return satisfiedUseCase != null && !satisfiedUseCase.isEmpty();
			case RequirementsPackage.SATISFY__SATISFIED_BY:
				return satisfiedBy != null && !satisfiedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SatisfyImpl
