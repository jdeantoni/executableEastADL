/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel._instanceref;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Failure Port hw Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget#getHardwarePort <em>Hardware Port</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage#getFaultFailurePort_hwTarget()
 * @model
 * @generated
 */
public interface FaultFailurePort_hwTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Port</em>' reference.
	 * @see #setHardwarePort(HardwarePin)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage#getFaultFailurePort_hwTarget_HardwarePort()
	 * @model required="true"
	 * @generated
	 */
	HardwarePin getHardwarePort();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget#getHardwarePort <em>Hardware Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Port</em>' reference.
	 * @see #getHardwarePort()
	 * @generated
	 */
	void setHardwarePort(HardwarePin value);

	/**
	 * Returns the value of the '<em><b>Hardware Component Prototype</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Component Prototype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Component Prototype</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage#getFaultFailurePort_hwTarget_HardwareComponentPrototype()
	 * @model
	 * @generated
	 */
	EList<HardwareComponentPrototype> getHardwareComponentPrototype();

} // FaultFailurePort_hwTarget
