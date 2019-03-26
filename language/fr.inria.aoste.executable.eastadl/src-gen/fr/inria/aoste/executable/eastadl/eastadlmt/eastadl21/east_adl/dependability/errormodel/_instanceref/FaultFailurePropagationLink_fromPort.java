/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Failure Propagation Link from Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort#getFaultFailurePort <em>Fault Failure Port</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort#getErrorModelPrototype <em>Error Model Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort#getFaultFailurePortProxy <em>Fault Failure Port Proxy</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage#getFaultFailurePropagationLink_fromPort()
 * @model
 * @generated
 */
public interface FaultFailurePropagationLink_fromPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Fault Failure Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Failure Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Failure Port</em>' reference.
	 * @see #setFaultFailurePort(FaultFailurePort)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage#getFaultFailurePropagationLink_fromPort_FaultFailurePort()
	 * @model required="true"
	 * @generated
	 */
	FaultFailurePort getFaultFailurePort();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort#getFaultFailurePort <em>Fault Failure Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Failure Port</em>' reference.
	 * @see #getFaultFailurePort()
	 * @generated
	 */
	void setFaultFailurePort(FaultFailurePort value);

	/**
	 * Returns the value of the '<em><b>Error Model Prototype</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model Prototype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Model Prototype</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage#getFaultFailurePropagationLink_fromPort_ErrorModelPrototype()
	 * @model
	 * @generated
	 */
	EList<ErrorModelPrototype> getErrorModelPrototype();

	/**
	 * Returns the value of the '<em><b>Fault Failure Port Proxy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Failure Port Proxy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Failure Port Proxy</em>' reference.
	 * @see #setFaultFailurePortProxy(FaultFailurePortProxy)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage#getFaultFailurePropagationLink_fromPort_FaultFailurePortProxy()
	 * @model required="true"
	 * @generated
	 */
	FaultFailurePortProxy getFaultFailurePortProxy();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort#getFaultFailurePortProxy <em>Fault Failure Port Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Failure Port Proxy</em>' reference.
	 * @see #getFaultFailurePortProxy()
	 * @generated
	 */
	void setFaultFailurePortProxy(FaultFailurePortProxy value);

} // FaultFailurePropagationLink_fromPort
