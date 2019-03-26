/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Attributeable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeableElementImpl#getUaType <em>Ua Type</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeableElementImpl#getUaValue <em>Ua Value</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeableElementImpl#getAttributedElement <em>Attributed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserAttributeableElementImpl extends MinimalEObjectImpl.Container implements UserAttributeableElement {
	/**
	 * The cached value of the '{@link #getUaType() <em>Ua Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUaType()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttributeElementType> uaType;

	/**
	 * The cached value of the '{@link #getUaValue() <em>Ua Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUaValue()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttributeValue> uaValue;

	/**
	 * The cached value of the '{@link #getAttributedElement() <em>Attributed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributedElement()
	 * @generated
	 * @ordered
	 */
	protected Identifiable attributedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserAttributeableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserattributesPackage.Literals.USER_ATTRIBUTEABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttributeElementType> getUaType() {
		if (uaType == null) {
			uaType = new EObjectResolvingEList<UserAttributeElementType>(UserAttributeElementType.class, this, UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_TYPE);
		}
		return uaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttributeValue> getUaValue() {
		if (uaValue == null) {
			uaValue = new EObjectContainmentEList<UserAttributeValue>(UserAttributeValue.class, this, UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_VALUE);
		}
		return uaValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable getAttributedElement() {
		if (attributedElement != null && attributedElement.eIsProxy()) {
			InternalEObject oldAttributedElement = (InternalEObject)attributedElement;
			attributedElement = (Identifiable)eResolveProxy(oldAttributedElement);
			if (attributedElement != oldAttributedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__ATTRIBUTED_ELEMENT, oldAttributedElement, attributedElement));
			}
		}
		return attributedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable basicGetAttributedElement() {
		return attributedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributedElement(Identifiable newAttributedElement) {
		Identifiable oldAttributedElement = attributedElement;
		attributedElement = newAttributedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__ATTRIBUTED_ELEMENT, oldAttributedElement, attributedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_VALUE:
				return ((InternalEList<?>)getUaValue()).basicRemove(otherEnd, msgs);
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
			case UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_TYPE:
				return getUaType();
			case UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_VALUE:
				return getUaValue();
			case UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__ATTRIBUTED_ELEMENT:
				if (resolve) return getAttributedElement();
				return basicGetAttributedElement();
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
			case UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_TYPE:
				getUaType().clear();
				getUaType().addAll((Collection<? extends UserAttributeElementType>)newValue);
				return;
			case UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_VALUE:
				getUaValue().clear();
				getUaValue().addAll((Collection<? extends UserAttributeValue>)newValue);
				return;
			case UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__ATTRIBUTED_ELEMENT:
				setAttributedElement((Identifiable)newValue);
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
			case UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_TYPE:
				getUaType().clear();
				return;
			case UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_VALUE:
				getUaValue().clear();
				return;
			case UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__ATTRIBUTED_ELEMENT:
				setAttributedElement((Identifiable)null);
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
			case UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_TYPE:
				return uaType != null && !uaType.isEmpty();
			case UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_VALUE:
				return uaValue != null && !uaValue.isEmpty();
			case UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__ATTRIBUTED_ELEMENT:
				return attributedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //UserAttributeableElementImpl
