package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IdentifiableAdapter extends EObjectAdapter<Identifiable> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public IdentifiableAdapter() {
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
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.eINSTANCE.getIdentifiable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__UUID:
    		return getUuid();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__UUID:
    		unsetUuid();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__UUID:
    		return isSetUuid();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.IDENTIFIABLE__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
