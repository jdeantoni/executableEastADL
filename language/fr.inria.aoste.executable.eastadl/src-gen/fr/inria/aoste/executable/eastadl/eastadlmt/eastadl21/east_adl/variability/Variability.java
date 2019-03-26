/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Context;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.Variability#getProductFeatureModel <em>Product Feature Model</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.Variability#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.Variability#getDecisionModel <em>Decision Model</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.Variability#getVariableElement <em>Variable Element</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.Variability#getConfigurableContainer <em>Configurable Container</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getVariability()
 * @model
 * @generated
 */
public interface Variability extends Context {
	/**
	 * Returns the value of the '<em><b>Product Feature Model</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Model</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getVariability_ProductFeatureModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureModel> getProductFeatureModel();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.FeatureConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getVariability_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureConfiguration> getConfiguration();

	/**
	 * Returns the value of the '<em><b>Decision Model</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VehicleLevelBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Model</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getVariability_DecisionModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<VehicleLevelBinding> getDecisionModel();

	/**
	 * Returns the value of the '<em><b>Variable Element</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Element</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getVariability_VariableElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableElement> getVariableElement();

	/**
	 * Returns the value of the '<em><b>Configurable Container</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurable Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurable Container</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getVariability_ConfigurableContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurableContainer> getConfigurableContainer();

} // Variability
