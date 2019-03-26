/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage
 * @generated
 */
public interface SystemmodelingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemmodelingFactory eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.impl.SystemmodelingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vehicle Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Level</em>'.
	 * @generated
	 */
	VehicleLevel createVehicleLevel();

	/**
	 * Returns a new object of class '<em>System Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Model</em>'.
	 * @generated
	 */
	SystemModel createSystemModel();

	/**
	 * Returns a new object of class '<em>Analysis Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Level</em>'.
	 * @generated
	 */
	AnalysisLevel createAnalysisLevel();

	/**
	 * Returns a new object of class '<em>Design Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design Level</em>'.
	 * @generated
	 */
	DesignLevel createDesignLevel();

	/**
	 * Returns a new object of class '<em>Implementation Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Level</em>'.
	 * @generated
	 */
	ImplementationLevel createImplementationLevel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemmodelingPackage getSystemmodelingPackage();

} //SystemmodelingFactory
