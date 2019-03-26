/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EADatatype;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anomaly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.Anomaly#getGenericDescription <em>Generic Description</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.Anomaly#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getAnomaly()
 * @model abstract="true"
 * @generated
 */
public interface Anomaly extends EAElement {
	/**
	 * Returns the value of the '<em><b>Generic Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Description</em>' attribute.
	 * @see #isSetGenericDescription()
	 * @see #unsetGenericDescription()
	 * @see #setGenericDescription(String)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getAnomaly_GenericDescription()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getGenericDescription();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.Anomaly#getGenericDescription <em>Generic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Description</em>' attribute.
	 * @see #isSetGenericDescription()
	 * @see #unsetGenericDescription()
	 * @see #getGenericDescription()
	 * @generated
	 */
	void setGenericDescription(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.Anomaly#getGenericDescription <em>Generic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenericDescription()
	 * @see #getGenericDescription()
	 * @see #setGenericDescription(String)
	 * @generated
	 */
	void unsetGenericDescription();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.Anomaly#getGenericDescription <em>Generic Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Generic Description</em>' attribute is set.
	 * @see #unsetGenericDescription()
	 * @see #getGenericDescription()
	 * @see #setGenericDescription(String)
	 * @generated
	 */
	boolean isSetGenericDescription();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EADatatype)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getAnomaly_Type()
	 * @model required="true"
	 * @generated
	 */
	EADatatype getType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.Anomaly#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EADatatype value);

} // Anomaly
