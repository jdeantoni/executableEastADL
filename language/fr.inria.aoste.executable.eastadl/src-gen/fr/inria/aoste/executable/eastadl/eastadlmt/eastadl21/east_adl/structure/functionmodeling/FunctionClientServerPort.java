/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Client Server Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort#getClientServerType <em>Client Server Type</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionClientServerPort()
 * @model
 * @generated
 */
public interface FunctionClientServerPort extends FunctionPort {
	/**
	 * Returns the value of the '<em><b>Client Server Type</b></em>' attribute.
	 * The default value is <code>"CLIENT"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.ClientServerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Server Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Server Type</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.ClientServerKind
	 * @see #isSetClientServerType()
	 * @see #unsetClientServerType()
	 * @see #setClientServerType(ClientServerKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionClientServerPort_ClientServerType()
	 * @model default="CLIENT" unsettable="true" required="true"
	 * @generated
	 */
	ClientServerKind getClientServerType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort#getClientServerType <em>Client Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Server Type</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.ClientServerKind
	 * @see #isSetClientServerType()
	 * @see #unsetClientServerType()
	 * @see #getClientServerType()
	 * @generated
	 */
	void setClientServerType(ClientServerKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort#getClientServerType <em>Client Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientServerType()
	 * @see #getClientServerType()
	 * @see #setClientServerType(ClientServerKind)
	 * @generated
	 */
	void unsetClientServerType();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort#getClientServerType <em>Client Server Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client Server Type</em>' attribute is set.
	 * @see #unsetClientServerType()
	 * @see #getClientServerType()
	 * @see #setClientServerType(ClientServerKind)
	 * @generated
	 */
	boolean isSetClientServerType();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(FunctionClientServerInterface)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionClientServerPort_Type()
	 * @model required="true"
	 * @generated
	 */
	FunctionClientServerInterface getType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(FunctionClientServerInterface value);

} // FunctionClientServerPort
