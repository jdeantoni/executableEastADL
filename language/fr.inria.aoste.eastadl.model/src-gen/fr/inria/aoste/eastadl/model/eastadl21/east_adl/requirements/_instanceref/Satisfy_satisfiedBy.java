/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satisfy satisfied By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy#getIdentifiable_target <em>Identifiable target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy#getIdentifiable_context <em>Identifiable context</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref._instancerefPackage#getSatisfy_satisfiedBy()
 * @model
 * @generated
 */
public interface Satisfy_satisfiedBy extends EObject {
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
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref._instancerefPackage#getSatisfy_satisfiedBy_Identifiable_target()
	 * @model required="true"
	 * @generated
	 */
	Identifiable getIdentifiable_target();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy#getIdentifiable_target <em>Identifiable target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiable target</em>' reference.
	 * @see #getIdentifiable_target()
	 * @generated
	 */
	void setIdentifiable_target(Identifiable value);

	/**
	 * Returns the value of the '<em><b>Identifiable context</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiable context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiable context</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref._instancerefPackage#getSatisfy_satisfiedBy_Identifiable_context()
	 * @model
	 * @generated
	 */
	EList<Identifiable> getIdentifiable_context();

} // Satisfy_satisfiedBy
