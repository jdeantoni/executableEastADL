/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage
 * @generated
 */
public interface BehaviorconstraintsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorconstraintsFactory eINSTANCE = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.impl.BehaviorconstraintsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behavior Annex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Annex</em>'.
	 * @generated
	 */
	BehaviorAnnex createBehaviorAnnex();

	/**
	 * Returns a new object of class '<em>State Machine Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine Constraint</em>'.
	 * @generated
	 */
	StateMachineConstraint createStateMachineConstraint();

	/**
	 * Returns a new object of class '<em>Computation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computation Constraint</em>'.
	 * @generated
	 */
	ComputationConstraint createComputationConstraint();

	/**
	 * Returns a new object of class '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow</em>'.
	 * @generated
	 */
	Flow createFlow();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Parameter Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Condition</em>'.
	 * @generated
	 */
	ParameterCondition createParameterCondition();

	/**
	 * Returns a new object of class '<em>Parameter Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Constraint</em>'.
	 * @generated
	 */
	ParameterConstraint createParameterConstraint();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviorconstraintsPackage getBehaviorconstraintsPackage();

} //BehaviorconstraintsFactory
