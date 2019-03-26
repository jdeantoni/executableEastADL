/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>functionmodeling</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionmodelingTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new FunctionmodelingTests("functionmodeling Tests");
		suite.addTestSuite(AnalysisFunctionPrototypeTest.class);
		suite.addTestSuite(DesignFunctionPrototypeTest.class);
		suite.addTestSuite(FunctionClientServerPortProxyTest.class);
		suite.addTestSuite(FunctionFlowPortProxyTest.class);
		suite.addTestSuite(FunctionPowerPortProxyTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionmodelingTests(String name) {
		super(name);
	}

} //FunctionmodelingTests
