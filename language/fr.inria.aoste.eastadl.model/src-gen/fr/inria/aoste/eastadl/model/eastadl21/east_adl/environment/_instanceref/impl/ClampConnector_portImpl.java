/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.ClampConnector_port;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref._instancerefPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;

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
 * An implementation of the model object '<em><b>Clamp Connector port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.impl.ClampConnector_portImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.impl.ClampConnector_portImpl#getFunctionPort <em>Function Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClampConnector_portImpl extends MinimalEObjectImpl.Container implements ClampConnector_port {
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
	 * The cached value of the '{@link #getFunctionPort() <em>Function Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionPort functionPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClampConnector_portImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.CLAMP_CONNECTOR_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPrototype> getFunctionPrototype() {
		if (functionPrototype == null) {
			functionPrototype = new EObjectResolvingEList<FunctionPrototype>(FunctionPrototype.class, this, _instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PROTOTYPE);
		}
		return functionPrototype;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PORT, oldFunctionPort, functionPort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PORT, oldFunctionPort, functionPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				return getFunctionPrototype();
			case _instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PORT:
				if (resolve) return getFunctionPort();
				return basicGetFunctionPort();
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
			case _instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				getFunctionPrototype().clear();
				getFunctionPrototype().addAll((Collection<? extends FunctionPrototype>)newValue);
				return;
			case _instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PORT:
				setFunctionPort((FunctionPort)newValue);
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
			case _instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				getFunctionPrototype().clear();
				return;
			case _instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PORT:
				setFunctionPort((FunctionPort)null);
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
			case _instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				return functionPrototype != null && !functionPrototype.isEmpty();
			case _instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PORT:
				return functionPort != null;
		}
		return super.eIsSet(featureID);
	}

} //ClampConnector_portImpl
