/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.Context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Constraint Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraintSet#getGenericConstraint <em>Generic Constraint</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage#getGenericConstraintSet()
 * @model
 * @generated
 */
public interface GenericConstraintSet extends Context {
	/**
	 * Returns the value of the '<em><b>Generic Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Constraint</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage#getGenericConstraintSet_GenericConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericConstraint> getGenericConstraint();

} // GenericConstraintSet
