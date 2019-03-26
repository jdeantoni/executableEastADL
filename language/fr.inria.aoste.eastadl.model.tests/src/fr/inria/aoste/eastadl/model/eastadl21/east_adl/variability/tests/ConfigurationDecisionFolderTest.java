/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ConfigurationDecisionFolder;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Configuration Decision Folder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationDecisionFolderTest extends ConfigurationDecisionModelEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfigurationDecisionFolderTest.class);
	}

	/**
	 * Constructs a new Configuration Decision Folder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationDecisionFolderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Configuration Decision Folder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConfigurationDecisionFolder getFixture() {
		return (ConfigurationDecisionFolder)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VariabilityFactory.eINSTANCE.createConfigurationDecisionFolder());
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

} //ConfigurationDecisionFolderTest
