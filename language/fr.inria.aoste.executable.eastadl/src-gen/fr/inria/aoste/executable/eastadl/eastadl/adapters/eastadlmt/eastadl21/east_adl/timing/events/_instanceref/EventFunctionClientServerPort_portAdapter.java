package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref.EventFunctionClientServerPort_port;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class EventFunctionClientServerPort_portAdapter extends EObjectAdapter<EventFunctionClientServerPort_port> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionClientServerPort_port {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public EventFunctionClientServerPort_portAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  private EList<FunctionPrototype> functionPrototype_;
  
  @Override
  public EList<FunctionPrototype> getFunctionPrototype() {
    if (functionPrototype_ == null)
    	functionPrototype_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFunctionPrototype(), adaptersFactory, eResource);
    return functionPrototype_;
  }
  
  @Override
  public FunctionClientServerPort getFunctionClientServerPort() {
    return (FunctionClientServerPort) adaptersFactory.createAdapter(adaptee.getFunctionClientServerPort(), eResource);
  }
  
  @Override
  public void setFunctionClientServerPort(final FunctionClientServerPort o) {
    if (o != null)
    	adaptee.setFunctionClientServerPort(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortAdapter) o).getAdaptee());
    else adaptee.setFunctionClientServerPort(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.eINSTANCE.getEventFunctionClientServerPort_port();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_PROTOTYPE:
    		return getFunctionPrototype();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_CLIENT_SERVER_PORT:
    		return getFunctionClientServerPort();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_PROTOTYPE:
    		return getFunctionPrototype() != null && !getFunctionPrototype().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_CLIENT_SERVER_PORT:
    		return getFunctionClientServerPort() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_PROTOTYPE:
    		getFunctionPrototype().clear();
    		getFunctionPrototype().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT__FUNCTION_CLIENT_SERVER_PORT:
    		setFunctionClientServerPort(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
