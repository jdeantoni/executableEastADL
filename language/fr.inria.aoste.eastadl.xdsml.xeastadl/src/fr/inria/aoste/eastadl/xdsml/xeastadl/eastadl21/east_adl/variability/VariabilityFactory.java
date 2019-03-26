/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.VariabilityPackage
 * @generated
 */
public interface VariabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariabilityFactory eINSTANCE = fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.VariabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configurable Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configurable Container</em>'.
	 * @generated
	 */
	ConfigurableContainer createConfigurableContainer();

	/**
	 * Returns a new object of class '<em>Configuration Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Decision</em>'.
	 * @generated
	 */
	ConfigurationDecision createConfigurationDecision();

	/**
	 * Returns a new object of class '<em>Configuration Decision Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Decision Folder</em>'.
	 * @generated
	 */
	ConfigurationDecisionFolder createConfigurationDecisionFolder();

	/**
	 * Returns a new object of class '<em>Container Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Configuration</em>'.
	 * @generated
	 */
	ContainerConfiguration createContainerConfiguration();

	/**
	 * Returns a new object of class '<em>Feature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Configuration</em>'.
	 * @generated
	 */
	FeatureConfiguration createFeatureConfiguration();

	/**
	 * Returns a new object of class '<em>Internal Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Binding</em>'.
	 * @generated
	 */
	InternalBinding createInternalBinding();

	/**
	 * Returns a new object of class '<em>Private Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private Content</em>'.
	 * @generated
	 */
	PrivateContent createPrivateContent();

	/**
	 * Returns a new object of class '<em>Reuse Meta Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reuse Meta Information</em>'.
	 * @generated
	 */
	ReuseMetaInformation createReuseMetaInformation();

	/**
	 * Returns a new object of class '<em>Selection Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Criterion</em>'.
	 * @generated
	 */
	SelectionCriterion createSelectionCriterion();

	/**
	 * Returns a new object of class '<em>Variability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variability</em>'.
	 * @generated
	 */
	Variability createVariability();

	/**
	 * Returns a new object of class '<em>Variable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Element</em>'.
	 * @generated
	 */
	VariableElement createVariableElement();

	/**
	 * Returns a new object of class '<em>Variation Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variation Group</em>'.
	 * @generated
	 */
	VariationGroup createVariationGroup();

	/**
	 * Returns a new object of class '<em>Vehicle Level Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Level Binding</em>'.
	 * @generated
	 */
	VehicleLevelBinding createVehicleLevelBinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VariabilityPackage getVariabilityPackage();

} //VariabilityFactory
