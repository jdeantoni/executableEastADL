/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.EAElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fault Failure Propagation Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FaultFailurePropagationLinkTest extends EAElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FaultFailurePropagationLinkTest.class);
	}

	/**
	 * Constructs a new Fault Failure Propagation Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePropagationLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fault Failure Propagation Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FaultFailurePropagationLink getFixture() {
		return (FaultFailurePropagationLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ErrormodelFactory.eINSTANCE.createFaultFailurePropagationLink());
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

} //FaultFailurePropagationLinkTest
