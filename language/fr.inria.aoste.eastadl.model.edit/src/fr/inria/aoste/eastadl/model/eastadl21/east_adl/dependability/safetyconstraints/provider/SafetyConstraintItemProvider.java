/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.provider.TraceableSpecificationItemProvider;

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
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyConstraintItemProvider extends TraceableSpecificationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyConstraintItemProvider(AdapterFactory adapterFactory) {
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

			addAsilValuePropertyDescriptor(object);
			addConstrainedFaultFailurePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Asil Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAsilValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SafetyConstraint_asilValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SafetyConstraint_asilValue_feature", "_UI_SafetyConstraint_type"),
				 SafetyconstraintsPackage.Literals.SAFETY_CONSTRAINT__ASIL_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constrained Fault Failure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstrainedFaultFailurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SafetyConstraint_constrainedFaultFailure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SafetyConstraint_constrainedFaultFailure_feature", "_UI_SafetyConstraint_type"),
				 SafetyconstraintsPackage.Literals.SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns SafetyConstraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SafetyConstraint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SafetyConstraint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SafetyConstraint_type") :
			getString("_UI_SafetyConstraint_type") + " " + label;
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

		switch (notification.getFeatureID(SafetyConstraint.class)) {
			case SafetyconstraintsPackage.SAFETY_CONSTRAINT__ASIL_VALUE:
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
