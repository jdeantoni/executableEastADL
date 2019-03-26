/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPortProxy;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionConnector_port;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Connector port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.impl.FunctionConnector_portImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.impl.FunctionConnector_portImpl#getFunctionPort <em>Function Port</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.impl.FunctionConnector_portImpl#getFunctionPortProxy <em>Function Port Proxy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionConnector_portImpl extends EObjectImpl implements FunctionConnector_port {
	/**
	 * The cached value of the '{@link #getFunctionPrototype() <em>Function Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPrototype()
	 * @generated
	 * @ordered
	 */
	protected FunctionPrototype functionPrototype;

	/**
	 * The cached value of the '{@link #getFunctionPort() <em>Function Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionPort functionPort;

	/**
	 * The cached value of the '{@link #getFunctionPortProxy() <em>Function Port Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPortProxy()
	 * @generated
	 * @ordered
	 */
	protected FunctionPortProxy functionPortProxy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionConnector_portImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.FUNCTION_CONNECTOR_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPrototype getFunctionPrototype() {
		if (functionPrototype != null && functionPrototype.eIsProxy()) {
			InternalEObject oldFunctionPrototype = (InternalEObject)functionPrototype;
			functionPrototype = (FunctionPrototype)eResolveProxy(oldFunctionPrototype);
			if (functionPrototype != oldFunctionPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
			}
		}
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPrototype basicGetFunctionPrototype() {
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionPrototype(FunctionPrototype newFunctionPrototype) {
		FunctionPrototype oldFunctionPrototype = functionPrototype;
		functionPrototype = newFunctionPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort getFunctionPort() {
		if (functionPort != null && functionPort.eIsProxy()) {
			InternalEObject oldFunctionPort = (InternalEObject)functionPort;
			functionPort = (FunctionPort)eResolveProxy(oldFunctionPort);
			if (functionPort != oldFunctionPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT, oldFunctionPort, functionPort));
			}
		}
		return functionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort basicGetFunctionPort() {
		return functionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionPort(FunctionPort newFunctionPort) {
		FunctionPort oldFunctionPort = functionPort;
		functionPort = newFunctionPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT, oldFunctionPort, functionPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPortProxy getFunctionPortProxy() {
		if (functionPortProxy != null && functionPortProxy.eIsProxy()) {
			InternalEObject oldFunctionPortProxy = (InternalEObject)functionPortProxy;
			functionPortProxy = (FunctionPortProxy)eResolveProxy(oldFunctionPortProxy);
			if (functionPortProxy != oldFunctionPortProxy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT_PROXY, oldFunctionPortProxy, functionPortProxy));
			}
		}
		return functionPortProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPortProxy basicGetFunctionPortProxy() {
		return functionPortProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionPortProxy(FunctionPortProxy newFunctionPortProxy) {
		FunctionPortProxy oldFunctionPortProxy = functionPortProxy;
		functionPortProxy = newFunctionPortProxy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT_PROXY, oldFunctionPortProxy, functionPortProxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				if (resolve) return getFunctionPrototype();
				return basicGetFunctionPrototype();
			case _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
				if (resolve) return getFunctionPort();
				return basicGetFunctionPort();
			case _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT_PROXY:
				if (resolve) return getFunctionPortProxy();
				return basicGetFunctionPortProxy();
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
			case _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				setFunctionPrototype((FunctionPrototype)newValue);
				return;
			case _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
				setFunctionPort((FunctionPort)newValue);
				return;
			case _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT_PROXY:
				setFunctionPortProxy((FunctionPortProxy)newValue);
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
			case _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				setFunctionPrototype((FunctionPrototype)null);
				return;
			case _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
				setFunctionPort((FunctionPort)null);
				return;
			case _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT_PROXY:
				setFunctionPortProxy((FunctionPortProxy)null);
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
			case _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				return functionPrototype != null;
			case _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
				return functionPort != null;
			case _instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT_PROXY:
				return functionPortProxy != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionConnector_portImpl
