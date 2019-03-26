/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref;

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
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref._instancerefFactory
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
	String eNS_URI = "http://fr.inria.aoste.eastadl.xdsml.xeastadl/eastadl21/east_adl/timing/_instanceref/";

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
	_instancerefPackage eINSTANCE = fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.impl._instancerefPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.impl.PrecedenceConstraint_precedingImpl <em>Precedence Constraint preceding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.impl.PrecedenceConstraint_precedingImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.impl._instancerefPackageImpl#getPrecedenceConstraint_preceding()
	 * @generated
	 */
	int PRECEDENCE_CONSTRAINT_PRECEDING = 0;

	/**
	 * The feature id for the '<em><b>Function Prototype target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_PRECEDING__FUNCTION_PROTOTYPE_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Function Prototype context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_PRECEDING__FUNCTION_PROTOTYPE_CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Precedence Constraint preceding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_PRECEDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.impl.PrecedenceConstraint_successiveImpl <em>Precedence Constraint successive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.impl.PrecedenceConstraint_successiveImpl
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.impl._instancerefPackageImpl#getPrecedenceConstraint_successive()
	 * @generated
	 */
	int PRECEDENCE_CONSTRAINT_SUCCESSIVE = 1;

	/**
	 * The feature id for the '<em><b>Function Prototype context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Function Prototype target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_TARGET = 1;

	/**
	 * The number of structural features of the '<em>Precedence Constraint successive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_SUCCESSIVE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding <em>Precedence Constraint preceding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Constraint preceding</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding
	 * @generated
	 */
	EClass getPrecedenceConstraint_preceding();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding#getFunctionPrototype_target <em>Function Prototype target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Prototype target</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding#getFunctionPrototype_target()
	 * @see #getPrecedenceConstraint_preceding()
	 * @generated
	 */
	EReference getPrecedenceConstraint_preceding_FunctionPrototype_target();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding#getFunctionPrototype_context <em>Function Prototype context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Function Prototype context</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding#getFunctionPrototype_context()
	 * @see #getPrecedenceConstraint_preceding()
	 * @generated
	 */
	EReference getPrecedenceConstraint_preceding_FunctionPrototype_context();

	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive <em>Precedence Constraint successive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Constraint successive</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive
	 * @generated
	 */
	EClass getPrecedenceConstraint_successive();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive#getFunctionPrototype_context <em>Function Prototype context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Function Prototype context</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive#getFunctionPrototype_context()
	 * @see #getPrecedenceConstraint_successive()
	 * @generated
	 */
	EReference getPrecedenceConstraint_successive_FunctionPrototype_context();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive#getFunctionPrototype_target <em>Function Prototype target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Prototype target</em>'.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive#getFunctionPrototype_target()
	 * @see #getPrecedenceConstraint_successive()
	 * @generated
	 */
	EReference getPrecedenceConstraint_successive_FunctionPrototype_target();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.impl.PrecedenceConstraint_precedingImpl <em>Precedence Constraint preceding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.impl.PrecedenceConstraint_precedingImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.impl._instancerefPackageImpl#getPrecedenceConstraint_preceding()
		 * @generated
		 */
		EClass PRECEDENCE_CONSTRAINT_PRECEDING = eINSTANCE.getPrecedenceConstraint_preceding();

		/**
		 * The meta object literal for the '<em><b>Function Prototype target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_CONSTRAINT_PRECEDING__FUNCTION_PROTOTYPE_TARGET = eINSTANCE.getPrecedenceConstraint_preceding_FunctionPrototype_target();

		/**
		 * The meta object literal for the '<em><b>Function Prototype context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_CONSTRAINT_PRECEDING__FUNCTION_PROTOTYPE_CONTEXT = eINSTANCE.getPrecedenceConstraint_preceding_FunctionPrototype_context();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.impl.PrecedenceConstraint_successiveImpl <em>Precedence Constraint successive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.impl.PrecedenceConstraint_successiveImpl
		 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing._instanceref.impl._instancerefPackageImpl#getPrecedenceConstraint_successive()
		 * @generated
		 */
		EClass PRECEDENCE_CONSTRAINT_SUCCESSIVE = eINSTANCE.getPrecedenceConstraint_successive();

		/**
		 * The meta object literal for the '<em><b>Function Prototype context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_CONTEXT = eINSTANCE.getPrecedenceConstraint_successive_FunctionPrototype_context();

		/**
		 * The meta object literal for the '<em><b>Function Prototype target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_TARGET = eINSTANCE.getPrecedenceConstraint_successive_FunctionPrototype_target();

	}

} //_instancerefPackage
