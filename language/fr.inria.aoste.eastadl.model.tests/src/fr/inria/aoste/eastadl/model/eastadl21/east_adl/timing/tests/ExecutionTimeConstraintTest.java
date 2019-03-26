/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.ExecutionTimeConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Execution Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionTimeConstraintTest extends TimingConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExecutionTimeConstraintTest.class);
	}

	/**
	 * Constructs a new Execution Time Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTimeConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Execution Time Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExecutionTimeConstraint getFixture() {
		return (ExecutionTimeConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimingFactory.eINSTANCE.createExecutionTimeConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ExecutionTimeConstraintTest
