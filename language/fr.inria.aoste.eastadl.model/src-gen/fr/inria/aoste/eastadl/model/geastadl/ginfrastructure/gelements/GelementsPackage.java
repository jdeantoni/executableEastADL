/**
 */
package fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GelementsFactory
 * @model kind="package"
 * @generated
 */
public interface GelementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gelements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/geastadl/ginfrastructure/gelements";

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
	GelementsPackage eINSTANCE = fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable <em>GReferrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl#getGReferrable()
	 * @generated
	 */
	int GREFERRABLE = 4;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFERRABLE__GSHORT_NAME = 0;

	/**
	 * The number of structural features of the '<em>GReferrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFERRABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GReferrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFERRABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable <em>GIdentifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl#getGIdentifiable()
	 * @generated
	 */
	int GIDENTIFIABLE = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIDENTIFIABLE__GSHORT_NAME = GREFERRABLE__GSHORT_NAME;

	/**
	 * The number of structural features of the '<em>GIdentifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIDENTIFIABLE_FEATURE_COUNT = GREFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GIdentifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIDENTIFIABLE_OPERATION_COUNT = GREFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackage <em>GEA Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackage
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl#getGEAPackage()
	 * @generated
	 */
	int GEA_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEA_PACKAGE__GSHORT_NAME = GIDENTIFIABLE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>GElement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEA_PACKAGE__GELEMENT = GIDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>GSub Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEA_PACKAGE__GSUB_PACKAGE = GIDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GEA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEA_PACKAGE_FEATURE_COUNT = GIDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GEA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEA_PACKAGE_OPERATION_COUNT = GIDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAXML <em>GEAXML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAXML
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl#getGEAXML()
	 * @generated
	 */
	int GEAXML = 1;

	/**
	 * The feature id for the '<em><b>GTop Level Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEAXML__GTOP_LEVEL_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>GEAXML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEAXML_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GEAXML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEAXML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement <em>GEA Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl#getGEAPackageableElement()
	 * @generated
	 */
	int GEA_PACKAGEABLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEA_PACKAGEABLE_ELEMENT__GSHORT_NAME = GIDENTIFIABLE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT = GIDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GEA Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEA_PACKAGEABLE_ELEMENT_FEATURE_COUNT = GIDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GEA Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEA_PACKAGEABLE_ELEMENT_OPERATION_COUNT = GIDENTIFIABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackage <em>GEA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEA Package</em>'.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackage
	 * @generated
	 */
	EClass getGEAPackage();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackage#getGElement <em>GElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>GElement</em>'.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackage#getGElement()
	 * @see #getGEAPackage()
	 * @generated
	 */
	EReference getGEAPackage_GElement();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackage#getGSubPackage <em>GSub Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>GSub Package</em>'.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackage#getGSubPackage()
	 * @see #getGEAPackage()
	 * @generated
	 */
	EReference getGEAPackage_GSubPackage();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAXML <em>GEAXML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEAXML</em>'.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAXML
	 * @generated
	 */
	EClass getGEAXML();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAXML#getGTopLevelPackage <em>GTop Level Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>GTop Level Package</em>'.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAXML#getGTopLevelPackage()
	 * @see #getGEAXML()
	 * @generated
	 */
	EReference getGEAXML_GTopLevelPackage();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable <em>GIdentifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GIdentifiable</em>'.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable
	 * @generated
	 */
	EClass getGIdentifiable();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement <em>GEA Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEA Packageable Element</em>'.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement
	 * @generated
	 */
	EClass getGEAPackageableElement();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement#getGEAPackage_element <em>GEA Package element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>GEA Package element</em>'.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement#getGEAPackage_element()
	 * @see #getGEAPackageableElement()
	 * @generated
	 */
	EReference getGEAPackageableElement_GEAPackage_element();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable <em>GReferrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GReferrable</em>'.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable
	 * @generated
	 */
	EClass getGReferrable();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable#getGShortName <em>GShort Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GShort Name</em>'.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable#getGShortName()
	 * @see #getGReferrable()
	 * @generated
	 */
	EAttribute getGReferrable_GShortName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GelementsFactory getGelementsFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackage <em>GEA Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackage
		 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl#getGEAPackage()
		 * @generated
		 */
		EClass GEA_PACKAGE = eINSTANCE.getGEAPackage();

		/**
		 * The meta object literal for the '<em><b>GElement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEA_PACKAGE__GELEMENT = eINSTANCE.getGEAPackage_GElement();

		/**
		 * The meta object literal for the '<em><b>GSub Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEA_PACKAGE__GSUB_PACKAGE = eINSTANCE.getGEAPackage_GSubPackage();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAXML <em>GEAXML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAXML
		 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl#getGEAXML()
		 * @generated
		 */
		EClass GEAXML = eINSTANCE.getGEAXML();

		/**
		 * The meta object literal for the '<em><b>GTop Level Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEAXML__GTOP_LEVEL_PACKAGE = eINSTANCE.getGEAXML_GTopLevelPackage();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable <em>GIdentifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable
		 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl#getGIdentifiable()
		 * @generated
		 */
		EClass GIDENTIFIABLE = eINSTANCE.getGIdentifiable();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement <em>GEA Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement
		 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl#getGEAPackageableElement()
		 * @generated
		 */
		EClass GEA_PACKAGEABLE_ELEMENT = eINSTANCE.getGEAPackageableElement();

		/**
		 * The meta object literal for the '<em><b>GEA Package element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT = eINSTANCE.getGEAPackageableElement_GEAPackage_element();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable <em>GReferrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable
		 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl#getGReferrable()
		 * @generated
		 */
		EClass GREFERRABLE = eINSTANCE.getGReferrable();

		/**
		 * The meta object literal for the '<em><b>GShort Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREFERRABLE__GSHORT_NAME = eINSTANCE.getGReferrable_GShortName();

	}

} //GelementsPackage
