/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation#getVvTarget <em>Vv Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation#getVvCase <em>Vv Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation#getVerify <em>Verify</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVerificationValidation()
 * @model
 * @generated
 */
public interface VerificationValidation extends Context {
	/**
	 * Returns the value of the '<em><b>Vv Target</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vv Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vv Target</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVerificationValidation_VvTarget()
	 * @model containment="true"
	 * @generated
	 */
	EList<VVTarget> getVvTarget();

	/**
	 * Returns the value of the '<em><b>Vv Case</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vv Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vv Case</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVerificationValidation_VvCase()
	 * @model containment="true"
	 * @generated
	 */
	EList<VVCase> getVvCase();

	/**
	 * Returns the value of the '<em><b>Verify</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.Verify}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVerificationValidation_Verify()
	 * @model containment="true"
	 * @generated
	 */
	EList<Verify> getVerify();

} // VerificationValidation
