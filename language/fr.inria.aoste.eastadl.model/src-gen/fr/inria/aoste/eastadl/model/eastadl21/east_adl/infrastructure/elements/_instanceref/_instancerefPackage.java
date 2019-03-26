/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefFactory
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
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/east_adl/infrastructure/elements/_instanceref";

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
	_instancerefPackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl._instancerefPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl.Realization_realizedImpl <em>Realization realized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl.Realization_realizedImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl._instancerefPackageImpl#getRealization_realized()
	 * @generated
	 */
	int REALIZATION_REALIZED = 0;

	/**
	 * The feature id for the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED__IDENTIFIABLE_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Identifiable context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Realization realized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Realization realized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl.Realization_realizedByImpl <em>Realization realized By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl.Realization_realizedByImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl._instancerefPackageImpl#getRealization_realizedBy()
	 * @generated
	 */
	int REALIZATION_REALIZED_BY = 1;

	/**
	 * The feature id for the '<em><b>Identifiable context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_BY__IDENTIFIABLE_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_BY__IDENTIFIABLE_TARGET = 1;

	/**
	 * The number of structural features of the '<em>Realization realized By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_BY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Realization realized By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_BY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realized <em>Realization realized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization realized</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realized
	 * @generated
	 */
	EClass getRealization_realized();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realized#getIdentifiable_target <em>Identifiable target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifiable target</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realized#getIdentifiable_target()
	 * @see #getRealization_realized()
	 * @generated
	 */
	EReference getRealization_realized_Identifiable_target();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realized#getIdentifiable_context <em>Identifiable context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifiable context</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realized#getIdentifiable_context()
	 * @see #getRealization_realized()
	 * @generated
	 */
	EReference getRealization_realized_Identifiable_context();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedBy <em>Realization realized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization realized By</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedBy
	 * @generated
	 */
	EClass getRealization_realizedBy();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedBy#getIdentifiable_context <em>Identifiable context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifiable context</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedBy#getIdentifiable_context()
	 * @see #getRealization_realizedBy()
	 * @generated
	 */
	EReference getRealization_realizedBy_Identifiable_context();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedBy#getIdentifiable_target <em>Identifiable target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifiable target</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedBy#getIdentifiable_target()
	 * @see #getRealization_realizedBy()
	 * @generated
	 */
	EReference getRealization_realizedBy_Identifiable_target();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl.Realization_realizedImpl <em>Realization realized</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl.Realization_realizedImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl._instancerefPackageImpl#getRealization_realized()
		 * @generated
		 */
		EClass REALIZATION_REALIZED = eINSTANCE.getRealization_realized();

		/**
		 * The meta object literal for the '<em><b>Identifiable target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION_REALIZED__IDENTIFIABLE_TARGET = eINSTANCE.getRealization_realized_Identifiable_target();

		/**
		 * The meta object literal for the '<em><b>Identifiable context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT = eINSTANCE.getRealization_realized_Identifiable_context();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl.Realization_realizedByImpl <em>Realization realized By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl.Realization_realizedByImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl._instancerefPackageImpl#getRealization_realizedBy()
		 * @generated
		 */
		EClass REALIZATION_REALIZED_BY = eINSTANCE.getRealization_realizedBy();

		/**
		 * The meta object literal for the '<em><b>Identifiable context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION_REALIZED_BY__IDENTIFIABLE_CONTEXT = eINSTANCE.getRealization_realizedBy_Identifiable_context();

		/**
		 * The meta object literal for the '<em><b>Identifiable target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION_REALIZED_BY__IDENTIFIABLE_TARGET = eINSTANCE.getRealization_realizedBy_Identifiable_target();

	}

} //_instancerefPackage
