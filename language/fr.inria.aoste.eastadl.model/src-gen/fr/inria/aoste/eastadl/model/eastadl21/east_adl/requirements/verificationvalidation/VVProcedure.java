/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VV Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure#getConcreteVVProcedure <em>Concrete VV Procedure</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure#getVvStimuli <em>Vv Stimuli</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure#getVvIntendedOutcome <em>Vv Intended Outcome</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure#getAbstractVVProcedure <em>Abstract VV Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVProcedure()
 * @model
 * @generated
 */
public interface VVProcedure extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Concrete VV Procedure</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete VV Procedure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete VV Procedure</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVProcedure_ConcreteVVProcedure()
	 * @model
	 * @generated
	 */
	EList<VVProcedure> getConcreteVVProcedure();

	/**
	 * Returns the value of the '<em><b>Vv Stimuli</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVStimuli}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vv Stimuli</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vv Stimuli</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVProcedure_VvStimuli()
	 * @model containment="true"
	 * @generated
	 */
	EList<VVStimuli> getVvStimuli();

	/**
	 * Returns the value of the '<em><b>Vv Intended Outcome</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcome}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vv Intended Outcome</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vv Intended Outcome</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVProcedure_VvIntendedOutcome()
	 * @model containment="true"
	 * @generated
	 */
	EList<VVIntendedOutcome> getVvIntendedOutcome();

	/**
	 * Returns the value of the '<em><b>Abstract VV Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract VV Procedure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract VV Procedure</em>' reference.
	 * @see #setAbstractVVProcedure(VVProcedure)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVProcedure_AbstractVVProcedure()
	 * @model
	 * @generated
	 */
	VVProcedure getAbstractVVProcedure();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure#getAbstractVVProcedure <em>Abstract VV Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract VV Procedure</em>' reference.
	 * @see #getAbstractVVProcedure()
	 * @generated
	 */
	void setAbstractVVProcedure(VVProcedure value);

} // VVProcedure
