/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.EAElementTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariationGroup;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variation Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariationGroupTest extends EAElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariationGroupTest.class);
	}

	/**
	 * Constructs a new Variation Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariationGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variation Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VariationGroup getFixture() {
		return (VariationGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VariabilityFactory.eINSTANCE.createVariationGroup());
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

} //VariationGroupTest
