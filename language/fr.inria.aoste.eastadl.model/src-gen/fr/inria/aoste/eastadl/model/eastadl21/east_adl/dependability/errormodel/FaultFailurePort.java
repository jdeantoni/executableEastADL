/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTarget;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Failure Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePort#getFunctionTarget <em>Function Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePort#getHwTarget <em>Hw Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getFaultFailurePort()
 * @model abstract="true"
 * @generated
 */
public interface FaultFailurePort extends Anomaly {
	/**
	 * Returns the value of the '<em><b>Function Target</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Target</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getFaultFailurePort_FunctionTarget()
	 * @model containment="true"
	 * @generated
	 */
	EList<FaultFailurePort_functionTarget> getFunctionTarget();

	/**
	 * Returns the value of the '<em><b>Hw Target</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hw Target</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getFaultFailurePort_HwTarget()
	 * @model containment="true"
	 * @generated
	 */
	EList<FaultFailurePort_hwTarget> getHwTarget();

} // FaultFailurePort
