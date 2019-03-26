/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.impl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.impl.AtpStructureElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.SystemtemplatePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.impl.SystemImpl#getEcuExtractVersion <em>Ecu Extract Version</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.impl.SystemImpl#getSystemVersion <em>System Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends AtpStructureElementImpl implements fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System {
	/**
	 * The default value of the '{@link #getEcuExtractVersion() <em>Ecu Extract Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcuExtractVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String ECU_EXTRACT_VERSION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEcuExtractVersion() <em>Ecu Extract Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcuExtractVersion()
	 * @generated
	 * @ordered
	 */
	protected String ecuExtractVersion = ECU_EXTRACT_VERSION_EDEFAULT;

	/**
	 * This is true if the Ecu Extract Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ecuExtractVersionESet;

	/**
	 * The default value of the '{@link #getSystemVersion() <em>System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_VERSION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSystemVersion() <em>System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected String systemVersion = SYSTEM_VERSION_EDEFAULT;

	/**
	 * This is true if the System Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean systemVersionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemtemplatePackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcuExtractVersion() {
		return ecuExtractVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcuExtractVersion(String newEcuExtractVersion) {
		String oldEcuExtractVersion = ecuExtractVersion;
		ecuExtractVersion = newEcuExtractVersion;
		boolean oldEcuExtractVersionESet = ecuExtractVersionESet;
		ecuExtractVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemtemplatePackage.SYSTEM__ECU_EXTRACT_VERSION, oldEcuExtractVersion, ecuExtractVersion, !oldEcuExtractVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEcuExtractVersion() {
		String oldEcuExtractVersion = ecuExtractVersion;
		boolean oldEcuExtractVersionESet = ecuExtractVersionESet;
		ecuExtractVersion = ECU_EXTRACT_VERSION_EDEFAULT;
		ecuExtractVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SystemtemplatePackage.SYSTEM__ECU_EXTRACT_VERSION, oldEcuExtractVersion, ECU_EXTRACT_VERSION_EDEFAULT, oldEcuExtractVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEcuExtractVersion() {
		return ecuExtractVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemVersion() {
		return systemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemVersion(String newSystemVersion) {
		String oldSystemVersion = systemVersion;
		systemVersion = newSystemVersion;
		boolean oldSystemVersionESet = systemVersionESet;
		systemVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemtemplatePackage.SYSTEM__SYSTEM_VERSION, oldSystemVersion, systemVersion, !oldSystemVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSystemVersion() {
		String oldSystemVersion = systemVersion;
		boolean oldSystemVersionESet = systemVersionESet;
		systemVersion = SYSTEM_VERSION_EDEFAULT;
		systemVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SystemtemplatePackage.SYSTEM__SYSTEM_VERSION, oldSystemVersion, SYSTEM_VERSION_EDEFAULT, oldSystemVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSystemVersion() {
		return systemVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemtemplatePackage.SYSTEM__ECU_EXTRACT_VERSION:
				return getEcuExtractVersion();
			case SystemtemplatePackage.SYSTEM__SYSTEM_VERSION:
				return getSystemVersion();
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
			case SystemtemplatePackage.SYSTEM__ECU_EXTRACT_VERSION:
				setEcuExtractVersion((String)newValue);
				return;
			case SystemtemplatePackage.SYSTEM__SYSTEM_VERSION:
				setSystemVersion((String)newValue);
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
			case SystemtemplatePackage.SYSTEM__ECU_EXTRACT_VERSION:
				unsetEcuExtractVersion();
				return;
			case SystemtemplatePackage.SYSTEM__SYSTEM_VERSION:
				unsetSystemVersion();
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
			case SystemtemplatePackage.SYSTEM__ECU_EXTRACT_VERSION:
				return isSetEcuExtractVersion();
			case SystemtemplatePackage.SYSTEM__SYSTEM_VERSION:
				return isSetSystemVersion();
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
		result.append(" (ecuExtractVersion: ");
		if (ecuExtractVersionESet) result.append(ecuExtractVersion); else result.append("<unset>");
		result.append(", systemVersion: ");
		if (systemVersionESet) result.append(systemVersion); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SystemImpl
