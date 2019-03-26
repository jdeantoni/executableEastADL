/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Level Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VehicleLevelBinding#getTargetFeatureModel <em>Target Feature Model</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VehicleLevelBinding#getSourceVehicleFeatureModel <em>Source Vehicle Feature Model</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getVehicleLevelBinding()
 * @model
 * @generated
 */
public interface VehicleLevelBinding extends ConfigurationDecisionModel {
	/**
	 * Returns the value of the '<em><b>Target Feature Model</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Feature Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Feature Model</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getVehicleLevelBinding_TargetFeatureModel()
	 * @model
	 * @generated
	 */
	EList<FeatureModel> getTargetFeatureModel();

	/**
	 * Returns the value of the '<em><b>Source Vehicle Feature Model</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Vehicle Feature Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Vehicle Feature Model</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getVehicleLevelBinding_SourceVehicleFeatureModel()
	 * @model
	 * @generated
	 */
	EList<FeatureModel> getSourceVehicleFeatureModel();

} // VehicleLevelBinding
