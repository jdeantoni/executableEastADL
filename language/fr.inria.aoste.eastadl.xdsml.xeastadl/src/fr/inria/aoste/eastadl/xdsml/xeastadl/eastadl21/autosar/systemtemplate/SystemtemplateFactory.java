/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.systemtemplate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.systemtemplate.SystemtemplatePackage
 * @generated
 */
public interface SystemtemplateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemtemplateFactory eINSTANCE = fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.systemtemplate.impl.SystemtemplateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemtemplatePackage getSystemtemplatePackage();

} //SystemtemplateFactory
