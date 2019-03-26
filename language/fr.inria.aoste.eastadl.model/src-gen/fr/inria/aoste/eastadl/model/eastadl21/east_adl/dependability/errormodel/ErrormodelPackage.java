/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelFactory
 * @model kind="package"
 * @generated
 */
public interface ErrormodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "errormodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/east_adl/dependability/errormodel";

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
	ErrormodelPackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.AnomalyImpl <em>Anomaly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.AnomalyImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getAnomaly()
	 * @generated
	 */
	int ANOMALY = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Generic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY__GENERIC_DESCRIPTION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY__TYPE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Anomaly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Anomaly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorBehaviorImpl <em>Error Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorBehaviorImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getErrorBehavior()
	 * @generated
	 */
	int ERROR_BEHAVIOR = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__TYPE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__FAILURE_LOGIC = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Internal Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__INTERNAL_FAULT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__EXTERNAL_FAULT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__EXTERNAL_FAILURE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Process Fault</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__PROCESS_FAULT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR__OWNER = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Error Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Error Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_BEHAVIOR_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelPrototypeImpl <em>Error Model Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelPrototypeImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getErrorModelPrototype()
	 * @generated
	 */
	int ERROR_MODEL_PROTOTYPE = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE__TARGET = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE__TYPE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hw Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE__HW_TARGET = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External Fault proxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE__EXTERNAL_FAULT_PROXY = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Failure proxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE__FAILURE_PROXY = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Error Model Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Error Model Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROTOTYPE_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl <em>Error Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getErrorModelType()
	 * @generated
	 */
	int ERROR_MODEL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Generic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__GENERIC_DESCRIPTION = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Behavior Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__TARGET = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hw Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__HW_TARGET = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault Failure Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>External Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__EXTERNAL_FAULT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__PART = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__FAILURE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Internal Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__INTERNAL_FAULT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Process Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__PROCESS_FAULT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Error Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Error Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE_OPERATION_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePortImpl <em>Fault Failure Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePortImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFaultFailurePort()
	 * @generated
	 */
	int FAULT_FAILURE_PORT = 5;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT__GSHORT_NAME = ANOMALY__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT__SHORT_NAME = ANOMALY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT__CATEGORY = ANOMALY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT__UUID = ANOMALY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT__NAME = ANOMALY__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT__OWNED_COMMENT = ANOMALY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Generic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT__GENERIC_DESCRIPTION = ANOMALY__GENERIC_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT__TYPE = ANOMALY__TYPE;

	/**
	 * The feature id for the '<em><b>Function Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT__FUNCTION_TARGET = ANOMALY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hw Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT__HW_TARGET = ANOMALY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fault Failure Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT_FEATURE_COUNT = ANOMALY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fault Failure Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT_OPERATION_COUNT = ANOMALY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FailureOutPortImpl <em>Failure Out Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FailureOutPortImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFailureOutPort()
	 * @generated
	 */
	int FAILURE_OUT_PORT = 4;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT__GSHORT_NAME = FAULT_FAILURE_PORT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT__SHORT_NAME = FAULT_FAILURE_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT__CATEGORY = FAULT_FAILURE_PORT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT__UUID = FAULT_FAILURE_PORT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT__NAME = FAULT_FAILURE_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT__OWNED_COMMENT = FAULT_FAILURE_PORT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Generic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT__GENERIC_DESCRIPTION = FAULT_FAILURE_PORT__GENERIC_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT__TYPE = FAULT_FAILURE_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Function Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT__FUNCTION_TARGET = FAULT_FAILURE_PORT__FUNCTION_TARGET;

	/**
	 * The feature id for the '<em><b>Hw Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT__HW_TARGET = FAULT_FAILURE_PORT__HW_TARGET;

	/**
	 * The number of structural features of the '<em>Failure Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT_FEATURE_COUNT = FAULT_FAILURE_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Failure Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT_OPERATION_COUNT = FAULT_FAILURE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePropagationLinkImpl <em>Fault Failure Propagation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePropagationLinkImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFaultFailurePropagationLink()
	 * @generated
	 */
	int FAULT_FAILURE_PROPAGATION_LINK = 6;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Immediate Propagation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK__TO_PORT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fault Failure Propagation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Fault Failure Propagation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PROPAGATION_LINK_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultInPortImpl <em>Fault In Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultInPortImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFaultInPort()
	 * @generated
	 */
	int FAULT_IN_PORT = 7;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT__GSHORT_NAME = FAULT_FAILURE_PORT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT__SHORT_NAME = FAULT_FAILURE_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT__CATEGORY = FAULT_FAILURE_PORT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT__UUID = FAULT_FAILURE_PORT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT__NAME = FAULT_FAILURE_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT__OWNED_COMMENT = FAULT_FAILURE_PORT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Generic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT__GENERIC_DESCRIPTION = FAULT_FAILURE_PORT__GENERIC_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT__TYPE = FAULT_FAILURE_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Function Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT__FUNCTION_TARGET = FAULT_FAILURE_PORT__FUNCTION_TARGET;

	/**
	 * The feature id for the '<em><b>Hw Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT__HW_TARGET = FAULT_FAILURE_PORT__HW_TARGET;

	/**
	 * The number of structural features of the '<em>Fault In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT_FEATURE_COUNT = FAULT_FAILURE_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fault In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT_OPERATION_COUNT = FAULT_FAILURE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.InternalFaultPrototypeImpl <em>Internal Fault Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.InternalFaultPrototypeImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getInternalFaultPrototype()
	 * @generated
	 */
	int INTERNAL_FAULT_PROTOTYPE = 8;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAULT_PROTOTYPE__GSHORT_NAME = ANOMALY__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAULT_PROTOTYPE__SHORT_NAME = ANOMALY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAULT_PROTOTYPE__CATEGORY = ANOMALY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAULT_PROTOTYPE__UUID = ANOMALY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAULT_PROTOTYPE__NAME = ANOMALY__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAULT_PROTOTYPE__OWNED_COMMENT = ANOMALY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Generic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAULT_PROTOTYPE__GENERIC_DESCRIPTION = ANOMALY__GENERIC_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAULT_PROTOTYPE__TYPE = ANOMALY__TYPE;

	/**
	 * The number of structural features of the '<em>Internal Fault Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAULT_PROTOTYPE_FEATURE_COUNT = ANOMALY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Fault Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAULT_PROTOTYPE_OPERATION_COUNT = ANOMALY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ProcessFaultPrototypeImpl <em>Process Fault Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ProcessFaultPrototypeImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getProcessFaultPrototype()
	 * @generated
	 */
	int PROCESS_FAULT_PROTOTYPE = 9;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FAULT_PROTOTYPE__GSHORT_NAME = ANOMALY__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FAULT_PROTOTYPE__SHORT_NAME = ANOMALY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FAULT_PROTOTYPE__CATEGORY = ANOMALY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FAULT_PROTOTYPE__UUID = ANOMALY__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FAULT_PROTOTYPE__NAME = ANOMALY__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FAULT_PROTOTYPE__OWNED_COMMENT = ANOMALY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Generic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FAULT_PROTOTYPE__GENERIC_DESCRIPTION = ANOMALY__GENERIC_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FAULT_PROTOTYPE__TYPE = ANOMALY__TYPE;

	/**
	 * The number of structural features of the '<em>Process Fault Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FAULT_PROTOTYPE_FEATURE_COUNT = ANOMALY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Fault Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FAULT_PROTOTYPE_OPERATION_COUNT = ANOMALY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePortProxyImpl <em>Fault Failure Port Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePortProxyImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFaultFailurePortProxy()
	 * @generated
	 */
	int FAULT_FAILURE_PORT_PROXY = 10;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT_PROXY__PORT = 0;

	/**
	 * The number of structural features of the '<em>Fault Failure Port Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT_PROXY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fault Failure Port Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_PORT_PROXY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultInPortProxyImpl <em>Fault In Port Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultInPortProxyImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFaultInPortProxy()
	 * @generated
	 */
	int FAULT_IN_PORT_PROXY = 11;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT_PROXY__PORT = FAULT_FAILURE_PORT_PROXY__PORT;

	/**
	 * The number of structural features of the '<em>Fault In Port Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT_PROXY_FEATURE_COUNT = FAULT_FAILURE_PORT_PROXY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fault In Port Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_IN_PORT_PROXY_OPERATION_COUNT = FAULT_FAILURE_PORT_PROXY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FailureOutPortProxyImpl <em>Failure Out Port Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FailureOutPortProxyImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFailureOutPortProxy()
	 * @generated
	 */
	int FAILURE_OUT_PORT_PROXY = 12;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT_PROXY__PORT = FAULT_FAILURE_PORT_PROXY__PORT;

	/**
	 * The number of structural features of the '<em>Failure Out Port Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT_PROXY_FEATURE_COUNT = FAULT_FAILURE_PORT_PROXY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Failure Out Port Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OUT_PORT_PROXY_OPERATION_COUNT = FAULT_FAILURE_PORT_PROXY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorKind <em>Error Behavior Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorKind
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getErrorBehaviorKind()
	 * @generated
	 */
	int ERROR_BEHAVIOR_KIND = 13;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.Anomaly <em>Anomaly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anomaly</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.Anomaly
	 * @generated
	 */
	EClass getAnomaly();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.Anomaly#getGenericDescription <em>Generic Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Description</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.Anomaly#getGenericDescription()
	 * @see #getAnomaly()
	 * @generated
	 */
	EAttribute getAnomaly_GenericDescription();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.Anomaly#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.Anomaly#getType()
	 * @see #getAnomaly()
	 * @generated
	 */
	EReference getAnomaly_Type();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior <em>Error Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Behavior</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior
	 * @generated
	 */
	EClass getErrorBehavior();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getType()
	 * @see #getErrorBehavior()
	 * @generated
	 */
	EAttribute getErrorBehavior_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getFailureLogic <em>Failure Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Logic</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getFailureLogic()
	 * @see #getErrorBehavior()
	 * @generated
	 */
	EAttribute getErrorBehavior_FailureLogic();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getInternalFault <em>Internal Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Internal Fault</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getInternalFault()
	 * @see #getErrorBehavior()
	 * @generated
	 */
	EReference getErrorBehavior_InternalFault();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getExternalFault <em>External Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Fault</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getExternalFault()
	 * @see #getErrorBehavior()
	 * @generated
	 */
	EReference getErrorBehavior_ExternalFault();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getExternalFailure <em>External Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Failure</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getExternalFailure()
	 * @see #getErrorBehavior()
	 * @generated
	 */
	EReference getErrorBehavior_ExternalFailure();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getProcessFault <em>Process Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Fault</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getProcessFault()
	 * @see #getErrorBehavior()
	 * @generated
	 */
	EReference getErrorBehavior_ProcessFault();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior#getOwner()
	 * @see #getErrorBehavior()
	 * @generated
	 */
	EReference getErrorBehavior_Owner();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype <em>Error Model Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model Prototype</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype
	 * @generated
	 */
	EClass getErrorModelPrototype();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype#getTarget()
	 * @see #getErrorModelPrototype()
	 * @generated
	 */
	EReference getErrorModelPrototype_Target();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype#getType()
	 * @see #getErrorModelPrototype()
	 * @generated
	 */
	EReference getErrorModelPrototype_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype#getFunctionTarget <em>Function Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Target</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype#getFunctionTarget()
	 * @see #getErrorModelPrototype()
	 * @generated
	 */
	EReference getErrorModelPrototype_FunctionTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype#getHwTarget <em>Hw Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hw Target</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype#getHwTarget()
	 * @see #getErrorModelPrototype()
	 * @generated
	 */
	EReference getErrorModelPrototype_HwTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype#getExternalFault_proxy <em>External Fault proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Fault proxy</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype#getExternalFault_proxy()
	 * @see #getErrorModelPrototype()
	 * @generated
	 */
	EReference getErrorModelPrototype_ExternalFault_proxy();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype#getFailure_proxy <em>Failure proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure proxy</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype#getFailure_proxy()
	 * @see #getErrorModelPrototype()
	 * @generated
	 */
	EReference getErrorModelPrototype_Failure_proxy();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType <em>Error Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model Type</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType
	 * @generated
	 */
	EClass getErrorModelType();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getGenericDescription <em>Generic Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Description</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getGenericDescription()
	 * @see #getErrorModelType()
	 * @generated
	 */
	EAttribute getErrorModelType_GenericDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getErrorBehaviorDescription <em>Error Behavior Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Behavior Description</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getErrorBehaviorDescription()
	 * @see #getErrorModelType()
	 * @generated
	 */
	EReference getErrorModelType_ErrorBehaviorDescription();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getTarget()
	 * @see #getErrorModelType()
	 * @generated
	 */
	EReference getErrorModelType_Target();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getHwTarget <em>Hw Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hw Target</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getHwTarget()
	 * @see #getErrorModelType()
	 * @generated
	 */
	EReference getErrorModelType_HwTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getFaultFailureConnector <em>Fault Failure Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fault Failure Connector</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getFaultFailureConnector()
	 * @see #getErrorModelType()
	 * @generated
	 */
	EReference getErrorModelType_FaultFailureConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getExternalFault <em>External Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Fault</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getExternalFault()
	 * @see #getErrorModelType()
	 * @generated
	 */
	EReference getErrorModelType_ExternalFault();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getPart()
	 * @see #getErrorModelType()
	 * @generated
	 */
	EReference getErrorModelType_Part();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getFailure()
	 * @see #getErrorModelType()
	 * @generated
	 */
	EReference getErrorModelType_Failure();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getInternalFault <em>Internal Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Fault</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getInternalFault()
	 * @see #getErrorModelType()
	 * @generated
	 */
	EReference getErrorModelType_InternalFault();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getProcessFault <em>Process Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Fault</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType#getProcessFault()
	 * @see #getErrorModelType()
	 * @generated
	 */
	EReference getErrorModelType_ProcessFault();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FailureOutPort <em>Failure Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Out Port</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FailureOutPort
	 * @generated
	 */
	EClass getFailureOutPort();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePort <em>Fault Failure Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Failure Port</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePort
	 * @generated
	 */
	EClass getFaultFailurePort();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePort#getFunctionTarget <em>Function Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Target</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePort#getFunctionTarget()
	 * @see #getFaultFailurePort()
	 * @generated
	 */
	EReference getFaultFailurePort_FunctionTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePort#getHwTarget <em>Hw Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hw Target</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePort#getHwTarget()
	 * @see #getFaultFailurePort()
	 * @generated
	 */
	EReference getFaultFailurePort_HwTarget();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink <em>Fault Failure Propagation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Failure Propagation Link</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink
	 * @generated
	 */
	EClass getFaultFailurePropagationLink();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getImmediatePropagation <em>Immediate Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate Propagation</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getImmediatePropagation()
	 * @see #getFaultFailurePropagationLink()
	 * @generated
	 */
	EAttribute getFaultFailurePropagationLink_ImmediatePropagation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getFromPort <em>From Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Port</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getFromPort()
	 * @see #getFaultFailurePropagationLink()
	 * @generated
	 */
	EReference getFaultFailurePropagationLink_FromPort();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getToPort <em>To Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Port</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink#getToPort()
	 * @see #getFaultFailurePropagationLink()
	 * @generated
	 */
	EReference getFaultFailurePropagationLink_ToPort();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultInPort <em>Fault In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault In Port</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultInPort
	 * @generated
	 */
	EClass getFaultInPort();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototype <em>Internal Fault Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Fault Prototype</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototype
	 * @generated
	 */
	EClass getInternalFaultPrototype();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype <em>Process Fault Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Fault Prototype</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype
	 * @generated
	 */
	EClass getProcessFaultPrototype();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxy <em>Fault Failure Port Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Failure Port Proxy</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxy
	 * @generated
	 */
	EClass getFaultFailurePortProxy();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxy#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxy#getPort()
	 * @see #getFaultFailurePortProxy()
	 * @generated
	 */
	EReference getFaultFailurePortProxy_Port();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultInPortProxy <em>Fault In Port Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault In Port Proxy</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultInPortProxy
	 * @generated
	 */
	EClass getFaultInPortProxy();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FailureOutPortProxy <em>Failure Out Port Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Out Port Proxy</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FailureOutPortProxy
	 * @generated
	 */
	EClass getFailureOutPortProxy();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorKind <em>Error Behavior Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Error Behavior Kind</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorKind
	 * @generated
	 */
	EEnum getErrorBehaviorKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ErrormodelFactory getErrormodelFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.AnomalyImpl <em>Anomaly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.AnomalyImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getAnomaly()
		 * @generated
		 */
		EClass ANOMALY = eINSTANCE.getAnomaly();

		/**
		 * The meta object literal for the '<em><b>Generic Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOMALY__GENERIC_DESCRIPTION = eINSTANCE.getAnomaly_GenericDescription();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANOMALY__TYPE = eINSTANCE.getAnomaly_Type();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorBehaviorImpl <em>Error Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorBehaviorImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getErrorBehavior()
		 * @generated
		 */
		EClass ERROR_BEHAVIOR = eINSTANCE.getErrorBehavior();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_BEHAVIOR__TYPE = eINSTANCE.getErrorBehavior_Type();

		/**
		 * The meta object literal for the '<em><b>Failure Logic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_BEHAVIOR__FAILURE_LOGIC = eINSTANCE.getErrorBehavior_FailureLogic();

		/**
		 * The meta object literal for the '<em><b>Internal Fault</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR__INTERNAL_FAULT = eINSTANCE.getErrorBehavior_InternalFault();

		/**
		 * The meta object literal for the '<em><b>External Fault</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR__EXTERNAL_FAULT = eINSTANCE.getErrorBehavior_ExternalFault();

		/**
		 * The meta object literal for the '<em><b>External Failure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR__EXTERNAL_FAILURE = eINSTANCE.getErrorBehavior_ExternalFailure();

		/**
		 * The meta object literal for the '<em><b>Process Fault</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR__PROCESS_FAULT = eINSTANCE.getErrorBehavior_ProcessFault();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_BEHAVIOR__OWNER = eINSTANCE.getErrorBehavior_Owner();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelPrototypeImpl <em>Error Model Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelPrototypeImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getErrorModelPrototype()
		 * @generated
		 */
		EClass ERROR_MODEL_PROTOTYPE = eINSTANCE.getErrorModelPrototype();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_PROTOTYPE__TARGET = eINSTANCE.getErrorModelPrototype_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_PROTOTYPE__TYPE = eINSTANCE.getErrorModelPrototype_Type();

		/**
		 * The meta object literal for the '<em><b>Function Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET = eINSTANCE.getErrorModelPrototype_FunctionTarget();

		/**
		 * The meta object literal for the '<em><b>Hw Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_PROTOTYPE__HW_TARGET = eINSTANCE.getErrorModelPrototype_HwTarget();

		/**
		 * The meta object literal for the '<em><b>External Fault proxy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_PROTOTYPE__EXTERNAL_FAULT_PROXY = eINSTANCE.getErrorModelPrototype_ExternalFault_proxy();

		/**
		 * The meta object literal for the '<em><b>Failure proxy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_PROTOTYPE__FAILURE_PROXY = eINSTANCE.getErrorModelPrototype_Failure_proxy();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl <em>Error Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrorModelTypeImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getErrorModelType()
		 * @generated
		 */
		EClass ERROR_MODEL_TYPE = eINSTANCE.getErrorModelType();

		/**
		 * The meta object literal for the '<em><b>Generic Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_MODEL_TYPE__GENERIC_DESCRIPTION = eINSTANCE.getErrorModelType_GenericDescription();

		/**
		 * The meta object literal for the '<em><b>Error Behavior Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION = eINSTANCE.getErrorModelType_ErrorBehaviorDescription();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_TYPE__TARGET = eINSTANCE.getErrorModelType_Target();

		/**
		 * The meta object literal for the '<em><b>Hw Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_TYPE__HW_TARGET = eINSTANCE.getErrorModelType_HwTarget();

		/**
		 * The meta object literal for the '<em><b>Fault Failure Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR = eINSTANCE.getErrorModelType_FaultFailureConnector();

		/**
		 * The meta object literal for the '<em><b>External Fault</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_TYPE__EXTERNAL_FAULT = eINSTANCE.getErrorModelType_ExternalFault();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_TYPE__PART = eINSTANCE.getErrorModelType_Part();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_TYPE__FAILURE = eINSTANCE.getErrorModelType_Failure();

		/**
		 * The meta object literal for the '<em><b>Internal Fault</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_TYPE__INTERNAL_FAULT = eINSTANCE.getErrorModelType_InternalFault();

		/**
		 * The meta object literal for the '<em><b>Process Fault</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_TYPE__PROCESS_FAULT = eINSTANCE.getErrorModelType_ProcessFault();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FailureOutPortImpl <em>Failure Out Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FailureOutPortImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFailureOutPort()
		 * @generated
		 */
		EClass FAILURE_OUT_PORT = eINSTANCE.getFailureOutPort();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePortImpl <em>Fault Failure Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePortImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFaultFailurePort()
		 * @generated
		 */
		EClass FAULT_FAILURE_PORT = eINSTANCE.getFaultFailurePort();

		/**
		 * The meta object literal for the '<em><b>Function Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_FAILURE_PORT__FUNCTION_TARGET = eINSTANCE.getFaultFailurePort_FunctionTarget();

		/**
		 * The meta object literal for the '<em><b>Hw Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_FAILURE_PORT__HW_TARGET = eINSTANCE.getFaultFailurePort_HwTarget();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePropagationLinkImpl <em>Fault Failure Propagation Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePropagationLinkImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFaultFailurePropagationLink()
		 * @generated
		 */
		EClass FAULT_FAILURE_PROPAGATION_LINK = eINSTANCE.getFaultFailurePropagationLink();

		/**
		 * The meta object literal for the '<em><b>Immediate Propagation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION = eINSTANCE.getFaultFailurePropagationLink_ImmediatePropagation();

		/**
		 * The meta object literal for the '<em><b>From Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT = eINSTANCE.getFaultFailurePropagationLink_FromPort();

		/**
		 * The meta object literal for the '<em><b>To Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_FAILURE_PROPAGATION_LINK__TO_PORT = eINSTANCE.getFaultFailurePropagationLink_ToPort();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultInPortImpl <em>Fault In Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultInPortImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFaultInPort()
		 * @generated
		 */
		EClass FAULT_IN_PORT = eINSTANCE.getFaultInPort();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.InternalFaultPrototypeImpl <em>Internal Fault Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.InternalFaultPrototypeImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getInternalFaultPrototype()
		 * @generated
		 */
		EClass INTERNAL_FAULT_PROTOTYPE = eINSTANCE.getInternalFaultPrototype();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ProcessFaultPrototypeImpl <em>Process Fault Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ProcessFaultPrototypeImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getProcessFaultPrototype()
		 * @generated
		 */
		EClass PROCESS_FAULT_PROTOTYPE = eINSTANCE.getProcessFaultPrototype();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePortProxyImpl <em>Fault Failure Port Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultFailurePortProxyImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFaultFailurePortProxy()
		 * @generated
		 */
		EClass FAULT_FAILURE_PORT_PROXY = eINSTANCE.getFaultFailurePortProxy();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_FAILURE_PORT_PROXY__PORT = eINSTANCE.getFaultFailurePortProxy_Port();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultInPortProxyImpl <em>Fault In Port Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FaultInPortProxyImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFaultInPortProxy()
		 * @generated
		 */
		EClass FAULT_IN_PORT_PROXY = eINSTANCE.getFaultInPortProxy();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FailureOutPortProxyImpl <em>Failure Out Port Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.FailureOutPortProxyImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getFailureOutPortProxy()
		 * @generated
		 */
		EClass FAILURE_OUT_PORT_PROXY = eINSTANCE.getFailureOutPortProxy();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorKind <em>Error Behavior Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorKind
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl#getErrorBehaviorKind()
		 * @generated
		 */
		EEnum ERROR_BEHAVIOR_KIND = eINSTANCE.getErrorBehaviorKind();

	}

} //ErrormodelPackage
