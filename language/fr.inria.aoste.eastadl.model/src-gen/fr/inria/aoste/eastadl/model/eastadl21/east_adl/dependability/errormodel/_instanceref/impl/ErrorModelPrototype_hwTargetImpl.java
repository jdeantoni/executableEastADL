/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTarget;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model Prototype hw Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl.ErrorModelPrototype_hwTargetImpl#getHardwareComponentPrototype_context <em>Hardware Component Prototype context</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl.ErrorModelPrototype_hwTargetImpl#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorModelPrototype_hwTargetImpl extends MinimalEObjectImpl.Container implements ErrorModelPrototype_hwTarget {
	/**
	 * The cached value of the '{@link #getHardwareComponentPrototype_context() <em>Hardware Component Prototype context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareComponentPrototype_context()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareComponentPrototype> hardwareComponentPrototype_context;

	/**
	 * The cached value of the '{@link #getHardwareComponentPrototype() <em>Hardware Component Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareComponentPrototype()
	 * @generated
	 * @ordered
	 */
	protected HardwareComponentPrototype hardwareComponentPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModelPrototype_hwTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.ERROR_MODEL_PROTOTYPE_HW_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareComponentPrototype> getHardwareComponentPrototype_context() {
		if (hardwareComponentPrototype_context == null) {
			hardwareComponentPrototype_context = new EObjectResolvingEList<HardwareComponentPrototype>(HardwareComponentPrototype.class, this, _instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT);
		}
		return hardwareComponentPrototype_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentPrototype getHardwareComponentPrototype() {
		if (hardwareComponentPrototype != null && hardwareComponentPrototype.eIsProxy()) {
			InternalEObject oldHardwareComponentPrototype = (InternalEObject)hardwareComponentPrototype;
			hardwareComponentPrototype = (HardwareComponentPrototype)eResolveProxy(oldHardwareComponentPrototype);
			if (hardwareComponentPrototype != oldHardwareComponentPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE, oldHardwareComponentPrototype, hardwareComponentPrototype));
			}
		}
		return hardwareComponentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentPrototype basicGetHardwareComponentPrototype() {
		return hardwareComponentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareComponentPrototype(HardwareComponentPrototype newHardwareComponentPrototype) {
		HardwareComponentPrototype oldHardwareComponentPrototype = hardwareComponentPrototype;
		hardwareComponentPrototype = newHardwareComponentPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE, oldHardwareComponentPrototype, hardwareComponentPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT:
				return getHardwareComponentPrototype_context();
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
				if (resolve) return getHardwareComponentPrototype();
				return basicGetHardwareComponentPrototype();
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
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT:
				getHardwareComponentPrototype_context().clear();
				getHardwareComponentPrototype_context().addAll((Collection<? extends HardwareComponentPrototype>)newValue);
				return;
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
				setHardwareComponentPrototype((HardwareComponentPrototype)newValue);
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
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT:
				getHardwareComponentPrototype_context().clear();
				return;
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
				setHardwareComponentPrototype((HardwareComponentPrototype)null);
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
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT:
				return hardwareComponentPrototype_context != null && !hardwareComponentPrototype_context.isEmpty();
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
				return hardwareComponentPrototype != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorModelPrototype_hwTargetImpl
