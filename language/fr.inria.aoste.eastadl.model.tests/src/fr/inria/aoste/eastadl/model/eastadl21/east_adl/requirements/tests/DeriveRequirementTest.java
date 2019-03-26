/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.DeriveRequirement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Derive Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeriveRequirementTest extends RequirementsRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeriveRequirementTest.class);
	}

	/**
	 * Constructs a new Derive Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeriveRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Derive Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeriveRequirement getFixture() {
		return (DeriveRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RequirementsFactory.eINSTANCE.createDeriveRequirement());
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

} //DeriveRequirementTest
