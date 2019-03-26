/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EADatatype;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage#getUserAttributeDefinition()
 * @model
 * @generated
 */
public interface UserAttributeDefinition extends EAElement {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #setDefaultValue(String)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage#getUserAttributeDefinition_DefaultValue()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(String)
	 * @generated
	 */
	void unsetDefaultValue();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition#getDefaultValue <em>Default Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Value</em>' attribute is set.
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(String)
	 * @generated
	 */
	boolean isSetDefaultValue();

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
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage#getUserAttributeDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	EADatatype getType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EADatatype value);

} // UserAttributeDefinition
