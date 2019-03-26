package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gelements.GIdentifiable;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class GIdentifiableAdapter extends EObjectAdapter<GIdentifiable> implements fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GIdentifiable {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public GIdentifiableAdapter() {
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
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage.eINSTANCE.getGIdentifiable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage.GIDENTIFIABLE__GSHORT_NAME:
    		return getGShortName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage.GIDENTIFIABLE__GSHORT_NAME:
    		unsetGShortName();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage.GIDENTIFIABLE__GSHORT_NAME:
    		return isSetGShortName();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage.GIDENTIFIABLE__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
