/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.EAElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeTest extends EAElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModeTest.class);
	}

	/**
	 * Constructs a new Mode test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mode getFixture() {
		return (Mode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviorFactory.eINSTANCE.createMode());
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

} //ModeTest
