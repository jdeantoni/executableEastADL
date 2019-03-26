/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability;

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
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityFactory
 * @model kind="package"
 * @generated
 */
public interface DependabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dependability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.aoste.executable.eastadl.eastadlmt/eastadl21/east_adl/dependability/";

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
	DependabilityPackage eINSTANCE = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityImpl <em>Dependability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getDependability()
	 * @generated
	 */
	int DEPENDABILITY = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__GSHORT_NAME = ElementsPackage.CONTEXT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__SHORT_NAME = ElementsPackage.CONTEXT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__CATEGORY = ElementsPackage.CONTEXT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__UUID = ElementsPackage.CONTEXT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__NAME = ElementsPackage.CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__OWNED_COMMENT = ElementsPackage.CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__GEA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__EA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__TRACEABLE_SPECIFICATION = ElementsPackage.CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__OWNED_RELATIONSHIP = ElementsPackage.CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Feature Flaw</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__FEATURE_FLAW = ElementsPackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technical Safety Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT = ElementsPackage.CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Safety Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__SAFETY_CASE = ElementsPackage.CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__HAZARD = ElementsPackage.CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__FAULT_FAILURE = ElementsPackage.CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ea Datatype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__EA_DATATYPE = ElementsPackage.CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hazardous Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__HAZARDOUS_EVENT = ElementsPackage.CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Safety Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__SAFETY_CONSTRAINT = ElementsPackage.CONTEXT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Error Model Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__ERROR_MODEL_TYPE = ElementsPackage.CONTEXT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Functional Safety Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT = ElementsPackage.CONTEXT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Quantitiative Safety Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT = ElementsPackage.CONTEXT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__ITEM = ElementsPackage.CONTEXT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Safety Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY__SAFETY_GOAL = ElementsPackage.CONTEXT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Dependability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_FEATURE_COUNT = ElementsPackage.CONTEXT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.FeatureFlawImpl <em>Feature Flaw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.FeatureFlawImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getFeatureFlaw()
	 * @generated
	 */
	int FEATURE_FLAW = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FLAW__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FLAW__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FLAW__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FLAW__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FLAW__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FLAW__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FLAW__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FLAW__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FLAW__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FLAW__ITEM = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Non Fulfilled Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FLAW__NON_FULFILLED_REQUIREMENT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Flaw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FLAW_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.ItemImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Development Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DEVELOPMENT_CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vehicle Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__VEHICLE_FEATURE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.HazardImpl <em>Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.HazardImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getHazard()
	 * @generated
	 */
	int HAZARD = 3;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Malfunction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__MALFUNCTION = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__ITEM = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.HazardousEventImpl <em>Hazardous Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.HazardousEventImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getHazardousEvent()
	 * @generated
	 */
	int HAZARDOUS_EVENT = 4;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Controllability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__CONTROLLABILITY = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exposure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__EXPOSURE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__SEVERITY = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hazard Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__HAZARD_CLASSIFICATION = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Classification Assumptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operating Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__OPERATING_MODE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>External Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__EXTERNAL_MEASURES = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Operational Situation Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__OPERATIONAL_SITUATION_USE_CASE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__ENVIRONMENT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__HAZARD = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Traffic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT__TRAFFIC = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Hazardous Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_EVENT_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ControllabilityClassKind <em>Controllability Class Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ControllabilityClassKind
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getControllabilityClassKind()
	 * @generated
	 */
	int CONTROLLABILITY_CLASS_KIND = 5;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DevelopmentCategoryKind <em>Development Category Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DevelopmentCategoryKind
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getDevelopmentCategoryKind()
	 * @generated
	 */
	int DEVELOPMENT_CATEGORY_KIND = 6;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ExposureClassKind <em>Exposure Class Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ExposureClassKind
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getExposureClassKind()
	 * @generated
	 */
	int EXPOSURE_CLASS_KIND = 7;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.SeverityClassKind <em>Severity Class Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.SeverityClassKind
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getSeverityClassKind()
	 * @generated
	 */
	int SEVERITY_CLASS_KIND = 8;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability <em>Dependability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependability</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability
	 * @generated
	 */
	EClass getDependability();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getFeatureFlaw <em>Feature Flaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Flaw</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getFeatureFlaw()
	 * @see #getDependability()
	 * @generated
	 */
	EReference getDependability_FeatureFlaw();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getTechnicalSafetyConcept <em>Technical Safety Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technical Safety Concept</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getTechnicalSafetyConcept()
	 * @see #getDependability()
	 * @generated
	 */
	EReference getDependability_TechnicalSafetyConcept();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getSafetyCase <em>Safety Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Safety Case</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getSafetyCase()
	 * @see #getDependability()
	 * @generated
	 */
	EReference getDependability_SafetyCase();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getHazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazard</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getHazard()
	 * @see #getDependability()
	 * @generated
	 */
	EReference getDependability_Hazard();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getFaultFailure <em>Fault Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fault Failure</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getFaultFailure()
	 * @see #getDependability()
	 * @generated
	 */
	EReference getDependability_FaultFailure();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getEaDatatype <em>Ea Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ea Datatype</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getEaDatatype()
	 * @see #getDependability()
	 * @generated
	 */
	EReference getDependability_EaDatatype();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getHazardousEvent <em>Hazardous Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazardous Event</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getHazardousEvent()
	 * @see #getDependability()
	 * @generated
	 */
	EReference getDependability_HazardousEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getSafetyConstraint <em>Safety Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Safety Constraint</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getSafetyConstraint()
	 * @see #getDependability()
	 * @generated
	 */
	EReference getDependability_SafetyConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getErrorModelType <em>Error Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Model Type</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getErrorModelType()
	 * @see #getDependability()
	 * @generated
	 */
	EReference getDependability_ErrorModelType();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getFunctionalSafetyConcept <em>Functional Safety Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functional Safety Concept</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getFunctionalSafetyConcept()
	 * @see #getDependability()
	 * @generated
	 */
	EReference getDependability_FunctionalSafetyConcept();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getQuantitiativeSafetyConstraint <em>Quantitiative Safety Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantitiative Safety Constraint</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getQuantitiativeSafetyConstraint()
	 * @see #getDependability()
	 * @generated
	 */
	EReference getDependability_QuantitiativeSafetyConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getItem()
	 * @see #getDependability()
	 * @generated
	 */
	EReference getDependability_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getSafetyGoal <em>Safety Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Safety Goal</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability#getSafetyGoal()
	 * @see #getDependability()
	 * @generated
	 */
	EReference getDependability_SafetyGoal();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.FeatureFlaw <em>Feature Flaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Flaw</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.FeatureFlaw
	 * @generated
	 */
	EClass getFeatureFlaw();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.FeatureFlaw#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.FeatureFlaw#getItem()
	 * @see #getFeatureFlaw()
	 * @generated
	 */
	EReference getFeatureFlaw_Item();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.FeatureFlaw#getNonFulfilledRequirement <em>Non Fulfilled Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Non Fulfilled Requirement</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.FeatureFlaw#getNonFulfilledRequirement()
	 * @see #getFeatureFlaw()
	 * @generated
	 */
	EReference getFeatureFlaw_NonFulfilledRequirement();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Item#getDevelopmentCategory <em>Development Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Development Category</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Item#getDevelopmentCategory()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_DevelopmentCategory();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Item#getVehicleFeature <em>Vehicle Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vehicle Feature</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Item#getVehicleFeature()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_VehicleFeature();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Hazard
	 * @generated
	 */
	EClass getHazard();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Hazard#getMalfunction <em>Malfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Malfunction</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Hazard#getMalfunction()
	 * @see #getHazard()
	 * @generated
	 */
	EReference getHazard_Malfunction();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Hazard#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Hazard#getItem()
	 * @see #getHazard()
	 * @generated
	 */
	EReference getHazard_Item();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent <em>Hazardous Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazardous Event</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent
	 * @generated
	 */
	EClass getHazardousEvent();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getControllability <em>Controllability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controllability</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getControllability()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EAttribute getHazardousEvent_Controllability();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getExposure <em>Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exposure</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getExposure()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EAttribute getHazardousEvent_Exposure();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getSeverity()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EAttribute getHazardousEvent_Severity();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getHazardClassification <em>Hazard Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hazard Classification</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getHazardClassification()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EAttribute getHazardousEvent_HazardClassification();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getClassificationAssumptions <em>Classification Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification Assumptions</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getClassificationAssumptions()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EAttribute getHazardousEvent_ClassificationAssumptions();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getOperatingMode <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operating Mode</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getOperatingMode()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EReference getHazardousEvent_OperatingMode();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getExternalMeasures <em>External Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Measures</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getExternalMeasures()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EReference getHazardousEvent_ExternalMeasures();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getOperationalSituationUseCase <em>Operational Situation Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operational Situation Use Case</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getOperationalSituationUseCase()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EReference getHazardousEvent_OperationalSituationUseCase();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Environment</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getEnvironment()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EReference getHazardousEvent_Environment();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getHazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazard</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getHazard()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EReference getHazardousEvent_Hazard();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getTraffic <em>Traffic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traffic</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent#getTraffic()
	 * @see #getHazardousEvent()
	 * @generated
	 */
	EReference getHazardousEvent_Traffic();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ControllabilityClassKind <em>Controllability Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Controllability Class Kind</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ControllabilityClassKind
	 * @generated
	 */
	EEnum getControllabilityClassKind();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DevelopmentCategoryKind <em>Development Category Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Development Category Kind</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DevelopmentCategoryKind
	 * @generated
	 */
	EEnum getDevelopmentCategoryKind();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ExposureClassKind <em>Exposure Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exposure Class Kind</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ExposureClassKind
	 * @generated
	 */
	EEnum getExposureClassKind();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.SeverityClassKind <em>Severity Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity Class Kind</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.SeverityClassKind
	 * @generated
	 */
	EEnum getSeverityClassKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DependabilityFactory getDependabilityFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityImpl <em>Dependability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getDependability()
		 * @generated
		 */
		EClass DEPENDABILITY = eINSTANCE.getDependability();

		/**
		 * The meta object literal for the '<em><b>Feature Flaw</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY__FEATURE_FLAW = eINSTANCE.getDependability_FeatureFlaw();

		/**
		 * The meta object literal for the '<em><b>Technical Safety Concept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT = eINSTANCE.getDependability_TechnicalSafetyConcept();

		/**
		 * The meta object literal for the '<em><b>Safety Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY__SAFETY_CASE = eINSTANCE.getDependability_SafetyCase();

		/**
		 * The meta object literal for the '<em><b>Hazard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY__HAZARD = eINSTANCE.getDependability_Hazard();

		/**
		 * The meta object literal for the '<em><b>Fault Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY__FAULT_FAILURE = eINSTANCE.getDependability_FaultFailure();

		/**
		 * The meta object literal for the '<em><b>Ea Datatype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY__EA_DATATYPE = eINSTANCE.getDependability_EaDatatype();

		/**
		 * The meta object literal for the '<em><b>Hazardous Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY__HAZARDOUS_EVENT = eINSTANCE.getDependability_HazardousEvent();

		/**
		 * The meta object literal for the '<em><b>Safety Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY__SAFETY_CONSTRAINT = eINSTANCE.getDependability_SafetyConstraint();

		/**
		 * The meta object literal for the '<em><b>Error Model Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY__ERROR_MODEL_TYPE = eINSTANCE.getDependability_ErrorModelType();

		/**
		 * The meta object literal for the '<em><b>Functional Safety Concept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT = eINSTANCE.getDependability_FunctionalSafetyConcept();

		/**
		 * The meta object literal for the '<em><b>Quantitiative Safety Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT = eINSTANCE.getDependability_QuantitiativeSafetyConstraint();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY__ITEM = eINSTANCE.getDependability_Item();

		/**
		 * The meta object literal for the '<em><b>Safety Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY__SAFETY_GOAL = eINSTANCE.getDependability_SafetyGoal();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.FeatureFlawImpl <em>Feature Flaw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.FeatureFlawImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getFeatureFlaw()
		 * @generated
		 */
		EClass FEATURE_FLAW = eINSTANCE.getFeatureFlaw();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_FLAW__ITEM = eINSTANCE.getFeatureFlaw_Item();

		/**
		 * The meta object literal for the '<em><b>Non Fulfilled Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_FLAW__NON_FULFILLED_REQUIREMENT = eINSTANCE.getFeatureFlaw_NonFulfilledRequirement();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.ItemImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Development Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__DEVELOPMENT_CATEGORY = eINSTANCE.getItem_DevelopmentCategory();

		/**
		 * The meta object literal for the '<em><b>Vehicle Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__VEHICLE_FEATURE = eINSTANCE.getItem_VehicleFeature();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.HazardImpl <em>Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.HazardImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getHazard()
		 * @generated
		 */
		EClass HAZARD = eINSTANCE.getHazard();

		/**
		 * The meta object literal for the '<em><b>Malfunction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD__MALFUNCTION = eINSTANCE.getHazard_Malfunction();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD__ITEM = eINSTANCE.getHazard_Item();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.HazardousEventImpl <em>Hazardous Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.HazardousEventImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getHazardousEvent()
		 * @generated
		 */
		EClass HAZARDOUS_EVENT = eINSTANCE.getHazardousEvent();

		/**
		 * The meta object literal for the '<em><b>Controllability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARDOUS_EVENT__CONTROLLABILITY = eINSTANCE.getHazardousEvent_Controllability();

		/**
		 * The meta object literal for the '<em><b>Exposure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARDOUS_EVENT__EXPOSURE = eINSTANCE.getHazardousEvent_Exposure();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARDOUS_EVENT__SEVERITY = eINSTANCE.getHazardousEvent_Severity();

		/**
		 * The meta object literal for the '<em><b>Hazard Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARDOUS_EVENT__HAZARD_CLASSIFICATION = eINSTANCE.getHazardousEvent_HazardClassification();

		/**
		 * The meta object literal for the '<em><b>Classification Assumptions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS = eINSTANCE.getHazardousEvent_ClassificationAssumptions();

		/**
		 * The meta object literal for the '<em><b>Operating Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARDOUS_EVENT__OPERATING_MODE = eINSTANCE.getHazardousEvent_OperatingMode();

		/**
		 * The meta object literal for the '<em><b>External Measures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARDOUS_EVENT__EXTERNAL_MEASURES = eINSTANCE.getHazardousEvent_ExternalMeasures();

		/**
		 * The meta object literal for the '<em><b>Operational Situation Use Case</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARDOUS_EVENT__OPERATIONAL_SITUATION_USE_CASE = eINSTANCE.getHazardousEvent_OperationalSituationUseCase();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARDOUS_EVENT__ENVIRONMENT = eINSTANCE.getHazardousEvent_Environment();

		/**
		 * The meta object literal for the '<em><b>Hazard</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARDOUS_EVENT__HAZARD = eINSTANCE.getHazardousEvent_Hazard();

		/**
		 * The meta object literal for the '<em><b>Traffic</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARDOUS_EVENT__TRAFFIC = eINSTANCE.getHazardousEvent_Traffic();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ControllabilityClassKind <em>Controllability Class Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ControllabilityClassKind
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getControllabilityClassKind()
		 * @generated
		 */
		EEnum CONTROLLABILITY_CLASS_KIND = eINSTANCE.getControllabilityClassKind();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DevelopmentCategoryKind <em>Development Category Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DevelopmentCategoryKind
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getDevelopmentCategoryKind()
		 * @generated
		 */
		EEnum DEVELOPMENT_CATEGORY_KIND = eINSTANCE.getDevelopmentCategoryKind();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ExposureClassKind <em>Exposure Class Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ExposureClassKind
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getExposureClassKind()
		 * @generated
		 */
		EEnum EXPOSURE_CLASS_KIND = eINSTANCE.getExposureClassKind();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.SeverityClassKind <em>Severity Class Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.SeverityClassKind
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl#getSeverityClassKind()
		 * @generated
		 */
		EEnum SEVERITY_CLASS_KIND = eINSTANCE.getSeverityClassKind();

	}

} //DependabilityPackage
