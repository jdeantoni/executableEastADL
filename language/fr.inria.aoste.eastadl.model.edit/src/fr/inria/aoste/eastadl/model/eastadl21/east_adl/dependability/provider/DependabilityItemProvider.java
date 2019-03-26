/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.Dependability;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DependabilityFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DependabilityPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycaseFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.DatatypesFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.provider.ContextItemProvider;

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
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.Dependability} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DependabilityItemProvider extends ContextItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependabilityItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DependabilityPackage.Literals.DEPENDABILITY__FEATURE_FLAW);
			childrenFeatures.add(DependabilityPackage.Literals.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT);
			childrenFeatures.add(DependabilityPackage.Literals.DEPENDABILITY__SAFETY_CASE);
			childrenFeatures.add(DependabilityPackage.Literals.DEPENDABILITY__HAZARD);
			childrenFeatures.add(DependabilityPackage.Literals.DEPENDABILITY__FAULT_FAILURE);
			childrenFeatures.add(DependabilityPackage.Literals.DEPENDABILITY__EA_DATATYPE);
			childrenFeatures.add(DependabilityPackage.Literals.DEPENDABILITY__HAZARDOUS_EVENT);
			childrenFeatures.add(DependabilityPackage.Literals.DEPENDABILITY__SAFETY_CONSTRAINT);
			childrenFeatures.add(DependabilityPackage.Literals.DEPENDABILITY__ERROR_MODEL_TYPE);
			childrenFeatures.add(DependabilityPackage.Literals.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT);
			childrenFeatures.add(DependabilityPackage.Literals.DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT);
			childrenFeatures.add(DependabilityPackage.Literals.DEPENDABILITY__ITEM);
			childrenFeatures.add(DependabilityPackage.Literals.DEPENDABILITY__SAFETY_GOAL);
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
	 * This returns Dependability.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Dependability"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Dependability)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Dependability_type") :
			getString("_UI_Dependability_type") + " " + label;
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

		switch (notification.getFeatureID(Dependability.class)) {
			case DependabilityPackage.DEPENDABILITY__FEATURE_FLAW:
			case DependabilityPackage.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT:
			case DependabilityPackage.DEPENDABILITY__SAFETY_CASE:
			case DependabilityPackage.DEPENDABILITY__HAZARD:
			case DependabilityPackage.DEPENDABILITY__FAULT_FAILURE:
			case DependabilityPackage.DEPENDABILITY__EA_DATATYPE:
			case DependabilityPackage.DEPENDABILITY__HAZARDOUS_EVENT:
			case DependabilityPackage.DEPENDABILITY__SAFETY_CONSTRAINT:
			case DependabilityPackage.DEPENDABILITY__ERROR_MODEL_TYPE:
			case DependabilityPackage.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT:
			case DependabilityPackage.DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT:
			case DependabilityPackage.DEPENDABILITY__ITEM:
			case DependabilityPackage.DEPENDABILITY__SAFETY_GOAL:
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
				(DependabilityPackage.Literals.DEPENDABILITY__FEATURE_FLAW,
				 DependabilityFactory.eINSTANCE.createFeatureFlaw()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT,
				 SafetyrequirementFactory.eINSTANCE.createTechnicalSafetyConcept()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__SAFETY_CASE,
				 SafetycaseFactory.eINSTANCE.createSafetyCase()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__HAZARD,
				 DependabilityFactory.eINSTANCE.createHazard()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__FAULT_FAILURE,
				 SafetyconstraintsFactory.eINSTANCE.createFaultFailure()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__EA_DATATYPE,
				 DatatypesFactory.eINSTANCE.createEnumerationValueType()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__EA_DATATYPE,
				 DatatypesFactory.eINSTANCE.createRangeableValueType()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__EA_DATATYPE,
				 DatatypesFactory.eINSTANCE.createCompositeDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__EA_DATATYPE,
				 DatatypesFactory.eINSTANCE.createEABoolean()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__EA_DATATYPE,
				 DatatypesFactory.eINSTANCE.createEAFloat()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__EA_DATATYPE,
				 DatatypesFactory.eINSTANCE.createEAInteger()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__EA_DATATYPE,
				 DatatypesFactory.eINSTANCE.createEAString()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__EA_DATATYPE,
				 DatatypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__HAZARDOUS_EVENT,
				 DependabilityFactory.eINSTANCE.createHazardousEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__SAFETY_CONSTRAINT,
				 SafetyconstraintsFactory.eINSTANCE.createSafetyConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__ERROR_MODEL_TYPE,
				 ErrormodelFactory.eINSTANCE.createErrorModelType()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT,
				 SafetyrequirementFactory.eINSTANCE.createFunctionalSafetyConcept()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT,
				 SafetyconstraintsFactory.eINSTANCE.createQuantitativeSafetyConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__ITEM,
				 DependabilityFactory.eINSTANCE.createItem()));

		newChildDescriptors.add
			(createChildParameter
				(DependabilityPackage.Literals.DEPENDABILITY__SAFETY_GOAL,
				 SafetyrequirementFactory.eINSTANCE.createSafetyGoal()));
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
