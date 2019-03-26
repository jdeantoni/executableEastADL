/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.EAElement;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElement;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_target;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionAllocation#getAllocatedElement <em>Allocated Element</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionAllocation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionAllocation()
 * @model
 * @generated
 */
public interface FunctionAllocation extends EAElement {
	/**
	 * Returns the value of the '<em><b>Allocated Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Element</em>' containment reference.
	 * @see #setAllocatedElement(FunctionAllocation_allocatedElement)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionAllocation_AllocatedElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionAllocation_allocatedElement getAllocatedElement();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionAllocation#getAllocatedElement <em>Allocated Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated Element</em>' containment reference.
	 * @see #getAllocatedElement()
	 * @generated
	 */
	void setAllocatedElement(FunctionAllocation_allocatedElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(FunctionAllocation_target)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionAllocation_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionAllocation_target getTarget();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionAllocation#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(FunctionAllocation_target value);

} // FunctionAllocation
