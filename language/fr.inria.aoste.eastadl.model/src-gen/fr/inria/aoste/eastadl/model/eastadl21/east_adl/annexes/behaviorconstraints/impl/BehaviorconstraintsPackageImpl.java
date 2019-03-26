/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl;

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

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorAnnex;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.ComputationConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Flow;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Parameter;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.State;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Transformation;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Transition;

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
public class BehaviorconstraintsPackageImpl extends EPackageImpl implements BehaviorconstraintsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorAnnexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

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
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviorconstraintsPackageImpl() {
		super(eNS_URI, BehaviorconstraintsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BehaviorconstraintsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviorconstraintsPackage init() {
		if (isInited) return (BehaviorconstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorconstraintsPackage.eNS_URI);

		// Obtain or create and register package
		BehaviorconstraintsPackageImpl theBehaviorconstraintsPackage = (BehaviorconstraintsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BehaviorconstraintsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BehaviorconstraintsPackageImpl());

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
		theBehaviorconstraintsPackage.createPackageContents();
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
		theBehaviorconstraintsPackage.initializePackageContents();
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
		theBehaviorconstraintsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviorconstraintsPackage.eNS_URI, theBehaviorconstraintsPackage);
		return theBehaviorconstraintsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorAnnex() {
		return behaviorAnnexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorAnnex_BehaviorConstraint() {
		return (EReference)behaviorAnnexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorConstraint() {
		return behaviorConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorConstraint_ConstrainedMode() {
		return (EReference)behaviorConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorConstraint_RelatedVehicleFeature() {
		return (EReference)behaviorConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorConstraint_ConstrainedFunctionBehavior() {
		return (EReference)behaviorConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorConstraint_ConstrainedErrorBehavior() {
		return (EReference)behaviorConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorConstraint_ConstrainedFunctionTrigger() {
		return (EReference)behaviorConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachineConstraint() {
		return stateMachineConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachineConstraint_State() {
		return (EReference)stateMachineConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachineConstraint_Transition() {
		return (EReference)stateMachineConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputationConstraint() {
		return computationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputationConstraint_Flow() {
		return (EReference)computationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputationConstraint_Transformation() {
		return (EReference)computationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_SinkParameter() {
		return (EReference)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_OrderedSegment() {
		return (EReference)flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_SourceParameter() {
		return (EReference)flowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_TargetFunctionPort() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_TargetFunction() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Type() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterCondition() {
		return parameterConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterCondition_Expression() {
		return (EAttribute)parameterConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCondition_RepresentAnomaly() {
		return (EReference)parameterConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCondition_AppliedToCondition() {
		return (EReference)parameterConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCondition_AppliedToParameter() {
		return (EReference)parameterConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterConstraint() {
		return parameterConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterConstraint_Parameter() {
		return (EReference)parameterConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterConstraint_ParameterCondition() {
		return (EReference)parameterConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_InitState() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_SubStateMachineConstraint() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Denote() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_RepresentMode() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_PostCondition() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_OutgoingFlow() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_IncomingFlow() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_InOut() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_PreCondition() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_InvariantCondition() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_SubComputationConstraint() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_In() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Out() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Write() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_To() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_ConditionSpecification() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Invoke() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Read() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_From() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorconstraintsFactory getBehaviorconstraintsFactory() {
		return (BehaviorconstraintsFactory)getEFactoryInstance();
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
		behaviorAnnexEClass = createEClass(BEHAVIOR_ANNEX);
		createEReference(behaviorAnnexEClass, BEHAVIOR_ANNEX__BEHAVIOR_CONSTRAINT);

		behaviorConstraintEClass = createEClass(BEHAVIOR_CONSTRAINT);
		createEReference(behaviorConstraintEClass, BEHAVIOR_CONSTRAINT__CONSTRAINED_MODE);
		createEReference(behaviorConstraintEClass, BEHAVIOR_CONSTRAINT__RELATED_VEHICLE_FEATURE);
		createEReference(behaviorConstraintEClass, BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_BEHAVIOR);
		createEReference(behaviorConstraintEClass, BEHAVIOR_CONSTRAINT__CONSTRAINED_ERROR_BEHAVIOR);
		createEReference(behaviorConstraintEClass, BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_TRIGGER);

		stateMachineConstraintEClass = createEClass(STATE_MACHINE_CONSTRAINT);
		createEReference(stateMachineConstraintEClass, STATE_MACHINE_CONSTRAINT__STATE);
		createEReference(stateMachineConstraintEClass, STATE_MACHINE_CONSTRAINT__TRANSITION);

		computationConstraintEClass = createEClass(COMPUTATION_CONSTRAINT);
		createEReference(computationConstraintEClass, COMPUTATION_CONSTRAINT__FLOW);
		createEReference(computationConstraintEClass, COMPUTATION_CONSTRAINT__TRANSFORMATION);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__SINK_PARAMETER);
		createEReference(flowEClass, FLOW__ORDERED_SEGMENT);
		createEReference(flowEClass, FLOW__SOURCE_PARAMETER);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__TARGET_FUNCTION_PORT);
		createEReference(parameterEClass, PARAMETER__TARGET_FUNCTION);
		createEReference(parameterEClass, PARAMETER__TYPE);

		parameterConditionEClass = createEClass(PARAMETER_CONDITION);
		createEAttribute(parameterConditionEClass, PARAMETER_CONDITION__EXPRESSION);
		createEReference(parameterConditionEClass, PARAMETER_CONDITION__REPRESENT_ANOMALY);
		createEReference(parameterConditionEClass, PARAMETER_CONDITION__APPLIED_TO_CONDITION);
		createEReference(parameterConditionEClass, PARAMETER_CONDITION__APPLIED_TO_PARAMETER);

		parameterConstraintEClass = createEClass(PARAMETER_CONSTRAINT);
		createEReference(parameterConstraintEClass, PARAMETER_CONSTRAINT__PARAMETER);
		createEReference(parameterConstraintEClass, PARAMETER_CONSTRAINT__PARAMETER_CONDITION);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__INIT_STATE);
		createEReference(stateEClass, STATE__SUB_STATE_MACHINE_CONSTRAINT);
		createEReference(stateEClass, STATE__DENOTE);
		createEReference(stateEClass, STATE__REPRESENT_MODE);

		transformationEClass = createEClass(TRANSFORMATION);
		createEReference(transformationEClass, TRANSFORMATION__POST_CONDITION);
		createEReference(transformationEClass, TRANSFORMATION__OUTGOING_FLOW);
		createEReference(transformationEClass, TRANSFORMATION__INCOMING_FLOW);
		createEReference(transformationEClass, TRANSFORMATION__IN_OUT);
		createEReference(transformationEClass, TRANSFORMATION__PRE_CONDITION);
		createEReference(transformationEClass, TRANSFORMATION__INVARIANT_CONDITION);
		createEReference(transformationEClass, TRANSFORMATION__SUB_COMPUTATION_CONSTRAINT);
		createEReference(transformationEClass, TRANSFORMATION__IN);
		createEReference(transformationEClass, TRANSFORMATION__OUT);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__WRITE);
		createEReference(transitionEClass, TRANSITION__TO);
		createEReference(transitionEClass, TRANSITION__CONDITION_SPECIFICATION);
		createEReference(transitionEClass, TRANSITION__INVOKE);
		createEReference(transitionEClass, TRANSITION__READ);
		createEReference(transitionEClass, TRANSITION__FROM);
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
		ElementsPackage theElementsPackage = (ElementsPackage)EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		VehiclefeaturemodelingPackage theVehiclefeaturemodelingPackage = (VehiclefeaturemodelingPackage)EPackage.Registry.INSTANCE.getEPackage(VehiclefeaturemodelingPackage.eNS_URI);
		ErrormodelPackage theErrormodelPackage = (ErrormodelPackage)EPackage.Registry.INSTANCE.getEPackage(ErrormodelPackage.eNS_URI);
		FunctionmodelingPackage theFunctionmodelingPackage = (FunctionmodelingPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionmodelingPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		PrimitivetypesPackage thePrimitivetypesPackage = (PrimitivetypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		behaviorAnnexEClass.getESuperTypes().add(theElementsPackage.getContext());
		behaviorConstraintEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		stateMachineConstraintEClass.getESuperTypes().add(this.getBehaviorConstraint());
		computationConstraintEClass.getESuperTypes().add(this.getBehaviorConstraint());
		flowEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		parameterEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		parameterConditionEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		parameterConstraintEClass.getESuperTypes().add(this.getBehaviorConstraint());
		stateEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		transformationEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		transitionEClass.getESuperTypes().add(theElementsPackage.getEAElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(behaviorAnnexEClass, BehaviorAnnex.class, "BehaviorAnnex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorAnnex_BehaviorConstraint(), this.getBehaviorConstraint(), null, "behaviorConstraint", null, 0, -1, BehaviorAnnex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorConstraintEClass, BehaviorConstraint.class, "BehaviorConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorConstraint_ConstrainedMode(), theBehaviorPackage.getMode(), null, "constrainedMode", null, 0, -1, BehaviorConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorConstraint_RelatedVehicleFeature(), theVehiclefeaturemodelingPackage.getVehicleFeature(), null, "relatedVehicleFeature", null, 0, -1, BehaviorConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorConstraint_ConstrainedFunctionBehavior(), theBehaviorPackage.getFunctionBehavior(), null, "constrainedFunctionBehavior", null, 0, -1, BehaviorConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorConstraint_ConstrainedErrorBehavior(), theErrormodelPackage.getErrorBehavior(), null, "constrainedErrorBehavior", null, 0, -1, BehaviorConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorConstraint_ConstrainedFunctionTrigger(), theBehaviorPackage.getFunctionTrigger(), null, "constrainedFunctionTrigger", null, 0, -1, BehaviorConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineConstraintEClass, StateMachineConstraint.class, "StateMachineConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachineConstraint_State(), this.getState(), null, "state", null, 1, -1, StateMachineConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachineConstraint_Transition(), this.getTransition(), null, "transition", null, 0, -1, StateMachineConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computationConstraintEClass, ComputationConstraint.class, "ComputationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputationConstraint_Flow(), this.getFlow(), null, "flow", null, 0, -1, ComputationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputationConstraint_Transformation(), this.getTransformation(), null, "transformation", null, 0, -1, ComputationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_SinkParameter(), this.getParameter(), null, "sinkParameter", null, 1, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_OrderedSegment(), this.getFlow(), null, "orderedSegment", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_SourceParameter(), this.getParameter(), null, "sourceParameter", null, 1, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_TargetFunctionPort(), theFunctionmodelingPackage.getFunctionPort(), null, "targetFunctionPort", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_TargetFunction(), theFunctionmodelingPackage.getFunctionType(), null, "targetFunction", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Type(), theDatatypesPackage.getEADatatype(), null, "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterConditionEClass, ParameterCondition.class, "ParameterCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterCondition_Expression(), thePrimitivetypesPackage.getString(), "expression", "", 1, 1, ParameterCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterCondition_RepresentAnomaly(), theErrormodelPackage.getAnomaly(), null, "representAnomaly", null, 0, -1, ParameterCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterCondition_AppliedToCondition(), this.getParameterCondition(), null, "appliedToCondition", null, 0, -1, ParameterCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterCondition_AppliedToParameter(), this.getParameter(), null, "appliedToParameter", null, 0, -1, ParameterCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterConstraintEClass, ParameterConstraint.class, "ParameterConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterConstraint_Parameter(), this.getParameter(), null, "parameter", null, 1, -1, ParameterConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterConstraint_ParameterCondition(), this.getParameterCondition(), null, "parameterCondition", null, 0, -1, ParameterConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_InitState(), thePrimitivetypesPackage.getBoolean(), "initState", "false", 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_SubStateMachineConstraint(), this.getStateMachineConstraint(), null, "subStateMachineConstraint", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Denote(), this.getParameterCondition(), null, "denote", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_RepresentMode(), theBehaviorPackage.getMode(), null, "representMode", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformation_PostCondition(), this.getParameterCondition(), null, "postCondition", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_OutgoingFlow(), this.getFlow(), null, "outgoingFlow", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_IncomingFlow(), this.getFlow(), null, "incomingFlow", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_InOut(), this.getParameter(), null, "inOut", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_PreCondition(), this.getParameterCondition(), null, "preCondition", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_InvariantCondition(), this.getParameterCondition(), null, "invariantCondition", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_SubComputationConstraint(), this.getComputationConstraint(), null, "subComputationConstraint", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_In(), this.getParameter(), null, "in", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Out(), this.getParameter(), null, "out", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Write(), this.getParameter(), null, "write", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_To(), this.getState(), null, "to", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_ConditionSpecification(), this.getParameterCondition(), null, "conditionSpecification", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Invoke(), this.getTransformation(), null, "invoke", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Read(), this.getParameter(), null, "read", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_From(), this.getState(), null, "from", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //BehaviorconstraintsPackageImpl
