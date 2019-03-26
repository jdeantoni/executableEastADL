package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.FunctionalSafetyConcept;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.TechnicalSafetyConcept;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class SafetyrequirementFactoryAdapter extends EFactoryImpl implements SafetyrequirementFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementFactory safetyrequirementAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementFactory.eINSTANCE;
  
  @Override
  public FunctionalSafetyConcept createFunctionalSafetyConcept() {
    return adaptersFactory.createFunctionalSafetyConceptAdapter(safetyrequirementAdaptee.createFunctionalSafetyConcept(), null);
  }
  
  @Override
  public SafetyGoal createSafetyGoal() {
    return adaptersFactory.createSafetyGoalAdapter(safetyrequirementAdaptee.createSafetyGoal(), null);
  }
  
  @Override
  public TechnicalSafetyConcept createTechnicalSafetyConcept() {
    return adaptersFactory.createTechnicalSafetyConceptAdapter(safetyrequirementAdaptee.createTechnicalSafetyConcept(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getSafetyrequirementPackage();
  }
  
  public SafetyrequirementPackage getSafetyrequirementPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage.eINSTANCE;
  }
}
