/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.FeatureConfiguration;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureConfigurationTest extends ConfigurationDecisionModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeatureConfigurationTest.class);
	}

	/**
	 * Constructs a new Feature Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeatureConfiguration getFixture() {
		return (FeatureConfiguration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VariabilityFactory.eINSTANCE.createFeatureConfiguration());
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

} //FeatureConfigurationTest
