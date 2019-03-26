/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.OperationalSituation;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementSpecificationObject;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsContainer;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsModel;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.UseCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl.RequirementsModelImpl#getOperationalSituation <em>Operational Situation</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl.RequirementsModelImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl.RequirementsModelImpl#getRequirementContainer <em>Requirement Container</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl.RequirementsModelImpl#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementsModelImpl extends ContextImpl implements RequirementsModel {
	/**
	 * The cached value of the '{@link #getOperationalSituation() <em>Operational Situation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalSituation()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalSituation> operationalSituation;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementSpecificationObject> requirement;

	/**
	 * The cached value of the '{@link #getRequirementContainer() <em>Requirement Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsContainer> requirementContainer;

	/**
	 * The cached value of the '{@link #getUseCase() <em>Use Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> useCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENTS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalSituation> getOperationalSituation() {
		if (operationalSituation == null) {
			operationalSituation = new EObjectContainmentEList<OperationalSituation>(OperationalSituation.class, this, RequirementsPackage.REQUIREMENTS_MODEL__OPERATIONAL_SITUATION);
		}
		return operationalSituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementSpecificationObject> getRequirement() {
		if (requirement == null) {
			requirement = new EObjectContainmentEList<RequirementSpecificationObject>(RequirementSpecificationObject.class, this, RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT);
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementsContainer> getRequirementContainer() {
		if (requirementContainer == null) {
			requirementContainer = new EObjectContainmentEList<RequirementsContainer>(RequirementsContainer.class, this, RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT_CONTAINER);
		}
		return requirementContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getUseCase() {
		if (useCase == null) {
			useCase = new EObjectContainmentEList<UseCase>(UseCase.class, this, RequirementsPackage.REQUIREMENTS_MODEL__USE_CASE);
		}
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENTS_MODEL__OPERATIONAL_SITUATION:
				return ((InternalEList<?>)getOperationalSituation()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT:
				return ((InternalEList<?>)getRequirement()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT_CONTAINER:
				return ((InternalEList<?>)getRequirementContainer()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENTS_MODEL__USE_CASE:
				return ((InternalEList<?>)getUseCase()).basicRemove(otherEnd, msgs);
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
			case RequirementsPackage.REQUIREMENTS_MODEL__OPERATIONAL_SITUATION:
				return getOperationalSituation();
			case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT:
				return getRequirement();
			case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT_CONTAINER:
				return getRequirementContainer();
			case RequirementsPackage.REQUIREMENTS_MODEL__USE_CASE:
				return getUseCase();
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
			case RequirementsPackage.REQUIREMENTS_MODEL__OPERATIONAL_SITUATION:
				getOperationalSituation().clear();
				getOperationalSituation().addAll((Collection<? extends OperationalSituation>)newValue);
				return;
			case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT:
				getRequirement().clear();
				getRequirement().addAll((Collection<? extends RequirementSpecificationObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT_CONTAINER:
				getRequirementContainer().clear();
				getRequirementContainer().addAll((Collection<? extends RequirementsContainer>)newValue);
				return;
			case RequirementsPackage.REQUIREMENTS_MODEL__USE_CASE:
				getUseCase().clear();
				getUseCase().addAll((Collection<? extends UseCase>)newValue);
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
			case RequirementsPackage.REQUIREMENTS_MODEL__OPERATIONAL_SITUATION:
				getOperationalSituation().clear();
				return;
			case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT:
				getRequirement().clear();
				return;
			case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT_CONTAINER:
				getRequirementContainer().clear();
				return;
			case RequirementsPackage.REQUIREMENTS_MODEL__USE_CASE:
				getUseCase().clear();
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
			case RequirementsPackage.REQUIREMENTS_MODEL__OPERATIONAL_SITUATION:
				return operationalSituation != null && !operationalSituation.isEmpty();
			case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT:
				return requirement != null && !requirement.isEmpty();
			case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT_CONTAINER:
				return requirementContainer != null && !requirementContainer.isEmpty();
			case RequirementsPackage.REQUIREMENTS_MODEL__USE_CASE:
				return useCase != null && !useCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementsModelImpl
