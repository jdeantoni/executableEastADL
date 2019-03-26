/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycaseFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.TraceableSpecificationTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Safety Case</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyCaseTest extends TraceableSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SafetyCaseTest.class);
	}

	/**
	 * Constructs a new Safety Case test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyCaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Safety Case test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SafetyCase getFixture() {
		return (SafetyCase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SafetycaseFactory.eINSTANCE.createSafetyCase());
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

} //SafetyCaseTest
