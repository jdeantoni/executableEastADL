/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraint#getState <em>State</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraint#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage#getStateMachineConstraint()
 * @model
 * @generated
 */
public interface StateMachineConstraint extends BehaviorConstraint {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage#getStateMachineConstraint_State()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage#getStateMachineConstraint_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

} // StateMachineConstraint
