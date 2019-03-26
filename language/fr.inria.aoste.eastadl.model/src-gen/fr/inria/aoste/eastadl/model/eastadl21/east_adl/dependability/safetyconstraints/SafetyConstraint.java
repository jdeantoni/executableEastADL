/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint#getAsilValue <em>Asil Value</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint#getConstrainedFaultFailure <em>Constrained Fault Failure</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage#getSafetyConstraint()
 * @model
 * @generated
 */
public interface SafetyConstraint extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Asil Value</b></em>' attribute.
	 * The default value is <code>"ASIL_A"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.ASILKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asil Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asil Value</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.ASILKind
	 * @see #isSetAsilValue()
	 * @see #unsetAsilValue()
	 * @see #setAsilValue(ASILKind)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage#getSafetyConstraint_AsilValue()
	 * @model default="ASIL_A" unsettable="true" required="true"
	 * @generated
	 */
	ASILKind getAsilValue();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint#getAsilValue <em>Asil Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asil Value</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.ASILKind
	 * @see #isSetAsilValue()
	 * @see #unsetAsilValue()
	 * @see #getAsilValue()
	 * @generated
	 */
	void setAsilValue(ASILKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint#getAsilValue <em>Asil Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAsilValue()
	 * @see #getAsilValue()
	 * @see #setAsilValue(ASILKind)
	 * @generated
	 */
	void unsetAsilValue();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint#getAsilValue <em>Asil Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Asil Value</em>' attribute is set.
	 * @see #unsetAsilValue()
	 * @see #getAsilValue()
	 * @see #setAsilValue(ASILKind)
	 * @generated
	 */
	boolean isSetAsilValue();

	/**
	 * Returns the value of the '<em><b>Constrained Fault Failure</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Fault Failure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Fault Failure</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage#getSafetyConstraint_ConstrainedFaultFailure()
	 * @model required="true"
	 * @generated
	 */
	EList<FaultFailure> getConstrainedFaultFailure();

} // SafetyConstraint
