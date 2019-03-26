/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.DatatypesFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureItemProvider extends FeatureTreeNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureItemProvider(AdapterFactory adapterFactory) {
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

			addCardinalityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_cardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_cardinality_feature", "_UI_Feature_type"),
				 FeaturemodelingPackage.Literals.FEATURE__CARDINALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FeaturemodelingPackage.Literals.FEATURE__REQUIRED_BINDING_TIME);
			childrenFeatures.add(FeaturemodelingPackage.Literals.FEATURE__ACTUAL_BINDING_TIME);
			childrenFeatures.add(FeaturemodelingPackage.Literals.FEATURE__CHILD_NODE);
			childrenFeatures.add(FeaturemodelingPackage.Literals.FEATURE__FEATURE_PARAMETER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Feature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Feature"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Feature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Feature_type") :
			getString("_UI_Feature_type") + " " + label;
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

		switch (notification.getFeatureID(Feature.class)) {
			case FeaturemodelingPackage.FEATURE__CARDINALITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FeaturemodelingPackage.FEATURE__REQUIRED_BINDING_TIME:
			case FeaturemodelingPackage.FEATURE__ACTUAL_BINDING_TIME:
			case FeaturemodelingPackage.FEATURE__CHILD_NODE:
			case FeaturemodelingPackage.FEATURE__FEATURE_PARAMETER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(FeaturemodelingPackage.Literals.FEATURE__REQUIRED_BINDING_TIME,
				 FeaturemodelingFactory.eINSTANCE.createBindingTime()));

		newChildDescriptors.add
			(createChildParameter
				(FeaturemodelingPackage.Literals.FEATURE__ACTUAL_BINDING_TIME,
				 FeaturemodelingFactory.eINSTANCE.createBindingTime()));

		newChildDescriptors.add
			(createChildParameter
				(FeaturemodelingPackage.Literals.FEATURE__CHILD_NODE,
				 FeaturemodelingFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(FeaturemodelingPackage.Literals.FEATURE__CHILD_NODE,
				 FeaturemodelingFactory.eINSTANCE.createFeatureGroup()));

		newChildDescriptors.add
			(createChildParameter
				(FeaturemodelingPackage.Literals.FEATURE__CHILD_NODE,
				 VehiclefeaturemodelingFactory.eINSTANCE.createVehicleFeature()));

		newChildDescriptors.add
			(createChildParameter
				(FeaturemodelingPackage.Literals.FEATURE__FEATURE_PARAMETER,
				 DatatypesFactory.eINSTANCE.createEADatatypePrototype()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == FeaturemodelingPackage.Literals.FEATURE__REQUIRED_BINDING_TIME ||
			childFeature == FeaturemodelingPackage.Literals.FEATURE__ACTUAL_BINDING_TIME;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
