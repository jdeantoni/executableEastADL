/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage
 * @generated
 */
public interface NeedsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NeedsFactory eINSTANCE = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.impl.NeedsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Architectural Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architectural Description</em>'.
	 * @generated
	 */
	ArchitecturalDescription createArchitecturalDescription();

	/**
	 * Returns a new object of class '<em>Architectural Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architectural Model</em>'.
	 * @generated
	 */
	ArchitecturalModel createArchitecturalModel();

	/**
	 * Returns a new object of class '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture</em>'.
	 * @generated
	 */
	Architecture createArchitecture();

	/**
	 * Returns a new object of class '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission</em>'.
	 * @generated
	 */
	Mission createMission();

	/**
	 * Returns a new object of class '<em>Vehicle System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle System</em>'.
	 * @generated
	 */
	VehicleSystem createVehicleSystem();

	/**
	 * Returns a new object of class '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stakeholder</em>'.
	 * @generated
	 */
	Stakeholder createStakeholder();

	/**
	 * Returns a new object of class '<em>Stakeholder Need</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stakeholder Need</em>'.
	 * @generated
	 */
	StakeholderNeed createStakeholderNeed();

	/**
	 * Returns a new object of class '<em>Business Opportunity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Opportunity</em>'.
	 * @generated
	 */
	BusinessOpportunity createBusinessOpportunity();

	/**
	 * Returns a new object of class '<em>Problem Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Statement</em>'.
	 * @generated
	 */
	ProblemStatement createProblemStatement();

	/**
	 * Returns a new object of class '<em>Product Positioning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Positioning</em>'.
	 * @generated
	 */
	ProductPositioning createProductPositioning();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NeedsPackage getNeedsPackage();

} //NeedsFactory
