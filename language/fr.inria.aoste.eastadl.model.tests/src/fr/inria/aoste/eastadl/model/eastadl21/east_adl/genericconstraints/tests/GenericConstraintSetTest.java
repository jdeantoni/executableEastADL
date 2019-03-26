/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.GenericConstraintSet;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.GenericconstraintsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.ContextTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generic Constraint Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericConstraintSetTest extends ContextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GenericConstraintSetTest.class);
	}

	/**
	 * Constructs a new Generic Constraint Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericConstraintSetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generic Constraint Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GenericConstraintSet getFixture() {
		return (GenericConstraintSet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GenericconstraintsFactory.eINSTANCE.createGenericConstraintSet());
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

} //GenericConstraintSetTest
