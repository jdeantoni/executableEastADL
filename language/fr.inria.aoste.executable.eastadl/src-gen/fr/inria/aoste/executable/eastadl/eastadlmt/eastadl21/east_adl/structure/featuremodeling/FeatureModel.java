/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModel#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModel#getFeatureConstraint <em>Feature Constraint</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModel#getFeatureLink <em>Feature Link</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage#getFeatureModel()
 * @model
 * @generated
 */
public interface FeatureModel extends Context {
	/**
	 * Returns the value of the '<em><b>Root Feature</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Feature</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage#getFeatureModel_RootFeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getRootFeature();

	/**
	 * Returns the value of the '<em><b>Feature Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Constraint</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage#getFeatureModel_FeatureConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureConstraint> getFeatureConstraint();

	/**
	 * Returns the value of the '<em><b>Feature Link</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Link</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage#getFeatureModel_FeatureLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureLink> getFeatureLink();

} // FeatureModel
