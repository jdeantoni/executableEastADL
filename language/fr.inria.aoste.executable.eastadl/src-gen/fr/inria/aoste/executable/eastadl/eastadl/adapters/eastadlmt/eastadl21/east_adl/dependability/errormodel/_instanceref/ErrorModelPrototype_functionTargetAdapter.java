package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTarget;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ErrorModelPrototype_functionTargetAdapter extends EObjectAdapter<ErrorModelPrototype_functionTarget> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTarget {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public ErrorModelPrototype_functionTargetAdapter() {
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
  
  private EList<FunctionPrototype> functionPrototype_context_;
  
  @Override
  public EList<FunctionPrototype> getFunctionPrototype_context() {
    if (functionPrototype_context_ == null)
    	functionPrototype_context_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFunctionPrototype_context(), adaptersFactory, eResource);
    return functionPrototype_context_;
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.eINSTANCE.getErrorModelPrototype_functionTarget();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
    		return getFunctionPrototype();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE_CONTEXT:
    		return getFunctionPrototype_context();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
    		return getFunctionPrototype() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE_CONTEXT:
    		return getFunctionPrototype_context() != null && !getFunctionPrototype_context().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE:
    		setFunctionPrototype(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET__FUNCTION_PROTOTYPE_CONTEXT:
    		getFunctionPrototype_context().clear();
    		getFunctionPrototype_context().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
