/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariableElement#getOptionalElement <em>Optional Element</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariableElement#getReuseMetaInformation <em>Reuse Meta Information</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariableElement#getRequiredBindingTime <em>Required Binding Time</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariableElement#getActualBindingTime <em>Actual Binding Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage#getVariableElement()
 * @model
 * @generated
 */
public interface VariableElement extends EAElement {
	/**
	 * Returns the value of the '<em><b>Optional Element</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Element</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage#getVariableElement_OptionalElement()
	 * @model required="true"
	 * @generated
	 */
	EList<Identifiable> getOptionalElement();

	/**
	 * Returns the value of the '<em><b>Reuse Meta Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reuse Meta Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reuse Meta Information</em>' containment reference.
	 * @see #setReuseMetaInformation(ReuseMetaInformation)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage#getVariableElement_ReuseMetaInformation()
	 * @model containment="true"
	 * @generated
	 */
	ReuseMetaInformation getReuseMetaInformation();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariableElement#getReuseMetaInformation <em>Reuse Meta Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reuse Meta Information</em>' containment reference.
	 * @see #getReuseMetaInformation()
	 * @generated
	 */
	void setReuseMetaInformation(ReuseMetaInformation value);

	/**
	 * Returns the value of the '<em><b>Required Binding Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Binding Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Binding Time</em>' containment reference.
	 * @see #setRequiredBindingTime(BindingTime)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage#getVariableElement_RequiredBindingTime()
	 * @model containment="true"
	 * @generated
	 */
	BindingTime getRequiredBindingTime();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariableElement#getRequiredBindingTime <em>Required Binding Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Binding Time</em>' containment reference.
	 * @see #getRequiredBindingTime()
	 * @generated
	 */
	void setRequiredBindingTime(BindingTime value);

	/**
	 * Returns the value of the '<em><b>Actual Binding Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Binding Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Binding Time</em>' containment reference.
	 * @see #setActualBindingTime(BindingTime)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage#getVariableElement_ActualBindingTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BindingTime getActualBindingTime();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariableElement#getActualBindingTime <em>Actual Binding Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Binding Time</em>' containment reference.
	 * @see #getActualBindingTime()
	 * @generated
	 */
	void setActualBindingTime(BindingTime value);

} // VariableElement
