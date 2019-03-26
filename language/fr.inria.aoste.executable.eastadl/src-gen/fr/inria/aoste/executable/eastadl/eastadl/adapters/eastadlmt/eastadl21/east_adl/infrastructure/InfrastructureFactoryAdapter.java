package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.InfrastructureFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.InfrastructurePackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class InfrastructureFactoryAdapter extends EFactoryImpl implements InfrastructureFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.InfrastructureFactory infrastructureAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.InfrastructureFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getInfrastructurePackage();
  }
  
  public InfrastructurePackage getInfrastructurePackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.InfrastructurePackage.eINSTANCE;
  }
}
