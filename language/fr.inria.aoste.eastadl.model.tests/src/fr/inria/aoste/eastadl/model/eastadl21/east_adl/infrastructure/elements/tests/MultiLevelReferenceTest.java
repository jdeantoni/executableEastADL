/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.MultiLevelReference;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multi Level Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiLevelReferenceTest extends RelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiLevelReferenceTest.class);
	}

	/**
	 * Constructs a new Multi Level Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLevelReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multi Level Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MultiLevelReference getFixture() {
		return (MultiLevelReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ElementsFactory.eINSTANCE.createMultiLevelReference());
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

} //MultiLevelReferenceTest
