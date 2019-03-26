/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.SystemModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architectural Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.ArchitecturalModel#getIsConceptFor <em>Is Concept For</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsPackage#getArchitecturalModel()
 * @model
 * @generated
 */
public interface ArchitecturalModel extends Concept {
	/**
	 * Returns the value of the '<em><b>Is Concept For</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.SystemModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Concept For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Concept For</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsPackage#getArchitecturalModel_IsConceptFor()
	 * @model
	 * @generated
	 */
	EList<SystemModel> getIsConceptFor();

} // ArchitecturalModel
