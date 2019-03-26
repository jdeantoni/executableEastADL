/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

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
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsFactory
 * @model kind="package"
 * @generated
 */
public interface SafetyconstraintsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "safetyconstraints";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.aoste.eastadl.xdsml.xeastadl/eastadl21/east_adl/dependability/safetyconstraints/";

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
	SafetyconstraintsPackage eINSTANCE = fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyconstraintsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.FaultFailureImpl <em>Fault Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.FaultFailureImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyconstraintsPackageImpl#getFaultFailure()
	 * @generated
	 */
	int FAULT_FAILURE = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Anomaly</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE__ANOMALY = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault Failure Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE__FAULT_FAILURE_VALUE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fault Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.QuantitativeSafetyConstraintImpl <em>Quantitative Safety Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.QuantitativeSafetyConstraintImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyconstraintsPackageImpl#getQuantitativeSafetyConstraint()
	 * @generated
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT__FAILURE_RATE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repair Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT__REPAIR_RATE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constrained Fault Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantitative Safety Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_SAFETY_CONSTRAINT_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyConstraintImpl <em>Safety Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyConstraintImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyconstraintsPackageImpl#getSafetyConstraint()
	 * @generated
	 */
	int SAFETY_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONSTRAINT__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONSTRAINT__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONSTRAINT__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONSTRAINT__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONSTRAINT__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONSTRAINT__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONSTRAINT__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONSTRAINT__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONSTRAINT__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Asil Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONSTRAINT__ASIL_VALUE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constrained Fault Failure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Safety Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONSTRAINT_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.ASILKind <em>ASIL Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.ASILKind
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyconstraintsPackageImpl#getASILKind()
	 * @generated
	 */
	int ASIL_KIND = 3;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure <em>Fault Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Failure</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure
	 * @generated
	 */
	EClass getFaultFailure();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure#getAnomaly <em>Anomaly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anomaly</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure#getAnomaly()
	 * @see #getFaultFailure()
	 * @generated
	 */
	EReference getFaultFailure_Anomaly();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure#getFaultFailureValue <em>Fault Failure Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Failure Value</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure#getFaultFailureValue()
	 * @see #getFaultFailure()
	 * @generated
	 */
	EReference getFaultFailure_FaultFailureValue();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint <em>Quantitative Safety Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantitative Safety Constraint</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint
	 * @generated
	 */
	EClass getQuantitativeSafetyConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getFailureRate <em>Failure Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Rate</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getFailureRate()
	 * @see #getQuantitativeSafetyConstraint()
	 * @generated
	 */
	EAttribute getQuantitativeSafetyConstraint_FailureRate();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getRepairRate <em>Repair Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repair Rate</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getRepairRate()
	 * @see #getQuantitativeSafetyConstraint()
	 * @generated
	 */
	EAttribute getQuantitativeSafetyConstraint_RepairRate();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getConstrainedFaultFailure <em>Constrained Fault Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Fault Failure</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint#getConstrainedFaultFailure()
	 * @see #getQuantitativeSafetyConstraint()
	 * @generated
	 */
	EReference getQuantitativeSafetyConstraint_ConstrainedFaultFailure();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint <em>Safety Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Constraint</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint
	 * @generated
	 */
	EClass getSafetyConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint#getAsilValue <em>Asil Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asil Value</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint#getAsilValue()
	 * @see #getSafetyConstraint()
	 * @generated
	 */
	EAttribute getSafetyConstraint_AsilValue();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint#getConstrainedFaultFailure <em>Constrained Fault Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Fault Failure</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint#getConstrainedFaultFailure()
	 * @see #getSafetyConstraint()
	 * @generated
	 */
	EReference getSafetyConstraint_ConstrainedFaultFailure();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.ASILKind <em>ASIL Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ASIL Kind</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.ASILKind
	 * @generated
	 */
	EEnum getASILKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SafetyconstraintsFactory getSafetyconstraintsFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.FaultFailureImpl <em>Fault Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.FaultFailureImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyconstraintsPackageImpl#getFaultFailure()
		 * @generated
		 */
		EClass FAULT_FAILURE = eINSTANCE.getFaultFailure();

		/**
		 * The meta object literal for the '<em><b>Anomaly</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_FAILURE__ANOMALY = eINSTANCE.getFaultFailure_Anomaly();

		/**
		 * The meta object literal for the '<em><b>Fault Failure Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_FAILURE__FAULT_FAILURE_VALUE = eINSTANCE.getFaultFailure_FaultFailureValue();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.QuantitativeSafetyConstraintImpl <em>Quantitative Safety Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.QuantitativeSafetyConstraintImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyconstraintsPackageImpl#getQuantitativeSafetyConstraint()
		 * @generated
		 */
		EClass QUANTITATIVE_SAFETY_CONSTRAINT = eINSTANCE.getQuantitativeSafetyConstraint();

		/**
		 * The meta object literal for the '<em><b>Failure Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_SAFETY_CONSTRAINT__FAILURE_RATE = eINSTANCE.getQuantitativeSafetyConstraint_FailureRate();

		/**
		 * The meta object literal for the '<em><b>Repair Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_SAFETY_CONSTRAINT__REPAIR_RATE = eINSTANCE.getQuantitativeSafetyConstraint_RepairRate();

		/**
		 * The meta object literal for the '<em><b>Constrained Fault Failure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITATIVE_SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE = eINSTANCE.getQuantitativeSafetyConstraint_ConstrainedFaultFailure();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyConstraintImpl <em>Safety Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyConstraintImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyconstraintsPackageImpl#getSafetyConstraint()
		 * @generated
		 */
		EClass SAFETY_CONSTRAINT = eINSTANCE.getSafetyConstraint();

		/**
		 * The meta object literal for the '<em><b>Asil Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CONSTRAINT__ASIL_VALUE = eINSTANCE.getSafetyConstraint_AsilValue();

		/**
		 * The meta object literal for the '<em><b>Constrained Fault Failure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE = eINSTANCE.getSafetyConstraint_ConstrainedFaultFailure();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.ASILKind <em>ASIL Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.ASILKind
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyconstraintsPackageImpl#getASILKind()
		 * @generated
		 */
		EEnum ASIL_KIND = eINSTANCE.getASILKind();

	}

} //SafetyconstraintsPackage
