/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.*;

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
public class GinfrastructureFactoryImpl extends EFactoryImpl implements GinfrastructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GinfrastructureFactory init() {
		try {
			GinfrastructureFactory theGinfrastructureFactory = (GinfrastructureFactory)EPackage.Registry.INSTANCE.getEFactory(GinfrastructurePackage.eNS_URI);
			if (theGinfrastructureFactory != null) {
				return theGinfrastructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GinfrastructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GinfrastructureFactoryImpl() {
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
			case GinfrastructurePackage.TRICK_EM_FGENERATOR: return createtrickEMFgenerator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public trickEMFgenerator createtrickEMFgenerator() {
		trickEMFgeneratorImpl trickEMFgenerator = new trickEMFgeneratorImpl();
		return trickEMFgenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GinfrastructurePackage getGinfrastructurePackage() {
		return (GinfrastructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GinfrastructurePackage getPackage() {
		return GinfrastructurePackage.eINSTANCE;
	}

} //GinfrastructureFactoryImpl
