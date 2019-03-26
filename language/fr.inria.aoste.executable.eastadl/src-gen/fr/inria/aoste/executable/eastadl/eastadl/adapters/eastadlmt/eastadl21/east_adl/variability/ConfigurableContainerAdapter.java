package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ConfigurableContainer;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModel;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.InternalBinding;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariationGroup;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ConfigurableContainerAdapter extends EObjectAdapter<ConfigurableContainer> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainer {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public ConfigurableContainerAdapter() {
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
  public Identifiable getConfigurableElement() {
    return (Identifiable) adaptersFactory.createAdapter(adaptee.getConfigurableElement(), eResource);
  }
  
  @Override
  public void setConfigurableElement(final Identifiable o) {
    if (o != null)
    	adaptee.setConfigurableElement(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiableAdapter) o).getAdaptee());
    else adaptee.setConfigurableElement(null);
  }
  
  @Override
  public FeatureModel getPublicFeatureModel() {
    return (FeatureModel) adaptersFactory.createAdapter(adaptee.getPublicFeatureModel(), eResource);
  }
  
  @Override
  public void setPublicFeatureModel(final FeatureModel o) {
    if (o != null)
    	adaptee.setPublicFeatureModel(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModelAdapter) o).getAdaptee());
    else adaptee.setPublicFeatureModel(null);
  }
  
  private EList<VariationGroup> variationGroup_;
  
  @Override
  public EList<VariationGroup> getVariationGroup() {
    if (variationGroup_ == null)
    	variationGroup_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getVariationGroup(), adaptersFactory, eResource);
    return variationGroup_;
  }
  
  @Override
  public InternalBinding getInternalBinding() {
    return (InternalBinding) adaptersFactory.createAdapter(adaptee.getInternalBinding(), eResource);
  }
  
  @Override
  public void setInternalBinding(final InternalBinding o) {
    if (o != null)
    	adaptee.setInternalBinding(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.InternalBindingAdapter) o).getAdaptee());
    else adaptee.setInternalBinding(null);
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.eINSTANCE.getConfigurableContainer();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__CONFIGURABLE_ELEMENT:
    		return getConfigurableElement();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__PUBLIC_FEATURE_MODEL:
    		return getPublicFeatureModel();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__VARIATION_GROUP:
    		return getVariationGroup();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__INTERNAL_BINDING:
    		return getInternalBinding();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__NAME:
    		unsetName();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__CONFIGURABLE_ELEMENT:
    		return getConfigurableElement() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__PUBLIC_FEATURE_MODEL:
    		return getPublicFeatureModel() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__VARIATION_GROUP:
    		return getVariationGroup() != null && !getVariationGroup().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__INTERNAL_BINDING:
    		return getInternalBinding() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__CONFIGURABLE_ELEMENT:
    		setConfigurableElement(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__PUBLIC_FEATURE_MODEL:
    		setPublicFeatureModel(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModel)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__VARIATION_GROUP:
    		getVariationGroup().clear();
    		getVariationGroup().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURABLE_CONTAINER__INTERNAL_BINDING:
    		setInternalBinding(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.InternalBinding)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
