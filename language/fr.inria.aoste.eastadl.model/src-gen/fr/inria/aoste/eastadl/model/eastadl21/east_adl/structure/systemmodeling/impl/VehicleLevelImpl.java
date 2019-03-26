/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.VehicleLevel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.impl.VehicleLevelImpl#getTechnicalFeatureModel <em>Technical Feature Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleLevelImpl extends ContextImpl implements VehicleLevel {
	/**
	 * The cached value of the '{@link #getTechnicalFeatureModel() <em>Technical Feature Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalFeatureModel()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureModel> technicalFeatureModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemmodelingPackage.Literals.VEHICLE_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureModel> getTechnicalFeatureModel() {
		if (technicalFeatureModel == null) {
			technicalFeatureModel = new EObjectContainmentEList<FeatureModel>(FeatureModel.class, this, SystemmodelingPackage.VEHICLE_LEVEL__TECHNICAL_FEATURE_MODEL);
		}
		return technicalFeatureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemmodelingPackage.VEHICLE_LEVEL__TECHNICAL_FEATURE_MODEL:
				return ((InternalEList<?>)getTechnicalFeatureModel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemmodelingPackage.VEHICLE_LEVEL__TECHNICAL_FEATURE_MODEL:
				return getTechnicalFeatureModel();
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
			case SystemmodelingPackage.VEHICLE_LEVEL__TECHNICAL_FEATURE_MODEL:
				getTechnicalFeatureModel().clear();
				getTechnicalFeatureModel().addAll((Collection<? extends FeatureModel>)newValue);
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
			case SystemmodelingPackage.VEHICLE_LEVEL__TECHNICAL_FEATURE_MODEL:
				getTechnicalFeatureModel().clear();
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
			case SystemmodelingPackage.VEHICLE_LEVEL__TECHNICAL_FEATURE_MODEL:
				return technicalFeatureModel != null && !technicalFeatureModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VehicleLevelImpl
