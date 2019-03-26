/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsFactory
 * @model kind="package"
 * @generated
 */
public interface RequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.aoste.executable.eastadl.eastadlmt/eastadl21/east_adl/requirements/";

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
	RequirementsPackage eINSTANCE = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsRelationshipImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementsRelationship()
	 * @generated
	 */
	int REQUIREMENTS_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP__GSHORT_NAME = ElementsPackage.RELATIONSHIP__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP__SHORT_NAME = ElementsPackage.RELATIONSHIP__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP__CATEGORY = ElementsPackage.RELATIONSHIP__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP__UUID = ElementsPackage.RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP__NAME = ElementsPackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP__OWNED_COMMENT = ElementsPackage.RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.DeriveRequirementImpl <em>Derive Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.DeriveRequirementImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getDeriveRequirement()
	 * @generated
	 */
	int DERIVE_REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__GSHORT_NAME = REQUIREMENTS_RELATIONSHIP__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__SHORT_NAME = REQUIREMENTS_RELATIONSHIP__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__CATEGORY = REQUIREMENTS_RELATIONSHIP__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__UUID = REQUIREMENTS_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__NAME = REQUIREMENTS_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__OWNED_COMMENT = REQUIREMENTS_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__DERIVED = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT__DERIVED_FROM = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Derive Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVE_REQUIREMENT_FEATURE_COUNT = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.OperationalSituationImpl <em>Operational Situation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.OperationalSituationImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getOperationalSituation()
	 * @generated
	 */
	int OPERATIONAL_SITUATION = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The number of structural features of the '<em>Operational Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_SITUATION_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementSpecificationObjectImpl <em>Requirement Specification Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementSpecificationObjectImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementSpecificationObject()
	 * @generated
	 */
	int REQUIREMENT_SPECIFICATION_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SPECIFICATION_OBJECT__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SPECIFICATION_OBJECT__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SPECIFICATION_OBJECT__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SPECIFICATION_OBJECT__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SPECIFICATION_OBJECT__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SPECIFICATION_OBJECT__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SPECIFICATION_OBJECT__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SPECIFICATION_OBJECT__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SPECIFICATION_OBJECT__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The number of structural features of the '<em>Requirement Specification Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SPECIFICATION_OBJECT_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsModelImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementsModel()
	 * @generated
	 */
	int REQUIREMENTS_MODEL = 3;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__GSHORT_NAME = ElementsPackage.CONTEXT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__SHORT_NAME = ElementsPackage.CONTEXT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__CATEGORY = ElementsPackage.CONTEXT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__UUID = ElementsPackage.CONTEXT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__NAME = ElementsPackage.CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__OWNED_COMMENT = ElementsPackage.CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__GEA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__EA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__TRACEABLE_SPECIFICATION = ElementsPackage.CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__OWNED_RELATIONSHIP = ElementsPackage.CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Operational Situation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__OPERATIONAL_SITUATION = ElementsPackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__REQUIREMENT = ElementsPackage.CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirement Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__REQUIREMENT_CONTAINER = ElementsPackage.CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__USE_CASE = ElementsPackage.CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL_FEATURE_COUNT = ElementsPackage.CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsRelatedInformationImpl <em>Related Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsRelatedInformationImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementsRelatedInformation()
	 * @generated
	 */
	int REQUIREMENTS_RELATED_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATED_INFORMATION__GSHORT_NAME = REQUIREMENT_SPECIFICATION_OBJECT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATED_INFORMATION__SHORT_NAME = REQUIREMENT_SPECIFICATION_OBJECT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATED_INFORMATION__CATEGORY = REQUIREMENT_SPECIFICATION_OBJECT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATED_INFORMATION__UUID = REQUIREMENT_SPECIFICATION_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATED_INFORMATION__NAME = REQUIREMENT_SPECIFICATION_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATED_INFORMATION__OWNED_COMMENT = REQUIREMENT_SPECIFICATION_OBJECT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATED_INFORMATION__GEA_PACKAGE_ELEMENT = REQUIREMENT_SPECIFICATION_OBJECT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATED_INFORMATION__EA_PACKAGE_ELEMENT = REQUIREMENT_SPECIFICATION_OBJECT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATED_INFORMATION__TEXT = REQUIREMENT_SPECIFICATION_OBJECT__TEXT;

	/**
	 * The number of structural features of the '<em>Related Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATED_INFORMATION_FEATURE_COUNT = REQUIREMENT_SPECIFICATION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 6;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__GSHORT_NAME = REQUIREMENT_SPECIFICATION_OBJECT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SHORT_NAME = REQUIREMENT_SPECIFICATION_OBJECT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CATEGORY = REQUIREMENT_SPECIFICATION_OBJECT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__UUID = REQUIREMENT_SPECIFICATION_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = REQUIREMENT_SPECIFICATION_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OWNED_COMMENT = REQUIREMENT_SPECIFICATION_OBJECT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__GEA_PACKAGE_ELEMENT = REQUIREMENT_SPECIFICATION_OBJECT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__EA_PACKAGE_ELEMENT = REQUIREMENT_SPECIFICATION_OBJECT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TEXT = REQUIREMENT_SPECIFICATION_OBJECT__TEXT;

	/**
	 * The feature id for the '<em><b>Formalism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__FORMALISM = REQUIREMENT_SPECIFICATION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__URL = REQUIREMENT_SPECIFICATION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MODE = REQUIREMENT_SPECIFICATION_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = REQUIREMENT_SPECIFICATION_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsContainerImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementsContainer()
	 * @generated
	 */
	int REQUIREMENTS_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Contained Req Spec Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__CONTAINED_REQ_SPEC_OBJECT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__CHILD_CONTAINER = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RefineImpl <em>Refine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RefineImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRefine()
	 * @generated
	 */
	int REFINE = 8;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__GSHORT_NAME = REQUIREMENTS_RELATIONSHIP__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__SHORT_NAME = REQUIREMENTS_RELATIONSHIP__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__CATEGORY = REQUIREMENTS_RELATIONSHIP__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__UUID = REQUIREMENTS_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__NAME = REQUIREMENTS_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__OWNED_COMMENT = REQUIREMENTS_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Refined Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__REFINED_REQUIREMENT = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__REFINED_BY = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_FEATURE_COUNT = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.SatisfyImpl <em>Satisfy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.SatisfyImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getSatisfy()
	 * @generated
	 */
	int SATISFY = 9;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__GSHORT_NAME = REQUIREMENTS_RELATIONSHIP__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__SHORT_NAME = REQUIREMENTS_RELATIONSHIP__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__CATEGORY = REQUIREMENTS_RELATIONSHIP__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__UUID = REQUIREMENTS_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__NAME = REQUIREMENTS_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__OWNED_COMMENT = REQUIREMENTS_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Satisfied Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__SATISFIED_REQUIREMENT = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satisfied Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__SATISFIED_USE_CASE = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY__SATISFIED_BY = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Satisfy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_FEATURE_COUNT = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsLinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsLinkImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementsLink()
	 * @generated
	 */
	int REQUIREMENTS_LINK = 10;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__GSHORT_NAME = REQUIREMENTS_RELATIONSHIP__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__SHORT_NAME = REQUIREMENTS_RELATIONSHIP__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__CATEGORY = REQUIREMENTS_RELATIONSHIP__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__UUID = REQUIREMENTS_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__NAME = REQUIREMENTS_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__OWNED_COMMENT = REQUIREMENTS_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__IS_BIDIRECTIONAL = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__SOURCE = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK__TARGET = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_LINK_FEATURE_COUNT = REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsRelationGroupImpl <em>Relation Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsRelationGroupImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementsRelationGroup()
	 * @generated
	 */
	int REQUIREMENTS_RELATION_GROUP = 11;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATION_GROUP__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATION_GROUP__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATION_GROUP__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATION_GROUP__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATION_GROUP__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATION_GROUP__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATION_GROUP__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATION_GROUP__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATION_GROUP__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATION_GROUP__RELATION = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_RELATION_GROUP_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.QualityRequirementImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getQualityRequirement()
	 * @generated
	 */
	int QUALITY_REQUIREMENT = 12;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__GSHORT_NAME = REQUIREMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__SHORT_NAME = REQUIREMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__CATEGORY = REQUIREMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__UUID = REQUIREMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__OWNED_COMMENT = REQUIREMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__GEA_PACKAGE_ELEMENT = REQUIREMENT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__EA_PACKAGE_ELEMENT = REQUIREMENT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__TEXT = REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Formalism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__FORMALISM = REQUIREMENT__FORMALISM;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__URL = REQUIREMENT__URL;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__MODE = REQUIREMENT__MODE;

	/**
	 * The feature id for the '<em><b>Quality Requirement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__QUALITY_REQUIREMENT_TYPE = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.QualityRequirementKind <em>Quality Requirement Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.QualityRequirementKind
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getQualityRequirementKind()
	 * @generated
	 */
	int QUALITY_REQUIREMENT_KIND = 13;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.DeriveRequirement <em>Derive Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derive Requirement</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.DeriveRequirement
	 * @generated
	 */
	EClass getDeriveRequirement();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.DeriveRequirement#getDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.DeriveRequirement#getDerived()
	 * @see #getDeriveRequirement()
	 * @generated
	 */
	EReference getDeriveRequirement_Derived();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.DeriveRequirement#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived From</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.DeriveRequirement#getDerivedFrom()
	 * @see #getDeriveRequirement()
	 * @generated
	 */
	EReference getDeriveRequirement_DerivedFrom();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.OperationalSituation <em>Operational Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Situation</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.OperationalSituation
	 * @generated
	 */
	EClass getOperationalSituation();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementSpecificationObject <em>Requirement Specification Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Specification Object</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementSpecificationObject
	 * @generated
	 */
	EClass getRequirementSpecificationObject();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel
	 * @generated
	 */
	EClass getRequirementsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel#getOperationalSituation <em>Operational Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operational Situation</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel#getOperationalSituation()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_OperationalSituation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel#getRequirement()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_Requirement();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel#getRequirementContainer <em>Requirement Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Container</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel#getRequirementContainer()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_RequirementContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use Case</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel#getUseCase()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_UseCase();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelatedInformation <em>Related Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Information</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelatedInformation
	 * @generated
	 */
	EClass getRequirementsRelatedInformation();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationship
	 * @generated
	 */
	EClass getRequirementsRelationship();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement#getFormalism <em>Formalism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formalism</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement#getFormalism()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Formalism();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement#getUrl()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Url();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mode</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement#getMode()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Mode();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainer
	 * @generated
	 */
	EClass getRequirementsContainer();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainer#getContainedReqSpecObject <em>Contained Req Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contained Req Spec Object</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainer#getContainedReqSpecObject()
	 * @see #getRequirementsContainer()
	 * @generated
	 */
	EReference getRequirementsContainer_ContainedReqSpecObject();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainer#getChildContainer <em>Child Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Container</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainer#getChildContainer()
	 * @see #getRequirementsContainer()
	 * @generated
	 */
	EReference getRequirementsContainer_ChildContainer();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Refine <em>Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refine</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Refine
	 * @generated
	 */
	EClass getRefine();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Refine#getRefinedRequirement <em>Refined Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined Requirement</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Refine#getRefinedRequirement()
	 * @see #getRefine()
	 * @generated
	 */
	EReference getRefine_RefinedRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Refine#getRefinedBy <em>Refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refined By</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Refine#getRefinedBy()
	 * @see #getRefine()
	 * @generated
	 */
	EReference getRefine_RefinedBy();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Satisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfy</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Satisfy
	 * @generated
	 */
	EClass getSatisfy();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Satisfy#getSatisfiedRequirement <em>Satisfied Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfied Requirement</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Satisfy#getSatisfiedRequirement()
	 * @see #getSatisfy()
	 * @generated
	 */
	EReference getSatisfy_SatisfiedRequirement();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Satisfy#getSatisfiedUseCase <em>Satisfied Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfied Use Case</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Satisfy#getSatisfiedUseCase()
	 * @see #getSatisfy()
	 * @generated
	 */
	EReference getSatisfy_SatisfiedUseCase();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Satisfy#getSatisfiedBy <em>Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Satisfied By</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Satisfy#getSatisfiedBy()
	 * @see #getSatisfy()
	 * @generated
	 */
	EReference getSatisfy_SatisfiedBy();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsLink
	 * @generated
	 */
	EClass getRequirementsLink();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsLink#getIsBidirectional <em>Is Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bidirectional</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsLink#getIsBidirectional()
	 * @see #getRequirementsLink()
	 * @generated
	 */
	EAttribute getRequirementsLink_IsBidirectional();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsLink#getSource()
	 * @see #getRequirementsLink()
	 * @generated
	 */
	EReference getRequirementsLink_Source();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsLink#getTarget()
	 * @see #getRequirementsLink()
	 * @generated
	 */
	EReference getRequirementsLink_Target();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationGroup <em>Relation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Group</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationGroup
	 * @generated
	 */
	EClass getRequirementsRelationGroup();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationGroup#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relation</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationGroup#getRelation()
	 * @see #getRequirementsRelationGroup()
	 * @generated
	 */
	EReference getRequirementsRelationGroup_Relation();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.QualityRequirement <em>Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Requirement</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.QualityRequirement
	 * @generated
	 */
	EClass getQualityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.QualityRequirement#getQualityRequirementType <em>Quality Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality Requirement Type</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.QualityRequirement#getQualityRequirementType()
	 * @see #getQualityRequirement()
	 * @generated
	 */
	EAttribute getQualityRequirement_QualityRequirementType();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.QualityRequirementKind <em>Quality Requirement Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quality Requirement Kind</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.QualityRequirementKind
	 * @generated
	 */
	EEnum getQualityRequirementKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsFactory getRequirementsFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.DeriveRequirementImpl <em>Derive Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.DeriveRequirementImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getDeriveRequirement()
		 * @generated
		 */
		EClass DERIVE_REQUIREMENT = eINSTANCE.getDeriveRequirement();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVE_REQUIREMENT__DERIVED = eINSTANCE.getDeriveRequirement_Derived();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVE_REQUIREMENT__DERIVED_FROM = eINSTANCE.getDeriveRequirement_DerivedFrom();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.OperationalSituationImpl <em>Operational Situation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.OperationalSituationImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getOperationalSituation()
		 * @generated
		 */
		EClass OPERATIONAL_SITUATION = eINSTANCE.getOperationalSituation();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementSpecificationObjectImpl <em>Requirement Specification Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementSpecificationObjectImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementSpecificationObject()
		 * @generated
		 */
		EClass REQUIREMENT_SPECIFICATION_OBJECT = eINSTANCE.getRequirementSpecificationObject();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsModelImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementsModel()
		 * @generated
		 */
		EClass REQUIREMENTS_MODEL = eINSTANCE.getRequirementsModel();

		/**
		 * The meta object literal for the '<em><b>Operational Situation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__OPERATIONAL_SITUATION = eINSTANCE.getRequirementsModel_OperationalSituation();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__REQUIREMENT = eINSTANCE.getRequirementsModel_Requirement();

		/**
		 * The meta object literal for the '<em><b>Requirement Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__REQUIREMENT_CONTAINER = eINSTANCE.getRequirementsModel_RequirementContainer();

		/**
		 * The meta object literal for the '<em><b>Use Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__USE_CASE = eINSTANCE.getRequirementsModel_UseCase();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsRelatedInformationImpl <em>Related Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsRelatedInformationImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementsRelatedInformation()
		 * @generated
		 */
		EClass REQUIREMENTS_RELATED_INFORMATION = eINSTANCE.getRequirementsRelatedInformation();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsRelationshipImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementsRelationship()
		 * @generated
		 */
		EClass REQUIREMENTS_RELATIONSHIP = eINSTANCE.getRequirementsRelationship();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Formalism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__FORMALISM = eINSTANCE.getRequirement_Formalism();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__URL = eINSTANCE.getRequirement_Url();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__MODE = eINSTANCE.getRequirement_Mode();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsContainerImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementsContainer()
		 * @generated
		 */
		EClass REQUIREMENTS_CONTAINER = eINSTANCE.getRequirementsContainer();

		/**
		 * The meta object literal for the '<em><b>Contained Req Spec Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_CONTAINER__CONTAINED_REQ_SPEC_OBJECT = eINSTANCE.getRequirementsContainer_ContainedReqSpecObject();

		/**
		 * The meta object literal for the '<em><b>Child Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_CONTAINER__CHILD_CONTAINER = eINSTANCE.getRequirementsContainer_ChildContainer();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RefineImpl <em>Refine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RefineImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRefine()
		 * @generated
		 */
		EClass REFINE = eINSTANCE.getRefine();

		/**
		 * The meta object literal for the '<em><b>Refined Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINE__REFINED_REQUIREMENT = eINSTANCE.getRefine_RefinedRequirement();

		/**
		 * The meta object literal for the '<em><b>Refined By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINE__REFINED_BY = eINSTANCE.getRefine_RefinedBy();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.SatisfyImpl <em>Satisfy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.SatisfyImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getSatisfy()
		 * @generated
		 */
		EClass SATISFY = eINSTANCE.getSatisfy();

		/**
		 * The meta object literal for the '<em><b>Satisfied Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFY__SATISFIED_REQUIREMENT = eINSTANCE.getSatisfy_SatisfiedRequirement();

		/**
		 * The meta object literal for the '<em><b>Satisfied Use Case</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFY__SATISFIED_USE_CASE = eINSTANCE.getSatisfy_SatisfiedUseCase();

		/**
		 * The meta object literal for the '<em><b>Satisfied By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFY__SATISFIED_BY = eINSTANCE.getSatisfy_SatisfiedBy();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsLinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsLinkImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementsLink()
		 * @generated
		 */
		EClass REQUIREMENTS_LINK = eINSTANCE.getRequirementsLink();

		/**
		 * The meta object literal for the '<em><b>Is Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS_LINK__IS_BIDIRECTIONAL = eINSTANCE.getRequirementsLink_IsBidirectional();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_LINK__SOURCE = eINSTANCE.getRequirementsLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_LINK__TARGET = eINSTANCE.getRequirementsLink_Target();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsRelationGroupImpl <em>Relation Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsRelationGroupImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementsRelationGroup()
		 * @generated
		 */
		EClass REQUIREMENTS_RELATION_GROUP = eINSTANCE.getRequirementsRelationGroup();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_RELATION_GROUP__RELATION = eINSTANCE.getRequirementsRelationGroup_Relation();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.QualityRequirementImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getQualityRequirement()
		 * @generated
		 */
		EClass QUALITY_REQUIREMENT = eINSTANCE.getQualityRequirement();

		/**
		 * The meta object literal for the '<em><b>Quality Requirement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_REQUIREMENT__QUALITY_REQUIREMENT_TYPE = eINSTANCE.getQualityRequirement_QualityRequirementType();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.QualityRequirementKind <em>Quality Requirement Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.QualityRequirementKind
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl#getQualityRequirementKind()
		 * @generated
		 */
		EEnum QUALITY_REQUIREMENT_KIND = eINSTANCE.getQualityRequirementKind();

	}

} //RequirementsPackage
