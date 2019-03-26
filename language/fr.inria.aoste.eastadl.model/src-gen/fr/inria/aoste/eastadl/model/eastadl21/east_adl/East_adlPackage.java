/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.East_adlFactory
 * @model kind="package"
 * @generated
 */
public interface East_adlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "east_adl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/east_adl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	East_adlPackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.impl.East_adlPackageImpl.init();

	/**
	 * The meta object id for the '<em>trick EMF</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.impl.East_adlPackageImpl#gettrickEMF()
	 * @generated
	 */
	int TRICK_EMF = 0;


	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>trick EMF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>trick EMF</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType gettrickEMF();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	East_adlFactory getEast_adlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '<em>trick EMF</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.impl.East_adlPackageImpl#gettrickEMF()
		 * @generated
		 */
		EDataType TRICK_EMF = eINSTANCE.gettrickEMF();

	}

} //East_adlPackage
