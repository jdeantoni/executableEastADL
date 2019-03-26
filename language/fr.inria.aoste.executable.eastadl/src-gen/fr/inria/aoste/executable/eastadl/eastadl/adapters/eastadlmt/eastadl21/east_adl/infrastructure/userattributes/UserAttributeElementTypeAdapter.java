package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class UserAttributeElementTypeAdapter extends EObjectAdapter<UserAttributeElementType> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public UserAttributeElementTypeAdapter() {
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
  public String getValidFor() {
    return adaptee.getValidFor();
  }
  
  @Override
  public void setValidFor(final String o) {
    adaptee.setValidFor(o);
  }
  
  @Override
  public void unsetValidFor() {
    adaptee.unsetValidFor() ;
  }
  
  @Override
  public boolean isSetValidFor() {
    return adaptee.isSetValidFor() ;
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
  
  private EList<UserAttributeDefinition> attribute_;
  
  @Override
  public EList<UserAttributeDefinition> getAttribute() {
    if (attribute_ == null)
    	attribute_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAttribute(), adaptersFactory, eResource);
    return attribute_;
  }
  
  @Override
  public fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType getExtendedElementType() {
    return (fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType) adaptersFactory.createAdapter(adaptee.getExtendedElementType(), eResource);
  }
  
  @Override
  public void setExtendedElementType(final fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType o) {
    if (o != null)
    	adaptee.setExtendedElementType(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementTypeAdapter) o).getAdaptee());
    else adaptee.setExtendedElementType(null);
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static String VALID_FOR_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.eINSTANCE.getUserAttributeElementType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__VALID_FOR:
    		return getValidFor();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__ATTRIBUTE:
    		return getAttribute();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__EXTENDED_ELEMENT_TYPE:
    		return getExtendedElementType();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__VALID_FOR:
    		unsetValidFor();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__VALID_FOR:
    		return isSetValidFor();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__ATTRIBUTE:
    		return getAttribute() != null && !getAttribute().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__EXTENDED_ELEMENT_TYPE:
    		return getExtendedElementType() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__GEA_PACKAGE_ELEMENT:
    		setGEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__EA_PACKAGE_ELEMENT:
    		setEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__VALID_FOR:
    		setValidFor(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__ATTRIBUTE:
    		getAttribute().clear();
    		getAttribute().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_ELEMENT_TYPE__EXTENDED_ELEMENT_TYPE:
    		setExtendedElementType(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}