/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage;

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
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingFactory
 * @model kind="package"
 * @generated
 */
public interface VehiclefeaturemodelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vehiclefeaturemodeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.aoste.eastadl.xdsml.xeastadl/eastadl21/east_adl/structure/vehiclefeaturemodeling/";

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
	VehiclefeaturemodelingPackage eINSTANCE = fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehiclefeaturemodelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl <em>Deviation Attribute Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehiclefeaturemodelingPackageImpl#getDeviationAttributeSet()
	 * @generated
	 */
	int DEVIATION_ATTRIBUTE_SET = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__GSHORT_NAME = ElementsPackage.EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__SHORT_NAME = ElementsPackage.EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__CATEGORY = ElementsPackage.EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__UUID = ElementsPackage.EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Allow Change Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow Change Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allow Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allow Change Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allow Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Allow Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Allow Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Allow Regrouping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Allow Removal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET__FEATURE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Deviation Attribute Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_ATTRIBUTE_SET_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehicleFeatureImpl <em>Vehicle Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehicleFeatureImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehiclefeaturemodelingPackageImpl#getVehicleFeature()
	 * @generated
	 */
	int VEHICLE_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__GSHORT_NAME = FeaturemodelingPackage.FEATURE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__SHORT_NAME = FeaturemodelingPackage.FEATURE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__CATEGORY = FeaturemodelingPackage.FEATURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__UUID = FeaturemodelingPackage.FEATURE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__NAME = FeaturemodelingPackage.FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__OWNED_COMMENT = FeaturemodelingPackage.FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__GEA_PACKAGE_ELEMENT = FeaturemodelingPackage.FEATURE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__EA_PACKAGE_ELEMENT = FeaturemodelingPackage.FEATURE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__TRACEABLE_SPECIFICATION = FeaturemodelingPackage.FEATURE__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__OWNED_RELATIONSHIP = FeaturemodelingPackage.FEATURE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__CARDINALITY = FeaturemodelingPackage.FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Required Binding Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__REQUIRED_BINDING_TIME = FeaturemodelingPackage.FEATURE__REQUIRED_BINDING_TIME;

	/**
	 * The feature id for the '<em><b>Actual Binding Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__ACTUAL_BINDING_TIME = FeaturemodelingPackage.FEATURE__ACTUAL_BINDING_TIME;

	/**
	 * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__CHILD_NODE = FeaturemodelingPackage.FEATURE__CHILD_NODE;

	/**
	 * The feature id for the '<em><b>Feature Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__FEATURE_PARAMETER = FeaturemodelingPackage.FEATURE__FEATURE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Is Design Variability Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__IS_DESIGN_VARIABILITY_RATIONALE = FeaturemodelingPackage.FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Removed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__IS_REMOVED = FeaturemodelingPackage.FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Customer Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__IS_CUSTOMER_VISIBLE = FeaturemodelingPackage.FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deviation Attribute Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET = FeaturemodelingPackage.FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Vehicle Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_FEATURE_COUNT = FeaturemodelingPackage.FEATURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind <em>Deviation Permission Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehiclefeaturemodelingPackageImpl#getDeviationPermissionKind()
	 * @generated
	 */
	int DEVIATION_PERMISSION_KIND = 2;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet <em>Deviation Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deviation Attribute Set</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet
	 * @generated
	 */
	EClass getDeviationAttributeSet();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeAttribute <em>Allow Change Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Change Attribute</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeAttribute()
	 * @see #getDeviationAttributeSet()
	 * @generated
	 */
	EAttribute getDeviationAttributeSet_AllowChangeAttribute();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeCardinality <em>Allow Change Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Change Cardinality</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeCardinality()
	 * @see #getDeviationAttributeSet()
	 * @generated
	 */
	EAttribute getDeviationAttributeSet_AllowChangeCardinality();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeDescription <em>Allow Change Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Change Description</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeDescription()
	 * @see #getDeviationAttributeSet()
	 * @generated
	 */
	EAttribute getDeviationAttributeSet_AllowChangeDescription();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeName <em>Allow Change Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Change Name</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeName()
	 * @see #getDeviationAttributeSet()
	 * @generated
	 */
	EAttribute getDeviationAttributeSet_AllowChangeName();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowMove <em>Allow Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Move</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowMove()
	 * @see #getDeviationAttributeSet()
	 * @generated
	 */
	EAttribute getDeviationAttributeSet_AllowMove();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowReduction <em>Allow Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Reduction</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowReduction()
	 * @see #getDeviationAttributeSet()
	 * @generated
	 */
	EAttribute getDeviationAttributeSet_AllowReduction();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRefinement <em>Allow Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Refinement</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRefinement()
	 * @see #getDeviationAttributeSet()
	 * @generated
	 */
	EAttribute getDeviationAttributeSet_AllowRefinement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRegrouping <em>Allow Regrouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Regrouping</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRegrouping()
	 * @see #getDeviationAttributeSet()
	 * @generated
	 */
	EAttribute getDeviationAttributeSet_AllowRegrouping();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRemoval <em>Allow Removal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Removal</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRemoval()
	 * @see #getDeviationAttributeSet()
	 * @generated
	 */
	EAttribute getDeviationAttributeSet_AllowRemoval();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Feature</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getFeature()
	 * @see #getDeviationAttributeSet()
	 * @generated
	 */
	EReference getDeviationAttributeSet_Feature();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature <em>Vehicle Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Feature</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature
	 * @generated
	 */
	EClass getVehicleFeature();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsDesignVariabilityRationale <em>Is Design Variability Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Design Variability Rationale</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsDesignVariabilityRationale()
	 * @see #getVehicleFeature()
	 * @generated
	 */
	EAttribute getVehicleFeature_IsDesignVariabilityRationale();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsRemoved <em>Is Removed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Removed</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsRemoved()
	 * @see #getVehicleFeature()
	 * @generated
	 */
	EAttribute getVehicleFeature_IsRemoved();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsCustomerVisible <em>Is Customer Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Customer Visible</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsCustomerVisible()
	 * @see #getVehicleFeature()
	 * @generated
	 */
	EAttribute getVehicleFeature_IsCustomerVisible();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getDeviationAttributeSet <em>Deviation Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deviation Attribute Set</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getDeviationAttributeSet()
	 * @see #getVehicleFeature()
	 * @generated
	 */
	EReference getVehicleFeature_DeviationAttributeSet();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind <em>Deviation Permission Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deviation Permission Kind</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @generated
	 */
	EEnum getDeviationPermissionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VehiclefeaturemodelingFactory getVehiclefeaturemodelingFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl <em>Deviation Attribute Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehiclefeaturemodelingPackageImpl#getDeviationAttributeSet()
		 * @generated
		 */
		EClass DEVIATION_ATTRIBUTE_SET = eINSTANCE.getDeviationAttributeSet();

		/**
		 * The meta object literal for the '<em><b>Allow Change Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE = eINSTANCE.getDeviationAttributeSet_AllowChangeAttribute();

		/**
		 * The meta object literal for the '<em><b>Allow Change Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY = eINSTANCE.getDeviationAttributeSet_AllowChangeCardinality();

		/**
		 * The meta object literal for the '<em><b>Allow Change Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION = eINSTANCE.getDeviationAttributeSet_AllowChangeDescription();

		/**
		 * The meta object literal for the '<em><b>Allow Change Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME = eINSTANCE.getDeviationAttributeSet_AllowChangeName();

		/**
		 * The meta object literal for the '<em><b>Allow Move</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE = eINSTANCE.getDeviationAttributeSet_AllowMove();

		/**
		 * The meta object literal for the '<em><b>Allow Reduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION = eINSTANCE.getDeviationAttributeSet_AllowReduction();

		/**
		 * The meta object literal for the '<em><b>Allow Refinement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT = eINSTANCE.getDeviationAttributeSet_AllowRefinement();

		/**
		 * The meta object literal for the '<em><b>Allow Regrouping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING = eINSTANCE.getDeviationAttributeSet_AllowRegrouping();

		/**
		 * The meta object literal for the '<em><b>Allow Removal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL = eINSTANCE.getDeviationAttributeSet_AllowRemoval();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVIATION_ATTRIBUTE_SET__FEATURE = eINSTANCE.getDeviationAttributeSet_Feature();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehicleFeatureImpl <em>Vehicle Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehicleFeatureImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehiclefeaturemodelingPackageImpl#getVehicleFeature()
		 * @generated
		 */
		EClass VEHICLE_FEATURE = eINSTANCE.getVehicleFeature();

		/**
		 * The meta object literal for the '<em><b>Is Design Variability Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_FEATURE__IS_DESIGN_VARIABILITY_RATIONALE = eINSTANCE.getVehicleFeature_IsDesignVariabilityRationale();

		/**
		 * The meta object literal for the '<em><b>Is Removed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_FEATURE__IS_REMOVED = eINSTANCE.getVehicleFeature_IsRemoved();

		/**
		 * The meta object literal for the '<em><b>Is Customer Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_FEATURE__IS_CUSTOMER_VISIBLE = eINSTANCE.getVehicleFeature_IsCustomerVisible();

		/**
		 * The meta object literal for the '<em><b>Deviation Attribute Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET = eINSTANCE.getVehicleFeature_DeviationAttributeSet();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind <em>Deviation Permission Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehiclefeaturemodelingPackageImpl#getDeviationPermissionKind()
		 * @generated
		 */
		EEnum DEVIATION_PERMISSION_KIND = eINSTANCE.getDeviationPermissionKind();

	}

} //VehiclefeaturemodelingPackage
