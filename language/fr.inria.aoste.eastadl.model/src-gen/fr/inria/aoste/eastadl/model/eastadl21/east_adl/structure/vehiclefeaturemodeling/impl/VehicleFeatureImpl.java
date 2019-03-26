/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehicleFeatureImpl#getIsDesignVariabilityRationale <em>Is Design Variability Rationale</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehicleFeatureImpl#getIsRemoved <em>Is Removed</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehicleFeatureImpl#getIsCustomerVisible <em>Is Customer Visible</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehicleFeatureImpl#getDeviationAttributeSet <em>Deviation Attribute Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleFeatureImpl extends FeatureImpl implements VehicleFeature {
	/**
	 * The default value of the '{@link #getIsDesignVariabilityRationale() <em>Is Design Variability Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDesignVariabilityRationale()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DESIGN_VARIABILITY_RATIONALE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsDesignVariabilityRationale() <em>Is Design Variability Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDesignVariabilityRationale()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDesignVariabilityRationale = IS_DESIGN_VARIABILITY_RATIONALE_EDEFAULT;

	/**
	 * This is true if the Is Design Variability Rationale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDesignVariabilityRationaleESet;

	/**
	 * The default value of the '{@link #getIsRemoved() <em>Is Removed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRemoved()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_REMOVED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsRemoved() <em>Is Removed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRemoved()
	 * @generated
	 * @ordered
	 */
	protected Boolean isRemoved = IS_REMOVED_EDEFAULT;

	/**
	 * This is true if the Is Removed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isRemovedESet;

	/**
	 * The default value of the '{@link #getIsCustomerVisible() <em>Is Customer Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCustomerVisible()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CUSTOMER_VISIBLE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsCustomerVisible() <em>Is Customer Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCustomerVisible()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCustomerVisible = IS_CUSTOMER_VISIBLE_EDEFAULT;

	/**
	 * This is true if the Is Customer Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCustomerVisibleESet;

	/**
	 * The cached value of the '{@link #getDeviationAttributeSet() <em>Deviation Attribute Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviationAttributeSet()
	 * @generated
	 * @ordered
	 */
	protected DeviationAttributeSet deviationAttributeSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VehiclefeaturemodelingPackage.Literals.VEHICLE_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDesignVariabilityRationale() {
		return isDesignVariabilityRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDesignVariabilityRationale(Boolean newIsDesignVariabilityRationale) {
		Boolean oldIsDesignVariabilityRationale = isDesignVariabilityRationale;
		isDesignVariabilityRationale = newIsDesignVariabilityRationale;
		boolean oldIsDesignVariabilityRationaleESet = isDesignVariabilityRationaleESet;
		isDesignVariabilityRationaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_DESIGN_VARIABILITY_RATIONALE, oldIsDesignVariabilityRationale, isDesignVariabilityRationale, !oldIsDesignVariabilityRationaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsDesignVariabilityRationale() {
		Boolean oldIsDesignVariabilityRationale = isDesignVariabilityRationale;
		boolean oldIsDesignVariabilityRationaleESet = isDesignVariabilityRationaleESet;
		isDesignVariabilityRationale = IS_DESIGN_VARIABILITY_RATIONALE_EDEFAULT;
		isDesignVariabilityRationaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_DESIGN_VARIABILITY_RATIONALE, oldIsDesignVariabilityRationale, IS_DESIGN_VARIABILITY_RATIONALE_EDEFAULT, oldIsDesignVariabilityRationaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsDesignVariabilityRationale() {
		return isDesignVariabilityRationaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsRemoved() {
		return isRemoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRemoved(Boolean newIsRemoved) {
		Boolean oldIsRemoved = isRemoved;
		isRemoved = newIsRemoved;
		boolean oldIsRemovedESet = isRemovedESet;
		isRemovedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_REMOVED, oldIsRemoved, isRemoved, !oldIsRemovedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsRemoved() {
		Boolean oldIsRemoved = isRemoved;
		boolean oldIsRemovedESet = isRemovedESet;
		isRemoved = IS_REMOVED_EDEFAULT;
		isRemovedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_REMOVED, oldIsRemoved, IS_REMOVED_EDEFAULT, oldIsRemovedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsRemoved() {
		return isRemovedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCustomerVisible() {
		return isCustomerVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCustomerVisible(Boolean newIsCustomerVisible) {
		Boolean oldIsCustomerVisible = isCustomerVisible;
		isCustomerVisible = newIsCustomerVisible;
		boolean oldIsCustomerVisibleESet = isCustomerVisibleESet;
		isCustomerVisibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_CUSTOMER_VISIBLE, oldIsCustomerVisible, isCustomerVisible, !oldIsCustomerVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsCustomerVisible() {
		Boolean oldIsCustomerVisible = isCustomerVisible;
		boolean oldIsCustomerVisibleESet = isCustomerVisibleESet;
		isCustomerVisible = IS_CUSTOMER_VISIBLE_EDEFAULT;
		isCustomerVisibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_CUSTOMER_VISIBLE, oldIsCustomerVisible, IS_CUSTOMER_VISIBLE_EDEFAULT, oldIsCustomerVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsCustomerVisible() {
		return isCustomerVisibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationAttributeSet getDeviationAttributeSet() {
		return deviationAttributeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviationAttributeSet(DeviationAttributeSet newDeviationAttributeSet, NotificationChain msgs) {
		DeviationAttributeSet oldDeviationAttributeSet = deviationAttributeSet;
		deviationAttributeSet = newDeviationAttributeSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET, oldDeviationAttributeSet, newDeviationAttributeSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviationAttributeSet(DeviationAttributeSet newDeviationAttributeSet) {
		if (newDeviationAttributeSet != deviationAttributeSet) {
			NotificationChain msgs = null;
			if (deviationAttributeSet != null)
				msgs = ((InternalEObject)deviationAttributeSet).eInverseRemove(this, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE, DeviationAttributeSet.class, msgs);
			if (newDeviationAttributeSet != null)
				msgs = ((InternalEObject)newDeviationAttributeSet).eInverseAdd(this, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE, DeviationAttributeSet.class, msgs);
			msgs = basicSetDeviationAttributeSet(newDeviationAttributeSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET, newDeviationAttributeSet, newDeviationAttributeSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET:
				if (deviationAttributeSet != null)
					msgs = ((InternalEObject)deviationAttributeSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET, null, msgs);
				return basicSetDeviationAttributeSet((DeviationAttributeSet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET:
				return basicSetDeviationAttributeSet(null, msgs);
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
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_DESIGN_VARIABILITY_RATIONALE:
				return getIsDesignVariabilityRationale();
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_REMOVED:
				return getIsRemoved();
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_CUSTOMER_VISIBLE:
				return getIsCustomerVisible();
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET:
				return getDeviationAttributeSet();
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
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_DESIGN_VARIABILITY_RATIONALE:
				setIsDesignVariabilityRationale((Boolean)newValue);
				return;
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_REMOVED:
				setIsRemoved((Boolean)newValue);
				return;
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_CUSTOMER_VISIBLE:
				setIsCustomerVisible((Boolean)newValue);
				return;
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET:
				setDeviationAttributeSet((DeviationAttributeSet)newValue);
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
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_DESIGN_VARIABILITY_RATIONALE:
				unsetIsDesignVariabilityRationale();
				return;
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_REMOVED:
				unsetIsRemoved();
				return;
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_CUSTOMER_VISIBLE:
				unsetIsCustomerVisible();
				return;
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET:
				setDeviationAttributeSet((DeviationAttributeSet)null);
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
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_DESIGN_VARIABILITY_RATIONALE:
				return isSetIsDesignVariabilityRationale();
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_REMOVED:
				return isSetIsRemoved();
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_CUSTOMER_VISIBLE:
				return isSetIsCustomerVisible();
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET:
				return deviationAttributeSet != null;
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
		result.append(" (isDesignVariabilityRationale: ");
		if (isDesignVariabilityRationaleESet) result.append(isDesignVariabilityRationale); else result.append("<unset>");
		result.append(", isRemoved: ");
		if (isRemovedESet) result.append(isRemoved); else result.append("<unset>");
		result.append(", isCustomerVisible: ");
		if (isCustomerVisibleESet) result.append(isCustomerVisible); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VehicleFeatureImpl
