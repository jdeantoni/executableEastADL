package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainer;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecision;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionFolder;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ContainerConfiguration;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.FeatureConfiguration;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.InternalBinding;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.PrivateContent;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ReuseMetaInformation;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.SelectionCriterion;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.Variability;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariableElement;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariationGroup;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VehicleLevelBinding;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class VariabilityFactoryAdapter extends EFactoryImpl implements VariabilityFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.VariabilityFactory variabilityAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.VariabilityFactory.eINSTANCE;
  
  @Override
  public ConfigurableContainer createConfigurableContainer() {
    return adaptersFactory.createConfigurableContainerAdapter(variabilityAdaptee.createConfigurableContainer(), null);
  }
  
  @Override
  public ConfigurationDecision createConfigurationDecision() {
    return adaptersFactory.createConfigurationDecisionAdapter(variabilityAdaptee.createConfigurationDecision(), null);
  }
  
  @Override
  public ConfigurationDecisionFolder createConfigurationDecisionFolder() {
    return adaptersFactory.createConfigurationDecisionFolderAdapter(variabilityAdaptee.createConfigurationDecisionFolder(), null);
  }
  
  @Override
  public ContainerConfiguration createContainerConfiguration() {
    return adaptersFactory.createContainerConfigurationAdapter(variabilityAdaptee.createContainerConfiguration(), null);
  }
  
  @Override
  public FeatureConfiguration createFeatureConfiguration() {
    return adaptersFactory.createFeatureConfigurationAdapter(variabilityAdaptee.createFeatureConfiguration(), null);
  }
  
  @Override
  public InternalBinding createInternalBinding() {
    return adaptersFactory.createInternalBindingAdapter(variabilityAdaptee.createInternalBinding(), null);
  }
  
  @Override
  public PrivateContent createPrivateContent() {
    return adaptersFactory.createPrivateContentAdapter(variabilityAdaptee.createPrivateContent(), null);
  }
  
  @Override
  public ReuseMetaInformation createReuseMetaInformation() {
    return adaptersFactory.createReuseMetaInformationAdapter(variabilityAdaptee.createReuseMetaInformation(), null);
  }
  
  @Override
  public SelectionCriterion createSelectionCriterion() {
    return adaptersFactory.createSelectionCriterionAdapter(variabilityAdaptee.createSelectionCriterion(), null);
  }
  
  @Override
  public Variability createVariability() {
    return adaptersFactory.createVariabilityAdapter(variabilityAdaptee.createVariability(), null);
  }
  
  @Override
  public VariableElement createVariableElement() {
    return adaptersFactory.createVariableElementAdapter(variabilityAdaptee.createVariableElement(), null);
  }
  
  @Override
  public VariationGroup createVariationGroup() {
    return adaptersFactory.createVariationGroupAdapter(variabilityAdaptee.createVariationGroup(), null);
  }
  
  @Override
  public VehicleLevelBinding createVehicleLevelBinding() {
    return adaptersFactory.createVehicleLevelBindingAdapter(variabilityAdaptee.createVehicleLevelBinding(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getVariabilityPackage();
  }
  
  public VariabilityPackage getVariabilityPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.eINSTANCE;
  }
}
