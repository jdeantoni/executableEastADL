/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventFunctionFlowPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Function Flow Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventFunctionFlowPortImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventFunctionFlowPortImpl extends EventImpl implements EventFunctionFlowPort {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EventFunctionFlowPort_port port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventFunctionFlowPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.EVENT_FUNCTION_FLOW_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventFunctionFlowPort_port getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(EventFunctionFlowPort_port newPort, NotificationChain msgs) {
		EventFunctionFlowPort_port oldPort = port;
		port = newPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_FUNCTION_FLOW_PORT__PORT, oldPort, newPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(EventFunctionFlowPort_port newPort) {
		if (newPort != port) {
			NotificationChain msgs = null;
			if (port != null)
				msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventsPackage.EVENT_FUNCTION_FLOW_PORT__PORT, null, msgs);
			if (newPort != null)
				msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventsPackage.EVENT_FUNCTION_FLOW_PORT__PORT, null, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.EVENT_FUNCTION_FLOW_PORT__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EventsPackage.EVENT_FUNCTION_FLOW_PORT__PORT:
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
			case EventsPackage.EVENT_FUNCTION_FLOW_PORT__PORT:
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
			case EventsPackage.EVENT_FUNCTION_FLOW_PORT__PORT:
				setPort((EventFunctionFlowPort_port)newValue);
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
			case EventsPackage.EVENT_FUNCTION_FLOW_PORT__PORT:
				setPort((EventFunctionFlowPort_port)null);
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
			case EventsPackage.EVENT_FUNCTION_FLOW_PORT__PORT:
				return port != null;
		}
		return super.eIsSet(featureID);
	}

} //EventFunctionFlowPortImpl
