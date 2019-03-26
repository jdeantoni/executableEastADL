/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.TraceableSpecificationTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsRelationGroup;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsRelationGroupTest extends TraceableSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequirementsRelationGroupTest.class);
	}

	/**
	 * Constructs a new Relation Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsRelationGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequirementsRelationGroup getFixture() {
		return (RequirementsRelationGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RequirementsFactory.eINSTANCE.createRequirementsRelationGroup());
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

} //RequirementsRelationGroupTest
