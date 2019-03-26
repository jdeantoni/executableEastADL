/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.abstractstructure.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.abstractstructure.AtpPrototype;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.abstractstructure.AtpType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atp Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.abstractstructure.impl.AtpPrototypeImpl#getAtpType <em>Atp Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AtpPrototypeImpl extends AtpFeatureImpl implements AtpPrototype {
	/**
	 * The cached value of the '{@link #getAtpType() <em>Atp Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtpType()
	 * @generated
	 * @ordered
	 */
	protected AtpType atpType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtpPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractstructurePackage.Literals.ATP_PROTOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtpType getAtpType() {
		if (atpType != null && atpType.eIsProxy()) {
			InternalEObject oldAtpType = (InternalEObject)atpType;
			atpType = (AtpType)eResolveProxy(oldAtpType);
			if (atpType != oldAtpType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractstructurePackage.ATP_PROTOTYPE__ATP_TYPE, oldAtpType, atpType));
			}
		}
		return atpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtpType basicGetAtpType() {
		return atpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtpType(AtpType newAtpType) {
		AtpType oldAtpType = atpType;
		atpType = newAtpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractstructurePackage.ATP_PROTOTYPE__ATP_TYPE, oldAtpType, atpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractstructurePackage.ATP_PROTOTYPE__ATP_TYPE:
				if (resolve) return getAtpType();
				return basicGetAtpType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbstractstructurePackage.ATP_PROTOTYPE__ATP_TYPE:
				setAtpType((AtpType)newValue);
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
			case AbstractstructurePackage.ATP_PROTOTYPE__ATP_TYPE:
				setAtpType((AtpType)null);
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
			case AbstractstructurePackage.ATP_PROTOTYPE__ATP_TYPE:
				return atpType != null;
		}
		return super.eIsSet(featureID);
	}

} //AtpPrototypeImpl
