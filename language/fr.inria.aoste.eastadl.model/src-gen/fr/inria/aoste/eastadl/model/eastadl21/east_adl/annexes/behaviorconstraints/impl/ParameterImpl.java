/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Parameter;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EADatatype;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.ParameterImpl#getTargetFunctionPort <em>Target Function Port</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.ParameterImpl#getTargetFunction <em>Target Function</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.ParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends EAElementImpl implements Parameter {
	/**
	 * The cached value of the '{@link #getTargetFunctionPort() <em>Target Function Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFunctionPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionPort targetFunctionPort;

	/**
	 * The cached value of the '{@link #getTargetFunction() <em>Target Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFunction()
	 * @generated
	 * @ordered
	 */
	protected FunctionType targetFunction;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EADatatype type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorconstraintsPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort getTargetFunctionPort() {
		if (targetFunctionPort != null && targetFunctionPort.eIsProxy()) {
			InternalEObject oldTargetFunctionPort = (InternalEObject)targetFunctionPort;
			targetFunctionPort = (FunctionPort)eResolveProxy(oldTargetFunctionPort);
			if (targetFunctionPort != oldTargetFunctionPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorconstraintsPackage.PARAMETER__TARGET_FUNCTION_PORT, oldTargetFunctionPort, targetFunctionPort));
			}
		}
		return targetFunctionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort basicGetTargetFunctionPort() {
		return targetFunctionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFunctionPort(FunctionPort newTargetFunctionPort) {
		FunctionPort oldTargetFunctionPort = targetFunctionPort;
		targetFunctionPort = newTargetFunctionPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorconstraintsPackage.PARAMETER__TARGET_FUNCTION_PORT, oldTargetFunctionPort, targetFunctionPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType getTargetFunction() {
		if (targetFunction != null && targetFunction.eIsProxy()) {
			InternalEObject oldTargetFunction = (InternalEObject)targetFunction;
			targetFunction = (FunctionType)eResolveProxy(oldTargetFunction);
			if (targetFunction != oldTargetFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorconstraintsPackage.PARAMETER__TARGET_FUNCTION, oldTargetFunction, targetFunction));
			}
		}
		return targetFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType basicGetTargetFunction() {
		return targetFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFunction(FunctionType newTargetFunction) {
		FunctionType oldTargetFunction = targetFunction;
		targetFunction = newTargetFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorconstraintsPackage.PARAMETER__TARGET_FUNCTION, oldTargetFunction, targetFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADatatype getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EADatatype)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorconstraintsPackage.PARAMETER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADatatype basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EADatatype newType) {
		EADatatype oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorconstraintsPackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorconstraintsPackage.PARAMETER__TARGET_FUNCTION_PORT:
				if (resolve) return getTargetFunctionPort();
				return basicGetTargetFunctionPort();
			case BehaviorconstraintsPackage.PARAMETER__TARGET_FUNCTION:
				if (resolve) return getTargetFunction();
				return basicGetTargetFunction();
			case BehaviorconstraintsPackage.PARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case BehaviorconstraintsPackage.PARAMETER__TARGET_FUNCTION_PORT:
				setTargetFunctionPort((FunctionPort)newValue);
				return;
			case BehaviorconstraintsPackage.PARAMETER__TARGET_FUNCTION:
				setTargetFunction((FunctionType)newValue);
				return;
			case BehaviorconstraintsPackage.PARAMETER__TYPE:
				setType((EADatatype)newValue);
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
			case BehaviorconstraintsPackage.PARAMETER__TARGET_FUNCTION_PORT:
				setTargetFunctionPort((FunctionPort)null);
				return;
			case BehaviorconstraintsPackage.PARAMETER__TARGET_FUNCTION:
				setTargetFunction((FunctionType)null);
				return;
			case BehaviorconstraintsPackage.PARAMETER__TYPE:
				setType((EADatatype)null);
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
			case BehaviorconstraintsPackage.PARAMETER__TARGET_FUNCTION_PORT:
				return targetFunctionPort != null;
			case BehaviorconstraintsPackage.PARAMETER__TARGET_FUNCTION:
				return targetFunction != null;
			case BehaviorconstraintsPackage.PARAMETER__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterImpl
