/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.FunctionalSafetyConcept;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.tests.RequirementsContainerTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Functional Safety Concept</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalSafetyConceptTest extends RequirementsContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionalSafetyConceptTest.class);
	}

	/**
	 * Constructs a new Functional Safety Concept test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalSafetyConceptTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Functional Safety Concept test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionalSafetyConcept getFixture() {
		return (FunctionalSafetyConcept)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SafetyrequirementFactory.eINSTANCE.createFunctionalSafetyConcept());
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

} //FunctionalSafetyConceptTest
