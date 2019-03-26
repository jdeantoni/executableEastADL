/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefFactory
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
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/east_adl/dependability/safetyconstraints/_instanceref";

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
	_instancerefPackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.impl._instancerefPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.impl.FaultFailure_anomalyImpl <em>Fault Failure anomaly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.impl.FaultFailure_anomalyImpl
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.impl._instancerefPackageImpl#getFaultFailure_anomaly()
	 * @generated
	 */
	int FAULT_FAILURE_ANOMALY = 0;

	/**
	 * The feature id for the '<em><b>Anomaly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_ANOMALY__ANOMALY = 0;

	/**
	 * The feature id for the '<em><b>Error Model Prototype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_ANOMALY__ERROR_MODEL_PROTOTYPE = 1;

	/**
	 * The number of structural features of the '<em>Fault Failure anomaly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_ANOMALY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fault Failure anomaly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FAILURE_ANOMALY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly <em>Fault Failure anomaly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Failure anomaly</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly
	 * @generated
	 */
	EClass getFaultFailure_anomaly();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly#getAnomaly <em>Anomaly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anomaly</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly#getAnomaly()
	 * @see #getFaultFailure_anomaly()
	 * @generated
	 */
	EReference getFaultFailure_anomaly_Anomaly();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly#getErrorModelPrototype <em>Error Model Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error Model Prototype</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly#getErrorModelPrototype()
	 * @see #getFaultFailure_anomaly()
	 * @generated
	 */
	EReference getFaultFailure_anomaly_ErrorModelPrototype();

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
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.impl.FaultFailure_anomalyImpl <em>Fault Failure anomaly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.impl.FaultFailure_anomalyImpl
		 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.impl._instancerefPackageImpl#getFaultFailure_anomaly()
		 * @generated
		 */
		EClass FAULT_FAILURE_ANOMALY = eINSTANCE.getFaultFailure_anomaly();

		/**
		 * The meta object literal for the '<em><b>Anomaly</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_FAILURE_ANOMALY__ANOMALY = eINSTANCE.getFaultFailure_anomaly_Anomaly();

		/**
		 * The meta object literal for the '<em><b>Error Model Prototype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_FAILURE_ANOMALY__ERROR_MODEL_PROTOTYPE = eINSTANCE.getFaultFailure_anomaly_ErrorModelPrototype();

	}

} //_instancerefPackage
