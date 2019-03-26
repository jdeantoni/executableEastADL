/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.tests;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.tests.AtpStructureElementTest;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.SystemtemplateFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemTest extends AtpStructureElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemTest.class);
	}

	/**
	 * Constructs a new System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System getFixture() {
		return (fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemtemplateFactory.eINSTANCE.createSystem());
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

} //SystemTest
