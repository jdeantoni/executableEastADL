/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunction;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.tests.EventTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventFunctionTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventFunctionTest.class);
	}

	/**
	 * Constructs a new Event Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Event Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EventFunction getFixture() {
		return (EventFunction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EventsFactory.eINSTANCE.createEventFunction());
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

} //EventFunctionTest
