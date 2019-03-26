/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.Anomaly;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Failure anomaly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly#getAnomaly <em>Anomaly</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly#getErrorModelPrototype <em>Error Model Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage#getFaultFailure_anomaly()
 * @model
 * @generated
 */
public interface FaultFailure_anomaly extends EObject {
	/**
	 * Returns the value of the '<em><b>Anomaly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anomaly</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anomaly</em>' reference.
	 * @see #setAnomaly(Anomaly)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage#getFaultFailure_anomaly_Anomaly()
	 * @model required="true"
	 * @generated
	 */
	Anomaly getAnomaly();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly#getAnomaly <em>Anomaly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anomaly</em>' reference.
	 * @see #getAnomaly()
	 * @generated
	 */
	void setAnomaly(Anomaly value);

	/**
	 * Returns the value of the '<em><b>Error Model Prototype</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model Prototype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Model Prototype</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage#getFaultFailure_anomaly_ErrorModelPrototype()
	 * @model
	 * @generated
	 */
	EList<ErrorModelPrototype> getErrorModelPrototype();

} // FaultFailure_anomaly
