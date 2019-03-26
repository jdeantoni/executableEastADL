/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.tests;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.tests.AbstractstructureTests;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.tests.SystemtemplateTests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.tests._instancerefTests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.tests.FunctionmodelingTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Eastadl2110</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class Eastadl2110AllTests extends TestSuite {

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
		TestSuite suite = new Eastadl2110AllTests("Eastadl2110 Tests");
		suite.addTest(FunctionmodelingTests.suite());
		suite.addTest(_instancerefTests.suite());
		suite.addTest(AbstractstructureTests.suite());
		suite.addTest(SystemtemplateTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eastadl2110AllTests(String name) {
		super(name);
	}

} //Eastadl2110AllTests
