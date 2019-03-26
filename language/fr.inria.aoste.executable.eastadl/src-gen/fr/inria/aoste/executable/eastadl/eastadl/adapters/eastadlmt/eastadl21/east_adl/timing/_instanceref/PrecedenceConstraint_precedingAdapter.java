package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class PrecedenceConstraint_precedingAdapter extends EObjectAdapter<PrecedenceConstraint_preceding> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public PrecedenceConstraint_precedingAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public FunctionPrototype getFunctionPrototype_target() {
    return (FunctionPrototype) adaptersFactory.createAdapter(adaptee.getFunctionPrototype_target(), eResource);
  }
  
  @Override
  public void setFunctionPrototype_target(final FunctionPrototype o) {
    if (o != null)
    	adaptee.setFunctionPrototype_target(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototypeAdapter) o).getAdaptee());
    else adaptee.setFunctionPrototype_target(null);
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
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefPackage.eINSTANCE.getPrecedenceConstraint_preceding();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefPackage.PRECEDENCE_CONSTRAINT_PRECEDING__FUNCTION_PROTOTYPE_TARGET:
    		return getFunctionPrototype_target();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefPackage.PRECEDENCE_CONSTRAINT_PRECEDING__FUNCTION_PROTOTYPE_CONTEXT:
    		return getFunctionPrototype_context();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefPackage.PRECEDENCE_CONSTRAINT_PRECEDING__FUNCTION_PROTOTYPE_TARGET:
    		return getFunctionPrototype_target() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefPackage.PRECEDENCE_CONSTRAINT_PRECEDING__FUNCTION_PROTOTYPE_CONTEXT:
    		return getFunctionPrototype_context() != null && !getFunctionPrototype_context().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefPackage.PRECEDENCE_CONSTRAINT_PRECEDING__FUNCTION_PROTOTYPE_TARGET:
    		setFunctionPrototype_target(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefPackage.PRECEDENCE_CONSTRAINT_PRECEDING__FUNCTION_PROTOTYPE_CONTEXT:
    		getFunctionPrototype_context().clear();
    		getFunctionPrototype_context().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
