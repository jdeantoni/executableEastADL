/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.DatatypesFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EAInteger;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EA Integer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EAIntegerTest extends RangeableDatatypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EAIntegerTest.class);
	}

	/**
	 * Constructs a new EA Integer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAIntegerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this EA Integer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EAInteger getFixture() {
		return (EAInteger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatatypesFactory.eINSTANCE.createEAInteger());
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

} //EAIntegerTest
