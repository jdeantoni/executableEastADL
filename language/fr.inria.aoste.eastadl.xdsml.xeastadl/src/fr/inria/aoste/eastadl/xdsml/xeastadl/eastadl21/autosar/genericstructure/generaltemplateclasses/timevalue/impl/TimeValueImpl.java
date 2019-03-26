/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimeValue;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevaluePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.impl.TimeValueImpl#getCseCode <em>Cse Code</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.impl.TimeValueImpl#getCseCodeFactor <em>Cse Code Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeValueImpl extends EObjectImpl implements TimeValue {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimevaluePackage.Literals.TIME_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimevaluePackage.TIME_VALUE__CSE_CODE, oldCseCode, cseCode, !oldCseCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TimevaluePackage.TIME_VALUE__CSE_CODE, oldCseCode, CSE_CODE_EDEFAULT, oldCseCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimevaluePackage.TIME_VALUE__CSE_CODE_FACTOR, oldCseCodeFactor, cseCodeFactor, !oldCseCodeFactorESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TimevaluePackage.TIME_VALUE__CSE_CODE_FACTOR, oldCseCodeFactor, CSE_CODE_FACTOR_EDEFAULT, oldCseCodeFactorESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimevaluePackage.TIME_VALUE__CSE_CODE:
				return getCseCode();
			case TimevaluePackage.TIME_VALUE__CSE_CODE_FACTOR:
				return getCseCodeFactor();
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
			case TimevaluePackage.TIME_VALUE__CSE_CODE:
				setCseCode((Integer)newValue);
				return;
			case TimevaluePackage.TIME_VALUE__CSE_CODE_FACTOR:
				setCseCodeFactor((Integer)newValue);
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
			case TimevaluePackage.TIME_VALUE__CSE_CODE:
				unsetCseCode();
				return;
			case TimevaluePackage.TIME_VALUE__CSE_CODE_FACTOR:
				unsetCseCodeFactor();
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
			case TimevaluePackage.TIME_VALUE__CSE_CODE:
				return isSetCseCode();
			case TimevaluePackage.TIME_VALUE__CSE_CODE_FACTOR:
				return isSetCseCodeFactor();
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
		result.append(')');
		return result.toString();
	}

} //TimeValueImpl
