/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableDatatype;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rangeable Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.RangeableValueTypeImpl#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.RangeableValueTypeImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.RangeableValueTypeImpl#getSignificantDigits <em>Significant Digits</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.RangeableValueTypeImpl#getBaseRangeable <em>Base Rangeable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeableValueTypeImpl extends ValueTypeImpl implements RangeableValueType {
	/**
	 * The default value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final Double ACCURACY_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected Double accuracy = ACCURACY_EDEFAULT;

	/**
	 * This is true if the Accuracy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accuracyESet;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Double RESOLUTION_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected Double resolution = RESOLUTION_EDEFAULT;

	/**
	 * This is true if the Resolution attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resolutionESet;

	/**
	 * The default value of the '{@link #getSignificantDigits() <em>Significant Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignificantDigits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIGNIFICANT_DIGITS_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getSignificantDigits() <em>Significant Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignificantDigits()
	 * @generated
	 * @ordered
	 */
	protected Integer significantDigits = SIGNIFICANT_DIGITS_EDEFAULT;

	/**
	 * This is true if the Significant Digits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean significantDigitsESet;

	/**
	 * The cached value of the '{@link #getBaseRangeable() <em>Base Rangeable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseRangeable()
	 * @generated
	 * @ordered
	 */
	protected RangeableDatatype baseRangeable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeableValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.RANGEABLE_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAccuracy() {
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccuracy(Double newAccuracy) {
		Double oldAccuracy = accuracy;
		accuracy = newAccuracy;
		boolean oldAccuracyESet = accuracyESet;
		accuracyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.RANGEABLE_VALUE_TYPE__ACCURACY, oldAccuracy, accuracy, !oldAccuracyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccuracy() {
		Double oldAccuracy = accuracy;
		boolean oldAccuracyESet = accuracyESet;
		accuracy = ACCURACY_EDEFAULT;
		accuracyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatatypesPackage.RANGEABLE_VALUE_TYPE__ACCURACY, oldAccuracy, ACCURACY_EDEFAULT, oldAccuracyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAccuracy() {
		return accuracyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(Double newResolution) {
		Double oldResolution = resolution;
		resolution = newResolution;
		boolean oldResolutionESet = resolutionESet;
		resolutionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.RANGEABLE_VALUE_TYPE__RESOLUTION, oldResolution, resolution, !oldResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResolution() {
		Double oldResolution = resolution;
		boolean oldResolutionESet = resolutionESet;
		resolution = RESOLUTION_EDEFAULT;
		resolutionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatatypesPackage.RANGEABLE_VALUE_TYPE__RESOLUTION, oldResolution, RESOLUTION_EDEFAULT, oldResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResolution() {
		return resolutionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSignificantDigits() {
		return significantDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignificantDigits(Integer newSignificantDigits) {
		Integer oldSignificantDigits = significantDigits;
		significantDigits = newSignificantDigits;
		boolean oldSignificantDigitsESet = significantDigitsESet;
		significantDigitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS, oldSignificantDigits, significantDigits, !oldSignificantDigitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignificantDigits() {
		Integer oldSignificantDigits = significantDigits;
		boolean oldSignificantDigitsESet = significantDigitsESet;
		significantDigits = SIGNIFICANT_DIGITS_EDEFAULT;
		significantDigitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatatypesPackage.RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS, oldSignificantDigits, SIGNIFICANT_DIGITS_EDEFAULT, oldSignificantDigitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignificantDigits() {
		return significantDigitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeableDatatype getBaseRangeable() {
		if (baseRangeable != null && baseRangeable.eIsProxy()) {
			InternalEObject oldBaseRangeable = (InternalEObject)baseRangeable;
			baseRangeable = (RangeableDatatype)eResolveProxy(oldBaseRangeable);
			if (baseRangeable != oldBaseRangeable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.RANGEABLE_VALUE_TYPE__BASE_RANGEABLE, oldBaseRangeable, baseRangeable));
			}
		}
		return baseRangeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeableDatatype basicGetBaseRangeable() {
		return baseRangeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseRangeable(RangeableDatatype newBaseRangeable) {
		RangeableDatatype oldBaseRangeable = baseRangeable;
		baseRangeable = newBaseRangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.RANGEABLE_VALUE_TYPE__BASE_RANGEABLE, oldBaseRangeable, baseRangeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__ACCURACY:
				return getAccuracy();
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__RESOLUTION:
				return getResolution();
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS:
				return getSignificantDigits();
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__BASE_RANGEABLE:
				if (resolve) return getBaseRangeable();
				return basicGetBaseRangeable();
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
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__ACCURACY:
				setAccuracy((Double)newValue);
				return;
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__RESOLUTION:
				setResolution((Double)newValue);
				return;
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS:
				setSignificantDigits((Integer)newValue);
				return;
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__BASE_RANGEABLE:
				setBaseRangeable((RangeableDatatype)newValue);
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
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__ACCURACY:
				unsetAccuracy();
				return;
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__RESOLUTION:
				unsetResolution();
				return;
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS:
				unsetSignificantDigits();
				return;
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__BASE_RANGEABLE:
				setBaseRangeable((RangeableDatatype)null);
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
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__ACCURACY:
				return isSetAccuracy();
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__RESOLUTION:
				return isSetResolution();
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS:
				return isSetSignificantDigits();
			case DatatypesPackage.RANGEABLE_VALUE_TYPE__BASE_RANGEABLE:
				return baseRangeable != null;
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
		result.append(" (accuracy: ");
		if (accuracyESet) result.append(accuracy); else result.append("<unset>");
		result.append(", resolution: ");
		if (resolutionESet) result.append(resolution); else result.append("<unset>");
		result.append(", significantDigits: ");
		if (significantDigitsESet) result.append(significantDigits); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RangeableValueTypeImpl
