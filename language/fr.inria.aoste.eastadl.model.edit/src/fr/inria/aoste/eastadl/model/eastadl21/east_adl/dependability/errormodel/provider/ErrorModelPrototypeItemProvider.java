/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorModelPrototypeItemProvider extends EAElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelPrototypeItemProvider(AdapterFactory adapterFactory) {
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

			addTargetPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_ErrorModelPrototype_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorModelPrototype_target_feature", "_UI_ErrorModelPrototype_type"),
				 ErrormodelPackage.Literals.ERROR_MODEL_PROTOTYPE__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ErrorModelPrototype_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ErrorModelPrototype_type_feature", "_UI_ErrorModelPrototype_type"),
				 ErrormodelPackage.Literals.ERROR_MODEL_PROTOTYPE__TYPE,
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
			childrenFeatures.add(ErrormodelPackage.Literals.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET);
			childrenFeatures.add(ErrormodelPackage.Literals.ERROR_MODEL_PROTOTYPE__HW_TARGET);
			childrenFeatures.add(ErrormodelPackage.Literals.ERROR_MODEL_PROTOTYPE__EXTERNAL_FAULT_PROXY);
			childrenFeatures.add(ErrormodelPackage.Literals.ERROR_MODEL_PROTOTYPE__FAILURE_PROXY);
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
	 * This returns ErrorModelPrototype.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ErrorModelPrototype"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ErrorModelPrototype)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ErrorModelPrototype_type") :
			getString("_UI_ErrorModelPrototype_type") + " " + label;
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

		switch (notification.getFeatureID(ErrorModelPrototype.class)) {
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET:
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__HW_TARGET:
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__EXTERNAL_FAULT_PROXY:
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE__FAILURE_PROXY:
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
				(ErrormodelPackage.Literals.ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET,
				 _instancerefFactory.eINSTANCE.createErrorModelPrototype_functionTarget()));

		newChildDescriptors.add
			(createChildParameter
				(ErrormodelPackage.Literals.ERROR_MODEL_PROTOTYPE__HW_TARGET,
				 _instancerefFactory.eINSTANCE.createErrorModelPrototype_hwTarget()));

		newChildDescriptors.add
			(createChildParameter
				(ErrormodelPackage.Literals.ERROR_MODEL_PROTOTYPE__EXTERNAL_FAULT_PROXY,
				 ErrormodelFactory.eINSTANCE.createFaultInPortProxy()));

		newChildDescriptors.add
			(createChildParameter
				(ErrormodelPackage.Literals.ERROR_MODEL_PROTOTYPE__FAILURE_PROXY,
				 ErrormodelFactory.eINSTANCE.createFailureOutPortProxy()));
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
