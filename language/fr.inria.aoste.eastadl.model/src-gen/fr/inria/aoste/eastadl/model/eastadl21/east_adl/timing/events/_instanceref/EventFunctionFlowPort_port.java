/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Function Flow Port port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port#getFunctionPrototype <em>Function Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port#getFunctionFlowPort <em>Function Flow Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref._instancerefPackage#getEventFunctionFlowPort_port()
 * @model
 * @generated
 */
public interface EventFunctionFlowPort_port extends EObject {
	/**
	 * Returns the value of the '<em><b>Function Prototype</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Prototype</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref._instancerefPackage#getEventFunctionFlowPort_port_FunctionPrototype()
	 * @model
	 * @generated
	 */
	EList<FunctionPrototype> getFunctionPrototype();

	/**
	 * Returns the value of the '<em><b>Function Flow Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Flow Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Flow Port</em>' reference.
	 * @see #setFunctionFlowPort(FunctionFlowPort)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref._instancerefPackage#getEventFunctionFlowPort_port_FunctionFlowPort()
	 * @model required="true"
	 * @generated
	 */
	FunctionFlowPort getFunctionFlowPort();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port#getFunctionFlowPort <em>Function Flow Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Flow Port</em>' reference.
	 * @see #getFunctionFlowPort()
	 * @generated
	 */
	void setFunctionFlowPort(FunctionFlowPort value);

} // EventFunctionFlowPort_port
