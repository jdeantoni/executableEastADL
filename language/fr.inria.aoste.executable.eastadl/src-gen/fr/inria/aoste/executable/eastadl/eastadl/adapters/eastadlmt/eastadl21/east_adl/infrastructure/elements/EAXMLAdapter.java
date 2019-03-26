package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.EAXML;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class EAXMLAdapter extends EObjectAdapter<EAXML> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAXML {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public EAXMLAdapter() {
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
  
  private EList<EAPackage> topLevelPackage_;
  
  @Override
  public EList<EAPackage> getTopLevelPackage() {
    if (topLevelPackage_ == null)
    	topLevelPackage_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTopLevelPackage(), adaptersFactory, eResource);
    return topLevelPackage_;
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage.eINSTANCE.getEAXML();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage.EAXML__GTOP_LEVEL_PACKAGE:
    		return getGTopLevelPackage();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage.EAXML__TOP_LEVEL_PACKAGE:
    		return getTopLevelPackage();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage.EAXML__GTOP_LEVEL_PACKAGE:
    		return getGTopLevelPackage() != null && !getGTopLevelPackage().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage.EAXML__TOP_LEVEL_PACKAGE:
    		return getTopLevelPackage() != null && !getTopLevelPackage().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage.EAXML__GTOP_LEVEL_PACKAGE:
    		getGTopLevelPackage().clear();
    		getGTopLevelPackage().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage.EAXML__TOP_LEVEL_PACKAGE:
    		getTopLevelPackage().clear();
    		getTopLevelPackage().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
