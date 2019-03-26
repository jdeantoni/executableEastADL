/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.tests;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.tests.AtpInstanceRefTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_target;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Allocation target</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionAllocation_targetTest extends AtpInstanceRefTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionAllocation_targetTest.class);
	}

	/**
	 * Constructs a new Function Allocation target test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionAllocation_targetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Allocation target test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionAllocation_target getFixture() {
		return (FunctionAllocation_target)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(_instancerefFactory.eINSTANCE.createFunctionAllocation_target());
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

} //FunctionAllocation_targetTest
