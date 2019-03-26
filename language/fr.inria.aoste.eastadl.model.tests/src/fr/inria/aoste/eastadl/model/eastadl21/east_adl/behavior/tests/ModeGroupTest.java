/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.TraceableSpecificationTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mode Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeGroupTest extends TraceableSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModeGroupTest.class);
	}

	/**
	 * Constructs a new Mode Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mode Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModeGroup getFixture() {
		return (ModeGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviorFactory.eINSTANCE.createModeGroup());
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

} //ModeGroupTest
