/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatype;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.DatatypesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Datatype</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeDatatypeTest extends EADatatypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeDatatypeTest.class);
	}

	/**
	 * Constructs a new Composite Datatype test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDatatypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite Datatype test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeDatatype getFixture() {
		return (CompositeDatatype)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatatypesFactory.eINSTANCE.createCompositeDatatype());
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

} //CompositeDatatypeTest
