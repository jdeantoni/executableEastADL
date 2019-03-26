/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.AgeTimingConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Age Timing Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgeTimingConstraintTest extends DelayConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AgeTimingConstraintTest.class);
	}

	/**
	 * Constructs a new Age Timing Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeTimingConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Age Timing Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AgeTimingConstraint getFixture() {
		return (AgeTimingConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimingconstraintsFactory.eINSTANCE.createAgeTimingConstraint());
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

} //AgeTimingConstraintTest
