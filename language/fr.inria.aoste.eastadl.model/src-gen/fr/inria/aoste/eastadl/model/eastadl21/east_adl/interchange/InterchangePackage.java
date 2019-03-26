/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.InterchangeFactory
 * @model kind="package"
 * @generated
 */
public interface InterchangePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interchange";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/east_adl/interchange";

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
	InterchangePackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.InterchangePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.RIFAreaImpl <em>RIF Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.RIFAreaImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.InterchangePackageImpl#getRIFArea()
	 * @generated
	 */
	int RIF_AREA = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA__GSHORT_NAME = ElementsPackage.CONTEXT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA__SHORT_NAME = ElementsPackage.CONTEXT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA__CATEGORY = ElementsPackage.CONTEXT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA__UUID = ElementsPackage.CONTEXT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA__NAME = ElementsPackage.CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA__OWNED_COMMENT = ElementsPackage.CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA__GEA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA__EA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA__TRACEABLE_SPECIFICATION = ElementsPackage.CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA__OWNED_RELATIONSHIP = ElementsPackage.CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Interchange Req Spec Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT = ElementsPackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Requirement Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA__ROOT_REQUIREMENT_CONTAINER = ElementsPackage.CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Defined Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA__USER_DEFINED_TYPE = ElementsPackage.CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RIF Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA_FEATURE_COUNT = ElementsPackage.CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>RIF Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_AREA_OPERATION_COUNT = ElementsPackage.CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.RIFExportAreaImpl <em>RIF Export Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.RIFExportAreaImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.InterchangePackageImpl#getRIFExportArea()
	 * @generated
	 */
	int RIF_EXPORT_AREA = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA__GSHORT_NAME = RIF_AREA__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA__SHORT_NAME = RIF_AREA__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA__CATEGORY = RIF_AREA__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA__UUID = RIF_AREA__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA__NAME = RIF_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA__OWNED_COMMENT = RIF_AREA__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA__GEA_PACKAGE_ELEMENT = RIF_AREA__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA__EA_PACKAGE_ELEMENT = RIF_AREA__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA__TRACEABLE_SPECIFICATION = RIF_AREA__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA__OWNED_RELATIONSHIP = RIF_AREA__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Interchange Req Spec Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA__INTERCHANGE_REQ_SPEC_OBJECT = RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT;

	/**
	 * The feature id for the '<em><b>Root Requirement Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA__ROOT_REQUIREMENT_CONTAINER = RIF_AREA__ROOT_REQUIREMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>User Defined Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA__USER_DEFINED_TYPE = RIF_AREA__USER_DEFINED_TYPE;

	/**
	 * The number of structural features of the '<em>RIF Export Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA_FEATURE_COUNT = RIF_AREA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RIF Export Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_EXPORT_AREA_OPERATION_COUNT = RIF_AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.RIFImportAreaImpl <em>RIF Import Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.RIFImportAreaImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.InterchangePackageImpl#getRIFImportArea()
	 * @generated
	 */
	int RIF_IMPORT_AREA = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA__GSHORT_NAME = RIF_AREA__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA__SHORT_NAME = RIF_AREA__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA__CATEGORY = RIF_AREA__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA__UUID = RIF_AREA__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA__NAME = RIF_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA__OWNED_COMMENT = RIF_AREA__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA__GEA_PACKAGE_ELEMENT = RIF_AREA__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA__EA_PACKAGE_ELEMENT = RIF_AREA__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA__TRACEABLE_SPECIFICATION = RIF_AREA__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA__OWNED_RELATIONSHIP = RIF_AREA__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Interchange Req Spec Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA__INTERCHANGE_REQ_SPEC_OBJECT = RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT;

	/**
	 * The feature id for the '<em><b>Root Requirement Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA__ROOT_REQUIREMENT_CONTAINER = RIF_AREA__ROOT_REQUIREMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>User Defined Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA__USER_DEFINED_TYPE = RIF_AREA__USER_DEFINED_TYPE;

	/**
	 * The number of structural features of the '<em>RIF Import Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA_FEATURE_COUNT = RIF_AREA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RIF Import Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_IMPORT_AREA_OPERATION_COUNT = RIF_AREA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFArea <em>RIF Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RIF Area</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFArea
	 * @generated
	 */
	EClass getRIFArea();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFArea#getInterchangeReqSpecObject <em>Interchange Req Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interchange Req Spec Object</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFArea#getInterchangeReqSpecObject()
	 * @see #getRIFArea()
	 * @generated
	 */
	EReference getRIFArea_InterchangeReqSpecObject();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFArea#getRootRequirementContainer <em>Root Requirement Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Requirement Container</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFArea#getRootRequirementContainer()
	 * @see #getRIFArea()
	 * @generated
	 */
	EReference getRIFArea_RootRequirementContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFArea#getUserDefinedType <em>User Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Defined Type</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFArea#getUserDefinedType()
	 * @see #getRIFArea()
	 * @generated
	 */
	EReference getRIFArea_UserDefinedType();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFExportArea <em>RIF Export Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RIF Export Area</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFExportArea
	 * @generated
	 */
	EClass getRIFExportArea();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFImportArea <em>RIF Import Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RIF Import Area</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.RIFImportArea
	 * @generated
	 */
	EClass getRIFImportArea();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterchangeFactory getInterchangeFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.RIFAreaImpl <em>RIF Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.RIFAreaImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.InterchangePackageImpl#getRIFArea()
		 * @generated
		 */
		EClass RIF_AREA = eINSTANCE.getRIFArea();

		/**
		 * The meta object literal for the '<em><b>Interchange Req Spec Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT = eINSTANCE.getRIFArea_InterchangeReqSpecObject();

		/**
		 * The meta object literal for the '<em><b>Root Requirement Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF_AREA__ROOT_REQUIREMENT_CONTAINER = eINSTANCE.getRIFArea_RootRequirementContainer();

		/**
		 * The meta object literal for the '<em><b>User Defined Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF_AREA__USER_DEFINED_TYPE = eINSTANCE.getRIFArea_UserDefinedType();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.RIFExportAreaImpl <em>RIF Export Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.RIFExportAreaImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.InterchangePackageImpl#getRIFExportArea()
		 * @generated
		 */
		EClass RIF_EXPORT_AREA = eINSTANCE.getRIFExportArea();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.RIFImportAreaImpl <em>RIF Import Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.RIFImportAreaImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.InterchangePackageImpl#getRIFImportArea()
		 * @generated
		 */
		EClass RIF_IMPORT_AREA = eINSTANCE.getRIFImportArea();

	}

} //InterchangePackage
