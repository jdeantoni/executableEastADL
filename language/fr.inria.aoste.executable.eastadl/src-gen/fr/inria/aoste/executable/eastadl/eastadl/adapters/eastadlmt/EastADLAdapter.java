package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt;

import fr.inria.aoste.executable.eastadl.EastADLMT;
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
import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class EastADLAdapter extends ResourceAdapter implements EastADLMT {
  public EastADLAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
  }
  
  @Override
  public fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.GeastadlFactory getGeastadlFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.GeastadlFactoryAdapter();
  }
  
  @Override
  public GinfrastructureFactory getGinfrastructureFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.GinfrastructureFactoryAdapter();
  }
  
  @Override
  public GelementsFactory getGelementsFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GelementsFactoryAdapter();
  }
  
  @Override
  public GprimitivetypesFactory getGprimitivetypesFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesFactoryAdapter();
  }
  
  @Override
  public Eastadl21Factory getEastadl21Factory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.Eastadl21FactoryAdapter();
  }
  
  @Override
  public East_adlFactory getEast_adlFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.East_adlFactoryAdapter();
  }
  
  @Override
  public StructureFactory getStructureFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.StructureFactoryAdapter();
  }
  
  @Override
  public SystemmodelingFactory getSystemmodelingFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingFactoryAdapter();
  }
  
  @Override
  public FeaturemodelingFactory getFeaturemodelingFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingFactoryAdapter();
  }
  
  @Override
  public VehiclefeaturemodelingFactory getVehiclefeaturemodelingFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingFactoryAdapter();
  }
  
  @Override
  public FunctionmodelingFactory getFunctionmodelingFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingFactoryAdapter();
  }
  
  @Override
  public _instancerefFactory get_instancerefFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefFactoryAdapter();
  }
  
  @Override
  public HardwaremodelingFactory getHardwaremodelingFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingFactoryAdapter();
  }
  
  @Override
  public fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefFactory get_instancerefFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefFactoryAdapter();
  }
  
  @Override
  public BehaviorFactory getBehaviorFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.BehaviorFactoryAdapter();
  }
  
  @Override
  public VariabilityFactory getVariabilityFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VariabilityFactoryAdapter();
  }
  
  @Override
  public RequirementsFactory getRequirementsFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsFactoryAdapter();
  }
  
  @Override
  public fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref._instancerefFactory get_instancerefFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements._instanceref._instancerefFactoryAdapter();
  }
  
  @Override
  public UsecasesFactory getUsecasesFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.UsecasesFactoryAdapter();
  }
  
  @Override
  public VerificationvalidationFactory getVerificationvalidationFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationFactoryAdapter();
  }
  
  @Override
  public EnvironmentFactory getEnvironmentFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment.EnvironmentFactoryAdapter();
  }
  
  @Override
  public fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref._instancerefFactory get_instancerefFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment._instanceref._instancerefFactoryAdapter();
  }
  
  @Override
  public InterchangeFactory getInterchangeFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange.InterchangeFactoryAdapter();
  }
  
  @Override
  public TimingFactory getTimingFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimingFactoryAdapter();
  }
  
  @Override
  public fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefFactory get_instancerefFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefFactoryAdapter();
  }
  
  @Override
  public EventsFactory getEventsFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events.EventsFactoryAdapter();
  }
  
  @Override
  public fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefFactory get_instancerefFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefFactoryAdapter();
  }
  
  @Override
  public TimingconstraintsFactory getTimingconstraintsFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsFactoryAdapter();
  }
  
  @Override
  public DependabilityFactory getDependabilityFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.DependabilityFactoryAdapter();
  }
  
  @Override
  public SafetyconstraintsFactory getSafetyconstraintsFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsFactoryAdapter();
  }
  
  @Override
  public fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefFactory get_instancerefFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefFactoryAdapter();
  }
  
  @Override
  public ErrormodelFactory getErrormodelFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelFactoryAdapter();
  }
  
  @Override
  public fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefFactory get_instancerefFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefFactoryAdapter();
  }
  
  @Override
  public SafetyrequirementFactory getSafetyrequirementFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementFactoryAdapter();
  }
  
  @Override
  public SafetycaseFactory getSafetycaseFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycaseFactoryAdapter();
  }
  
  @Override
  public GenericconstraintsFactory getGenericconstraintsFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsFactoryAdapter();
  }
  
  @Override
  public InfrastructureFactory getInfrastructureFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.InfrastructureFactoryAdapter();
  }
  
  @Override
  public ElementsFactory getElementsFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsFactoryAdapter();
  }
  
  @Override
  public fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefFactory get_instancerefFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefFactoryAdapter();
  }
  
  @Override
  public DatatypesFactory getDatatypesFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesFactoryAdapter();
  }
  
  @Override
  public UserattributesFactory getUserattributesFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesFactoryAdapter();
  }
  
  @Override
  public AnnexesFactory getAnnexesFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.AnnexesFactoryAdapter();
  }
  
  @Override
  public BehaviorconstraintsFactory getBehaviorconstraintsFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsFactoryAdapter();
  }
  
  @Override
  public NeedsFactory getNeedsFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsFactoryAdapter();
  }
  
  @Override
  public AutosarFactory getAutosarFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.AutosarFactoryAdapter();
  }
  
  @Override
  public GenericstructureFactory getGenericstructureFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.GenericstructureFactoryAdapter();
  }
  
  @Override
  public AutosartoplevelstructureFactory getAutosartoplevelstructureFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.AutosartoplevelstructureFactoryAdapter();
  }
  
  @Override
  public GeneraltemplateclassesFactory getGeneraltemplateclassesFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.GeneraltemplateclassesFactoryAdapter();
  }
  
  @Override
  public TimevalueFactory getTimevalueFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevalueFactoryAdapter();
  }
  
  @Override
  public IdentifiableFactory getIdentifiableFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiableFactoryAdapter();
  }
  
  @Override
  public PrimitivetypesFactory getPrimitivetypesFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.PrimitivetypesFactoryAdapter();
  }
  
  @Override
  public FormulalanguageFactory getFormulalanguageFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.formulalanguage.FormulalanguageFactoryAdapter();
  }
  
  @Override
  public AbstractstructureFactory getAbstractstructureFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructureFactoryAdapter();
  }
  
  @Override
  public SystemtemplateFactory getSystemtemplateFactory() {
    return new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplateFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getGeastadlFactory());
    res.add(getGinfrastructureFactory());
    res.add(getGelementsFactory());
    res.add(getGprimitivetypesFactory());
    res.add(getEastadl21Factory());
    res.add(getEast_adlFactory());
    res.add(getStructureFactory());
    res.add(getSystemmodelingFactory());
    res.add(getFeaturemodelingFactory());
    res.add(getVehiclefeaturemodelingFactory());
    res.add(getFunctionmodelingFactory());
    res.add(get_instancerefFactory());
    res.add(getHardwaremodelingFactory());
    res.add(get_instancerefFactory());
    res.add(getBehaviorFactory());
    res.add(getVariabilityFactory());
    res.add(getRequirementsFactory());
    res.add(get_instancerefFactory());
    res.add(getUsecasesFactory());
    res.add(getVerificationvalidationFactory());
    res.add(getEnvironmentFactory());
    res.add(get_instancerefFactory());
    res.add(getInterchangeFactory());
    res.add(getTimingFactory());
    res.add(get_instancerefFactory());
    res.add(getEventsFactory());
    res.add(get_instancerefFactory());
    res.add(getTimingconstraintsFactory());
    res.add(getDependabilityFactory());
    res.add(getSafetyconstraintsFactory());
    res.add(get_instancerefFactory());
    res.add(getErrormodelFactory());
    res.add(get_instancerefFactory());
    res.add(getSafetyrequirementFactory());
    res.add(getSafetycaseFactory());
    res.add(getGenericconstraintsFactory());
    res.add(getInfrastructureFactory());
    res.add(getElementsFactory());
    res.add(get_instancerefFactory());
    res.add(getDatatypesFactory());
    res.add(getUserattributesFactory());
    res.add(getAnnexesFactory());
    res.add(getBehaviorconstraintsFactory());
    res.add(getNeedsFactory());
    res.add(getAutosarFactory());
    res.add(getGenericstructureFactory());
    res.add(getAutosartoplevelstructureFactory());
    res.add(getGeneraltemplateclassesFactory());
    res.add(getTimevalueFactory());
    res.add(getIdentifiableFactory());
    res.add(getPrimitivetypesFactory());
    res.add(getFormulalanguageFactory());
    res.add(getAbstractstructureFactory());
    res.add(getSystemtemplateFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
