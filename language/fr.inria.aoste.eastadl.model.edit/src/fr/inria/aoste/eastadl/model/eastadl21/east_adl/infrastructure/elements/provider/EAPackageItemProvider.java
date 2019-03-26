/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DependabilityFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycaseFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment.EnvironmentFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.GenericconstraintsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.DatatypesFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserattributesFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.InterchangeFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.UsecasesFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.SystemmodelingFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingFactory;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityFactory;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GelementsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EAPackageItemProvider extends EAElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAPackageItemProvider(AdapterFactory adapterFactory) {
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

			addGElementPropertyDescriptor(object);
			addGSubPackagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the GElement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GEAPackage_gElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GEAPackage_gElement_feature", "_UI_GEAPackage_type"),
				 GelementsPackage.Literals.GEA_PACKAGE__GELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the GSub Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGSubPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GEAPackage_gSubPackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GEAPackage_gSubPackage_feature", "_UI_GEAPackage_type"),
				 GelementsPackage.Literals.GEA_PACKAGE__GSUB_PACKAGE,
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
			childrenFeatures.add(ElementsPackage.Literals.EA_PACKAGE__SUB_PACKAGE);
			childrenFeatures.add(ElementsPackage.Literals.EA_PACKAGE__ELEMENT);
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
	 * This returns EAPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EAPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EAPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EAPackage_type") :
			getString("_UI_EAPackage_type") + " " + label;
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

		switch (notification.getFeatureID(EAPackage.class)) {
			case ElementsPackage.EA_PACKAGE__SUB_PACKAGE:
			case ElementsPackage.EA_PACKAGE__ELEMENT:
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
				(ElementsPackage.Literals.EA_PACKAGE__SUB_PACKAGE,
				 ElementsFactory.eINSTANCE.createEAPackage()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SystemmodelingFactory.eINSTANCE.createVehicleLevel()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SystemmodelingFactory.eINSTANCE.createSystemModel()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SystemmodelingFactory.eINSTANCE.createAnalysisLevel()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SystemmodelingFactory.eINSTANCE.createDesignLevel()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SystemmodelingFactory.eINSTANCE.createImplementationLevel()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 FeaturemodelingFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 FeaturemodelingFactory.eINSTANCE.createFeatureGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 FeaturemodelingFactory.eINSTANCE.createFeatureModel()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 VehiclefeaturemodelingFactory.eINSTANCE.createVehicleFeature()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 FunctionmodelingFactory.eINSTANCE.createAnalysisFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 FunctionmodelingFactory.eINSTANCE.createDesignFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 FunctionmodelingFactory.eINSTANCE.createBasicSoftwareFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 FunctionmodelingFactory.eINSTANCE.createFunctionalDevice()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 FunctionmodelingFactory.eINSTANCE.createFunctionClientServerInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 FunctionmodelingFactory.eINSTANCE.createHardwareFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 FunctionmodelingFactory.eINSTANCE.createLocalDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 HardwaremodelingFactory.eINSTANCE.createHardwareComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 HardwaremodelingFactory.eINSTANCE.createActuator()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 HardwaremodelingFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 HardwaremodelingFactory.eINSTANCE.createPowerSupply()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 HardwaremodelingFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 BehaviorFactory.eINSTANCE.createBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 BehaviorFactory.eINSTANCE.createModeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 BehaviorFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 VariabilityFactory.eINSTANCE.createReuseMetaInformation()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 VariabilityFactory.eINSTANCE.createVariability()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 RequirementsFactory.eINSTANCE.createOperationalSituation()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 RequirementsFactory.eINSTANCE.createRequirementsModel()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 RequirementsFactory.eINSTANCE.createRequirementsRelatedInformation()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 RequirementsFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 RequirementsFactory.eINSTANCE.createRequirementsContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 RequirementsFactory.eINSTANCE.createRequirementsRelationGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 RequirementsFactory.eINSTANCE.createQualityRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 UsecasesFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 UsecasesFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 VerificationvalidationFactory.eINSTANCE.createVerificationValidation()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 VerificationvalidationFactory.eINSTANCE.createVVActualOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 VerificationvalidationFactory.eINSTANCE.createVVIntendedOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 VerificationvalidationFactory.eINSTANCE.createVVLog()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 VerificationvalidationFactory.eINSTANCE.createVVProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 VerificationvalidationFactory.eINSTANCE.createVVStimuli()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 VerificationvalidationFactory.eINSTANCE.createVVTarget()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 VerificationvalidationFactory.eINSTANCE.createVVCase()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 EnvironmentFactory.eINSTANCE.createEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 InterchangeFactory.eINSTANCE.createRIFExportArea()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 InterchangeFactory.eINSTANCE.createRIFImportArea()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 TimingFactory.eINSTANCE.createTiming()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 DependabilityFactory.eINSTANCE.createDependability()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 DependabilityFactory.eINSTANCE.createFeatureFlaw()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 DependabilityFactory.eINSTANCE.createItem()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 DependabilityFactory.eINSTANCE.createHazard()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 DependabilityFactory.eINSTANCE.createHazardousEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SafetyconstraintsFactory.eINSTANCE.createFaultFailure()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SafetyconstraintsFactory.eINSTANCE.createQuantitativeSafetyConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SafetyconstraintsFactory.eINSTANCE.createSafetyConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 ErrormodelFactory.eINSTANCE.createErrorModelType()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SafetyrequirementFactory.eINSTANCE.createFunctionalSafetyConcept()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SafetyrequirementFactory.eINSTANCE.createTechnicalSafetyConcept()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SafetycaseFactory.eINSTANCE.createClaim()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SafetycaseFactory.eINSTANCE.createGround()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SafetycaseFactory.eINSTANCE.createSafetyCase()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 SafetycaseFactory.eINSTANCE.createWarrant()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 GenericconstraintsFactory.eINSTANCE.createGenericConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 GenericconstraintsFactory.eINSTANCE.createGenericConstraintSet()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 GenericconstraintsFactory.eINSTANCE.createTakeRateConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 DatatypesFactory.eINSTANCE.createEnumerationValueType()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 DatatypesFactory.eINSTANCE.createRangeableValueType()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 DatatypesFactory.eINSTANCE.createCompositeDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 DatatypesFactory.eINSTANCE.createEABoolean()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 DatatypesFactory.eINSTANCE.createEAFloat()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 DatatypesFactory.eINSTANCE.createEAInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 DatatypesFactory.eINSTANCE.createEAString()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 DatatypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 UserattributesFactory.eINSTANCE.createUserAttributeElementType()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 BehaviorconstraintsFactory.eINSTANCE.createBehaviorAnnex()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 NeedsFactory.eINSTANCE.createStakeholder()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 NeedsFactory.eINSTANCE.createStakeholderNeed()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 NeedsFactory.eINSTANCE.createBusinessOpportunity()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 NeedsFactory.eINSTANCE.createProblemStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ElementsPackage.Literals.EA_PACKAGE__ELEMENT,
				 NeedsFactory.eINSTANCE.createProductPositioning()));
	}

}
