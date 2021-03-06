/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternEventConstraintItemProvider extends EventConstraintItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternEventConstraintItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TimingconstraintsPackage.Literals.PATTERN_EVENT_CONSTRAINT__PERIOD);
			childrenFeatures.add(TimingconstraintsPackage.Literals.PATTERN_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME);
			childrenFeatures.add(TimingconstraintsPackage.Literals.PATTERN_EVENT_CONSTRAINT__OCCURRENCE);
			childrenFeatures.add(TimingconstraintsPackage.Literals.PATTERN_EVENT_CONSTRAINT__JITTER);
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
	 * This returns PatternEventConstraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PatternEventConstraint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PatternEventConstraint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PatternEventConstraint_type") :
			getString("_UI_PatternEventConstraint_type") + " " + label;
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

		switch (notification.getFeatureID(PatternEventConstraint.class)) {
			case TimingconstraintsPackage.PATTERN_EVENT_CONSTRAINT__PERIOD:
			case TimingconstraintsPackage.PATTERN_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME:
			case TimingconstraintsPackage.PATTERN_EVENT_CONSTRAINT__OCCURRENCE:
			case TimingconstraintsPackage.PATTERN_EVENT_CONSTRAINT__JITTER:
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
				(TimingconstraintsPackage.Literals.PATTERN_EVENT_CONSTRAINT__PERIOD,
				 TimingFactory.eINSTANCE.createTimeDuration()));

		newChildDescriptors.add
			(createChildParameter
				(TimingconstraintsPackage.Literals.PATTERN_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME,
				 TimingFactory.eINSTANCE.createTimeDuration()));

		newChildDescriptors.add
			(createChildParameter
				(TimingconstraintsPackage.Literals.PATTERN_EVENT_CONSTRAINT__OCCURRENCE,
				 TimingFactory.eINSTANCE.createTimeDuration()));

		newChildDescriptors.add
			(createChildParameter
				(TimingconstraintsPackage.Literals.PATTERN_EVENT_CONSTRAINT__JITTER,
				 TimingFactory.eINSTANCE.createTimeDuration()));
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
			childFeature == TimingPackage.Literals.TIMING_CONSTRAINT__LOWER ||
			childFeature == TimingPackage.Literals.TIMING_CONSTRAINT__UPPER ||
			childFeature == TimingconstraintsPackage.Literals.EVENT_CONSTRAINT__OFFSET ||
			childFeature == TimingconstraintsPackage.Literals.PATTERN_EVENT_CONSTRAINT__PERIOD ||
			childFeature == TimingconstraintsPackage.Literals.PATTERN_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME ||
			childFeature == TimingconstraintsPackage.Literals.PATTERN_EVENT_CONSTRAINT__OCCURRENCE ||
			childFeature == TimingconstraintsPackage.Literals.PATTERN_EVENT_CONSTRAINT__JITTER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
