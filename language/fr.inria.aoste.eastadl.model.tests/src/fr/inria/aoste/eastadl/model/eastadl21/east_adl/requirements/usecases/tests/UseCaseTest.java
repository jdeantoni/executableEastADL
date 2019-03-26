/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.TraceableSpecificationTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.UseCase;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.UsecasesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseTest extends TraceableSpecificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UseCaseTest.class);
	}

	/**
	 * Constructs a new Use Case test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Use Case test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UseCase getFixture() {
		return (UseCase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsecasesFactory.eINSTANCE.createUseCase());
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

} //UseCaseTest
