package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTarget;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTarget;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTarget;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_toPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class _instancerefFactoryAdapter extends EFactoryImpl implements _instancerefFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefFactory _instancerefAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefFactory.eINSTANCE;
  
  @Override
  public ErrorModelPrototype_functionTarget createErrorModelPrototype_functionTarget() {
    return adaptersFactory.createErrorModelPrototype_functionTargetAdapter(_instancerefAdaptee.createErrorModelPrototype_functionTarget(), null);
  }
  
  @Override
  public ErrorModelPrototype_hwTarget createErrorModelPrototype_hwTarget() {
    return adaptersFactory.createErrorModelPrototype_hwTargetAdapter(_instancerefAdaptee.createErrorModelPrototype_hwTarget(), null);
  }
  
  @Override
  public FaultFailurePort_functionTarget createFaultFailurePort_functionTarget() {
    return adaptersFactory.createFaultFailurePort_functionTargetAdapter(_instancerefAdaptee.createFaultFailurePort_functionTarget(), null);
  }
  
  @Override
  public FaultFailurePort_hwTarget createFaultFailurePort_hwTarget() {
    return adaptersFactory.createFaultFailurePort_hwTargetAdapter(_instancerefAdaptee.createFaultFailurePort_hwTarget(), null);
  }
  
  @Override
  public FaultFailurePropagationLink_fromPort createFaultFailurePropagationLink_fromPort() {
    return adaptersFactory.createFaultFailurePropagationLink_fromPortAdapter(_instancerefAdaptee.createFaultFailurePropagationLink_fromPort(), null);
  }
  
  @Override
  public FaultFailurePropagationLink_toPort createFaultFailurePropagationLink_toPort() {
    return adaptersFactory.createFaultFailurePropagationLink_toPortAdapter(_instancerefAdaptee.createFaultFailurePropagationLink_toPort(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return get_instancerefPackage();
  }
  
  public _instancerefPackage get_instancerefPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.eINSTANCE;
  }
}
