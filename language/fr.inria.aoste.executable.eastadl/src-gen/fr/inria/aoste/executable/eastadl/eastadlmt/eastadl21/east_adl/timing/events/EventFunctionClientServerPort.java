/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.Event;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionClientServerPort_port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Function Client Server Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPort#getEventKind <em>Event Kind</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPort#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage#getEventFunctionClientServerPort()
 * @model
 * @generated
 */
public interface EventFunctionClientServerPort extends Event {
	/**
	 * Returns the value of the '<em><b>Event Kind</b></em>' attribute.
	 * The default value is <code>"RECEIVEDREQUEST"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPortKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Kind</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPortKind
	 * @see #isSetEventKind()
	 * @see #unsetEventKind()
	 * @see #setEventKind(EventFunctionClientServerPortKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage#getEventFunctionClientServerPort_EventKind()
	 * @model default="RECEIVEDREQUEST" unsettable="true" required="true"
	 * @generated
	 */
	EventFunctionClientServerPortKind getEventKind();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPort#getEventKind <em>Event Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Kind</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPortKind
	 * @see #isSetEventKind()
	 * @see #unsetEventKind()
	 * @see #getEventKind()
	 * @generated
	 */
	void setEventKind(EventFunctionClientServerPortKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPort#getEventKind <em>Event Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventKind()
	 * @see #getEventKind()
	 * @see #setEventKind(EventFunctionClientServerPortKind)
	 * @generated
	 */
	void unsetEventKind();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPort#getEventKind <em>Event Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Kind</em>' attribute is set.
	 * @see #unsetEventKind()
	 * @see #getEventKind()
	 * @see #setEventKind(EventFunctionClientServerPortKind)
	 * @generated
	 */
	boolean isSetEventKind();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference.
	 * @see #setPort(EventFunctionClientServerPort_port)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage#getEventFunctionClientServerPort_Port()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventFunctionClientServerPort_port getPort();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPort#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(EventFunctionClientServerPort_port value);

} // EventFunctionClientServerPort
