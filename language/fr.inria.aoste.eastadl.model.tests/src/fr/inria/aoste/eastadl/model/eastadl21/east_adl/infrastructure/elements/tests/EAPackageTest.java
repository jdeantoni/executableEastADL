/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EA Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EAPackageTest extends EAElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EAPackageTest.class);
	}

	/**
	 * Constructs a new EA Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this EA Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EAPackage getFixture() {
		return (EAPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ElementsFactory.eINSTANCE.createEAPackage());
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

} //EAPackageTest
