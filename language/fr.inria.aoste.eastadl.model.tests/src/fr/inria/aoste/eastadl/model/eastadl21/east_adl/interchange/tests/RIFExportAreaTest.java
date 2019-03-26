/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.InterchangeFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFExportArea;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RIF Export Area</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RIFExportAreaTest extends RIFAreaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RIFExportAreaTest.class);
	}

	/**
	 * Constructs a new RIF Export Area test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIFExportAreaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RIF Export Area test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RIFExportArea getFixture() {
		return (RIFExportArea)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InterchangeFactory.eINSTANCE.createRIFExportArea());
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

} //RIFExportAreaTest
