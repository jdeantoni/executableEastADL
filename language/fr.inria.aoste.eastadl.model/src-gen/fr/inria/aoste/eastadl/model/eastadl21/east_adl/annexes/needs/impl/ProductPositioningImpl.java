/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.ProductPositioning;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Positioning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.ProductPositioningImpl#getTargetCustomers <em>Target Customers</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.ProductPositioningImpl#getDrivingNeeds <em>Driving Needs</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.ProductPositioningImpl#getPrimaryCompetitiveAlternative <em>Primary Competitive Alternative</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.ProductPositioningImpl#getKeyCapabilities <em>Key Capabilities</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.ProductPositioningImpl#getPrimaryDifferentiation <em>Primary Differentiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductPositioningImpl extends TraceableSpecificationImpl implements ProductPositioning {
	/**
	 * The default value of the '{@link #getTargetCustomers() <em>Target Customers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCustomers()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CUSTOMERS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTargetCustomers() <em>Target Customers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCustomers()
	 * @generated
	 * @ordered
	 */
	protected String targetCustomers = TARGET_CUSTOMERS_EDEFAULT;

	/**
	 * This is true if the Target Customers attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetCustomersESet;

	/**
	 * The default value of the '{@link #getDrivingNeeds() <em>Driving Needs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivingNeeds()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVING_NEEDS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDrivingNeeds() <em>Driving Needs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivingNeeds()
	 * @generated
	 * @ordered
	 */
	protected String drivingNeeds = DRIVING_NEEDS_EDEFAULT;

	/**
	 * This is true if the Driving Needs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean drivingNeedsESet;

	/**
	 * The default value of the '{@link #getPrimaryCompetitiveAlternative() <em>Primary Competitive Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryCompetitiveAlternative()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_COMPETITIVE_ALTERNATIVE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPrimaryCompetitiveAlternative() <em>Primary Competitive Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryCompetitiveAlternative()
	 * @generated
	 * @ordered
	 */
	protected String primaryCompetitiveAlternative = PRIMARY_COMPETITIVE_ALTERNATIVE_EDEFAULT;

	/**
	 * This is true if the Primary Competitive Alternative attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean primaryCompetitiveAlternativeESet;

	/**
	 * The default value of the '{@link #getKeyCapabilities() <em>Key Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyCapabilities()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_CAPABILITIES_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getKeyCapabilities() <em>Key Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyCapabilities()
	 * @generated
	 * @ordered
	 */
	protected String keyCapabilities = KEY_CAPABILITIES_EDEFAULT;

	/**
	 * This is true if the Key Capabilities attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyCapabilitiesESet;

	/**
	 * The default value of the '{@link #getPrimaryDifferentiation() <em>Primary Differentiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryDifferentiation()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_DIFFERENTIATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPrimaryDifferentiation() <em>Primary Differentiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryDifferentiation()
	 * @generated
	 * @ordered
	 */
	protected String primaryDifferentiation = PRIMARY_DIFFERENTIATION_EDEFAULT;

	/**
	 * This is true if the Primary Differentiation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean primaryDifferentiationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPositioningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeedsPackage.Literals.PRODUCT_POSITIONING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetCustomers() {
		return targetCustomers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCustomers(String newTargetCustomers) {
		String oldTargetCustomers = targetCustomers;
		targetCustomers = newTargetCustomers;
		boolean oldTargetCustomersESet = targetCustomersESet;
		targetCustomersESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.PRODUCT_POSITIONING__TARGET_CUSTOMERS, oldTargetCustomers, targetCustomers, !oldTargetCustomersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetCustomers() {
		String oldTargetCustomers = targetCustomers;
		boolean oldTargetCustomersESet = targetCustomersESet;
		targetCustomers = TARGET_CUSTOMERS_EDEFAULT;
		targetCustomersESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NeedsPackage.PRODUCT_POSITIONING__TARGET_CUSTOMERS, oldTargetCustomers, TARGET_CUSTOMERS_EDEFAULT, oldTargetCustomersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetCustomers() {
		return targetCustomersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDrivingNeeds() {
		return drivingNeeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrivingNeeds(String newDrivingNeeds) {
		String oldDrivingNeeds = drivingNeeds;
		drivingNeeds = newDrivingNeeds;
		boolean oldDrivingNeedsESet = drivingNeedsESet;
		drivingNeedsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.PRODUCT_POSITIONING__DRIVING_NEEDS, oldDrivingNeeds, drivingNeeds, !oldDrivingNeedsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDrivingNeeds() {
		String oldDrivingNeeds = drivingNeeds;
		boolean oldDrivingNeedsESet = drivingNeedsESet;
		drivingNeeds = DRIVING_NEEDS_EDEFAULT;
		drivingNeedsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NeedsPackage.PRODUCT_POSITIONING__DRIVING_NEEDS, oldDrivingNeeds, DRIVING_NEEDS_EDEFAULT, oldDrivingNeedsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDrivingNeeds() {
		return drivingNeedsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimaryCompetitiveAlternative() {
		return primaryCompetitiveAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryCompetitiveAlternative(String newPrimaryCompetitiveAlternative) {
		String oldPrimaryCompetitiveAlternative = primaryCompetitiveAlternative;
		primaryCompetitiveAlternative = newPrimaryCompetitiveAlternative;
		boolean oldPrimaryCompetitiveAlternativeESet = primaryCompetitiveAlternativeESet;
		primaryCompetitiveAlternativeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.PRODUCT_POSITIONING__PRIMARY_COMPETITIVE_ALTERNATIVE, oldPrimaryCompetitiveAlternative, primaryCompetitiveAlternative, !oldPrimaryCompetitiveAlternativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrimaryCompetitiveAlternative() {
		String oldPrimaryCompetitiveAlternative = primaryCompetitiveAlternative;
		boolean oldPrimaryCompetitiveAlternativeESet = primaryCompetitiveAlternativeESet;
		primaryCompetitiveAlternative = PRIMARY_COMPETITIVE_ALTERNATIVE_EDEFAULT;
		primaryCompetitiveAlternativeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NeedsPackage.PRODUCT_POSITIONING__PRIMARY_COMPETITIVE_ALTERNATIVE, oldPrimaryCompetitiveAlternative, PRIMARY_COMPETITIVE_ALTERNATIVE_EDEFAULT, oldPrimaryCompetitiveAlternativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrimaryCompetitiveAlternative() {
		return primaryCompetitiveAlternativeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyCapabilities() {
		return keyCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyCapabilities(String newKeyCapabilities) {
		String oldKeyCapabilities = keyCapabilities;
		keyCapabilities = newKeyCapabilities;
		boolean oldKeyCapabilitiesESet = keyCapabilitiesESet;
		keyCapabilitiesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.PRODUCT_POSITIONING__KEY_CAPABILITIES, oldKeyCapabilities, keyCapabilities, !oldKeyCapabilitiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeyCapabilities() {
		String oldKeyCapabilities = keyCapabilities;
		boolean oldKeyCapabilitiesESet = keyCapabilitiesESet;
		keyCapabilities = KEY_CAPABILITIES_EDEFAULT;
		keyCapabilitiesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NeedsPackage.PRODUCT_POSITIONING__KEY_CAPABILITIES, oldKeyCapabilities, KEY_CAPABILITIES_EDEFAULT, oldKeyCapabilitiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeyCapabilities() {
		return keyCapabilitiesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimaryDifferentiation() {
		return primaryDifferentiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryDifferentiation(String newPrimaryDifferentiation) {
		String oldPrimaryDifferentiation = primaryDifferentiation;
		primaryDifferentiation = newPrimaryDifferentiation;
		boolean oldPrimaryDifferentiationESet = primaryDifferentiationESet;
		primaryDifferentiationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.PRODUCT_POSITIONING__PRIMARY_DIFFERENTIATION, oldPrimaryDifferentiation, primaryDifferentiation, !oldPrimaryDifferentiationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrimaryDifferentiation() {
		String oldPrimaryDifferentiation = primaryDifferentiation;
		boolean oldPrimaryDifferentiationESet = primaryDifferentiationESet;
		primaryDifferentiation = PRIMARY_DIFFERENTIATION_EDEFAULT;
		primaryDifferentiationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NeedsPackage.PRODUCT_POSITIONING__PRIMARY_DIFFERENTIATION, oldPrimaryDifferentiation, PRIMARY_DIFFERENTIATION_EDEFAULT, oldPrimaryDifferentiationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrimaryDifferentiation() {
		return primaryDifferentiationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeedsPackage.PRODUCT_POSITIONING__TARGET_CUSTOMERS:
				return getTargetCustomers();
			case NeedsPackage.PRODUCT_POSITIONING__DRIVING_NEEDS:
				return getDrivingNeeds();
			case NeedsPackage.PRODUCT_POSITIONING__PRIMARY_COMPETITIVE_ALTERNATIVE:
				return getPrimaryCompetitiveAlternative();
			case NeedsPackage.PRODUCT_POSITIONING__KEY_CAPABILITIES:
				return getKeyCapabilities();
			case NeedsPackage.PRODUCT_POSITIONING__PRIMARY_DIFFERENTIATION:
				return getPrimaryDifferentiation();
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
			case NeedsPackage.PRODUCT_POSITIONING__TARGET_CUSTOMERS:
				setTargetCustomers((String)newValue);
				return;
			case NeedsPackage.PRODUCT_POSITIONING__DRIVING_NEEDS:
				setDrivingNeeds((String)newValue);
				return;
			case NeedsPackage.PRODUCT_POSITIONING__PRIMARY_COMPETITIVE_ALTERNATIVE:
				setPrimaryCompetitiveAlternative((String)newValue);
				return;
			case NeedsPackage.PRODUCT_POSITIONING__KEY_CAPABILITIES:
				setKeyCapabilities((String)newValue);
				return;
			case NeedsPackage.PRODUCT_POSITIONING__PRIMARY_DIFFERENTIATION:
				setPrimaryDifferentiation((String)newValue);
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
			case NeedsPackage.PRODUCT_POSITIONING__TARGET_CUSTOMERS:
				unsetTargetCustomers();
				return;
			case NeedsPackage.PRODUCT_POSITIONING__DRIVING_NEEDS:
				unsetDrivingNeeds();
				return;
			case NeedsPackage.PRODUCT_POSITIONING__PRIMARY_COMPETITIVE_ALTERNATIVE:
				unsetPrimaryCompetitiveAlternative();
				return;
			case NeedsPackage.PRODUCT_POSITIONING__KEY_CAPABILITIES:
				unsetKeyCapabilities();
				return;
			case NeedsPackage.PRODUCT_POSITIONING__PRIMARY_DIFFERENTIATION:
				unsetPrimaryDifferentiation();
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
			case NeedsPackage.PRODUCT_POSITIONING__TARGET_CUSTOMERS:
				return isSetTargetCustomers();
			case NeedsPackage.PRODUCT_POSITIONING__DRIVING_NEEDS:
				return isSetDrivingNeeds();
			case NeedsPackage.PRODUCT_POSITIONING__PRIMARY_COMPETITIVE_ALTERNATIVE:
				return isSetPrimaryCompetitiveAlternative();
			case NeedsPackage.PRODUCT_POSITIONING__KEY_CAPABILITIES:
				return isSetKeyCapabilities();
			case NeedsPackage.PRODUCT_POSITIONING__PRIMARY_DIFFERENTIATION:
				return isSetPrimaryDifferentiation();
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
		result.append(" (targetCustomers: ");
		if (targetCustomersESet) result.append(targetCustomers); else result.append("<unset>");
		result.append(", drivingNeeds: ");
		if (drivingNeedsESet) result.append(drivingNeeds); else result.append("<unset>");
		result.append(", primaryCompetitiveAlternative: ");
		if (primaryCompetitiveAlternativeESet) result.append(primaryCompetitiveAlternative); else result.append("<unset>");
		result.append(", keyCapabilities: ");
		if (keyCapabilitiesESet) result.append(keyCapabilities); else result.append("<unset>");
		result.append(", primaryDifferentiation: ");
		if (primaryDifferentiationESet) result.append(primaryDifferentiation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProductPositioningImpl
