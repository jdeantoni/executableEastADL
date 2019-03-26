/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.Architecture;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureTest extends ConceptTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArchitectureTest.class);
	}

	/**
	 * Constructs a new Architecture test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Architecture getFixture() {
		return (Architecture)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NeedsFactory.eINSTANCE.createArchitecture());
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

} //ArchitectureTest
