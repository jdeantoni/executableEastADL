/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.TechnicalSafetyConcept;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.tests.RequirementsContainerTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Technical Safety Concept</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnicalSafetyConceptTest extends RequirementsContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TechnicalSafetyConceptTest.class);
	}

	/**
	 * Constructs a new Technical Safety Concept test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnicalSafetyConceptTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Technical Safety Concept test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TechnicalSafetyConcept getFixture() {
		return (TechnicalSafetyConcept)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SafetyrequirementFactory.eINSTANCE.createTechnicalSafetyConcept());
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

} //TechnicalSafetyConceptTest
