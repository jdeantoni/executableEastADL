/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.userattributes.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAPackageableElementImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Attribute Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeElementTypeImpl#getValidFor <em>Valid For</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeElementTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeElementTypeImpl#getExtendedElementType <em>Extended Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserAttributeElementTypeImpl extends EAPackageableElementImpl implements UserAttributeElementType {
	/**
	 * The default value of the '{@link #getValidFor() <em>Valid For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFor()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_FOR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getValidFor() <em>Valid For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFor()
	 * @generated
	 * @ordered
	 */
	protected String validFor = VALID_FOR_EDEFAULT;

	/**
	 * This is true if the Valid For attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validForESet;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttributeDefinition> attribute;

	/**
	 * The cached value of the '{@link #getExtendedElementType() <em>Extended Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedElementType()
	 * @generated
	 * @ordered
	 */
	protected UserAttributeElementType extendedElementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserAttributeElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserattributesPackage.Literals.USER_ATTRIBUTE_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidFor() {
		return validFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFor(String newValidFor) {
		String oldValidFor = validFor;
		validFor = newValidFor;
		boolean oldValidForESet = validForESet;
		validForESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__VALID_FOR, oldValidFor, validFor, !oldValidForESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidFor() {
		String oldValidFor = validFor;
		boolean oldValidForESet = validForESet;
		validFor = VALID_FOR_EDEFAULT;
		validForESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__VALID_FOR, oldValidFor, VALID_FOR_EDEFAULT, oldValidForESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidFor() {
		return validForESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttributeDefinition> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<UserAttributeDefinition>(UserAttributeDefinition.class, this, UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAttributeElementType getExtendedElementType() {
		if (extendedElementType != null && extendedElementType.eIsProxy()) {
			InternalEObject oldExtendedElementType = (InternalEObject)extendedElementType;
			extendedElementType = (UserAttributeElementType)eResolveProxy(oldExtendedElementType);
			if (extendedElementType != oldExtendedElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__EXTENDED_ELEMENT_TYPE, oldExtendedElementType, extendedElementType));
			}
		}
		return extendedElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAttributeElementType basicGetExtendedElementType() {
		return extendedElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedElementType(UserAttributeElementType newExtendedElementType) {
		UserAttributeElementType oldExtendedElementType = extendedElementType;
		extendedElementType = newExtendedElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__EXTENDED_ELEMENT_TYPE, oldExtendedElementType, extendedElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
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
			case UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__VALID_FOR:
				return getValidFor();
			case UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__ATTRIBUTE:
				return getAttribute();
			case UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__EXTENDED_ELEMENT_TYPE:
				if (resolve) return getExtendedElementType();
				return basicGetExtendedElementType();
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
			case UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__VALID_FOR:
				setValidFor((String)newValue);
				return;
			case UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends UserAttributeDefinition>)newValue);
				return;
			case UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__EXTENDED_ELEMENT_TYPE:
				setExtendedElementType((UserAttributeElementType)newValue);
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
			case UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__VALID_FOR:
				unsetValidFor();
				return;
			case UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__EXTENDED_ELEMENT_TYPE:
				setExtendedElementType((UserAttributeElementType)null);
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
			case UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__VALID_FOR:
				return isSetValidFor();
			case UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__EXTENDED_ELEMENT_TYPE:
				return extendedElementType != null;
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
		result.append(" (validFor: ");
		if (validForESet) result.append(validFor); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UserAttributeElementTypeImpl
