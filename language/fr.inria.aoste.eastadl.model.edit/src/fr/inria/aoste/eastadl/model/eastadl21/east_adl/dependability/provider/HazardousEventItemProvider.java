/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.provider;


import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DependabilityPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.HazardousEvent;

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
 * This is the item provider adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.HazardousEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HazardousEventItemProvider extends TraceableSpecificationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardousEventItemProvider(AdapterFactory adapterFactory) {
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

			addControllabilityPropertyDescriptor(object);
			addExposurePropertyDescriptor(object);
			addSeverityPropertyDescriptor(object);
			addHazardClassificationPropertyDescriptor(object);
			addClassificationAssumptionsPropertyDescriptor(object);
			addOperatingModePropertyDescriptor(object);
			addExternalMeasuresPropertyDescriptor(object);
			addOperationalSituationUseCasePropertyDescriptor(object);
			addEnvironmentPropertyDescriptor(object);
			addHazardPropertyDescriptor(object);
			addTrafficPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Controllability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControllabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HazardousEvent_controllability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HazardousEvent_controllability_feature", "_UI_HazardousEvent_type"),
				 DependabilityPackage.Literals.HAZARDOUS_EVENT__CONTROLLABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exposure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExposurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HazardousEvent_exposure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HazardousEvent_exposure_feature", "_UI_HazardousEvent_type"),
				 DependabilityPackage.Literals.HAZARDOUS_EVENT__EXPOSURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Severity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeverityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HazardousEvent_severity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HazardousEvent_severity_feature", "_UI_HazardousEvent_type"),
				 DependabilityPackage.Literals.HAZARDOUS_EVENT__SEVERITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_HazardousEvent_hazardClassification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HazardousEvent_hazardClassification_feature", "_UI_HazardousEvent_type"),
				 DependabilityPackage.Literals.HAZARDOUS_EVENT__HAZARD_CLASSIFICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Classification Assumptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassificationAssumptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HazardousEvent_classificationAssumptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HazardousEvent_classificationAssumptions_feature", "_UI_HazardousEvent_type"),
				 DependabilityPackage.Literals.HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operating Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatingModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HazardousEvent_operatingMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HazardousEvent_operatingMode_feature", "_UI_HazardousEvent_type"),
				 DependabilityPackage.Literals.HAZARDOUS_EVENT__OPERATING_MODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External Measures feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalMeasuresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HazardousEvent_externalMeasures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HazardousEvent_externalMeasures_feature", "_UI_HazardousEvent_type"),
				 DependabilityPackage.Literals.HAZARDOUS_EVENT__EXTERNAL_MEASURES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operational Situation Use Case feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationalSituationUseCasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HazardousEvent_operationalSituationUseCase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HazardousEvent_operationalSituationUseCase_feature", "_UI_HazardousEvent_type"),
				 DependabilityPackage.Literals.HAZARDOUS_EVENT__OPERATIONAL_SITUATION_USE_CASE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Environment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvironmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HazardousEvent_environment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HazardousEvent_environment_feature", "_UI_HazardousEvent_type"),
				 DependabilityPackage.Literals.HAZARDOUS_EVENT__ENVIRONMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hazard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHazardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HazardousEvent_hazard_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HazardousEvent_hazard_feature", "_UI_HazardousEvent_type"),
				 DependabilityPackage.Literals.HAZARDOUS_EVENT__HAZARD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Traffic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrafficPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HazardousEvent_traffic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HazardousEvent_traffic_feature", "_UI_HazardousEvent_type"),
				 DependabilityPackage.Literals.HAZARDOUS_EVENT__TRAFFIC,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns HazardousEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HazardousEvent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HazardousEvent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HazardousEvent_type") :
			getString("_UI_HazardousEvent_type") + " " + label;
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

		switch (notification.getFeatureID(HazardousEvent.class)) {
			case DependabilityPackage.HAZARDOUS_EVENT__CONTROLLABILITY:
			case DependabilityPackage.HAZARDOUS_EVENT__EXPOSURE:
			case DependabilityPackage.HAZARDOUS_EVENT__SEVERITY:
			case DependabilityPackage.HAZARDOUS_EVENT__HAZARD_CLASSIFICATION:
			case DependabilityPackage.HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS:
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
