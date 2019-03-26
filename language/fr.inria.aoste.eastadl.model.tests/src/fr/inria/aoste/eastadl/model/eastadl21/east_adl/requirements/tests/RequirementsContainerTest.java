/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.TraceableSpecificationTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsContainer;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsContainerTest extends TraceableSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequirementsContainerTest.class);
	}

	/**
	 * Constructs a new Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsContainerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequirementsContainer getFixture() {
		return (RequirementsContainer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RequirementsFactory.eINSTANCE.createRequirementsContainer());
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

} //RequirementsContainerTest
