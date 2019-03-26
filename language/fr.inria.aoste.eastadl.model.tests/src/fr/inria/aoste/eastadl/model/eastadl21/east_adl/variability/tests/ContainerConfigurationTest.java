/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ContainerConfiguration;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Container Configuration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerConfigurationTest extends ConfigurationDecisionModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContainerConfigurationTest.class);
	}

	/**
	 * Constructs a new Container Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Container Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContainerConfiguration getFixture() {
		return (ContainerConfiguration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VariabilityFactory.eINSTANCE.createContainerConfiguration());
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

} //ContainerConfigurationTest
