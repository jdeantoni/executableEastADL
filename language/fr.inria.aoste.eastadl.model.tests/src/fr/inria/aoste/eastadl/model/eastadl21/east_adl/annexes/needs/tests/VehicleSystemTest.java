/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.VehicleSystem;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vehicle System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VehicleSystemTest extends ConceptTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VehicleSystemTest.class);
	}

	/**
	 * Constructs a new Vehicle System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleSystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Vehicle System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VehicleSystem getFixture() {
		return (VehicleSystem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NeedsFactory.eINSTANCE.createVehicleSystem());
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

} //VehicleSystemTest
