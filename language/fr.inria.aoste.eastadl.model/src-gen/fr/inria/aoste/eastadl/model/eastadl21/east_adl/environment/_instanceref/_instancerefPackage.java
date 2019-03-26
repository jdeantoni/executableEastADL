/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref._instancerefFactory
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
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/east_adl/environment/_instanceref";

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
	_instancerefPackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.impl._instancerefPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.impl.ClampConnector_portImpl <em>Clamp Connector port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.impl.ClampConnector_portImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.impl._instancerefPackageImpl#getClampConnector_port()
	 * @generated
	 */
	int CLAMP_CONNECTOR_PORT = 0;

	/**
	 * The feature id for the '<em><b>Function Prototype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP_CONNECTOR_PORT__FUNCTION_PROTOTYPE = 0;

	/**
	 * The feature id for the '<em><b>Function Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP_CONNECTOR_PORT__FUNCTION_PORT = 1;

	/**
	 * The number of structural features of the '<em>Clamp Connector port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP_CONNECTOR_PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Clamp Connector port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMP_CONNECTOR_PORT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.ClampConnector_port <em>Clamp Connector port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clamp Connector port</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.ClampConnector_port
	 * @generated
	 */
	EClass getClampConnector_port();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.ClampConnector_port#getFunctionPrototype <em>Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Function Prototype</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.ClampConnector_port#getFunctionPrototype()
	 * @see #getClampConnector_port()
	 * @generated
	 */
	EReference getClampConnector_port_FunctionPrototype();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.ClampConnector_port#getFunctionPort <em>Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Port</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.ClampConnector_port#getFunctionPort()
	 * @see #getClampConnector_port()
	 * @generated
	 */
	EReference getClampConnector_port_FunctionPort();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.impl.ClampConnector_portImpl <em>Clamp Connector port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.impl.ClampConnector_portImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.impl._instancerefPackageImpl#getClampConnector_port()
		 * @generated
		 */
		EClass CLAMP_CONNECTOR_PORT = eINSTANCE.getClampConnector_port();

		/**
		 * The meta object literal for the '<em><b>Function Prototype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAMP_CONNECTOR_PORT__FUNCTION_PROTOTYPE = eINSTANCE.getClampConnector_port_FunctionPrototype();

		/**
		 * The meta object literal for the '<em><b>Function Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAMP_CONNECTOR_PORT__FUNCTION_PORT = eINSTANCE.getClampConnector_port_FunctionPort();

	}

} //_instancerefPackage
