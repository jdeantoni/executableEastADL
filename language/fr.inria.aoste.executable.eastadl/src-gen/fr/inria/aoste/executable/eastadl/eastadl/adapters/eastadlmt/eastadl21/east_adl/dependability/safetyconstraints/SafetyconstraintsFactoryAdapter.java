package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class SafetyconstraintsFactoryAdapter extends EFactoryImpl implements SafetyconstraintsFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsFactory safetyconstraintsAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsFactory.eINSTANCE;
  
  @Override
  public FaultFailure createFaultFailure() {
    return adaptersFactory.createFaultFailureAdapter(safetyconstraintsAdaptee.createFaultFailure(), null);
  }
  
  @Override
  public QuantitativeSafetyConstraint createQuantitativeSafetyConstraint() {
    return adaptersFactory.createQuantitativeSafetyConstraintAdapter(safetyconstraintsAdaptee.createQuantitativeSafetyConstraint(), null);
  }
  
  @Override
  public SafetyConstraint createSafetyConstraint() {
    return adaptersFactory.createSafetyConstraintAdapter(safetyconstraintsAdaptee.createSafetyConstraint(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getSafetyconstraintsPackage();
  }
  
  public SafetyconstraintsPackage getSafetyconstraintsPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage.eINSTANCE;
  }
}
