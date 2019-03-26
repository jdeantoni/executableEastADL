package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTarget;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ErrorModelPrototype_hwTargetAdapter extends EObjectAdapter<ErrorModelPrototype_hwTarget> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTarget {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public ErrorModelPrototype_hwTargetAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  private EList<HardwareComponentPrototype> hardwareComponentPrototype_context_;
  
  @Override
  public EList<HardwareComponentPrototype> getHardwareComponentPrototype_context() {
    if (hardwareComponentPrototype_context_ == null)
    	hardwareComponentPrototype_context_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getHardwareComponentPrototype_context(), adaptersFactory, eResource);
    return hardwareComponentPrototype_context_;
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
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.eINSTANCE.getErrorModelPrototype_hwTarget();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT:
    		return getHardwareComponentPrototype_context();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
    		return getHardwareComponentPrototype();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT:
    		return getHardwareComponentPrototype_context() != null && !getHardwareComponentPrototype_context().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
    		return getHardwareComponentPrototype() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT:
    		getHardwareComponentPrototype_context().clear();
    		getHardwareComponentPrototype_context().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET__HARDWARE_COMPONENT_PROTOTYPE:
    		setHardwareComponentPrototype(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
