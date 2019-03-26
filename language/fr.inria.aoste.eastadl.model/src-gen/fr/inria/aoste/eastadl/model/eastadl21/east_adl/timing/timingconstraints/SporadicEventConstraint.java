/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sporadic Event Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraint#getMinimumInterArrivalTime <em>Minimum Inter Arrival Time</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraint#getMaximumInterArrivalTime <em>Maximum Inter Arrival Time</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraint#getJitter <em>Jitter</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraint#getPeriod <em>Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getSporadicEventConstraint()
 * @model
 * @generated
 */
public interface SporadicEventConstraint extends EventConstraint {
	/**
	 * Returns the value of the '<em><b>Minimum Inter Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Inter Arrival Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Inter Arrival Time</em>' containment reference.
	 * @see #setMinimumInterArrivalTime(TimeDuration)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getSporadicEventConstraint_MinimumInterArrivalTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeDuration getMinimumInterArrivalTime();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraint#getMinimumInterArrivalTime <em>Minimum Inter Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Inter Arrival Time</em>' containment reference.
	 * @see #getMinimumInterArrivalTime()
	 * @generated
	 */
	void setMinimumInterArrivalTime(TimeDuration value);

	/**
	 * Returns the value of the '<em><b>Maximum Inter Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Inter Arrival Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Inter Arrival Time</em>' containment reference.
	 * @see #setMaximumInterArrivalTime(TimeDuration)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getSporadicEventConstraint_MaximumInterArrivalTime()
	 * @model containment="true"
	 * @generated
	 */
	TimeDuration getMaximumInterArrivalTime();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraint#getMaximumInterArrivalTime <em>Maximum Inter Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Inter Arrival Time</em>' containment reference.
	 * @see #getMaximumInterArrivalTime()
	 * @generated
	 */
	void setMaximumInterArrivalTime(TimeDuration value);

	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' containment reference.
	 * @see #setJitter(TimeDuration)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getSporadicEventConstraint_Jitter()
	 * @model containment="true"
	 * @generated
	 */
	TimeDuration getJitter();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraint#getJitter <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' containment reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(TimeDuration value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(TimeDuration)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getSporadicEventConstraint_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeDuration getPeriod();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraint#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(TimeDuration value);

} // SporadicEventConstraint
