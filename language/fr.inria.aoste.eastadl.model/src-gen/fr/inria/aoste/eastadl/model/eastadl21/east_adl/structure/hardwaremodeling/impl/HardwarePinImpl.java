/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.EADirectionKind;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl.HardwarePinImpl#getIsGround <em>Is Ground</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl.HardwarePinImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl.HardwarePinImpl#getPower <em>Power</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl.HardwarePinImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl.HardwarePinImpl#getImpedance <em>Impedance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HardwarePinImpl extends EAElementImpl implements HardwarePin {
	/**
	 * The default value of the '{@link #getIsGround() <em>Is Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGround()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_GROUND_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsGround() <em>Is Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGround()
	 * @generated
	 * @ordered
	 */
	protected Boolean isGround = IS_GROUND_EDEFAULT;

	/**
	 * This is true if the Is Ground attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isGroundESet;

	/**
	 * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final Double VOLTAGE_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected Double voltage = VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voltageESet;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final Double POWER_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected Double power = POWER_EDEFAULT;

	/**
	 * This is true if the Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerESet;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final EADirectionKind DIRECTION_EDEFAULT = EADirectionKind.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected EADirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The default value of the '{@link #getImpedance() <em>Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance()
	 * @generated
	 * @ordered
	 */
	protected static final Double IMPEDANCE_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getImpedance() <em>Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance()
	 * @generated
	 * @ordered
	 */
	protected Double impedance = IMPEDANCE_EDEFAULT;

	/**
	 * This is true if the Impedance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean impedanceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwarePinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwaremodelingPackage.Literals.HARDWARE_PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsGround() {
		return isGround;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGround(Boolean newIsGround) {
		Boolean oldIsGround = isGround;
		isGround = newIsGround;
		boolean oldIsGroundESet = isGroundESet;
		isGroundESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.HARDWARE_PIN__IS_GROUND, oldIsGround, isGround, !oldIsGroundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsGround() {
		Boolean oldIsGround = isGround;
		boolean oldIsGroundESet = isGroundESet;
		isGround = IS_GROUND_EDEFAULT;
		isGroundESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, HardwaremodelingPackage.HARDWARE_PIN__IS_GROUND, oldIsGround, IS_GROUND_EDEFAULT, oldIsGroundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsGround() {
		return isGroundESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage(Double newVoltage) {
		Double oldVoltage = voltage;
		voltage = newVoltage;
		boolean oldVoltageESet = voltageESet;
		voltageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.HARDWARE_PIN__VOLTAGE, oldVoltage, voltage, !oldVoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVoltage() {
		Double oldVoltage = voltage;
		boolean oldVoltageESet = voltageESet;
		voltage = VOLTAGE_EDEFAULT;
		voltageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, HardwaremodelingPackage.HARDWARE_PIN__VOLTAGE, oldVoltage, VOLTAGE_EDEFAULT, oldVoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVoltage() {
		return voltageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(Double newPower) {
		Double oldPower = power;
		power = newPower;
		boolean oldPowerESet = powerESet;
		powerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.HARDWARE_PIN__POWER, oldPower, power, !oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPower() {
		Double oldPower = power;
		boolean oldPowerESet = powerESet;
		power = POWER_EDEFAULT;
		powerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, HardwaremodelingPackage.HARDWARE_PIN__POWER, oldPower, POWER_EDEFAULT, oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPower() {
		return powerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(EADirectionKind newDirection) {
		EADirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		boolean oldDirectionESet = directionESet;
		directionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.HARDWARE_PIN__DIRECTION, oldDirection, direction, !oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirection() {
		EADirectionKind oldDirection = direction;
		boolean oldDirectionESet = directionESet;
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, HardwaremodelingPackage.HARDWARE_PIN__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirection() {
		return directionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getImpedance() {
		return impedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance(Double newImpedance) {
		Double oldImpedance = impedance;
		impedance = newImpedance;
		boolean oldImpedanceESet = impedanceESet;
		impedanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.HARDWARE_PIN__IMPEDANCE, oldImpedance, impedance, !oldImpedanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImpedance() {
		Double oldImpedance = impedance;
		boolean oldImpedanceESet = impedanceESet;
		impedance = IMPEDANCE_EDEFAULT;
		impedanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, HardwaremodelingPackage.HARDWARE_PIN__IMPEDANCE, oldImpedance, IMPEDANCE_EDEFAULT, oldImpedanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImpedance() {
		return impedanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HardwaremodelingPackage.HARDWARE_PIN__IS_GROUND:
				return getIsGround();
			case HardwaremodelingPackage.HARDWARE_PIN__VOLTAGE:
				return getVoltage();
			case HardwaremodelingPackage.HARDWARE_PIN__POWER:
				return getPower();
			case HardwaremodelingPackage.HARDWARE_PIN__DIRECTION:
				return getDirection();
			case HardwaremodelingPackage.HARDWARE_PIN__IMPEDANCE:
				return getImpedance();
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
			case HardwaremodelingPackage.HARDWARE_PIN__IS_GROUND:
				setIsGround((Boolean)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_PIN__VOLTAGE:
				setVoltage((Double)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_PIN__POWER:
				setPower((Double)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_PIN__DIRECTION:
				setDirection((EADirectionKind)newValue);
				return;
			case HardwaremodelingPackage.HARDWARE_PIN__IMPEDANCE:
				setImpedance((Double)newValue);
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
			case HardwaremodelingPackage.HARDWARE_PIN__IS_GROUND:
				unsetIsGround();
				return;
			case HardwaremodelingPackage.HARDWARE_PIN__VOLTAGE:
				unsetVoltage();
				return;
			case HardwaremodelingPackage.HARDWARE_PIN__POWER:
				unsetPower();
				return;
			case HardwaremodelingPackage.HARDWARE_PIN__DIRECTION:
				unsetDirection();
				return;
			case HardwaremodelingPackage.HARDWARE_PIN__IMPEDANCE:
				unsetImpedance();
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
			case HardwaremodelingPackage.HARDWARE_PIN__IS_GROUND:
				return isSetIsGround();
			case HardwaremodelingPackage.HARDWARE_PIN__VOLTAGE:
				return isSetVoltage();
			case HardwaremodelingPackage.HARDWARE_PIN__POWER:
				return isSetPower();
			case HardwaremodelingPackage.HARDWARE_PIN__DIRECTION:
				return isSetDirection();
			case HardwaremodelingPackage.HARDWARE_PIN__IMPEDANCE:
				return isSetImpedance();
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
		result.append(" (isGround: ");
		if (isGroundESet) result.append(isGround); else result.append("<unset>");
		result.append(", voltage: ");
		if (voltageESet) result.append(voltage); else result.append("<unset>");
		result.append(", power: ");
		if (powerESet) result.append(power); else result.append("<unset>");
		result.append(", direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(", impedance: ");
		if (impedanceESet) result.append(impedance); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HardwarePinImpl
