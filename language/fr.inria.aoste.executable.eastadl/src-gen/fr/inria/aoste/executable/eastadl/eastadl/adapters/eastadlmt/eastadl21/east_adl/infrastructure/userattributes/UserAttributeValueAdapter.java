package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class UserAttributeValueAdapter extends EObjectAdapter<UserAttributeValue> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public UserAttributeValueAdapter() {
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
  public String getSemantics() {
    return adaptee.getSemantics();
  }
  
  @Override
  public void setSemantics(final String o) {
    adaptee.setSemantics(o);
  }
  
  @Override
  public void unsetSemantics() {
    adaptee.unsetSemantics() ;
  }
  
  @Override
  public boolean isSetSemantics() {
    return adaptee.isSetSemantics() ;
  }
  
  @Override
  public String getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final String o) {
    adaptee.setValue(o);
  }
  
  @Override
  public void unsetValue() {
    adaptee.unsetValue() ;
  }
  
  @Override
  public boolean isSetValue() {
    return adaptee.isSetValue() ;
  }
  
  private EList<Comment> ownedComment_;
  
  @Override
  public EList<Comment> getOwnedComment() {
    if (ownedComment_ == null)
    	ownedComment_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComment(), adaptersFactory, eResource);
    return ownedComment_;
  }
  
  @Override
  public UserAttributeDefinition getDefinition() {
    return (UserAttributeDefinition) adaptersFactory.createAdapter(adaptee.getDefinition(), eResource);
  }
  
  @Override
  public void setDefinition(final UserAttributeDefinition o) {
    if (o != null)
    	adaptee.setDefinition(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinitionAdapter) o).getAdaptee());
    else adaptee.setDefinition(null);
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static String SEMANTICS_EDEFAULT = "";
  
  protected final static String VALUE_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.eINSTANCE.getUserAttributeValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__SEMANTICS:
    		return getSemantics();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__VALUE:
    		return getValue();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__DEFINITION:
    		return getDefinition();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__SEMANTICS:
    		unsetSemantics();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__VALUE:
    		unsetValue();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__SEMANTICS:
    		return isSetSemantics();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__VALUE:
    		return isSetValue();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__DEFINITION:
    		return getDefinition() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__SEMANTICS:
    		setSemantics(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__VALUE:
    		setValue(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTE_VALUE__DEFINITION:
    		setDefinition(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
