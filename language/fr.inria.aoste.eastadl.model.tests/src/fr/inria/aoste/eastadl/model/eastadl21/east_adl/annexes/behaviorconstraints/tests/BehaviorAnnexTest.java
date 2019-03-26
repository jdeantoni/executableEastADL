/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorAnnex;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.ContextTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behavior Annex</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorAnnexTest extends ContextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BehaviorAnnexTest.class);
	}

	/**
	 * Constructs a new Behavior Annex test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorAnnexTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Behavior Annex test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BehaviorAnnex getFixture() {
		return (BehaviorAnnex)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviorconstraintsFactory.eINSTANCE.createBehaviorAnnex());
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

} //BehaviorAnnexTest
