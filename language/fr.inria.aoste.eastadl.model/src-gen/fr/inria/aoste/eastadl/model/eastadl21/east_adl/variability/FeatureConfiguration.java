/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.FeatureConfiguration#getConfiguredFeatureModel <em>Configured Feature Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage#getFeatureConfiguration()
 * @model
 * @generated
 */
public interface FeatureConfiguration extends ConfigurationDecisionModel {
	/**
	 * Returns the value of the '<em><b>Configured Feature Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configured Feature Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configured Feature Model</em>' reference.
	 * @see #setConfiguredFeatureModel(FeatureModel)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage#getFeatureConfiguration_ConfiguredFeatureModel()
	 * @model required="true"
	 * @generated
	 */
	FeatureModel getConfiguredFeatureModel();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.FeatureConfiguration#getConfiguredFeatureModel <em>Configured Feature Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configured Feature Model</em>' reference.
	 * @see #getConfiguredFeatureModel()
	 * @generated
	 */
	void setConfiguredFeatureModel(FeatureModel value);

} // FeatureConfiguration
