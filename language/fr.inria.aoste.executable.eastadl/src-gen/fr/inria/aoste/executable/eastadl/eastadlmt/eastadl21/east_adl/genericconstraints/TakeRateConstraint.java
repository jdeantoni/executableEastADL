/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Take Rate Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.TakeRateConstraint#getTakeRate <em>Take Rate</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.TakeRateConstraint#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage#getTakeRateConstraint()
 * @model
 * @generated
 */
public interface TakeRateConstraint extends GenericConstraint {
	/**
	 * Returns the value of the '<em><b>Take Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Take Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Take Rate</em>' attribute.
	 * @see #isSetTakeRate()
	 * @see #unsetTakeRate()
	 * @see #setTakeRate(Double)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage#getTakeRateConstraint_TakeRate()
	 * @model default="0.0" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Float" required="true"
	 * @generated
	 */
	Double getTakeRate();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.TakeRateConstraint#getTakeRate <em>Take Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Take Rate</em>' attribute.
	 * @see #isSetTakeRate()
	 * @see #unsetTakeRate()
	 * @see #getTakeRate()
	 * @generated
	 */
	void setTakeRate(Double value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.TakeRateConstraint#getTakeRate <em>Take Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTakeRate()
	 * @see #getTakeRate()
	 * @see #setTakeRate(Double)
	 * @generated
	 */
	void unsetTakeRate();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.TakeRateConstraint#getTakeRate <em>Take Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Take Rate</em>' attribute is set.
	 * @see #unsetTakeRate()
	 * @see #getTakeRate()
	 * @see #setTakeRate(Double)
	 * @generated
	 */
	boolean isSetTakeRate();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage#getTakeRateConstraint_Source()
	 * @model
	 * @generated
	 */
	EList<Identifiable> getSource();

} // TakeRateConstraint
