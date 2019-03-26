/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Flow;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.EAElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowTest extends EAElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FlowTest.class);
	}

	/**
	 * Constructs a new Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Flow getFixture() {
		return (Flow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviorconstraintsFactory.eINSTANCE.createFlow());
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

} //FlowTest
