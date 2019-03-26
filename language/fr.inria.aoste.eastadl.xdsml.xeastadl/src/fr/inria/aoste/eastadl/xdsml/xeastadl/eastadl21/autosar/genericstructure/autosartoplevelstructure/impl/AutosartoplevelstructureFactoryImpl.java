/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.autosartoplevelstructure.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.autosartoplevelstructure.*;

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
public class AutosartoplevelstructureFactoryImpl extends EFactoryImpl implements AutosartoplevelstructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AutosartoplevelstructureFactory init() {
		try {
			AutosartoplevelstructureFactory theAutosartoplevelstructureFactory = (AutosartoplevelstructureFactory)EPackage.Registry.INSTANCE.getEFactory(AutosartoplevelstructurePackage.eNS_URI);
			if (theAutosartoplevelstructureFactory != null) {
				return theAutosartoplevelstructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AutosartoplevelstructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutosartoplevelstructureFactoryImpl() {
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
			case AutosartoplevelstructurePackage.AUTOSAR: return createAUTOSAR();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUTOSAR createAUTOSAR() {
		AUTOSARImpl autosar = new AUTOSARImpl();
		return autosar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutosartoplevelstructurePackage getAutosartoplevelstructurePackage() {
		return (AutosartoplevelstructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AutosartoplevelstructurePackage getPackage() {
		return AutosartoplevelstructurePackage.eINSTANCE;
	}

} //AutosartoplevelstructureFactoryImpl
