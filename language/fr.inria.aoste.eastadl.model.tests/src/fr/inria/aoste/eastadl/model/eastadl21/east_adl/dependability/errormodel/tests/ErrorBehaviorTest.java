/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.EAElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Error Behavior</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorBehaviorTest extends EAElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ErrorBehaviorTest.class);
	}

	/**
	 * Constructs a new Error Behavior test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Error Behavior test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ErrorBehavior getFixture() {
		return (ErrorBehavior)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ErrormodelFactory.eINSTANCE.createErrorBehavior());
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

} //ErrorBehaviorTest
