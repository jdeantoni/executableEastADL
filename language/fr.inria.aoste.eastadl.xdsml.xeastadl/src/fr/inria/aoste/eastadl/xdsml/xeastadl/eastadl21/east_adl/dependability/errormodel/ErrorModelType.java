/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionType;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getGenericDescription <em>Generic Description</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getErrorBehaviorDescription <em>Error Behavior Description</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getHwTarget <em>Hw Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getFaultFailureConnector <em>Fault Failure Connector</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getExternalFault <em>External Fault</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getPart <em>Part</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getFailure <em>Failure</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getInternalFault <em>Internal Fault</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getProcessFault <em>Process Fault</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorModelType()
 * @model
 * @generated
 */
public interface ErrorModelType extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Generic Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Description</em>' attribute.
	 * @see #isSetGenericDescription()
	 * @see #unsetGenericDescription()
	 * @see #setGenericDescription(String)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorModelType_GenericDescription()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getGenericDescription();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getGenericDescription <em>Generic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Description</em>' attribute.
	 * @see #isSetGenericDescription()
	 * @see #unsetGenericDescription()
	 * @see #getGenericDescription()
	 * @generated
	 */
	void setGenericDescription(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getGenericDescription <em>Generic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenericDescription()
	 * @see #getGenericDescription()
	 * @see #setGenericDescription(String)
	 * @generated
	 */
	void unsetGenericDescription();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getGenericDescription <em>Generic Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Generic Description</em>' attribute is set.
	 * @see #unsetGenericDescription()
	 * @see #getGenericDescription()
	 * @see #setGenericDescription(String)
	 * @generated
	 */
	boolean isSetGenericDescription();

	/**
	 * Returns the value of the '<em><b>Error Behavior Description</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorBehavior}.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Behavior Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Behavior Description</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorModelType_ErrorBehaviorDescription()
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getOwner
	 * @model opposite="owner" containment="true" required="true"
	 * @generated
	 */
	EList<ErrorBehavior> getErrorBehaviorDescription();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorModelType_Target()
	 * @model
	 * @generated
	 */
	EList<FunctionType> getTarget();

	/**
	 * Returns the value of the '<em><b>Hw Target</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hw Target</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorModelType_HwTarget()
	 * @model
	 * @generated
	 */
	EList<HardwareComponentType> getHwTarget();

	/**
	 * Returns the value of the '<em><b>Fault Failure Connector</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Failure Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Failure Connector</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorModelType_FaultFailureConnector()
	 * @model containment="true"
	 * @generated
	 */
	EList<FaultFailurePropagationLink> getFaultFailureConnector();

	/**
	 * Returns the value of the '<em><b>External Fault</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.FaultInPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Fault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Fault</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorModelType_ExternalFault()
	 * @model containment="true"
	 * @generated
	 */
	EList<FaultInPort> getExternalFault();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorModelType_Part()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorModelPrototype> getPart();

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.FailureOutPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorModelType_Failure()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailureOutPort> getFailure();

	/**
	 * Returns the value of the '<em><b>Internal Fault</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Fault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Fault</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorModelType_InternalFault()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalFaultPrototype> getInternalFault();

	/**
	 * Returns the value of the '<em><b>Process Fault</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Fault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Fault</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getErrorModelType_ProcessFault()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessFaultPrototype> getProcessFault();

} // ErrorModelType
