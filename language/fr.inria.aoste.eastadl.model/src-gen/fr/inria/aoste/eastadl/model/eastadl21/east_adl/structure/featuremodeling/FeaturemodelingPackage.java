/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturemodelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featuremodeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/east_adl/structure/featuremodeling";

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
	FeaturemodelingPackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.BindingTimeImpl <em>Binding Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.BindingTimeImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getBindingTime()
	 * @generated
	 */
	int BINDING_TIME = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TIME__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TIME__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TIME__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TIME__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TIME__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TIME__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TIME__KIND = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binding Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TIME_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binding Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_TIME_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureTreeNodeImpl <em>Feature Tree Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureTreeNodeImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getFeatureTreeNode()
	 * @generated
	 */
	int FEATURE_TREE_NODE = 6;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_NODE__GSHORT_NAME = ElementsPackage.CONTEXT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_NODE__SHORT_NAME = ElementsPackage.CONTEXT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_NODE__CATEGORY = ElementsPackage.CONTEXT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_NODE__UUID = ElementsPackage.CONTEXT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_NODE__NAME = ElementsPackage.CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_NODE__OWNED_COMMENT = ElementsPackage.CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_NODE__GEA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_NODE__EA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_NODE__TRACEABLE_SPECIFICATION = ElementsPackage.CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_NODE__OWNED_RELATIONSHIP = ElementsPackage.CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The number of structural features of the '<em>Feature Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_NODE_FEATURE_COUNT = ElementsPackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TREE_NODE_OPERATION_COUNT = ElementsPackage.CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GSHORT_NAME = FEATURE_TREE_NODE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SHORT_NAME = FEATURE_TREE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CATEGORY = FEATURE_TREE_NODE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__UUID = FEATURE_TREE_NODE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = FEATURE_TREE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_COMMENT = FEATURE_TREE_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GEA_PACKAGE_ELEMENT = FEATURE_TREE_NODE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__EA_PACKAGE_ELEMENT = FEATURE_TREE_NODE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TRACEABLE_SPECIFICATION = FEATURE_TREE_NODE__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_RELATIONSHIP = FEATURE_TREE_NODE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CARDINALITY = FEATURE_TREE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Binding Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REQUIRED_BINDING_TIME = FEATURE_TREE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actual Binding Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ACTUAL_BINDING_TIME = FEATURE_TREE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CHILD_NODE = FEATURE_TREE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feature Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_PARAMETER = FEATURE_TREE_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = FEATURE_TREE_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = FEATURE_TREE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureConstraintImpl <em>Feature Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureConstraintImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getFeatureConstraint()
	 * @generated
	 */
	int FEATURE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT__CRITERION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureGroupImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getFeatureGroup()
	 * @generated
	 */
	int FEATURE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__GSHORT_NAME = FEATURE_TREE_NODE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__SHORT_NAME = FEATURE_TREE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CATEGORY = FEATURE_TREE_NODE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__UUID = FEATURE_TREE_NODE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__NAME = FEATURE_TREE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__OWNED_COMMENT = FEATURE_TREE_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__GEA_PACKAGE_ELEMENT = FEATURE_TREE_NODE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__EA_PACKAGE_ELEMENT = FEATURE_TREE_NODE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__TRACEABLE_SPECIFICATION = FEATURE_TREE_NODE__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__OWNED_RELATIONSHIP = FEATURE_TREE_NODE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CARDINALITY = FEATURE_TREE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CHILD_FEATURE = FEATURE_TREE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_FEATURE_COUNT = FEATURE_TREE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_OPERATION_COUNT = FEATURE_TREE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureLinkImpl <em>Feature Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureLinkImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getFeatureLink()
	 * @generated
	 */
	int FEATURE_LINK = 4;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK__GSHORT_NAME = ElementsPackage.RELATIONSHIP__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK__SHORT_NAME = ElementsPackage.RELATIONSHIP__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK__CATEGORY = ElementsPackage.RELATIONSHIP__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK__UUID = ElementsPackage.RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK__NAME = ElementsPackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK__OWNED_COMMENT = ElementsPackage.RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK__IS_BIDIRECTIONAL = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK__CUSTOM_TYPE = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK__KIND = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK__END = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK__START = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Feature Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK_FEATURE_COUNT = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Feature Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LINK_OPERATION_COUNT = ElementsPackage.RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureModelImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getFeatureModel()
	 * @generated
	 */
	int FEATURE_MODEL = 5;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__GSHORT_NAME = ElementsPackage.CONTEXT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__SHORT_NAME = ElementsPackage.CONTEXT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__CATEGORY = ElementsPackage.CONTEXT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__UUID = ElementsPackage.CONTEXT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__NAME = ElementsPackage.CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__OWNED_COMMENT = ElementsPackage.CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__GEA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__EA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__TRACEABLE_SPECIFICATION = ElementsPackage.CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__OWNED_RELATIONSHIP = ElementsPackage.CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Root Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ROOT_FEATURE = ElementsPackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__FEATURE_CONSTRAINT = ElementsPackage.CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__FEATURE_LINK = ElementsPackage.CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FEATURE_COUNT = ElementsPackage.CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_OPERATION_COUNT = ElementsPackage.CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTimeKind <em>Binding Time Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTimeKind
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getBindingTimeKind()
	 * @generated
	 */
	int BINDING_TIME_KIND = 7;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.VariabilityDependencyKind <em>Variability Dependency Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.VariabilityDependencyKind
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getVariabilityDependencyKind()
	 * @generated
	 */
	int VARIABILITY_DEPENDENCY_KIND = 8;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime <em>Binding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Time</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime
	 * @generated
	 */
	EClass getBindingTime();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime#getKind()
	 * @see #getBindingTime()
	 * @generated
	 */
	EAttribute getBindingTime_Kind();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature#getCardinality()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Cardinality();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature#getRequiredBindingTime <em>Required Binding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Binding Time</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature#getRequiredBindingTime()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_RequiredBindingTime();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature#getActualBindingTime <em>Actual Binding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actual Binding Time</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature#getActualBindingTime()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_ActualBindingTime();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature#getChildNode <em>Child Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Node</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature#getChildNode()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_ChildNode();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature#getFeatureParameter <em>Feature Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Parameter</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature#getFeatureParameter()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeatureParameter();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint <em>Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Constraint</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint
	 * @generated
	 */
	EClass getFeatureConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criterion</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint#getCriterion()
	 * @see #getFeatureConstraint()
	 * @generated
	 */
	EAttribute getFeatureConstraint_Criterion();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Group</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureGroup
	 * @generated
	 */
	EClass getFeatureGroup();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureGroup#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureGroup#getCardinality()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EAttribute getFeatureGroup_Cardinality();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureGroup#getChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Feature</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureGroup#getChildFeature()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EReference getFeatureGroup_ChildFeature();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink <em>Feature Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Link</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink
	 * @generated
	 */
	EClass getFeatureLink();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink#getIsBidirectional <em>Is Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bidirectional</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink#getIsBidirectional()
	 * @see #getFeatureLink()
	 * @generated
	 */
	EAttribute getFeatureLink_IsBidirectional();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink#getCustomType <em>Custom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Type</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink#getCustomType()
	 * @see #getFeatureLink()
	 * @generated
	 */
	EAttribute getFeatureLink_CustomType();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink#getKind()
	 * @see #getFeatureLink()
	 * @generated
	 */
	EAttribute getFeatureLink_Kind();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink#getEnd()
	 * @see #getFeatureLink()
	 * @generated
	 */
	EReference getFeatureLink_End();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink#getStart()
	 * @see #getFeatureLink()
	 * @generated
	 */
	EReference getFeatureLink_Start();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel
	 * @generated
	 */
	EClass getFeatureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel#getRootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Feature</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel#getRootFeature()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_RootFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel#getFeatureConstraint <em>Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Constraint</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel#getFeatureConstraint()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_FeatureConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel#getFeatureLink <em>Feature Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Link</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel#getFeatureLink()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_FeatureLink();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureTreeNode <em>Feature Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Tree Node</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureTreeNode
	 * @generated
	 */
	EClass getFeatureTreeNode();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTimeKind <em>Binding Time Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Time Kind</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTimeKind
	 * @generated
	 */
	EEnum getBindingTimeKind();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.VariabilityDependencyKind <em>Variability Dependency Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variability Dependency Kind</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.VariabilityDependencyKind
	 * @generated
	 */
	EEnum getVariabilityDependencyKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeaturemodelingFactory getFeaturemodelingFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.BindingTimeImpl <em>Binding Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.BindingTimeImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getBindingTime()
		 * @generated
		 */
		EClass BINDING_TIME = eINSTANCE.getBindingTime();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_TIME__KIND = eINSTANCE.getBindingTime_Kind();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__CARDINALITY = eINSTANCE.getFeature_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Required Binding Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REQUIRED_BINDING_TIME = eINSTANCE.getFeature_RequiredBindingTime();

		/**
		 * The meta object literal for the '<em><b>Actual Binding Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ACTUAL_BINDING_TIME = eINSTANCE.getFeature_ActualBindingTime();

		/**
		 * The meta object literal for the '<em><b>Child Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CHILD_NODE = eINSTANCE.getFeature_ChildNode();

		/**
		 * The meta object literal for the '<em><b>Feature Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURE_PARAMETER = eINSTANCE.getFeature_FeatureParameter();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureConstraintImpl <em>Feature Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureConstraintImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getFeatureConstraint()
		 * @generated
		 */
		EClass FEATURE_CONSTRAINT = eINSTANCE.getFeatureConstraint();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CONSTRAINT__CRITERION = eINSTANCE.getFeatureConstraint_Criterion();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureGroupImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getFeatureGroup()
		 * @generated
		 */
		EClass FEATURE_GROUP = eINSTANCE.getFeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_GROUP__CARDINALITY = eINSTANCE.getFeatureGroup_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Child Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_GROUP__CHILD_FEATURE = eINSTANCE.getFeatureGroup_ChildFeature();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureLinkImpl <em>Feature Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureLinkImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getFeatureLink()
		 * @generated
		 */
		EClass FEATURE_LINK = eINSTANCE.getFeatureLink();

		/**
		 * The meta object literal for the '<em><b>Is Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_LINK__IS_BIDIRECTIONAL = eINSTANCE.getFeatureLink_IsBidirectional();

		/**
		 * The meta object literal for the '<em><b>Custom Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_LINK__CUSTOM_TYPE = eINSTANCE.getFeatureLink_CustomType();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_LINK__KIND = eINSTANCE.getFeatureLink_Kind();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_LINK__END = eINSTANCE.getFeatureLink_End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_LINK__START = eINSTANCE.getFeatureLink_Start();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureModelImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getFeatureModel()
		 * @generated
		 */
		EClass FEATURE_MODEL = eINSTANCE.getFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Root Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__ROOT_FEATURE = eINSTANCE.getFeatureModel_RootFeature();

		/**
		 * The meta object literal for the '<em><b>Feature Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__FEATURE_CONSTRAINT = eINSTANCE.getFeatureModel_FeatureConstraint();

		/**
		 * The meta object literal for the '<em><b>Feature Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__FEATURE_LINK = eINSTANCE.getFeatureModel_FeatureLink();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureTreeNodeImpl <em>Feature Tree Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureTreeNodeImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getFeatureTreeNode()
		 * @generated
		 */
		EClass FEATURE_TREE_NODE = eINSTANCE.getFeatureTreeNode();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTimeKind <em>Binding Time Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTimeKind
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getBindingTimeKind()
		 * @generated
		 */
		EEnum BINDING_TIME_KIND = eINSTANCE.getBindingTimeKind();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.VariabilityDependencyKind <em>Variability Dependency Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.VariabilityDependencyKind
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl#getVariabilityDependencyKind()
		 * @generated
		 */
		EEnum VARIABILITY_DEPENDENCY_KIND = eINSTANCE.getVariabilityDependencyKind();

	}

} //FeaturemodelingPackage
