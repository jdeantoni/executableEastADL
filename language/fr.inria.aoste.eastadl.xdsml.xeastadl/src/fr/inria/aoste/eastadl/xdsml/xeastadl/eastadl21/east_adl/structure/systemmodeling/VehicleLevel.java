/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.Context;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.FeatureModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.VehicleLevel#getTechnicalFeatureModel <em>Technical Feature Model</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getVehicleLevel()
 * @model
 * @generated
 */
public interface VehicleLevel extends Context {
	/**
	 * Returns the value of the '<em><b>Technical Feature Model</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.FeatureModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technical Feature Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technical Feature Model</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getVehicleLevel_TechnicalFeatureModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureModel> getTechnicalFeatureModel();

} // VehicleLevel
