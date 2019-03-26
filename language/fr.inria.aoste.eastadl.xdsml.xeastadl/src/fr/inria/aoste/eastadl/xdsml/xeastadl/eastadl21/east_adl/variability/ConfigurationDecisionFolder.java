/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Decision Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.ConfigurationDecisionFolder#getChildEntry <em>Child Entry</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.VariabilityPackage#getConfigurationDecisionFolder()
 * @model
 * @generated
 */
public interface ConfigurationDecisionFolder extends ConfigurationDecisionModelEntry {
	/**
	 * Returns the value of the '<em><b>Child Entry</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.ConfigurationDecisionModelEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Entry</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.VariabilityPackage#getConfigurationDecisionFolder_ChildEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationDecisionModelEntry> getChildEntry();

} // ConfigurationDecisionFolder
