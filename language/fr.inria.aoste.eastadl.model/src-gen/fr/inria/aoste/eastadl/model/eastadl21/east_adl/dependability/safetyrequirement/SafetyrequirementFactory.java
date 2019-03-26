/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage
 * @generated
 */
public interface SafetyrequirementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SafetyrequirementFactory eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.impl.SafetyrequirementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Functional Safety Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Safety Concept</em>'.
	 * @generated
	 */
	FunctionalSafetyConcept createFunctionalSafetyConcept();

	/**
	 * Returns a new object of class '<em>Safety Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Goal</em>'.
	 * @generated
	 */
	SafetyGoal createSafetyGoal();

	/**
	 * Returns a new object of class '<em>Technical Safety Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Technical Safety Concept</em>'.
	 * @generated
	 */
	TechnicalSafetyConcept createTechnicalSafetyConcept();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SafetyrequirementPackage getSafetyrequirementPackage();

} //SafetyrequirementFactory
