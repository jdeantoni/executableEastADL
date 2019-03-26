/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class RequirementsFactoryImpl extends EFactoryImpl implements RequirementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequirementsFactory init() {
		try {
			RequirementsFactory theRequirementsFactory = (RequirementsFactory)EPackage.Registry.INSTANCE.getEFactory(RequirementsPackage.eNS_URI);
			if (theRequirementsFactory != null) {
				return theRequirementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequirementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsFactoryImpl() {
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
			case RequirementsPackage.DERIVE_REQUIREMENT: return createDeriveRequirement();
			case RequirementsPackage.OPERATIONAL_SITUATION: return createOperationalSituation();
			case RequirementsPackage.REQUIREMENTS_MODEL: return createRequirementsModel();
			case RequirementsPackage.REQUIREMENTS_RELATED_INFORMATION: return createRequirementsRelatedInformation();
			case RequirementsPackage.REQUIREMENT: return createRequirement();
			case RequirementsPackage.REQUIREMENTS_CONTAINER: return createRequirementsContainer();
			case RequirementsPackage.REFINE: return createRefine();
			case RequirementsPackage.SATISFY: return createSatisfy();
			case RequirementsPackage.REQUIREMENTS_LINK: return createRequirementsLink();
			case RequirementsPackage.REQUIREMENTS_RELATION_GROUP: return createRequirementsRelationGroup();
			case RequirementsPackage.QUALITY_REQUIREMENT: return createQualityRequirement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RequirementsPackage.QUALITY_REQUIREMENT_KIND:
				return createQualityRequirementKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RequirementsPackage.QUALITY_REQUIREMENT_KIND:
				return convertQualityRequirementKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeriveRequirement createDeriveRequirement() {
		DeriveRequirementImpl deriveRequirement = new DeriveRequirementImpl();
		return deriveRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalSituation createOperationalSituation() {
		OperationalSituationImpl operationalSituation = new OperationalSituationImpl();
		return operationalSituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsModel createRequirementsModel() {
		RequirementsModelImpl requirementsModel = new RequirementsModelImpl();
		return requirementsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsRelatedInformation createRequirementsRelatedInformation() {
		RequirementsRelatedInformationImpl requirementsRelatedInformation = new RequirementsRelatedInformationImpl();
		return requirementsRelatedInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsContainer createRequirementsContainer() {
		RequirementsContainerImpl requirementsContainer = new RequirementsContainerImpl();
		return requirementsContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refine createRefine() {
		RefineImpl refine = new RefineImpl();
		return refine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Satisfy createSatisfy() {
		SatisfyImpl satisfy = new SatisfyImpl();
		return satisfy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsLink createRequirementsLink() {
		RequirementsLinkImpl requirementsLink = new RequirementsLinkImpl();
		return requirementsLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsRelationGroup createRequirementsRelationGroup() {
		RequirementsRelationGroupImpl requirementsRelationGroup = new RequirementsRelationGroupImpl();
		return requirementsRelationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityRequirement createQualityRequirement() {
		QualityRequirementImpl qualityRequirement = new QualityRequirementImpl();
		return qualityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityRequirementKind createQualityRequirementKindFromString(EDataType eDataType, String initialValue) {
		QualityRequirementKind result = QualityRequirementKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualityRequirementKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsPackage getRequirementsPackage() {
		return (RequirementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequirementsPackage getPackage() {
		return RequirementsPackage.eINSTANCE;
	}

} //RequirementsFactoryImpl
