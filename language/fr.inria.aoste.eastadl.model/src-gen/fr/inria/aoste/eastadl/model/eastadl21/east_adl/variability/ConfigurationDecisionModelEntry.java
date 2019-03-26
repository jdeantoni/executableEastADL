/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Decision Model Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ConfigurationDecisionModelEntry#getIsActive <em>Is Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage#getConfigurationDecisionModelEntry()
 * @model abstract="true"
 * @generated
 */
public interface ConfigurationDecisionModelEntry extends EAElement {
	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #isSetIsActive()
	 * @see #unsetIsActive()
	 * @see #setIsActive(Boolean)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage#getConfigurationDecisionModelEntry_IsActive()
	 * @model default="false" unsettable="true" dataType="fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsActive();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ConfigurationDecisionModelEntry#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isSetIsActive()
	 * @see #unsetIsActive()
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(Boolean value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ConfigurationDecisionModelEntry#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsActive()
	 * @see #getIsActive()
	 * @see #setIsActive(Boolean)
	 * @generated
	 */
	void unsetIsActive();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ConfigurationDecisionModelEntry#getIsActive <em>Is Active</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Active</em>' attribute is set.
	 * @see #unsetIsActive()
	 * @see #getIsActive()
	 * @see #setIsActive(Boolean)
	 * @generated
	 */
	boolean isSetIsActive();

} // ConfigurationDecisionModelEntry
