/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Level Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.MultiLevelReference#getReference <em>Reference</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.MultiLevelReference#getReferring <em>Referring</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsPackage#getMultiLevelReference()
 * @model
 * @generated
 */
public interface MultiLevelReference extends Relationship {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(EAElement)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsPackage#getMultiLevelReference_Reference()
	 * @model required="true"
	 * @generated
	 */
	EAElement getReference();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.MultiLevelReference#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(EAElement value);

	/**
	 * Returns the value of the '<em><b>Referring</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referring</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referring</em>' reference.
	 * @see #setReferring(EAElement)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsPackage#getMultiLevelReference_Referring()
	 * @model required="true"
	 * @generated
	 */
	EAElement getReferring();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.MultiLevelReference#getReferring <em>Referring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referring</em>' reference.
	 * @see #getReferring()
	 * @generated
	 */
	void setReferring(EAElement value);

} // MultiLevelReference
