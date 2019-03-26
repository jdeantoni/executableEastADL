/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.*;

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
public class ElementsFactoryImpl extends EFactoryImpl implements ElementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElementsFactory init() {
		try {
			ElementsFactory theElementsFactory = (ElementsFactory)EPackage.Registry.INSTANCE.getEFactory(ElementsPackage.eNS_URI);
			if (theElementsFactory != null) {
				return theElementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ElementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementsFactoryImpl() {
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
			case ElementsPackage.COMMENT: return createComment();
			case ElementsPackage.EA_PACKAGE: return createEAPackage();
			case ElementsPackage.EAXML: return createEAXML();
			case ElementsPackage.MULTI_LEVEL_REFERENCE: return createMultiLevelReference();
			case ElementsPackage.RATIONALE: return createRationale();
			case ElementsPackage.REALIZATION: return createRealization();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAPackage createEAPackage() {
		EAPackageImpl eaPackage = new EAPackageImpl();
		return eaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAXML createEAXML() {
		EAXMLImpl eaxml = new EAXMLImpl();
		return eaxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLevelReference createMultiLevelReference() {
		MultiLevelReferenceImpl multiLevelReference = new MultiLevelReferenceImpl();
		return multiLevelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rationale createRationale() {
		RationaleImpl rationale = new RationaleImpl();
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization createRealization() {
		RealizationImpl realization = new RealizationImpl();
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementsPackage getElementsPackage() {
		return (ElementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ElementsPackage getPackage() {
		return ElementsPackage.eINSTANCE;
	}

} //ElementsFactoryImpl
