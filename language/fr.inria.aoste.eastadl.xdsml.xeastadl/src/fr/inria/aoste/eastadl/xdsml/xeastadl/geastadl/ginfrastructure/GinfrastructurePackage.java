/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.GinfrastructureFactory
 * @model kind="package"
 * @generated
 */
public interface GinfrastructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ginfrastructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.aoste.eastadl.xdsml.xeastadl/geastadl/ginfrastructure/";

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
	GinfrastructurePackage eINSTANCE = fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.impl.GinfrastructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.impl.trickEMFgeneratorImpl <em>trick EM Fgenerator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.impl.trickEMFgeneratorImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.impl.GinfrastructurePackageImpl#gettrickEMFgenerator()
	 * @generated
	 */
	int TRICK_EM_FGENERATOR = 0;

	/**
	 * The number of structural features of the '<em>trick EM Fgenerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRICK_EM_FGENERATOR_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.trickEMFgenerator <em>trick EM Fgenerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>trick EM Fgenerator</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.trickEMFgenerator
	 * @generated
	 */
	EClass gettrickEMFgenerator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GinfrastructureFactory getGinfrastructureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.impl.trickEMFgeneratorImpl <em>trick EM Fgenerator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.impl.trickEMFgeneratorImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.impl.GinfrastructurePackageImpl#gettrickEMFgenerator()
		 * @generated
		 */
		EClass TRICK_EM_FGENERATOR = eINSTANCE.gettrickEMFgenerator();

	}

} //GinfrastructurePackage
