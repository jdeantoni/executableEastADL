/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DependabilityPackage
 * @generated
 */
public interface DependabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependabilityFactory eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.impl.DependabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dependability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependability</em>'.
	 * @generated
	 */
	Dependability createDependability();

	/**
	 * Returns a new object of class '<em>Feature Flaw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Flaw</em>'.
	 * @generated
	 */
	FeatureFlaw createFeatureFlaw();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard</em>'.
	 * @generated
	 */
	Hazard createHazard();

	/**
	 * Returns a new object of class '<em>Hazardous Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazardous Event</em>'.
	 * @generated
	 */
	HazardousEvent createHazardousEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DependabilityPackage getDependabilityPackage();

} //DependabilityFactory
