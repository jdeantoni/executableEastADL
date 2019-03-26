/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.*;

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
public class NeedsFactoryImpl extends EFactoryImpl implements NeedsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NeedsFactory init() {
		try {
			NeedsFactory theNeedsFactory = (NeedsFactory)EPackage.Registry.INSTANCE.getEFactory(NeedsPackage.eNS_URI);
			if (theNeedsFactory != null) {
				return theNeedsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NeedsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeedsFactoryImpl() {
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
			case NeedsPackage.ARCHITECTURAL_DESCRIPTION: return createArchitecturalDescription();
			case NeedsPackage.ARCHITECTURAL_MODEL: return createArchitecturalModel();
			case NeedsPackage.ARCHITECTURE: return createArchitecture();
			case NeedsPackage.MISSION: return createMission();
			case NeedsPackage.VEHICLE_SYSTEM: return createVehicleSystem();
			case NeedsPackage.STAKEHOLDER: return createStakeholder();
			case NeedsPackage.STAKEHOLDER_NEED: return createStakeholderNeed();
			case NeedsPackage.BUSINESS_OPPORTUNITY: return createBusinessOpportunity();
			case NeedsPackage.PROBLEM_STATEMENT: return createProblemStatement();
			case NeedsPackage.PRODUCT_POSITIONING: return createProductPositioning();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalDescription createArchitecturalDescription() {
		ArchitecturalDescriptionImpl architecturalDescription = new ArchitecturalDescriptionImpl();
		return architecturalDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalModel createArchitecturalModel() {
		ArchitecturalModelImpl architecturalModel = new ArchitecturalModelImpl();
		return architecturalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture createArchitecture() {
		ArchitectureImpl architecture = new ArchitectureImpl();
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleSystem createVehicleSystem() {
		VehicleSystemImpl vehicleSystem = new VehicleSystemImpl();
		return vehicleSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stakeholder createStakeholder() {
		StakeholderImpl stakeholder = new StakeholderImpl();
		return stakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeholderNeed createStakeholderNeed() {
		StakeholderNeedImpl stakeholderNeed = new StakeholderNeedImpl();
		return stakeholderNeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessOpportunity createBusinessOpportunity() {
		BusinessOpportunityImpl businessOpportunity = new BusinessOpportunityImpl();
		return businessOpportunity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatement createProblemStatement() {
		ProblemStatementImpl problemStatement = new ProblemStatementImpl();
		return problemStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPositioning createProductPositioning() {
		ProductPositioningImpl productPositioning = new ProductPositioningImpl();
		return productPositioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeedsPackage getNeedsPackage() {
		return (NeedsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NeedsPackage getPackage() {
		return NeedsPackage.eINSTANCE;
	}

} //NeedsFactoryImpl
