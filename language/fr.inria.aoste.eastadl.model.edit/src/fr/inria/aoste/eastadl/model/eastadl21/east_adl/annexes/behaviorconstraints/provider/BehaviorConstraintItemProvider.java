/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.provider.EAElementItemProvider;

import fr.inria.aoste.eastadl.model.eastadl21.provider.Eastadl2110EditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorConstraintItemProvider extends EAElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConstraintItemProvider(AdapterFactory adapterFactory) {
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

			addConstrainedModePropertyDescriptor(object);
			addRelatedVehicleFeaturePropertyDescriptor(object);
			addConstrainedFunctionBehaviorPropertyDescriptor(object);
			addConstrainedErrorBehaviorPropertyDescriptor(object);
			addConstrainedFunctionTriggerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Constrained Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstrainedModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviorConstraint_constrainedMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviorConstraint_constrainedMode_feature", "_UI_BehaviorConstraint_type"),
				 BehaviorconstraintsPackage.Literals.BEHAVIOR_CONSTRAINT__CONSTRAINED_MODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Related Vehicle Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedVehicleFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviorConstraint_relatedVehicleFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviorConstraint_relatedVehicleFeature_feature", "_UI_BehaviorConstraint_type"),
				 BehaviorconstraintsPackage.Literals.BEHAVIOR_CONSTRAINT__RELATED_VEHICLE_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constrained Function Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstrainedFunctionBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviorConstraint_constrainedFunctionBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviorConstraint_constrainedFunctionBehavior_feature", "_UI_BehaviorConstraint_type"),
				 BehaviorconstraintsPackage.Literals.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_BEHAVIOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constrained Error Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstrainedErrorBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviorConstraint_constrainedErrorBehavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviorConstraint_constrainedErrorBehavior_feature", "_UI_BehaviorConstraint_type"),
				 BehaviorconstraintsPackage.Literals.BEHAVIOR_CONSTRAINT__CONSTRAINED_ERROR_BEHAVIOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constrained Function Trigger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstrainedFunctionTriggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviorConstraint_constrainedFunctionTrigger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviorConstraint_constrainedFunctionTrigger_feature", "_UI_BehaviorConstraint_type"),
				 BehaviorconstraintsPackage.Literals.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_TRIGGER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BehaviorConstraint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BehaviorConstraint_type") :
			getString("_UI_BehaviorConstraint_type") + " " + label;
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
