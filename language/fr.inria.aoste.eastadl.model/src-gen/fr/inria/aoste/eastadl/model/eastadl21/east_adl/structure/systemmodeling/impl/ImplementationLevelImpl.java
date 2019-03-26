/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.ImplementationLevel;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.impl.ImplementationLevelImpl#getAutosarSystem <em>Autosar System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationLevelImpl extends ContextImpl implements ImplementationLevel {
	/**
	 * The cached value of the '{@link #getAutosarSystem() <em>Autosar System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutosarSystem()
	 * @generated
	 * @ordered
	 */
	protected fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System autosarSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemmodelingPackage.Literals.IMPLEMENTATION_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System getAutosarSystem() {
		if (autosarSystem != null && autosarSystem.eIsProxy()) {
			InternalEObject oldAutosarSystem = (InternalEObject)autosarSystem;
			autosarSystem = (fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System)eResolveProxy(oldAutosarSystem);
			if (autosarSystem != oldAutosarSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemmodelingPackage.IMPLEMENTATION_LEVEL__AUTOSAR_SYSTEM, oldAutosarSystem, autosarSystem));
			}
		}
		return autosarSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System basicGetAutosarSystem() {
		return autosarSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutosarSystem(fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System newAutosarSystem) {
		fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System oldAutosarSystem = autosarSystem;
		autosarSystem = newAutosarSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemmodelingPackage.IMPLEMENTATION_LEVEL__AUTOSAR_SYSTEM, oldAutosarSystem, autosarSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemmodelingPackage.IMPLEMENTATION_LEVEL__AUTOSAR_SYSTEM:
				if (resolve) return getAutosarSystem();
				return basicGetAutosarSystem();
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
			case SystemmodelingPackage.IMPLEMENTATION_LEVEL__AUTOSAR_SYSTEM:
				setAutosarSystem((fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System)newValue);
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
			case SystemmodelingPackage.IMPLEMENTATION_LEVEL__AUTOSAR_SYSTEM:
				setAutosarSystem((fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System)null);
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
			case SystemmodelingPackage.IMPLEMENTATION_LEVEL__AUTOSAR_SYSTEM:
				return autosarSystem != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationLevelImpl
