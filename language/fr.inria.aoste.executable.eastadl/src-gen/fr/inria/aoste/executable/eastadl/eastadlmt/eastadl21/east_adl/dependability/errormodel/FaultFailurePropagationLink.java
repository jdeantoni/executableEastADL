/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_toPort;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Failure Propagation Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getImmediatePropagation <em>Immediate Propagation</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getFromPort <em>From Port</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getToPort <em>To Port</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getFaultFailurePropagationLink()
 * @model
 * @generated
 */
public interface FaultFailurePropagationLink extends EAElement {
	/**
	 * Returns the value of the '<em><b>Immediate Propagation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immediate Propagation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immediate Propagation</em>' attribute.
	 * @see #isSetImmediatePropagation()
	 * @see #unsetImmediatePropagation()
	 * @see #setImmediatePropagation(Boolean)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getFaultFailurePropagationLink_ImmediatePropagation()
	 * @model default="false" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Boolean" required="true"
	 * @generated
	 */
	Boolean getImmediatePropagation();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getImmediatePropagation <em>Immediate Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immediate Propagation</em>' attribute.
	 * @see #isSetImmediatePropagation()
	 * @see #unsetImmediatePropagation()
	 * @see #getImmediatePropagation()
	 * @generated
	 */
	void setImmediatePropagation(Boolean value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getImmediatePropagation <em>Immediate Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImmediatePropagation()
	 * @see #getImmediatePropagation()
	 * @see #setImmediatePropagation(Boolean)
	 * @generated
	 */
	void unsetImmediatePropagation();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getImmediatePropagation <em>Immediate Propagation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Immediate Propagation</em>' attribute is set.
	 * @see #unsetImmediatePropagation()
	 * @see #getImmediatePropagation()
	 * @see #setImmediatePropagation(Boolean)
	 * @generated
	 */
	boolean isSetImmediatePropagation();

	/**
	 * Returns the value of the '<em><b>From Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Port</em>' containment reference.
	 * @see #setFromPort(FaultFailurePropagationLink_fromPort)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getFaultFailurePropagationLink_FromPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FaultFailurePropagationLink_fromPort getFromPort();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getFromPort <em>From Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Port</em>' containment reference.
	 * @see #getFromPort()
	 * @generated
	 */
	void setFromPort(FaultFailurePropagationLink_fromPort value);

	/**
	 * Returns the value of the '<em><b>To Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Port</em>' containment reference.
	 * @see #setToPort(FaultFailurePropagationLink_toPort)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage#getFaultFailurePropagationLink_ToPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FaultFailurePropagationLink_toPort getToPort();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getToPort <em>To Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Port</em>' containment reference.
	 * @see #getToPort()
	 * @generated
	 */
	void setToPort(FaultFailurePropagationLink_toPort value);

} // FaultFailurePropagationLink
