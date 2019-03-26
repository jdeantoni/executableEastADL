/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.EventFunctionClientServerPort_port;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref._instancerefPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Function Client Server Port port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.impl.EventFunctionClientServerPort_portImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.impl.EventFunctionClientServerPort_portImpl#getFunctionClientServerPort <em>Function Client Server Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventFunctionClientServerPort_portImpl extends MinimalEObjectImpl.Container implements EventFunctionClientServerPort_port {
	/**
	 * The cached value of the '{@link #getFunctionPrototype() <em>Function Prototype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPrototype()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPrototype> functionPrototype;

	/**
	 * The cached value of the '{@link #getFunctionClientServerPort() <em>Function Client Server Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionClientServerPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionClientServerPort functionClientServerPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventFunctionClientServerPort_portImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPrototype> getFunctionPrototype() {
		if (functionPrototype == null) {
			functionPrototype = new EObjectResolvingEList<FunctionPrototype>(FunctionPrototype.class, this, _instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_PROTOTYPE);
		}
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionClientServerPort getFunctionClientServerPort() {
		if (functionClientServerPort != null && functionClientServerPort.eIsProxy()) {
			InternalEObject oldFunctionClientServerPort = (InternalEObject)functionClientServerPort;
			functionClientServerPort = (FunctionClientServerPort)eResolveProxy(oldFunctionClientServerPort);
			if (functionClientServerPort != oldFunctionClientServerPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_CLIENT_SERVER_PORT, oldFunctionClientServerPort, functionClientServerPort));
			}
		}
		return functionClientServerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionClientServerPort basicGetFunctionClientServerPort() {
		return functionClientServerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionClientServerPort(FunctionClientServerPort newFunctionClientServerPort) {
		FunctionClientServerPort oldFunctionClientServerPort = functionClientServerPort;
		functionClientServerPort = newFunctionClientServerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_CLIENT_SERVER_PORT, oldFunctionClientServerPort, functionClientServerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_PROTOTYPE:
				return getFunctionPrototype();
			case _instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_CLIENT_SERVER_PORT:
				if (resolve) return getFunctionClientServerPort();
				return basicGetFunctionClientServerPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_PROTOTYPE:
				getFunctionPrototype().clear();
				getFunctionPrototype().addAll((Collection<? extends FunctionPrototype>)newValue);
				return;
			case _instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_CLIENT_SERVER_PORT:
				setFunctionClientServerPort((FunctionClientServerPort)newValue);
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
			case _instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_PROTOTYPE:
				getFunctionPrototype().clear();
				return;
			case _instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_CLIENT_SERVER_PORT:
				setFunctionClientServerPort((FunctionClientServerPort)null);
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
			case _instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_PROTOTYPE:
				return functionPrototype != null && !functionPrototype.isEmpty();
			case _instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_CLIENT_SERVER_PORT:
				return functionClientServerPort != null;
		}
		return super.eIsSet(featureID);
	}

} //EventFunctionClientServerPort_portImpl
