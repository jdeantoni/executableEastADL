/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsPackage
 * @generated
 */
public interface RequirementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsFactory eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl.RequirementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Derive Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derive Requirement</em>'.
	 * @generated
	 */
	DeriveRequirement createDeriveRequirement();

	/**
	 * Returns a new object of class '<em>Operational Situation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Situation</em>'.
	 * @generated
	 */
	OperationalSituation createOperationalSituation();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	RequirementsModel createRequirementsModel();

	/**
	 * Returns a new object of class '<em>Related Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Information</em>'.
	 * @generated
	 */
	RequirementsRelatedInformation createRequirementsRelatedInformation();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	RequirementsContainer createRequirementsContainer();

	/**
	 * Returns a new object of class '<em>Refine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refine</em>'.
	 * @generated
	 */
	Refine createRefine();

	/**
	 * Returns a new object of class '<em>Satisfy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satisfy</em>'.
	 * @generated
	 */
	Satisfy createSatisfy();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	RequirementsLink createRequirementsLink();

	/**
	 * Returns a new object of class '<em>Relation Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Group</em>'.
	 * @generated
	 */
	RequirementsRelationGroup createRequirementsRelationGroup();

	/**
	 * Returns a new object of class '<em>Quality Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Requirement</em>'.
	 * @generated
	 */
	QualityRequirement createQualityRequirement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RequirementsPackage getRequirementsPackage();

} //RequirementsFactory
