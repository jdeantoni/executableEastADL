/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnector;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBusKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl.LogicalBusImpl#getBusSpeed <em>Bus Speed</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl.LogicalBusImpl#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl.LogicalBusImpl#getWire <em>Wire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalBusImpl extends AllocationTargetImpl implements LogicalBus {
	/**
	 * The default value of the '{@link #getBusSpeed() <em>Bus Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Double BUS_SPEED_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getBusSpeed() <em>Bus Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSpeed()
	 * @generated
	 * @ordered
	 */
	protected Double busSpeed = BUS_SPEED_EDEFAULT;

	/**
	 * This is true if the Bus Speed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean busSpeedESet;

	/**
	 * The default value of the '{@link #getBusType() <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalBusKind BUS_TYPE_EDEFAULT = LogicalBusKind.TIME_TRIGGERED;

	/**
	 * The cached value of the '{@link #getBusType() <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected LogicalBusKind busType = BUS_TYPE_EDEFAULT;

	/**
	 * This is true if the Bus Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean busTypeESet;

	/**
	 * The cached value of the '{@link #getWire() <em>Wire</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWire()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareConnector> wire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalBusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwaremodelingPackage.Literals.LOGICAL_BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBusSpeed() {
		return busSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusSpeed(Double newBusSpeed) {
		Double oldBusSpeed = busSpeed;
		busSpeed = newBusSpeed;
		boolean oldBusSpeedESet = busSpeedESet;
		busSpeedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.LOGICAL_BUS__BUS_SPEED, oldBusSpeed, busSpeed, !oldBusSpeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBusSpeed() {
		Double oldBusSpeed = busSpeed;
		boolean oldBusSpeedESet = busSpeedESet;
		busSpeed = BUS_SPEED_EDEFAULT;
		busSpeedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, HardwaremodelingPackage.LOGICAL_BUS__BUS_SPEED, oldBusSpeed, BUS_SPEED_EDEFAULT, oldBusSpeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBusSpeed() {
		return busSpeedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalBusKind getBusType() {
		return busType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusType(LogicalBusKind newBusType) {
		LogicalBusKind oldBusType = busType;
		busType = newBusType == null ? BUS_TYPE_EDEFAULT : newBusType;
		boolean oldBusTypeESet = busTypeESet;
		busTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.LOGICAL_BUS__BUS_TYPE, oldBusType, busType, !oldBusTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBusType() {
		LogicalBusKind oldBusType = busType;
		boolean oldBusTypeESet = busTypeESet;
		busType = BUS_TYPE_EDEFAULT;
		busTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, HardwaremodelingPackage.LOGICAL_BUS__BUS_TYPE, oldBusType, BUS_TYPE_EDEFAULT, oldBusTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBusType() {
		return busTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareConnector> getWire() {
		if (wire == null) {
			wire = new EObjectResolvingEList<HardwareConnector>(HardwareConnector.class, this, HardwaremodelingPackage.LOGICAL_BUS__WIRE);
		}
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HardwaremodelingPackage.LOGICAL_BUS__BUS_SPEED:
				return getBusSpeed();
			case HardwaremodelingPackage.LOGICAL_BUS__BUS_TYPE:
				return getBusType();
			case HardwaremodelingPackage.LOGICAL_BUS__WIRE:
				return getWire();
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
			case HardwaremodelingPackage.LOGICAL_BUS__BUS_SPEED:
				setBusSpeed((Double)newValue);
				return;
			case HardwaremodelingPackage.LOGICAL_BUS__BUS_TYPE:
				setBusType((LogicalBusKind)newValue);
				return;
			case HardwaremodelingPackage.LOGICAL_BUS__WIRE:
				getWire().clear();
				getWire().addAll((Collection<? extends HardwareConnector>)newValue);
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
			case HardwaremodelingPackage.LOGICAL_BUS__BUS_SPEED:
				unsetBusSpeed();
				return;
			case HardwaremodelingPackage.LOGICAL_BUS__BUS_TYPE:
				unsetBusType();
				return;
			case HardwaremodelingPackage.LOGICAL_BUS__WIRE:
				getWire().clear();
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
			case HardwaremodelingPackage.LOGICAL_BUS__BUS_SPEED:
				return isSetBusSpeed();
			case HardwaremodelingPackage.LOGICAL_BUS__BUS_TYPE:
				return isSetBusType();
			case HardwaremodelingPackage.LOGICAL_BUS__WIRE:
				return wire != null && !wire.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (busSpeed: ");
		if (busSpeedESet) result.append(busSpeed); else result.append("<unset>");
		result.append(", busType: ");
		if (busTypeESet) result.append(busType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LogicalBusImpl
