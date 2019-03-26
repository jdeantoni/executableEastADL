/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.provider.ContextItemProvider;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserattributesFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.InterchangePackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFArea;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsFactory;

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
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFArea} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RIFAreaItemProvider extends ContextItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIFAreaItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(InterchangePackage.Literals.RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT);
			childrenFeatures.add(InterchangePackage.Literals.RIF_AREA__ROOT_REQUIREMENT_CONTAINER);
			childrenFeatures.add(InterchangePackage.Literals.RIF_AREA__USER_DEFINED_TYPE);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RIFArea)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RIFArea_type") :
			getString("_UI_RIFArea_type") + " " + label;
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

		switch (notification.getFeatureID(RIFArea.class)) {
			case InterchangePackage.RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT:
			case InterchangePackage.RIF_AREA__ROOT_REQUIREMENT_CONTAINER:
			case InterchangePackage.RIF_AREA__USER_DEFINED_TYPE:
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
				(InterchangePackage.Literals.RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT,
				 RequirementsFactory.eINSTANCE.createRequirementsRelatedInformation()));

		newChildDescriptors.add
			(createChildParameter
				(InterchangePackage.Literals.RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT,
				 RequirementsFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(InterchangePackage.Literals.RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT,
				 RequirementsFactory.eINSTANCE.createQualityRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(InterchangePackage.Literals.RIF_AREA__ROOT_REQUIREMENT_CONTAINER,
				 RequirementsFactory.eINSTANCE.createRequirementsContainer()));

		newChildDescriptors.add
			(createChildParameter
				(InterchangePackage.Literals.RIF_AREA__ROOT_REQUIREMENT_CONTAINER,
				 SafetyrequirementFactory.eINSTANCE.createFunctionalSafetyConcept()));

		newChildDescriptors.add
			(createChildParameter
				(InterchangePackage.Literals.RIF_AREA__ROOT_REQUIREMENT_CONTAINER,
				 SafetyrequirementFactory.eINSTANCE.createTechnicalSafetyConcept()));

		newChildDescriptors.add
			(createChildParameter
				(InterchangePackage.Literals.RIF_AREA__USER_DEFINED_TYPE,
				 UserattributesFactory.eINSTANCE.createUserAttributeElementType()));
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
