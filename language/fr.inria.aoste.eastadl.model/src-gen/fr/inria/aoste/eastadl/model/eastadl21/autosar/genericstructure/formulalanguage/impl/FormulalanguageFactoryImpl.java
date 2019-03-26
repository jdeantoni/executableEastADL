/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.impl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.*;

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
public class FormulalanguageFactoryImpl extends EFactoryImpl implements FormulalanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormulalanguageFactory init() {
		try {
			FormulalanguageFactory theFormulalanguageFactory = (FormulalanguageFactory)EPackage.Registry.INSTANCE.getEFactory(FormulalanguagePackage.eNS_URI);
			if (theFormulalanguageFactory != null) {
				return theFormulalanguageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FormulalanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulalanguageFactoryImpl() {
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
	public FormulalanguagePackage getFormulalanguagePackage() {
		return (FormulalanguagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FormulalanguagePackage getPackage() {
		return FormulalanguagePackage.eINSTANCE;
	}

} //FormulalanguageFactoryImpl
