package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class Satisfy_satisfiedByAdapter extends EObjectAdapter<Satisfy_satisfiedBy> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public Satisfy_satisfiedByAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Identifiable getIdentifiable_target() {
    return (Identifiable) adaptersFactory.createAdapter(adaptee.getIdentifiable_target(), eResource);
  }
  
  @Override
  public void setIdentifiable_target(final Identifiable o) {
    if (o != null)
    	adaptee.setIdentifiable_target(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiableAdapter) o).getAdaptee());
    else adaptee.setIdentifiable_target(null);
  }
  
  private EList<Identifiable> identifiable_context_;
  
  @Override
  public EList<Identifiable> getIdentifiable_context() {
    if (identifiable_context_ == null)
    	identifiable_context_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIdentifiable_context(), adaptersFactory, eResource);
    return identifiable_context_;
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref._instancerefPackage.eINSTANCE.getSatisfy_satisfiedBy();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref._instancerefPackage.SATISFY_SATISFIED_BY__IDENTIFIABLE_TARGET:
    		return getIdentifiable_target();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref._instancerefPackage.SATISFY_SATISFIED_BY__IDENTIFIABLE_CONTEXT:
    		return getIdentifiable_context();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref._instancerefPackage.SATISFY_SATISFIED_BY__IDENTIFIABLE_TARGET:
    		return getIdentifiable_target() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref._instancerefPackage.SATISFY_SATISFIED_BY__IDENTIFIABLE_CONTEXT:
    		return getIdentifiable_context() != null && !getIdentifiable_context().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref._instancerefPackage.SATISFY_SATISFIED_BY__IDENTIFIABLE_TARGET:
    		setIdentifiable_target(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements._instanceref._instancerefPackage.SATISFY_SATISFIED_BY__IDENTIFIABLE_CONTEXT:
    		getIdentifiable_context().clear();
    		getIdentifiable_context().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
