/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.BusinessOpportunity;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.TraceableSpecificationTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Opportunity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessOpportunityTest extends TraceableSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusinessOpportunityTest.class);
	}

	/**
	 * Constructs a new Business Opportunity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessOpportunityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Business Opportunity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusinessOpportunity getFixture() {
		return (BusinessOpportunity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NeedsFactory.eINSTANCE.createBusinessOpportunity());
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

} //BusinessOpportunityTest
