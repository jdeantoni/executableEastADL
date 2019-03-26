/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.*;

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
public class VehiclefeaturemodelingFactoryImpl extends EFactoryImpl implements VehiclefeaturemodelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VehiclefeaturemodelingFactory init() {
		try {
			VehiclefeaturemodelingFactory theVehiclefeaturemodelingFactory = (VehiclefeaturemodelingFactory)EPackage.Registry.INSTANCE.getEFactory(VehiclefeaturemodelingPackage.eNS_URI);
			if (theVehiclefeaturemodelingFactory != null) {
				return theVehiclefeaturemodelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VehiclefeaturemodelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehiclefeaturemodelingFactoryImpl() {
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
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET: return createDeviationAttributeSet();
			case VehiclefeaturemodelingPackage.VEHICLE_FEATURE: return createVehicleFeature();
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
			case VehiclefeaturemodelingPackage.DEVIATION_PERMISSION_KIND:
				return createDeviationPermissionKindFromString(eDataType, initialValue);
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
			case VehiclefeaturemodelingPackage.DEVIATION_PERMISSION_KIND:
				return convertDeviationPermissionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationAttributeSet createDeviationAttributeSet() {
		DeviationAttributeSetImpl deviationAttributeSet = new DeviationAttributeSetImpl();
		return deviationAttributeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleFeature createVehicleFeature() {
		VehicleFeatureImpl vehicleFeature = new VehicleFeatureImpl();
		return vehicleFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationPermissionKind createDeviationPermissionKindFromString(EDataType eDataType, String initialValue) {
		DeviationPermissionKind result = DeviationPermissionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviationPermissionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehiclefeaturemodelingPackage getVehiclefeaturemodelingPackage() {
		return (VehiclefeaturemodelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VehiclefeaturemodelingPackage getPackage() {
		return VehiclefeaturemodelingPackage.eINSTANCE;
	}

} //VehiclefeaturemodelingFactoryImpl
