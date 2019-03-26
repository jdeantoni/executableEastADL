/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Requirement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Safety Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.FunctionalSafetyConcept#getFunctionalSafetyRequirement <em>Functional Safety Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage#getFunctionalSafetyConcept()
 * @model
 * @generated
 */
public interface FunctionalSafetyConcept extends RequirementsContainer {
	/**
	 * Returns the value of the '<em><b>Functional Safety Requirement</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Safety Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Safety Requirement</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage#getFunctionalSafetyConcept_FunctionalSafetyRequirement()
	 * @model
	 * @generated
	 */
	EList<Requirement> getFunctionalSafetyRequirement();

} // FunctionalSafetyConcept
