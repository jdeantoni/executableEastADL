/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.FormulalanguageFactory
 * @model kind="package"
 * @generated
 */
public interface FormulalanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "formulalanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/autosar/genericstructure/formulalanguage";

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
	FormulalanguagePackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.impl.FormulalanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.impl.FormulaExpressionImpl <em>Formula Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.impl.FormulaExpressionImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.impl.FormulalanguagePackageImpl#getFormulaExpression()
	 * @generated
	 */
	int FORMULA_EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Formula Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Formula Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_EXPRESSION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.FormulaExpression <em>Formula Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula Expression</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.FormulaExpression
	 * @generated
	 */
	EClass getFormulaExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormulalanguageFactory getFormulalanguageFactory();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.impl.FormulaExpressionImpl <em>Formula Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.impl.FormulaExpressionImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.impl.FormulalanguagePackageImpl#getFormulaExpression()
		 * @generated
		 */
		EClass FORMULA_EXPRESSION = eINSTANCE.getFormulaExpression();

	}

} //FormulalanguagePackage
