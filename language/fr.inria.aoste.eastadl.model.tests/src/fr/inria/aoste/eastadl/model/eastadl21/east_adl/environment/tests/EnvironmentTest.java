/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment.Environment;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment.EnvironmentFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.ContextTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvironmentTest extends ContextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnvironmentTest.class);
	}

	/**
	 * Constructs a new Environment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Environment getFixture() {
		return (Environment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EnvironmentFactory.eINSTANCE.createEnvironment());
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

} //EnvironmentTest
