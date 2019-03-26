package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionClientServerPort_port;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunction_function;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class _instancerefFactoryAdapter extends EFactoryImpl implements _instancerefFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref._instancerefFactory _instancerefAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref._instancerefFactory.eINSTANCE;
  
  @Override
  public EventFunction_function createEventFunction_function() {
    return adaptersFactory.createEventFunction_functionAdapter(_instancerefAdaptee.createEventFunction_function(), null);
  }
  
  @Override
  public EventFunctionClientServerPort_port createEventFunctionClientServerPort_port() {
    return adaptersFactory.createEventFunctionClientServerPort_portAdapter(_instancerefAdaptee.createEventFunctionClientServerPort_port(), null);
  }
  
  @Override
  public EventFunctionFlowPort_port createEventFunctionFlowPort_port() {
    return adaptersFactory.createEventFunctionFlowPort_portAdapter(_instancerefAdaptee.createEventFunctionFlowPort_port(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return get_instancerefPackage();
  }
  
  public _instancerefPackage get_instancerefPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.eINSTANCE;
  }
}
