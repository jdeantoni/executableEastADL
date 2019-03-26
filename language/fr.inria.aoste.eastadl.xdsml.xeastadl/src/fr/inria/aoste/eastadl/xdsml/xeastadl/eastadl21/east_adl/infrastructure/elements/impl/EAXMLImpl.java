/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.EAXML;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

import fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.gelements.GEAPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAXML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAXMLImpl#getGTopLevelPackage <em>GTop Level Package</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAXMLImpl#getTopLevelPackage <em>Top Level Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAXMLImpl extends EObjectImpl implements EAXML {
	/**
	 * The cached value of the '{@link #getGTopLevelPackage() <em>GTop Level Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGTopLevelPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<GEAPackage> gTopLevelPackage;

	/**
	 * The cached value of the '{@link #getTopLevelPackage() <em>Top Level Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<EAPackage> topLevelPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAXMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElementsPackage.Literals.EAXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GEAPackage> getGTopLevelPackage() {
		if (gTopLevelPackage == null) {
			gTopLevelPackage = new EObjectEList<GEAPackage>(GEAPackage.class, this, ElementsPackage.EAXML__GTOP_LEVEL_PACKAGE);
		}
		return gTopLevelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAPackage> getTopLevelPackage() {
		if (topLevelPackage == null) {
			topLevelPackage = new EObjectContainmentEList<EAPackage>(EAPackage.class, this, ElementsPackage.EAXML__TOP_LEVEL_PACKAGE);
		}
		return topLevelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElementsPackage.EAXML__TOP_LEVEL_PACKAGE:
				return ((InternalEList<?>)getTopLevelPackage()).basicRemove(otherEnd, msgs);
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
			case ElementsPackage.EAXML__GTOP_LEVEL_PACKAGE:
				return getGTopLevelPackage();
			case ElementsPackage.EAXML__TOP_LEVEL_PACKAGE:
				return getTopLevelPackage();
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
			case ElementsPackage.EAXML__GTOP_LEVEL_PACKAGE:
				getGTopLevelPackage().clear();
				getGTopLevelPackage().addAll((Collection<? extends GEAPackage>)newValue);
				return;
			case ElementsPackage.EAXML__TOP_LEVEL_PACKAGE:
				getTopLevelPackage().clear();
				getTopLevelPackage().addAll((Collection<? extends EAPackage>)newValue);
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
			case ElementsPackage.EAXML__GTOP_LEVEL_PACKAGE:
				getGTopLevelPackage().clear();
				return;
			case ElementsPackage.EAXML__TOP_LEVEL_PACKAGE:
				getTopLevelPackage().clear();
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
			case ElementsPackage.EAXML__GTOP_LEVEL_PACKAGE:
				return gTopLevelPackage != null && !gTopLevelPackage.isEmpty();
			case ElementsPackage.EAXML__TOP_LEVEL_PACKAGE:
				return topLevelPackage != null && !topLevelPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EAXMLImpl
