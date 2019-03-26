/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.impl;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.*;

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
public class IdentifiableFactoryImpl extends EFactoryImpl implements IdentifiableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IdentifiableFactory init() {
		try {
			IdentifiableFactory theIdentifiableFactory = (IdentifiableFactory)EPackage.Registry.INSTANCE.getEFactory(IdentifiablePackage.eNS_URI);
			if (theIdentifiableFactory != null) {
				return theIdentifiableFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IdentifiableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiablePackage getIdentifiablePackage() {
		return (IdentifiablePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IdentifiablePackage getPackage() {
		return IdentifiablePackage.eINSTANCE;
	}

} //IdentifiableFactoryImpl
