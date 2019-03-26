/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortProxy;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Client Server Port Proxy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionClientServerPortProxyTest extends FunctionPortProxyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionClientServerPortProxyTest.class);
	}

	/**
	 * Constructs a new Function Client Server Port Proxy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionClientServerPortProxyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Client Server Port Proxy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionClientServerPortProxy getFixture() {
		return (FunctionClientServerPortProxy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FunctionmodelingFactory.eINSTANCE.createFunctionClientServerPortProxy());
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

} //FunctionClientServerPortProxyTest
