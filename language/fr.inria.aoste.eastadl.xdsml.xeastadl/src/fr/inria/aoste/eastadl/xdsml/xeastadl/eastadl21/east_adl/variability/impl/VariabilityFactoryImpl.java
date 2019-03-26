/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariabilityFactoryImpl extends EFactoryImpl implements VariabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VariabilityFactory init() {
		try {
			VariabilityFactory theVariabilityFactory = (VariabilityFactory)EPackage.Registry.INSTANCE.getEFactory(VariabilityPackage.eNS_URI);
			if (theVariabilityFactory != null) {
				return theVariabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VariabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VariabilityPackage.CONFIGURABLE_CONTAINER: return createConfigurableContainer();
			case VariabilityPackage.CONFIGURATION_DECISION: return createConfigurationDecision();
			case VariabilityPackage.CONFIGURATION_DECISION_FOLDER: return createConfigurationDecisionFolder();
			case VariabilityPackage.CONTAINER_CONFIGURATION: return createContainerConfiguration();
			case VariabilityPackage.FEATURE_CONFIGURATION: return createFeatureConfiguration();
			case VariabilityPackage.INTERNAL_BINDING: return createInternalBinding();
			case VariabilityPackage.PRIVATE_CONTENT: return createPrivateContent();
			case VariabilityPackage.REUSE_META_INFORMATION: return createReuseMetaInformation();
			case VariabilityPackage.SELECTION_CRITERION: return createSelectionCriterion();
			case VariabilityPackage.VARIABILITY: return createVariability();
			case VariabilityPackage.VARIABLE_ELEMENT: return createVariableElement();
			case VariabilityPackage.VARIATION_GROUP: return createVariationGroup();
			case VariabilityPackage.VEHICLE_LEVEL_BINDING: return createVehicleLevelBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurableContainer createConfigurableContainer() {
		ConfigurableContainerImpl configurableContainer = new ConfigurableContainerImpl();
		return configurableContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationDecision createConfigurationDecision() {
		ConfigurationDecisionImpl configurationDecision = new ConfigurationDecisionImpl();
		return configurationDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationDecisionFolder createConfigurationDecisionFolder() {
		ConfigurationDecisionFolderImpl configurationDecisionFolder = new ConfigurationDecisionFolderImpl();
		return configurationDecisionFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerConfiguration createContainerConfiguration() {
		ContainerConfigurationImpl containerConfiguration = new ContainerConfigurationImpl();
		return containerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConfiguration createFeatureConfiguration() {
		FeatureConfigurationImpl featureConfiguration = new FeatureConfigurationImpl();
		return featureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalBinding createInternalBinding() {
		InternalBindingImpl internalBinding = new InternalBindingImpl();
		return internalBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateContent createPrivateContent() {
		PrivateContentImpl privateContent = new PrivateContentImpl();
		return privateContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReuseMetaInformation createReuseMetaInformation() {
		ReuseMetaInformationImpl reuseMetaInformation = new ReuseMetaInformationImpl();
		return reuseMetaInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionCriterion createSelectionCriterion() {
		SelectionCriterionImpl selectionCriterion = new SelectionCriterionImpl();
		return selectionCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variability createVariability() {
		VariabilityImpl variability = new VariabilityImpl();
		return variability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableElement createVariableElement() {
		VariableElementImpl variableElement = new VariableElementImpl();
		return variableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariationGroup createVariationGroup() {
		VariationGroupImpl variationGroup = new VariationGroupImpl();
		return variationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleLevelBinding createVehicleLevelBinding() {
		VehicleLevelBindingImpl vehicleLevelBinding = new VehicleLevelBindingImpl();
		return vehicleLevelBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityPackage getVariabilityPackage() {
		return (VariabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VariabilityPackage getPackage() {
		return VariabilityPackage.eINSTANCE;
	}

} //VariabilityFactoryImpl
