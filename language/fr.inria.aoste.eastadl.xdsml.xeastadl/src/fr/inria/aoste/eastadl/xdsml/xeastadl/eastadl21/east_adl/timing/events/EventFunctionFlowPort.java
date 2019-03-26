/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.Event;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Function Flow Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events.EventFunctionFlowPort#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events.EventsPackage#getEventFunctionFlowPort()
 * @model
 * @generated
 */
public interface EventFunctionFlowPort extends Event {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference.
	 * @see #setPort(EventFunctionFlowPort_port)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events.EventsPackage#getEventFunctionFlowPort_Port()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventFunctionFlowPort_port getPort();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events.EventFunctionFlowPort#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(EventFunctionFlowPort_port value);

} // EventFunctionFlowPort
