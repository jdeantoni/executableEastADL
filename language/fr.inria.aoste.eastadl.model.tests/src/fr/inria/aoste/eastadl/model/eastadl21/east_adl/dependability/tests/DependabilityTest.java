/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.Dependability;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DependabilityFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.ContextTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dependability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependabilityTest extends ContextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DependabilityTest.class);
	}

	/**
	 * Constructs a new Dependability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dependability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Dependability getFixture() {
		return (Dependability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DependabilityFactory.eINSTANCE.createDependability());
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

} //DependabilityTest
