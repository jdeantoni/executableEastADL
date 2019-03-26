/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.impl;

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

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.Actuator;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.AllocationTarget;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.CommunicationHardwarePin;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentType;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnector;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinGroup;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingFactory;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePin;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePinKind;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBusKind;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.Node;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.PowerHardwarePin;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.PowerSupply;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.Sensor;

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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwaremodelingPackageImpl extends EPackageImpl implements HardwaremodelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationHardwarePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareComponentPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwarePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwarePinGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioHardwarePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalBusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerHardwarePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ioHardwarePinKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalBusKindEEnum = null;

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
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HardwaremodelingPackageImpl() {
		super(eNS_URI, HardwaremodelingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HardwaremodelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HardwaremodelingPackage init() {
		if (isInited) return (HardwaremodelingPackage)EPackage.Registry.INSTANCE.getEPackage(HardwaremodelingPackage.eNS_URI);

		// Obtain or create and register package
		HardwaremodelingPackageImpl theHardwaremodelingPackage = (HardwaremodelingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HardwaremodelingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HardwaremodelingPackageImpl());

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
		theHardwaremodelingPackage.createPackageContents();
		theEastadl21Package.createPackageContents();
		theEast_adlPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theSystemmodelingPackage.createPackageContents();
		theFeaturemodelingPackage.createPackageContents();
		theVehiclefeaturemodelingPackage.createPackageContents();
		theFunctionmodelingPackage.createPackageContents();
		the_instancerefPackage.createPackageContents();
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
		theHardwaremodelingPackage.initializePackageContents();
		theEastadl21Package.initializePackageContents();
		theEast_adlPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theSystemmodelingPackage.initializePackageContents();
		theFeaturemodelingPackage.initializePackageContents();
		theVehiclefeaturemodelingPackage.initializePackageContents();
		theFunctionmodelingPackage.initializePackageContents();
		the_instancerefPackage.initializePackageContents();
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
		theHardwaremodelingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HardwaremodelingPackage.eNS_URI, theHardwaremodelingPackage);
		return theHardwaremodelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationHardwarePin() {
		return communicationHardwarePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareComponentPrototype() {
		return hardwareComponentPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponentPrototype_Type() {
		return (EReference)hardwareComponentPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareComponentType() {
		return hardwareComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponentType_Connector() {
		return (EReference)hardwareComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponentType_Port() {
		return (EReference)hardwareComponentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponentType_Part() {
		return (EReference)hardwareComponentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponentType_PortGroup() {
		return (EReference)hardwareComponentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponentType_Bus() {
		return (EReference)hardwareComponentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareConnector() {
		return hardwareConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareConnector_Port() {
		return (EReference)hardwareConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwarePin() {
		return hardwarePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePin_IsGround() {
		return (EAttribute)hardwarePinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePin_Voltage() {
		return (EAttribute)hardwarePinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePin_Power() {
		return (EAttribute)hardwarePinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePin_Direction() {
		return (EAttribute)hardwarePinEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePin_Impedance() {
		return (EAttribute)hardwarePinEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwarePinGroup() {
		return hardwarePinGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePinGroup_PortGroup() {
		return (EReference)hardwarePinGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePinGroup_Port() {
		return (EReference)hardwarePinGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOHardwarePin() {
		return ioHardwarePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOHardwarePin_Type() {
		return (EAttribute)ioHardwarePinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalBus() {
		return logicalBusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalBus_BusSpeed() {
		return (EAttribute)logicalBusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalBus_BusType() {
		return (EAttribute)logicalBusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalBus_Wire() {
		return (EReference)logicalBusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_NonVolatileMemory() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_ExecutionRate() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_VolatileMemory() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerHardwarePin() {
		return powerHardwarePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSupply() {
		return powerSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerSupply_IsActive() {
		return (EAttribute)powerSupplyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationTarget() {
		return allocationTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIOHardwarePinKind() {
		return ioHardwarePinKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalBusKind() {
		return logicalBusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwaremodelingFactory getHardwaremodelingFactory() {
		return (HardwaremodelingFactory)getEFactoryInstance();
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
		actuatorEClass = createEClass(ACTUATOR);

		communicationHardwarePinEClass = createEClass(COMMUNICATION_HARDWARE_PIN);

		hardwareComponentPrototypeEClass = createEClass(HARDWARE_COMPONENT_PROTOTYPE);
		createEReference(hardwareComponentPrototypeEClass, HARDWARE_COMPONENT_PROTOTYPE__TYPE);

		hardwareComponentTypeEClass = createEClass(HARDWARE_COMPONENT_TYPE);
		createEReference(hardwareComponentTypeEClass, HARDWARE_COMPONENT_TYPE__CONNECTOR);
		createEReference(hardwareComponentTypeEClass, HARDWARE_COMPONENT_TYPE__PORT);
		createEReference(hardwareComponentTypeEClass, HARDWARE_COMPONENT_TYPE__PART);
		createEReference(hardwareComponentTypeEClass, HARDWARE_COMPONENT_TYPE__PORT_GROUP);
		createEReference(hardwareComponentTypeEClass, HARDWARE_COMPONENT_TYPE__BUS);

		hardwareConnectorEClass = createEClass(HARDWARE_CONNECTOR);
		createEReference(hardwareConnectorEClass, HARDWARE_CONNECTOR__PORT);

		hardwarePinEClass = createEClass(HARDWARE_PIN);
		createEAttribute(hardwarePinEClass, HARDWARE_PIN__IS_GROUND);
		createEAttribute(hardwarePinEClass, HARDWARE_PIN__VOLTAGE);
		createEAttribute(hardwarePinEClass, HARDWARE_PIN__POWER);
		createEAttribute(hardwarePinEClass, HARDWARE_PIN__DIRECTION);
		createEAttribute(hardwarePinEClass, HARDWARE_PIN__IMPEDANCE);

		hardwarePinGroupEClass = createEClass(HARDWARE_PIN_GROUP);
		createEReference(hardwarePinGroupEClass, HARDWARE_PIN_GROUP__PORT_GROUP);
		createEReference(hardwarePinGroupEClass, HARDWARE_PIN_GROUP__PORT);

		ioHardwarePinEClass = createEClass(IO_HARDWARE_PIN);
		createEAttribute(ioHardwarePinEClass, IO_HARDWARE_PIN__TYPE);

		logicalBusEClass = createEClass(LOGICAL_BUS);
		createEAttribute(logicalBusEClass, LOGICAL_BUS__BUS_SPEED);
		createEAttribute(logicalBusEClass, LOGICAL_BUS__BUS_TYPE);
		createEReference(logicalBusEClass, LOGICAL_BUS__WIRE);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NON_VOLATILE_MEMORY);
		createEAttribute(nodeEClass, NODE__EXECUTION_RATE);
		createEAttribute(nodeEClass, NODE__VOLATILE_MEMORY);

		powerHardwarePinEClass = createEClass(POWER_HARDWARE_PIN);

		powerSupplyEClass = createEClass(POWER_SUPPLY);
		createEAttribute(powerSupplyEClass, POWER_SUPPLY__IS_ACTIVE);

		sensorEClass = createEClass(SENSOR);

		allocationTargetEClass = createEClass(ALLOCATION_TARGET);

		// Create enums
		ioHardwarePinKindEEnum = createEEnum(IO_HARDWARE_PIN_KIND);
		logicalBusKindEEnum = createEEnum(LOGICAL_BUS_KIND);
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
		fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage the_instancerefPackage_1 = (fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage)EPackage.Registry.INSTANCE.getEPackage(fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.eNS_URI);
		ElementsPackage theElementsPackage = (ElementsPackage)EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI);
		PrimitivetypesPackage thePrimitivetypesPackage = (PrimitivetypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitivetypesPackage.eNS_URI);
		FunctionmodelingPackage theFunctionmodelingPackage = (FunctionmodelingPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionmodelingPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(the_instancerefPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actuatorEClass.getESuperTypes().add(this.getHardwareComponentType());
		communicationHardwarePinEClass.getESuperTypes().add(this.getHardwarePin());
		hardwareComponentPrototypeEClass.getESuperTypes().add(this.getAllocationTarget());
		hardwareComponentTypeEClass.getESuperTypes().add(theElementsPackage.getContext());
		hardwareConnectorEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		hardwarePinEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		hardwarePinGroupEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		ioHardwarePinEClass.getESuperTypes().add(this.getHardwarePin());
		logicalBusEClass.getESuperTypes().add(this.getAllocationTarget());
		nodeEClass.getESuperTypes().add(this.getHardwareComponentType());
		powerHardwarePinEClass.getESuperTypes().add(this.getHardwarePin());
		powerSupplyEClass.getESuperTypes().add(this.getHardwareComponentType());
		sensorEClass.getESuperTypes().add(this.getHardwareComponentType());
		allocationTargetEClass.getESuperTypes().add(theElementsPackage.getEAElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationHardwarePinEClass, CommunicationHardwarePin.class, "CommunicationHardwarePin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareComponentPrototypeEClass, HardwareComponentPrototype.class, "HardwareComponentPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareComponentPrototype_Type(), this.getHardwareComponentType(), null, "type", null, 1, 1, HardwareComponentPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareComponentTypeEClass, HardwareComponentType.class, "HardwareComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareComponentType_Connector(), this.getHardwareConnector(), null, "connector", null, 0, -1, HardwareComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareComponentType_Port(), this.getHardwarePin(), null, "port", null, 0, -1, HardwareComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareComponentType_Part(), this.getHardwareComponentPrototype(), null, "part", null, 0, -1, HardwareComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareComponentType_PortGroup(), this.getHardwarePinGroup(), null, "portGroup", null, 0, -1, HardwareComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareComponentType_Bus(), this.getLogicalBus(), null, "bus", null, 0, -1, HardwareComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareConnectorEClass, HardwareConnector.class, "HardwareConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareConnector_Port(), the_instancerefPackage_1.getHardwareConnector_port(), null, "port", null, 2, 2, HardwareConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwarePinEClass, HardwarePin.class, "HardwarePin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwarePin_IsGround(), thePrimitivetypesPackage.getBoolean(), "isGround", "false", 0, 1, HardwarePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwarePin_Voltage(), thePrimitivetypesPackage.getFloat(), "voltage", "0.0", 0, 1, HardwarePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwarePin_Power(), thePrimitivetypesPackage.getFloat(), "power", "0.0", 0, 1, HardwarePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwarePin_Direction(), theFunctionmodelingPackage.getEADirectionKind(), "direction", "IN", 0, 1, HardwarePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwarePin_Impedance(), thePrimitivetypesPackage.getFloat(), "impedance", "0.0", 0, 1, HardwarePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwarePinGroupEClass, HardwarePinGroup.class, "HardwarePinGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwarePinGroup_PortGroup(), this.getHardwarePinGroup(), null, "portGroup", null, 0, -1, HardwarePinGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwarePinGroup_Port(), this.getHardwarePin(), null, "port", null, 0, -1, HardwarePinGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioHardwarePinEClass, IOHardwarePin.class, "IOHardwarePin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIOHardwarePin_Type(), this.getIOHardwarePinKind(), "type", "DIGITAL", 1, 1, IOHardwarePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalBusEClass, LogicalBus.class, "LogicalBus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalBus_BusSpeed(), thePrimitivetypesPackage.getFloat(), "busSpeed", "0.0", 1, 1, LogicalBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalBus_BusType(), this.getLogicalBusKind(), "busType", "TIMETRIGGERED", 1, 1, LogicalBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalBus_Wire(), this.getHardwareConnector(), null, "wire", null, 0, -1, LogicalBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_NonVolatileMemory(), thePrimitivetypesPackage.getInteger(), "nonVolatileMemory", "0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_ExecutionRate(), thePrimitivetypesPackage.getFloat(), "executionRate", "0.0", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_VolatileMemory(), thePrimitivetypesPackage.getInteger(), "volatileMemory", "0", 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerHardwarePinEClass, PowerHardwarePin.class, "PowerHardwarePin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(powerSupplyEClass, PowerSupply.class, "PowerSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPowerSupply_IsActive(), thePrimitivetypesPackage.getBoolean(), "isActive", "false", 1, 1, PowerSupply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocationTargetEClass, AllocationTarget.class, "AllocationTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(ioHardwarePinKindEEnum, IOHardwarePinKind.class, "IOHardwarePinKind");
		addEEnumLiteral(ioHardwarePinKindEEnum, IOHardwarePinKind.DIGITAL);
		addEEnumLiteral(ioHardwarePinKindEEnum, IOHardwarePinKind.ANALOG);
		addEEnumLiteral(ioHardwarePinKindEEnum, IOHardwarePinKind.PWM);
		addEEnumLiteral(ioHardwarePinKindEEnum, IOHardwarePinKind.OTHER);

		initEEnum(logicalBusKindEEnum, LogicalBusKind.class, "LogicalBusKind");
		addEEnumLiteral(logicalBusKindEEnum, LogicalBusKind.TIME_TRIGGERED);
		addEEnumLiteral(logicalBusKindEEnum, LogicalBusKind.EVENT_TRIGGERED);
		addEEnumLiteral(logicalBusKindEEnum, LogicalBusKind.TIMEAND_EVENT_TRIGGERED);
		addEEnumLiteral(logicalBusKindEEnum, LogicalBusKind.OTHER);

		// Create annotations
		// TaggedValues
		createTaggedValuesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>TaggedValues</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTaggedValuesAnnotations() {
		String source = "TaggedValues";	
		addAnnotation
		  (ioHardwarePinKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "xml.name", "DIGITAL",
			 "xml.namePlural", "DIGITALS",
			 "xml.nsPrefix", "EA",
			 "xml.nsUri", "http://east-adl.info/2.1.10"
		   });	
		addAnnotation
		  (ioHardwarePinKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "xml.name", "ANALOG",
			 "xml.namePlural", "ANALOGS",
			 "xml.nsPrefix", "EA",
			 "xml.nsUri", "http://east-adl.info/2.1.10"
		   });	
		addAnnotation
		  (ioHardwarePinKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "xml.name", "PWM",
			 "xml.namePlural", "PWMS",
			 "xml.nsPrefix", "EA",
			 "xml.nsUri", "http://east-adl.info/2.1.10"
		   });	
		addAnnotation
		  (ioHardwarePinKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "xml.name", "OTHER",
			 "xml.namePlural", "OTHERS",
			 "xml.nsPrefix", "EA",
			 "xml.nsUri", "http://east-adl.info/2.1.10"
		   });	
		addAnnotation
		  (logicalBusKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "xml.name", "TIME-TRIGGERED",
			 "xml.namePlural", "TIME-TRIGGEREDS",
			 "xml.nsPrefix", "EA",
			 "xml.nsUri", "http://east-adl.info/2.1.10"
		   });	
		addAnnotation
		  (logicalBusKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "xml.name", "EVENT-TRIGGERED",
			 "xml.namePlural", "EVENT-TRIGGEREDS",
			 "xml.nsPrefix", "EA",
			 "xml.nsUri", "http://east-adl.info/2.1.10"
		   });	
		addAnnotation
		  (logicalBusKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "xml.name", "TIMEAND-EVENT-TRIGGERED",
			 "xml.namePlural", "TIMEAND-EVENT-TRIGGEREDS",
			 "xml.nsPrefix", "EA",
			 "xml.nsUri", "http://east-adl.info/2.1.10"
		   });	
		addAnnotation
		  (logicalBusKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "xml.name", "OTHER",
			 "xml.namePlural", "OTHERS",
			 "xml.nsPrefix", "EA",
			 "xml.nsUri", "http://east-adl.info/2.1.10"
		   });
	}

} //HardwaremodelingPackageImpl
