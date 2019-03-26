/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable;

import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable#getCategory <em>Category</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage#getIdentifiable()
 * @model abstract="true"
 * @generated
 */
public interface Identifiable extends Referrable, GIdentifiable {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #setCategory(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage#getIdentifiable_Category()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Identifier"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	void unsetCategory();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable#getCategory <em>Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Category</em>' attribute is set.
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	boolean isSetCategory();

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #isSetUuid()
	 * @see #unsetUuid()
	 * @see #setUuid(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage#getIdentifiable_Uuid()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #isSetUuid()
	 * @see #unsetUuid()
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUuid()
	 * @see #getUuid()
	 * @see #setUuid(String)
	 * @generated
	 */
	void unsetUuid();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable#getUuid <em>Uuid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Uuid</em>' attribute is set.
	 * @see #unsetUuid()
	 * @see #getUuid()
	 * @see #setUuid(String)
	 * @generated
	 */
	boolean isSetUuid();

} // Identifiable
