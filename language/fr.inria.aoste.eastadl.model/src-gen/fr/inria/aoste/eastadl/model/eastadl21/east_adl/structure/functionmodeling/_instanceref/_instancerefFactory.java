/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage
 * @generated
 */
public interface _instancerefFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_instancerefFactory eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.impl._instancerefFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Function Allocation allocated Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Allocation allocated Element</em>'.
	 * @generated
	 */
	FunctionAllocation_allocatedElement createFunctionAllocation_allocatedElement();

	/**
	 * Returns a new object of class '<em>Function Allocation target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Allocation target</em>'.
	 * @generated
	 */
	FunctionAllocation_target createFunctionAllocation_target();

	/**
	 * Returns a new object of class '<em>Function Connector port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Connector port</em>'.
	 * @generated
	 */
	FunctionConnector_port createFunctionConnector_port();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	_instancerefPackage get_instancerefPackage();

} //_instancerefFactory