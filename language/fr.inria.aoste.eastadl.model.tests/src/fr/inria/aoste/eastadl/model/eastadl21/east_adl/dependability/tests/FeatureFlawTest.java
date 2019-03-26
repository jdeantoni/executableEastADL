/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DependabilityFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.FeatureFlaw;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.TraceableSpecificationTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Flaw</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureFlawTest extends TraceableSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeatureFlawTest.class);
	}

	/**
	 * Constructs a new Feature Flaw test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureFlawTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Flaw test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeatureFlaw getFixture() {
		return (FeatureFlaw)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DependabilityFactory.eINSTANCE.createFeatureFlaw());
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

} //FeatureFlawTest
