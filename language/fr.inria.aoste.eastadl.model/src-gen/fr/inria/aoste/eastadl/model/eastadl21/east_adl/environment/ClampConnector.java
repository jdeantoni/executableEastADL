/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.ClampConnector_port;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clamp Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment.ClampConnector#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment.EnvironmentPackage#getClampConnector()
 * @model
 * @generated
 */
public interface ClampConnector extends EAElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.ClampConnector_port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment.EnvironmentPackage#getClampConnector_Port()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<ClampConnector_port> getPort();

} // ClampConnector
