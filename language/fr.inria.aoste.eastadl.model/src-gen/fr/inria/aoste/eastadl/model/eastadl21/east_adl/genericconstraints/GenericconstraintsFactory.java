/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage
 * @generated
 */
public interface GenericconstraintsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericconstraintsFactory eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.impl.GenericconstraintsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Generic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Constraint</em>'.
	 * @generated
	 */
	GenericConstraint createGenericConstraint();

	/**
	 * Returns a new object of class '<em>Generic Constraint Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Constraint Set</em>'.
	 * @generated
	 */
	GenericConstraintSet createGenericConstraintSet();

	/**
	 * Returns a new object of class '<em>Take Rate Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Take Rate Constraint</em>'.
	 * @generated
	 */
	TakeRateConstraint createTakeRateConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenericconstraintsPackage getGenericconstraintsPackage();

} //GenericconstraintsFactory
