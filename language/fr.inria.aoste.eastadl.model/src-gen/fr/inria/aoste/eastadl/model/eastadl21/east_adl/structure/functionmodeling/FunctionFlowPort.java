/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EADatatype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Flow Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionFlowPort()
 * @model
 * @generated
 */
public interface FunctionFlowPort extends FunctionPort {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"IN"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.EADirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.EADirectionKind
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(EADirectionKind)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionFlowPort_Direction()
	 * @model default="IN" unsettable="true" required="true"
	 * @generated
	 */
	EADirectionKind getDirection();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.EADirectionKind
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(EADirectionKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(EADirectionKind)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(EADirectionKind)
	 * @generated
	 */
	boolean isSetDirection();

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
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionFlowPort_Type()
	 * @model required="true"
	 * @generated
	 */
	EADatatype getType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EADatatype value);

} // FunctionFlowPort
