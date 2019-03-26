/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAElement;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurable Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainer#getConfigurableElement <em>Configurable Element</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainer#getPublicFeatureModel <em>Public Feature Model</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainer#getVariationGroup <em>Variation Group</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainer#getInternalBinding <em>Internal Binding</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getConfigurableContainer()
 * @model
 * @generated
 */
public interface ConfigurableContainer extends EAElement {
	/**
	 * Returns the value of the '<em><b>Configurable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurable Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurable Element</em>' reference.
	 * @see #setConfigurableElement(Identifiable)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getConfigurableContainer_ConfigurableElement()
	 * @model required="true"
	 * @generated
	 */
	Identifiable getConfigurableElement();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainer#getConfigurableElement <em>Configurable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurable Element</em>' reference.
	 * @see #getConfigurableElement()
	 * @generated
	 */
	void setConfigurableElement(Identifiable value);

	/**
	 * Returns the value of the '<em><b>Public Feature Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Feature Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Feature Model</em>' containment reference.
	 * @see #setPublicFeatureModel(FeatureModel)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getConfigurableContainer_PublicFeatureModel()
	 * @model containment="true"
	 * @generated
	 */
	FeatureModel getPublicFeatureModel();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainer#getPublicFeatureModel <em>Public Feature Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Feature Model</em>' containment reference.
	 * @see #getPublicFeatureModel()
	 * @generated
	 */
	void setPublicFeatureModel(FeatureModel value);

	/**
	 * Returns the value of the '<em><b>Variation Group</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variation Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variation Group</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getConfigurableContainer_VariationGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariationGroup> getVariationGroup();

	/**
	 * Returns the value of the '<em><b>Internal Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Binding</em>' containment reference.
	 * @see #setInternalBinding(InternalBinding)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getConfigurableContainer_InternalBinding()
	 * @model containment="true"
	 * @generated
	 */
	InternalBinding getInternalBinding();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainer#getInternalBinding <em>Internal Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Binding</em>' containment reference.
	 * @see #getInternalBinding()
	 * @generated
	 */
	void setInternalBinding(InternalBinding value);

} // ConfigurableContainer
