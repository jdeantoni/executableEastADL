package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_port;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class HardwareConnector_portAdapter extends EObjectAdapter<HardwareConnector_port> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_port {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public HardwareConnector_portAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public HardwareComponentPrototype getHardwareComponentPrototype() {
    return (HardwareComponentPrototype) adaptersFactory.createAdapter(adaptee.getHardwareComponentPrototype(), eResource);
  }
  
  @Override
  public void setHardwareComponentPrototype(final HardwareComponentPrototype o) {
    if (o != null)
    	adaptee.setHardwareComponentPrototype(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototypeAdapter) o).getAdaptee());
    else adaptee.setHardwareComponentPrototype(null);
  }
  
  @Override
  public HardwarePin getHardwarePin() {
    return (HardwarePin) adaptersFactory.createAdapter(adaptee.getHardwarePin(), eResource);
  }
  
  @Override
  public void setHardwarePin(final HardwarePin o) {
    if (o != null)
    	adaptee.setHardwarePin(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinAdapter) o).getAdaptee());
    else adaptee.setHardwarePin(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.eINSTANCE.getHardwareConnector_port();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
    		return getHardwareComponentPrototype();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN:
    		return getHardwarePin();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
    		return getHardwareComponentPrototype() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN:
    		return getHardwarePin() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
    		setHardwareComponentPrototype(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN:
    		setHardwarePin(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
