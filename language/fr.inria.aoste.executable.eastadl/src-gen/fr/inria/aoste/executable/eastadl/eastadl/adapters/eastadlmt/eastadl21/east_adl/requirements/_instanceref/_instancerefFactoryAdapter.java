package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref._instancerefFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref._instancerefPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class _instancerefFactoryAdapter extends EFactoryImpl implements _instancerefFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements._instanceref._instancerefFactory _instancerefAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements._instanceref._instancerefFactory.eINSTANCE;
  
  @Override
  public Refine_refinedBy createRefine_refinedBy() {
    return adaptersFactory.createRefine_refinedByAdapter(_instancerefAdaptee.createRefine_refinedBy(), null);
  }
  
  @Override
  public Satisfy_satisfiedBy createSatisfy_satisfiedBy() {
    return adaptersFactory.createSatisfy_satisfiedByAdapter(_instancerefAdaptee.createSatisfy_satisfiedBy(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return get_instancerefPackage();
  }
  
  public _instancerefPackage get_instancerefPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref._instancerefPackage.eINSTANCE;
  }
}
