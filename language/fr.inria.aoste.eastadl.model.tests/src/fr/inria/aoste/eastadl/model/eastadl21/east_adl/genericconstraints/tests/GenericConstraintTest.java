/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.GenericConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.GenericconstraintsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.TraceableSpecificationTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generic Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericConstraintTest extends TraceableSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GenericConstraintTest.class);
	}

	/**
	 * Constructs a new Generic Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generic Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GenericConstraint getFixture() {
		return (GenericConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GenericconstraintsFactory.eINSTANCE.createGenericConstraint());
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

} //GenericConstraintTest
