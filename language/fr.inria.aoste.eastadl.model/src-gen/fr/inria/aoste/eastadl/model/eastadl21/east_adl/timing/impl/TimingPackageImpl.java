/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl;

import fr.inria.aoste.eastadl.model.eastadl21.Eastadl21Package;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.AutosarPackage;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.GenericstructurePackage;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.impl.AbstractstructurePackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.autosartoplevelstructure.AutosartoplevelstructurePackage;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.autosartoplevelstructure.impl.AutosartoplevelstructurePackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.FormulalanguagePackage;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.formulalanguage.impl.FormulalanguagePackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.GeneraltemplateclassesPackage;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.impl.IdentifiablePackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.impl.GeneraltemplateclassesPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.PrimitivetypesPackage;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevaluePackage;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.impl.TimevaluePackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.impl.GenericstructurePackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.impl.AutosarPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.SystemtemplatePackage;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.impl.SystemtemplatePackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.East_adlPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.AnnexesPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.BehaviorconstraintsPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.impl.AnnexesPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.NeedsPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DependabilityPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.impl.ErrormodelPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.impl.DependabilityPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycasePackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.impl.SafetycasePackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyconstraintsPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.impl.SafetyrequirementPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment.EnvironmentPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment.impl.EnvironmentPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.impl.GenericconstraintsPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.impl.East_adlPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.InfrastructurePackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.impl.DatatypesPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ElementsPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.impl.InfrastructurePackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.userattributes.impl.UserattributesPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.InterchangePackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.interchange.impl.InterchangePackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl.RequirementsPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.UsecasesPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.usecases.impl.UsecasesPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.StructurePackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeaturemodelingPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.impl._instancerefPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl.FunctionmodelingPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl.HardwaremodelingPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.impl.StructurePackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.impl.SystemmodelingPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.VehiclefeaturemodelingPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Event;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.ExecutionTimeConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.PrecedenceConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Timing;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingDescription;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventsPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.impl.TimingconstraintsPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.VariabilityPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.impl.Eastadl21PackageImpl;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.GinfrastructurePackage;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GelementsPackage;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesPackage;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gprimitivetypes.impl.GprimitivetypesPackageImpl;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.impl.GinfrastructurePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingPackageImpl extends EPackageImpl implements TimingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionTimeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingDescriptionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimingPackageImpl() {
		super(eNS_URI, TimingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TimingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimingPackage init() {
		if (isInited) return (TimingPackage)EPackage.Registry.INSTANCE.getEPackage(TimingPackage.eNS_URI);

		// Obtain or create and register package
		TimingPackageImpl theTimingPackage = (TimingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TimingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TimingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Eastadl21PackageImpl theEastadl21Package = (Eastadl21PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Eastadl21Package.eNS_URI) instanceof Eastadl21PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Eastadl21Package.eNS_URI) : Eastadl21Package.eINSTANCE);
		East_adlPackageImpl theEast_adlPackage = (East_adlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) instanceof East_adlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) : East_adlPackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		SystemmodelingPackageImpl theSystemmodelingPackage = (SystemmodelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemmodelingPackage.eNS_URI) instanceof SystemmodelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemmodelingPackage.eNS_URI) : SystemmodelingPackage.eINSTANCE);
		FeaturemodelingPackageImpl theFeaturemodelingPackage = (FeaturemodelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeaturemodelingPackage.eNS_URI) instanceof FeaturemodelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeaturemodelingPackage.eNS_URI) : FeaturemodelingPackage.eINSTANCE);
		VehiclefeaturemodelingPackageImpl theVehiclefeaturemodelingPackage = (VehiclefeaturemodelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VehiclefeaturemodelingPackage.eNS_URI) instanceof VehiclefeaturemodelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VehiclefeaturemodelingPackage.eNS_URI) : VehiclefeaturemodelingPackage.eINSTANCE);
		FunctionmodelingPackageImpl theFunctionmodelingPackage = (FunctionmodelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionmodelingPackage.eNS_URI) instanceof FunctionmodelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionmodelingPackage.eNS_URI) : FunctionmodelingPackage.eINSTANCE);
		_instancerefPackageImpl the_instancerefPackage = (_instancerefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_instancerefPackage.eNS_URI) instanceof _instancerefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_instancerefPackage.eNS_URI) : _instancerefPackage.eINSTANCE);
		HardwaremodelingPackageImpl theHardwaremodelingPackage = (HardwaremodelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwaremodelingPackage.eNS_URI) instanceof HardwaremodelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwaremodelingPackage.eNS_URI) : HardwaremodelingPackage.eINSTANCE);
		fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref.impl._instancerefPackageImpl the_instancerefPackage_1 = (fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref.impl._instancerefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.eNS_URI) instanceof fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref.impl._instancerefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.eNS_URI) : fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		VariabilityPackageImpl theVariabilityPackage = (VariabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariabilityPackage.eNS_URI) instanceof VariabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariabilityPackage.eNS_URI) : VariabilityPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);
		fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl._instancerefPackageImpl the_instancerefPackage_2 = (fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl._instancerefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref._instancerefPackage.eNS_URI) instanceof fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref.impl._instancerefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref._instancerefPackage.eNS_URI) : fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements._instanceref._instancerefPackage.eINSTANCE);
		UsecasesPackageImpl theUsecasesPackage = (UsecasesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UsecasesPackage.eNS_URI) instanceof UsecasesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UsecasesPackage.eNS_URI) : UsecasesPackage.eINSTANCE);
		VerificationvalidationPackageImpl theVerificationvalidationPackage = (VerificationvalidationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VerificationvalidationPackage.eNS_URI) instanceof VerificationvalidationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VerificationvalidationPackage.eNS_URI) : VerificationvalidationPackage.eINSTANCE);
		EnvironmentPackageImpl theEnvironmentPackage = (EnvironmentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI) instanceof EnvironmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI) : EnvironmentPackage.eINSTANCE);
		fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.impl._instancerefPackageImpl the_instancerefPackage_3 = (fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.impl._instancerefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref._instancerefPackage.eNS_URI) instanceof fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref.impl._instancerefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref._instancerefPackage.eNS_URI) : fr.inria.aoste.eastadl.model.eastadl21.east_adl.environment._instanceref._instancerefPackage.eINSTANCE);
		InterchangePackageImpl theInterchangePackage = (InterchangePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterchangePackage.eNS_URI) instanceof InterchangePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterchangePackage.eNS_URI) : InterchangePackage.eINSTANCE);
		fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref.impl._instancerefPackageImpl the_instancerefPackage_4 = (fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref.impl._instancerefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref._instancerefPackage.eNS_URI) instanceof fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref.impl._instancerefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref._instancerefPackage.eNS_URI) : fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref._instancerefPackage.eINSTANCE);
		EventsPackageImpl theEventsPackage = (EventsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) : EventsPackage.eINSTANCE);
		fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.impl._instancerefPackageImpl the_instancerefPackage_5 = (fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.impl._instancerefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.eNS_URI) instanceof fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.impl._instancerefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.eNS_URI) : fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.eINSTANCE);
		TimingconstraintsPackageImpl theTimingconstraintsPackage = (TimingconstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimingconstraintsPackage.eNS_URI) instanceof TimingconstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimingconstraintsPackage.eNS_URI) : TimingconstraintsPackage.eINSTANCE);
		DependabilityPackageImpl theDependabilityPackage = (DependabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DependabilityPackage.eNS_URI) instanceof DependabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DependabilityPackage.eNS_URI) : DependabilityPackage.eINSTANCE);
		SafetyconstraintsPackageImpl theSafetyconstraintsPackage = (SafetyconstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SafetyconstraintsPackage.eNS_URI) instanceof SafetyconstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SafetyconstraintsPackage.eNS_URI) : SafetyconstraintsPackage.eINSTANCE);
		fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.impl._instancerefPackageImpl the_instancerefPackage_6 = (fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.impl._instancerefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage.eNS_URI) instanceof fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref.impl._instancerefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage.eNS_URI) : fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage.eINSTANCE);
		ErrormodelPackageImpl theErrormodelPackage = (ErrormodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ErrormodelPackage.eNS_URI) instanceof ErrormodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ErrormodelPackage.eNS_URI) : ErrormodelPackage.eINSTANCE);
		fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl._instancerefPackageImpl the_instancerefPackage_7 = (fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl._instancerefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.eNS_URI) instanceof fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.impl._instancerefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.eNS_URI) : fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.eINSTANCE);
		SafetyrequirementPackageImpl theSafetyrequirementPackage = (SafetyrequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SafetyrequirementPackage.eNS_URI) instanceof SafetyrequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SafetyrequirementPackage.eNS_URI) : SafetyrequirementPackage.eINSTANCE);
		SafetycasePackageImpl theSafetycasePackage = (SafetycasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SafetycasePackage.eNS_URI) instanceof SafetycasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SafetycasePackage.eNS_URI) : SafetycasePackage.eINSTANCE);
		GenericconstraintsPackageImpl theGenericconstraintsPackage = (GenericconstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericconstraintsPackage.eNS_URI) instanceof GenericconstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericconstraintsPackage.eNS_URI) : GenericconstraintsPackage.eINSTANCE);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) : InfrastructurePackage.eINSTANCE);
		ElementsPackageImpl theElementsPackage = (ElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI) instanceof ElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI) : ElementsPackage.eINSTANCE);
		fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl._instancerefPackageImpl the_instancerefPackage_8 = (fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl._instancerefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefPackage.eNS_URI) instanceof fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl._instancerefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefPackage.eNS_URI) : fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		UserattributesPackageImpl theUserattributesPackage = (UserattributesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UserattributesPackage.eNS_URI) instanceof UserattributesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UserattributesPackage.eNS_URI) : UserattributesPackage.eINSTANCE);
		AnnexesPackageImpl theAnnexesPackage = (AnnexesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnexesPackage.eNS_URI) instanceof AnnexesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnexesPackage.eNS_URI) : AnnexesPackage.eINSTANCE);
		BehaviorconstraintsPackageImpl theBehaviorconstraintsPackage = (BehaviorconstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorconstraintsPackage.eNS_URI) instanceof BehaviorconstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorconstraintsPackage.eNS_URI) : BehaviorconstraintsPackage.eINSTANCE);
		NeedsPackageImpl theNeedsPackage = (NeedsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NeedsPackage.eNS_URI) instanceof NeedsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NeedsPackage.eNS_URI) : NeedsPackage.eINSTANCE);
		AutosarPackageImpl theAutosarPackage = (AutosarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AutosarPackage.eNS_URI) instanceof AutosarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AutosarPackage.eNS_URI) : AutosarPackage.eINSTANCE);
		GenericstructurePackageImpl theGenericstructurePackage = (GenericstructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericstructurePackage.eNS_URI) instanceof GenericstructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericstructurePackage.eNS_URI) : GenericstructurePackage.eINSTANCE);
		AutosartoplevelstructurePackageImpl theAutosartoplevelstructurePackage = (AutosartoplevelstructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AutosartoplevelstructurePackage.eNS_URI) instanceof AutosartoplevelstructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AutosartoplevelstructurePackage.eNS_URI) : AutosartoplevelstructurePackage.eINSTANCE);
		GeneraltemplateclassesPackageImpl theGeneraltemplateclassesPackage = (GeneraltemplateclassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneraltemplateclassesPackage.eNS_URI) instanceof GeneraltemplateclassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneraltemplateclassesPackage.eNS_URI) : GeneraltemplateclassesPackage.eINSTANCE);
		TimevaluePackageImpl theTimevaluePackage = (TimevaluePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimevaluePackage.eNS_URI) instanceof TimevaluePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimevaluePackage.eNS_URI) : TimevaluePackage.eINSTANCE);
		IdentifiablePackageImpl theIdentifiablePackage = (IdentifiablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI) instanceof IdentifiablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI) : IdentifiablePackage.eINSTANCE);
		PrimitivetypesPackageImpl thePrimitivetypesPackage = (PrimitivetypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI) instanceof PrimitivetypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI) : PrimitivetypesPackage.eINSTANCE);
		FormulalanguagePackageImpl theFormulalanguagePackage = (FormulalanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FormulalanguagePackage.eNS_URI) instanceof FormulalanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FormulalanguagePackage.eNS_URI) : FormulalanguagePackage.eINSTANCE);
		AbstractstructurePackageImpl theAbstractstructurePackage = (AbstractstructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AbstractstructurePackage.eNS_URI) instanceof AbstractstructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AbstractstructurePackage.eNS_URI) : AbstractstructurePackage.eINSTANCE);
		SystemtemplatePackageImpl theSystemtemplatePackage = (SystemtemplatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemtemplatePackage.eNS_URI) instanceof SystemtemplatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemtemplatePackage.eNS_URI) : SystemtemplatePackage.eINSTANCE);
		GinfrastructurePackageImpl theGinfrastructurePackage = (GinfrastructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GinfrastructurePackage.eNS_URI) instanceof GinfrastructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GinfrastructurePackage.eNS_URI) : GinfrastructurePackage.eINSTANCE);
		GelementsPackageImpl theGelementsPackage = (GelementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GelementsPackage.eNS_URI) instanceof GelementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GelementsPackage.eNS_URI) : GelementsPackage.eINSTANCE);
		GprimitivetypesPackageImpl theGprimitivetypesPackage = (GprimitivetypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GprimitivetypesPackage.eNS_URI) instanceof GprimitivetypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GprimitivetypesPackage.eNS_URI) : GprimitivetypesPackage.eINSTANCE);

		// Create package meta-data objects
		theTimingPackage.createPackageContents();
		theEastadl21Package.createPackageContents();
		theEast_adlPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theSystemmodelingPackage.createPackageContents();
		theFeaturemodelingPackage.createPackageContents();
		theVehiclefeaturemodelingPackage.createPackageContents();
		theFunctionmodelingPackage.createPackageContents();
		the_instancerefPackage.createPackageContents();
		theHardwaremodelingPackage.createPackageContents();
		the_instancerefPackage_1.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theVariabilityPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		the_instancerefPackage_2.createPackageContents();
		theUsecasesPackage.createPackageContents();
		theVerificationvalidationPackage.createPackageContents();
		theEnvironmentPackage.createPackageContents();
		the_instancerefPackage_3.createPackageContents();
		theInterchangePackage.createPackageContents();
		the_instancerefPackage_4.createPackageContents();
		theEventsPackage.createPackageContents();
		the_instancerefPackage_5.createPackageContents();
		theTimingconstraintsPackage.createPackageContents();
		theDependabilityPackage.createPackageContents();
		theSafetyconstraintsPackage.createPackageContents();
		the_instancerefPackage_6.createPackageContents();
		theErrormodelPackage.createPackageContents();
		the_instancerefPackage_7.createPackageContents();
		theSafetyrequirementPackage.createPackageContents();
		theSafetycasePackage.createPackageContents();
		theGenericconstraintsPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theElementsPackage.createPackageContents();
		the_instancerefPackage_8.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theUserattributesPackage.createPackageContents();
		theAnnexesPackage.createPackageContents();
		theBehaviorconstraintsPackage.createPackageContents();
		theNeedsPackage.createPackageContents();
		theAutosarPackage.createPackageContents();
		theGenericstructurePackage.createPackageContents();
		theAutosartoplevelstructurePackage.createPackageContents();
		theGeneraltemplateclassesPackage.createPackageContents();
		theTimevaluePackage.createPackageContents();
		theIdentifiablePackage.createPackageContents();
		thePrimitivetypesPackage.createPackageContents();
		theFormulalanguagePackage.createPackageContents();
		theAbstractstructurePackage.createPackageContents();
		theSystemtemplatePackage.createPackageContents();
		theGinfrastructurePackage.createPackageContents();
		theGelementsPackage.createPackageContents();
		theGprimitivetypesPackage.createPackageContents();

		// Initialize created meta-data
		theTimingPackage.initializePackageContents();
		theEastadl21Package.initializePackageContents();
		theEast_adlPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theSystemmodelingPackage.initializePackageContents();
		theFeaturemodelingPackage.initializePackageContents();
		theVehiclefeaturemodelingPackage.initializePackageContents();
		theFunctionmodelingPackage.initializePackageContents();
		the_instancerefPackage.initializePackageContents();
		theHardwaremodelingPackage.initializePackageContents();
		the_instancerefPackage_1.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theVariabilityPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		the_instancerefPackage_2.initializePackageContents();
		theUsecasesPackage.initializePackageContents();
		theVerificationvalidationPackage.initializePackageContents();
		theEnvironmentPackage.initializePackageContents();
		the_instancerefPackage_3.initializePackageContents();
		theInterchangePackage.initializePackageContents();
		the_instancerefPackage_4.initializePackageContents();
		theEventsPackage.initializePackageContents();
		the_instancerefPackage_5.initializePackageContents();
		theTimingconstraintsPackage.initializePackageContents();
		theDependabilityPackage.initializePackageContents();
		theSafetyconstraintsPackage.initializePackageContents();
		the_instancerefPackage_6.initializePackageContents();
		theErrormodelPackage.initializePackageContents();
		the_instancerefPackage_7.initializePackageContents();
		theSafetyrequirementPackage.initializePackageContents();
		theSafetycasePackage.initializePackageContents();
		theGenericconstraintsPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		the_instancerefPackage_8.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theUserattributesPackage.initializePackageContents();
		theAnnexesPackage.initializePackageContents();
		theBehaviorconstraintsPackage.initializePackageContents();
		theNeedsPackage.initializePackageContents();
		theAutosarPackage.initializePackageContents();
		theGenericstructurePackage.initializePackageContents();
		theAutosartoplevelstructurePackage.initializePackageContents();
		theGeneraltemplateclassesPackage.initializePackageContents();
		theTimevaluePackage.initializePackageContents();
		theIdentifiablePackage.initializePackageContents();
		thePrimitivetypesPackage.initializePackageContents();
		theFormulalanguagePackage.initializePackageContents();
		theAbstractstructurePackage.initializePackageContents();
		theSystemtemplatePackage.initializePackageContents();
		theGinfrastructurePackage.initializePackageContents();
		theGelementsPackage.initializePackageContents();
		theGprimitivetypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimingPackage.eNS_URI, theTimingPackage);
		return theTimingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_IsStateChange() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChain() {
		return eventChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChain_Response() {
		return (EReference)eventChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChain_Strand() {
		return (EReference)eventChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChain_Stimulus() {
		return (EReference)eventChainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChain_Segment() {
		return (EReference)eventChainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionTimeConstraint() {
		return executionTimeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionTimeConstraint_TargetFunctionPrototype() {
		return (EReference)executionTimeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionTimeConstraint_TargetFunction() {
		return (EReference)executionTimeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionTimeConstraint_Variation() {
		return (EReference)executionTimeConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecedenceConstraint() {
		return precedenceConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedenceConstraint_Preceding() {
		return (EReference)precedenceConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedenceConstraint_Successive() {
		return (EReference)precedenceConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeDuration() {
		return timeDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeDuration_CseCode() {
		return (EAttribute)timeDurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeDuration_CseCodeFactor() {
		return (EAttribute)timeDurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeDuration_Value() {
		return (EAttribute)timeDurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTiming() {
		return timingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_TimingDescription() {
		return (EReference)timingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_TimingConstraint() {
		return (EReference)timingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingConstraint() {
		return timingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingConstraint_Lower() {
		return (EReference)timingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingConstraint_Upper() {
		return (EReference)timingConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingConstraint_Mode() {
		return (EReference)timingConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingDescription() {
		return timingDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingFactory getTimingFactory() {
		return (TimingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__IS_STATE_CHANGE);

		eventChainEClass = createEClass(EVENT_CHAIN);
		createEReference(eventChainEClass, EVENT_CHAIN__RESPONSE);
		createEReference(eventChainEClass, EVENT_CHAIN__STRAND);
		createEReference(eventChainEClass, EVENT_CHAIN__STIMULUS);
		createEReference(eventChainEClass, EVENT_CHAIN__SEGMENT);

		executionTimeConstraintEClass = createEClass(EXECUTION_TIME_CONSTRAINT);
		createEReference(executionTimeConstraintEClass, EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION_PROTOTYPE);
		createEReference(executionTimeConstraintEClass, EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION);
		createEReference(executionTimeConstraintEClass, EXECUTION_TIME_CONSTRAINT__VARIATION);

		precedenceConstraintEClass = createEClass(PRECEDENCE_CONSTRAINT);
		createEReference(precedenceConstraintEClass, PRECEDENCE_CONSTRAINT__PRECEDING);
		createEReference(precedenceConstraintEClass, PRECEDENCE_CONSTRAINT__SUCCESSIVE);

		timeDurationEClass = createEClass(TIME_DURATION);
		createEAttribute(timeDurationEClass, TIME_DURATION__CSE_CODE);
		createEAttribute(timeDurationEClass, TIME_DURATION__CSE_CODE_FACTOR);
		createEAttribute(timeDurationEClass, TIME_DURATION__VALUE);

		timingEClass = createEClass(TIMING);
		createEReference(timingEClass, TIMING__TIMING_DESCRIPTION);
		createEReference(timingEClass, TIMING__TIMING_CONSTRAINT);

		timingConstraintEClass = createEClass(TIMING_CONSTRAINT);
		createEReference(timingConstraintEClass, TIMING_CONSTRAINT__LOWER);
		createEReference(timingConstraintEClass, TIMING_CONSTRAINT__UPPER);
		createEReference(timingConstraintEClass, TIMING_CONSTRAINT__MODE);

		timingDescriptionEClass = createEClass(TIMING_DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref._instancerefPackage the_instancerefPackage_4 = (fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref._instancerefPackage)EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref._instancerefPackage.eNS_URI);
		EventsPackage theEventsPackage = (EventsPackage)EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);
		TimingconstraintsPackage theTimingconstraintsPackage = (TimingconstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(TimingconstraintsPackage.eNS_URI);
		PrimitivetypesPackage thePrimitivetypesPackage = (PrimitivetypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI);
		FunctionmodelingPackage theFunctionmodelingPackage = (FunctionmodelingPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionmodelingPackage.eNS_URI);
		ElementsPackage theElementsPackage = (ElementsPackage)EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI);
		TimevaluePackage theTimevaluePackage = (TimevaluePackage)EPackage.Registry.INSTANCE.getEPackage(TimevaluePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(the_instancerefPackage_4);
		getESubpackages().add(theEventsPackage);
		getESubpackages().add(theTimingconstraintsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eventEClass.getESuperTypes().add(this.getTimingDescription());
		eventChainEClass.getESuperTypes().add(this.getTimingDescription());
		executionTimeConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		precedenceConstraintEClass.getESuperTypes().add(this.getTimingConstraint());
		timeDurationEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		timingEClass.getESuperTypes().add(theElementsPackage.getContext());
		timingConstraintEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		timingDescriptionEClass.getESuperTypes().add(theElementsPackage.getEAElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_IsStateChange(), thePrimitivetypesPackage.getBoolean(), "isStateChange", "false", 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventChainEClass, EventChain.class, "EventChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChain_Response(), this.getEvent(), null, "response", null, 1, -1, EventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventChain_Strand(), this.getEventChain(), null, "strand", null, 0, -1, EventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventChain_Stimulus(), this.getEvent(), null, "stimulus", null, 1, -1, EventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventChain_Segment(), this.getEventChain(), null, "segment", null, 0, -1, EventChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionTimeConstraintEClass, ExecutionTimeConstraint.class, "ExecutionTimeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionTimeConstraint_TargetFunctionPrototype(), theFunctionmodelingPackage.getFunctionPrototype(), null, "targetFunctionPrototype", null, 0, 1, ExecutionTimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionTimeConstraint_TargetFunction(), theFunctionmodelingPackage.getFunctionType(), null, "targetFunction", null, 0, 1, ExecutionTimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionTimeConstraint_Variation(), this.getTimeDuration(), null, "variation", null, 1, 1, ExecutionTimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precedenceConstraintEClass, PrecedenceConstraint.class, "PrecedenceConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrecedenceConstraint_Preceding(), the_instancerefPackage_4.getPrecedenceConstraint_preceding(), null, "preceding", null, 1, 1, PrecedenceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedenceConstraint_Successive(), the_instancerefPackage_4.getPrecedenceConstraint_successive(), null, "successive", null, 1, 1, PrecedenceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeDurationEClass, TimeDuration.class, "TimeDuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeDuration_CseCode(), theTimevaluePackage.getCseCodeType(), "cseCode", "0", 1, 1, TimeDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeDuration_CseCodeFactor(), thePrimitivetypesPackage.getInteger(), "cseCodeFactor", "0", 1, 1, TimeDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeDuration_Value(), thePrimitivetypesPackage.getFloat(), "value", "0.0", 1, 1, TimeDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingEClass, Timing.class, "Timing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTiming_TimingDescription(), this.getTimingDescription(), null, "timingDescription", null, 0, -1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTiming_TimingConstraint(), this.getTimingConstraint(), null, "timingConstraint", null, 0, -1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingConstraintEClass, TimingConstraint.class, "TimingConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimingConstraint_Lower(), this.getTimeDuration(), null, "lower", null, 0, 1, TimingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingConstraint_Upper(), this.getTimeDuration(), null, "upper", null, 0, 1, TimingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingConstraint_Mode(), theBehaviorPackage.getMode(), null, "mode", null, 0, -1, TimingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingDescriptionEClass, TimingDescription.class, "TimingDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //TimingPackageImpl
