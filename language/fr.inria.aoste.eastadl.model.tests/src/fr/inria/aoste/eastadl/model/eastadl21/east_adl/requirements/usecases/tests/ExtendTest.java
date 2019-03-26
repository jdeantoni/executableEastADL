/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.RelationshipTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.Extend;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.UsecasesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendTest extends RelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExtendTest.class);
	}

	/**
	 * Constructs a new Extend test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Extend test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Extend getFixture() {
		return (Extend)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsecasesFactory.eINSTANCE.createExtend());
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

} //ExtendTest
