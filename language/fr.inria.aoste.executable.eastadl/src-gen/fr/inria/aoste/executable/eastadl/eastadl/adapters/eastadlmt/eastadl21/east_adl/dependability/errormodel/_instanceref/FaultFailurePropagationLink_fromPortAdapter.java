package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxy;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FaultFailurePropagationLink_fromPortAdapter extends EObjectAdapter<FaultFailurePropagationLink_fromPort> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public FaultFailurePropagationLink_fromPortAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public FaultFailurePort getFaultFailurePort() {
    return (FaultFailurePort) adaptersFactory.createAdapter(adaptee.getFaultFailurePort(), eResource);
  }
  
  @Override
  public void setFaultFailurePort(final FaultFailurePort o) {
    if (o != null)
    	adaptee.setFaultFailurePort(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePortAdapter) o).getAdaptee());
    else adaptee.setFaultFailurePort(null);
  }
  
  private EList<ErrorModelPrototype> errorModelPrototype_;
  
  @Override
  public EList<ErrorModelPrototype> getErrorModelPrototype() {
    if (errorModelPrototype_ == null)
    	errorModelPrototype_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getErrorModelPrototype(), adaptersFactory, eResource);
    return errorModelPrototype_;
  }
  
  @Override
  public FaultFailurePortProxy getFaultFailurePortProxy() {
    return (FaultFailurePortProxy) adaptersFactory.createAdapter(adaptee.getFaultFailurePortProxy(), eResource);
  }
  
  @Override
  public void setFaultFailurePortProxy(final FaultFailurePortProxy o) {
    if (o != null)
    	adaptee.setFaultFailurePortProxy(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxyAdapter) o).getAdaptee());
    else adaptee.setFaultFailurePortProxy(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.eINSTANCE.getFaultFailurePropagationLink_fromPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT__FAULT_FAILURE_PORT:
    		return getFaultFailurePort();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT__ERROR_MODEL_PROTOTYPE:
    		return getErrorModelPrototype();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT__FAULT_FAILURE_PORT_PROXY:
    		return getFaultFailurePortProxy();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT__FAULT_FAILURE_PORT:
    		return getFaultFailurePort() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT__ERROR_MODEL_PROTOTYPE:
    		return getErrorModelPrototype() != null && !getErrorModelPrototype().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT__FAULT_FAILURE_PORT_PROXY:
    		return getFaultFailurePortProxy() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT__FAULT_FAILURE_PORT:
    		setFaultFailurePort(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePort)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT__ERROR_MODEL_PROTOTYPE:
    		getErrorModelPrototype().clear();
    		getErrorModelPrototype().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT__FAULT_FAILURE_PORT_PROXY:
    		setFaultFailurePortProxy(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxy)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
