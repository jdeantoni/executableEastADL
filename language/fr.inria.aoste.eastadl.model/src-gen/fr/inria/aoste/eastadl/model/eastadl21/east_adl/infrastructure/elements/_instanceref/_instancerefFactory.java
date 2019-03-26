/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefPackage
 * @generated
 */
public interface _instancerefFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_instancerefFactory eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl._instancerefFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Realization realized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realization realized</em>'.
	 * @generated
	 */
	Realization_realized createRealization_realized();

	/**
	 * Returns a new object of class '<em>Realization realized By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realization realized By</em>'.
	 * @generated
	 */
	Realization_realizedBy createRealization_realizedBy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	_instancerefPackage get_instancerefPackage();

} //_instancerefFactory
