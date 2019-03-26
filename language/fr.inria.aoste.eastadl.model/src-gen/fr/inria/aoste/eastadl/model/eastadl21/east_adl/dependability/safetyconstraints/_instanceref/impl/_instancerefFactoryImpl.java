/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _instancerefFactoryImpl extends EFactoryImpl implements _instancerefFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _instancerefFactory init() {
		try {
			_instancerefFactory the_instancerefFactory = (_instancerefFactory)EPackage.Registry.INSTANCE.getEFactory(_instancerefPackage.eNS_URI);
			if (the_instancerefFactory != null) {
				return the_instancerefFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _instancerefFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _instancerefFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _instancerefPackage.FAULT_FAILURE_ANOMALY: return createFaultFailure_anomaly();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailure_anomaly createFaultFailure_anomaly() {
		FaultFailure_anomalyImpl faultFailure_anomaly = new FaultFailure_anomalyImpl();
		return faultFailure_anomaly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _instancerefPackage get_instancerefPackage() {
		return (_instancerefPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _instancerefPackage getPackage() {
		return _instancerefPackage.eINSTANCE;
	}

} //_instancerefFactoryImpl
