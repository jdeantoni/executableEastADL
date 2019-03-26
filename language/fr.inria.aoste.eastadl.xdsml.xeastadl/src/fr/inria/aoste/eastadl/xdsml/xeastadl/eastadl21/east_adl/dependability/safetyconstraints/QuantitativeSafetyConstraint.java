/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantitative Safety Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getFailureRate <em>Failure Rate</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getRepairRate <em>Repair Rate</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getConstrainedFaultFailure <em>Constrained Fault Failure</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage#getQuantitativeSafetyConstraint()
 * @model
 * @generated
 */
public interface QuantitativeSafetyConstraint extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Failure Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Rate</em>' attribute.
	 * @see #isSetFailureRate()
	 * @see #unsetFailureRate()
	 * @see #setFailureRate(Double)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage#getQuantitativeSafetyConstraint_FailureRate()
	 * @model default="0.0" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Float" required="true"
	 * @generated
	 */
	Double getFailureRate();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getFailureRate <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Rate</em>' attribute.
	 * @see #isSetFailureRate()
	 * @see #unsetFailureRate()
	 * @see #getFailureRate()
	 * @generated
	 */
	void setFailureRate(Double value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getFailureRate <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFailureRate()
	 * @see #getFailureRate()
	 * @see #setFailureRate(Double)
	 * @generated
	 */
	void unsetFailureRate();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getFailureRate <em>Failure Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Failure Rate</em>' attribute is set.
	 * @see #unsetFailureRate()
	 * @see #getFailureRate()
	 * @see #setFailureRate(Double)
	 * @generated
	 */
	boolean isSetFailureRate();

	/**
	 * Returns the value of the '<em><b>Repair Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repair Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repair Rate</em>' attribute.
	 * @see #isSetRepairRate()
	 * @see #unsetRepairRate()
	 * @see #setRepairRate(Double)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage#getQuantitativeSafetyConstraint_RepairRate()
	 * @model default="0.0" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Float" required="true"
	 * @generated
	 */
	Double getRepairRate();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getRepairRate <em>Repair Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repair Rate</em>' attribute.
	 * @see #isSetRepairRate()
	 * @see #unsetRepairRate()
	 * @see #getRepairRate()
	 * @generated
	 */
	void setRepairRate(Double value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getRepairRate <em>Repair Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepairRate()
	 * @see #getRepairRate()
	 * @see #setRepairRate(Double)
	 * @generated
	 */
	void unsetRepairRate();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getRepairRate <em>Repair Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repair Rate</em>' attribute is set.
	 * @see #unsetRepairRate()
	 * @see #getRepairRate()
	 * @see #setRepairRate(Double)
	 * @generated
	 */
	boolean isSetRepairRate();

	/**
	 * Returns the value of the '<em><b>Constrained Fault Failure</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Fault Failure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Fault Failure</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage#getQuantitativeSafetyConstraint_ConstrainedFaultFailure()
	 * @model required="true"
	 * @generated
	 */
	EList<FaultFailure> getConstrainedFaultFailure();

} // QuantitativeSafetyConstraint
