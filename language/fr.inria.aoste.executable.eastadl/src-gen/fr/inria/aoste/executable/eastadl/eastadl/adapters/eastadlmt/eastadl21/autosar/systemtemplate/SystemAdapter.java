package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.systemtemplate;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpFeature;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class SystemAdapter extends EObjectAdapter<fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.systemtemplate.System> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.System {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public SystemAdapter() {
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
  public String getEcuExtractVersion() {
    return adaptee.getEcuExtractVersion();
  }
  
  @Override
  public void setEcuExtractVersion(final String o) {
    adaptee.setEcuExtractVersion(o);
  }
  
  @Override
  public void unsetEcuExtractVersion() {
    adaptee.unsetEcuExtractVersion() ;
  }
  
  @Override
  public boolean isSetEcuExtractVersion() {
    return adaptee.isSetEcuExtractVersion() ;
  }
  
  @Override
  public String getSystemVersion() {
    return adaptee.getSystemVersion();
  }
  
  @Override
  public void setSystemVersion(final String o) {
    adaptee.setSystemVersion(o);
  }
  
  @Override
  public void unsetSystemVersion() {
    adaptee.unsetSystemVersion() ;
  }
  
  @Override
  public boolean isSetSystemVersion() {
    return adaptee.isSetSystemVersion() ;
  }
  
  private EList<AtpFeature> atpFeature_;
  
  @Override
  public EList<AtpFeature> getAtpFeature() {
    if (atpFeature_ == null)
    	atpFeature_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAtpFeature(), adaptersFactory, eResource);
    return atpFeature_;
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String ECU_EXTRACT_VERSION_EDEFAULT = "";
  
  protected final static String SYSTEM_VERSION_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.eINSTANCE.getSystem();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__ATP_FEATURE:
    		return getAtpFeature();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__ECU_EXTRACT_VERSION:
    		return getEcuExtractVersion();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__SYSTEM_VERSION:
    		return getSystemVersion();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__ECU_EXTRACT_VERSION:
    		unsetEcuExtractVersion();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__SYSTEM_VERSION:
    		unsetSystemVersion();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__ATP_FEATURE:
    		return getAtpFeature() != null && !getAtpFeature().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__ECU_EXTRACT_VERSION:
    		return isSetEcuExtractVersion();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__SYSTEM_VERSION:
    		return isSetSystemVersion();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__ATP_FEATURE:
    		getAtpFeature().clear();
    		getAtpFeature().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__ECU_EXTRACT_VERSION:
    		setEcuExtractVersion(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.SYSTEM__SYSTEM_VERSION:
    		setSystemVersion(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
