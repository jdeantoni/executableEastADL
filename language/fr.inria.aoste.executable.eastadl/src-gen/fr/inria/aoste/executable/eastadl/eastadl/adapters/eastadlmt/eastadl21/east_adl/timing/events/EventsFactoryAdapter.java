package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventFunction;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionFlowPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class EventsFactoryAdapter extends EFactoryImpl implements EventsFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventsFactory eventsAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventsFactory.eINSTANCE;
  
  @Override
  public EventFunction createEventFunction() {
    return adaptersFactory.createEventFunctionAdapter(eventsAdaptee.createEventFunction(), null);
  }
  
  @Override
  public EventFunctionClientServerPort createEventFunctionClientServerPort() {
    return adaptersFactory.createEventFunctionClientServerPortAdapter(eventsAdaptee.createEventFunctionClientServerPort(), null);
  }
  
  @Override
  public EventFunctionFlowPort createEventFunctionFlowPort() {
    return adaptersFactory.createEventFunctionFlowPortAdapter(eventsAdaptee.createEventFunctionFlowPort(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getEventsPackage();
  }
  
  public EventsPackage getEventsPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.eINSTANCE;
  }
}
