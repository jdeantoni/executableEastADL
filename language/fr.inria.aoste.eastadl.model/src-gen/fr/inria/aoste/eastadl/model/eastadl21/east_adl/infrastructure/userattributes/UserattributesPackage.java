/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserattributesFactory
 * @model kind="package"
 * @generated
 */
public interface UserattributesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "userattributes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/east_adl/infrastructure/userattributes";

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
	UserattributesPackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserattributesPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeableElementImpl <em>User Attributeable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeableElementImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserattributesPackageImpl#getUserAttributeableElement()
	 * @generated
	 */
	int USER_ATTRIBUTEABLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Ua Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTEABLE_ELEMENT__UA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Ua Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTEABLE_ELEMENT__UA_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Attributed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTEABLE_ELEMENT__ATTRIBUTED_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>User Attributeable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTEABLE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User Attributeable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTEABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeDefinitionImpl <em>User Attribute Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeDefinitionImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserattributesPackageImpl#getUserAttributeDefinition()
	 * @generated
	 */
	int USER_ATTRIBUTE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__DEFAULT_VALUE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__TYPE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Attribute Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User Attribute Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeElementTypeImpl <em>User Attribute Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeElementTypeImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserattributesPackageImpl#getUserAttributeElementType()
	 * @generated
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE__GSHORT_NAME = ElementsPackage.EA_PACKAGEABLE_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE__SHORT_NAME = ElementsPackage.EA_PACKAGEABLE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE__CATEGORY = ElementsPackage.EA_PACKAGEABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE__UUID = ElementsPackage.EA_PACKAGEABLE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE__NAME = ElementsPackage.EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE__OWNED_COMMENT = ElementsPackage.EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE__GEA_PACKAGE_ELEMENT = ElementsPackage.EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE__EA_PACKAGE_ELEMENT = ElementsPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE__VALID_FOR = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE__ATTRIBUTE = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extended Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE__EXTENDED_ELEMENT_TYPE = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Attribute Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE_FEATURE_COUNT = ElementsPackage.EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>User Attribute Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_ELEMENT_TYPE_OPERATION_COUNT = ElementsPackage.EA_PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeValueImpl <em>User Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeValueImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserattributesPackageImpl#getUserAttributeValue()
	 * @generated
	 */
	int USER_ATTRIBUTE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_VALUE__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_VALUE__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_VALUE__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_VALUE__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_VALUE__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_VALUE__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_VALUE__SEMANTICS = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_VALUE__VALUE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_VALUE__DEFINITION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_VALUE_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>User Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_VALUE_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement <em>User Attributeable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Attributeable Element</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement
	 * @generated
	 */
	EClass getUserAttributeableElement();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement#getUaType <em>Ua Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ua Type</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement#getUaType()
	 * @see #getUserAttributeableElement()
	 * @generated
	 */
	EReference getUserAttributeableElement_UaType();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement#getUaValue <em>Ua Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ua Value</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement#getUaValue()
	 * @see #getUserAttributeableElement()
	 * @generated
	 */
	EReference getUserAttributeableElement_UaValue();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement#getAttributedElement <em>Attributed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributed Element</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement#getAttributedElement()
	 * @see #getUserAttributeableElement()
	 * @generated
	 */
	EReference getUserAttributeableElement_AttributedElement();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition <em>User Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Attribute Definition</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition
	 * @generated
	 */
	EClass getUserAttributeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition#getDefaultValue()
	 * @see #getUserAttributeDefinition()
	 * @generated
	 */
	EAttribute getUserAttributeDefinition_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition#getType()
	 * @see #getUserAttributeDefinition()
	 * @generated
	 */
	EReference getUserAttributeDefinition_Type();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType <em>User Attribute Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Attribute Element Type</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType
	 * @generated
	 */
	EClass getUserAttributeElementType();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType#getValidFor <em>Valid For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid For</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType#getValidFor()
	 * @see #getUserAttributeElementType()
	 * @generated
	 */
	EAttribute getUserAttributeElementType_ValidFor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType#getAttribute()
	 * @see #getUserAttributeElementType()
	 * @generated
	 */
	EReference getUserAttributeElementType_Attribute();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType#getExtendedElementType <em>Extended Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended Element Type</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType#getExtendedElementType()
	 * @see #getUserAttributeElementType()
	 * @generated
	 */
	EReference getUserAttributeElementType_ExtendedElementType();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue <em>User Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Attribute Value</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue
	 * @generated
	 */
	EClass getUserAttributeValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantics</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue#getSemantics()
	 * @see #getUserAttributeValue()
	 * @generated
	 */
	EAttribute getUserAttributeValue_Semantics();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue#getValue()
	 * @see #getUserAttributeValue()
	 * @generated
	 */
	EAttribute getUserAttributeValue_Value();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue#getDefinition()
	 * @see #getUserAttributeValue()
	 * @generated
	 */
	EReference getUserAttributeValue_Definition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UserattributesFactory getUserattributesFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeableElementImpl <em>User Attributeable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeableElementImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserattributesPackageImpl#getUserAttributeableElement()
		 * @generated
		 */
		EClass USER_ATTRIBUTEABLE_ELEMENT = eINSTANCE.getUserAttributeableElement();

		/**
		 * The meta object literal for the '<em><b>Ua Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTEABLE_ELEMENT__UA_TYPE = eINSTANCE.getUserAttributeableElement_UaType();

		/**
		 * The meta object literal for the '<em><b>Ua Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTEABLE_ELEMENT__UA_VALUE = eINSTANCE.getUserAttributeableElement_UaValue();

		/**
		 * The meta object literal for the '<em><b>Attributed Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTEABLE_ELEMENT__ATTRIBUTED_ELEMENT = eINSTANCE.getUserAttributeableElement_AttributedElement();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeDefinitionImpl <em>User Attribute Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeDefinitionImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserattributesPackageImpl#getUserAttributeDefinition()
		 * @generated
		 */
		EClass USER_ATTRIBUTE_DEFINITION = eINSTANCE.getUserAttributeDefinition();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTRIBUTE_DEFINITION__DEFAULT_VALUE = eINSTANCE.getUserAttributeDefinition_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE_DEFINITION__TYPE = eINSTANCE.getUserAttributeDefinition_Type();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeElementTypeImpl <em>User Attribute Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeElementTypeImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserattributesPackageImpl#getUserAttributeElementType()
		 * @generated
		 */
		EClass USER_ATTRIBUTE_ELEMENT_TYPE = eINSTANCE.getUserAttributeElementType();

		/**
		 * The meta object literal for the '<em><b>Valid For</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTRIBUTE_ELEMENT_TYPE__VALID_FOR = eINSTANCE.getUserAttributeElementType_ValidFor();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE_ELEMENT_TYPE__ATTRIBUTE = eINSTANCE.getUserAttributeElementType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Extended Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE_ELEMENT_TYPE__EXTENDED_ELEMENT_TYPE = eINSTANCE.getUserAttributeElementType_ExtendedElementType();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeValueImpl <em>User Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserAttributeValueImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserattributesPackageImpl#getUserAttributeValue()
		 * @generated
		 */
		EClass USER_ATTRIBUTE_VALUE = eINSTANCE.getUserAttributeValue();

		/**
		 * The meta object literal for the '<em><b>Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTRIBUTE_VALUE__SEMANTICS = eINSTANCE.getUserAttributeValue_Semantics();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTRIBUTE_VALUE__VALUE = eINSTANCE.getUserAttributeValue_Value();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE_VALUE__DEFINITION = eINSTANCE.getUserAttributeValue_Definition();

	}

} //UserattributesPackage
