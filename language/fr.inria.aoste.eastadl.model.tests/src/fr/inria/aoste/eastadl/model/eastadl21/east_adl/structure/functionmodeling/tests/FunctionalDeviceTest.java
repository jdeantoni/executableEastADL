/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionalDevice;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Functional Device</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalDeviceTest extends AnalysisFunctionTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionalDeviceTest.class);
	}

	/**
	 * Constructs a new Functional Device test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDeviceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Functional Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionalDevice getFixture() {
		return (FunctionalDevice)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FunctionmodelingFactory.eINSTANCE.createFunctionalDevice());
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

} //FunctionalDeviceTest
