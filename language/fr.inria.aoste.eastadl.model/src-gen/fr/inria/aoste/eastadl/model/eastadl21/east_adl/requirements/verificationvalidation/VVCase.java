/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VV Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getConcreteVVCase <em>Concrete VV Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getVvTarget <em>Vv Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getVvProcedure <em>Vv Procedure</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getVvLog <em>Vv Log</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getAbstractVVCase <em>Abstract VV Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getVvSubject <em>Vv Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVCase()
 * @model
 * @generated
 */
public interface VVCase extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Concrete VV Case</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete VV Case</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete VV Case</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVCase_ConcreteVVCase()
	 * @model
	 * @generated
	 */
	EList<VVCase> getConcreteVVCase();

	/**
	 * Returns the value of the '<em><b>Vv Target</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vv Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vv Target</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVCase_VvTarget()
	 * @model required="true"
	 * @generated
	 */
	EList<VVTarget> getVvTarget();

	/**
	 * Returns the value of the '<em><b>Vv Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vv Procedure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vv Procedure</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVCase_VvProcedure()
	 * @model containment="true"
	 * @generated
	 */
	EList<VVProcedure> getVvProcedure();

	/**
	 * Returns the value of the '<em><b>Vv Log</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVLog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vv Log</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vv Log</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVCase_VvLog()
	 * @model containment="true"
	 * @generated
	 */
	EList<VVLog> getVvLog();

	/**
	 * Returns the value of the '<em><b>Abstract VV Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract VV Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract VV Case</em>' reference.
	 * @see #setAbstractVVCase(VVCase)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVCase_AbstractVVCase()
	 * @model
	 * @generated
	 */
	VVCase getAbstractVVCase();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getAbstractVVCase <em>Abstract VV Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract VV Case</em>' reference.
	 * @see #getAbstractVVCase()
	 * @generated
	 */
	void setAbstractVVCase(VVCase value);

	/**
	 * Returns the value of the '<em><b>Vv Subject</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vv Subject</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vv Subject</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage#getVVCase_VvSubject()
	 * @model required="true"
	 * @generated
	 */
	EList<Identifiable> getVvSubject();

} // VVCase
