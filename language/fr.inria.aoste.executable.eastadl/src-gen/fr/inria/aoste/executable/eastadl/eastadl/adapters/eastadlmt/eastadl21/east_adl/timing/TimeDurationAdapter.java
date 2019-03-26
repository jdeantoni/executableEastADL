package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.TimeDuration;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TimeDurationAdapter extends EObjectAdapter<TimeDuration> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimeDuration {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public TimeDurationAdapter() {
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
  public Integer getCseCode() {
    return adaptee.getCseCode();
  }
  
  @Override
  public void setCseCode(final Integer o) {
    adaptee.setCseCode(o);
  }
  
  @Override
  public void unsetCseCode() {
    adaptee.unsetCseCode() ;
  }
  
  @Override
  public boolean isSetCseCode() {
    return adaptee.isSetCseCode() ;
  }
  
  @Override
  public Integer getCseCodeFactor() {
    return adaptee.getCseCodeFactor();
  }
  
  @Override
  public void setCseCodeFactor(final Integer o) {
    adaptee.setCseCodeFactor(o);
  }
  
  @Override
  public void unsetCseCodeFactor() {
    adaptee.unsetCseCodeFactor() ;
  }
  
  @Override
  public boolean isSetCseCodeFactor() {
    return adaptee.isSetCseCodeFactor() ;
  }
  
  @Override
  public Double getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final Double o) {
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
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static Integer CSE_CODE_EDEFAULT = new Integer(0);
  
  protected final static Integer CSE_CODE_FACTOR_EDEFAULT = new Integer(0);
  
  protected final static Double VALUE_EDEFAULT = new Double(0.0);
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.eINSTANCE.getTimeDuration();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__CSE_CODE:
    		return getCseCode();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__CSE_CODE_FACTOR:
    		return getCseCodeFactor();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__CSE_CODE:
    		unsetCseCode();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__CSE_CODE_FACTOR:
    		unsetCseCodeFactor();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__VALUE:
    		unsetValue();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__CSE_CODE:
    		return isSetCseCode();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__CSE_CODE_FACTOR:
    		return isSetCseCodeFactor();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__VALUE:
    		return isSetValue();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__CSE_CODE:
    		setCseCode(
    		(java.lang.Integer)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__CSE_CODE_FACTOR:
    		setCseCodeFactor(
    		(java.lang.Integer)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.TIME_DURATION__VALUE:
    		setValue(
    		(java.lang.Double)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
