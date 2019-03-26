package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ConfigurationDecision;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.SelectionCriterion;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ConfigurationDecisionAdapter extends EObjectAdapter<ConfigurationDecision> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecision {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public ConfigurationDecisionAdapter() {
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
  
  @Override
  public Boolean getIsActive() {
    return adaptee.getIsActive();
  }
  
  @Override
  public void setIsActive(final Boolean o) {
    adaptee.setIsActive(o);
  }
  
  @Override
  public void unsetIsActive() {
    adaptee.unsetIsActive() ;
  }
  
  @Override
  public boolean isSetIsActive() {
    return adaptee.isSetIsActive() ;
  }
  
  @Override
  public String getEffect() {
    return adaptee.getEffect();
  }
  
  @Override
  public void setEffect(final String o) {
    adaptee.setEffect(o);
  }
  
  @Override
  public void unsetEffect() {
    adaptee.unsetEffect() ;
  }
  
  @Override
  public boolean isSetEffect() {
    return adaptee.isSetEffect() ;
  }
  
  @Override
  public String getCriterion() {
    return adaptee.getCriterion();
  }
  
  @Override
  public void setCriterion(final String o) {
    adaptee.setCriterion(o);
  }
  
  @Override
  public void unsetCriterion() {
    adaptee.unsetCriterion() ;
  }
  
  @Override
  public boolean isSetCriterion() {
    return adaptee.isSetCriterion() ;
  }
  
  @Override
  public Boolean getIsEquivalence() {
    return adaptee.getIsEquivalence();
  }
  
  @Override
  public void setIsEquivalence(final Boolean o) {
    adaptee.setIsEquivalence(o);
  }
  
  @Override
  public void unsetIsEquivalence() {
    adaptee.unsetIsEquivalence() ;
  }
  
  @Override
  public boolean isSetIsEquivalence() {
    return adaptee.isSetIsEquivalence() ;
  }
  
  private EList<Comment> ownedComment_;
  
  @Override
  public EList<Comment> getOwnedComment() {
    if (ownedComment_ == null)
    	ownedComment_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComment(), adaptersFactory, eResource);
    return ownedComment_;
  }
  
  @Override
  public SelectionCriterion getSelectionCriterion() {
    return (SelectionCriterion) adaptersFactory.createAdapter(adaptee.getSelectionCriterion(), eResource);
  }
  
  @Override
  public void setSelectionCriterion(final SelectionCriterion o) {
    if (o != null)
    	adaptee.setSelectionCriterion(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.SelectionCriterionAdapter) o).getAdaptee());
    else adaptee.setSelectionCriterion(null);
  }
  
  private EList<Identifiable> target_;
  
  @Override
  public EList<Identifiable> getTarget() {
    if (target_ == null)
    	target_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTarget(), adaptersFactory, eResource);
    return target_;
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static Boolean IS_ACTIVE_EDEFAULT = java.lang.Boolean.FALSE;
  
  protected final static String EFFECT_EDEFAULT = "";
  
  protected final static String CRITERION_EDEFAULT = "";
  
  protected final static Boolean IS_EQUIVALENCE_EDEFAULT = java.lang.Boolean.FALSE;
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.eINSTANCE.getConfigurationDecision();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__IS_ACTIVE:
    		return getIsActive();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__EFFECT:
    		return getEffect();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__CRITERION:
    		return getCriterion();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE:
    		return getIsEquivalence();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION:
    		return getSelectionCriterion();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__IS_ACTIVE:
    		unsetIsActive();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__EFFECT:
    		unsetEffect();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__CRITERION:
    		unsetCriterion();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE:
    		unsetIsEquivalence();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__IS_ACTIVE:
    		return isSetIsActive();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__EFFECT:
    		return isSetEffect();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__CRITERION:
    		return isSetCriterion();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE:
    		return isSetIsEquivalence();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION:
    		return getSelectionCriterion() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__TARGET:
    		return getTarget() != null && !getTarget().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__IS_ACTIVE:
    		setIsActive(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__EFFECT:
    		setEffect(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__CRITERION:
    		setCriterion(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE:
    		setIsEquivalence(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION:
    		setSelectionCriterion(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.SelectionCriterion)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage.CONFIGURATION_DECISION__TARGET:
    		getTarget().clear();
    		getTarget().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
