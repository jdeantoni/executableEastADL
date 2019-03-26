/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getLiteralSemantics <em>Literal Semantics</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getIsMultiValued <em>Is Multi Valued</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getBaseEnumeration <em>Base Enumeration</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage#getEnumerationValueType()
 * @model
 * @generated
 */
public interface EnumerationValueType extends ValueType {
	/**
	 * Returns the value of the '<em><b>Literal Semantics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Semantics</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Semantics</em>' attribute list.
	 * @see #isSetLiteralSemantics()
	 * @see #unsetLiteralSemantics()
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage#getEnumerationValueType_LiteralSemantics()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" lower="2"
	 * @generated
	 */
	EList<String> getLiteralSemantics();

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getLiteralSemantics <em>Literal Semantics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiteralSemantics()
	 * @see #getLiteralSemantics()
	 * @generated
	 */
	void unsetLiteralSemantics();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getLiteralSemantics <em>Literal Semantics</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Literal Semantics</em>' attribute list is set.
	 * @see #unsetLiteralSemantics()
	 * @see #getLiteralSemantics()
	 * @generated
	 */
	boolean isSetLiteralSemantics();

	/**
	 * Returns the value of the '<em><b>Is Multi Valued</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multi Valued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multi Valued</em>' attribute.
	 * @see #isSetIsMultiValued()
	 * @see #unsetIsMultiValued()
	 * @see #setIsMultiValued(Boolean)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage#getEnumerationValueType_IsMultiValued()
	 * @model default="false" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsMultiValued();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getIsMultiValued <em>Is Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multi Valued</em>' attribute.
	 * @see #isSetIsMultiValued()
	 * @see #unsetIsMultiValued()
	 * @see #getIsMultiValued()
	 * @generated
	 */
	void setIsMultiValued(Boolean value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getIsMultiValued <em>Is Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsMultiValued()
	 * @see #getIsMultiValued()
	 * @see #setIsMultiValued(Boolean)
	 * @generated
	 */
	void unsetIsMultiValued();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getIsMultiValued <em>Is Multi Valued</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Multi Valued</em>' attribute is set.
	 * @see #unsetIsMultiValued()
	 * @see #getIsMultiValued()
	 * @see #setIsMultiValued(Boolean)
	 * @generated
	 */
	boolean isSetIsMultiValued();

	/**
	 * Returns the value of the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Enumeration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Enumeration</em>' reference.
	 * @see #setBaseEnumeration(Enumeration)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage#getEnumerationValueType_BaseEnumeration()
	 * @model required="true"
	 * @generated
	 */
	Enumeration getBaseEnumeration();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getBaseEnumeration <em>Base Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Enumeration</em>' reference.
	 * @see #getBaseEnumeration()
	 * @generated
	 */
	void setBaseEnumeration(Enumeration value);

} // EnumerationValueType
