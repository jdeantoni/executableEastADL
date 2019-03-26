package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gelements.GEAXML;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class GEAXMLAdapter extends EObjectAdapter<GEAXML> implements fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAXML {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public GEAXMLAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  private EList<GEAPackage> gTopLevelPackage_;
  
  @Override
  public EList<GEAPackage> getGTopLevelPackage() {
    if (gTopLevelPackage_ == null)
    	gTopLevelPackage_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getGTopLevelPackage(), adaptersFactory, eResource);
    return gTopLevelPackage_;
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage.eINSTANCE.getGEAXML();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage.GEAXML__GTOP_LEVEL_PACKAGE:
    		return getGTopLevelPackage();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage.GEAXML__GTOP_LEVEL_PACKAGE:
    		return getGTopLevelPackage() != null && !getGTopLevelPackage().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage.GEAXML__GTOP_LEVEL_PACKAGE:
    		getGTopLevelPackage().clear();
    		getGTopLevelPackage().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
