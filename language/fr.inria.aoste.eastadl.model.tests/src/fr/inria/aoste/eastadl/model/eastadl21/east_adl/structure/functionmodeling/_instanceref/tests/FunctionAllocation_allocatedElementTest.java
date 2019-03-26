/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.tests;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.tests.AtpInstanceRefTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Allocation allocated Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionAllocation_allocatedElementTest extends AtpInstanceRefTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionAllocation_allocatedElementTest.class);
	}

	/**
	 * Constructs a new Function Allocation allocated Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionAllocation_allocatedElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Allocation allocated Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionAllocation_allocatedElement getFixture() {
		return (FunctionAllocation_allocatedElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(_instancerefFactory.eINSTANCE.createFunctionAllocation_allocatedElement());
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

} //FunctionAllocation_allocatedElementTest
