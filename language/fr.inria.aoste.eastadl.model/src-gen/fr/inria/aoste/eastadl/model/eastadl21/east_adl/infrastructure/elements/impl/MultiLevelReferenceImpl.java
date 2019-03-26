/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.MultiLevelReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Level Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.MultiLevelReferenceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.MultiLevelReferenceImpl#getReferring <em>Referring</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiLevelReferenceImpl extends RelationshipImpl implements MultiLevelReference {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EAElement reference;

	/**
	 * The cached value of the '{@link #getReferring() <em>Referring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferring()
	 * @generated
	 * @ordered
	 */
	protected EAElement referring;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiLevelReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElementsPackage.Literals.MULTI_LEVEL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (EAElement)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ElementsPackage.MULTI_LEVEL_REFERENCE__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(EAElement newReference) {
		EAElement oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElementsPackage.MULTI_LEVEL_REFERENCE__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement getReferring() {
		if (referring != null && referring.eIsProxy()) {
			InternalEObject oldReferring = (InternalEObject)referring;
			referring = (EAElement)eResolveProxy(oldReferring);
			if (referring != oldReferring) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ElementsPackage.MULTI_LEVEL_REFERENCE__REFERRING, oldReferring, referring));
			}
		}
		return referring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement basicGetReferring() {
		return referring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferring(EAElement newReferring) {
		EAElement oldReferring = referring;
		referring = newReferring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElementsPackage.MULTI_LEVEL_REFERENCE__REFERRING, oldReferring, referring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElementsPackage.MULTI_LEVEL_REFERENCE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case ElementsPackage.MULTI_LEVEL_REFERENCE__REFERRING:
				if (resolve) return getReferring();
				return basicGetReferring();
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
			case ElementsPackage.MULTI_LEVEL_REFERENCE__REFERENCE:
				setReference((EAElement)newValue);
				return;
			case ElementsPackage.MULTI_LEVEL_REFERENCE__REFERRING:
				setReferring((EAElement)newValue);
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
			case ElementsPackage.MULTI_LEVEL_REFERENCE__REFERENCE:
				setReference((EAElement)null);
				return;
			case ElementsPackage.MULTI_LEVEL_REFERENCE__REFERRING:
				setReferring((EAElement)null);
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
			case ElementsPackage.MULTI_LEVEL_REFERENCE__REFERENCE:
				return reference != null;
			case ElementsPackage.MULTI_LEVEL_REFERENCE__REFERRING:
				return referring != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiLevelReferenceImpl
