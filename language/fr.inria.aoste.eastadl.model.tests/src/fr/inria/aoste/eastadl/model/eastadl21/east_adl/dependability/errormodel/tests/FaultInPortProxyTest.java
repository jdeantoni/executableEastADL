/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultInPortProxy;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fault In Port Proxy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FaultInPortProxyTest extends FaultFailurePortProxyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FaultInPortProxyTest.class);
	}

	/**
	 * Constructs a new Fault In Port Proxy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultInPortProxyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fault In Port Proxy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FaultInPortProxy getFixture() {
		return (FaultInPortProxy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ErrormodelFactory.eINSTANCE.createFaultInPortProxy());
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

} //FaultInPortProxyTest
