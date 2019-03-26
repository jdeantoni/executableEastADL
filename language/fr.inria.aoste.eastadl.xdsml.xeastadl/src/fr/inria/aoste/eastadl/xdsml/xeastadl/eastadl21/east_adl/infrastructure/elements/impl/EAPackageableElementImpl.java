/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.EAPackageableElement;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

import fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.gelements.GEAPackageableElement;
import fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.gelements.GelementsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAPackageableElementImpl#getGEAPackage_element <em>GEA Package element</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAPackageableElementImpl#getEAPackage_element <em>EA Package element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EAPackageableElementImpl extends EAElementImpl implements EAPackageableElement {
	/**
	 * The cached value of the '{@link #getGEAPackage_element() <em>GEA Package element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEAPackage_element()
	 * @generated
	 * @ordered
	 */
	protected GEAPackage gEAPackage_element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAPackageableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElementsPackage.Literals.EA_PACKAGEABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEAPackage getGEAPackage_element() {
		return gEAPackage_element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGEAPackage_element(GEAPackage newGEAPackage_element) {
		GEAPackage oldGEAPackage_element = gEAPackage_element;
		gEAPackage_element = newGEAPackage_element;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElementsPackage.EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT, oldGEAPackage_element, gEAPackage_element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAPackage getEAPackage_element() {
		if (eContainerFeatureID() != ElementsPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT) return null;
		return (EAPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEAPackage_element(EAPackage newEAPackage_element, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEAPackage_element, ElementsPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAPackage_element(EAPackage newEAPackage_element) {
		if (newEAPackage_element != eInternalContainer() || (eContainerFeatureID() != ElementsPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT && newEAPackage_element != null)) {
			if (EcoreUtil.isAncestor(this, newEAPackage_element))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEAPackage_element != null)
				msgs = ((InternalEObject)newEAPackage_element).eInverseAdd(this, ElementsPackage.EA_PACKAGE__ELEMENT, EAPackage.class, msgs);
			msgs = basicSetEAPackage_element(newEAPackage_element, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElementsPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT, newEAPackage_element, newEAPackage_element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElementsPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEAPackage_element((EAPackage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElementsPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT:
				return basicSetEAPackage_element(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ElementsPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT:
				return eInternalContainer().eInverseRemove(this, ElementsPackage.EA_PACKAGE__ELEMENT, EAPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElementsPackage.EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT:
				return getGEAPackage_element();
			case ElementsPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT:
				return getEAPackage_element();
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
			case ElementsPackage.EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT:
				setGEAPackage_element((GEAPackage)newValue);
				return;
			case ElementsPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT:
				setEAPackage_element((EAPackage)newValue);
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
			case ElementsPackage.EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT:
				setGEAPackage_element((GEAPackage)null);
				return;
			case ElementsPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT:
				setEAPackage_element((EAPackage)null);
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
			case ElementsPackage.EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT:
				return gEAPackage_element != null;
			case ElementsPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT:
				return getEAPackage_element() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GEAPackageableElement.class) {
			switch (derivedFeatureID) {
				case ElementsPackage.EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT: return GelementsPackage.GEA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GEAPackageableElement.class) {
			switch (baseFeatureID) {
				case GelementsPackage.GEA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT: return ElementsPackage.EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EAPackageableElementImpl
