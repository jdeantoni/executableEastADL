/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin;

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
 * An implementation of the model object '<em><b>Fault Failure Port hw Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl.FaultFailurePort_hwTargetImpl#getHardwarePort <em>Hardware Port</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl.FaultFailurePort_hwTargetImpl#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultFailurePort_hwTargetImpl extends MinimalEObjectImpl.Container implements FaultFailurePort_hwTarget {
	/**
	 * The cached value of the '{@link #getHardwarePort() <em>Hardware Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwarePort()
	 * @generated
	 * @ordered
	 */
	protected HardwarePin hardwarePort;

	/**
	 * The cached value of the '{@link #getHardwareComponentPrototype() <em>Hardware Component Prototype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareComponentPrototype()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareComponentPrototype> hardwareComponentPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultFailurePort_hwTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.FAULT_FAILURE_PORT_HW_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePin getHardwarePort() {
		if (hardwarePort != null && hardwarePort.eIsProxy()) {
			InternalEObject oldHardwarePort = (InternalEObject)hardwarePort;
			hardwarePort = (HardwarePin)eResolveProxy(oldHardwarePort);
			if (hardwarePort != oldHardwarePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_PORT, oldHardwarePort, hardwarePort));
			}
		}
		return hardwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePin basicGetHardwarePort() {
		return hardwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwarePort(HardwarePin newHardwarePort) {
		HardwarePin oldHardwarePort = hardwarePort;
		hardwarePort = newHardwarePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_PORT, oldHardwarePort, hardwarePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareComponentPrototype> getHardwareComponentPrototype() {
		if (hardwareComponentPrototype == null) {
			hardwareComponentPrototype = new EObjectResolvingEList<HardwareComponentPrototype>(HardwareComponentPrototype.class, this, _instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE);
		}
		return hardwareComponentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_PORT:
				if (resolve) return getHardwarePort();
				return basicGetHardwarePort();
			case _instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
				return getHardwareComponentPrototype();
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
			case _instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_PORT:
				setHardwarePort((HardwarePin)newValue);
				return;
			case _instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
				getHardwareComponentPrototype().clear();
				getHardwareComponentPrototype().addAll((Collection<? extends HardwareComponentPrototype>)newValue);
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
			case _instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_PORT:
				setHardwarePort((HardwarePin)null);
				return;
			case _instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
				getHardwareComponentPrototype().clear();
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
			case _instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_PORT:
				return hardwarePort != null;
			case _instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
				return hardwareComponentPrototype != null && !hardwareComponentPrototype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FaultFailurePort_hwTargetImpl
