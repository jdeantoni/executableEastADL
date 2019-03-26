/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VV Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVTarget#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVTarget()
 * @model
 * @generated
 */
public interface VVTarget extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVTarget_Element()
	 * @model
	 * @generated
	 */
	EList<Identifiable> getElement();

} // VVTarget
