/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase;

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
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycaseFactory
 * @model kind="package"
 * @generated
 */
public interface SafetycasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "safetycase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.aoste.executable.eastadl.eastadlmt/eastadl21/east_adl/dependability/safetycase/";

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
	SafetycasePackage eINSTANCE = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetycasePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.ClaimImpl <em>Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.ClaimImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetycasePackageImpl#getClaim()
	 * @generated
	 */
	int CLAIM = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__EVIDENCE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__JUSTIFICATION = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supported Argument</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__SUPPORTED_ARGUMENT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Safety Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__SAFETY_REQUIREMENT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Goal Decomposition Strategy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__GOAL_DECOMPOSITION_STRATEGY = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.GroundImpl <em>Ground</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.GroundImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetycasePackageImpl#getGround()
	 * @generated
	 */
	int GROUND = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Safety Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__SAFETY_EVIDENCE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND__JUSTIFICATION = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ground</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetyCaseImpl <em>Safety Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetyCaseImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetycasePackageImpl#getSafetyCase()
	 * @generated
	 */
	int SAFETY_CASE = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__STAGE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__CONTEXT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Safety Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__SAFETY_CASE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Warrant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__WARRANT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Claim</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__CLAIM = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ground</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__GROUND = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Safety Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.WarrantImpl <em>Warrant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.WarrantImpl
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetycasePackageImpl#getWarrant()
	 * @generated
	 */
	int WARRANT = 3;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANT__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANT__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANT__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANT__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANT__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANT__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANT__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANT__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANT__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Decomposed Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANT__DECOMPOSED_GOAL = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANT__EVIDENCE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANT__JUSTIFICATION = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Warrant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARRANT_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind <em>Lifecycle Stage Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetycasePackageImpl#getLifecycleStageKind()
	 * @generated
	 */
	int LIFECYCLE_STAGE_KIND = 4;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim
	 * @generated
	 */
	EClass getClaim();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evidence</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim#getEvidence()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_Evidence();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Justification</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim#getJustification()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_Justification();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim#getSupportedArgument <em>Supported Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Argument</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim#getSupportedArgument()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_SupportedArgument();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim#getSafetyRequirement <em>Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Safety Requirement</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim#getSafetyRequirement()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_SafetyRequirement();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim#getGoalDecompositionStrategy <em>Goal Decomposition Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal Decomposition Strategy</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim#getGoalDecompositionStrategy()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_GoalDecompositionStrategy();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Ground <em>Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Ground
	 * @generated
	 */
	EClass getGround();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Ground#getSafetyEvidence <em>Safety Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Safety Evidence</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Ground#getSafetyEvidence()
	 * @see #getGround()
	 * @generated
	 */
	EReference getGround_SafetyEvidence();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Ground#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Justification</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Ground#getJustification()
	 * @see #getGround()
	 * @generated
	 */
	EReference getGround_Justification();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase <em>Safety Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Case</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase
	 * @generated
	 */
	EClass getSafetyCase();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase#getStage()
	 * @see #getSafetyCase()
	 * @generated
	 */
	EAttribute getSafetyCase_Stage();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase#getContext()
	 * @see #getSafetyCase()
	 * @generated
	 */
	EAttribute getSafetyCase_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase#getSafetyCase <em>Safety Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Safety Case</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase#getSafetyCase()
	 * @see #getSafetyCase()
	 * @generated
	 */
	EReference getSafetyCase_SafetyCase();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase#getWarrant <em>Warrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Warrant</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase#getWarrant()
	 * @see #getSafetyCase()
	 * @generated
	 */
	EReference getSafetyCase_Warrant();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase#getClaim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claim</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase#getClaim()
	 * @see #getSafetyCase()
	 * @generated
	 */
	EReference getSafetyCase_Claim();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase#getGround <em>Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ground</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase#getGround()
	 * @see #getSafetyCase()
	 * @generated
	 */
	EReference getSafetyCase_Ground();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Warrant <em>Warrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warrant</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Warrant
	 * @generated
	 */
	EClass getWarrant();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Warrant#getDecomposedGoal <em>Decomposed Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decomposed Goal</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Warrant#getDecomposedGoal()
	 * @see #getWarrant()
	 * @generated
	 */
	EReference getWarrant_DecomposedGoal();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Warrant#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evidence</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Warrant#getEvidence()
	 * @see #getWarrant()
	 * @generated
	 */
	EReference getWarrant_Evidence();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Warrant#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Justification</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Warrant#getJustification()
	 * @see #getWarrant()
	 * @generated
	 */
	EReference getWarrant_Justification();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind <em>Lifecycle Stage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lifecycle Stage Kind</em>'.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind
	 * @generated
	 */
	EEnum getLifecycleStageKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SafetycaseFactory getSafetycaseFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.ClaimImpl <em>Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.ClaimImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetycasePackageImpl#getClaim()
		 * @generated
		 */
		EClass CLAIM = eINSTANCE.getClaim();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__EVIDENCE = eINSTANCE.getClaim_Evidence();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__JUSTIFICATION = eINSTANCE.getClaim_Justification();

		/**
		 * The meta object literal for the '<em><b>Supported Argument</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__SUPPORTED_ARGUMENT = eINSTANCE.getClaim_SupportedArgument();

		/**
		 * The meta object literal for the '<em><b>Safety Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__SAFETY_REQUIREMENT = eINSTANCE.getClaim_SafetyRequirement();

		/**
		 * The meta object literal for the '<em><b>Goal Decomposition Strategy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__GOAL_DECOMPOSITION_STRATEGY = eINSTANCE.getClaim_GoalDecompositionStrategy();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.GroundImpl <em>Ground</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.GroundImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetycasePackageImpl#getGround()
		 * @generated
		 */
		EClass GROUND = eINSTANCE.getGround();

		/**
		 * The meta object literal for the '<em><b>Safety Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND__SAFETY_EVIDENCE = eINSTANCE.getGround_SafetyEvidence();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND__JUSTIFICATION = eINSTANCE.getGround_Justification();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetyCaseImpl <em>Safety Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetyCaseImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetycasePackageImpl#getSafetyCase()
		 * @generated
		 */
		EClass SAFETY_CASE = eINSTANCE.getSafetyCase();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CASE__STAGE = eINSTANCE.getSafetyCase_Stage();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CASE__CONTEXT = eINSTANCE.getSafetyCase_Context();

		/**
		 * The meta object literal for the '<em><b>Safety Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CASE__SAFETY_CASE = eINSTANCE.getSafetyCase_SafetyCase();

		/**
		 * The meta object literal for the '<em><b>Warrant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CASE__WARRANT = eINSTANCE.getSafetyCase_Warrant();

		/**
		 * The meta object literal for the '<em><b>Claim</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CASE__CLAIM = eINSTANCE.getSafetyCase_Claim();

		/**
		 * The meta object literal for the '<em><b>Ground</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CASE__GROUND = eINSTANCE.getSafetyCase_Ground();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.WarrantImpl <em>Warrant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.WarrantImpl
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetycasePackageImpl#getWarrant()
		 * @generated
		 */
		EClass WARRANT = eINSTANCE.getWarrant();

		/**
		 * The meta object literal for the '<em><b>Decomposed Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WARRANT__DECOMPOSED_GOAL = eINSTANCE.getWarrant_DecomposedGoal();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WARRANT__EVIDENCE = eINSTANCE.getWarrant_Evidence();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WARRANT__JUSTIFICATION = eINSTANCE.getWarrant_Justification();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind <em>Lifecycle Stage Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind
		 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.impl.SafetycasePackageImpl#getLifecycleStageKind()
		 * @generated
		 */
		EEnum LIFECYCLE_STAGE_KIND = eINSTANCE.getLifecycleStageKind();

	}

} //SafetycasePackage
