/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionFlowPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.tests.EventTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Function Flow Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventFunctionFlowPortTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventFunctionFlowPortTest.class);
	}

	/**
	 * Constructs a new Event Function Flow Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFunctionFlowPortTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Event Function Flow Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EventFunctionFlowPort getFixture() {
		return (EventFunctionFlowPort)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EventsFactory.eINSTANCE.createEventFunctionFlowPort());
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

} //EventFunctionFlowPortTest
