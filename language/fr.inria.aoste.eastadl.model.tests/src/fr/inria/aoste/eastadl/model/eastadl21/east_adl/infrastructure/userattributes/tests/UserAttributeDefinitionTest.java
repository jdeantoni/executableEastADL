/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.EAElementTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserattributesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserAttributeDefinitionTest extends EAElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserAttributeDefinitionTest.class);
	}

	/**
	 * Constructs a new User Attribute Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAttributeDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this User Attribute Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UserAttributeDefinition getFixture() {
		return (UserAttributeDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UserattributesFactory.eINSTANCE.createUserAttributeDefinition());
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

} //UserAttributeDefinitionTest
