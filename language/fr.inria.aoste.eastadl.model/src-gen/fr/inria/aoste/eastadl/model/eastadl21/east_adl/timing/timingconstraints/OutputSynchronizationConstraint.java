/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Synchronization Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.OutputSynchronizationConstraint#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getOutputSynchronizationConstraint()
 * @model
 * @generated
 */
public interface OutputSynchronizationConstraint extends ReactionConstraint {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(TimeDuration)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getOutputSynchronizationConstraint_Width()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeDuration getWidth();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.OutputSynchronizationConstraint#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(TimeDuration value);

} // OutputSynchronizationConstraint
