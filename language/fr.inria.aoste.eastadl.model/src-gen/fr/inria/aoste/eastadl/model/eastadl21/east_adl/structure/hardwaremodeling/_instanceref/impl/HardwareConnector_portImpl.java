/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_port;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Connector port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref.impl.HardwareConnector_portImpl#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref.impl.HardwareConnector_portImpl#getHardwarePin <em>Hardware Pin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareConnector_portImpl extends MinimalEObjectImpl.Container implements HardwareConnector_port {
	/**
	 * The cached value of the '{@link #getHardwareComponentPrototype() <em>Hardware Component Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareComponentPrototype()
	 * @generated
	 * @ordered
	 */
	protected HardwareComponentPrototype hardwareComponentPrototype;

	/**
	 * The cached value of the '{@link #getHardwarePin() <em>Hardware Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwarePin()
	 * @generated
	 * @ordered
	 */
	protected HardwarePin hardwarePin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareConnector_portImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.HARDWARE_CONNECTOR_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentPrototype getHardwareComponentPrototype() {
		if (hardwareComponentPrototype != null && hardwareComponentPrototype.eIsProxy()) {
			InternalEObject oldHardwareComponentPrototype = (InternalEObject)hardwareComponentPrototype;
			hardwareComponentPrototype = (HardwareComponentPrototype)eResolveProxy(oldHardwareComponentPrototype);
			if (hardwareComponentPrototype != oldHardwareComponentPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE, oldHardwareComponentPrototype, hardwareComponentPrototype));
			}
		}
		return hardwareComponentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentPrototype basicGetHardwareComponentPrototype() {
		return hardwareComponentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareComponentPrototype(HardwareComponentPrototype newHardwareComponentPrototype) {
		HardwareComponentPrototype oldHardwareComponentPrototype = hardwareComponentPrototype;
		hardwareComponentPrototype = newHardwareComponentPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE, oldHardwareComponentPrototype, hardwareComponentPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePin getHardwarePin() {
		if (hardwarePin != null && hardwarePin.eIsProxy()) {
			InternalEObject oldHardwarePin = (InternalEObject)hardwarePin;
			hardwarePin = (HardwarePin)eResolveProxy(oldHardwarePin);
			if (hardwarePin != oldHardwarePin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN, oldHardwarePin, hardwarePin));
			}
		}
		return hardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePin basicGetHardwarePin() {
		return hardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwarePin(HardwarePin newHardwarePin) {
		HardwarePin oldHardwarePin = hardwarePin;
		hardwarePin = newHardwarePin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN, oldHardwarePin, hardwarePin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
				if (resolve) return getHardwareComponentPrototype();
				return basicGetHardwareComponentPrototype();
			case _instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN:
				if (resolve) return getHardwarePin();
				return basicGetHardwarePin();
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
			case _instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
				setHardwareComponentPrototype((HardwareComponentPrototype)newValue);
				return;
			case _instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN:
				setHardwarePin((HardwarePin)newValue);
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
			case _instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
				setHardwareComponentPrototype((HardwareComponentPrototype)null);
				return;
			case _instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN:
				setHardwarePin((HardwarePin)null);
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
			case _instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
				return hardwareComponentPrototype != null;
			case _instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN:
				return hardwarePin != null;
		}
		return super.eIsSet(featureID);
	}

} //HardwareConnector_portImpl
