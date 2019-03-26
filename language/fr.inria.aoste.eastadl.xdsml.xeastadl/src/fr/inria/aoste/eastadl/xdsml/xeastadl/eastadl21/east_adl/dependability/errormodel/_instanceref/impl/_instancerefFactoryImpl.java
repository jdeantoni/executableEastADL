/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel._instanceref.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel._instanceref.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _instancerefFactoryImpl extends EFactoryImpl implements _instancerefFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _instancerefFactory init() {
		try {
			_instancerefFactory the_instancerefFactory = (_instancerefFactory)EPackage.Registry.INSTANCE.getEFactory(_instancerefPackage.eNS_URI);
			if (the_instancerefFactory != null) {
				return the_instancerefFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _instancerefFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _instancerefFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET: return createErrorModelPrototype_functionTarget();
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET: return createErrorModelPrototype_hwTarget();
			case _instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET: return createFaultFailurePort_functionTarget();
			case _instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET: return createFaultFailurePort_hwTarget();
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT: return createFaultFailurePropagationLink_fromPort();
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT: return createFaultFailurePropagationLink_toPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelPrototype_functionTarget createErrorModelPrototype_functionTarget() {
		ErrorModelPrototype_functionTargetImpl errorModelPrototype_functionTarget = new ErrorModelPrototype_functionTargetImpl();
		return errorModelPrototype_functionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelPrototype_hwTarget createErrorModelPrototype_hwTarget() {
		ErrorModelPrototype_hwTargetImpl errorModelPrototype_hwTarget = new ErrorModelPrototype_hwTargetImpl();
		return errorModelPrototype_hwTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePort_functionTarget createFaultFailurePort_functionTarget() {
		FaultFailurePort_functionTargetImpl faultFailurePort_functionTarget = new FaultFailurePort_functionTargetImpl();
		return faultFailurePort_functionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePort_hwTarget createFaultFailurePort_hwTarget() {
		FaultFailurePort_hwTargetImpl faultFailurePort_hwTarget = new FaultFailurePort_hwTargetImpl();
		return faultFailurePort_hwTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePropagationLink_fromPort createFaultFailurePropagationLink_fromPort() {
		FaultFailurePropagationLink_fromPortImpl faultFailurePropagationLink_fromPort = new FaultFailurePropagationLink_fromPortImpl();
		return faultFailurePropagationLink_fromPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePropagationLink_toPort createFaultFailurePropagationLink_toPort() {
		FaultFailurePropagationLink_toPortImpl faultFailurePropagationLink_toPort = new FaultFailurePropagationLink_toPortImpl();
		return faultFailurePropagationLink_toPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _instancerefPackage get_instancerefPackage() {
		return (_instancerefPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _instancerefPackage getPackage() {
		return _instancerefPackage.eINSTANCE;
	}

} //_instancerefFactoryImpl
