/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimeDuration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arbitrary Event Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.ArbitraryEventConstraint#getMinimumInterArrivalTime <em>Minimum Inter Arrival Time</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.ArbitraryEventConstraint#getMaximumInterArrivalTime <em>Maximum Inter Arrival Time</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getArbitraryEventConstraint()
 * @model
 * @generated
 */
public interface ArbitraryEventConstraint extends EventConstraint {
	/**
	 * Returns the value of the '<em><b>Minimum Inter Arrival Time</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimeDuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Inter Arrival Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Inter Arrival Time</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getArbitraryEventConstraint_MinimumInterArrivalTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimeDuration> getMinimumInterArrivalTime();

	/**
	 * Returns the value of the '<em><b>Maximum Inter Arrival Time</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimeDuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Inter Arrival Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Inter Arrival Time</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getArbitraryEventConstraint_MaximumInterArrivalTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimeDuration> getMaximumInterArrivalTime();

} // ArbitraryEventConstraint
