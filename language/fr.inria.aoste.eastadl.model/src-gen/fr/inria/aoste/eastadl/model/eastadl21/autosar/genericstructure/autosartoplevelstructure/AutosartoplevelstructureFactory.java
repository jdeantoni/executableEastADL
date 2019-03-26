/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.autosartoplevelstructure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.autosartoplevelstructure.AutosartoplevelstructurePackage
 * @generated
 */
public interface AutosartoplevelstructureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AutosartoplevelstructureFactory eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.autosartoplevelstructure.impl.AutosartoplevelstructureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AUTOSAR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AUTOSAR</em>'.
	 * @generated
	 */
	AUTOSAR createAUTOSAR();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AutosartoplevelstructurePackage getAutosartoplevelstructurePackage();

} //AutosartoplevelstructureFactory
