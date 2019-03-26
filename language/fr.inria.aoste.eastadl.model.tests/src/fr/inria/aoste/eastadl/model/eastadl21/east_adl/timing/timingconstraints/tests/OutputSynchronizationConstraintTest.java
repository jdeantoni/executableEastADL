/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.OutputSynchronizationConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Output Synchronization Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputSynchronizationConstraintTest extends ReactionConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutputSynchronizationConstraintTest.class);
	}

	/**
	 * Constructs a new Output Synchronization Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSynchronizationConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Output Synchronization Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OutputSynchronizationConstraint getFixture() {
		return (OutputSynchronizationConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimingconstraintsFactory.eINSTANCE.createOutputSynchronizationConstraint());
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

} //OutputSynchronizationConstraintTest
