/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorPackage#getMode()
 * @model
 * @generated
 */
public interface Mode extends EAElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #isSetCondition()
	 * @see #unsetCondition()
	 * @see #setCondition(String)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorPackage#getMode_Condition()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #isSetCondition()
	 * @see #unsetCondition()
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCondition()
	 * @see #getCondition()
	 * @see #setCondition(String)
	 * @generated
	 */
	void unsetCondition();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode#getCondition <em>Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition</em>' attribute is set.
	 * @see #unsetCondition()
	 * @see #getCondition()
	 * @see #setCondition(String)
	 * @generated
	 */
	boolean isSetCondition();

} // Mode
