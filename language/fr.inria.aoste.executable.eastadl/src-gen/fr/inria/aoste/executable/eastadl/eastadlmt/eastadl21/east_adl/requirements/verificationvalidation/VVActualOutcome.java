/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VV Actual Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome#getIntendedOutcome <em>Intended Outcome</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVActualOutcome()
 * @model
 * @generated
 */
public interface VVActualOutcome extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Intended Outcome</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intended Outcome</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intended Outcome</em>' reference.
	 * @see #setIntendedOutcome(VVIntendedOutcome)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVActualOutcome_IntendedOutcome()
	 * @model
	 * @generated
	 */
	VVIntendedOutcome getIntendedOutcome();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome#getIntendedOutcome <em>Intended Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intended Outcome</em>' reference.
	 * @see #getIntendedOutcome()
	 * @generated
	 */
	void setIntendedOutcome(VVIntendedOutcome value);

} // VVActualOutcome
