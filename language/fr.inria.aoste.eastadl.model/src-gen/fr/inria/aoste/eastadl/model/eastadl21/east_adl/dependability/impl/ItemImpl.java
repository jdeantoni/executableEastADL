/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DependabilityPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DevelopmentCategoryKind;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.Item;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.impl.ItemImpl#getDevelopmentCategory <em>Development Category</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.impl.ItemImpl#getVehicleFeature <em>Vehicle Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends TraceableSpecificationImpl implements Item {
	/**
	 * The default value of the '{@link #getDevelopmentCategory() <em>Development Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentCategory()
	 * @generated
	 * @ordered
	 */
	protected static final DevelopmentCategoryKind DEVELOPMENT_CATEGORY_EDEFAULT = DevelopmentCategoryKind.NEW_ITEM_DEVELOPMENT;

	/**
	 * The cached value of the '{@link #getDevelopmentCategory() <em>Development Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentCategory()
	 * @generated
	 * @ordered
	 */
	protected DevelopmentCategoryKind developmentCategory = DEVELOPMENT_CATEGORY_EDEFAULT;

	/**
	 * This is true if the Development Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean developmentCategoryESet;

	/**
	 * The cached value of the '{@link #getVehicleFeature() <em>Vehicle Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleFeature> vehicleFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependabilityPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentCategoryKind getDevelopmentCategory() {
		return developmentCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevelopmentCategory(DevelopmentCategoryKind newDevelopmentCategory) {
		DevelopmentCategoryKind oldDevelopmentCategory = developmentCategory;
		developmentCategory = newDevelopmentCategory == null ? DEVELOPMENT_CATEGORY_EDEFAULT : newDevelopmentCategory;
		boolean oldDevelopmentCategoryESet = developmentCategoryESet;
		developmentCategoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependabilityPackage.ITEM__DEVELOPMENT_CATEGORY, oldDevelopmentCategory, developmentCategory, !oldDevelopmentCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDevelopmentCategory() {
		DevelopmentCategoryKind oldDevelopmentCategory = developmentCategory;
		boolean oldDevelopmentCategoryESet = developmentCategoryESet;
		developmentCategory = DEVELOPMENT_CATEGORY_EDEFAULT;
		developmentCategoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DependabilityPackage.ITEM__DEVELOPMENT_CATEGORY, oldDevelopmentCategory, DEVELOPMENT_CATEGORY_EDEFAULT, oldDevelopmentCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDevelopmentCategory() {
		return developmentCategoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VehicleFeature> getVehicleFeature() {
		if (vehicleFeature == null) {
			vehicleFeature = new EObjectResolvingEList<VehicleFeature>(VehicleFeature.class, this, DependabilityPackage.ITEM__VEHICLE_FEATURE);
		}
		return vehicleFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependabilityPackage.ITEM__DEVELOPMENT_CATEGORY:
				return getDevelopmentCategory();
			case DependabilityPackage.ITEM__VEHICLE_FEATURE:
				return getVehicleFeature();
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
			case DependabilityPackage.ITEM__DEVELOPMENT_CATEGORY:
				setDevelopmentCategory((DevelopmentCategoryKind)newValue);
				return;
			case DependabilityPackage.ITEM__VEHICLE_FEATURE:
				getVehicleFeature().clear();
				getVehicleFeature().addAll((Collection<? extends VehicleFeature>)newValue);
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
			case DependabilityPackage.ITEM__DEVELOPMENT_CATEGORY:
				unsetDevelopmentCategory();
				return;
			case DependabilityPackage.ITEM__VEHICLE_FEATURE:
				getVehicleFeature().clear();
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
			case DependabilityPackage.ITEM__DEVELOPMENT_CATEGORY:
				return isSetDevelopmentCategory();
			case DependabilityPackage.ITEM__VEHICLE_FEATURE:
				return vehicleFeature != null && !vehicleFeature.isEmpty();
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
		result.append(" (developmentCategory: ");
		if (developmentCategoryESet) result.append(developmentCategory); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ItemImpl
