/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentType;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnector;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinGroup;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.impl.HardwareComponentTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.impl.HardwareComponentTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.impl.HardwareComponentTypeImpl#getPart <em>Part</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.impl.HardwareComponentTypeImpl#getPortGroup <em>Port Group</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.impl.HardwareComponentTypeImpl#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareComponentTypeImpl extends ContextImpl implements HardwareComponentType {
	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareConnector> connector;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePin> port;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareComponentPrototype> part;

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
	 * The cached value of the '{@link #getBus() <em>Bus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalBus> bus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwaremodelingPackage.Literals.HARDWARE_COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareConnector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentEList<HardwareConnector>(HardwareConnector.class, this, HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePin> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<HardwarePin>(HardwarePin.class, this, HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareComponentPrototype> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<HardwareComponentPrototype>(HardwareComponentPrototype.class, this, HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePinGroup> getPortGroup() {
		if (portGroup == null) {
			portGroup = new EObjectContainmentEList<HardwarePinGroup>(HardwarePinGroup.class, this, HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT_GROUP);
		}
		return portGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalBus> getBus() {
		if (bus == null) {
			bus = new EObjectContainmentEList<LogicalBus>(LogicalBus.class, this, HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BUS);
		}
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT_GROUP:
				return ((InternalEList<?>)getPortGroup()).basicRemove(otherEnd, msgs);
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BUS:
				return ((InternalEList<?>)getBus()).basicRemove(otherEnd, msgs);
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
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR:
				return getConnector();
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT:
				return getPort();
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PART:
				return getPart();
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT_GROUP:
				return getPortGroup();
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BUS:
				return getBus();
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
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends HardwareConnector>)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends HardwarePin>)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends HardwareComponentPrototype>)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT_GROUP:
				getPortGroup().clear();
				getPortGroup().addAll((Collection<? extends HardwarePinGroup>)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BUS:
				getBus().clear();
				getBus().addAll((Collection<? extends LogicalBus>)newValue);
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
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT:
				getPort().clear();
				return;
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PART:
				getPart().clear();
				return;
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT_GROUP:
				getPortGroup().clear();
				return;
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BUS:
				getBus().clear();
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
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR:
				return connector != null && !connector.isEmpty();
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT:
				return port != null && !port.isEmpty();
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PART:
				return part != null && !part.isEmpty();
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__PORT_GROUP:
				return portGroup != null && !portGroup.isEmpty();
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE__BUS:
				return bus != null && !bus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HardwareComponentTypeImpl
