/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage
 * @generated
 */
public interface TimingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimingFactory eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Event Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Chain</em>'.
	 * @generated
	 */
	EventChain createEventChain();

	/**
	 * Returns a new object of class '<em>Execution Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Time Constraint</em>'.
	 * @generated
	 */
	ExecutionTimeConstraint createExecutionTimeConstraint();

	/**
	 * Returns a new object of class '<em>Precedence Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precedence Constraint</em>'.
	 * @generated
	 */
	PrecedenceConstraint createPrecedenceConstraint();

	/**
	 * Returns a new object of class '<em>Time Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Duration</em>'.
	 * @generated
	 */
	TimeDuration createTimeDuration();

	/**
	 * Returns a new object of class '<em>Timing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing</em>'.
	 * @generated
	 */
	Timing createTiming();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimingPackage getTimingPackage();

} //TimingFactory
