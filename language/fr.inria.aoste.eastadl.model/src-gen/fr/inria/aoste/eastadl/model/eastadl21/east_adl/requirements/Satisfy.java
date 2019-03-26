/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.UseCase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satisfy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Satisfy#getSatisfiedRequirement <em>Satisfied Requirement</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Satisfy#getSatisfiedUseCase <em>Satisfied Use Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Satisfy#getSatisfiedBy <em>Satisfied By</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsPackage#getSatisfy()
 * @model
 * @generated
 */
public interface Satisfy extends RequirementsRelationship {
	/**
	 * Returns the value of the '<em><b>Satisfied Requirement</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfied Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied Requirement</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsPackage#getSatisfy_SatisfiedRequirement()
	 * @model
	 * @generated
	 */
	EList<Requirement> getSatisfiedRequirement();

	/**
	 * Returns the value of the '<em><b>Satisfied Use Case</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfied Use Case</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied Use Case</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsPackage#getSatisfy_SatisfiedUseCase()
	 * @model
	 * @generated
	 */
	EList<UseCase> getSatisfiedUseCase();

	/**
	 * Returns the value of the '<em><b>Satisfied By</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfied By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied By</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsPackage#getSatisfy_SatisfiedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Satisfy_satisfiedBy> getSatisfiedBy();

} // Satisfy
