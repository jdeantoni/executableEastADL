/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Behavior;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.ContextTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorTest extends ContextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BehaviorTest.class);
	}

	/**
	 * Constructs a new Behavior test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Behavior test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Behavior getFixture() {
		return (Behavior)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviorFactory.eINSTANCE.createBehavior());
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

} //BehaviorTest
