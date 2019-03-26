/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

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
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.aoste.eastadl.xdsml.xeastadl/eastadl21/east_adl/infrastructure/datatypes/";

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
	DatatypesPackage eINSTANCE = fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EADatatypeImpl <em>EA Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EADatatypeImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEADatatype()
	 * @generated
	 */
	int EA_DATATYPE = 4;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The number of structural features of the '<em>EA Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.ValueTypeImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__GSHORT_NAME = EA_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__SHORT_NAME = EA_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__CATEGORY = EA_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__UUID = EA_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__GEA_PACKAGE_ELEMENT = EA_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__EA_PACKAGE_ELEMENT = EA_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__TEXT = EA_DATATYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__DIMENSION = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__UNIT = EA_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__SEMANTICS = EA_DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationValueTypeImpl <em>Enumeration Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationValueTypeImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEnumerationValueType()
	 * @generated
	 */
	int ENUMERATION_VALUE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__GSHORT_NAME = VALUE_TYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__SHORT_NAME = VALUE_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__CATEGORY = VALUE_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__UUID = VALUE_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__OWNED_COMMENT = VALUE_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__GEA_PACKAGE_ELEMENT = VALUE_TYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__EA_PACKAGE_ELEMENT = VALUE_TYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__TEXT = VALUE_TYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__DIMENSION = VALUE_TYPE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__UNIT = VALUE_TYPE__UNIT;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__SEMANTICS = VALUE_TYPE__SEMANTICS;

	/**
	 * The feature id for the '<em><b>Literal Semantics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__LITERAL_SEMANTICS = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__IS_MULTI_VALUED = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__BASE_ENUMERATION = VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enumeration Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.RangeableValueTypeImpl <em>Rangeable Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.RangeableValueTypeImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getRangeableValueType()
	 * @generated
	 */
	int RANGEABLE_VALUE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__GSHORT_NAME = VALUE_TYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__SHORT_NAME = VALUE_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__CATEGORY = VALUE_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__UUID = VALUE_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__OWNED_COMMENT = VALUE_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__GEA_PACKAGE_ELEMENT = VALUE_TYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__EA_PACKAGE_ELEMENT = VALUE_TYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__TEXT = VALUE_TYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__DIMENSION = VALUE_TYPE__DIMENSION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__UNIT = VALUE_TYPE__UNIT;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__SEMANTICS = VALUE_TYPE__SEMANTICS;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__ACCURACY = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__RESOLUTION = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Significant Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS = VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Rangeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__BASE_RANGEABLE = VALUE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rangeable Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.CompositeDatatypeImpl <em>Composite Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.CompositeDatatypeImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getCompositeDatatype()
	 * @generated
	 */
	int COMPOSITE_DATATYPE = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__GSHORT_NAME = EA_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__SHORT_NAME = EA_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__CATEGORY = EA_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__UUID = EA_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__GEA_PACKAGE_ELEMENT = EA_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__EA_PACKAGE_ELEMENT = EA_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__TEXT = EA_DATATYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Datatype Prototype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EABooleanImpl <em>EA Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EABooleanImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEABoolean()
	 * @generated
	 */
	int EA_BOOLEAN = 3;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__GSHORT_NAME = EA_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__SHORT_NAME = EA_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__CATEGORY = EA_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__UUID = EA_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__GEA_PACKAGE_ELEMENT = EA_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__EA_PACKAGE_ELEMENT = EA_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__TEXT = EA_DATATYPE__TEXT;

	/**
	 * The number of structural features of the '<em>EA Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EADatatypePrototypeImpl <em>EA Datatype Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EADatatypePrototypeImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEADatatypePrototype()
	 * @generated
	 */
	int EA_DATATYPE_PROTOTYPE = 5;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__TYPE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Datatype Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.RangeableDatatypeImpl <em>Rangeable Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.RangeableDatatypeImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getRangeableDatatype()
	 * @generated
	 */
	int RANGEABLE_DATATYPE = 11;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_DATATYPE__GSHORT_NAME = EA_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_DATATYPE__SHORT_NAME = EA_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_DATATYPE__CATEGORY = EA_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_DATATYPE__UUID = EA_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_DATATYPE__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_DATATYPE__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_DATATYPE__GEA_PACKAGE_ELEMENT = EA_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_DATATYPE__EA_PACKAGE_ELEMENT = EA_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_DATATYPE__TEXT = EA_DATATYPE__TEXT;

	/**
	 * The number of structural features of the '<em>Rangeable Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_DATATYPE_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EAFloatImpl <em>EA Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EAFloatImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEAFloat()
	 * @generated
	 */
	int EA_FLOAT = 6;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOAT__GSHORT_NAME = RANGEABLE_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOAT__SHORT_NAME = RANGEABLE_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOAT__CATEGORY = RANGEABLE_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOAT__UUID = RANGEABLE_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOAT__NAME = RANGEABLE_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOAT__OWNED_COMMENT = RANGEABLE_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOAT__GEA_PACKAGE_ELEMENT = RANGEABLE_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOAT__EA_PACKAGE_ELEMENT = RANGEABLE_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOAT__TEXT = RANGEABLE_DATATYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOAT__MIN = RANGEABLE_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOAT__MAX = RANGEABLE_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EA Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_FLOAT_FEATURE_COUNT = RANGEABLE_DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EAIntegerImpl <em>EA Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EAIntegerImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEAInteger()
	 * @generated
	 */
	int EA_INTEGER = 7;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTEGER__GSHORT_NAME = RANGEABLE_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTEGER__SHORT_NAME = RANGEABLE_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTEGER__CATEGORY = RANGEABLE_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTEGER__UUID = RANGEABLE_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTEGER__NAME = RANGEABLE_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTEGER__OWNED_COMMENT = RANGEABLE_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTEGER__GEA_PACKAGE_ELEMENT = RANGEABLE_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTEGER__EA_PACKAGE_ELEMENT = RANGEABLE_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTEGER__TEXT = RANGEABLE_DATATYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTEGER__MIN = RANGEABLE_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTEGER__MAX = RANGEABLE_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EA Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_INTEGER_FEATURE_COUNT = RANGEABLE_DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EAStringImpl <em>EA String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EAStringImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEAString()
	 * @generated
	 */
	int EA_STRING = 8;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__GSHORT_NAME = EA_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__SHORT_NAME = EA_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__CATEGORY = EA_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__UUID = EA_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__GEA_PACKAGE_ELEMENT = EA_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__EA_PACKAGE_ELEMENT = EA_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__TEXT = EA_DATATYPE__TEXT;

	/**
	 * The number of structural features of the '<em>EA String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 9;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__GSHORT_NAME = EA_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__SHORT_NAME = EA_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CATEGORY = EA_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__UUID = EA_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__GEA_PACKAGE_ELEMENT = EA_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__EA_PACKAGE_ELEMENT = EA_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__TEXT = EA_DATATYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERAL = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationLiteralImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 10;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType <em>Enumeration Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Value Type</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType
	 * @generated
	 */
	EClass getEnumerationValueType();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getLiteralSemantics <em>Literal Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literal Semantics</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getLiteralSemantics()
	 * @see #getEnumerationValueType()
	 * @generated
	 */
	EAttribute getEnumerationValueType_LiteralSemantics();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getIsMultiValued <em>Is Multi Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi Valued</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getIsMultiValued()
	 * @see #getEnumerationValueType()
	 * @generated
	 */
	EAttribute getEnumerationValueType_IsMultiValued();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getBaseEnumeration <em>Base Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType#getBaseEnumeration()
	 * @see #getEnumerationValueType()
	 * @generated
	 */
	EReference getEnumerationValueType_BaseEnumeration();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType <em>Rangeable Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rangeable Value Type</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType
	 * @generated
	 */
	EClass getRangeableValueType();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType#getAccuracy()
	 * @see #getRangeableValueType()
	 * @generated
	 */
	EAttribute getRangeableValueType_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType#getResolution()
	 * @see #getRangeableValueType()
	 * @generated
	 */
	EAttribute getRangeableValueType_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType#getSignificantDigits <em>Significant Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Significant Digits</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType#getSignificantDigits()
	 * @see #getRangeableValueType()
	 * @generated
	 */
	EAttribute getRangeableValueType_SignificantDigits();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType#getBaseRangeable <em>Base Rangeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Rangeable</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType#getBaseRangeable()
	 * @see #getRangeableValueType()
	 * @generated
	 */
	EReference getRangeableValueType_BaseRangeable();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatype <em>Composite Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Datatype</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatype
	 * @generated
	 */
	EClass getCompositeDatatype();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatype#getDatatypePrototype <em>Datatype Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype Prototype</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatype#getDatatypePrototype()
	 * @see #getCompositeDatatype()
	 * @generated
	 */
	EReference getCompositeDatatype_DatatypePrototype();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EABoolean <em>EA Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Boolean</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EABoolean
	 * @generated
	 */
	EClass getEABoolean();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EADatatype <em>EA Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Datatype</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EADatatype
	 * @generated
	 */
	EClass getEADatatype();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype <em>EA Datatype Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Datatype Prototype</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype
	 * @generated
	 */
	EClass getEADatatypePrototype();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype#getType()
	 * @see #getEADatatypePrototype()
	 * @generated
	 */
	EReference getEADatatypePrototype_Type();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAFloat <em>EA Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Float</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAFloat
	 * @generated
	 */
	EClass getEAFloat();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAFloat#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAFloat#getMin()
	 * @see #getEAFloat()
	 * @generated
	 */
	EAttribute getEAFloat_Min();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAFloat#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAFloat#getMax()
	 * @see #getEAFloat()
	 * @generated
	 */
	EAttribute getEAFloat_Max();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAInteger <em>EA Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Integer</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAInteger
	 * @generated
	 */
	EClass getEAInteger();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAInteger#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAInteger#getMin()
	 * @see #getEAInteger()
	 * @generated
	 */
	EAttribute getEAInteger_Min();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAInteger#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAInteger#getMax()
	 * @see #getEAInteger()
	 * @generated
	 */
	EAttribute getEAInteger_Max();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAString <em>EA String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA String</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EAString
	 * @generated
	 */
	EClass getEAString();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.Enumeration#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.Enumeration#getLiteral()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literal();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableDatatype <em>Rangeable Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rangeable Datatype</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableDatatype
	 * @generated
	 */
	EClass getRangeableDatatype();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.ValueType#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.ValueType#getDimension()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.ValueType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.ValueType#getUnit()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Unit();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.ValueType#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantics</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.ValueType#getSemantics()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Semantics();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationValueTypeImpl <em>Enumeration Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationValueTypeImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEnumerationValueType()
		 * @generated
		 */
		EClass ENUMERATION_VALUE_TYPE = eINSTANCE.getEnumerationValueType();

		/**
		 * The meta object literal for the '<em><b>Literal Semantics</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_VALUE_TYPE__LITERAL_SEMANTICS = eINSTANCE.getEnumerationValueType_LiteralSemantics();

		/**
		 * The meta object literal for the '<em><b>Is Multi Valued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_VALUE_TYPE__IS_MULTI_VALUED = eINSTANCE.getEnumerationValueType_IsMultiValued();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_VALUE_TYPE__BASE_ENUMERATION = eINSTANCE.getEnumerationValueType_BaseEnumeration();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.RangeableValueTypeImpl <em>Rangeable Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.RangeableValueTypeImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getRangeableValueType()
		 * @generated
		 */
		EClass RANGEABLE_VALUE_TYPE = eINSTANCE.getRangeableValueType();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGEABLE_VALUE_TYPE__ACCURACY = eINSTANCE.getRangeableValueType_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGEABLE_VALUE_TYPE__RESOLUTION = eINSTANCE.getRangeableValueType_Resolution();

		/**
		 * The meta object literal for the '<em><b>Significant Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS = eINSTANCE.getRangeableValueType_SignificantDigits();

		/**
		 * The meta object literal for the '<em><b>Base Rangeable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGEABLE_VALUE_TYPE__BASE_RANGEABLE = eINSTANCE.getRangeableValueType_BaseRangeable();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.CompositeDatatypeImpl <em>Composite Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.CompositeDatatypeImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getCompositeDatatype()
		 * @generated
		 */
		EClass COMPOSITE_DATATYPE = eINSTANCE.getCompositeDatatype();

		/**
		 * The meta object literal for the '<em><b>Datatype Prototype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE = eINSTANCE.getCompositeDatatype_DatatypePrototype();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EABooleanImpl <em>EA Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EABooleanImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEABoolean()
		 * @generated
		 */
		EClass EA_BOOLEAN = eINSTANCE.getEABoolean();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EADatatypeImpl <em>EA Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EADatatypeImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEADatatype()
		 * @generated
		 */
		EClass EA_DATATYPE = eINSTANCE.getEADatatype();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EADatatypePrototypeImpl <em>EA Datatype Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EADatatypePrototypeImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEADatatypePrototype()
		 * @generated
		 */
		EClass EA_DATATYPE_PROTOTYPE = eINSTANCE.getEADatatypePrototype();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_DATATYPE_PROTOTYPE__TYPE = eINSTANCE.getEADatatypePrototype_Type();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EAFloatImpl <em>EA Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EAFloatImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEAFloat()
		 * @generated
		 */
		EClass EA_FLOAT = eINSTANCE.getEAFloat();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_FLOAT__MIN = eINSTANCE.getEAFloat_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_FLOAT__MAX = eINSTANCE.getEAFloat_Max();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EAIntegerImpl <em>EA Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EAIntegerImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEAInteger()
		 * @generated
		 */
		EClass EA_INTEGER = eINSTANCE.getEAInteger();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_INTEGER__MIN = eINSTANCE.getEAInteger_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_INTEGER__MAX = eINSTANCE.getEAInteger_Max();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EAStringImpl <em>EA String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EAStringImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEAString()
		 * @generated
		 */
		EClass EA_STRING = eINSTANCE.getEAString();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERAL = eINSTANCE.getEnumeration_Literal();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationLiteralImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.RangeableDatatypeImpl <em>Rangeable Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.RangeableDatatypeImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getRangeableDatatype()
		 * @generated
		 */
		EClass RANGEABLE_DATATYPE = eINSTANCE.getRangeableDatatype();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.ValueTypeImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__DIMENSION = eINSTANCE.getValueType_Dimension();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__UNIT = eINSTANCE.getValueType_Unit();

		/**
		 * The meta object literal for the '<em><b>Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__SEMANTICS = eINSTANCE.getValueType_Semantics();

	}

} //DatatypesPackage
