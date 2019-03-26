/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Fault Prototype</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessFaultPrototypeTest extends AnomalyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessFaultPrototypeTest.class);
	}

	/**
	 * Constructs a new Process Fault Prototype test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessFaultPrototypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Process Fault Prototype test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessFaultPrototype getFixture() {
		return (ProcessFaultPrototype)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ErrormodelFactory.eINSTANCE.createProcessFaultPrototype());
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

} //ProcessFaultPrototypeTest
