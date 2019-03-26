/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements._instanceref;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refine refined By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy#getIdentifiable_context <em>Identifiable context</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy#getIdentifiable_target <em>Identifiable target</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements._instanceref._instancerefPackage#getRefine_refinedBy()
 * @model
 * @generated
 */
public interface Refine_refinedBy extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifiable context</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiable context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiable context</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements._instanceref._instancerefPackage#getRefine_refinedBy_Identifiable_context()
	 * @model
	 * @generated
	 */
	EList<Identifiable> getIdentifiable_context();

	/**
	 * Returns the value of the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiable target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiable target</em>' reference.
	 * @see #setIdentifiable_target(Identifiable)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements._instanceref._instancerefPackage#getRefine_refinedBy_Identifiable_target()
	 * @model required="true"
	 * @generated
	 */
	Identifiable getIdentifiable_target();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy#getIdentifiable_target <em>Identifiable target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiable target</em>' reference.
	 * @see #getIdentifiable_target()
	 * @generated
	 */
	void setIdentifiable_target(Identifiable value);

} // Refine_refinedBy
