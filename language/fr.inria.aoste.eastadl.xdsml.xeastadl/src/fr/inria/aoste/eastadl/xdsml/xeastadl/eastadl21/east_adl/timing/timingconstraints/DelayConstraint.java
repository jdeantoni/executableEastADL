/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.EventChain;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimingConstraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.DelayConstraint#getJitter <em>Jitter</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.DelayConstraint#getNominal <em>Nominal</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.DelayConstraint#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getDelayConstraint()
 * @model abstract="true"
 * @generated
 */
public interface DelayConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' containment reference.
	 * @see #setJitter(TimeDuration)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getDelayConstraint_Jitter()
	 * @model containment="true"
	 * @generated
	 */
	TimeDuration getJitter();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.DelayConstraint#getJitter <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' containment reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(TimeDuration value);

	/**
	 * Returns the value of the '<em><b>Nominal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal</em>' containment reference.
	 * @see #setNominal(TimeDuration)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getDelayConstraint_Nominal()
	 * @model containment="true"
	 * @generated
	 */
	TimeDuration getNominal();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.DelayConstraint#getNominal <em>Nominal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal</em>' containment reference.
	 * @see #getNominal()
	 * @generated
	 */
	void setNominal(TimeDuration value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(EventChain)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#getDelayConstraint_Scope()
	 * @model
	 * @generated
	 */
	EventChain getScope();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.timingconstraints.DelayConstraint#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(EventChain value);

} // DelayConstraint
