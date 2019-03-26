package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.Variability;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Relationship;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModel;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainer;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.FeatureConfiguration;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariableElement;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VehicleLevelBinding;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class VariabilityAdapter extends EObjectAdapter<Variability> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.Variability {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public VariabilityAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getGShortName() {
    return adaptee.getGShortName();
  }
  
  @Override
  public void setGShortName(final String o) {
    adaptee.setGShortName(o);
  }
  
  @Override
  public void unsetGShortName() {
    adaptee.unsetGShortName() ;
  }
  
  @Override
  public boolean isSetGShortName() {
    return adaptee.isSetGShortName() ;
  }
  
  @Override
  public String getShortName() {
    return adaptee.getShortName();
  }
  
  @Override
  public void setShortName(final String o) {
    adaptee.setShortName(o);
  }
  
  @Override
  public void unsetShortName() {
    adaptee.unsetShortName() ;
  }
  
  @Override
  public boolean isSetShortName() {
    return adaptee.isSetShortName() ;
  }
  
  @Override
  public String getCategory() {
    return adaptee.getCategory();
  }
  
  @Override
  public void setCategory(final String o) {
    adaptee.setCategory(o);
  }
  
  @Override
  public void unsetCategory() {
    adaptee.unsetCategory() ;
  }
  
  @Override
  public boolean isSetCategory() {
    return adaptee.isSetCategory() ;
  }
  
  @Override
  public String getUuid() {
    return adaptee.getUuid();
  }
  
  @Override
  public void setUuid(final String o) {
    adaptee.setUuid(o);
  }
  
  @Override
  public void unsetUuid() {
    adaptee.unsetUuid() ;
  }
  
  @Override
  public boolean isSetUuid() {
    return adaptee.isSetUuid() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public void unsetName() {
    adaptee.unsetName() ;
  }
  
  @Override
  public boolean isSetName() {
    return adaptee.isSetName() ;
  }
  
  private EList<Comment> ownedComment_;
  
  @Override
  public EList<Comment> getOwnedComment() {
    if (ownedComment_ == null)
    	ownedComment_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComment(), adaptersFactory, eResource);
    return ownedComment_;
  }
  
  @Override
  public GEAPackage getGEAPackage_element() {
    return (GEAPackage) adaptersFactory.createAdapter(adaptee.getGEAPackage_element(), eResource);
  }
  
  @Override
  public void setGEAPackage_element(final GEAPackage o) {
    if (o != null)
    	adaptee.setGEAPackage_element(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackageAdapter) o).getAdaptee());
    else adaptee.setGEAPackage_element(null);
  }
  
  @Override
  public EAPackage getEAPackage_element() {
    return (EAPackage) adaptersFactory.createAdapter(adaptee.getEAPackage_element(), eResource);
  }
  
  @Override
  public void setEAPackage_element(final EAPackage o) {
    if (o != null)
    	adaptee.setEAPackage_element(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageAdapter) o).getAdaptee());
    else adaptee.setEAPackage_element(null);
  }
  
  private EList<TraceableSpecification> traceableSpecification_;
  
  @Override
  public EList<TraceableSpecification> getTraceableSpecification() {
    if (traceableSpecification_ == null)
    	traceableSpecification_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTraceableSpecification(), adaptersFactory, eResource);
    return traceableSpecification_;
  }
  
  private EList<Relationship> ownedRelationship_;
  
  @Override
  public EList<Relationship> getOwnedRelationship() {
    if (ownedRelationship_ == null)
    	ownedRelationship_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedRelationship(), adaptersFactory, eResource);
    return ownedRelationship_;
  }
  
  private EList<FeatureModel> productFeatureModel_;
  
  @Override
  public EList<FeatureModel> getProductFeatureModel() {
    if (productFeatureModel_ == null)
    	productFeatureModel_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProductFeatureModel(), adaptersFactory, eResource);
    return productFeatureModel_;
  }
  
  private EList<FeatureConfiguration> configuration_;
  
  @Override
  public EList<FeatureConfiguration> getConfiguration() {
    if (configuration_ == null)
    	configuration_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConfiguration(), adaptersFactory, eResource);
    return configuration_;
  }
  
  private EList<VehicleLevelBinding> decisionModel_;
  
  @Override
  public EList<VehicleLevelBinding> getDecisionModel() {
    if (decisionModel_ == null)
    	decisionModel_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDecisionModel(), adaptersFactory, eResource);
    return decisionModel_;
  }
  
  private EList<VariableElement> variableElement_;
  
  @Override
  public EList<VariableElement> getVariableElement() {
    if (variableElement_ == null)
    	variableElement_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getVariableElement(), adaptersFactory, eResource);
    return variableElement_;
  }
  
  private EList<ConfigurableContainer> configurableContainer_;
  
  @Override
  public EList<ConfigurableContainer> getConfigurableContainer() {
    if (configurableContainer_ == null)
    	configurableContainer_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConfigurableContainer(), adaptersFactory, eResource);
    return configurableContainer_;
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.eINSTANCE.getVariability();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__TRACEABLE_SPECIFICATION:
    		return getTraceableSpecification();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__OWNED_RELATIONSHIP:
    		return getOwnedRelationship();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__PRODUCT_FEATURE_MODEL:
    		return getProductFeatureModel();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__CONFIGURATION:
    		return getConfiguration();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__DECISION_MODEL:
    		return getDecisionModel();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__VARIABLE_ELEMENT:
    		return getVariableElement();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__CONFIGURABLE_CONTAINER:
    		return getConfigurableContainer();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__NAME:
    		unsetName();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__TRACEABLE_SPECIFICATION:
    		return getTraceableSpecification() != null && !getTraceableSpecification().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__OWNED_RELATIONSHIP:
    		return getOwnedRelationship() != null && !getOwnedRelationship().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__PRODUCT_FEATURE_MODEL:
    		return getProductFeatureModel() != null && !getProductFeatureModel().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__CONFIGURATION:
    		return getConfiguration() != null && !getConfiguration().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__DECISION_MODEL:
    		return getDecisionModel() != null && !getDecisionModel().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__VARIABLE_ELEMENT:
    		return getVariableElement() != null && !getVariableElement().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__CONFIGURABLE_CONTAINER:
    		return getConfigurableContainer() != null && !getConfigurableContainer().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__GEA_PACKAGE_ELEMENT:
    		setGEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__EA_PACKAGE_ELEMENT:
    		setEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__TRACEABLE_SPECIFICATION:
    		getTraceableSpecification().clear();
    		getTraceableSpecification().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__OWNED_RELATIONSHIP:
    		getOwnedRelationship().clear();
    		getOwnedRelationship().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__PRODUCT_FEATURE_MODEL:
    		getProductFeatureModel().clear();
    		getProductFeatureModel().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__CONFIGURATION:
    		getConfiguration().clear();
    		getConfiguration().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__DECISION_MODEL:
    		getDecisionModel().clear();
    		getDecisionModel().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__VARIABLE_ELEMENT:
    		getVariableElement().clear();
    		getVariableElement().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.VARIABILITY__CONFIGURABLE_CONTAINER:
    		getConfigurableContainer().clear();
    		getConfigurableContainer().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}