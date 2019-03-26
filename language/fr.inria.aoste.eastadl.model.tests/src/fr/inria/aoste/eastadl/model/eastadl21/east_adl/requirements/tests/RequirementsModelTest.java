/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.ContextTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsModel;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsModelTest extends ContextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequirementsModelTest.class);
	}

	/**
	 * Constructs a new Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequirementsModel getFixture() {
		return (RequirementsModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RequirementsFactory.eINSTANCE.createRequirementsModel());
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

} //RequirementsModelTest
