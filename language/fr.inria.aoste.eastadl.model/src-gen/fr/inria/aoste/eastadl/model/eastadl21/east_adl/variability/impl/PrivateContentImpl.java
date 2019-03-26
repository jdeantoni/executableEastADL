/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.PrivateContent;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.PrivateContentImpl#getPrivateElement <em>Private Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivateContentImpl extends EAElementImpl implements PrivateContent {
	/**
	 * The cached value of the '{@link #getPrivateElement() <em>Private Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateElement()
	 * @generated
	 * @ordered
	 */
	protected Identifiable privateElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivateContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.PRIVATE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable getPrivateElement() {
		if (privateElement != null && privateElement.eIsProxy()) {
			InternalEObject oldPrivateElement = (InternalEObject)privateElement;
			privateElement = (Identifiable)eResolveProxy(oldPrivateElement);
			if (privateElement != oldPrivateElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.PRIVATE_CONTENT__PRIVATE_ELEMENT, oldPrivateElement, privateElement));
			}
		}
		return privateElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable basicGetPrivateElement() {
		return privateElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateElement(Identifiable newPrivateElement) {
		Identifiable oldPrivateElement = privateElement;
		privateElement = newPrivateElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.PRIVATE_CONTENT__PRIVATE_ELEMENT, oldPrivateElement, privateElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariabilityPackage.PRIVATE_CONTENT__PRIVATE_ELEMENT:
				if (resolve) return getPrivateElement();
				return basicGetPrivateElement();
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
			case VariabilityPackage.PRIVATE_CONTENT__PRIVATE_ELEMENT:
				setPrivateElement((Identifiable)newValue);
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
			case VariabilityPackage.PRIVATE_CONTENT__PRIVATE_ELEMENT:
				setPrivateElement((Identifiable)null);
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
			case VariabilityPackage.PRIVATE_CONTENT__PRIVATE_ELEMENT:
				return privateElement != null;
		}
		return super.eIsSet(featureID);
	}

} //PrivateContentImpl
