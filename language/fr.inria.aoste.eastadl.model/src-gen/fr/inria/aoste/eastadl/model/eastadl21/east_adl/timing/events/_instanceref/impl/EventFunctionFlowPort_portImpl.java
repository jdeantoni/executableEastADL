/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port;
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
 * An implementation of the model object '<em><b>Event Function Flow Port port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.impl.EventFunctionFlowPort_portImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.impl.EventFunctionFlowPort_portImpl#getFunctionFlowPort <em>Function Flow Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventFunctionFlowPort_portImpl extends MinimalEObjectImpl.Container implements EventFunctionFlowPort_port {
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
	 * The cached value of the '{@link #getFunctionFlowPort() <em>Function Flow Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionFlowPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionFlowPort functionFlowPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventFunctionFlowPort_portImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.EVENT_FUNCTION_FLOW_PORT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPrototype> getFunctionPrototype() {
		if (functionPrototype == null) {
			functionPrototype = new EObjectResolvingEList<FunctionPrototype>(FunctionPrototype.class, this, _instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_PROTOTYPE);
		}
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionFlowPort getFunctionFlowPort() {
		if (functionFlowPort != null && functionFlowPort.eIsProxy()) {
			InternalEObject oldFunctionFlowPort = (InternalEObject)functionFlowPort;
			functionFlowPort = (FunctionFlowPort)eResolveProxy(oldFunctionFlowPort);
			if (functionFlowPort != oldFunctionFlowPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_FLOW_PORT, oldFunctionFlowPort, functionFlowPort));
			}
		}
		return functionFlowPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionFlowPort basicGetFunctionFlowPort() {
		return functionFlowPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionFlowPort(FunctionFlowPort newFunctionFlowPort) {
		FunctionFlowPort oldFunctionFlowPort = functionFlowPort;
		functionFlowPort = newFunctionFlowPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_FLOW_PORT, oldFunctionFlowPort, functionFlowPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_PROTOTYPE:
				return getFunctionPrototype();
			case _instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_FLOW_PORT:
				if (resolve) return getFunctionFlowPort();
				return basicGetFunctionFlowPort();
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
			case _instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_PROTOTYPE:
				getFunctionPrototype().clear();
				getFunctionPrototype().addAll((Collection<? extends FunctionPrototype>)newValue);
				return;
			case _instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_FLOW_PORT:
				setFunctionFlowPort((FunctionFlowPort)newValue);
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
			case _instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_PROTOTYPE:
				getFunctionPrototype().clear();
				return;
			case _instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_FLOW_PORT:
				setFunctionFlowPort((FunctionFlowPort)null);
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
			case _instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_PROTOTYPE:
				return functionPrototype != null && !functionPrototype.isEmpty();
			case _instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_FLOW_PORT:
				return functionFlowPort != null;
		}
		return super.eIsSet(featureID);
	}

} //EventFunctionFlowPort_portImpl
