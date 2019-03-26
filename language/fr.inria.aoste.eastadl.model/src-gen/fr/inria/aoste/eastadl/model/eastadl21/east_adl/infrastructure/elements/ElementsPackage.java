/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GelementsPackage;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsFactory
 * @model kind="package"
 * @generated
 */
public interface ElementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "elements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/east_adl/infrastructure/elements";

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
	ElementsPackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.CommentImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl <em>EA Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getEAElement()
	 * @generated
	 */
	int EA_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__GSHORT_NAME = IdentifiablePackage.IDENTIFIABLE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__SHORT_NAME = IdentifiablePackage.IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__CATEGORY = IdentifiablePackage.IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__UUID = IdentifiablePackage.IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__NAME = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__OWNED_COMMENT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT_FEATURE_COUNT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT_OPERATION_COUNT = IdentifiablePackage.IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAPackageableElementImpl <em>EA Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAPackageableElementImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getEAPackageableElement()
	 * @generated
	 */
	int EA_PACKAGEABLE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EA Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EA Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT_OPERATION_COUNT = EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__GSHORT_NAME = EA_PACKAGEABLE_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__SHORT_NAME = EA_PACKAGEABLE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CATEGORY = EA_PACKAGEABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__UUID = EA_PACKAGEABLE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__OWNED_COMMENT = EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__GEA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__EA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TRACEABLE_SPECIFICATION = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__OWNED_RELATIONSHIP = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = EA_PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAPackageImpl <em>EA Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAPackageImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getEAPackage()
	 * @generated
	 */
	int EA_PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GElement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__GELEMENT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>GSub Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__GSUB_PACKAGE = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__SUB_PACKAGE = EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__ELEMENT = EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>EA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE_OPERATION_COUNT = EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAXMLImpl <em>EAXML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAXMLImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getEAXML()
	 * @generated
	 */
	int EAXML = 5;

	/**
	 * The feature id for the '<em><b>GTop Level Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXML__GTOP_LEVEL_PACKAGE = GelementsPackage.GEAXML__GTOP_LEVEL_PACKAGE;

	/**
	 * The feature id for the '<em><b>Top Level Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXML__TOP_LEVEL_PACKAGE = GelementsPackage.GEAXML_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EAXML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXML_FEATURE_COUNT = GelementsPackage.GEAXML_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EAXML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXML_OPERATION_COUNT = GelementsPackage.GEAXML_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.RelationshipImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 9;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.MultiLevelReferenceImpl <em>Multi Level Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.MultiLevelReferenceImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getMultiLevelReference()
	 * @generated
	 */
	int MULTI_LEVEL_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEVEL_REFERENCE__GSHORT_NAME = RELATIONSHIP__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEVEL_REFERENCE__SHORT_NAME = RELATIONSHIP__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEVEL_REFERENCE__CATEGORY = RELATIONSHIP__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEVEL_REFERENCE__UUID = RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEVEL_REFERENCE__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEVEL_REFERENCE__OWNED_COMMENT = RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEVEL_REFERENCE__REFERENCE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referring</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEVEL_REFERENCE__REFERRING = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Level Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEVEL_REFERENCE_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multi Level Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LEVEL_REFERENCE_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.RationaleImpl <em>Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.RationaleImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getRationale()
	 * @generated
	 */
	int RATIONALE = 7;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__BODY = COMMENT__BODY;

	/**
	 * The number of structural features of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.RealizationImpl <em>Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.RealizationImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getRealization()
	 * @generated
	 */
	int REALIZATION = 8;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__GSHORT_NAME = RELATIONSHIP__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__SHORT_NAME = RELATIONSHIP__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__CATEGORY = RELATIONSHIP__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__UUID = RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__OWNED_COMMENT = RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Realized</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__REALIZED = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__REALIZED_BY = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl <em>Traceable Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getTraceableSpecification()
	 * @generated
	 */
	int TRACEABLE_SPECIFICATION = 10;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__GSHORT_NAME = EA_PACKAGEABLE_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__SHORT_NAME = EA_PACKAGEABLE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__CATEGORY = EA_PACKAGEABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__UUID = EA_PACKAGEABLE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__NAME = EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__OWNED_COMMENT = EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__TEXT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traceable Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION_FEATURE_COUNT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traceable Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION_OPERATION_COUNT = EA_PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context#getTraceableSpecification <em>Traceable Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traceable Specification</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context#getTraceableSpecification()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_TraceableSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context#getOwnedRelationship <em>Owned Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Relationship</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context#getOwnedRelationship()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_OwnedRelationship();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement <em>EA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Element</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement
	 * @generated
	 */
	EClass getEAElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement#getName()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Comment</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement#getOwnedComment()
	 * @see #getEAElement()
	 * @generated
	 */
	EReference getEAElement_OwnedComment();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackage <em>EA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Package</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackage
	 * @generated
	 */
	EClass getEAPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackage#getSubPackage <em>Sub Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Package</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackage#getSubPackage()
	 * @see #getEAPackage()
	 * @generated
	 */
	EReference getEAPackage_SubPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackage#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackage#getElement()
	 * @see #getEAPackage()
	 * @generated
	 */
	EReference getEAPackage_Element();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement <em>EA Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Packageable Element</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement
	 * @generated
	 */
	EClass getEAPackageableElement();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement#getEAPackage_element <em>EA Package element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EA Package element</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement#getEAPackage_element()
	 * @see #getEAPackageableElement()
	 * @generated
	 */
	EReference getEAPackageableElement_EAPackage_element();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAXML <em>EAXML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAXML</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAXML
	 * @generated
	 */
	EClass getEAXML();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAXML#getTopLevelPackage <em>Top Level Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Top Level Package</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAXML#getTopLevelPackage()
	 * @see #getEAXML()
	 * @generated
	 */
	EReference getEAXML_TopLevelPackage();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.MultiLevelReference <em>Multi Level Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Level Reference</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.MultiLevelReference
	 * @generated
	 */
	EClass getMultiLevelReference();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.MultiLevelReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.MultiLevelReference#getReference()
	 * @see #getMultiLevelReference()
	 * @generated
	 */
	EReference getMultiLevelReference_Reference();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.MultiLevelReference#getReferring <em>Referring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referring</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.MultiLevelReference#getReferring()
	 * @see #getMultiLevelReference()
	 * @generated
	 */
	EReference getMultiLevelReference_Referring();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rationale</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Rationale
	 * @generated
	 */
	EClass getRationale();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Realization
	 * @generated
	 */
	EClass getRealization();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Realization#getRealized <em>Realized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realized</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Realization#getRealized()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_Realized();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Realization#getRealizedBy <em>Realized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realized By</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Realization#getRealizedBy()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_RealizedBy();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification <em>Traceable Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceable Specification</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification
	 * @generated
	 */
	EClass getTraceableSpecification();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification#getText()
	 * @see #getTraceableSpecification()
	 * @generated
	 */
	EAttribute getTraceableSpecification_Text();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ElementsFactory getElementsFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.CommentImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Traceable Specification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__TRACEABLE_SPECIFICATION = eINSTANCE.getContext_TraceableSpecification();

		/**
		 * The meta object literal for the '<em><b>Owned Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__OWNED_RELATIONSHIP = eINSTANCE.getContext_OwnedRelationship();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl <em>EA Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getEAElement()
		 * @generated
		 */
		EClass EA_ELEMENT = eINSTANCE.getEAElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__NAME = eINSTANCE.getEAElement_Name();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ELEMENT__OWNED_COMMENT = eINSTANCE.getEAElement_OwnedComment();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAPackageImpl <em>EA Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAPackageImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getEAPackage()
		 * @generated
		 */
		EClass EA_PACKAGE = eINSTANCE.getEAPackage();

		/**
		 * The meta object literal for the '<em><b>Sub Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PACKAGE__SUB_PACKAGE = eINSTANCE.getEAPackage_SubPackage();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PACKAGE__ELEMENT = eINSTANCE.getEAPackage_Element();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAPackageableElementImpl <em>EA Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAPackageableElementImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getEAPackageableElement()
		 * @generated
		 */
		EClass EA_PACKAGEABLE_ELEMENT = eINSTANCE.getEAPackageableElement();

		/**
		 * The meta object literal for the '<em><b>EA Package element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT = eINSTANCE.getEAPackageableElement_EAPackage_element();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAXMLImpl <em>EAXML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAXMLImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getEAXML()
		 * @generated
		 */
		EClass EAXML = eINSTANCE.getEAXML();

		/**
		 * The meta object literal for the '<em><b>Top Level Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EAXML__TOP_LEVEL_PACKAGE = eINSTANCE.getEAXML_TopLevelPackage();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.MultiLevelReferenceImpl <em>Multi Level Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.MultiLevelReferenceImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getMultiLevelReference()
		 * @generated
		 */
		EClass MULTI_LEVEL_REFERENCE = eINSTANCE.getMultiLevelReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_LEVEL_REFERENCE__REFERENCE = eINSTANCE.getMultiLevelReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Referring</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_LEVEL_REFERENCE__REFERRING = eINSTANCE.getMultiLevelReference_Referring();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.RationaleImpl <em>Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.RationaleImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getRationale()
		 * @generated
		 */
		EClass RATIONALE = eINSTANCE.getRationale();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.RealizationImpl <em>Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.RealizationImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getRealization()
		 * @generated
		 */
		EClass REALIZATION = eINSTANCE.getRealization();

		/**
		 * The meta object literal for the '<em><b>Realized</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION__REALIZED = eINSTANCE.getRealization_Realized();

		/**
		 * The meta object literal for the '<em><b>Realized By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION__REALIZED_BY = eINSTANCE.getRealization_RealizedBy();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.RelationshipImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl <em>Traceable Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl#getTraceableSpecification()
		 * @generated
		 */
		EClass TRACEABLE_SPECIFICATION = eINSTANCE.getTraceableSpecification();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABLE_SPECIFICATION__TEXT = eINSTANCE.getTraceableSpecification_Text();

	}

} //ElementsPackage
