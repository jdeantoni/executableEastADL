/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.TraceableSpecificationTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quantitative Safety Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantitativeSafetyConstraintTest extends TraceableSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuantitativeSafetyConstraintTest.class);
	}

	/**
	 * Constructs a new Quantitative Safety Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitativeSafetyConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Quantitative Safety Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QuantitativeSafetyConstraint getFixture() {
		return (QuantitativeSafetyConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SafetyconstraintsFactory.eINSTANCE.createQuantitativeSafetyConstraint());
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

} //QuantitativeSafetyConstraintTest
