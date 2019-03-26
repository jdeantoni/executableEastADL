/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.provider.EAElementItemProvider;

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
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyGoalItemProvider extends EAElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyGoalItemProvider(AdapterFactory adapterFactory) {
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

			addHazardClassificationPropertyDescriptor(object);
			addSafeStatesPropertyDescriptor(object);
			addSafeModesPropertyDescriptor(object);
			addDerivedFromPropertyDescriptor(object);
			addRequirementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hazard Classification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHazardClassificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SafetyGoal_hazardClassification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SafetyGoal_hazardClassification_feature", "_UI_SafetyGoal_type"),
				 SafetyrequirementPackage.Literals.SAFETY_GOAL__HAZARD_CLASSIFICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Safe States feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSafeStatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SafetyGoal_safeStates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SafetyGoal_safeStates_feature", "_UI_SafetyGoal_type"),
				 SafetyrequirementPackage.Literals.SAFETY_GOAL__SAFE_STATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Safe Modes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSafeModesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SafetyGoal_safeModes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SafetyGoal_safeModes_feature", "_UI_SafetyGoal_type"),
				 SafetyrequirementPackage.Literals.SAFETY_GOAL__SAFE_MODES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Derived From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SafetyGoal_derivedFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SafetyGoal_derivedFrom_feature", "_UI_SafetyGoal_type"),
				 SafetyrequirementPackage.Literals.SAFETY_GOAL__DERIVED_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requirement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequirementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SafetyGoal_requirement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SafetyGoal_requirement_feature", "_UI_SafetyGoal_type"),
				 SafetyrequirementPackage.Literals.SAFETY_GOAL__REQUIREMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns SafetyGoal.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SafetyGoal"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SafetyGoal)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SafetyGoal_type") :
			getString("_UI_SafetyGoal_type") + " " + label;
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

		switch (notification.getFeatureID(SafetyGoal.class)) {
			case SafetyrequirementPackage.SAFETY_GOAL__HAZARD_CLASSIFICATION:
			case SafetyrequirementPackage.SAFETY_GOAL__SAFE_STATES:
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
