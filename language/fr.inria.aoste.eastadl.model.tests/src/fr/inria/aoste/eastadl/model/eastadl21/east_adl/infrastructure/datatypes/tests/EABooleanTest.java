/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.DatatypesFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EABoolean;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EA Boolean</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EABooleanTest extends EADatatypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EABooleanTest.class);
	}

	/**
	 * Constructs a new EA Boolean test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EABooleanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this EA Boolean test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EABoolean getFixture() {
		return (EABoolean)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatatypesFactory.eINSTANCE.createEABoolean());
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

} //EABooleanTest
