/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref.*;

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
			case _instancerefPackage.HARDWARE_CONNECTOR_PORT: return createHardwareConnector_port();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareConnector_port createHardwareConnector_port() {
		HardwareConnector_portImpl hardwareConnector_port = new HardwareConnector_portImpl();
		return hardwareConnector_port;
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
