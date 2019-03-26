/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehavior;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.ContextTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Behavior</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionBehaviorTest extends ContextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionBehaviorTest.class);
	}

	/**
	 * Constructs a new Function Behavior test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehaviorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Behavior test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionBehavior getFixture() {
		return (FunctionBehavior)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviorFactory.eINSTANCE.createFunctionBehavior());
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

} //FunctionBehaviorTest
