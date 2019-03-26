/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.*;

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
public class SystemmodelingFactoryImpl extends EFactoryImpl implements SystemmodelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemmodelingFactory init() {
		try {
			SystemmodelingFactory theSystemmodelingFactory = (SystemmodelingFactory)EPackage.Registry.INSTANCE.getEFactory(SystemmodelingPackage.eNS_URI);
			if (theSystemmodelingFactory != null) {
				return theSystemmodelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemmodelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemmodelingFactoryImpl() {
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
			case SystemmodelingPackage.VEHICLE_LEVEL: return createVehicleLevel();
			case SystemmodelingPackage.SYSTEM_MODEL: return createSystemModel();
			case SystemmodelingPackage.ANALYSIS_LEVEL: return createAnalysisLevel();
			case SystemmodelingPackage.DESIGN_LEVEL: return createDesignLevel();
			case SystemmodelingPackage.IMPLEMENTATION_LEVEL: return createImplementationLevel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleLevel createVehicleLevel() {
		VehicleLevelImpl vehicleLevel = new VehicleLevelImpl();
		return vehicleLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemModel createSystemModel() {
		SystemModelImpl systemModel = new SystemModelImpl();
		return systemModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisLevel createAnalysisLevel() {
		AnalysisLevelImpl analysisLevel = new AnalysisLevelImpl();
		return analysisLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLevel createDesignLevel() {
		DesignLevelImpl designLevel = new DesignLevelImpl();
		return designLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationLevel createImplementationLevel() {
		ImplementationLevelImpl implementationLevel = new ImplementationLevelImpl();
		return implementationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemmodelingPackage getSystemmodelingPackage() {
		return (SystemmodelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemmodelingPackage getPackage() {
		return SystemmodelingPackage.eINSTANCE;
	}

} //SystemmodelingFactoryImpl
