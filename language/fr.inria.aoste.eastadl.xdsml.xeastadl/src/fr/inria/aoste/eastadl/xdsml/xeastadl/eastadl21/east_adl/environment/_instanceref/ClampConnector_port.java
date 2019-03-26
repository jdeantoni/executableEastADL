/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.environment._instanceref;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clamp Connector port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.environment._instanceref.ClampConnector_port#getFunctionPrototype <em>Function Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.environment._instanceref.ClampConnector_port#getFunctionPort <em>Function Port</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.environment._instanceref._instancerefPackage#getClampConnector_port()
 * @model
 * @generated
 */
public interface ClampConnector_port extends EObject {
	/**
	 * Returns the value of the '<em><b>Function Prototype</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Prototype</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.environment._instanceref._instancerefPackage#getClampConnector_port_FunctionPrototype()
	 * @model
	 * @generated
	 */
	EList<FunctionPrototype> getFunctionPrototype();

	/**
	 * Returns the value of the '<em><b>Function Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Port</em>' reference.
	 * @see #setFunctionPort(FunctionPort)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.environment._instanceref._instancerefPackage#getClampConnector_port_FunctionPort()
	 * @model required="true"
	 * @generated
	 */
	FunctionPort getFunctionPort();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.environment._instanceref.ClampConnector_port#getFunctionPort <em>Function Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Port</em>' reference.
	 * @see #getFunctionPort()
	 * @generated
	 */
	void setFunctionPort(FunctionPort value);

} // ClampConnector_port
