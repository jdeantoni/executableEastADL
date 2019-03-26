/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.GenericconstraintsFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.TakeRateConstraint;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Take Rate Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TakeRateConstraintTest extends GenericConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TakeRateConstraintTest.class);
	}

	/**
	 * Constructs a new Take Rate Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TakeRateConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Take Rate Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TakeRateConstraint getFixture() {
		return (TakeRateConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GenericconstraintsFactory.eINSTANCE.createTakeRateConstraint());
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

} //TakeRateConstraintTest
