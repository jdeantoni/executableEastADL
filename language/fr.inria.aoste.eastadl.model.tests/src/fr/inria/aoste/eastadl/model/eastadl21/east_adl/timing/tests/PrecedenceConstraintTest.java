/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.PrecedenceConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Precedence Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrecedenceConstraintTest extends TimingConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrecedenceConstraintTest.class);
	}

	/**
	 * Constructs a new Precedence Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Precedence Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrecedenceConstraint getFixture() {
		return (PrecedenceConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimingFactory.eINSTANCE.createPrecedenceConstraint());
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

} //PrecedenceConstraintTest
