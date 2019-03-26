/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Event;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.EventConstraint#getOffset <em>Offset</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.EventConstraint#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getEventConstraint()
 * @model abstract="true"
 * @generated
 */
public interface EventConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(TimeDuration)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getEventConstraint_Offset()
	 * @model containment="true"
	 * @generated
	 */
	TimeDuration getOffset();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.EventConstraint#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(TimeDuration value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getEventConstraint_Event()
	 * @model
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.EventConstraint#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // EventConstraint
