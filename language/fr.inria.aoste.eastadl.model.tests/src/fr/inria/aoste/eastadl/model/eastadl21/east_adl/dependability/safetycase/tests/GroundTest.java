/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.Ground;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycaseFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.TraceableSpecificationTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ground</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroundTest extends TraceableSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GroundTest.class);
	}

	/**
	 * Constructs a new Ground test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ground test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Ground getFixture() {
		return (Ground)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SafetycaseFactory.eINSTANCE.createGround());
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

} //GroundTest
