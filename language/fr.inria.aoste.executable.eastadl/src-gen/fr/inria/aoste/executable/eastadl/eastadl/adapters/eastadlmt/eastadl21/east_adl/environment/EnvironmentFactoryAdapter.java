package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment.ClampConnector;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment.Environment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment.EnvironmentFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment.EnvironmentPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class EnvironmentFactoryAdapter extends EFactoryImpl implements EnvironmentFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment.EnvironmentFactory environmentAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment.EnvironmentFactory.eINSTANCE;
  
  @Override
  public ClampConnector createClampConnector() {
    return adaptersFactory.createClampConnectorAdapter(environmentAdaptee.createClampConnector(), null);
  }
  
  @Override
  public Environment createEnvironment() {
    return adaptersFactory.createEnvironmentAdapter(environmentAdaptee.createEnvironment(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getEnvironmentPackage();
  }
  
  public EnvironmentPackage getEnvironmentPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment.EnvironmentPackage.eINSTANCE;
  }
}
