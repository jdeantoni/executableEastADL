/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementSpecificationObject;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RIF Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFArea#getInterchangeReqSpecObject <em>Interchange Req Spec Object</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFArea#getRootRequirementContainer <em>Root Requirement Container</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFArea#getUserDefinedType <em>User Defined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.InterchangePackage#getRIFArea()
 * @model abstract="true"
 * @generated
 */
public interface RIFArea extends Context {
	/**
	 * Returns the value of the '<em><b>Interchange Req Spec Object</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementSpecificationObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interchange Req Spec Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interchange Req Spec Object</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.InterchangePackage#getRIFArea_InterchangeReqSpecObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementSpecificationObject> getInterchangeReqSpecObject();

	/**
	 * Returns the value of the '<em><b>Root Requirement Container</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Requirement Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Requirement Container</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.InterchangePackage#getRIFArea_RootRequirementContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementsContainer> getRootRequirementContainer();

	/**
	 * Returns the value of the '<em><b>User Defined Type</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Type</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.InterchangePackage#getRIFArea_UserDefinedType()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserAttributeElementType> getUserDefinedType();

} // RIFArea
