/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.Allocation#getFunctionAllocation <em>Function Allocation</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getAllocation()
 * @model
 * @generated
 */
public interface Allocation extends EAElement {
	/**
	 * Returns the value of the '<em><b>Function Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Allocation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Allocation</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getAllocation_FunctionAllocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionAllocation> getFunctionAllocation();

} // Allocation
