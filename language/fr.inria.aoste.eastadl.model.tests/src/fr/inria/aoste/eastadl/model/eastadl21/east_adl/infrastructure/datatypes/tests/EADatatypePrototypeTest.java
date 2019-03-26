/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.DatatypesFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.EAElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EA Datatype Prototype</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EADatatypePrototypeTest extends EAElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EADatatypePrototypeTest.class);
	}

	/**
	 * Constructs a new EA Datatype Prototype test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADatatypePrototypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this EA Datatype Prototype test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EADatatypePrototype getFixture() {
		return (EADatatypePrototype)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatatypesFactory.eINSTANCE.createEADatatypePrototype());
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

} //EADatatypePrototypeTest
