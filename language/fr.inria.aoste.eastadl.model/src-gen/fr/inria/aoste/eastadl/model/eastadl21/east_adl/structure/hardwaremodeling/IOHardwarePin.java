/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Hardware Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePin#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage#getIOHardwarePin()
 * @model
 * @generated
 */
public interface IOHardwarePin extends HardwarePin {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"DIGITAL"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePinKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePinKind
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(IOHardwarePinKind)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage#getIOHardwarePin_Type()
	 * @model default="DIGITAL" unsettable="true" required="true"
	 * @generated
	 */
	IOHardwarePinKind getType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePin#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePinKind
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(IOHardwarePinKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePin#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(IOHardwarePinKind)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePin#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(IOHardwarePinKind)
	 * @generated
	 */
	boolean isSetType();

} // IOHardwarePin
