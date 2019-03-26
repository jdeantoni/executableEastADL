/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.FeatureModel;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.VariabilityPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.VehicleLevelBinding;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Level Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.VehicleLevelBindingImpl#getTargetFeatureModel <em>Target Feature Model</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.VehicleLevelBindingImpl#getSourceVehicleFeatureModel <em>Source Vehicle Feature Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleLevelBindingImpl extends ConfigurationDecisionModelImpl implements VehicleLevelBinding {
	/**
	 * The cached value of the '{@link #getTargetFeatureModel() <em>Target Feature Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeatureModel()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureModel> targetFeatureModel;

	/**
	 * The cached value of the '{@link #getSourceVehicleFeatureModel() <em>Source Vehicle Feature Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVehicleFeatureModel()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureModel> sourceVehicleFeatureModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleLevelBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.VEHICLE_LEVEL_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureModel> getTargetFeatureModel() {
		if (targetFeatureModel == null) {
			targetFeatureModel = new EObjectResolvingEList<FeatureModel>(FeatureModel.class, this, VariabilityPackage.VEHICLE_LEVEL_BINDING__TARGET_FEATURE_MODEL);
		}
		return targetFeatureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureModel> getSourceVehicleFeatureModel() {
		if (sourceVehicleFeatureModel == null) {
			sourceVehicleFeatureModel = new EObjectResolvingEList<FeatureModel>(FeatureModel.class, this, VariabilityPackage.VEHICLE_LEVEL_BINDING__SOURCE_VEHICLE_FEATURE_MODEL);
		}
		return sourceVehicleFeatureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariabilityPackage.VEHICLE_LEVEL_BINDING__TARGET_FEATURE_MODEL:
				return getTargetFeatureModel();
			case VariabilityPackage.VEHICLE_LEVEL_BINDING__SOURCE_VEHICLE_FEATURE_MODEL:
				return getSourceVehicleFeatureModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VariabilityPackage.VEHICLE_LEVEL_BINDING__TARGET_FEATURE_MODEL:
				getTargetFeatureModel().clear();
				getTargetFeatureModel().addAll((Collection<? extends FeatureModel>)newValue);
				return;
			case VariabilityPackage.VEHICLE_LEVEL_BINDING__SOURCE_VEHICLE_FEATURE_MODEL:
				getSourceVehicleFeatureModel().clear();
				getSourceVehicleFeatureModel().addAll((Collection<? extends FeatureModel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VariabilityPackage.VEHICLE_LEVEL_BINDING__TARGET_FEATURE_MODEL:
				getTargetFeatureModel().clear();
				return;
			case VariabilityPackage.VEHICLE_LEVEL_BINDING__SOURCE_VEHICLE_FEATURE_MODEL:
				getSourceVehicleFeatureModel().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VariabilityPackage.VEHICLE_LEVEL_BINDING__TARGET_FEATURE_MODEL:
				return targetFeatureModel != null && !targetFeatureModel.isEmpty();
			case VariabilityPackage.VEHICLE_LEVEL_BINDING__SOURCE_VEHICLE_FEATURE_MODEL:
				return sourceVehicleFeatureModel != null && !sourceVehicleFeatureModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VehicleLevelBindingImpl
