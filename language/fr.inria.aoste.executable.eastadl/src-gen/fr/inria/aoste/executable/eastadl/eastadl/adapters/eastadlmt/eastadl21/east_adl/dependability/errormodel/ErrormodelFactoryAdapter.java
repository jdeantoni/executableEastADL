package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorBehavior;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FailureOutPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FailureOutPortProxy;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultInPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultInPortProxy;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class ErrormodelFactoryAdapter extends EFactoryImpl implements ErrormodelFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelFactory errormodelAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrormodelFactory.eINSTANCE;
  
  @Override
  public ErrorBehavior createErrorBehavior() {
    return adaptersFactory.createErrorBehaviorAdapter(errormodelAdaptee.createErrorBehavior(), null);
  }
  
  @Override
  public ErrorModelPrototype createErrorModelPrototype() {
    return adaptersFactory.createErrorModelPrototypeAdapter(errormodelAdaptee.createErrorModelPrototype(), null);
  }
  
  @Override
  public ErrorModelType createErrorModelType() {
    return adaptersFactory.createErrorModelTypeAdapter(errormodelAdaptee.createErrorModelType(), null);
  }
  
  @Override
  public FailureOutPort createFailureOutPort() {
    return adaptersFactory.createFailureOutPortAdapter(errormodelAdaptee.createFailureOutPort(), null);
  }
  
  @Override
  public FaultFailurePropagationLink createFaultFailurePropagationLink() {
    return adaptersFactory.createFaultFailurePropagationLinkAdapter(errormodelAdaptee.createFaultFailurePropagationLink(), null);
  }
  
  @Override
  public FaultInPort createFaultInPort() {
    return adaptersFactory.createFaultInPortAdapter(errormodelAdaptee.createFaultInPort(), null);
  }
  
  @Override
  public InternalFaultPrototype createInternalFaultPrototype() {
    return adaptersFactory.createInternalFaultPrototypeAdapter(errormodelAdaptee.createInternalFaultPrototype(), null);
  }
  
  @Override
  public ProcessFaultPrototype createProcessFaultPrototype() {
    return adaptersFactory.createProcessFaultPrototypeAdapter(errormodelAdaptee.createProcessFaultPrototype(), null);
  }
  
  @Override
  public FaultInPortProxy createFaultInPortProxy() {
    return adaptersFactory.createFaultInPortProxyAdapter(errormodelAdaptee.createFaultInPortProxy(), null);
  }
  
  @Override
  public FailureOutPortProxy createFailureOutPortProxy() {
    return adaptersFactory.createFailureOutPortProxyAdapter(errormodelAdaptee.createFailureOutPortProxy(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getErrormodelPackage();
  }
  
  public ErrormodelPackage getErrormodelPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.eINSTANCE;
  }
}
