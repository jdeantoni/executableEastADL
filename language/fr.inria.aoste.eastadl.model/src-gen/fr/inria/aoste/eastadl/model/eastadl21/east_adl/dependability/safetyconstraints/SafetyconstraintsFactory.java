/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage
 * @generated
 */
public interface SafetyconstraintsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SafetyconstraintsFactory eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyconstraintsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fault Failure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Failure</em>'.
	 * @generated
	 */
	FaultFailure createFaultFailure();

	/**
	 * Returns a new object of class '<em>Quantitative Safety Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantitative Safety Constraint</em>'.
	 * @generated
	 */
	QuantitativeSafetyConstraint createQuantitativeSafetyConstraint();

	/**
	 * Returns a new object of class '<em>Safety Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Constraint</em>'.
	 * @generated
	 */
	SafetyConstraint createSafetyConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SafetyconstraintsPackage getSafetyconstraintsPackage();

} //SafetyconstraintsFactory
