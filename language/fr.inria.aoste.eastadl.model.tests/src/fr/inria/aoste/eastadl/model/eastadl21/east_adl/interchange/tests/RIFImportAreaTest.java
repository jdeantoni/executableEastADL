/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.InterchangeFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFImportArea;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RIF Import Area</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RIFImportAreaTest extends RIFAreaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RIFImportAreaTest.class);
	}

	/**
	 * Constructs a new RIF Import Area test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIFImportAreaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RIF Import Area test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RIFImportArea getFixture() {
		return (RIFImportArea)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InterchangeFactory.eINSTANCE.createRIFImportArea());
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

} //RIFImportAreaTest
