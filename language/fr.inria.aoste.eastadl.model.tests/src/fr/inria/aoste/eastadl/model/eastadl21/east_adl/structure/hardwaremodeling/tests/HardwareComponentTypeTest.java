/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.ContextTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentType;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hardware Component Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareComponentTypeTest extends ContextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HardwareComponentTypeTest.class);
	}

	/**
	 * Constructs a new Hardware Component Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hardware Component Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HardwareComponentType getFixture() {
		return (HardwareComponentType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HardwaremodelingFactory.eINSTANCE.createHardwareComponentType());
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

} //HardwareComponentTypeTest
