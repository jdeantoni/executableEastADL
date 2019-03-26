/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EADatatype;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Parameter#getTargetFunctionPort <em>Target Function Port</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Parameter#getTargetFunction <em>Target Function</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EAElement {
	/**
	 * Returns the value of the '<em><b>Target Function Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Function Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Function Port</em>' reference.
	 * @see #setTargetFunctionPort(FunctionPort)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage#getParameter_TargetFunctionPort()
	 * @model
	 * @generated
	 */
	FunctionPort getTargetFunctionPort();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Parameter#getTargetFunctionPort <em>Target Function Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Function Port</em>' reference.
	 * @see #getTargetFunctionPort()
	 * @generated
	 */
	void setTargetFunctionPort(FunctionPort value);

	/**
	 * Returns the value of the '<em><b>Target Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Function</em>' reference.
	 * @see #setTargetFunction(FunctionType)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage#getParameter_TargetFunction()
	 * @model
	 * @generated
	 */
	FunctionType getTargetFunction();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Parameter#getTargetFunction <em>Target Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Function</em>' reference.
	 * @see #getTargetFunction()
	 * @generated
	 */
	void setTargetFunction(FunctionType value);

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
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	EADatatype getType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EADatatype value);

} // Parameter
