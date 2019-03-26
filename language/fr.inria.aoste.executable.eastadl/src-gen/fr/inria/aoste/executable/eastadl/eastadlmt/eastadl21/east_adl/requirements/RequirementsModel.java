/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Context;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.usecases.UseCase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel#getOperationalSituation <em>Operational Situation</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel#getRequirementContainer <em>Requirement Container</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel#getUseCase <em>Use Case</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage#getRequirementsModel()
 * @model
 * @generated
 */
public interface RequirementsModel extends Context {
	/**
	 * Returns the value of the '<em><b>Operational Situation</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.OperationalSituation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Situation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Situation</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage#getRequirementsModel_OperationalSituation()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationalSituation> getOperationalSituation();

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementSpecificationObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage#getRequirementsModel_Requirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementSpecificationObject> getRequirement();

	/**
	 * Returns the value of the '<em><b>Requirement Container</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Container</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage#getRequirementsModel_RequirementContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementsContainer> getRequirementContainer();

	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.usecases.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage#getRequirementsModel_UseCase()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCase> getUseCase();

} // RequirementsModel
