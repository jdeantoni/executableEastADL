/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Failure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure#getAnomaly <em>Anomaly</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure#getFaultFailureValue <em>Fault Failure Value</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage#getFaultFailure()
 * @model
 * @generated
 */
public interface FaultFailure extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Anomaly</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anomaly</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anomaly</em>' containment reference.
	 * @see #setAnomaly(FaultFailure_anomaly)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage#getFaultFailure_Anomaly()
	 * @model containment="true"
	 * @generated
	 */
	FaultFailure_anomaly getAnomaly();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure#getAnomaly <em>Anomaly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anomaly</em>' containment reference.
	 * @see #getAnomaly()
	 * @generated
	 */
	void setAnomaly(FaultFailure_anomaly value);

	/**
	 * Returns the value of the '<em><b>Fault Failure Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Failure Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Failure Value</em>' containment reference.
	 * @see #setFaultFailureValue(EADatatypePrototype)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage#getFaultFailure_FaultFailureValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EADatatypePrototype getFaultFailureValue();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure#getFaultFailureValue <em>Fault Failure Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Failure Value</em>' containment reference.
	 * @see #getFaultFailureValue()
	 * @generated
	 */
	void setFaultFailureValue(EADatatypePrototype value);

} // FaultFailure
