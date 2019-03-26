/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.PrivateContent#getPrivateElement <em>Private Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage#getPrivateContent()
 * @model
 * @generated
 */
public interface PrivateContent extends EAElement {
	/**
	 * Returns the value of the '<em><b>Private Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Element</em>' reference.
	 * @see #setPrivateElement(Identifiable)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage#getPrivateContent_PrivateElement()
	 * @model required="true"
	 * @generated
	 */
	Identifiable getPrivateElement();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.PrivateContent#getPrivateElement <em>Private Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Element</em>' reference.
	 * @see #getPrivateElement()
	 * @generated
	 */
	void setPrivateElement(Identifiable value);

} // PrivateContent
