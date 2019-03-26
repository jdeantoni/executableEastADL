package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRef;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpClassifier;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpFeature;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class AtpInstanceRefAdapter extends EObjectAdapter<AtpInstanceRef> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRef {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public AtpInstanceRefAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public AtpClassifier getAtpBase() {
    return (AtpClassifier) adaptersFactory.createAdapter(adaptee.getAtpBase(), eResource);
  }
  
  @Override
  public void setAtpBase(final AtpClassifier o) {
    if (o != null)
    	adaptee.setAtpBase(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpClassifierAdapter) o).getAdaptee());
    else adaptee.setAtpBase(null);
  }
  
  private EList<AtpFeature> atpContextElement_;
  
  @Override
  public EList<AtpFeature> getAtpContextElement() {
    if (atpContextElement_ == null)
    	atpContextElement_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAtpContextElement(), adaptersFactory, eResource);
    return atpContextElement_;
  }
  
  @Override
  public AtpFeature getAtpTarget() {
    return (AtpFeature) adaptersFactory.createAdapter(adaptee.getAtpTarget(), eResource);
  }
  
  @Override
  public void setAtpTarget(final AtpFeature o) {
    if (o != null)
    	adaptee.setAtpTarget(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpFeatureAdapter) o).getAdaptee());
    else adaptee.setAtpTarget(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage.eINSTANCE.getAtpInstanceRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage.ATP_INSTANCE_REF__ATP_BASE:
    		return getAtpBase();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage.ATP_INSTANCE_REF__ATP_CONTEXT_ELEMENT:
    		return getAtpContextElement();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage.ATP_INSTANCE_REF__ATP_TARGET:
    		return getAtpTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage.ATP_INSTANCE_REF__ATP_BASE:
    		return getAtpBase() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage.ATP_INSTANCE_REF__ATP_CONTEXT_ELEMENT:
    		return getAtpContextElement() != null && !getAtpContextElement().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage.ATP_INSTANCE_REF__ATP_TARGET:
    		return getAtpTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage.ATP_INSTANCE_REF__ATP_BASE:
    		setAtpBase(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpClassifier)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage.ATP_INSTANCE_REF__ATP_CONTEXT_ELEMENT:
    		getAtpContextElement().clear();
    		getAtpContextElement().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage.ATP_INSTANCE_REF__ATP_TARGET:
    		setAtpTarget(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpFeature)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
