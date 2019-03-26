/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.ContainerConfiguration#getConfiguredContainer <em>Configured Container</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.VariabilityPackage#getContainerConfiguration()
 * @model
 * @generated
 */
public interface ContainerConfiguration extends ConfigurationDecisionModel {
	/**
	 * Returns the value of the '<em><b>Configured Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configured Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configured Container</em>' reference.
	 * @see #setConfiguredContainer(ConfigurableContainer)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.VariabilityPackage#getContainerConfiguration_ConfiguredContainer()
	 * @model required="true"
	 * @generated
	 */
	ConfigurableContainer getConfiguredContainer();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.ContainerConfiguration#getConfiguredContainer <em>Configured Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configured Container</em>' reference.
	 * @see #getConfiguredContainer()
	 * @generated
	 */
	void setConfiguredContainer(ConfigurableContainer value);

} // ContainerConfiguration
