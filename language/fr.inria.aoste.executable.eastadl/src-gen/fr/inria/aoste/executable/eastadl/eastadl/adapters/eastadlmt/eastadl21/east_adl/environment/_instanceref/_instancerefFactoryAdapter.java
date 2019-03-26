package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref.ClampConnector_port;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref._instancerefFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref._instancerefPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class _instancerefFactoryAdapter extends EFactoryImpl implements _instancerefFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment._instanceref._instancerefFactory _instancerefAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment._instanceref._instancerefFactory.eINSTANCE;
  
  @Override
  public ClampConnector_port createClampConnector_port() {
    return adaptersFactory.createClampConnector_portAdapter(_instancerefAdaptee.createClampConnector_port(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return get_instancerefPackage();
  }
  
  public _instancerefPackage get_instancerefPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref._instancerefPackage.eINSTANCE;
  }
}
