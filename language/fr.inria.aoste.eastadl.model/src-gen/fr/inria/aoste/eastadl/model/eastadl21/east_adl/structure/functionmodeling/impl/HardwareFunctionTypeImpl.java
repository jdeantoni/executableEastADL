/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.HardwareFunctionType;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl.HardwareFunctionTypeImpl#getHardwareComponent <em>Hardware Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareFunctionTypeImpl extends DesignFunctionTypeImpl implements HardwareFunctionType {
	/**
	 * The cached value of the '{@link #getHardwareComponent() <em>Hardware Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareComponent()
	 * @generated
	 * @ordered
	 */
	protected HardwareComponentType hardwareComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareFunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionmodelingPackage.Literals.HARDWARE_FUNCTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentType getHardwareComponent() {
		if (hardwareComponent != null && hardwareComponent.eIsProxy()) {
			InternalEObject oldHardwareComponent = (InternalEObject)hardwareComponent;
			hardwareComponent = (HardwareComponentType)eResolveProxy(oldHardwareComponent);
			if (hardwareComponent != oldHardwareComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionmodelingPackage.HARDWARE_FUNCTION_TYPE__HARDWARE_COMPONENT, oldHardwareComponent, hardwareComponent));
			}
		}
		return hardwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentType basicGetHardwareComponent() {
		return hardwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareComponent(HardwareComponentType newHardwareComponent) {
		HardwareComponentType oldHardwareComponent = hardwareComponent;
		hardwareComponent = newHardwareComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.HARDWARE_FUNCTION_TYPE__HARDWARE_COMPONENT, oldHardwareComponent, hardwareComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionmodelingPackage.HARDWARE_FUNCTION_TYPE__HARDWARE_COMPONENT:
				if (resolve) return getHardwareComponent();
				return basicGetHardwareComponent();
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
			case FunctionmodelingPackage.HARDWARE_FUNCTION_TYPE__HARDWARE_COMPONENT:
				setHardwareComponent((HardwareComponentType)newValue);
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
			case FunctionmodelingPackage.HARDWARE_FUNCTION_TYPE__HARDWARE_COMPONENT:
				setHardwareComponent((HardwareComponentType)null);
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
			case FunctionmodelingPackage.HARDWARE_FUNCTION_TYPE__HARDWARE_COMPONENT:
				return hardwareComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //HardwareFunctionTypeImpl
