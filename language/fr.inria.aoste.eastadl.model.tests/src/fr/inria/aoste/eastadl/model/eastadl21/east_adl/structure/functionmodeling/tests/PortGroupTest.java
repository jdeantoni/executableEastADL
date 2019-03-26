/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.tests;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.tests.EAElementTest;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.PortGroup;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Port Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortGroupTest extends EAElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PortGroupTest.class);
	}

	/**
	 * Constructs a new Port Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Port Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PortGroup getFixture() {
		return (PortGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FunctionmodelingFactory.eINSTANCE.createPortGroup());
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

} //PortGroupTest
