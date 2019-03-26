/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.EAElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionTriggerTest extends EAElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionTriggerTest.class);
	}

	/**
	 * Constructs a new Function Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionTrigger getFixture() {
		return (FunctionTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviorFactory.eINSTANCE.createFunctionTrigger());
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

} //FunctionTriggerTest
