/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DependabilityPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.FeatureFlaw;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.Hazard;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.Item;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.impl.HazardImpl#getMalfunction <em>Malfunction</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.impl.HazardImpl#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HazardImpl extends TraceableSpecificationImpl implements Hazard {
	/**
	 * The cached value of the '{@link #getMalfunction() <em>Malfunction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMalfunction()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureFlaw> malfunction;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependabilityPackage.Literals.HAZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureFlaw> getMalfunction() {
		if (malfunction == null) {
			malfunction = new EObjectResolvingEList<FeatureFlaw>(FeatureFlaw.class, this, DependabilityPackage.HAZARD__MALFUNCTION);
		}
		return malfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItem() {
		if (item == null) {
			item = new EObjectResolvingEList<Item>(Item.class, this, DependabilityPackage.HAZARD__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependabilityPackage.HAZARD__MALFUNCTION:
				return getMalfunction();
			case DependabilityPackage.HAZARD__ITEM:
				return getItem();
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
			case DependabilityPackage.HAZARD__MALFUNCTION:
				getMalfunction().clear();
				getMalfunction().addAll((Collection<? extends FeatureFlaw>)newValue);
				return;
			case DependabilityPackage.HAZARD__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends Item>)newValue);
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
			case DependabilityPackage.HAZARD__MALFUNCTION:
				getMalfunction().clear();
				return;
			case DependabilityPackage.HAZARD__ITEM:
				getItem().clear();
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
			case DependabilityPackage.HAZARD__MALFUNCTION:
				return malfunction != null && !malfunction.isEmpty();
			case DependabilityPackage.HAZARD__ITEM:
				return item != null && !item.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HazardImpl
