/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref._instancerefFactory
 * @model kind="package"
 * @generated
 */
public interface _instancerefPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_instanceref";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/east_adl/requirements/_instanceref";

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
	_instancerefPackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl._instancerefPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl.Refine_refinedByImpl <em>Refine refined By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl.Refine_refinedByImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl._instancerefPackageImpl#getRefine_refinedBy()
	 * @generated
	 */
	int REFINE_REFINED_BY = 0;

	/**
	 * The feature id for the '<em><b>Identifiable context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_REFINED_BY__IDENTIFIABLE_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_REFINED_BY__IDENTIFIABLE_TARGET = 1;

	/**
	 * The number of structural features of the '<em>Refine refined By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_REFINED_BY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Refine refined By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_REFINED_BY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl.Satisfy_satisfiedByImpl <em>Satisfy satisfied By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl.Satisfy_satisfiedByImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl._instancerefPackageImpl#getSatisfy_satisfiedBy()
	 * @generated
	 */
	int SATISFY_SATISFIED_BY = 1;

	/**
	 * The feature id for the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_SATISFIED_BY__IDENTIFIABLE_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Identifiable context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_SATISFIED_BY__IDENTIFIABLE_CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Satisfy satisfied By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_SATISFIED_BY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Satisfy satisfied By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_SATISFIED_BY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy <em>Refine refined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refine refined By</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy
	 * @generated
	 */
	EClass getRefine_refinedBy();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy#getIdentifiable_context <em>Identifiable context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifiable context</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy#getIdentifiable_context()
	 * @see #getRefine_refinedBy()
	 * @generated
	 */
	EReference getRefine_refinedBy_Identifiable_context();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy#getIdentifiable_target <em>Identifiable target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifiable target</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy#getIdentifiable_target()
	 * @see #getRefine_refinedBy()
	 * @generated
	 */
	EReference getRefine_refinedBy_Identifiable_target();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy <em>Satisfy satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfy satisfied By</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy
	 * @generated
	 */
	EClass getSatisfy_satisfiedBy();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy#getIdentifiable_target <em>Identifiable target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifiable target</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy#getIdentifiable_target()
	 * @see #getSatisfy_satisfiedBy()
	 * @generated
	 */
	EReference getSatisfy_satisfiedBy_Identifiable_target();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy#getIdentifiable_context <em>Identifiable context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifiable context</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy#getIdentifiable_context()
	 * @see #getSatisfy_satisfiedBy()
	 * @generated
	 */
	EReference getSatisfy_satisfiedBy_Identifiable_context();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_instancerefFactory get_instancerefFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl.Refine_refinedByImpl <em>Refine refined By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl.Refine_refinedByImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl._instancerefPackageImpl#getRefine_refinedBy()
		 * @generated
		 */
		EClass REFINE_REFINED_BY = eINSTANCE.getRefine_refinedBy();

		/**
		 * The meta object literal for the '<em><b>Identifiable context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINE_REFINED_BY__IDENTIFIABLE_CONTEXT = eINSTANCE.getRefine_refinedBy_Identifiable_context();

		/**
		 * The meta object literal for the '<em><b>Identifiable target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINE_REFINED_BY__IDENTIFIABLE_TARGET = eINSTANCE.getRefine_refinedBy_Identifiable_target();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl.Satisfy_satisfiedByImpl <em>Satisfy satisfied By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl.Satisfy_satisfiedByImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl._instancerefPackageImpl#getSatisfy_satisfiedBy()
		 * @generated
		 */
		EClass SATISFY_SATISFIED_BY = eINSTANCE.getSatisfy_satisfiedBy();

		/**
		 * The meta object literal for the '<em><b>Identifiable target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFY_SATISFIED_BY__IDENTIFIABLE_TARGET = eINSTANCE.getSatisfy_satisfiedBy_Identifiable_target();

		/**
		 * The meta object literal for the '<em><b>Identifiable context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFY_SATISFIED_BY__IDENTIFIABLE_CONTEXT = eINSTANCE.getSatisfy_satisfiedBy_Identifiable_context();

	}

} //_instancerefPackage
