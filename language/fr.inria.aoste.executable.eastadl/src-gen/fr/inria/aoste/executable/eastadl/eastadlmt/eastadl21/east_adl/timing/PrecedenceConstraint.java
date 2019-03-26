/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.PrecedenceConstraint#getPreceding <em>Preceding</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.PrecedenceConstraint#getSuccessive <em>Successive</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage#getPrecedenceConstraint()
 * @model
 * @generated
 */
public interface PrecedenceConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Preceding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preceding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preceding</em>' containment reference.
	 * @see #setPreceding(PrecedenceConstraint_preceding)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage#getPrecedenceConstraint_Preceding()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrecedenceConstraint_preceding getPreceding();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.PrecedenceConstraint#getPreceding <em>Preceding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preceding</em>' containment reference.
	 * @see #getPreceding()
	 * @generated
	 */
	void setPreceding(PrecedenceConstraint_preceding value);

	/**
	 * Returns the value of the '<em><b>Successive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successive</em>' containment reference.
	 * @see #setSuccessive(PrecedenceConstraint_successive)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage#getPrecedenceConstraint_Successive()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrecedenceConstraint_successive getSuccessive();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.PrecedenceConstraint#getSuccessive <em>Successive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successive</em>' containment reference.
	 * @see #getSuccessive()
	 * @generated
	 */
	void setSuccessive(PrecedenceConstraint_successive value);

} // PrecedenceConstraint
