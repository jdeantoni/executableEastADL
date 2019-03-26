/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePin;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IO Hardware Pin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IOHardwarePinTest extends HardwarePinTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IOHardwarePinTest.class);
	}

	/**
	 * Constructs a new IO Hardware Pin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOHardwarePinTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this IO Hardware Pin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IOHardwarePin getFixture() {
		return (IOHardwarePin)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HardwaremodelingFactory.eINSTANCE.createIOHardwarePin());
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

} //IOHardwarePinTest
