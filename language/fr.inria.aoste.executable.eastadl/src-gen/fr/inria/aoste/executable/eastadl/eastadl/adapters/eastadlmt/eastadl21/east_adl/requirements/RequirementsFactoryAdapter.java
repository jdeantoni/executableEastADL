package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.DeriveRequirement;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.OperationalSituation;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.QualityRequirement;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Refine;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainer;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsLink;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsModel;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelatedInformation;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationGroup;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Satisfy;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class RequirementsFactoryAdapter extends EFactoryImpl implements RequirementsFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsFactory requirementsAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsFactory.eINSTANCE;
  
  @Override
  public DeriveRequirement createDeriveRequirement() {
    return adaptersFactory.createDeriveRequirementAdapter(requirementsAdaptee.createDeriveRequirement(), null);
  }
  
  @Override
  public OperationalSituation createOperationalSituation() {
    return adaptersFactory.createOperationalSituationAdapter(requirementsAdaptee.createOperationalSituation(), null);
  }
  
  @Override
  public RequirementsModel createRequirementsModel() {
    return adaptersFactory.createRequirementsModelAdapter(requirementsAdaptee.createRequirementsModel(), null);
  }
  
  @Override
  public RequirementsRelatedInformation createRequirementsRelatedInformation() {
    return adaptersFactory.createRequirementsRelatedInformationAdapter(requirementsAdaptee.createRequirementsRelatedInformation(), null);
  }
  
  @Override
  public Requirement createRequirement() {
    return adaptersFactory.createRequirementAdapter(requirementsAdaptee.createRequirement(), null);
  }
  
  @Override
  public RequirementsContainer createRequirementsContainer() {
    return adaptersFactory.createRequirementsContainerAdapter(requirementsAdaptee.createRequirementsContainer(), null);
  }
  
  @Override
  public Refine createRefine() {
    return adaptersFactory.createRefineAdapter(requirementsAdaptee.createRefine(), null);
  }
  
  @Override
  public Satisfy createSatisfy() {
    return adaptersFactory.createSatisfyAdapter(requirementsAdaptee.createSatisfy(), null);
  }
  
  @Override
  public RequirementsLink createRequirementsLink() {
    return adaptersFactory.createRequirementsLinkAdapter(requirementsAdaptee.createRequirementsLink(), null);
  }
  
  @Override
  public RequirementsRelationGroup createRequirementsRelationGroup() {
    return adaptersFactory.createRequirementsRelationGroupAdapter(requirementsAdaptee.createRequirementsRelationGroup(), null);
  }
  
  @Override
  public QualityRequirement createQualityRequirement() {
    return adaptersFactory.createQualityRequirementAdapter(requirementsAdaptee.createQualityRequirement(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getRequirementsPackage();
  }
  
  public RequirementsPackage getRequirementsPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.eINSTANCE;
  }
}
