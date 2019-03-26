/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getType <em>Type</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getFailureLogic <em>Failure Logic</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getInternalFault <em>Internal Fault</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getExternalFault <em>External Fault</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getExternalFailure <em>External Failure</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getProcessFault <em>Process Fault</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorBehavior()
 * @model
 * @generated
 */
public interface ErrorBehavior extends EAElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"HIP_HOPS"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorKind
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(ErrorBehaviorKind)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorBehavior_Type()
	 * @model default="HIP_HOPS" unsettable="true" required="true"
	 * @generated
	 */
	ErrorBehaviorKind getType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorKind
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(ErrorBehaviorKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ErrorBehaviorKind)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ErrorBehaviorKind)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Failure Logic</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Logic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Logic</em>' attribute.
	 * @see #isSetFailureLogic()
	 * @see #unsetFailureLogic()
	 * @see #setFailureLogic(String)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorBehavior_FailureLogic()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String"
	 * @generated
	 */
	String getFailureLogic();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getFailureLogic <em>Failure Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Logic</em>' attribute.
	 * @see #isSetFailureLogic()
	 * @see #unsetFailureLogic()
	 * @see #getFailureLogic()
	 * @generated
	 */
	void setFailureLogic(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getFailureLogic <em>Failure Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFailureLogic()
	 * @see #getFailureLogic()
	 * @see #setFailureLogic(String)
	 * @generated
	 */
	void unsetFailureLogic();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getFailureLogic <em>Failure Logic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Failure Logic</em>' attribute is set.
	 * @see #unsetFailureLogic()
	 * @see #getFailureLogic()
	 * @see #setFailureLogic(String)
	 * @generated
	 */
	boolean isSetFailureLogic();

	/**
	 * Returns the value of the '<em><b>Internal Fault</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Fault</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Fault</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorBehavior_InternalFault()
	 * @model
	 * @generated
	 */
	EList<InternalFaultPrototype> getInternalFault();

	/**
	 * Returns the value of the '<em><b>External Fault</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultInPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Fault</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Fault</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorBehavior_ExternalFault()
	 * @model
	 * @generated
	 */
	EList<FaultInPort> getExternalFault();

	/**
	 * Returns the value of the '<em><b>External Failure</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FailureOutPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Failure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Failure</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorBehavior_ExternalFailure()
	 * @model required="true"
	 * @generated
	 */
	EList<FailureOutPort> getExternalFailure();

	/**
	 * Returns the value of the '<em><b>Process Fault</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Fault</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Fault</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorBehavior_ProcessFault()
	 * @model
	 * @generated
	 */
	EList<ProcessFaultPrototype> getProcessFault();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getErrorBehaviorDescription <em>Error Behavior Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(ErrorModelType)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorBehavior_Owner()
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getErrorBehaviorDescription
	 * @model opposite="errorBehaviorDescription" required="true" transient="false"
	 * @generated
	 */
	ErrorModelType getOwner();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ErrorModelType value);

} // ErrorBehavior
