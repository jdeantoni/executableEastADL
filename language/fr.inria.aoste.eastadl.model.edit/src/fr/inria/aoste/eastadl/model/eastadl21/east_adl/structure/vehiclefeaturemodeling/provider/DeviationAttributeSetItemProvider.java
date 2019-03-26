/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.provider.EAElementItemProvider;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage;

import fr.inria.aoste.eastadl.model.eastadl21.provider.Eastadl2110EditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviationAttributeSetItemProvider extends EAElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationAttributeSetItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAllowChangeAttributePropertyDescriptor(object);
			addAllowChangeCardinalityPropertyDescriptor(object);
			addAllowChangeDescriptionPropertyDescriptor(object);
			addAllowChangeNamePropertyDescriptor(object);
			addAllowMovePropertyDescriptor(object);
			addAllowReductionPropertyDescriptor(object);
			addAllowRefinementPropertyDescriptor(object);
			addAllowRegroupingPropertyDescriptor(object);
			addAllowRemovalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allow Change Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowChangeAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviationAttributeSet_allowChangeAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviationAttributeSet_allowChangeAttribute_feature", "_UI_DeviationAttributeSet_type"),
				 VehiclefeaturemodelingPackage.Literals.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Change Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowChangeCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviationAttributeSet_allowChangeCardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviationAttributeSet_allowChangeCardinality_feature", "_UI_DeviationAttributeSet_type"),
				 VehiclefeaturemodelingPackage.Literals.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Change Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowChangeDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviationAttributeSet_allowChangeDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviationAttributeSet_allowChangeDescription_feature", "_UI_DeviationAttributeSet_type"),
				 VehiclefeaturemodelingPackage.Literals.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Change Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowChangeNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviationAttributeSet_allowChangeName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviationAttributeSet_allowChangeName_feature", "_UI_DeviationAttributeSet_type"),
				 VehiclefeaturemodelingPackage.Literals.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Move feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowMovePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviationAttributeSet_allowMove_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviationAttributeSet_allowMove_feature", "_UI_DeviationAttributeSet_type"),
				 VehiclefeaturemodelingPackage.Literals.DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Reduction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowReductionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviationAttributeSet_allowReduction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviationAttributeSet_allowReduction_feature", "_UI_DeviationAttributeSet_type"),
				 VehiclefeaturemodelingPackage.Literals.DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Refinement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowRefinementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviationAttributeSet_allowRefinement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviationAttributeSet_allowRefinement_feature", "_UI_DeviationAttributeSet_type"),
				 VehiclefeaturemodelingPackage.Literals.DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Regrouping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowRegroupingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviationAttributeSet_allowRegrouping_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviationAttributeSet_allowRegrouping_feature", "_UI_DeviationAttributeSet_type"),
				 VehiclefeaturemodelingPackage.Literals.DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Removal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowRemovalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviationAttributeSet_allowRemoval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviationAttributeSet_allowRemoval_feature", "_UI_DeviationAttributeSet_type"),
				 VehiclefeaturemodelingPackage.Literals.DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DeviationAttributeSet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeviationAttributeSet"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DeviationAttributeSet)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DeviationAttributeSet_type") :
			getString("_UI_DeviationAttributeSet_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DeviationAttributeSet.class)) {
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE:
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY:
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION:
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME:
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE:
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION:
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT:
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING:
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Eastadl2110EditPlugin.INSTANCE;
	}

}
