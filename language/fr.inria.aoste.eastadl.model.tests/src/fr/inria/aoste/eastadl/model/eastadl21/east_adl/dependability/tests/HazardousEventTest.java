/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DependabilityFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.HazardousEvent;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.TraceableSpecificationTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hazardous Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HazardousEventTest extends TraceableSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HazardousEventTest.class);
	}

	/**
	 * Constructs a new Hazardous Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardousEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hazardous Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HazardousEvent getFixture() {
		return (HazardousEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DependabilityFactory.eINSTANCE.createHazardousEvent());
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

} //HazardousEventTest
