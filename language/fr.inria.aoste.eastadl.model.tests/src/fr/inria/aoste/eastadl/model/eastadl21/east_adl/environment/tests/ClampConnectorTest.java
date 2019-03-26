/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment.ClampConnector;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment.EnvironmentFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.EAElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clamp Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClampConnectorTest extends EAElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClampConnectorTest.class);
	}

	/**
	 * Constructs a new Clamp Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClampConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Clamp Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClampConnector getFixture() {
		return (ClampConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EnvironmentFactory.eINSTANCE.createClampConnector());
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

} //ClampConnectorTest
