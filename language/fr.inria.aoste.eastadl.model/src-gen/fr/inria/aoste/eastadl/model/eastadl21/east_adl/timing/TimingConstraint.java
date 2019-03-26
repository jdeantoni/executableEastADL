/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint#getLower <em>Lower</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint#getUpper <em>Upper</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage#getTimingConstraint()
 * @model abstract="true"
 * @generated
 */
public interface TimingConstraint extends EAElement {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' containment reference.
	 * @see #setLower(TimeDuration)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage#getTimingConstraint_Lower()
	 * @model containment="true"
	 * @generated
	 */
	TimeDuration getLower();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint#getLower <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' containment reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(TimeDuration value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' containment reference.
	 * @see #setUpper(TimeDuration)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage#getTimingConstraint_Upper()
	 * @model containment="true"
	 * @generated
	 */
	TimeDuration getUpper();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint#getUpper <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' containment reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(TimeDuration value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage#getTimingConstraint_Mode()
	 * @model
	 * @generated
	 */
	EList<Mode> getMode();

} // TimingConstraint
