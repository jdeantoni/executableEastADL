/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionConnector_port;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionConnector#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionConnector()
 * @model
 * @generated
 */
public interface FunctionConnector extends EAElement, AllocateableElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionConnector_port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionConnector_Port()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<FunctionConnector_port> getPort();

} // FunctionConnector
