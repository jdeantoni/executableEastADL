package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FaultFailurePort_hwTargetAdapter extends EObjectAdapter<FaultFailurePort_hwTarget> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public FaultFailurePort_hwTargetAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public HardwarePin getHardwarePort() {
    return (HardwarePin) adaptersFactory.createAdapter(adaptee.getHardwarePort(), eResource);
  }
  
  @Override
  public void setHardwarePort(final HardwarePin o) {
    if (o != null)
    	adaptee.setHardwarePort(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinAdapter) o).getAdaptee());
    else adaptee.setHardwarePort(null);
  }
  
  private EList<HardwareComponentPrototype> hardwareComponentPrototype_;
  
  @Override
  public EList<HardwareComponentPrototype> getHardwareComponentPrototype() {
    if (hardwareComponentPrototype_ == null)
    	hardwareComponentPrototype_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getHardwareComponentPrototype(), adaptersFactory, eResource);
    return hardwareComponentPrototype_;
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.eINSTANCE.getFaultFailurePort_hwTarget();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_PORT:
    		return getHardwarePort();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
    		return getHardwareComponentPrototype();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_PORT:
    		return getHardwarePort() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
    		return getHardwareComponentPrototype() != null && !getHardwareComponentPrototype().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_PORT:
    		setHardwarePort(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
    		getHardwareComponentPrototype().clear();
    		getHardwareComponentPrototype().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
