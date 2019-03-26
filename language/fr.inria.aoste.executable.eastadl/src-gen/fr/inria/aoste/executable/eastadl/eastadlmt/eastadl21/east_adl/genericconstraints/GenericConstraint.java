/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.Mode;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraint#getGenericConstraintType <em>Generic Constraint Type</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraint#getGenericConstraintValue <em>Generic Constraint Value</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraint#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraint#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage#getGenericConstraint()
 * @model
 * @generated
 */
public interface GenericConstraint extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Generic Constraint Type</b></em>' attribute.
	 * The default value is <code>"SPACEREDUNDANCY"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraintKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Constraint Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Constraint Type</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraintKind
	 * @see #isSetGenericConstraintType()
	 * @see #unsetGenericConstraintType()
	 * @see #setGenericConstraintType(GenericConstraintKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage#getGenericConstraint_GenericConstraintType()
	 * @model default="SPACEREDUNDANCY" unsettable="true" required="true"
	 * @generated
	 */
	GenericConstraintKind getGenericConstraintType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraint#getGenericConstraintType <em>Generic Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Constraint Type</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraintKind
	 * @see #isSetGenericConstraintType()
	 * @see #unsetGenericConstraintType()
	 * @see #getGenericConstraintType()
	 * @generated
	 */
	void setGenericConstraintType(GenericConstraintKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraint#getGenericConstraintType <em>Generic Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenericConstraintType()
	 * @see #getGenericConstraintType()
	 * @see #setGenericConstraintType(GenericConstraintKind)
	 * @generated
	 */
	void unsetGenericConstraintType();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraint#getGenericConstraintType <em>Generic Constraint Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Generic Constraint Type</em>' attribute is set.
	 * @see #unsetGenericConstraintType()
	 * @see #getGenericConstraintType()
	 * @see #setGenericConstraintType(GenericConstraintKind)
	 * @generated
	 */
	boolean isSetGenericConstraintType();

	/**
	 * Returns the value of the '<em><b>Generic Constraint Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Constraint Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Constraint Value</em>' attribute.
	 * @see #isSetGenericConstraintValue()
	 * @see #unsetGenericConstraintValue()
	 * @see #setGenericConstraintValue(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage#getGenericConstraint_GenericConstraintValue()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getGenericConstraintValue();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraint#getGenericConstraintValue <em>Generic Constraint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Constraint Value</em>' attribute.
	 * @see #isSetGenericConstraintValue()
	 * @see #unsetGenericConstraintValue()
	 * @see #getGenericConstraintValue()
	 * @generated
	 */
	void setGenericConstraintValue(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraint#getGenericConstraintValue <em>Generic Constraint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenericConstraintValue()
	 * @see #getGenericConstraintValue()
	 * @see #setGenericConstraintValue(String)
	 * @generated
	 */
	void unsetGenericConstraintValue();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraint#getGenericConstraintValue <em>Generic Constraint Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Generic Constraint Value</em>' attribute is set.
	 * @see #unsetGenericConstraintValue()
	 * @see #getGenericConstraintValue()
	 * @see #setGenericConstraintValue(String)
	 * @generated
	 */
	boolean isSetGenericConstraintValue();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage#getGenericConstraint_Target()
	 * @model
	 * @generated
	 */
	EList<Identifiable> getTarget();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage#getGenericConstraint_Mode()
	 * @model
	 * @generated
	 */
	EList<Mode> getMode();

} // GenericConstraint
