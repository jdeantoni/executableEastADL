/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.tests.FeatureTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vehicle Feature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VehicleFeatureTest extends FeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VehicleFeatureTest.class);
	}

	/**
	 * Constructs a new Vehicle Feature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleFeatureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Vehicle Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VehicleFeature getFixture() {
		return (VehicleFeature)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VehiclefeaturemodelingFactory.eINSTANCE.createVehicleFeature());
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

} //VehicleFeatureTest
