/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model Prototype hw Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTarget#getHardwareComponentPrototype_context <em>Hardware Component Prototype context</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTarget#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage#getErrorModelPrototype_hwTarget()
 * @model
 * @generated
 */
public interface ErrorModelPrototype_hwTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware Component Prototype context</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Component Prototype context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Component Prototype context</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage#getErrorModelPrototype_hwTarget_HardwareComponentPrototype_context()
	 * @model
	 * @generated
	 */
	EList<HardwareComponentPrototype> getHardwareComponentPrototype_context();

	/**
	 * Returns the value of the '<em><b>Hardware Component Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Component Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Component Prototype</em>' reference.
	 * @see #setHardwareComponentPrototype(HardwareComponentPrototype)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage#getErrorModelPrototype_hwTarget_HardwareComponentPrototype()
	 * @model required="true"
	 * @generated
	 */
	HardwareComponentPrototype getHardwareComponentPrototype();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTarget#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Component Prototype</em>' reference.
	 * @see #getHardwareComponentPrototype()
	 * @generated
	 */
	void setHardwareComponentPrototype(HardwareComponentPrototype value);

} // ErrorModelPrototype_hwTarget
