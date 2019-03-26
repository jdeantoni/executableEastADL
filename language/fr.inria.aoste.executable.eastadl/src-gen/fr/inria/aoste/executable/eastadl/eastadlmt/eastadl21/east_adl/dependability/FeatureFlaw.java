/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Flaw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.FeatureFlaw#getItem <em>Item</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.FeatureFlaw#getNonFulfilledRequirement <em>Non Fulfilled Requirement</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage#getFeatureFlaw()
 * @model
 * @generated
 */
public interface FeatureFlaw extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage#getFeatureFlaw_Item()
	 * @model required="true"
	 * @generated
	 */
	EList<Item> getItem();

	/**
	 * Returns the value of the '<em><b>Non Fulfilled Requirement</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Fulfilled Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Fulfilled Requirement</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage#getFeatureFlaw_NonFulfilledRequirement()
	 * @model
	 * @generated
	 */
	EList<Requirement> getNonFulfilledRequirement();

} // FeatureFlaw
