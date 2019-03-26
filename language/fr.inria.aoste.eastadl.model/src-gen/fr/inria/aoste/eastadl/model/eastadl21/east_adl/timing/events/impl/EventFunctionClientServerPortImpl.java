/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionClientServerPortKind;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.EventFunctionClientServerPort_port;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Function Client Server Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionClientServerPortImpl#getEventKind <em>Event Kind</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionClientServerPortImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventFunctionClientServerPortImpl extends EventImpl implements EventFunctionClientServerPort {
	/**
	 * The default value of the '{@link #getEventKind() <em>Event Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventKind()
	 * @generated
	 * @ordered
	 */
	protected static final EventFunctionClientServerPortKind EVENT_KIND_EDEFAULT = EventFunctionClientServerPortKind.RECEIVED_REQUEST;

	/**
	 * The cached value of the '{@link #getEventKind() <em>Event Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventKind()
	 * @generated
	 * @ordered
	 */
	protected EventFunctionClientServerPortKind eventKind = EVENT_KIND_EDEFAULT;

	/**
	 * This is true if the Event Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventKindESet;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EventFunctionClientServerPort_port port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventFunctionClientServerPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.EVENT_FUNCTION_CLIENT_SERVER_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFunctionClientServerPortKind getEventKind() {
		return eventKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventKind(EventFunctionClientServerPortKind newEventKind) {
		EventFunctionClientServerPortKind oldEventKind = eventKind;
		eventKind = newEventKind == null ? EVENT_KIND_EDEFAULT : newEventKind;
		boolean oldEventKindESet = eventKindESet;
		eventKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND, oldEventKind, eventKind, !oldEventKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEventKind() {
		EventFunctionClientServerPortKind oldEventKind = eventKind;
		boolean oldEventKindESet = eventKindESet;
		eventKind = EVENT_KIND_EDEFAULT;
		eventKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND, oldEventKind, EVENT_KIND_EDEFAULT, oldEventKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEventKind() {
		return eventKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFunctionClientServerPort_port getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(EventFunctionClientServerPort_port newPort, NotificationChain msgs) {
		EventFunctionClientServerPort_port oldPort = port;
		port = newPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT, oldPort, newPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(EventFunctionClientServerPort_port newPort) {
		if (newPort != port) {
			NotificationChain msgs = null;
			if (port != null)
				msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT, null, msgs);
			if (newPort != null)
				msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT, null, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT:
				return basicSetPort(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND:
				return getEventKind();
			case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT:
				return getPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND:
				setEventKind((EventFunctionClientServerPortKind)newValue);
				return;
			case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT:
				setPort((EventFunctionClientServerPort_port)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND:
				unsetEventKind();
				return;
			case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT:
				setPort((EventFunctionClientServerPort_port)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND:
				return isSetEventKind();
			case EventsPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT:
				return port != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (eventKind: ");
		if (eventKindESet) result.append(eventKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EventFunctionClientServerPortImpl
