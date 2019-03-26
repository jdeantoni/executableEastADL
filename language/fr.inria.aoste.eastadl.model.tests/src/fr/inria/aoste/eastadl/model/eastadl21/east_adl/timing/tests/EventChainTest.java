/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Chain</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventChainTest extends TimingDescriptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventChainTest.class);
	}

	/**
	 * Constructs a new Event Chain test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChainTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Event Chain test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EventChain getFixture() {
		return (EventChain)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TimingFactory.eINSTANCE.createEventChain());
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

} //EventChainTest
