package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class EventFunctionFlowPort_portAdapter extends EObjectAdapter<EventFunctionFlowPort_port> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public EventFunctionFlowPort_portAdapter() {
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
  public FunctionFlowPort getFunctionFlowPort() {
    return (FunctionFlowPort) adaptersFactory.createAdapter(adaptee.getFunctionFlowPort(), eResource);
  }
  
  @Override
  public void setFunctionFlowPort(final FunctionFlowPort o) {
    if (o != null)
    	adaptee.setFunctionFlowPort(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortAdapter) o).getAdaptee());
    else adaptee.setFunctionFlowPort(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.eINSTANCE.getEventFunctionFlowPort_port();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_PROTOTYPE:
    		return getFunctionPrototype();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_FLOW_PORT:
    		return getFunctionFlowPort();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_PROTOTYPE:
    		return getFunctionPrototype() != null && !getFunctionPrototype().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_FLOW_PORT:
    		return getFunctionFlowPort() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_PROTOTYPE:
    		getFunctionPrototype().clear();
    		getFunctionPrototype().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref._instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT__FUNCTION_FLOW_PORT:
    		setFunctionFlowPort(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
