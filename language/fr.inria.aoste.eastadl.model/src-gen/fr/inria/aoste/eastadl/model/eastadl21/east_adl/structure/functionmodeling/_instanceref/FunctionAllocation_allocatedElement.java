/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRef;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.AllocateableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Allocation allocated Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElement#getAllocateableElement_context <em>Allocateable Element context</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElement#getAllocateableElement <em>Allocateable Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage#getFunctionAllocation_allocatedElement()
 * @model
 * @generated
 */
public interface FunctionAllocation_allocatedElement extends AtpInstanceRef {
	/**
	 * Returns the value of the '<em><b>Allocateable Element context</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.AllocateableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocateable Element context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocateable Element context</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage#getFunctionAllocation_allocatedElement_AllocateableElement_context()
	 * @model
	 * @generated
	 */
	EList<AllocateableElement> getAllocateableElement_context();

	/**
	 * Returns the value of the '<em><b>Allocateable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocateable Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocateable Element</em>' reference.
	 * @see #setAllocateableElement(AllocateableElement)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage#getFunctionAllocation_allocatedElement_AllocateableElement()
	 * @model required="true"
	 * @generated
	 */
	AllocateableElement getAllocateableElement();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElement#getAllocateableElement <em>Allocateable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocateable Element</em>' reference.
	 * @see #getAllocateableElement()
	 * @generated
	 */
	void setAllocateableElement(AllocateableElement value);

} // FunctionAllocation_allocatedElement
