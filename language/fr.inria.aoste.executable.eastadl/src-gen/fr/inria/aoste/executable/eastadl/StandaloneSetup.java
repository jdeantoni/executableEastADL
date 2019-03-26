package fr.inria.aoste.executable.eastadl;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
//    EPackage.Registry.INSTANCE.put(
//    	fr.inria.aoste.executable.eastadl.eastadl.geastadl.GeastadlPackage.eNS_URI,
//    	fr.inria.aoste.executable.eastadl.eastadl.geastadl.GeastadlPackage.eINSTANCE
//    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.GinfrastructurePackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.GinfrastructurePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gelements.GelementsPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gelements.GelementsPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.Eastadl21Package.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.Eastadl21Package.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.East_adlPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.East_adlPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.StructurePackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.StructurePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.BehaviorPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.BehaviorPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.VariabilityPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.VariabilityPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements._instanceref._instancerefPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements._instanceref._instancerefPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.UsecasesPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.UsecasesPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment.EnvironmentPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment.EnvironmentPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment._instanceref._instancerefPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment._instanceref._instancerefPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.interchange.InterchangePackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.interchange.InterchangePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.TimingPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.TimingPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing._instanceref._instancerefPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing._instanceref._instancerefPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventsPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventsPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.DependabilityPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.DependabilityPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.InfrastructurePackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.InfrastructurePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.ElementsPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.ElementsPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.AnnexesPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.AnnexesPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.NeedsPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.NeedsPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.AutosarPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.AutosarPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.GenericstructurePackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.GenericstructurePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.autosartoplevelstructure.AutosartoplevelstructurePackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.autosartoplevelstructure.AutosartoplevelstructurePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.GeneraltemplateclassesPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.GeneraltemplateclassesPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevaluePackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevaluePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.PrimitivetypesPackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.PrimitivetypesPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.formulalanguage.FormulalanguagePackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.formulalanguage.FormulalanguagePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.systemtemplate.SystemtemplatePackage.eNS_URI,
    	fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.systemtemplate.SystemtemplatePackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor eastADL = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"fr.inria.aoste.executable.eastadl.EastADL", "", "http://fr.inria.aoste.executable.eastadl.eastadl/geastadl/", "fr.inria.aoste.executable.eastadl.EastADLMT"
    );
    eastADL.addAdapter("fr.inria.aoste.executable.eastadl.EastADLMT", fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"fr.inria.aoste.executable.eastadl.EastADL",
    	eastADL
    );
    MelangeRegistry.ModelTypeDescriptor eastADLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"fr.inria.aoste.executable.eastadl.EastADLMT", "", "http://fr.inria.aoste.executable.eastadl.eastadlmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"fr.inria.aoste.executable.eastadl.EastADLMT",
    	eastADLMT
    );
  }
}
