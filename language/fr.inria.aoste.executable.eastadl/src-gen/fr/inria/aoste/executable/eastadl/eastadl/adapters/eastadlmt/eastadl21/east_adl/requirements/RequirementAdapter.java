package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.Requirement;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.Mode;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class RequirementAdapter extends EObjectAdapter<Requirement> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public RequirementAdapter() {
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
  public String getFormalism() {
    return adaptee.getFormalism();
  }
  
  @Override
  public void setFormalism(final String o) {
    adaptee.setFormalism(o);
  }
  
  @Override
  public void unsetFormalism() {
    adaptee.unsetFormalism() ;
  }
  
  @Override
  public boolean isSetFormalism() {
    return adaptee.isSetFormalism() ;
  }
  
  @Override
  public String getUrl() {
    return adaptee.getUrl();
  }
  
  @Override
  public void setUrl(final String o) {
    adaptee.setUrl(o);
  }
  
  @Override
  public void unsetUrl() {
    adaptee.unsetUrl() ;
  }
  
  @Override
  public boolean isSetUrl() {
    return adaptee.isSetUrl() ;
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
  
  private EList<Mode> mode_;
  
  @Override
  public EList<Mode> getMode() {
    if (mode_ == null)
    	mode_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMode(), adaptersFactory, eResource);
    return mode_;
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static String TEXT_EDEFAULT = "";
  
  protected final static String FORMALISM_EDEFAULT = "";
  
  protected final static String URL_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.eINSTANCE.getRequirement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__TEXT:
    		return getText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__FORMALISM:
    		return getFormalism();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__URL:
    		return getUrl();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__MODE:
    		return getMode();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__TEXT:
    		unsetText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__FORMALISM:
    		unsetFormalism();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__URL:
    		unsetUrl();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__TEXT:
    		return isSetText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__FORMALISM:
    		return isSetFormalism();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__URL:
    		return isSetUrl();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__MODE:
    		return getMode() != null && !getMode().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__GEA_PACKAGE_ELEMENT:
    		setGEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__EA_PACKAGE_ELEMENT:
    		setEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__TEXT:
    		setText(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__FORMALISM:
    		setFormalism(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__URL:
    		setUrl(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage.REQUIREMENT__MODE:
    		getMode().clear();
    		getMode().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}