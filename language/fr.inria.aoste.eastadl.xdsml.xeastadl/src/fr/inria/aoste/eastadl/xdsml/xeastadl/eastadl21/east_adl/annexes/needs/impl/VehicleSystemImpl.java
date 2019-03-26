/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Architecture;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Mission;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.NeedsPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Stakeholder;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.VehicleSystem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl.VehicleSystemImpl#getHas <em>Has</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl.VehicleSystemImpl#getHasAn <em>Has An</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl.VehicleSystemImpl#getFulfills <em>Fulfills</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleSystemImpl extends ConceptImpl implements VehicleSystem {
	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected EList<Stakeholder> has;

	/**
	 * The cached value of the '{@link #getHasAn() <em>Has An</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAn()
	 * @generated
	 * @ordered
	 */
	protected Architecture hasAn;

	/**
	 * The cached value of the '{@link #getFulfills() <em>Fulfills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfills()
	 * @generated
	 * @ordered
	 */
	protected EList<Mission> fulfills;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeedsPackage.Literals.VEHICLE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stakeholder> getHas() {
		if (has == null) {
			has = new EObjectResolvingEList<Stakeholder>(Stakeholder.class, this, NeedsPackage.VEHICLE_SYSTEM__HAS);
		}
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture getHasAn() {
		if (hasAn != null && hasAn.eIsProxy()) {
			InternalEObject oldHasAn = (InternalEObject)hasAn;
			hasAn = (Architecture)eResolveProxy(oldHasAn);
			if (hasAn != oldHasAn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NeedsPackage.VEHICLE_SYSTEM__HAS_AN, oldHasAn, hasAn));
			}
		}
		return hasAn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture basicGetHasAn() {
		return hasAn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAn(Architecture newHasAn) {
		Architecture oldHasAn = hasAn;
		hasAn = newHasAn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.VEHICLE_SYSTEM__HAS_AN, oldHasAn, hasAn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mission> getFulfills() {
		if (fulfills == null) {
			fulfills = new EObjectResolvingEList<Mission>(Mission.class, this, NeedsPackage.VEHICLE_SYSTEM__FULFILLS);
		}
		return fulfills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeedsPackage.VEHICLE_SYSTEM__HAS:
				return getHas();
			case NeedsPackage.VEHICLE_SYSTEM__HAS_AN:
				if (resolve) return getHasAn();
				return basicGetHasAn();
			case NeedsPackage.VEHICLE_SYSTEM__FULFILLS:
				return getFulfills();
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
			case NeedsPackage.VEHICLE_SYSTEM__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends Stakeholder>)newValue);
				return;
			case NeedsPackage.VEHICLE_SYSTEM__HAS_AN:
				setHasAn((Architecture)newValue);
				return;
			case NeedsPackage.VEHICLE_SYSTEM__FULFILLS:
				getFulfills().clear();
				getFulfills().addAll((Collection<? extends Mission>)newValue);
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
			case NeedsPackage.VEHICLE_SYSTEM__HAS:
				getHas().clear();
				return;
			case NeedsPackage.VEHICLE_SYSTEM__HAS_AN:
				setHasAn((Architecture)null);
				return;
			case NeedsPackage.VEHICLE_SYSTEM__FULFILLS:
				getFulfills().clear();
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
			case NeedsPackage.VEHICLE_SYSTEM__HAS:
				return has != null && !has.isEmpty();
			case NeedsPackage.VEHICLE_SYSTEM__HAS_AN:
				return hasAn != null;
			case NeedsPackage.VEHICLE_SYSTEM__FULFILLS:
				return fulfills != null && !fulfills.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VehicleSystemImpl
