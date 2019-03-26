/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ConfigurationDecisionModelEntry;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Decision Model Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.ConfigurationDecisionModelEntryImpl#getIsActive <em>Is Active</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConfigurationDecisionModelEntryImpl extends EAElementImpl implements ConfigurationDecisionModelEntry {
	/**
	 * The default value of the '{@link #getIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ACTIVE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected Boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * This is true if the Is Active attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isActiveESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationDecisionModelEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.CONFIGURATION_DECISION_MODEL_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(Boolean newIsActive) {
		Boolean oldIsActive = isActive;
		isActive = newIsActive;
		boolean oldIsActiveESet = isActiveESet;
		isActiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURATION_DECISION_MODEL_ENTRY__IS_ACTIVE, oldIsActive, isActive, !oldIsActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsActive() {
		Boolean oldIsActive = isActive;
		boolean oldIsActiveESet = isActiveESet;
		isActive = IS_ACTIVE_EDEFAULT;
		isActiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VariabilityPackage.CONFIGURATION_DECISION_MODEL_ENTRY__IS_ACTIVE, oldIsActive, IS_ACTIVE_EDEFAULT, oldIsActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsActive() {
		return isActiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariabilityPackage.CONFIGURATION_DECISION_MODEL_ENTRY__IS_ACTIVE:
				return getIsActive();
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
			case VariabilityPackage.CONFIGURATION_DECISION_MODEL_ENTRY__IS_ACTIVE:
				setIsActive((Boolean)newValue);
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
			case VariabilityPackage.CONFIGURATION_DECISION_MODEL_ENTRY__IS_ACTIVE:
				unsetIsActive();
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
			case VariabilityPackage.CONFIGURATION_DECISION_MODEL_ENTRY__IS_ACTIVE:
				return isSetIsActive();
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
		result.append(" (isActive: ");
		if (isActiveESet) result.append(isActive); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConfigurationDecisionModelEntryImpl
