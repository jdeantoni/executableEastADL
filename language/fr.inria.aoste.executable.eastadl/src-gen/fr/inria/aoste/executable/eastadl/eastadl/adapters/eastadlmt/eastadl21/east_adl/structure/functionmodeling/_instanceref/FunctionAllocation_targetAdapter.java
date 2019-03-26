package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_target;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpClassifier;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpFeature;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.AllocationTarget;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FunctionAllocation_targetAdapter extends EObjectAdapter<FunctionAllocation_target> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_target {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public FunctionAllocation_targetAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public AtpClassifier getAtpBase() {
    return (AtpClassifier) adaptersFactory.createAdapter(adaptee.getAtpBase(), eResource);
  }
  
  @Override
  public void setAtpBase(final AtpClassifier o) {
    if (o != null)
    	adaptee.setAtpBase(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpClassifierAdapter) o).getAdaptee());
    else adaptee.setAtpBase(null);
  }
  
  private EList<AtpFeature> atpContextElement_;
  
  @Override
  public EList<AtpFeature> getAtpContextElement() {
    if (atpContextElement_ == null)
    	atpContextElement_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAtpContextElement(), adaptersFactory, eResource);
    return atpContextElement_;
  }
  
  @Override
  public AtpFeature getAtpTarget() {
    return (AtpFeature) adaptersFactory.createAdapter(adaptee.getAtpTarget(), eResource);
  }
  
  @Override
  public void setAtpTarget(final AtpFeature o) {
    if (o != null)
    	adaptee.setAtpTarget(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpFeatureAdapter) o).getAdaptee());
    else adaptee.setAtpTarget(null);
  }
  
  private EList<AllocationTarget> allocationTarget_context_;
  
  @Override
  public EList<AllocationTarget> getAllocationTarget_context() {
    if (allocationTarget_context_ == null)
    	allocationTarget_context_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocationTarget_context(), adaptersFactory, eResource);
    return allocationTarget_context_;
  }
  
  @Override
  public AllocationTarget getAllocationTarget() {
    return (AllocationTarget) adaptersFactory.createAdapter(adaptee.getAllocationTarget(), eResource);
  }
  
  @Override
  public void setAllocationTarget(final AllocationTarget o) {
    if (o != null)
    	adaptee.setAllocationTarget(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.AllocationTargetAdapter) o).getAdaptee());
    else adaptee.setAllocationTarget(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.eINSTANCE.getFunctionAllocation_target();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ATP_BASE:
    		return getAtpBase();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ATP_CONTEXT_ELEMENT:
    		return getAtpContextElement();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ATP_TARGET:
    		return getAtpTarget();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT:
    		return getAllocationTarget_context();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET:
    		return getAllocationTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ATP_BASE:
    		return getAtpBase() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ATP_CONTEXT_ELEMENT:
    		return getAtpContextElement() != null && !getAtpContextElement().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ATP_TARGET:
    		return getAtpTarget() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT:
    		return getAllocationTarget_context() != null && !getAllocationTarget_context().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET:
    		return getAllocationTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ATP_BASE:
    		setAtpBase(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpClassifier)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ATP_CONTEXT_ELEMENT:
    		getAtpContextElement().clear();
    		getAtpContextElement().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ATP_TARGET:
    		setAtpTarget(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpFeature)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT:
    		getAllocationTarget_context().clear();
    		getAllocationTarget_context().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET:
    		setAllocationTarget(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.AllocationTarget)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
