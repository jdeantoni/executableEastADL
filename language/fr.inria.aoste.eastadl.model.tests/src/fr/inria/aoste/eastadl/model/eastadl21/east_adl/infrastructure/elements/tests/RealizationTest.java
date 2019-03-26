/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Realization;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealizationTest extends RelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RealizationTest.class);
	}

	/**
	 * Constructs a new Realization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Realization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Realization getFixture() {
		return (Realization)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ElementsFactory.eINSTANCE.createRealization());
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

} //RealizationTest
