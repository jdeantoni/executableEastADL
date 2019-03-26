/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DependabilityPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.FeatureFlaw;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.Item;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Requirement;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Flaw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.impl.FeatureFlawImpl#getItem <em>Item</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.impl.FeatureFlawImpl#getNonFulfilledRequirement <em>Non Fulfilled Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureFlawImpl extends TraceableSpecificationImpl implements FeatureFlaw {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> item;

	/**
	 * The cached value of the '{@link #getNonFulfilledRequirement() <em>Non Fulfilled Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonFulfilledRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> nonFulfilledRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureFlawImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependabilityPackage.Literals.FEATURE_FLAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItem() {
		if (item == null) {
			item = new EObjectResolvingEList<Item>(Item.class, this, DependabilityPackage.FEATURE_FLAW__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getNonFulfilledRequirement() {
		if (nonFulfilledRequirement == null) {
			nonFulfilledRequirement = new EObjectResolvingEList<Requirement>(Requirement.class, this, DependabilityPackage.FEATURE_FLAW__NON_FULFILLED_REQUIREMENT);
		}
		return nonFulfilledRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependabilityPackage.FEATURE_FLAW__ITEM:
				return getItem();
			case DependabilityPackage.FEATURE_FLAW__NON_FULFILLED_REQUIREMENT:
				return getNonFulfilledRequirement();
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
			case DependabilityPackage.FEATURE_FLAW__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends Item>)newValue);
				return;
			case DependabilityPackage.FEATURE_FLAW__NON_FULFILLED_REQUIREMENT:
				getNonFulfilledRequirement().clear();
				getNonFulfilledRequirement().addAll((Collection<? extends Requirement>)newValue);
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
			case DependabilityPackage.FEATURE_FLAW__ITEM:
				getItem().clear();
				return;
			case DependabilityPackage.FEATURE_FLAW__NON_FULFILLED_REQUIREMENT:
				getNonFulfilledRequirement().clear();
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
			case DependabilityPackage.FEATURE_FLAW__ITEM:
				return item != null && !item.isEmpty();
			case DependabilityPackage.FEATURE_FLAW__NON_FULFILLED_REQUIREMENT:
				return nonFulfilledRequirement != null && !nonFulfilledRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureFlawImpl
