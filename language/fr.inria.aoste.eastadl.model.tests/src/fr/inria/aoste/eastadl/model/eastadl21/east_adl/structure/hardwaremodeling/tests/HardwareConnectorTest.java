/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.EAElementTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnector;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hardware Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareConnectorTest extends EAElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HardwareConnectorTest.class);
	}

	/**
	 * Constructs a new Hardware Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hardware Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HardwareConnector getFixture() {
		return (HardwareConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HardwaremodelingFactory.eINSTANCE.createHardwareConnector());
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

} //HardwareConnectorTest
