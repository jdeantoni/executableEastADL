/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.InputSynchronizationConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Synchronization Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputSynchronizationConstraintTest extends AgeTimingConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputSynchronizationConstraintTest.class);
	}

	/**
	 * Constructs a new Input Synchronization Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSynchronizationConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Input Synchronization Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InputSynchronizationConstraint getFixture() {
		return (InputSynchronizationConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimingconstraintsFactory.eINSTANCE.createInputSynchronizationConstraint());
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

} //InputSynchronizationConstraintTest
