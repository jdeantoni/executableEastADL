/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.impl;

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

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.EventsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events.impl.EventsPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.AgeTimingConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.ArbitraryEventConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.DelayConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.EventConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.InputSynchronizationConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.OutputSynchronizationConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.PeriodicEventConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.ReactionConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.VariabilityPackageImpl;

import fr.inria.aoste.eastadl.model.eastadl21.impl.Eastadl21PackageImpl;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.GinfrastructurePackage;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GelementsPackage;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesPackage;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gprimitivetypes.impl.GprimitivetypesPackageImpl;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.impl.GinfrastructurePackageImpl;

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
public class TimingconstraintsPackageImpl extends EPackageImpl implements TimingconstraintsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbitraryEventConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEventConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicEventConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicEventConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ageTimingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputSynchronizationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputSynchronizationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactionConstraintEClass = null;

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
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimingconstraintsPackageImpl() {
		super(eNS_URI, TimingconstraintsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TimingconstraintsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimingconstraintsPackage init() {
		if (isInited) return (TimingconstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(TimingconstraintsPackage.eNS_URI);

		// Obtain or create and register package
		TimingconstraintsPackageImpl theTimingconstraintsPackage = (TimingconstraintsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TimingconstraintsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TimingconstraintsPackageImpl());

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
		TimingPackageImpl theTimingPackage = (TimingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimingPackage.eNS_URI) instanceof TimingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimingPackage.eNS_URI) : TimingPackage.eINSTANCE);
		fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref.impl._instancerefPackageImpl the_instancerefPackage_4 = (fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref.impl._instancerefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref._instancerefPackage.eNS_URI) instanceof fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref.impl._instancerefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref._instancerefPackage.eNS_URI) : fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref._instancerefPackage.eINSTANCE);
		EventsPackageImpl theEventsPackage = (EventsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) : EventsPackage.eINSTANCE);
		fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.impl._instancerefPackageImpl the_instancerefPackage_5 = (fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.impl._instancerefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.eNS_URI) instanceof fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.impl._instancerefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.eNS_URI) : fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.eINSTANCE);
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
		theTimingconstraintsPackage.createPackageContents();
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
		theTimingPackage.createPackageContents();
		the_instancerefPackage_4.createPackageContents();
		theEventsPackage.createPackageContents();
		the_instancerefPackage_5.createPackageContents();
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
		theTimingconstraintsPackage.initializePackageContents();
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
		theTimingPackage.initializePackageContents();
		the_instancerefPackage_4.initializePackageContents();
		theEventsPackage.initializePackageContents();
		the_instancerefPackage_5.initializePackageContents();
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
		theTimingconstraintsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimingconstraintsPackage.eNS_URI, theTimingconstraintsPackage);
		return theTimingconstraintsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArbitraryEventConstraint() {
		return arbitraryEventConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArbitraryEventConstraint_MinimumInterArrivalTime() {
		return (EReference)arbitraryEventConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArbitraryEventConstraint_MaximumInterArrivalTime() {
		return (EReference)arbitraryEventConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventConstraint() {
		return eventConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventConstraint_Offset() {
		return (EReference)eventConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventConstraint_Event() {
		return (EReference)eventConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternEventConstraint() {
		return patternEventConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternEventConstraint_Period() {
		return (EReference)patternEventConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternEventConstraint_MinimumInterArrivalTime() {
		return (EReference)patternEventConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternEventConstraint_Occurrence() {
		return (EReference)patternEventConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternEventConstraint_Jitter() {
		return (EReference)patternEventConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicEventConstraint() {
		return periodicEventConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicEventConstraint_MinimumInterArrivalTime() {
		return (EReference)periodicEventConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicEventConstraint_Period() {
		return (EReference)periodicEventConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicEventConstraint_Jitter() {
		return (EReference)periodicEventConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSporadicEventConstraint() {
		return sporadicEventConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicEventConstraint_MinimumInterArrivalTime() {
		return (EReference)sporadicEventConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicEventConstraint_MaximumInterArrivalTime() {
		return (EReference)sporadicEventConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicEventConstraint_Jitter() {
		return (EReference)sporadicEventConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicEventConstraint_Period() {
		return (EReference)sporadicEventConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgeTimingConstraint() {
		return ageTimingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelayConstraint() {
		return delayConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayConstraint_Jitter() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayConstraint_Nominal() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayConstraint_Scope() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputSynchronizationConstraint() {
		return inputSynchronizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputSynchronizationConstraint_Width() {
		return (EReference)inputSynchronizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputSynchronizationConstraint() {
		return outputSynchronizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputSynchronizationConstraint_Width() {
		return (EReference)outputSynchronizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactionConstraint() {
		return reactionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingconstraintsFactory getTimingconstraintsFactory() {
		return (TimingconstraintsFactory)getEFactoryInstance();
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
		arbitraryEventConstraintEClass = createEClass(ARBITRARY_EVENT_CONSTRAINT);
		createEReference(arbitraryEventConstraintEClass, ARBITRARY_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME);
		createEReference(arbitraryEventConstraintEClass, ARBITRARY_EVENT_CONSTRAINT__MAXIMUM_INTER_ARRIVAL_TIME);

		eventConstraintEClass = createEClass(EVENT_CONSTRAINT);
		createEReference(eventConstraintEClass, EVENT_CONSTRAINT__OFFSET);
		createEReference(eventConstraintEClass, EVENT_CONSTRAINT__EVENT);

		patternEventConstraintEClass = createEClass(PATTERN_EVENT_CONSTRAINT);
		createEReference(patternEventConstraintEClass, PATTERN_EVENT_CONSTRAINT__PERIOD);
		createEReference(patternEventConstraintEClass, PATTERN_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME);
		createEReference(patternEventConstraintEClass, PATTERN_EVENT_CONSTRAINT__OCCURRENCE);
		createEReference(patternEventConstraintEClass, PATTERN_EVENT_CONSTRAINT__JITTER);

		periodicEventConstraintEClass = createEClass(PERIODIC_EVENT_CONSTRAINT);
		createEReference(periodicEventConstraintEClass, PERIODIC_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME);
		createEReference(periodicEventConstraintEClass, PERIODIC_EVENT_CONSTRAINT__PERIOD);
		createEReference(periodicEventConstraintEClass, PERIODIC_EVENT_CONSTRAINT__JITTER);

		sporadicEventConstraintEClass = createEClass(SPORADIC_EVENT_CONSTRAINT);
		createEReference(sporadicEventConstraintEClass, SPORADIC_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME);
		createEReference(sporadicEventConstraintEClass, SPORADIC_EVENT_CONSTRAINT__MAXIMUM_INTER_ARRIVAL_TIME);
		createEReference(sporadicEventConstraintEClass, SPORADIC_EVENT_CONSTRAINT__JITTER);
		createEReference(sporadicEventConstraintEClass, SPORADIC_EVENT_CONSTRAINT__PERIOD);

		ageTimingConstraintEClass = createEClass(AGE_TIMING_CONSTRAINT);

		delayConstraintEClass = createEClass(DELAY_CONSTRAINT);
		createEReference(delayConstraintEClass, DELAY_CONSTRAINT__JITTER);
		createEReference(delayConstraintEClass, DELAY_CONSTRAINT__NOMINAL);
		createEReference(delayConstraintEClass, DELAY_CONSTRAINT__SCOPE);

		inputSynchronizationConstraintEClass = createEClass(INPUT_SYNCHRONIZATION_CONSTRAINT);
		createEReference(inputSynchronizationConstraintEClass, INPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH);

		outputSynchronizationConstraintEClass = createEClass(OUTPUT_SYNCHRONIZATION_CONSTRAINT);
		createEReference(outputSynchronizationConstraintEClass, OUTPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH);

		reactionConstraintEClass = createEClass(REACTION_CONSTRAINT);
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
		TimingPackage theTimingPackage = (TimingPackage)EPackage.Registry.INSTANCE.getEPackage(TimingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arbitraryEventConstraintEClass.getESuperTypes().add(this.getEventConstraint());
		eventConstraintEClass.getESuperTypes().add(theTimingPackage.getTimingConstraint());
		patternEventConstraintEClass.getESuperTypes().add(this.getEventConstraint());
		periodicEventConstraintEClass.getESuperTypes().add(this.getEventConstraint());
		sporadicEventConstraintEClass.getESuperTypes().add(this.getEventConstraint());
		ageTimingConstraintEClass.getESuperTypes().add(this.getDelayConstraint());
		delayConstraintEClass.getESuperTypes().add(theTimingPackage.getTimingConstraint());
		inputSynchronizationConstraintEClass.getESuperTypes().add(this.getAgeTimingConstraint());
		outputSynchronizationConstraintEClass.getESuperTypes().add(this.getReactionConstraint());
		reactionConstraintEClass.getESuperTypes().add(this.getDelayConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(arbitraryEventConstraintEClass, ArbitraryEventConstraint.class, "ArbitraryEventConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArbitraryEventConstraint_MinimumInterArrivalTime(), theTimingPackage.getTimeDuration(), null, "minimumInterArrivalTime", null, 1, -1, ArbitraryEventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArbitraryEventConstraint_MaximumInterArrivalTime(), theTimingPackage.getTimeDuration(), null, "maximumInterArrivalTime", null, 1, -1, ArbitraryEventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventConstraintEClass, EventConstraint.class, "EventConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventConstraint_Offset(), theTimingPackage.getTimeDuration(), null, "offset", null, 0, 1, EventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventConstraint_Event(), theTimingPackage.getEvent(), null, "event", null, 0, 1, EventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternEventConstraintEClass, PatternEventConstraint.class, "PatternEventConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternEventConstraint_Period(), theTimingPackage.getTimeDuration(), null, "period", null, 1, 1, PatternEventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternEventConstraint_MinimumInterArrivalTime(), theTimingPackage.getTimeDuration(), null, "minimumInterArrivalTime", null, 1, 1, PatternEventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternEventConstraint_Occurrence(), theTimingPackage.getTimeDuration(), null, "occurrence", null, 1, -1, PatternEventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternEventConstraint_Jitter(), theTimingPackage.getTimeDuration(), null, "jitter", null, 1, 1, PatternEventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicEventConstraintEClass, PeriodicEventConstraint.class, "PeriodicEventConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodicEventConstraint_MinimumInterArrivalTime(), theTimingPackage.getTimeDuration(), null, "minimumInterArrivalTime", null, 1, 1, PeriodicEventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicEventConstraint_Period(), theTimingPackage.getTimeDuration(), null, "period", null, 1, 1, PeriodicEventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicEventConstraint_Jitter(), theTimingPackage.getTimeDuration(), null, "jitter", null, 1, 1, PeriodicEventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sporadicEventConstraintEClass, SporadicEventConstraint.class, "SporadicEventConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSporadicEventConstraint_MinimumInterArrivalTime(), theTimingPackage.getTimeDuration(), null, "minimumInterArrivalTime", null, 1, 1, SporadicEventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSporadicEventConstraint_MaximumInterArrivalTime(), theTimingPackage.getTimeDuration(), null, "maximumInterArrivalTime", null, 0, 1, SporadicEventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSporadicEventConstraint_Jitter(), theTimingPackage.getTimeDuration(), null, "jitter", null, 0, 1, SporadicEventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSporadicEventConstraint_Period(), theTimingPackage.getTimeDuration(), null, "period", null, 1, 1, SporadicEventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ageTimingConstraintEClass, AgeTimingConstraint.class, "AgeTimingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delayConstraintEClass, DelayConstraint.class, "DelayConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelayConstraint_Jitter(), theTimingPackage.getTimeDuration(), null, "jitter", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Nominal(), theTimingPackage.getTimeDuration(), null, "nominal", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Scope(), theTimingPackage.getEventChain(), null, "scope", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputSynchronizationConstraintEClass, InputSynchronizationConstraint.class, "InputSynchronizationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputSynchronizationConstraint_Width(), theTimingPackage.getTimeDuration(), null, "width", null, 1, 1, InputSynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputSynchronizationConstraintEClass, OutputSynchronizationConstraint.class, "OutputSynchronizationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputSynchronizationConstraint_Width(), theTimingPackage.getTimeDuration(), null, "width", null, 1, 1, OutputSynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactionConstraintEClass, ReactionConstraint.class, "ReactionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //TimingconstraintsPackageImpl
