package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment._instanceref.ClampConnector_port;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ClampConnector_portAdapter extends EObjectAdapter<ClampConnector_port> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref.ClampConnector_port {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public ClampConnector_portAdapter() {
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
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref._instancerefPackage.eINSTANCE.getClampConnector_port();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref._instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
    		return getFunctionPrototype();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref._instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PORT:
    		return getFunctionPort();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref._instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
    		return getFunctionPrototype() != null && !getFunctionPrototype().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref._instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PORT:
    		return getFunctionPort() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref._instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
    		getFunctionPrototype().clear();
    		getFunctionPrototype().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment._instanceref._instancerefPackage.CLAMP_CONNECTOR_PORT__FUNCTION_PORT:
    		setFunctionPort(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPort)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
