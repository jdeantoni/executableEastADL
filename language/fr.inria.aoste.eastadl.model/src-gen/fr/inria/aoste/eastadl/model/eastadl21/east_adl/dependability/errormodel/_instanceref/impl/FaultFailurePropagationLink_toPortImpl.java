/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxy;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_toPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage;

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
 * An implementation of the model object '<em><b>Fault Failure Propagation Link to Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl.FaultFailurePropagationLink_toPortImpl#getFaultFailurePort <em>Fault Failure Port</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl.FaultFailurePropagationLink_toPortImpl#getErrorModelPrototype <em>Error Model Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl.FaultFailurePropagationLink_toPortImpl#getFaultFailurePortProxy <em>Fault Failure Port Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultFailurePropagationLink_toPortImpl extends MinimalEObjectImpl.Container implements FaultFailurePropagationLink_toPort {
	/**
	 * The cached value of the '{@link #getFaultFailurePort() <em>Fault Failure Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultFailurePort()
	 * @generated
	 * @ordered
	 */
	protected FaultFailurePort faultFailurePort;

	/**
	 * The cached value of the '{@link #getErrorModelPrototype() <em>Error Model Prototype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelPrototype()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelPrototype> errorModelPrototype;

	/**
	 * The cached value of the '{@link #getFaultFailurePortProxy() <em>Fault Failure Port Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultFailurePortProxy()
	 * @generated
	 * @ordered
	 */
	protected FaultFailurePortProxy faultFailurePortProxy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultFailurePropagationLink_toPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePort getFaultFailurePort() {
		if (faultFailurePort != null && faultFailurePort.eIsProxy()) {
			InternalEObject oldFaultFailurePort = (InternalEObject)faultFailurePort;
			faultFailurePort = (FaultFailurePort)eResolveProxy(oldFaultFailurePort);
			if (faultFailurePort != oldFaultFailurePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__FAULT_FAILURE_PORT, oldFaultFailurePort, faultFailurePort));
			}
		}
		return faultFailurePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePort basicGetFaultFailurePort() {
		return faultFailurePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultFailurePort(FaultFailurePort newFaultFailurePort) {
		FaultFailurePort oldFaultFailurePort = faultFailurePort;
		faultFailurePort = newFaultFailurePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__FAULT_FAILURE_PORT, oldFaultFailurePort, faultFailurePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorModelPrototype> getErrorModelPrototype() {
		if (errorModelPrototype == null) {
			errorModelPrototype = new EObjectResolvingEList<ErrorModelPrototype>(ErrorModelPrototype.class, this, _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__ERROR_MODEL_PROTOTYPE);
		}
		return errorModelPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePortProxy getFaultFailurePortProxy() {
		if (faultFailurePortProxy != null && faultFailurePortProxy.eIsProxy()) {
			InternalEObject oldFaultFailurePortProxy = (InternalEObject)faultFailurePortProxy;
			faultFailurePortProxy = (FaultFailurePortProxy)eResolveProxy(oldFaultFailurePortProxy);
			if (faultFailurePortProxy != oldFaultFailurePortProxy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__FAULT_FAILURE_PORT_PROXY, oldFaultFailurePortProxy, faultFailurePortProxy));
			}
		}
		return faultFailurePortProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePortProxy basicGetFaultFailurePortProxy() {
		return faultFailurePortProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultFailurePortProxy(FaultFailurePortProxy newFaultFailurePortProxy) {
		FaultFailurePortProxy oldFaultFailurePortProxy = faultFailurePortProxy;
		faultFailurePortProxy = newFaultFailurePortProxy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__FAULT_FAILURE_PORT_PROXY, oldFaultFailurePortProxy, faultFailurePortProxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__FAULT_FAILURE_PORT:
				if (resolve) return getFaultFailurePort();
				return basicGetFaultFailurePort();
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__ERROR_MODEL_PROTOTYPE:
				return getErrorModelPrototype();
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__FAULT_FAILURE_PORT_PROXY:
				if (resolve) return getFaultFailurePortProxy();
				return basicGetFaultFailurePortProxy();
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
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__FAULT_FAILURE_PORT:
				setFaultFailurePort((FaultFailurePort)newValue);
				return;
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__ERROR_MODEL_PROTOTYPE:
				getErrorModelPrototype().clear();
				getErrorModelPrototype().addAll((Collection<? extends ErrorModelPrototype>)newValue);
				return;
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__FAULT_FAILURE_PORT_PROXY:
				setFaultFailurePortProxy((FaultFailurePortProxy)newValue);
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
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__FAULT_FAILURE_PORT:
				setFaultFailurePort((FaultFailurePort)null);
				return;
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__ERROR_MODEL_PROTOTYPE:
				getErrorModelPrototype().clear();
				return;
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__FAULT_FAILURE_PORT_PROXY:
				setFaultFailurePortProxy((FaultFailurePortProxy)null);
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
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__FAULT_FAILURE_PORT:
				return faultFailurePort != null;
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__ERROR_MODEL_PROTOTYPE:
				return errorModelPrototype != null && !errorModelPrototype.isEmpty();
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT__FAULT_FAILURE_PORT_PROXY:
				return faultFailurePortProxy != null;
		}
		return super.eIsSet(featureID);
	}

} //FaultFailurePropagationLink_toPortImpl
