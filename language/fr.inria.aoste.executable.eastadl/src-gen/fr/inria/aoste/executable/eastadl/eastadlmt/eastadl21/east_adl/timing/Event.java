/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.Event#getIsStateChange <em>Is State Change</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends TimingDescription {
	/**
	 * Returns the value of the '<em><b>Is State Change</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is State Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is State Change</em>' attribute.
	 * @see #isSetIsStateChange()
	 * @see #unsetIsStateChange()
	 * @see #setIsStateChange(Boolean)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage#getEvent_IsStateChange()
	 * @model default="false" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsStateChange();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.Event#getIsStateChange <em>Is State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is State Change</em>' attribute.
	 * @see #isSetIsStateChange()
	 * @see #unsetIsStateChange()
	 * @see #getIsStateChange()
	 * @generated
	 */
	void setIsStateChange(Boolean value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.Event#getIsStateChange <em>Is State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsStateChange()
	 * @see #getIsStateChange()
	 * @see #setIsStateChange(Boolean)
	 * @generated
	 */
	void unsetIsStateChange();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.Event#getIsStateChange <em>Is State Change</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is State Change</em>' attribute is set.
	 * @see #unsetIsStateChange()
	 * @see #getIsStateChange()
	 * @see #setIsStateChange(Boolean)
	 * @generated
	 */
	boolean isSetIsStateChange();

} // Event
