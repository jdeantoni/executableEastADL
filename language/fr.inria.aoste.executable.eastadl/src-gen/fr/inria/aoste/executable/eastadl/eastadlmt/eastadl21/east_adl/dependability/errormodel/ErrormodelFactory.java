/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage
 * @generated
 */
public interface ErrormodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErrormodelFactory eINSTANCE = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Error Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Behavior</em>'.
	 * @generated
	 */
	ErrorBehavior createErrorBehavior();

	/**
	 * Returns a new object of class '<em>Error Model Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Model Prototype</em>'.
	 * @generated
	 */
	ErrorModelPrototype createErrorModelPrototype();

	/**
	 * Returns a new object of class '<em>Error Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Model Type</em>'.
	 * @generated
	 */
	ErrorModelType createErrorModelType();

	/**
	 * Returns a new object of class '<em>Failure Out Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Out Port</em>'.
	 * @generated
	 */
	FailureOutPort createFailureOutPort();

	/**
	 * Returns a new object of class '<em>Fault Failure Propagation Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Failure Propagation Link</em>'.
	 * @generated
	 */
	FaultFailurePropagationLink createFaultFailurePropagationLink();

	/**
	 * Returns a new object of class '<em>Fault In Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault In Port</em>'.
	 * @generated
	 */
	FaultInPort createFaultInPort();

	/**
	 * Returns a new object of class '<em>Internal Fault Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Fault Prototype</em>'.
	 * @generated
	 */
	InternalFaultPrototype createInternalFaultPrototype();

	/**
	 * Returns a new object of class '<em>Process Fault Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Fault Prototype</em>'.
	 * @generated
	 */
	ProcessFaultPrototype createProcessFaultPrototype();

	/**
	 * Returns a new object of class '<em>Fault In Port Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault In Port Proxy</em>'.
	 * @generated
	 */
	FaultInPortProxy createFaultInPortProxy();

	/**
	 * Returns a new object of class '<em>Failure Out Port Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Out Port Proxy</em>'.
	 * @generated
	 */
	FailureOutPortProxy createFailureOutPortProxy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ErrormodelPackage getErrormodelPackage();

} //ErrormodelFactory
