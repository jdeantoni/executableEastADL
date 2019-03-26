package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionConnector_port;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPortProxy;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FunctionConnector_portAdapter extends EObjectAdapter<FunctionConnector_port> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionConnector_port {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public FunctionConnector_portAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public FunctionPrototype getFunctionPrototype() {
    return (FunctionPrototype) adaptersFactory.createAdapter(adaptee.getFunctionPrototype(), eResource);
  }
  
  @Override
  public void setFunctionPrototype(final FunctionPrototype o) {
    if (o != null)
    	adaptee.setFunctionPrototype(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototypeAdapter) o).getAdaptee());
    else adaptee.setFunctionPrototype(null);
  }
  
  @Override
  public FunctionPort getFunctionPort() {
    return (FunctionPort) adaptersFactory.createAdapter(adaptee.getFunctionPort(), eResource);
  }
  
  @Override
  public void setFunctionPort(final FunctionPort o) {
    if (o != null)
    	adaptee.setFunctionPort(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPortAdapter) o).getAdaptee());
    else adaptee.setFunctionPort(null);
  }
  
  @Override
  public FunctionPortProxy getFunctionPortProxy() {
    return (FunctionPortProxy) adaptersFactory.createAdapter(adaptee.getFunctionPortProxy(), eResource);
  }
  
  @Override
  public void setFunctionPortProxy(final FunctionPortProxy o) {
    if (o != null)
    	adaptee.setFunctionPortProxy(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPortProxyAdapter) o).getAdaptee());
    else adaptee.setFunctionPortProxy(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.eINSTANCE.getFunctionConnector_port();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
    		return getFunctionPrototype();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
    		return getFunctionPort();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT_PROXY:
    		return getFunctionPortProxy();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
    		return getFunctionPrototype() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
    		return getFunctionPort() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT_PROXY:
    		return getFunctionPortProxy() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
    		setFunctionPrototype(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
    		setFunctionPort(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPort)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT_PROXY:
    		setFunctionPortProxy(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPortProxy)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
