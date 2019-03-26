/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.EAElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Safety Goal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyGoalTest extends EAElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SafetyGoalTest.class);
	}

	/**
	 * Constructs a new Safety Goal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyGoalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Safety Goal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SafetyGoal getFixture() {
		return (SafetyGoal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SafetyrequirementFactory.eINSTANCE.createSafetyGoal());
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

} //SafetyGoalTest
