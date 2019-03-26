/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.impl;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.*;

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
public class FunctionmodelingFactoryImpl extends EFactoryImpl implements FunctionmodelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionmodelingFactory init() {
		try {
			FunctionmodelingFactory theFunctionmodelingFactory = (FunctionmodelingFactory)EPackage.Registry.INSTANCE.getEFactory(FunctionmodelingPackage.eNS_URI);
			if (theFunctionmodelingFactory != null) {
				return theFunctionmodelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FunctionmodelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionmodelingFactoryImpl() {
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
			case FunctionmodelingPackage.ALLOCATION: return createAllocation();
			case FunctionmodelingPackage.ANALYSIS_FUNCTION_PROTOTYPE: return createAnalysisFunctionPrototype();
			case FunctionmodelingPackage.ANALYSIS_FUNCTION_TYPE: return createAnalysisFunctionType();
			case FunctionmodelingPackage.BASIC_SOFTWARE_FUNCTION_TYPE: return createBasicSoftwareFunctionType();
			case FunctionmodelingPackage.DESIGN_FUNCTION_PROTOTYPE: return createDesignFunctionPrototype();
			case FunctionmodelingPackage.DESIGN_FUNCTION_TYPE: return createDesignFunctionType();
			case FunctionmodelingPackage.FUNCTIONAL_DEVICE: return createFunctionalDevice();
			case FunctionmodelingPackage.FUNCTION_ALLOCATION: return createFunctionAllocation();
			case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_INTERFACE: return createFunctionClientServerInterface();
			case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT: return createFunctionClientServerPort();
			case FunctionmodelingPackage.FUNCTION_CONNECTOR: return createFunctionConnector();
			case FunctionmodelingPackage.FUNCTION_FLOW_PORT: return createFunctionFlowPort();
			case FunctionmodelingPackage.FUNCTION_POWER_PORT: return createFunctionPowerPort();
			case FunctionmodelingPackage.HARDWARE_FUNCTION_TYPE: return createHardwareFunctionType();
			case FunctionmodelingPackage.LOCAL_DEVICE_MANAGER: return createLocalDeviceManager();
			case FunctionmodelingPackage.OPERATION: return createOperation();
			case FunctionmodelingPackage.PORT_GROUP: return createPortGroup();
			case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT_PROXY: return createFunctionClientServerPortProxy();
			case FunctionmodelingPackage.FUNCTION_FLOW_PORT_PROXY: return createFunctionFlowPortProxy();
			case FunctionmodelingPackage.FUNCTION_POWER_PORT_PROXY: return createFunctionPowerPortProxy();
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
			case FunctionmodelingPackage.CLIENT_SERVER_KIND:
				return createClientServerKindFromString(eDataType, initialValue);
			case FunctionmodelingPackage.EA_DIRECTION_KIND:
				return createEADirectionKindFromString(eDataType, initialValue);
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
			case FunctionmodelingPackage.CLIENT_SERVER_KIND:
				return convertClientServerKindToString(eDataType, instanceValue);
			case FunctionmodelingPackage.EA_DIRECTION_KIND:
				return convertEADirectionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation createAllocation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunctionPrototype createAnalysisFunctionPrototype() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunctionType createAnalysisFunctionType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSoftwareFunctionType createBasicSoftwareFunctionType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignFunctionPrototype createDesignFunctionPrototype() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignFunctionType createDesignFunctionType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDevice createFunctionalDevice() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionAllocation createFunctionAllocation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionClientServerInterface createFunctionClientServerInterface() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionClientServerPort createFunctionClientServerPort() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionConnector createFunctionConnector() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionFlowPort createFunctionFlowPort() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPowerPort createFunctionPowerPort() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareFunctionType createHardwareFunctionType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDeviceManager createLocalDeviceManager() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortGroup createPortGroup() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionClientServerPortProxy createFunctionClientServerPortProxy() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionFlowPortProxy createFunctionFlowPortProxy() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPowerPortProxy createFunctionPowerPortProxy() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerKind createClientServerKindFromString(EDataType eDataType, String initialValue) {
		ClientServerKind result = ClientServerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClientServerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADirectionKind createEADirectionKindFromString(EDataType eDataType, String initialValue) {
		EADirectionKind result = EADirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEADirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionmodelingPackage getFunctionmodelingPackage() {
		return (FunctionmodelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FunctionmodelingPackage getPackage() {
		return FunctionmodelingPackage.eINSTANCE;
	}

} //FunctionmodelingFactoryImpl
