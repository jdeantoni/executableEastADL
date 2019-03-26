package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class _instancerefFactoryAdapter extends EFactoryImpl implements _instancerefFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefFactory _instancerefAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefFactory.eINSTANCE;
  
  @Override
  public FaultFailure_anomaly createFaultFailure_anomaly() {
    return adaptersFactory.createFaultFailure_anomalyAdapter(_instancerefAdaptee.createFaultFailure_anomaly(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return get_instancerefPackage();
  }
  
  public _instancerefPackage get_instancerefPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage.eINSTANCE;
  }
}
