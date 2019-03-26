package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraintSet;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.TakeRateConstraint;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class GenericconstraintsFactoryAdapter extends EFactoryImpl implements GenericconstraintsFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.genericconstraints.GenericconstraintsFactory genericconstraintsAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.genericconstraints.GenericconstraintsFactory.eINSTANCE;
  
  @Override
  public GenericConstraint createGenericConstraint() {
    return adaptersFactory.createGenericConstraintAdapter(genericconstraintsAdaptee.createGenericConstraint(), null);
  }
  
  @Override
  public GenericConstraintSet createGenericConstraintSet() {
    return adaptersFactory.createGenericConstraintSetAdapter(genericconstraintsAdaptee.createGenericConstraintSet(), null);
  }
  
  @Override
  public TakeRateConstraint createTakeRateConstraint() {
    return adaptersFactory.createTakeRateConstraintAdapter(genericconstraintsAdaptee.createTakeRateConstraint(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getGenericconstraintsPackage();
  }
  
  public GenericconstraintsPackage getGenericconstraintsPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage.eINSTANCE;
  }
}
