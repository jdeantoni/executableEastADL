/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Decision Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ConfigurationDecisionModel#getRootEntry <em>Root Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage#getConfigurationDecisionModel()
 * @model abstract="true"
 * @generated
 */
public interface ConfigurationDecisionModel extends EAElement {
	/**
	 * Returns the value of the '<em><b>Root Entry</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ConfigurationDecisionModelEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Entry</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage#getConfigurationDecisionModel_RootEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationDecisionModelEntry> getRootEntry();

} // ConfigurationDecisionModel
