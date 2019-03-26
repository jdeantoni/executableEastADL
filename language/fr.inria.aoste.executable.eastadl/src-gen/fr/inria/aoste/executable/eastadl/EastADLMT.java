package fr.inria.aoste.executable.eastadl;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.Eastadl21Factory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.AutosarFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.GenericstructureFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructureFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.AutosartoplevelstructureFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.formulalanguage.FormulalanguageFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.GeneraltemplateclassesFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiableFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.PrimitivetypesFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevalueFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplateFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.East_adlFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.AnnexesFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycaseFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment.EnvironmentFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.InfrastructureFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.interchange.InterchangeFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.usecases.UsecasesFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.StructureFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.GinfrastructureFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesFactory;
import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface EastADLMT extends IModelType {
  public abstract EList<EObject> getContents();
  
//  public abstract fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.GeastadlFactory getGeastadlFactory();
  
  public abstract GinfrastructureFactory getGinfrastructureFactory();
  
  public abstract GelementsFactory getGelementsFactory();
  
  public abstract GprimitivetypesFactory getGprimitivetypesFactory();
  
  public abstract Eastadl21Factory getEastadl21Factory();
  
  public abstract East_adlFactory getEast_adlFactory();
  
  public abstract StructureFactory getStructureFactory();
  
  public abstract SystemmodelingFactory getSystemmodelingFactory();
  
  public abstract FeaturemodelingFactory getFeaturemodelingFactory();
  
  public abstract VehiclefeaturemodelingFactory getVehiclefeaturemodelingFactory();
  
  public abstract FunctionmodelingFactory getFunctionmodelingFactory();
  
//  public abstract _instancerefFactory get_instancerefFactory();
  
  public abstract HardwaremodelingFactory getHardwaremodelingFactory();
  
  public abstract fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefFactory get_instancerefFactory();
  
  public abstract BehaviorFactory getBehaviorFactory();
  
  public abstract VariabilityFactory getVariabilityFactory();
  
  public abstract RequirementsFactory getRequirementsFactory();
  
  public abstract fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref._instancerefFactory get_instancerefFactory();
  
  public abstract UsecasesFactory getUsecasesFactory();
  
  public abstract VerificationvalidationFactory getVerificationvalidationFactory();
  
  public abstract EnvironmentFactory getEnvironmentFactory();
  
  public abstract fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref._instancerefFactory get_instancerefFactory();
  
  public abstract InterchangeFactory getInterchangeFactory();
  
  public abstract TimingFactory getTimingFactory();
  
  public abstract fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefFactory get_instancerefFactory();
  
  public abstract EventsFactory getEventsFactory();
  
  public abstract fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefFactory get_instancerefFactory();
  
  public abstract TimingconstraintsFactory getTimingconstraintsFactory();
  
  public abstract DependabilityFactory getDependabilityFactory();
  
  public abstract SafetyconstraintsFactory getSafetyconstraintsFactory();
  
  public abstract fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefFactory get_instancerefFactory();
  
  public abstract ErrormodelFactory getErrormodelFactory();
  
  public abstract fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefFactory get_instancerefFactory();
  
  public abstract SafetyrequirementFactory getSafetyrequirementFactory();
  
  public abstract SafetycaseFactory getSafetycaseFactory();
  
  public abstract GenericconstraintsFactory getGenericconstraintsFactory();
  
  public abstract InfrastructureFactory getInfrastructureFactory();
  
  public abstract ElementsFactory getElementsFactory();
  
  public abstract fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefFactory get_instancerefFactory();
  
  public abstract DatatypesFactory getDatatypesFactory();
  
  public abstract UserattributesFactory getUserattributesFactory();
  
  public abstract AnnexesFactory getAnnexesFactory();
  
  public abstract BehaviorconstraintsFactory getBehaviorconstraintsFactory();
  
  public abstract NeedsFactory getNeedsFactory();
  
  public abstract AutosarFactory getAutosarFactory();
  
  public abstract GenericstructureFactory getGenericstructureFactory();
  
  public abstract AutosartoplevelstructureFactory getAutosartoplevelstructureFactory();
  
  public abstract GeneraltemplateclassesFactory getGeneraltemplateclassesFactory();
  
  public abstract TimevalueFactory getTimevalueFactory();
  
  public abstract IdentifiableFactory getIdentifiableFactory();
  
  public abstract PrimitivetypesFactory getPrimitivetypesFactory();
  
  public abstract FormulalanguageFactory getFormulalanguageFactory();
  
  public abstract AbstractstructureFactory getAbstractstructureFactory();
  
  public abstract SystemtemplateFactory getSystemtemplateFactory();
  
  public abstract void save(final String uri) throws IOException;
}
