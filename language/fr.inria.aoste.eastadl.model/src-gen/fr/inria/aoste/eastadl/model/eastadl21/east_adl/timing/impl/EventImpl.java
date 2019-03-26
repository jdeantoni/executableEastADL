/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Event;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventImpl#getIsStateChange <em>Is State Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EventImpl extends TimingDescriptionImpl implements Event {
	/**
	 * The default value of the '{@link #getIsStateChange() <em>Is State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStateChange()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_STATE_CHANGE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsStateChange() <em>Is State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStateChange()
	 * @generated
	 * @ordered
	 */
	protected Boolean isStateChange = IS_STATE_CHANGE_EDEFAULT;

	/**
	 * This is true if the Is State Change attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isStateChangeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStateChange() {
		return isStateChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStateChange(Boolean newIsStateChange) {
		Boolean oldIsStateChange = isStateChange;
		isStateChange = newIsStateChange;
		boolean oldIsStateChangeESet = isStateChangeESet;
		isStateChangeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.EVENT__IS_STATE_CHANGE, oldIsStateChange, isStateChange, !oldIsStateChangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsStateChange() {
		Boolean oldIsStateChange = isStateChange;
		boolean oldIsStateChangeESet = isStateChangeESet;
		isStateChange = IS_STATE_CHANGE_EDEFAULT;
		isStateChangeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TimingPackage.EVENT__IS_STATE_CHANGE, oldIsStateChange, IS_STATE_CHANGE_EDEFAULT, oldIsStateChangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsStateChange() {
		return isStateChangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingPackage.EVENT__IS_STATE_CHANGE:
				return getIsStateChange();
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
			case TimingPackage.EVENT__IS_STATE_CHANGE:
				setIsStateChange((Boolean)newValue);
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
			case TimingPackage.EVENT__IS_STATE_CHANGE:
				unsetIsStateChange();
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
			case TimingPackage.EVENT__IS_STATE_CHANGE:
				return isSetIsStateChange();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isStateChange: ");
		if (isStateChangeESet) result.append(isStateChange); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EventImpl
