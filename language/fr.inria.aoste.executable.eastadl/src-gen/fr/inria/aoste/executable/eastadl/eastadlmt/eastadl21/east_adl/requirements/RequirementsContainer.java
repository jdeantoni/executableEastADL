/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainer#getContainedReqSpecObject <em>Contained Req Spec Object</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainer#getChildContainer <em>Child Container</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage#getRequirementsContainer()
 * @model
 * @generated
 */
public interface RequirementsContainer extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Contained Req Spec Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Req Spec Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Req Spec Object</em>' reference.
	 * @see #setContainedReqSpecObject(RequirementSpecificationObject)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage#getRequirementsContainer_ContainedReqSpecObject()
	 * @model
	 * @generated
	 */
	RequirementSpecificationObject getContainedReqSpecObject();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainer#getContainedReqSpecObject <em>Contained Req Spec Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Req Spec Object</em>' reference.
	 * @see #getContainedReqSpecObject()
	 * @generated
	 */
	void setContainedReqSpecObject(RequirementSpecificationObject value);

	/**
	 * Returns the value of the '<em><b>Child Container</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Container</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage#getRequirementsContainer_ChildContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementsContainer> getChildContainer();

} // RequirementsContainer
