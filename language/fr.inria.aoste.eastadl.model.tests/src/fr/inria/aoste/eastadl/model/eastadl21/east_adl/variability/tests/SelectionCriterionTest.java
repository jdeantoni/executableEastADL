/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.tests;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.tests.FormulaExpressionTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.SelectionCriterion;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Selection Criterion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectionCriterionTest extends FormulaExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelectionCriterionTest.class);
	}

	/**
	 * Constructs a new Selection Criterion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionCriterionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Selection Criterion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SelectionCriterion getFixture() {
		return (SelectionCriterion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VariabilityFactory.eINSTANCE.createSelectionCriterion());
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

} //SelectionCriterionTest
