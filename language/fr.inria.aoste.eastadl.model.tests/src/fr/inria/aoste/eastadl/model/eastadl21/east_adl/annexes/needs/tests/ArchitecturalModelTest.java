/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.ArchitecturalModel;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Architectural Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitecturalModelTest extends ConceptTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArchitecturalModelTest.class);
	}

	/**
	 * Constructs a new Architectural Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Architectural Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArchitecturalModel getFixture() {
		return (ArchitecturalModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NeedsFactory.eINSTANCE.createArchitecturalModel());
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

} //ArchitecturalModelTest
