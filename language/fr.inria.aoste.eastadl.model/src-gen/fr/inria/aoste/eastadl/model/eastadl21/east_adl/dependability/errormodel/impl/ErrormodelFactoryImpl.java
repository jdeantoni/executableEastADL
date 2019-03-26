/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ErrormodelFactoryImpl extends EFactoryImpl implements ErrormodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErrormodelFactory init() {
		try {
			ErrormodelFactory theErrormodelFactory = (ErrormodelFactory)EPackage.Registry.INSTANCE.getEFactory(ErrormodelPackage.eNS_URI);
			if (theErrormodelFactory != null) {
				return theErrormodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ErrormodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrormodelFactoryImpl() {
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
			case ErrormodelPackage.ERROR_BEHAVIOR: return createErrorBehavior();
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE: return createErrorModelPrototype();
			case ErrormodelPackage.ERROR_MODEL_TYPE: return createErrorModelType();
			case ErrormodelPackage.FAILURE_OUT_PORT: return createFailureOutPort();
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK: return createFaultFailurePropagationLink();
			case ErrormodelPackage.FAULT_IN_PORT: return createFaultInPort();
			case ErrormodelPackage.INTERNAL_FAULT_PROTOTYPE: return createInternalFaultPrototype();
			case ErrormodelPackage.PROCESS_FAULT_PROTOTYPE: return createProcessFaultPrototype();
			case ErrormodelPackage.FAULT_IN_PORT_PROXY: return createFaultInPortProxy();
			case ErrormodelPackage.FAILURE_OUT_PORT_PROXY: return createFailureOutPortProxy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ErrormodelPackage.ERROR_BEHAVIOR_KIND:
				return createErrorBehaviorKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ErrormodelPackage.ERROR_BEHAVIOR_KIND:
				return convertErrorBehaviorKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehavior createErrorBehavior() {
		ErrorBehaviorImpl errorBehavior = new ErrorBehaviorImpl();
		return errorBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelPrototype createErrorModelPrototype() {
		ErrorModelPrototypeImpl errorModelPrototype = new ErrorModelPrototypeImpl();
		return errorModelPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelType createErrorModelType() {
		ErrorModelTypeImpl errorModelType = new ErrorModelTypeImpl();
		return errorModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureOutPort createFailureOutPort() {
		FailureOutPortImpl failureOutPort = new FailureOutPortImpl();
		return failureOutPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailurePropagationLink createFaultFailurePropagationLink() {
		FaultFailurePropagationLinkImpl faultFailurePropagationLink = new FaultFailurePropagationLinkImpl();
		return faultFailurePropagationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultInPort createFaultInPort() {
		FaultInPortImpl faultInPort = new FaultInPortImpl();
		return faultInPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalFaultPrototype createInternalFaultPrototype() {
		InternalFaultPrototypeImpl internalFaultPrototype = new InternalFaultPrototypeImpl();
		return internalFaultPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessFaultPrototype createProcessFaultPrototype() {
		ProcessFaultPrototypeImpl processFaultPrototype = new ProcessFaultPrototypeImpl();
		return processFaultPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultInPortProxy createFaultInPortProxy() {
		FaultInPortProxyImpl faultInPortProxy = new FaultInPortProxyImpl();
		return faultInPortProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureOutPortProxy createFailureOutPortProxy() {
		FailureOutPortProxyImpl failureOutPortProxy = new FailureOutPortProxyImpl();
		return failureOutPortProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorBehaviorKind createErrorBehaviorKindFromString(EDataType eDataType, String initialValue) {
		ErrorBehaviorKind result = ErrorBehaviorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorBehaviorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrormodelPackage getErrormodelPackage() {
		return (ErrormodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ErrormodelPackage getPackage() {
		return ErrormodelPackage.eINSTANCE;
	}

} //ErrormodelFactoryImpl
