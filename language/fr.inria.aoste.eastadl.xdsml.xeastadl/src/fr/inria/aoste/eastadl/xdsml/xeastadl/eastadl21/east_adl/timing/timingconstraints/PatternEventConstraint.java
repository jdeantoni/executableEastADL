/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Event Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint#getMinimumInterArrivalTime <em>Minimum Inter Arrival Time</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint#getJitter <em>Jitter</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getPatternEventConstraint()
 * @model
 * @generated
 */
public interface PatternEventConstraint extends EventConstraint {
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
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getPatternEventConstraint_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeDuration getPeriod();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(TimeDuration value);

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
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getPatternEventConstraint_MinimumInterArrivalTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeDuration getMinimumInterArrivalTime();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint#getMinimumInterArrivalTime <em>Minimum Inter Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Inter Arrival Time</em>' containment reference.
	 * @see #getMinimumInterArrivalTime()
	 * @generated
	 */
	void setMinimumInterArrivalTime(TimeDuration value);

	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getPatternEventConstraint_Occurrence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimeDuration> getOccurrence();

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
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getPatternEventConstraint_Jitter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeDuration getJitter();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint#getJitter <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' containment reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(TimeDuration value);

} // PatternEventConstraint
