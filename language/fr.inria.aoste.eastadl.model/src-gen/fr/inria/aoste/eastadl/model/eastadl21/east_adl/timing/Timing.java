/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Timing#getTimingDescription <em>Timing Description</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Timing#getTimingConstraint <em>Timing Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage#getTiming()
 * @model
 * @generated
 */
public interface Timing extends Context {
	/**
	 * Returns the value of the '<em><b>Timing Description</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Description</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage#getTiming_TimingDescription()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimingDescription> getTimingDescription();

	/**
	 * Returns the value of the '<em><b>Timing Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Constraint</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage#getTiming_TimingConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimingConstraint> getTimingConstraint();

} // Timing
