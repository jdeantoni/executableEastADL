/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingFactory
 * @model kind="package"
 * @generated
 */
public interface TimingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/east_adl/timing";

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
	TimingPackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingDescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingDescriptionImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getTimingDescription()
	 * @generated
	 */
	int TIMING_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_DESCRIPTION_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__GSHORT_NAME = TIMING_DESCRIPTION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SHORT_NAME = TIMING_DESCRIPTION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CATEGORY = TIMING_DESCRIPTION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__UUID = TIMING_DESCRIPTION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = TIMING_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNED_COMMENT = TIMING_DESCRIPTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Is State Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IS_STATE_CHANGE = TIMING_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = TIMING_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = TIMING_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventChainImpl <em>Event Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventChainImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getEventChain()
	 * @generated
	 */
	int EVENT_CHAIN = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__GSHORT_NAME = TIMING_DESCRIPTION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__SHORT_NAME = TIMING_DESCRIPTION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__CATEGORY = TIMING_DESCRIPTION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__UUID = TIMING_DESCRIPTION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__NAME = TIMING_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__OWNED_COMMENT = TIMING_DESCRIPTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__RESPONSE = TIMING_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__STRAND = TIMING_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__STIMULUS = TIMING_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Segment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN__SEGMENT = TIMING_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_FEATURE_COUNT = TIMING_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Event Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_OPERATION_COUNT = TIMING_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingConstraintImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getTimingConstraint()
	 * @generated
	 */
	int TIMING_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__LOWER = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__UPPER = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__MODE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.ExecutionTimeConstraintImpl <em>Execution Time Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.ExecutionTimeConstraintImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getExecutionTimeConstraint()
	 * @generated
	 */
	int EXECUTION_TIME_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__GSHORT_NAME = TIMING_CONSTRAINT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__SHORT_NAME = TIMING_CONSTRAINT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__CATEGORY = TIMING_CONSTRAINT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__UUID = TIMING_CONSTRAINT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__OWNED_COMMENT = TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__LOWER = TIMING_CONSTRAINT__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__UPPER = TIMING_CONSTRAINT__UPPER;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__MODE = TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Target Function Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION_PROTOTYPE = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT__VARIATION = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution Time Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Execution Time Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_CONSTRAINT_OPERATION_COUNT = TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.PrecedenceConstraintImpl <em>Precedence Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.PrecedenceConstraintImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getPrecedenceConstraint()
	 * @generated
	 */
	int PRECEDENCE_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__GSHORT_NAME = TIMING_CONSTRAINT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__SHORT_NAME = TIMING_CONSTRAINT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__CATEGORY = TIMING_CONSTRAINT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__UUID = TIMING_CONSTRAINT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__NAME = TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__OWNED_COMMENT = TIMING_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__LOWER = TIMING_CONSTRAINT__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__UPPER = TIMING_CONSTRAINT__UPPER;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__MODE = TIMING_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Preceding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__PRECEDING = TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__SUCCESSIVE = TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Precedence Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_FEATURE_COUNT = TIMING_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Precedence Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_OPERATION_COUNT = TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimeDurationImpl <em>Time Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimeDurationImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getTimeDuration()
	 * @generated
	 */
	int TIME_DURATION = 4;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DURATION__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DURATION__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DURATION__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DURATION__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DURATION__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DURATION__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Cse Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DURATION__CSE_CODE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cse Code Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DURATION__CSE_CODE_FACTOR = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DURATION__VALUE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DURATION_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Time Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DURATION_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingImpl <em>Timing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getTiming()
	 * @generated
	 */
	int TIMING = 5;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__GSHORT_NAME = ElementsPackage.CONTEXT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__SHORT_NAME = ElementsPackage.CONTEXT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__CATEGORY = ElementsPackage.CONTEXT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__UUID = ElementsPackage.CONTEXT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__NAME = ElementsPackage.CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__OWNED_COMMENT = ElementsPackage.CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__GEA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__EA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__TRACEABLE_SPECIFICATION = ElementsPackage.CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__OWNED_RELATIONSHIP = ElementsPackage.CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Timing Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__TIMING_DESCRIPTION = ElementsPackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timing Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__TIMING_CONSTRAINT = ElementsPackage.CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_FEATURE_COUNT = ElementsPackage.CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATION_COUNT = ElementsPackage.CONTEXT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Event#getIsStateChange <em>Is State Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is State Change</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Event#getIsStateChange()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_IsStateChange();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain <em>Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Chain</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain
	 * @generated
	 */
	EClass getEventChain();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Response</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain#getResponse()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Response();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain#getStrand <em>Strand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strand</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain#getStrand()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Strand();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain#getStimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stimulus</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain#getStimulus()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Stimulus();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Segment</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain#getSegment()
	 * @see #getEventChain()
	 * @generated
	 */
	EReference getEventChain_Segment();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.ExecutionTimeConstraint <em>Execution Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Time Constraint</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.ExecutionTimeConstraint
	 * @generated
	 */
	EClass getExecutionTimeConstraint();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.ExecutionTimeConstraint#getTargetFunctionPrototype <em>Target Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Function Prototype</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.ExecutionTimeConstraint#getTargetFunctionPrototype()
	 * @see #getExecutionTimeConstraint()
	 * @generated
	 */
	EReference getExecutionTimeConstraint_TargetFunctionPrototype();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.ExecutionTimeConstraint#getTargetFunction <em>Target Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Function</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.ExecutionTimeConstraint#getTargetFunction()
	 * @see #getExecutionTimeConstraint()
	 * @generated
	 */
	EReference getExecutionTimeConstraint_TargetFunction();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.ExecutionTimeConstraint#getVariation <em>Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variation</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.ExecutionTimeConstraint#getVariation()
	 * @see #getExecutionTimeConstraint()
	 * @generated
	 */
	EReference getExecutionTimeConstraint_Variation();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.PrecedenceConstraint <em>Precedence Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Constraint</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.PrecedenceConstraint
	 * @generated
	 */
	EClass getPrecedenceConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.PrecedenceConstraint#getPreceding <em>Preceding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preceding</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.PrecedenceConstraint#getPreceding()
	 * @see #getPrecedenceConstraint()
	 * @generated
	 */
	EReference getPrecedenceConstraint_Preceding();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.PrecedenceConstraint#getSuccessive <em>Successive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Successive</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.PrecedenceConstraint#getSuccessive()
	 * @see #getPrecedenceConstraint()
	 * @generated
	 */
	EReference getPrecedenceConstraint_Successive();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration <em>Time Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Duration</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration
	 * @generated
	 */
	EClass getTimeDuration();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration#getCseCode <em>Cse Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cse Code</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration#getCseCode()
	 * @see #getTimeDuration()
	 * @generated
	 */
	EAttribute getTimeDuration_CseCode();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration#getCseCodeFactor <em>Cse Code Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cse Code Factor</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration#getCseCodeFactor()
	 * @see #getTimeDuration()
	 * @generated
	 */
	EAttribute getTimeDuration_CseCodeFactor();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration#getValue()
	 * @see #getTimeDuration()
	 * @generated
	 */
	EAttribute getTimeDuration_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Timing
	 * @generated
	 */
	EClass getTiming();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Timing#getTimingDescription <em>Timing Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timing Description</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Timing#getTimingDescription()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_TimingDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Timing#getTimingConstraint <em>Timing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timing Constraint</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Timing#getTimingConstraint()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_TimingConstraint();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint
	 * @generated
	 */
	EClass getTimingConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint#getLower()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EReference getTimingConstraint_Lower();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint#getUpper()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EReference getTimingConstraint_Upper();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mode</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint#getMode()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EReference getTimingConstraint_Mode();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingDescription
	 * @generated
	 */
	EClass getTimingDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimingFactory getTimingFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Is State Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__IS_STATE_CHANGE = eINSTANCE.getEvent_IsStateChange();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventChainImpl <em>Event Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventChainImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getEventChain()
		 * @generated
		 */
		EClass EVENT_CHAIN = eINSTANCE.getEventChain();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHAIN__RESPONSE = eINSTANCE.getEventChain_Response();

		/**
		 * The meta object literal for the '<em><b>Strand</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHAIN__STRAND = eINSTANCE.getEventChain_Strand();

		/**
		 * The meta object literal for the '<em><b>Stimulus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHAIN__STIMULUS = eINSTANCE.getEventChain_Stimulus();

		/**
		 * The meta object literal for the '<em><b>Segment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHAIN__SEGMENT = eINSTANCE.getEventChain_Segment();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.ExecutionTimeConstraintImpl <em>Execution Time Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.ExecutionTimeConstraintImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getExecutionTimeConstraint()
		 * @generated
		 */
		EClass EXECUTION_TIME_CONSTRAINT = eINSTANCE.getExecutionTimeConstraint();

		/**
		 * The meta object literal for the '<em><b>Target Function Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION_PROTOTYPE = eINSTANCE.getExecutionTimeConstraint_TargetFunctionPrototype();

		/**
		 * The meta object literal for the '<em><b>Target Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION = eINSTANCE.getExecutionTimeConstraint_TargetFunction();

		/**
		 * The meta object literal for the '<em><b>Variation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_TIME_CONSTRAINT__VARIATION = eINSTANCE.getExecutionTimeConstraint_Variation();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.PrecedenceConstraintImpl <em>Precedence Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.PrecedenceConstraintImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getPrecedenceConstraint()
		 * @generated
		 */
		EClass PRECEDENCE_CONSTRAINT = eINSTANCE.getPrecedenceConstraint();

		/**
		 * The meta object literal for the '<em><b>Preceding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_CONSTRAINT__PRECEDING = eINSTANCE.getPrecedenceConstraint_Preceding();

		/**
		 * The meta object literal for the '<em><b>Successive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_CONSTRAINT__SUCCESSIVE = eINSTANCE.getPrecedenceConstraint_Successive();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimeDurationImpl <em>Time Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimeDurationImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getTimeDuration()
		 * @generated
		 */
		EClass TIME_DURATION = eINSTANCE.getTimeDuration();

		/**
		 * The meta object literal for the '<em><b>Cse Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DURATION__CSE_CODE = eINSTANCE.getTimeDuration_CseCode();

		/**
		 * The meta object literal for the '<em><b>Cse Code Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DURATION__CSE_CODE_FACTOR = eINSTANCE.getTimeDuration_CseCodeFactor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DURATION__VALUE = eINSTANCE.getTimeDuration_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingImpl <em>Timing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getTiming()
		 * @generated
		 */
		EClass TIMING = eINSTANCE.getTiming();

		/**
		 * The meta object literal for the '<em><b>Timing Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__TIMING_DESCRIPTION = eINSTANCE.getTiming_TimingDescription();

		/**
		 * The meta object literal for the '<em><b>Timing Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__TIMING_CONSTRAINT = eINSTANCE.getTiming_TimingConstraint();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingConstraintImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getTimingConstraint()
		 * @generated
		 */
		EClass TIMING_CONSTRAINT = eINSTANCE.getTimingConstraint();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_CONSTRAINT__LOWER = eINSTANCE.getTimingConstraint_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_CONSTRAINT__UPPER = eINSTANCE.getTimingConstraint_Upper();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_CONSTRAINT__MODE = eINSTANCE.getTimingConstraint_Mode();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingDescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingDescriptionImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl#getTimingDescription()
		 * @generated
		 */
		EClass TIMING_DESCRIPTION = eINSTANCE.getTimingDescription();

	}

} //TimingPackage
