/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage
 * @generated
 */
public interface VehiclefeaturemodelingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VehiclefeaturemodelingFactory eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehiclefeaturemodelingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Deviation Attribute Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deviation Attribute Set</em>'.
	 * @generated
	 */
	DeviationAttributeSet createDeviationAttributeSet();

	/**
	 * Returns a new object of class '<em>Vehicle Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Feature</em>'.
	 * @generated
	 */
	VehicleFeature createVehicleFeature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VehiclefeaturemodelingPackage getVehiclefeaturemodelingPackage();

} //VehiclefeaturemodelingFactory
