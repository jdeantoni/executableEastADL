package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureLink;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.Feature;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.VariabilityDependencyKind;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FeatureLinkAdapter extends EObjectAdapter<FeatureLink> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureLink {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public FeatureLinkAdapter() {
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
  public Boolean getIsBidirectional() {
    return adaptee.getIsBidirectional();
  }
  
  @Override
  public void setIsBidirectional(final Boolean o) {
    adaptee.setIsBidirectional(o);
  }
  
  @Override
  public void unsetIsBidirectional() {
    adaptee.unsetIsBidirectional() ;
  }
  
  @Override
  public boolean isSetIsBidirectional() {
    return adaptee.isSetIsBidirectional() ;
  }
  
  @Override
  public String getCustomType() {
    return adaptee.getCustomType();
  }
  
  @Override
  public void setCustomType(final String o) {
    adaptee.setCustomType(o);
  }
  
  @Override
  public void unsetCustomType() {
    adaptee.unsetCustomType() ;
  }
  
  @Override
  public boolean isSetCustomType() {
    return adaptee.isSetCustomType() ;
  }
  
  @Override
  public VariabilityDependencyKind getKind() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.VariabilityDependencyKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final VariabilityDependencyKind o) {
    adaptee.setKind(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.VariabilityDependencyKind.get(o.getValue()));
  }
  
  @Override
  public void unsetKind() {
    adaptee.unsetKind() ;
  }
  
  @Override
  public boolean isSetKind() {
    return adaptee.isSetKind() ;
  }
  
  private EList<Comment> ownedComment_;
  
  @Override
  public EList<Comment> getOwnedComment() {
    if (ownedComment_ == null)
    	ownedComment_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComment(), adaptersFactory, eResource);
    return ownedComment_;
  }
  
  @Override
  public Feature getEnd() {
    return (Feature) adaptersFactory.createAdapter(adaptee.getEnd(), eResource);
  }
  
  @Override
  public void setEnd(final Feature o) {
    if (o != null)
    	adaptee.setEnd(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureAdapter) o).getAdaptee());
    else adaptee.setEnd(null);
  }
  
  @Override
  public Feature getStart() {
    return (Feature) adaptersFactory.createAdapter(adaptee.getStart(), eResource);
  }
  
  @Override
  public void setStart(final Feature o) {
    if (o != null)
    	adaptee.setStart(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureAdapter) o).getAdaptee());
    else adaptee.setStart(null);
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static Boolean IS_BIDIRECTIONAL_EDEFAULT = java.lang.Boolean.FALSE;
  
  protected final static String CUSTOM_TYPE_EDEFAULT = "";
  
  protected final static VariabilityDependencyKind KIND_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.VariabilityDependencyKind.MANDATORY_ALTERNATIVE;
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.eINSTANCE.getFeatureLink();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__IS_BIDIRECTIONAL:
    		return getIsBidirectional();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__CUSTOM_TYPE:
    		return getCustomType();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__KIND:
    		return getKind();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__END:
    		return getEnd();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__START:
    		return getStart();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__IS_BIDIRECTIONAL:
    		unsetIsBidirectional();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__CUSTOM_TYPE:
    		unsetCustomType();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__KIND:
    		unsetKind();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__IS_BIDIRECTIONAL:
    		return isSetIsBidirectional();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__CUSTOM_TYPE:
    		return isSetCustomType();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__KIND:
    		return isSetKind();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__END:
    		return getEnd() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__START:
    		return getStart() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__IS_BIDIRECTIONAL:
    		setIsBidirectional(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__CUSTOM_TYPE:
    		setCustomType(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__KIND:
    		setKind(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.VariabilityDependencyKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__END:
    		setEnd(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.Feature)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage.FEATURE_LINK__START:
    		setStart(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.Feature)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
