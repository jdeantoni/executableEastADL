/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.UsecasesFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextItemProvider extends EAPackageableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextItemProvider(AdapterFactory adapterFactory) {
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

			addTraceableSpecificationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Traceable Specification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTraceableSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Context_traceableSpecification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Context_traceableSpecification_feature", "_UI_Context_type"),
				 ElementsPackage.Literals.CONTEXT__TRACEABLE_SPECIFICATION,
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
			childrenFeatures.add(ElementsPackage.Literals.CONTEXT__OWNED_RELATIONSHIP);
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
		String label = ((Context)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Context_type") :
			getString("_UI_Context_type") + " " + label;
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

		switch (notification.getFeatureID(Context.class)) {
			case ElementsPackage.CONTEXT__OWNED_RELATIONSHIP:
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
				(ElementsPackage.Literals.CONTEXT__OWNED_RELATIONSHIP,
				 ElementsFactory.eINSTANCE.createMultiLevelReference()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.CONTEXT__OWNED_RELATIONSHIP,
				 ElementsFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.CONTEXT__OWNED_RELATIONSHIP,
				 FeaturemodelingFactory.eINSTANCE.createFeatureLink()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.CONTEXT__OWNED_RELATIONSHIP,
				 RequirementsFactory.eINSTANCE.createDeriveRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.CONTEXT__OWNED_RELATIONSHIP,
				 RequirementsFactory.eINSTANCE.createRefine()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.CONTEXT__OWNED_RELATIONSHIP,
				 RequirementsFactory.eINSTANCE.createSatisfy()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.CONTEXT__OWNED_RELATIONSHIP,
				 RequirementsFactory.eINSTANCE.createRequirementsLink()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.CONTEXT__OWNED_RELATIONSHIP,
				 UsecasesFactory.eINSTANCE.createExtend()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.CONTEXT__OWNED_RELATIONSHIP,
				 UsecasesFactory.eINSTANCE.createInclude()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.CONTEXT__OWNED_RELATIONSHIP,
				 VerificationvalidationFactory.eINSTANCE.createVerify()));
	}

}
