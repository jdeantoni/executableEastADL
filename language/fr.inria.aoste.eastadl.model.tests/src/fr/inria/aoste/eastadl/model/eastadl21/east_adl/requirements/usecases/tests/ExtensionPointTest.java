/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.ExtensionPoint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.UsecasesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Extension Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionPointTest extends RedefinableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExtensionPointTest.class);
	}

	/**
	 * Constructs a new Extension Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Extension Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExtensionPoint getFixture() {
		return (ExtensionPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsecasesFactory.eINSTANCE.createExtensionPoint());
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

} //ExtensionPointTest
