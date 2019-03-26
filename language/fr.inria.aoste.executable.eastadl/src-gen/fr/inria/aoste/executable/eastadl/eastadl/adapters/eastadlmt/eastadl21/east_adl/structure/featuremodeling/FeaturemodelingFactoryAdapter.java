package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.BindingTime;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.Feature;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureGroup;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureLink;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModel;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class FeaturemodelingFactoryAdapter extends EFactoryImpl implements FeaturemodelingFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingFactory featuremodelingAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingFactory.eINSTANCE;
  
  @Override
  public BindingTime createBindingTime() {
    return adaptersFactory.createBindingTimeAdapter(featuremodelingAdaptee.createBindingTime(), null);
  }
  
  @Override
  public Feature createFeature() {
    return adaptersFactory.createFeatureAdapter(featuremodelingAdaptee.createFeature(), null);
  }
  
  @Override
  public FeatureConstraint createFeatureConstraint() {
    return adaptersFactory.createFeatureConstraintAdapter(featuremodelingAdaptee.createFeatureConstraint(), null);
  }
  
  @Override
  public FeatureGroup createFeatureGroup() {
    return adaptersFactory.createFeatureGroupAdapter(featuremodelingAdaptee.createFeatureGroup(), null);
  }
  
  @Override
  public FeatureLink createFeatureLink() {
    return adaptersFactory.createFeatureLinkAdapter(featuremodelingAdaptee.createFeatureLink(), null);
  }
  
  @Override
  public FeatureModel createFeatureModel() {
    return adaptersFactory.createFeatureModelAdapter(featuremodelingAdaptee.createFeatureModel(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getFeaturemodelingPackage();
  }
  
  public FeaturemodelingPackage getFeaturemodelingPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.eINSTANCE;
  }
}
