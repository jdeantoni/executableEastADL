/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortProxy;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Power Port Proxy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionPowerPortProxyTest extends FunctionPortProxyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionPowerPortProxyTest.class);
	}

	/**
	 * Constructs a new Function Power Port Proxy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPowerPortProxyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Power Port Proxy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionPowerPortProxy getFixture() {
		return (FunctionPowerPortProxy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FunctionmodelingFactory.eINSTANCE.createFunctionPowerPortProxy());
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

} //FunctionPowerPortProxyTest
