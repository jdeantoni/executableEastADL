package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class _instancerefFactoryAdapter extends EFactoryImpl implements _instancerefFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing._instanceref._instancerefFactory _instancerefAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing._instanceref._instancerefFactory.eINSTANCE;
  
  @Override
  public PrecedenceConstraint_preceding createPrecedenceConstraint_preceding() {
    return adaptersFactory.createPrecedenceConstraint_precedingAdapter(_instancerefAdaptee.createPrecedenceConstraint_preceding(), null);
  }
  
  @Override
  public PrecedenceConstraint_successive createPrecedenceConstraint_successive() {
    return adaptersFactory.createPrecedenceConstraint_successiveAdapter(_instancerefAdaptee.createPrecedenceConstraint_successive(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return get_instancerefPackage();
  }
  
  public _instancerefPackage get_instancerefPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefPackage.eINSTANCE;
  }
}
