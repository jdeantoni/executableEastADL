/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage
 * @generated
 */
public interface _instancerefFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_instancerefFactory eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl._instancerefFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Error Model Prototype function Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Model Prototype function Target</em>'.
	 * @generated
	 */
	ErrorModelPrototype_functionTarget createErrorModelPrototype_functionTarget();

	/**
	 * Returns a new object of class '<em>Error Model Prototype hw Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Model Prototype hw Target</em>'.
	 * @generated
	 */
	ErrorModelPrototype_hwTarget createErrorModelPrototype_hwTarget();

	/**
	 * Returns a new object of class '<em>Fault Failure Port function Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Failure Port function Target</em>'.
	 * @generated
	 */
	FaultFailurePort_functionTarget createFaultFailurePort_functionTarget();

	/**
	 * Returns a new object of class '<em>Fault Failure Port hw Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Failure Port hw Target</em>'.
	 * @generated
	 */
	FaultFailurePort_hwTarget createFaultFailurePort_hwTarget();

	/**
	 * Returns a new object of class '<em>Fault Failure Propagation Link from Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Failure Propagation Link from Port</em>'.
	 * @generated
	 */
	FaultFailurePropagationLink_fromPort createFaultFailurePropagationLink_fromPort();

	/**
	 * Returns a new object of class '<em>Fault Failure Propagation Link to Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Failure Propagation Link to Port</em>'.
	 * @generated
	 */
	FaultFailurePropagationLink_toPort createFaultFailurePropagationLink_toPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	_instancerefPackage get_instancerefPackage();

} //_instancerefFactory
