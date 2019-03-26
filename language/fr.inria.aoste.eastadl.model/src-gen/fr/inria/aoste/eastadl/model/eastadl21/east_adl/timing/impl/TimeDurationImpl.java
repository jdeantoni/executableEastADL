/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimeDurationImpl#getCseCode <em>Cse Code</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimeDurationImpl#getCseCodeFactor <em>Cse Code Factor</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimeDurationImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeDurationImpl extends EAElementImpl implements TimeDuration {
	/**
	 * The default value of the '{@link #getCseCode() <em>Cse Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCseCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CSE_CODE_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getCseCode() <em>Cse Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCseCode()
	 * @generated
	 * @ordered
	 */
	protected Integer cseCode = CSE_CODE_EDEFAULT;

	/**
	 * This is true if the Cse Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cseCodeESet;

	/**
	 * The default value of the '{@link #getCseCodeFactor() <em>Cse Code Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCseCodeFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CSE_CODE_FACTOR_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getCseCodeFactor() <em>Cse Code Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCseCodeFactor()
	 * @generated
	 * @ordered
	 */
	protected Integer cseCodeFactor = CSE_CODE_FACTOR_EDEFAULT;

	/**
	 * This is true if the Cse Code Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cseCodeFactorESet;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALUE_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Double value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeDurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingPackage.Literals.TIME_DURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCseCode() {
		return cseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCseCode(Integer newCseCode) {
		Integer oldCseCode = cseCode;
		cseCode = newCseCode;
		boolean oldCseCodeESet = cseCodeESet;
		cseCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.TIME_DURATION__CSE_CODE, oldCseCode, cseCode, !oldCseCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCseCode() {
		Integer oldCseCode = cseCode;
		boolean oldCseCodeESet = cseCodeESet;
		cseCode = CSE_CODE_EDEFAULT;
		cseCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TimingPackage.TIME_DURATION__CSE_CODE, oldCseCode, CSE_CODE_EDEFAULT, oldCseCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCseCode() {
		return cseCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCseCodeFactor() {
		return cseCodeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCseCodeFactor(Integer newCseCodeFactor) {
		Integer oldCseCodeFactor = cseCodeFactor;
		cseCodeFactor = newCseCodeFactor;
		boolean oldCseCodeFactorESet = cseCodeFactorESet;
		cseCodeFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.TIME_DURATION__CSE_CODE_FACTOR, oldCseCodeFactor, cseCodeFactor, !oldCseCodeFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCseCodeFactor() {
		Integer oldCseCodeFactor = cseCodeFactor;
		boolean oldCseCodeFactorESet = cseCodeFactorESet;
		cseCodeFactor = CSE_CODE_FACTOR_EDEFAULT;
		cseCodeFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TimingPackage.TIME_DURATION__CSE_CODE_FACTOR, oldCseCodeFactor, CSE_CODE_FACTOR_EDEFAULT, oldCseCodeFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCseCodeFactor() {
		return cseCodeFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Double newValue) {
		Double oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.TIME_DURATION__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		Double oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TimingPackage.TIME_DURATION__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingPackage.TIME_DURATION__CSE_CODE:
				return getCseCode();
			case TimingPackage.TIME_DURATION__CSE_CODE_FACTOR:
				return getCseCodeFactor();
			case TimingPackage.TIME_DURATION__VALUE:
				return getValue();
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
			case TimingPackage.TIME_DURATION__CSE_CODE:
				setCseCode((Integer)newValue);
				return;
			case TimingPackage.TIME_DURATION__CSE_CODE_FACTOR:
				setCseCodeFactor((Integer)newValue);
				return;
			case TimingPackage.TIME_DURATION__VALUE:
				setValue((Double)newValue);
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
			case TimingPackage.TIME_DURATION__CSE_CODE:
				unsetCseCode();
				return;
			case TimingPackage.TIME_DURATION__CSE_CODE_FACTOR:
				unsetCseCodeFactor();
				return;
			case TimingPackage.TIME_DURATION__VALUE:
				unsetValue();
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
			case TimingPackage.TIME_DURATION__CSE_CODE:
				return isSetCseCode();
			case TimingPackage.TIME_DURATION__CSE_CODE_FACTOR:
				return isSetCseCodeFactor();
			case TimingPackage.TIME_DURATION__VALUE:
				return isSetValue();
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
		result.append(" (cseCode: ");
		if (cseCodeESet) result.append(cseCode); else result.append("<unset>");
		result.append(", cseCodeFactor: ");
		if (cseCodeFactorESet) result.append(cseCodeFactor); else result.append("<unset>");
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimeDurationImpl
