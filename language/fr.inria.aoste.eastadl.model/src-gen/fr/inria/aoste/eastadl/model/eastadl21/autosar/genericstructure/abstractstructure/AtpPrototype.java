/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atp Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AtpPrototype#getAtpType <em>Atp Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage#getAtpPrototype()
 * @model abstract="true"
 * @generated
 */
public interface AtpPrototype extends AtpFeature {
	/**
	 * Returns the value of the '<em><b>Atp Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atp Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atp Type</em>' reference.
	 * @see #setAtpType(AtpType)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage#getAtpPrototype_AtpType()
	 * @model required="true"
	 * @generated
	 */
	AtpType getAtpType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AtpPrototype#getAtpType <em>Atp Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atp Type</em>' reference.
	 * @see #getAtpType()
	 * @generated
	 */
	void setAtpType(AtpType value);

} // AtpPrototype
