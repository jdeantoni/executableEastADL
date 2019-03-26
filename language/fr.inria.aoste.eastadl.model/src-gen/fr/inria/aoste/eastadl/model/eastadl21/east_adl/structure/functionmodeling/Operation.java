/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.Operation#getArgument <em>Argument</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.Operation#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EAElement {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getOperation_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<EADatatypePrototype> getArgument();

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(EADatatypePrototype)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getOperation_Return()
	 * @model containment="true"
	 * @generated
	 */
	EADatatypePrototype getReturn();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.Operation#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(EADatatypePrototype value);

} // Operation
