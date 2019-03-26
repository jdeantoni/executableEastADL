/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.provider.TraceableSpecificationItemProvider;

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
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorModelTypeItemProvider extends TraceableSpecificationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelTypeItemProvider(AdapterFactory adapterFactory) {
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

			addGenericDescriptionPropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addHwTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Generic Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenericDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorModelType_genericDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorModelType_genericDescription_feature", "_UI_ErrorModelType_type"),
				 ErrormodelPackage.Literals.ERROR_MODEL_TYPE__GENERIC_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorModelType_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorModelType_target_feature", "_UI_ErrorModelType_type"),
				 ErrormodelPackage.Literals.ERROR_MODEL_TYPE__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hw Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHwTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorModelType_hwTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorModelType_hwTarget_feature", "_UI_ErrorModelType_type"),
				 ErrormodelPackage.Literals.ERROR_MODEL_TYPE__HW_TARGET,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION);
			childrenFeatures.add(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR);
			childrenFeatures.add(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__EXTERNAL_FAULT);
			childrenFeatures.add(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__PART);
			childrenFeatures.add(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__FAILURE);
			childrenFeatures.add(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__INTERNAL_FAULT);
			childrenFeatures.add(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__PROCESS_FAULT);
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
	 * This returns ErrorModelType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ErrorModelType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ErrorModelType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ErrorModelType_type") :
			getString("_UI_ErrorModelType_type") + " " + label;
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

		switch (notification.getFeatureID(ErrorModelType.class)) {
			case ErrormodelPackage.ERROR_MODEL_TYPE__GENERIC_DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION:
			case ErrormodelPackage.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR:
			case ErrormodelPackage.ERROR_MODEL_TYPE__EXTERNAL_FAULT:
			case ErrormodelPackage.ERROR_MODEL_TYPE__PART:
			case ErrormodelPackage.ERROR_MODEL_TYPE__FAILURE:
			case ErrormodelPackage.ERROR_MODEL_TYPE__INTERNAL_FAULT:
			case ErrormodelPackage.ERROR_MODEL_TYPE__PROCESS_FAULT:
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
				(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION,
				 ErrormodelFactory.eINSTANCE.createErrorBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR,
				 ErrormodelFactory.eINSTANCE.createFaultFailurePropagationLink()));

		newChildDescriptors.add
			(createChildParameter
				(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__EXTERNAL_FAULT,
				 ErrormodelFactory.eINSTANCE.createFaultInPort()));

		newChildDescriptors.add
			(createChildParameter
				(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__PART,
				 ErrormodelFactory.eINSTANCE.createErrorModelPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__FAILURE,
				 ErrormodelFactory.eINSTANCE.createFailureOutPort()));

		newChildDescriptors.add
			(createChildParameter
				(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__INTERNAL_FAULT,
				 ErrormodelFactory.eINSTANCE.createInternalFaultPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(ErrormodelPackage.Literals.ERROR_MODEL_TYPE__PROCESS_FAULT,
				 ErrormodelFactory.eINSTANCE.createProcessFaultPrototype()));
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
