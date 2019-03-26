/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.ContextTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureModelTest extends ContextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeatureModelTest.class);
	}

	/**
	 * Constructs a new Feature Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feature Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeatureModel getFixture() {
		return (FeatureModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeaturemodelingFactory.eINSTANCE.createFeatureModel());
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

} //FeatureModelTest
