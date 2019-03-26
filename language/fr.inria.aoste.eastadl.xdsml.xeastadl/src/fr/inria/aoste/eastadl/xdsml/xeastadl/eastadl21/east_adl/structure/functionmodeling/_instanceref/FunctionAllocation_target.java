/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRef;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.AllocationTarget;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Allocation target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_target#getAllocationTarget_context <em>Allocation Target context</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_target#getAllocationTarget <em>Allocation Target</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage#getFunctionAllocation_target()
 * @model
 * @generated
 */
public interface FunctionAllocation_target extends AtpInstanceRef {
	/**
	 * Returns the value of the '<em><b>Allocation Target context</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.AllocationTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Target context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Target context</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage#getFunctionAllocation_target_AllocationTarget_context()
	 * @model
	 * @generated
	 */
	EList<AllocationTarget> getAllocationTarget_context();

	/**
	 * Returns the value of the '<em><b>Allocation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Target</em>' reference.
	 * @see #setAllocationTarget(AllocationTarget)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage#getFunctionAllocation_target_AllocationTarget()
	 * @model required="true"
	 * @generated
	 */
	AllocationTarget getAllocationTarget();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_target#getAllocationTarget <em>Allocation Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Target</em>' reference.
	 * @see #getAllocationTarget()
	 * @generated
	 */
	void setAllocationTarget(AllocationTarget value);

} // FunctionAllocation_target
