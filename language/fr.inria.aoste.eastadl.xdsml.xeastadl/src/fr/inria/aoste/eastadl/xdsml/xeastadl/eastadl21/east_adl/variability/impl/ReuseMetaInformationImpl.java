/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.ReuseMetaInformation;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.VariabilityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reuse Meta Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.ReuseMetaInformationImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.ReuseMetaInformationImpl#getIsReusable <em>Is Reusable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReuseMetaInformationImpl extends TraceableSpecificationImpl implements ReuseMetaInformation {
	/**
	 * The default value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected String information = INFORMATION_EDEFAULT;

	/**
	 * This is true if the Information attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean informationESet;

	/**
	 * The default value of the '{@link #getIsReusable() <em>Is Reusable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReusable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_REUSABLE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsReusable() <em>Is Reusable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReusable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReusable = IS_REUSABLE_EDEFAULT;

	/**
	 * This is true if the Is Reusable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isReusableESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReuseMetaInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.REUSE_META_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformation(String newInformation) {
		String oldInformation = information;
		information = newInformation;
		boolean oldInformationESet = informationESet;
		informationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.REUSE_META_INFORMATION__INFORMATION, oldInformation, information, !oldInformationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInformation() {
		String oldInformation = information;
		boolean oldInformationESet = informationESet;
		information = INFORMATION_EDEFAULT;
		informationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VariabilityPackage.REUSE_META_INFORMATION__INFORMATION, oldInformation, INFORMATION_EDEFAULT, oldInformationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInformation() {
		return informationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReusable() {
		return isReusable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReusable(Boolean newIsReusable) {
		Boolean oldIsReusable = isReusable;
		isReusable = newIsReusable;
		boolean oldIsReusableESet = isReusableESet;
		isReusableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.REUSE_META_INFORMATION__IS_REUSABLE, oldIsReusable, isReusable, !oldIsReusableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsReusable() {
		Boolean oldIsReusable = isReusable;
		boolean oldIsReusableESet = isReusableESet;
		isReusable = IS_REUSABLE_EDEFAULT;
		isReusableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VariabilityPackage.REUSE_META_INFORMATION__IS_REUSABLE, oldIsReusable, IS_REUSABLE_EDEFAULT, oldIsReusableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsReusable() {
		return isReusableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariabilityPackage.REUSE_META_INFORMATION__INFORMATION:
				return getInformation();
			case VariabilityPackage.REUSE_META_INFORMATION__IS_REUSABLE:
				return getIsReusable();
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
			case VariabilityPackage.REUSE_META_INFORMATION__INFORMATION:
				setInformation((String)newValue);
				return;
			case VariabilityPackage.REUSE_META_INFORMATION__IS_REUSABLE:
				setIsReusable((Boolean)newValue);
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
			case VariabilityPackage.REUSE_META_INFORMATION__INFORMATION:
				unsetInformation();
				return;
			case VariabilityPackage.REUSE_META_INFORMATION__IS_REUSABLE:
				unsetIsReusable();
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
			case VariabilityPackage.REUSE_META_INFORMATION__INFORMATION:
				return isSetInformation();
			case VariabilityPackage.REUSE_META_INFORMATION__IS_REUSABLE:
				return isSetIsReusable();
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
		result.append(" (information: ");
		if (informationESet) result.append(information); else result.append("<unset>");
		result.append(", isReusable: ");
		if (isReusableESet) result.append(isReusable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReuseMetaInformationImpl
