/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints;

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
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericconstraintsFactory
 * @model kind="package"
 * @generated
 */
public interface GenericconstraintsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genericconstraints";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.aoste.eastadl.xdsml.xeastadl/eastadl21/east_adl/genericconstraints/";

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
	GenericconstraintsPackage eINSTANCE = fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericconstraintsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericConstraintImpl <em>Generic Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericConstraintImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericconstraintsPackageImpl#getGenericConstraint()
	 * @generated
	 */
	int GENERIC_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT__GSHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT__SHORT_NAME = ElementsPackage.TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT__CATEGORY = ElementsPackage.TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT__UUID = ElementsPackage.TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT__NAME = ElementsPackage.TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT__OWNED_COMMENT = ElementsPackage.TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT__GEA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT__EA_PACKAGE_ELEMENT = ElementsPackage.TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT__TEXT = ElementsPackage.TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Generic Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_TYPE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Constraint Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_VALUE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT__TARGET = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT__MODE = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generic Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT_FEATURE_COUNT = ElementsPackage.TRACEABLE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericConstraintSetImpl <em>Generic Constraint Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericConstraintSetImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericconstraintsPackageImpl#getGenericConstraintSet()
	 * @generated
	 */
	int GENERIC_CONSTRAINT_SET = 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT_SET__GSHORT_NAME = ElementsPackage.CONTEXT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT_SET__SHORT_NAME = ElementsPackage.CONTEXT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT_SET__CATEGORY = ElementsPackage.CONTEXT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT_SET__UUID = ElementsPackage.CONTEXT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT_SET__NAME = ElementsPackage.CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT_SET__OWNED_COMMENT = ElementsPackage.CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT_SET__GEA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT_SET__EA_PACKAGE_ELEMENT = ElementsPackage.CONTEXT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT_SET__TRACEABLE_SPECIFICATION = ElementsPackage.CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT_SET__OWNED_RELATIONSHIP = ElementsPackage.CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Generic Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT_SET__GENERIC_CONSTRAINT = ElementsPackage.CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Constraint Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONSTRAINT_SET_FEATURE_COUNT = ElementsPackage.CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.TakeRateConstraintImpl <em>Take Rate Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.TakeRateConstraintImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericconstraintsPackageImpl#getTakeRateConstraint()
	 * @generated
	 */
	int TAKE_RATE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__GSHORT_NAME = GENERIC_CONSTRAINT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__SHORT_NAME = GENERIC_CONSTRAINT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__CATEGORY = GENERIC_CONSTRAINT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__UUID = GENERIC_CONSTRAINT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__NAME = GENERIC_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__OWNED_COMMENT = GENERIC_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__GEA_PACKAGE_ELEMENT = GENERIC_CONSTRAINT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__EA_PACKAGE_ELEMENT = GENERIC_CONSTRAINT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__TEXT = GENERIC_CONSTRAINT__TEXT;

	/**
	 * The feature id for the '<em><b>Generic Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__GENERIC_CONSTRAINT_TYPE = GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_TYPE;

	/**
	 * The feature id for the '<em><b>Generic Constraint Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__GENERIC_CONSTRAINT_VALUE = GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_VALUE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__TARGET = GENERIC_CONSTRAINT__TARGET;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__MODE = GENERIC_CONSTRAINT__MODE;

	/**
	 * The feature id for the '<em><b>Take Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__TAKE_RATE = GENERIC_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT__SOURCE = GENERIC_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Take Rate Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_RATE_CONSTRAINT_FEATURE_COUNT = GENERIC_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraintKind <em>Generic Constraint Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraintKind
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericconstraintsPackageImpl#getGenericConstraintKind()
	 * @generated
	 */
	int GENERIC_CONSTRAINT_KIND = 3;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraint <em>Generic Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Constraint</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraint
	 * @generated
	 */
	EClass getGenericConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraint#getGenericConstraintType <em>Generic Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Constraint Type</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraint#getGenericConstraintType()
	 * @see #getGenericConstraint()
	 * @generated
	 */
	EAttribute getGenericConstraint_GenericConstraintType();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraint#getGenericConstraintValue <em>Generic Constraint Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Constraint Value</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraint#getGenericConstraintValue()
	 * @see #getGenericConstraint()
	 * @generated
	 */
	EAttribute getGenericConstraint_GenericConstraintValue();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraint#getTarget()
	 * @see #getGenericConstraint()
	 * @generated
	 */
	EReference getGenericConstraint_Target();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraint#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mode</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraint#getMode()
	 * @see #getGenericConstraint()
	 * @generated
	 */
	EReference getGenericConstraint_Mode();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraintSet <em>Generic Constraint Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Constraint Set</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraintSet
	 * @generated
	 */
	EClass getGenericConstraintSet();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraintSet#getGenericConstraint <em>Generic Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Constraint</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraintSet#getGenericConstraint()
	 * @see #getGenericConstraintSet()
	 * @generated
	 */
	EReference getGenericConstraintSet_GenericConstraint();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.TakeRateConstraint <em>Take Rate Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Take Rate Constraint</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.TakeRateConstraint
	 * @generated
	 */
	EClass getTakeRateConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.TakeRateConstraint#getTakeRate <em>Take Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Take Rate</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.TakeRateConstraint#getTakeRate()
	 * @see #getTakeRateConstraint()
	 * @generated
	 */
	EAttribute getTakeRateConstraint_TakeRate();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.TakeRateConstraint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.TakeRateConstraint#getSource()
	 * @see #getTakeRateConstraint()
	 * @generated
	 */
	EReference getTakeRateConstraint_Source();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraintKind <em>Generic Constraint Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generic Constraint Kind</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraintKind
	 * @generated
	 */
	EEnum getGenericConstraintKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenericconstraintsFactory getGenericconstraintsFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericConstraintImpl <em>Generic Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericConstraintImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericconstraintsPackageImpl#getGenericConstraint()
		 * @generated
		 */
		EClass GENERIC_CONSTRAINT = eINSTANCE.getGenericConstraint();

		/**
		 * The meta object literal for the '<em><b>Generic Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_TYPE = eINSTANCE.getGenericConstraint_GenericConstraintType();

		/**
		 * The meta object literal for the '<em><b>Generic Constraint Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_VALUE = eINSTANCE.getGenericConstraint_GenericConstraintValue();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CONSTRAINT__TARGET = eINSTANCE.getGenericConstraint_Target();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CONSTRAINT__MODE = eINSTANCE.getGenericConstraint_Mode();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericConstraintSetImpl <em>Generic Constraint Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericConstraintSetImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericconstraintsPackageImpl#getGenericConstraintSet()
		 * @generated
		 */
		EClass GENERIC_CONSTRAINT_SET = eINSTANCE.getGenericConstraintSet();

		/**
		 * The meta object literal for the '<em><b>Generic Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CONSTRAINT_SET__GENERIC_CONSTRAINT = eINSTANCE.getGenericConstraintSet_GenericConstraint();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.TakeRateConstraintImpl <em>Take Rate Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.TakeRateConstraintImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericconstraintsPackageImpl#getTakeRateConstraint()
		 * @generated
		 */
		EClass TAKE_RATE_CONSTRAINT = eINSTANCE.getTakeRateConstraint();

		/**
		 * The meta object literal for the '<em><b>Take Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAKE_RATE_CONSTRAINT__TAKE_RATE = eINSTANCE.getTakeRateConstraint_TakeRate();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAKE_RATE_CONSTRAINT__SOURCE = eINSTANCE.getTakeRateConstraint_Source();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraintKind <em>Generic Constraint Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericConstraintKind
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.GenericconstraintsPackageImpl#getGenericConstraintKind()
		 * @generated
		 */
		EEnum GENERIC_CONSTRAINT_KIND = eINSTANCE.getGenericConstraintKind();

	}

} //GenericconstraintsPackage
