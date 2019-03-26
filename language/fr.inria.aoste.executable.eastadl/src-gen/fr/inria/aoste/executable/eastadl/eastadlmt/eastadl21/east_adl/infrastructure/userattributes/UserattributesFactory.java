/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage
 * @generated
 */
public interface UserattributesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserattributesFactory eINSTANCE = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.impl.UserattributesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User Attributeable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Attributeable Element</em>'.
	 * @generated
	 */
	UserAttributeableElement createUserAttributeableElement();

	/**
	 * Returns a new object of class '<em>User Attribute Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Attribute Definition</em>'.
	 * @generated
	 */
	UserAttributeDefinition createUserAttributeDefinition();

	/**
	 * Returns a new object of class '<em>User Attribute Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Attribute Element Type</em>'.
	 * @generated
	 */
	UserAttributeElementType createUserAttributeElementType();

	/**
	 * Returns a new object of class '<em>User Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Attribute Value</em>'.
	 * @generated
	 */
	UserAttributeValue createUserAttributeValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UserattributesPackage getUserattributesPackage();

} //UserattributesFactory
