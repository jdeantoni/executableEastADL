package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.FeatureFlaw;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Hazard;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Item;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class DependabilityFactoryAdapter extends EFactoryImpl implements DependabilityFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.DependabilityFactory dependabilityAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.DependabilityFactory.eINSTANCE;
  
  @Override
  public Dependability createDependability() {
    return adaptersFactory.createDependabilityAdapter(dependabilityAdaptee.createDependability(), null);
  }
  
  @Override
  public FeatureFlaw createFeatureFlaw() {
    return adaptersFactory.createFeatureFlawAdapter(dependabilityAdaptee.createFeatureFlaw(), null);
  }
  
  @Override
  public Item createItem() {
    return adaptersFactory.createItemAdapter(dependabilityAdaptee.createItem(), null);
  }
  
  @Override
  public Hazard createHazard() {
    return adaptersFactory.createHazardAdapter(dependabilityAdaptee.createHazard(), null);
  }
  
  @Override
  public HazardousEvent createHazardousEvent() {
    return adaptersFactory.createHazardousEventAdapter(dependabilityAdaptee.createHazardousEvent(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getDependabilityPackage();
  }
  
  public DependabilityPackage getDependabilityPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.eINSTANCE;
  }
}
