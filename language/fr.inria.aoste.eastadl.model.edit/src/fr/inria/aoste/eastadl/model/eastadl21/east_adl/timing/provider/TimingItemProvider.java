/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.provider.ContextItemProvider;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Timing;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.provider.Eastadl2110EditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Timing} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingItemProvider extends ContextItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(TimingPackage.Literals.TIMING__TIMING_DESCRIPTION);
			childrenFeatures.add(TimingPackage.Literals.TIMING__TIMING_CONSTRAINT);
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
	 * This returns Timing.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Timing"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Timing)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Timing_type") :
			getString("_UI_Timing_type") + " " + label;
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

		switch (notification.getFeatureID(Timing.class)) {
			case TimingPackage.TIMING__TIMING_DESCRIPTION:
			case TimingPackage.TIMING__TIMING_CONSTRAINT:
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
				(TimingPackage.Literals.TIMING__TIMING_DESCRIPTION,
				 TimingFactory.eINSTANCE.createEventChain()));

		newChildDescriptors.add
			(createChildParameter
				(TimingPackage.Literals.TIMING__TIMING_DESCRIPTION,
				 EventsFactory.eINSTANCE.createEventFunction()));

		newChildDescriptors.add
			(createChildParameter
				(TimingPackage.Literals.TIMING__TIMING_DESCRIPTION,
				 EventsFactory.eINSTANCE.createEventFunctionClientServerPort()));

		newChildDescriptors.add
			(createChildParameter
				(TimingPackage.Literals.TIMING__TIMING_DESCRIPTION,
				 EventsFactory.eINSTANCE.createEventFunctionFlowPort()));

		newChildDescriptors.add
			(createChildParameter
				(TimingPackage.Literals.TIMING__TIMING_CONSTRAINT,
				 TimingFactory.eINSTANCE.createExecutionTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingPackage.Literals.TIMING__TIMING_CONSTRAINT,
				 TimingFactory.eINSTANCE.createPrecedenceConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingPackage.Literals.TIMING__TIMING_CONSTRAINT,
				 TimingconstraintsFactory.eINSTANCE.createArbitraryEventConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingPackage.Literals.TIMING__TIMING_CONSTRAINT,
				 TimingconstraintsFactory.eINSTANCE.createPatternEventConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingPackage.Literals.TIMING__TIMING_CONSTRAINT,
				 TimingconstraintsFactory.eINSTANCE.createPeriodicEventConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingPackage.Literals.TIMING__TIMING_CONSTRAINT,
				 TimingconstraintsFactory.eINSTANCE.createSporadicEventConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingPackage.Literals.TIMING__TIMING_CONSTRAINT,
				 TimingconstraintsFactory.eINSTANCE.createAgeTimingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingPackage.Literals.TIMING__TIMING_CONSTRAINT,
				 TimingconstraintsFactory.eINSTANCE.createInputSynchronizationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingPackage.Literals.TIMING__TIMING_CONSTRAINT,
				 TimingconstraintsFactory.eINSTANCE.createReactionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(TimingPackage.Literals.TIMING__TIMING_CONSTRAINT,
				 TimingconstraintsFactory.eINSTANCE.createOutputSynchronizationConstraint()));
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
