/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/east_adl/behavior";

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
	BehaviorPackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__GSHORT_NAME = ElementsPackage.CONTEXT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__SHORT_NAME = ElementsPackage.CONTEXT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CATEGORY = ElementsPackage.CONTEXT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__UUID = ElementsPackage.CONTEXT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = ElementsPackage.CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_COMMENT = ElementsPackage.CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__GEA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__EA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__TRACEABLE_SPECIFICATION = ElementsPackage.CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_RELATIONSHIP = ElementsPackage.CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Mode Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__MODE_GROUP = ElementsPackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__BEHAVIOR = ElementsPackage.CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__FUNCTION_TRIGGER = ElementsPackage.CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = ElementsPackage.CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = ElementsPackage.CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.ModeImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__CONDITION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.ModeGroupImpl <em>Mode Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.ModeGroupImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getModeGroup()
	 * @generated
	 */
	int MODE_GROUP = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_GROUP__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_GROUP__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_GROUP__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_GROUP__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_GROUP__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_GROUP__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_GROUP__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_GROUP__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_GROUP__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_GROUP__PRECONDITION = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_GROUP__MODE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mode Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_GROUP_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mode Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_GROUP_OPERATION_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.FunctionBehaviorImpl <em>Function Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.FunctionBehaviorImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getFunctionBehavior()
	 * @generated
	 */
	int FUNCTION_BEHAVIOR = 3;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__GSHORT_NAME = ElementsPackage.CONTEXT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__SHORT_NAME = ElementsPackage.CONTEXT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__CATEGORY = ElementsPackage.CONTEXT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__UUID = ElementsPackage.CONTEXT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__NAME = ElementsPackage.CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_COMMENT = ElementsPackage.CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__GEA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__EA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__TRACEABLE_SPECIFICATION = ElementsPackage.CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_RELATIONSHIP = ElementsPackage.CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__PATH = ElementsPackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__REPRESENTATION = ElementsPackage.CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__MODE = ElementsPackage.CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__FUNCTION = ElementsPackage.CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR_FEATURE_COUNT = ElementsPackage.CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Function Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR_OPERATION_COUNT = ElementsPackage.CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.FunctionTriggerImpl <em>Function Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.FunctionTriggerImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getFunctionTrigger()
	 * @generated
	 */
	int FUNCTION_TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Trigger Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__TRIGGER_CONDITION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__TRIGGER_POLICY = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__FUNCTION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__MODE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Function Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__FUNCTION_PROTOTYPE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER__PORT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Function Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Function Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TRIGGER_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehaviorKind <em>Function Behavior Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehaviorKind
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getFunctionBehaviorKind()
	 * @generated
	 */
	int FUNCTION_BEHAVIOR_KIND = 5;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.TriggerPolicyKind <em>Trigger Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.TriggerPolicyKind
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getTriggerPolicyKind()
	 * @generated
	 */
	int TRIGGER_POLICY_KIND = 6;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Behavior#getModeGroup <em>Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mode Group</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Behavior#getModeGroup()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_ModeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Behavior#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Behavior#getBehavior()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Behavior();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Behavior#getFunctionTrigger <em>Function Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Trigger</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Behavior#getFunctionTrigger()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_FunctionTrigger();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode#getCondition()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Condition();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup <em>Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Group</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup
	 * @generated
	 */
	EClass getModeGroup();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup#getPrecondition()
	 * @see #getModeGroup()
	 * @generated
	 */
	EAttribute getModeGroup_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mode</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup#getMode()
	 * @see #getModeGroup()
	 * @generated
	 */
	EReference getModeGroup_Mode();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehavior <em>Function Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Behavior</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehavior
	 * @generated
	 */
	EClass getFunctionBehavior();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehavior#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehavior#getPath()
	 * @see #getFunctionBehavior()
	 * @generated
	 */
	EAttribute getFunctionBehavior_Path();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehavior#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehavior#getRepresentation()
	 * @see #getFunctionBehavior()
	 * @generated
	 */
	EAttribute getFunctionBehavior_Representation();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehavior#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mode</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehavior#getMode()
	 * @see #getFunctionBehavior()
	 * @generated
	 */
	EReference getFunctionBehavior_Mode();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehavior#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehavior#getFunction()
	 * @see #getFunctionBehavior()
	 * @generated
	 */
	EReference getFunctionBehavior_Function();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger <em>Function Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Trigger</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger
	 * @generated
	 */
	EClass getFunctionTrigger();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger#getTriggerCondition <em>Trigger Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Condition</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger#getTriggerCondition()
	 * @see #getFunctionTrigger()
	 * @generated
	 */
	EAttribute getFunctionTrigger_TriggerCondition();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger#getTriggerPolicy <em>Trigger Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Policy</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger#getTriggerPolicy()
	 * @see #getFunctionTrigger()
	 * @generated
	 */
	EAttribute getFunctionTrigger_TriggerPolicy();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger#getFunction()
	 * @see #getFunctionTrigger()
	 * @generated
	 */
	EReference getFunctionTrigger_Function();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mode</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger#getMode()
	 * @see #getFunctionTrigger()
	 * @generated
	 */
	EReference getFunctionTrigger_Mode();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger#getFunctionPrototype <em>Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Prototype</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger#getFunctionPrototype()
	 * @see #getFunctionTrigger()
	 * @generated
	 */
	EReference getFunctionTrigger_FunctionPrototype();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger#getPort()
	 * @see #getFunctionTrigger()
	 * @generated
	 */
	EReference getFunctionTrigger_Port();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehaviorKind <em>Function Behavior Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Behavior Kind</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehaviorKind
	 * @generated
	 */
	EEnum getFunctionBehaviorKind();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.TriggerPolicyKind <em>Trigger Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Policy Kind</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.TriggerPolicyKind
	 * @generated
	 */
	EEnum getTriggerPolicyKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviorFactory getBehaviorFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Mode Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__MODE_GROUP = eINSTANCE.getBehavior_ModeGroup();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__BEHAVIOR = eINSTANCE.getBehavior_Behavior();

		/**
		 * The meta object literal for the '<em><b>Function Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__FUNCTION_TRIGGER = eINSTANCE.getBehavior_FunctionTrigger();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.ModeImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getMode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE__CONDITION = eINSTANCE.getMode_Condition();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.ModeGroupImpl <em>Mode Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.ModeGroupImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getModeGroup()
		 * @generated
		 */
		EClass MODE_GROUP = eINSTANCE.getModeGroup();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE_GROUP__PRECONDITION = eINSTANCE.getModeGroup_Precondition();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_GROUP__MODE = eINSTANCE.getModeGroup_Mode();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.FunctionBehaviorImpl <em>Function Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.FunctionBehaviorImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getFunctionBehavior()
		 * @generated
		 */
		EClass FUNCTION_BEHAVIOR = eINSTANCE.getFunctionBehavior();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_BEHAVIOR__PATH = eINSTANCE.getFunctionBehavior_Path();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_BEHAVIOR__REPRESENTATION = eINSTANCE.getFunctionBehavior_Representation();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BEHAVIOR__MODE = eINSTANCE.getFunctionBehavior_Mode();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BEHAVIOR__FUNCTION = eINSTANCE.getFunctionBehavior_Function();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.FunctionTriggerImpl <em>Function Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.FunctionTriggerImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getFunctionTrigger()
		 * @generated
		 */
		EClass FUNCTION_TRIGGER = eINSTANCE.getFunctionTrigger();

		/**
		 * The meta object literal for the '<em><b>Trigger Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_TRIGGER__TRIGGER_CONDITION = eINSTANCE.getFunctionTrigger_TriggerCondition();

		/**
		 * The meta object literal for the '<em><b>Trigger Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_TRIGGER__TRIGGER_POLICY = eINSTANCE.getFunctionTrigger_TriggerPolicy();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TRIGGER__FUNCTION = eINSTANCE.getFunctionTrigger_Function();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TRIGGER__MODE = eINSTANCE.getFunctionTrigger_Mode();

		/**
		 * The meta object literal for the '<em><b>Function Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TRIGGER__FUNCTION_PROTOTYPE = eINSTANCE.getFunctionTrigger_FunctionPrototype();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TRIGGER__PORT = eINSTANCE.getFunctionTrigger_Port();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehaviorKind <em>Function Behavior Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehaviorKind
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getFunctionBehaviorKind()
		 * @generated
		 */
		EEnum FUNCTION_BEHAVIOR_KIND = eINSTANCE.getFunctionBehaviorKind();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.TriggerPolicyKind <em>Trigger Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.TriggerPolicyKind
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl#getTriggerPolicyKind()
		 * @generated
		 */
		EEnum TRIGGER_POLICY_KIND = eINSTANCE.getTriggerPolicyKind();

	}

} //BehaviorPackage
