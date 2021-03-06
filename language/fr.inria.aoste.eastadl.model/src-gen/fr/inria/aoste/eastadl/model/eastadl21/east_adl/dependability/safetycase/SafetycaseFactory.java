/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycasePackage
 * @generated
 */
public interface SafetycaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SafetycaseFactory eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.impl.SafetycaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim</em>'.
	 * @generated
	 */
	Claim createClaim();

	/**
	 * Returns a new object of class '<em>Ground</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground</em>'.
	 * @generated
	 */
	Ground createGround();

	/**
	 * Returns a new object of class '<em>Safety Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Case</em>'.
	 * @generated
	 */
	SafetyCase createSafetyCase();

	/**
	 * Returns a new object of class '<em>Warrant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warrant</em>'.
	 * @generated
	 */
	Warrant createWarrant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SafetycasePackage getSafetycasePackage();

} //SafetycaseFactory
