/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycaseFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.Warrant;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.TraceableSpecificationTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Warrant</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WarrantTest extends TraceableSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WarrantTest.class);
	}

	/**
	 * Constructs a new Warrant test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarrantTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Warrant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Warrant getFixture() {
		return (Warrant)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SafetycaseFactory.eINSTANCE.createWarrant());
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

} //WarrantTest
