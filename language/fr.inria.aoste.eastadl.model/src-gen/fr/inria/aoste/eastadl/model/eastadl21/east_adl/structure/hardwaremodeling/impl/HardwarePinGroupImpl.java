/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinGroup;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Pin Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl.HardwarePinGroupImpl#getPortGroup <em>Port Group</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl.HardwarePinGroupImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwarePinGroupImpl extends EAElementImpl implements HardwarePinGroup {
	/**
	 * The cached value of the '{@link #getPortGroup() <em>Port Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePinGroup> portGroup;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePin> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwarePinGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwaremodelingPackage.Literals.HARDWARE_PIN_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePinGroup> getPortGroup() {
		if (portGroup == null) {
			portGroup = new EObjectContainmentEList<HardwarePinGroup>(HardwarePinGroup.class, this, HardwaremodelingPackage.HARDWARE_PIN_GROUP__PORT_GROUP);
		}
		return portGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePin> getPort() {
		if (port == null) {
			port = new EObjectResolvingEList<HardwarePin>(HardwarePin.class, this, HardwaremodelingPackage.HARDWARE_PIN_GROUP__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HardwaremodelingPackage.HARDWARE_PIN_GROUP__PORT_GROUP:
				return ((InternalEList<?>)getPortGroup()).basicRemove(otherEnd, msgs);
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
			case HardwaremodelingPackage.HARDWARE_PIN_GROUP__PORT_GROUP:
				return getPortGroup();
			case HardwaremodelingPackage.HARDWARE_PIN_GROUP__PORT:
				return getPort();
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
			case HardwaremodelingPackage.HARDWARE_PIN_GROUP__PORT_GROUP:
				getPortGroup().clear();
				getPortGroup().addAll((Collection<? extends HardwarePinGroup>)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_PIN_GROUP__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends HardwarePin>)newValue);
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
			case HardwaremodelingPackage.HARDWARE_PIN_GROUP__PORT_GROUP:
				getPortGroup().clear();
				return;
			case HardwaremodelingPackage.HARDWARE_PIN_GROUP__PORT:
				getPort().clear();
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
			case HardwaremodelingPackage.HARDWARE_PIN_GROUP__PORT_GROUP:
				return portGroup != null && !portGroup.isEmpty();
			case HardwaremodelingPackage.HARDWARE_PIN_GROUP__PORT:
				return port != null && !port.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HardwarePinGroupImpl
