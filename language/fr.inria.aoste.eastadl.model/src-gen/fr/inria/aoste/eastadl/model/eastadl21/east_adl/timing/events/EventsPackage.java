/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventsFactory
 * @model kind="package"
 * @generated
 */
public interface EventsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "events";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/east_adl/timing/events";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventsPackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionImpl <em>Event Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventsPackageImpl#getEventFunction()
	 * @generated
	 */
	int EVENT_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__GSHORT_NAME = TimingPackage.EVENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__SHORT_NAME = TimingPackage.EVENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__CATEGORY = TimingPackage.EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__UUID = TimingPackage.EVENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__NAME = TimingPackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__OWNED_COMMENT = TimingPackage.EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Is State Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__IS_STATE_CHANGE = TimingPackage.EVENT__IS_STATE_CHANGE;

	/**
	 * The feature id for the '<em><b>Function Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__FUNCTION_TYPE = TimingPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION__FUNCTION = TimingPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FEATURE_COUNT = TimingPackage.EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_OPERATION_COUNT = TimingPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionClientServerPortImpl <em>Event Function Client Server Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionClientServerPortImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventsPackageImpl#getEventFunctionClientServerPort()
	 * @generated
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__GSHORT_NAME = TimingPackage.EVENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__SHORT_NAME = TimingPackage.EVENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__CATEGORY = TimingPackage.EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__UUID = TimingPackage.EVENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__NAME = TimingPackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__OWNED_COMMENT = TimingPackage.EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Is State Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__IS_STATE_CHANGE = TimingPackage.EVENT__IS_STATE_CHANGE;

	/**
	 * The feature id for the '<em><b>Event Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND = TimingPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT = TimingPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Function Client Server Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT_FEATURE_COUNT = TimingPackage.EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event Function Client Server Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT_OPERATION_COUNT = TimingPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionFlowPortImpl <em>Event Function Flow Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionFlowPortImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventsPackageImpl#getEventFunctionFlowPort()
	 * @generated
	 */
	int EVENT_FUNCTION_FLOW_PORT = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__GSHORT_NAME = TimingPackage.EVENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__SHORT_NAME = TimingPackage.EVENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__CATEGORY = TimingPackage.EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__UUID = TimingPackage.EVENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__NAME = TimingPackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__OWNED_COMMENT = TimingPackage.EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Is State Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__IS_STATE_CHANGE = TimingPackage.EVENT__IS_STATE_CHANGE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT__PORT = TimingPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Function Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT_FEATURE_COUNT = TimingPackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Function Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FUNCTION_FLOW_PORT_OPERATION_COUNT = TimingPackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPortKind <em>Event Function Client Server Port Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPortKind
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventsPackageImpl#getEventFunctionClientServerPortKind()
	 * @generated
	 */
	int EVENT_FUNCTION_CLIENT_SERVER_PORT_KIND = 3;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunction <em>Event Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Function</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunction
	 * @generated
	 */
	EClass getEventFunction();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunction#getFunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Type</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunction#getFunctionType()
	 * @see #getEventFunction()
	 * @generated
	 */
	EReference getEventFunction_FunctionType();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunction#getFunction()
	 * @see #getEventFunction()
	 * @generated
	 */
	EReference getEventFunction_Function();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPort <em>Event Function Client Server Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Function Client Server Port</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPort
	 * @generated
	 */
	EClass getEventFunctionClientServerPort();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPort#getEventKind <em>Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Kind</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPort#getEventKind()
	 * @see #getEventFunctionClientServerPort()
	 * @generated
	 */
	EAttribute getEventFunctionClientServerPort_EventKind();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPort#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPort#getPort()
	 * @see #getEventFunctionClientServerPort()
	 * @generated
	 */
	EReference getEventFunctionClientServerPort_Port();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionFlowPort <em>Event Function Flow Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Function Flow Port</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionFlowPort
	 * @generated
	 */
	EClass getEventFunctionFlowPort();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionFlowPort#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionFlowPort#getPort()
	 * @see #getEventFunctionFlowPort()
	 * @generated
	 */
	EReference getEventFunctionFlowPort_Port();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPortKind <em>Event Function Client Server Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Function Client Server Port Kind</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPortKind
	 * @generated
	 */
	EEnum getEventFunctionClientServerPortKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EventsFactory getEventsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionImpl <em>Event Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventsPackageImpl#getEventFunction()
		 * @generated
		 */
		EClass EVENT_FUNCTION = eINSTANCE.getEventFunction();

		/**
		 * The meta object literal for the '<em><b>Function Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_FUNCTION__FUNCTION_TYPE = eINSTANCE.getEventFunction_FunctionType();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_FUNCTION__FUNCTION = eINSTANCE.getEventFunction_Function();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionClientServerPortImpl <em>Event Function Client Server Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionClientServerPortImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventsPackageImpl#getEventFunctionClientServerPort()
		 * @generated
		 */
		EClass EVENT_FUNCTION_CLIENT_SERVER_PORT = eINSTANCE.getEventFunctionClientServerPort();

		/**
		 * The meta object literal for the '<em><b>Event Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND = eINSTANCE.getEventFunctionClientServerPort_EventKind();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT = eINSTANCE.getEventFunctionClientServerPort_Port();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionFlowPortImpl <em>Event Function Flow Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionFlowPortImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventsPackageImpl#getEventFunctionFlowPort()
		 * @generated
		 */
		EClass EVENT_FUNCTION_FLOW_PORT = eINSTANCE.getEventFunctionFlowPort();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_FUNCTION_FLOW_PORT__PORT = eINSTANCE.getEventFunctionFlowPort_Port();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPortKind <em>Event Function Client Server Port Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPortKind
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventsPackageImpl#getEventFunctionClientServerPortKind()
		 * @generated
		 */
		EEnum EVENT_FUNCTION_CLIENT_SERVER_PORT_KIND = eINSTANCE.getEventFunctionClientServerPortKind();

	}

} //EventsPackage
