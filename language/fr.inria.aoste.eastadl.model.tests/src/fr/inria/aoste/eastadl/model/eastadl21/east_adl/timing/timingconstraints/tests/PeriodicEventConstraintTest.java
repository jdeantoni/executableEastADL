/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.PeriodicEventConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Periodic Event Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PeriodicEventConstraintTest extends EventConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PeriodicEventConstraintTest.class);
	}

	/**
	 * Constructs a new Periodic Event Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicEventConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Periodic Event Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PeriodicEventConstraint getFixture() {
		return (PeriodicEventConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimingconstraintsFactory.eINSTANCE.createPeriodicEventConstraint());
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

} //PeriodicEventConstraintTest
