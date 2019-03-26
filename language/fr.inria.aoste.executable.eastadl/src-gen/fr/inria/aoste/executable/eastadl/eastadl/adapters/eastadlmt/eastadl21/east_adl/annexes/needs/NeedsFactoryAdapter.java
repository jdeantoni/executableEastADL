package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitecturalDescription;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitecturalModel;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.Architecture;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.BusinessOpportunity;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.Mission;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.Stakeholder;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.StakeholderNeed;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.VehicleSystem;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class NeedsFactoryAdapter extends EFactoryImpl implements NeedsFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.NeedsFactory needsAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.NeedsFactory.eINSTANCE;
  
  @Override
  public ArchitecturalDescription createArchitecturalDescription() {
    return adaptersFactory.createArchitecturalDescriptionAdapter(needsAdaptee.createArchitecturalDescription(), null);
  }
  
  @Override
  public ArchitecturalModel createArchitecturalModel() {
    return adaptersFactory.createArchitecturalModelAdapter(needsAdaptee.createArchitecturalModel(), null);
  }
  
  @Override
  public Architecture createArchitecture() {
    return adaptersFactory.createArchitectureAdapter(needsAdaptee.createArchitecture(), null);
  }
  
  @Override
  public Mission createMission() {
    return adaptersFactory.createMissionAdapter(needsAdaptee.createMission(), null);
  }
  
  @Override
  public VehicleSystem createVehicleSystem() {
    return adaptersFactory.createVehicleSystemAdapter(needsAdaptee.createVehicleSystem(), null);
  }
  
  @Override
  public Stakeholder createStakeholder() {
    return adaptersFactory.createStakeholderAdapter(needsAdaptee.createStakeholder(), null);
  }
  
  @Override
  public StakeholderNeed createStakeholderNeed() {
    return adaptersFactory.createStakeholderNeedAdapter(needsAdaptee.createStakeholderNeed(), null);
  }
  
  @Override
  public BusinessOpportunity createBusinessOpportunity() {
    return adaptersFactory.createBusinessOpportunityAdapter(needsAdaptee.createBusinessOpportunity(), null);
  }
  
  @Override
  public ProblemStatement createProblemStatement() {
    return adaptersFactory.createProblemStatementAdapter(needsAdaptee.createProblemStatement(), null);
  }
  
  @Override
  public ProductPositioning createProductPositioning() {
    return adaptersFactory.createProductPositioningAdapter(needsAdaptee.createProductPositioning(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getNeedsPackage();
  }
  
  public NeedsPackage getNeedsPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.eINSTANCE;
  }
}
