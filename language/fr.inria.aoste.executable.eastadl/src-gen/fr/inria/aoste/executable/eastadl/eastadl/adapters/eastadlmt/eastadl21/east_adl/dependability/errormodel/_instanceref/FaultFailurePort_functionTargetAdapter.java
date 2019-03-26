package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTarget;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FaultFailurePort_functionTargetAdapter extends EObjectAdapter<FaultFailurePort_functionTarget> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTarget {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public FaultFailurePort_functionTargetAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
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
  
  private EList<FunctionPrototype> functionPrototype_;
  
  @Override
  public EList<FunctionPrototype> getFunctionPrototype() {
    if (functionPrototype_ == null)
    	functionPrototype_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFunctionPrototype(), adaptersFactory, eResource);
    return functionPrototype_;
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.eINSTANCE.getFaultFailurePort_functionTarget();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PORT:
    		return getFunctionPort();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
    		return getFunctionPrototype();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PORT:
    		return getFunctionPort() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
    		return getFunctionPrototype() != null && !getFunctionPrototype().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PORT:
    		setFunctionPort(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPort)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
    		getFunctionPrototype().clear();
    		getFunctionPrototype().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
