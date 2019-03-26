/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.tests.RequirementsRelationshipTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.Verify;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Verify</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerifyTest extends RequirementsRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VerifyTest.class);
	}

	/**
	 * Constructs a new Verify test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Verify test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Verify getFixture() {
		return (Verify)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VerificationvalidationFactory.eINSTANCE.createVerify());
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

} //VerifyTest
