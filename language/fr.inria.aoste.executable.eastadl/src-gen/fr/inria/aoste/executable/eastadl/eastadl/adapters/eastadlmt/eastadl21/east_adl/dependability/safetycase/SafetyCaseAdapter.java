package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.SafetyCase;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Ground;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Warrant;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class SafetyCaseAdapter extends EObjectAdapter<SafetyCase> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public SafetyCaseAdapter() {
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
  public String getText() {
    return adaptee.getText();
  }
  
  @Override
  public void setText(final String o) {
    adaptee.setText(o);
  }
  
  @Override
  public void unsetText() {
    adaptee.unsetText() ;
  }
  
  @Override
  public boolean isSetText() {
    return adaptee.isSetText() ;
  }
  
  @Override
  public LifecycleStageKind getStage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind.get(adaptee.getStage().getValue());
  }
  
  @Override
  public void setStage(final LifecycleStageKind o) {
    adaptee.setStage(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind.get(o.getValue()));
  }
  
  @Override
  public void unsetStage() {
    adaptee.unsetStage() ;
  }
  
  @Override
  public boolean isSetStage() {
    return adaptee.isSetStage() ;
  }
  
  @Override
  public String getContext() {
    return adaptee.getContext();
  }
  
  @Override
  public void setContext(final String o) {
    adaptee.setContext(o);
  }
  
  @Override
  public void unsetContext() {
    adaptee.unsetContext() ;
  }
  
  @Override
  public boolean isSetContext() {
    return adaptee.isSetContext() ;
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
  
  private EList<fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase> safetyCase_;
  
  @Override
  public EList<fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase> getSafetyCase() {
    if (safetyCase_ == null)
    	safetyCase_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSafetyCase(), adaptersFactory, eResource);
    return safetyCase_;
  }
  
  private EList<Warrant> warrant_;
  
  @Override
  public EList<Warrant> getWarrant() {
    if (warrant_ == null)
    	warrant_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getWarrant(), adaptersFactory, eResource);
    return warrant_;
  }
  
  private EList<Claim> claim_;
  
  @Override
  public EList<Claim> getClaim() {
    if (claim_ == null)
    	claim_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getClaim(), adaptersFactory, eResource);
    return claim_;
  }
  
  private EList<Ground> ground_;
  
  @Override
  public EList<Ground> getGround() {
    if (ground_ == null)
    	ground_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getGround(), adaptersFactory, eResource);
    return ground_;
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static String TEXT_EDEFAULT = "";
  
  protected final static LifecycleStageKind STAGE_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind.PRELIMINARY_SAFETY_CASE;
  
  protected final static String CONTEXT_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.eINSTANCE.getSafetyCase();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__TEXT:
    		return getText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__STAGE:
    		return getStage();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__CONTEXT:
    		return getContext();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__SAFETY_CASE:
    		return getSafetyCase();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__WARRANT:
    		return getWarrant();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__CLAIM:
    		return getClaim();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__GROUND:
    		return getGround();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__TEXT:
    		unsetText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__STAGE:
    		unsetStage();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__CONTEXT:
    		unsetContext();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__TEXT:
    		return isSetText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__STAGE:
    		return isSetStage();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__CONTEXT:
    		return isSetContext();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__SAFETY_CASE:
    		return getSafetyCase() != null && !getSafetyCase().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__WARRANT:
    		return getWarrant() != null && !getWarrant().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__CLAIM:
    		return getClaim() != null && !getClaim().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__GROUND:
    		return getGround() != null && !getGround().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__GEA_PACKAGE_ELEMENT:
    		setGEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__EA_PACKAGE_ELEMENT:
    		setEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__TEXT:
    		setText(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__STAGE:
    		setStage(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__CONTEXT:
    		setContext(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__SAFETY_CASE:
    		getSafetyCase().clear();
    		getSafetyCase().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__WARRANT:
    		getWarrant().clear();
    		getWarrant().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__CLAIM:
    		getClaim().clear();
    		getClaim().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.SAFETY_CASE__GROUND:
    		getGround().clear();
    		getGround().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
