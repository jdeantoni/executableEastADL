/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.provider.EAElementItemProvider;

import fr.inria.aoste.eastadl.model.eastadl21.provider.Eastadl2110EditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FaultFailurePropagationLinkItemProvider extends EAElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePropagationLinkItemProvider(AdapterFactory adapterFactory) {
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

			addImmediatePropagationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Immediate Propagation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImmediatePropagationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FaultFailurePropagationLink_immediatePropagation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FaultFailurePropagationLink_immediatePropagation_feature", "_UI_FaultFailurePropagationLink_type"),
				 ErrormodelPackage.Literals.FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION,
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
			childrenFeatures.add(ErrormodelPackage.Literals.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT);
			childrenFeatures.add(ErrormodelPackage.Literals.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT);
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
	 * This returns FaultFailurePropagationLink.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FaultFailurePropagationLink"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FaultFailurePropagationLink)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FaultFailurePropagationLink_type") :
			getString("_UI_FaultFailurePropagationLink_type") + " " + label;
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

		switch (notification.getFeatureID(FaultFailurePropagationLink.class)) {
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT:
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT:
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
				(ErrormodelPackage.Literals.FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT,
				 _instancerefFactory.eINSTANCE.createFaultFailurePropagationLink_fromPort()));

		newChildDescriptors.add
			(createChildParameter
				(ErrormodelPackage.Literals.FAULT_FAILURE_PROPAGATION_LINK__TO_PORT,
				 _instancerefFactory.eINSTANCE.createFaultFailurePropagationLink_toPort()));
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
