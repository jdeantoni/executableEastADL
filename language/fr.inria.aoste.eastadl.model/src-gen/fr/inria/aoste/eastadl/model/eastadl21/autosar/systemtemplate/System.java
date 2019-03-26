/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AtpStructureElement;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.autosartoplevelstructure.ARElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System#getEcuExtractVersion <em>Ecu Extract Version</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System#getSystemVersion <em>System Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.SystemtemplatePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends AtpStructureElement, ARElement {
	/**
	 * Returns the value of the '<em><b>Ecu Extract Version</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecu Extract Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecu Extract Version</em>' attribute.
	 * @see #isSetEcuExtractVersion()
	 * @see #unsetEcuExtractVersion()
	 * @see #setEcuExtractVersion(String)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.SystemtemplatePackage#getSystem_EcuExtractVersion()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.RevisionLabelString"
	 * @generated
	 */
	String getEcuExtractVersion();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System#getEcuExtractVersion <em>Ecu Extract Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecu Extract Version</em>' attribute.
	 * @see #isSetEcuExtractVersion()
	 * @see #unsetEcuExtractVersion()
	 * @see #getEcuExtractVersion()
	 * @generated
	 */
	void setEcuExtractVersion(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System#getEcuExtractVersion <em>Ecu Extract Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEcuExtractVersion()
	 * @see #getEcuExtractVersion()
	 * @see #setEcuExtractVersion(String)
	 * @generated
	 */
	void unsetEcuExtractVersion();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System#getEcuExtractVersion <em>Ecu Extract Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ecu Extract Version</em>' attribute is set.
	 * @see #unsetEcuExtractVersion()
	 * @see #getEcuExtractVersion()
	 * @see #setEcuExtractVersion(String)
	 * @generated
	 */
	boolean isSetEcuExtractVersion();

	/**
	 * Returns the value of the '<em><b>System Version</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Version</em>' attribute.
	 * @see #isSetSystemVersion()
	 * @see #unsetSystemVersion()
	 * @see #setSystemVersion(String)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.SystemtemplatePackage#getSystem_SystemVersion()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.RevisionLabelString" required="true"
	 * @generated
	 */
	String getSystemVersion();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System#getSystemVersion <em>System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Version</em>' attribute.
	 * @see #isSetSystemVersion()
	 * @see #unsetSystemVersion()
	 * @see #getSystemVersion()
	 * @generated
	 */
	void setSystemVersion(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System#getSystemVersion <em>System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSystemVersion()
	 * @see #getSystemVersion()
	 * @see #setSystemVersion(String)
	 * @generated
	 */
	void unsetSystemVersion();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System#getSystemVersion <em>System Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>System Version</em>' attribute is set.
	 * @see #unsetSystemVersion()
	 * @see #getSystemVersion()
	 * @see #setSystemVersion(String)
	 * @generated
	 */
	boolean isSetSystemVersion();

} // System
