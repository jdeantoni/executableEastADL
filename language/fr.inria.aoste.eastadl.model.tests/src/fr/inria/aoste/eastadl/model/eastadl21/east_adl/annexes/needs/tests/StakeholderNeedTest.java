/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.StakeholderNeed;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.TraceableSpecificationTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stakeholder Need</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StakeholderNeedTest extends TraceableSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StakeholderNeedTest.class);
	}

	/**
	 * Constructs a new Stakeholder Need test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeholderNeedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stakeholder Need test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StakeholderNeed getFixture() {
		return (StakeholderNeed)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NeedsFactory.eINSTANCE.createStakeholderNeed());
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

} //StakeholderNeedTest
