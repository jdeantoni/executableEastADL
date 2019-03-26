/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.ContextTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.ImplementationLevel;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.SystemmodelingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Implementation Level</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationLevelTest extends ContextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImplementationLevelTest.class);
	}

	/**
	 * Constructs a new Implementation Level test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationLevelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Implementation Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImplementationLevel getFixture() {
		return (ImplementationLevel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemmodelingFactory.eINSTANCE.createImplementationLevel());
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

} //ImplementationLevelTest
