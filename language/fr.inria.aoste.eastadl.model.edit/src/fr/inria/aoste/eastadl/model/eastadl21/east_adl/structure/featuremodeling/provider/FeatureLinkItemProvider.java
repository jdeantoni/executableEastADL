/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.provider.RelationshipItemProvider;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage;

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
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureLinkItemProvider extends RelationshipItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureLinkItemProvider(AdapterFactory adapterFactory) {
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

			addIsBidirectionalPropertyDescriptor(object);
			addCustomTypePropertyDescriptor(object);
			addKindPropertyDescriptor(object);
			addEndPropertyDescriptor(object);
			addStartPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Bidirectional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsBidirectionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureLink_isBidirectional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureLink_isBidirectional_feature", "_UI_FeatureLink_type"),
				 FeaturemodelingPackage.Literals.FEATURE_LINK__IS_BIDIRECTIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Custom Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureLink_customType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureLink_customType_feature", "_UI_FeatureLink_type"),
				 FeaturemodelingPackage.Literals.FEATURE_LINK__CUSTOM_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureLink_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureLink_kind_feature", "_UI_FeatureLink_type"),
				 FeaturemodelingPackage.Literals.FEATURE_LINK__KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureLink_end_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureLink_end_feature", "_UI_FeatureLink_type"),
				 FeaturemodelingPackage.Literals.FEATURE_LINK__END,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureLink_start_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureLink_start_feature", "_UI_FeatureLink_type"),
				 FeaturemodelingPackage.Literals.FEATURE_LINK__START,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns FeatureLink.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureLink"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FeatureLink)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FeatureLink_type") :
			getString("_UI_FeatureLink_type") + " " + label;
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

		switch (notification.getFeatureID(FeatureLink.class)) {
			case FeaturemodelingPackage.FEATURE_LINK__IS_BIDIRECTIONAL:
			case FeaturemodelingPackage.FEATURE_LINK__CUSTOM_TYPE:
			case FeaturemodelingPackage.FEATURE_LINK__KIND:
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
