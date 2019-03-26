/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VehicleLevelBinding;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vehicle Level Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VehicleLevelBindingTest extends ConfigurationDecisionModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VehicleLevelBindingTest.class);
	}

	/**
	 * Constructs a new Vehicle Level Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleLevelBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Vehicle Level Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VehicleLevelBinding getFixture() {
		return (VehicleLevelBinding)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VariabilityFactory.eINSTANCE.createVehicleLevelBinding());
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

} //VehicleLevelBindingTest
