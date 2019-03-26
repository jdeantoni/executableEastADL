package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.AnalysisLevel;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.DesignLevel;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.ImplementationLevel;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemModel;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.VehicleLevel;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class SystemmodelingFactoryAdapter extends EFactoryImpl implements SystemmodelingFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingFactory systemmodelingAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingFactory.eINSTANCE;
  
  @Override
  public VehicleLevel createVehicleLevel() {
    return adaptersFactory.createVehicleLevelAdapter(systemmodelingAdaptee.createVehicleLevel(), null);
  }
  
  @Override
  public SystemModel createSystemModel() {
    return adaptersFactory.createSystemModelAdapter(systemmodelingAdaptee.createSystemModel(), null);
  }
  
  @Override
  public AnalysisLevel createAnalysisLevel() {
    return adaptersFactory.createAnalysisLevelAdapter(systemmodelingAdaptee.createAnalysisLevel(), null);
  }
  
  @Override
  public DesignLevel createDesignLevel() {
    return adaptersFactory.createDesignLevelAdapter(systemmodelingAdaptee.createDesignLevel(), null);
  }
  
  @Override
  public ImplementationLevel createImplementationLevel() {
    return adaptersFactory.createImplementationLevelAdapter(systemmodelingAdaptee.createImplementationLevel(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getSystemmodelingPackage();
  }
  
  public SystemmodelingPackage getSystemmodelingPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.eINSTANCE;
  }
}
