/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationFactory
 * @model kind="package"
 * @generated
 */
public interface VerificationvalidationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "verificationvalidation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.aoste.executable.eastadl.eastadlmt/eastadl21/east_adl/requirements/verificationvalidation/";

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
	VerificationvalidationPackage eINSTANCE = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationValidationImpl <em>Verification Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationValidationImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVerificationValidation()
	 * @generated
	 */
	int VERIFICATION_VALIDATION = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION__GSHORT_NAME = ElementsPackage.CONTEXT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION__SHORT_NAME = ElementsPackage.CONTEXT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION__CATEGORY = ElementsPackage.CONTEXT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION__UUID = ElementsPackage.CONTEXT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION__NAME = ElementsPackage.CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION__OWNED_COMMENT = ElementsPackage.CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION__GEA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION__EA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION__TRACEABLE_SPECIFICATION = ElementsPackage.CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION__OWNED_RELATIONSHIP = ElementsPackage.CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Vv Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION__VV_TARGET = ElementsPackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vv Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION__VV_CASE = ElementsPackage.CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Verify</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION__VERIFY = ElementsPackage.CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Verification Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_VALIDATION_FEATURE_COUNT = ElementsPackage.CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVActualOutcomeImpl <em>VV Actual Outcome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVActualOutcomeImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVActualOutcome()
	 * @generated
	 */
	int VV_ACTUAL_OUTCOME = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_ACTUAL_OUTCOME__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_ACTUAL_OUTCOME__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_ACTUAL_OUTCOME__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_ACTUAL_OUTCOME__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_ACTUAL_OUTCOME__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_ACTUAL_OUTCOME__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_ACTUAL_OUTCOME__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_ACTUAL_OUTCOME__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_ACTUAL_OUTCOME__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Intended Outcome</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_ACTUAL_OUTCOME__INTENDED_OUTCOME = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VV Actual Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_ACTUAL_OUTCOME_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVIntendedOutcomeImpl <em>VV Intended Outcome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVIntendedOutcomeImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVIntendedOutcome()
	 * @generated
	 */
	int VV_INTENDED_OUTCOME = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_INTENDED_OUTCOME__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_INTENDED_OUTCOME__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_INTENDED_OUTCOME__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_INTENDED_OUTCOME__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_INTENDED_OUTCOME__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_INTENDED_OUTCOME__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_INTENDED_OUTCOME__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_INTENDED_OUTCOME__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_INTENDED_OUTCOME__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The number of structural features of the '<em>VV Intended Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_INTENDED_OUTCOME_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVLogImpl <em>VV Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVLogImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVLog()
	 * @generated
	 */
	int VV_LOG = 3;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_LOG__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_LOG__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_LOG__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_LOG__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_LOG__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_LOG__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_LOG__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_LOG__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_LOG__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_LOG__DATE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vv Actual Outcome</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_LOG__VV_ACTUAL_OUTCOME = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Performed VV Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_LOG__PERFORMED_VV_PROCEDURE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VV Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_LOG_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVProcedureImpl <em>VV Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVProcedureImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVProcedure()
	 * @generated
	 */
	int VV_PROCEDURE = 4;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Concrete VV Procedure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE__CONCRETE_VV_PROCEDURE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vv Stimuli</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE__VV_STIMULI = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vv Intended Outcome</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE__VV_INTENDED_OUTCOME = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract VV Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE__ABSTRACT_VV_PROCEDURE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VV Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_PROCEDURE_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVStimuliImpl <em>VV Stimuli</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVStimuliImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVStimuli()
	 * @generated
	 */
	int VV_STIMULI = 5;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_STIMULI__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_STIMULI__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_STIMULI__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_STIMULI__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_STIMULI__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_STIMULI__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_STIMULI__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_STIMULI__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_STIMULI__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The number of structural features of the '<em>VV Stimuli</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_STIMULI_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVTargetImpl <em>VV Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVTargetImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVTarget()
	 * @generated
	 */
	int VV_TARGET = 6;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_TARGET__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_TARGET__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_TARGET__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_TARGET__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_TARGET__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_TARGET__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_TARGET__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_TARGET__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_TARGET__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_TARGET__ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VV Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_TARGET_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerifyImpl <em>Verify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerifyImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVerify()
	 * @generated
	 */
	int VERIFY = 7;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__GSHORT_NAME = RequirementsPackage.REQUIREMENTS_RELATIONSHIP__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__SHORT_NAME = RequirementsPackage.REQUIREMENTS_RELATIONSHIP__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__CATEGORY = RequirementsPackage.REQUIREMENTS_RELATIONSHIP__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__UUID = RequirementsPackage.REQUIREMENTS_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__NAME = RequirementsPackage.REQUIREMENTS_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__OWNED_COMMENT = RequirementsPackage.REQUIREMENTS_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Verified By Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__VERIFIED_BY_CASE = RequirementsPackage.REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verified By Procedure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__VERIFIED_BY_PROCEDURE = RequirementsPackage.REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Verified Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__VERIFIED_REQUIREMENT = RequirementsPackage.REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Verify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY_FEATURE_COUNT = RequirementsPackage.REQUIREMENTS_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVCaseImpl <em>VV Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVCaseImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVCase()
	 * @generated
	 */
	int VV_CASE = 8;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Concrete VV Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__CONCRETE_VV_CASE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vv Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__VV_TARGET = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vv Procedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__VV_PROCEDURE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vv Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__VV_LOG = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract VV Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__ABSTRACT_VV_CASE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vv Subject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__VV_SUBJECT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>VV Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation <em>Verification Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Validation</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation
	 * @generated
	 */
	EClass getVerificationValidation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation#getVvTarget <em>Vv Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vv Target</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation#getVvTarget()
	 * @see #getVerificationValidation()
	 * @generated
	 */
	EReference getVerificationValidation_VvTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation#getVvCase <em>Vv Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vv Case</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation#getVvCase()
	 * @see #getVerificationValidation()
	 * @generated
	 */
	EReference getVerificationValidation_VvCase();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation#getVerify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verify</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation#getVerify()
	 * @see #getVerificationValidation()
	 * @generated
	 */
	EReference getVerificationValidation_Verify();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome <em>VV Actual Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VV Actual Outcome</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome
	 * @generated
	 */
	EClass getVVActualOutcome();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome#getIntendedOutcome <em>Intended Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Intended Outcome</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome#getIntendedOutcome()
	 * @see #getVVActualOutcome()
	 * @generated
	 */
	EReference getVVActualOutcome_IntendedOutcome();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcome <em>VV Intended Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VV Intended Outcome</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcome
	 * @generated
	 */
	EClass getVVIntendedOutcome();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVLog <em>VV Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VV Log</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVLog
	 * @generated
	 */
	EClass getVVLog();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVLog#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVLog#getDate()
	 * @see #getVVLog()
	 * @generated
	 */
	EAttribute getVVLog_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVLog#getVvActualOutcome <em>Vv Actual Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vv Actual Outcome</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVLog#getVvActualOutcome()
	 * @see #getVVLog()
	 * @generated
	 */
	EReference getVVLog_VvActualOutcome();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVLog#getPerformedVVProcedure <em>Performed VV Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Performed VV Procedure</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVLog#getPerformedVVProcedure()
	 * @see #getVVLog()
	 * @generated
	 */
	EReference getVVLog_PerformedVVProcedure();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure <em>VV Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VV Procedure</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure
	 * @generated
	 */
	EClass getVVProcedure();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure#getConcreteVVProcedure <em>Concrete VV Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete VV Procedure</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure#getConcreteVVProcedure()
	 * @see #getVVProcedure()
	 * @generated
	 */
	EReference getVVProcedure_ConcreteVVProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure#getVvStimuli <em>Vv Stimuli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vv Stimuli</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure#getVvStimuli()
	 * @see #getVVProcedure()
	 * @generated
	 */
	EReference getVVProcedure_VvStimuli();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure#getVvIntendedOutcome <em>Vv Intended Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vv Intended Outcome</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure#getVvIntendedOutcome()
	 * @see #getVVProcedure()
	 * @generated
	 */
	EReference getVVProcedure_VvIntendedOutcome();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure#getAbstractVVProcedure <em>Abstract VV Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract VV Procedure</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure#getAbstractVVProcedure()
	 * @see #getVVProcedure()
	 * @generated
	 */
	EReference getVVProcedure_AbstractVVProcedure();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVStimuli <em>VV Stimuli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VV Stimuli</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVStimuli
	 * @generated
	 */
	EClass getVVStimuli();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVTarget <em>VV Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VV Target</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVTarget
	 * @generated
	 */
	EClass getVVTarget();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVTarget#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVTarget#getElement()
	 * @see #getVVTarget()
	 * @generated
	 */
	EReference getVVTarget_Element();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.Verify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verify</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.Verify
	 * @generated
	 */
	EClass getVerify();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.Verify#getVerifiedByCase <em>Verified By Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verified By Case</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.Verify#getVerifiedByCase()
	 * @see #getVerify()
	 * @generated
	 */
	EReference getVerify_VerifiedByCase();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.Verify#getVerifiedByProcedure <em>Verified By Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verified By Procedure</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.Verify#getVerifiedByProcedure()
	 * @see #getVerify()
	 * @generated
	 */
	EReference getVerify_VerifiedByProcedure();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.Verify#getVerifiedRequirement <em>Verified Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verified Requirement</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.Verify#getVerifiedRequirement()
	 * @see #getVerify()
	 * @generated
	 */
	EReference getVerify_VerifiedRequirement();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase <em>VV Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VV Case</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase
	 * @generated
	 */
	EClass getVVCase();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getConcreteVVCase <em>Concrete VV Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete VV Case</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getConcreteVVCase()
	 * @see #getVVCase()
	 * @generated
	 */
	EReference getVVCase_ConcreteVVCase();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getVvTarget <em>Vv Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vv Target</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getVvTarget()
	 * @see #getVVCase()
	 * @generated
	 */
	EReference getVVCase_VvTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getVvProcedure <em>Vv Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vv Procedure</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getVvProcedure()
	 * @see #getVVCase()
	 * @generated
	 */
	EReference getVVCase_VvProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getVvLog <em>Vv Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vv Log</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getVvLog()
	 * @see #getVVCase()
	 * @generated
	 */
	EReference getVVCase_VvLog();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getAbstractVVCase <em>Abstract VV Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract VV Case</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getAbstractVVCase()
	 * @see #getVVCase()
	 * @generated
	 */
	EReference getVVCase_AbstractVVCase();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getVvSubject <em>Vv Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vv Subject</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase#getVvSubject()
	 * @see #getVVCase()
	 * @generated
	 */
	EReference getVVCase_VvSubject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VerificationvalidationFactory getVerificationvalidationFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationValidationImpl <em>Verification Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationValidationImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVerificationValidation()
		 * @generated
		 */
		EClass VERIFICATION_VALIDATION = eINSTANCE.getVerificationValidation();

		/**
		 * The meta object literal for the '<em><b>Vv Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_VALIDATION__VV_TARGET = eINSTANCE.getVerificationValidation_VvTarget();

		/**
		 * The meta object literal for the '<em><b>Vv Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_VALIDATION__VV_CASE = eINSTANCE.getVerificationValidation_VvCase();

		/**
		 * The meta object literal for the '<em><b>Verify</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_VALIDATION__VERIFY = eINSTANCE.getVerificationValidation_Verify();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVActualOutcomeImpl <em>VV Actual Outcome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVActualOutcomeImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVActualOutcome()
		 * @generated
		 */
		EClass VV_ACTUAL_OUTCOME = eINSTANCE.getVVActualOutcome();

		/**
		 * The meta object literal for the '<em><b>Intended Outcome</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_ACTUAL_OUTCOME__INTENDED_OUTCOME = eINSTANCE.getVVActualOutcome_IntendedOutcome();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVIntendedOutcomeImpl <em>VV Intended Outcome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVIntendedOutcomeImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVIntendedOutcome()
		 * @generated
		 */
		EClass VV_INTENDED_OUTCOME = eINSTANCE.getVVIntendedOutcome();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVLogImpl <em>VV Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVLogImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVLog()
		 * @generated
		 */
		EClass VV_LOG = eINSTANCE.getVVLog();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VV_LOG__DATE = eINSTANCE.getVVLog_Date();

		/**
		 * The meta object literal for the '<em><b>Vv Actual Outcome</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_LOG__VV_ACTUAL_OUTCOME = eINSTANCE.getVVLog_VvActualOutcome();

		/**
		 * The meta object literal for the '<em><b>Performed VV Procedure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_LOG__PERFORMED_VV_PROCEDURE = eINSTANCE.getVVLog_PerformedVVProcedure();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVProcedureImpl <em>VV Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVProcedureImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVProcedure()
		 * @generated
		 */
		EClass VV_PROCEDURE = eINSTANCE.getVVProcedure();

		/**
		 * The meta object literal for the '<em><b>Concrete VV Procedure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_PROCEDURE__CONCRETE_VV_PROCEDURE = eINSTANCE.getVVProcedure_ConcreteVVProcedure();

		/**
		 * The meta object literal for the '<em><b>Vv Stimuli</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_PROCEDURE__VV_STIMULI = eINSTANCE.getVVProcedure_VvStimuli();

		/**
		 * The meta object literal for the '<em><b>Vv Intended Outcome</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_PROCEDURE__VV_INTENDED_OUTCOME = eINSTANCE.getVVProcedure_VvIntendedOutcome();

		/**
		 * The meta object literal for the '<em><b>Abstract VV Procedure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_PROCEDURE__ABSTRACT_VV_PROCEDURE = eINSTANCE.getVVProcedure_AbstractVVProcedure();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVStimuliImpl <em>VV Stimuli</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVStimuliImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVStimuli()
		 * @generated
		 */
		EClass VV_STIMULI = eINSTANCE.getVVStimuli();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVTargetImpl <em>VV Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVTargetImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVTarget()
		 * @generated
		 */
		EClass VV_TARGET = eINSTANCE.getVVTarget();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_TARGET__ELEMENT = eINSTANCE.getVVTarget_Element();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerifyImpl <em>Verify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerifyImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVerify()
		 * @generated
		 */
		EClass VERIFY = eINSTANCE.getVerify();

		/**
		 * The meta object literal for the '<em><b>Verified By Case</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFY__VERIFIED_BY_CASE = eINSTANCE.getVerify_VerifiedByCase();

		/**
		 * The meta object literal for the '<em><b>Verified By Procedure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFY__VERIFIED_BY_PROCEDURE = eINSTANCE.getVerify_VerifiedByProcedure();

		/**
		 * The meta object literal for the '<em><b>Verified Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFY__VERIFIED_REQUIREMENT = eINSTANCE.getVerify_VerifiedRequirement();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVCaseImpl <em>VV Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VVCaseImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl#getVVCase()
		 * @generated
		 */
		EClass VV_CASE = eINSTANCE.getVVCase();

		/**
		 * The meta object literal for the '<em><b>Concrete VV Case</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_CASE__CONCRETE_VV_CASE = eINSTANCE.getVVCase_ConcreteVVCase();

		/**
		 * The meta object literal for the '<em><b>Vv Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_CASE__VV_TARGET = eINSTANCE.getVVCase_VvTarget();

		/**
		 * The meta object literal for the '<em><b>Vv Procedure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_CASE__VV_PROCEDURE = eINSTANCE.getVVCase_VvProcedure();

		/**
		 * The meta object literal for the '<em><b>Vv Log</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_CASE__VV_LOG = eINSTANCE.getVVCase_VvLog();

		/**
		 * The meta object literal for the '<em><b>Abstract VV Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_CASE__ABSTRACT_VV_CASE = eINSTANCE.getVVCase_AbstractVVCase();

		/**
		 * The meta object literal for the '<em><b>Vv Subject</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_CASE__VV_SUBJECT = eINSTANCE.getVVCase_VvSubject();

	}

} //VerificationvalidationPackage
