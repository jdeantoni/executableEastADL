/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.systemtemplate.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.systemtemplate.SystemtemplateFactory;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.systemtemplate.SystemtemplatePackage;

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
public class SystemtemplateFactoryImpl extends EFactoryImpl implements SystemtemplateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemtemplateFactory init() {
		try {
			SystemtemplateFactory theSystemtemplateFactory = (SystemtemplateFactory)EPackage.Registry.INSTANCE.getEFactory(SystemtemplatePackage.eNS_URI);
			if (theSystemtemplateFactory != null) {
				return theSystemtemplateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemtemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemtemplateFactoryImpl() {
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
			case SystemtemplatePackage.SYSTEM: return createSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.systemtemplate.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemtemplatePackage getSystemtemplatePackage() {
		return (SystemtemplatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemtemplatePackage getPackage() {
		return SystemtemplatePackage.eINSTANCE;
	}

} //SystemtemplateFactoryImpl
