/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Failure Port Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxy#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getFaultFailurePortProxy()
 * @model abstract="true"
 * @generated
 */
public interface FaultFailurePortProxy extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(FaultFailurePort)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getFaultFailurePortProxy_Port()
	 * @model
	 * @generated
	 */
	FaultFailurePort getPort();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxy#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(FaultFailurePort value);

} // FaultFailurePortProxy
