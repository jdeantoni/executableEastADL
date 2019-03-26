/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.EAPackageableElement;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

import fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.gelements.GEAPackageableElement;
import fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.gelements.GelementsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAPackageImpl#getGElement <em>GElement</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAPackageImpl#getGSubPackage <em>GSub Package</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAPackageImpl#getSubPackage <em>Sub Package</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAPackageImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAPackageImpl extends EAElementImpl implements EAPackage {
	/**
	 * The cached value of the '{@link #getGElement() <em>GElement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGElement()
	 * @generated
	 * @ordered
	 */
	protected EList<GEAPackageableElement> gElement;

	/**
	 * The cached value of the '{@link #getGSubPackage() <em>GSub Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGSubPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<GEAPackage> gSubPackage;

	/**
	 * The cached value of the '{@link #getSubPackage() <em>Sub Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<EAPackage> subPackage;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<EAPackageableElement> element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElementsPackage.Literals.EA_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GEAPackageableElement> getGElement() {
		if (gElement == null) {
			gElement = new EObjectEList<GEAPackageableElement>(GEAPackageableElement.class, this, ElementsPackage.EA_PACKAGE__GELEMENT);
		}
		return gElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GEAPackage> getGSubPackage() {
		if (gSubPackage == null) {
			gSubPackage = new EObjectEList<GEAPackage>(GEAPackage.class, this, ElementsPackage.EA_PACKAGE__GSUB_PACKAGE);
		}
		return gSubPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAPackage> getSubPackage() {
		if (subPackage == null) {
			subPackage = new EObjectContainmentEList<EAPackage>(EAPackage.class, this, ElementsPackage.EA_PACKAGE__SUB_PACKAGE);
		}
		return subPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAPackageableElement> getElement() {
		if (element == null) {
			element = new EObjectContainmentWithInverseEList<EAPackageableElement>(EAPackageableElement.class, this, ElementsPackage.EA_PACKAGE__ELEMENT, ElementsPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElementsPackage.EA_PACKAGE__ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElement()).basicAdd(otherEnd, msgs);
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
			case ElementsPackage.EA_PACKAGE__SUB_PACKAGE:
				return ((InternalEList<?>)getSubPackage()).basicRemove(otherEnd, msgs);
			case ElementsPackage.EA_PACKAGE__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
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
			case ElementsPackage.EA_PACKAGE__GELEMENT:
				return getGElement();
			case ElementsPackage.EA_PACKAGE__GSUB_PACKAGE:
				return getGSubPackage();
			case ElementsPackage.EA_PACKAGE__SUB_PACKAGE:
				return getSubPackage();
			case ElementsPackage.EA_PACKAGE__ELEMENT:
				return getElement();
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
			case ElementsPackage.EA_PACKAGE__GELEMENT:
				getGElement().clear();
				getGElement().addAll((Collection<? extends GEAPackageableElement>)newValue);
				return;
			case ElementsPackage.EA_PACKAGE__GSUB_PACKAGE:
				getGSubPackage().clear();
				getGSubPackage().addAll((Collection<? extends GEAPackage>)newValue);
				return;
			case ElementsPackage.EA_PACKAGE__SUB_PACKAGE:
				getSubPackage().clear();
				getSubPackage().addAll((Collection<? extends EAPackage>)newValue);
				return;
			case ElementsPackage.EA_PACKAGE__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends EAPackageableElement>)newValue);
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
			case ElementsPackage.EA_PACKAGE__GELEMENT:
				getGElement().clear();
				return;
			case ElementsPackage.EA_PACKAGE__GSUB_PACKAGE:
				getGSubPackage().clear();
				return;
			case ElementsPackage.EA_PACKAGE__SUB_PACKAGE:
				getSubPackage().clear();
				return;
			case ElementsPackage.EA_PACKAGE__ELEMENT:
				getElement().clear();
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
			case ElementsPackage.EA_PACKAGE__GELEMENT:
				return gElement != null && !gElement.isEmpty();
			case ElementsPackage.EA_PACKAGE__GSUB_PACKAGE:
				return gSubPackage != null && !gSubPackage.isEmpty();
			case ElementsPackage.EA_PACKAGE__SUB_PACKAGE:
				return subPackage != null && !subPackage.isEmpty();
			case ElementsPackage.EA_PACKAGE__ELEMENT:
				return element != null && !element.isEmpty();
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
		if (baseClass == GEAPackage.class) {
			switch (derivedFeatureID) {
				case ElementsPackage.EA_PACKAGE__GELEMENT: return GelementsPackage.GEA_PACKAGE__GELEMENT;
				case ElementsPackage.EA_PACKAGE__GSUB_PACKAGE: return GelementsPackage.GEA_PACKAGE__GSUB_PACKAGE;
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
		if (baseClass == GEAPackage.class) {
			switch (baseFeatureID) {
				case GelementsPackage.GEA_PACKAGE__GELEMENT: return ElementsPackage.EA_PACKAGE__GELEMENT;
				case GelementsPackage.GEA_PACKAGE__GSUB_PACKAGE: return ElementsPackage.EA_PACKAGE__GSUB_PACKAGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EAPackageImpl
