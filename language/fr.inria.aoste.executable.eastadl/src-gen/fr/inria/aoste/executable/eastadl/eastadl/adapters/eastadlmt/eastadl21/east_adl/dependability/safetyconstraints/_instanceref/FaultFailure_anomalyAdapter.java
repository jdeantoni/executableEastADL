package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.Anomaly;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FaultFailure_anomalyAdapter extends EObjectAdapter<FaultFailure_anomaly> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public FaultFailure_anomalyAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Anomaly getAnomaly() {
    return (Anomaly) adaptersFactory.createAdapter(adaptee.getAnomaly(), eResource);
  }
  
  @Override
  public void setAnomaly(final Anomaly o) {
    if (o != null)
    	adaptee.setAnomaly(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.AnomalyAdapter) o).getAdaptee());
    else adaptee.setAnomaly(null);
  }
  
  private EList<ErrorModelPrototype> errorModelPrototype_;
  
  @Override
  public EList<ErrorModelPrototype> getErrorModelPrototype() {
    if (errorModelPrototype_ == null)
    	errorModelPrototype_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getErrorModelPrototype(), adaptersFactory, eResource);
    return errorModelPrototype_;
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage.eINSTANCE.getFaultFailure_anomaly();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage.FAULT_FAILURE_ANOMALY__ANOMALY:
    		return getAnomaly();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage.FAULT_FAILURE_ANOMALY__ERROR_MODEL_PROTOTYPE:
    		return getErrorModelPrototype();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage.FAULT_FAILURE_ANOMALY__ANOMALY:
    		return getAnomaly() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage.FAULT_FAILURE_ANOMALY__ERROR_MODEL_PROTOTYPE:
    		return getErrorModelPrototype() != null && !getErrorModelPrototype().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage.FAULT_FAILURE_ANOMALY__ANOMALY:
    		setAnomaly(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.Anomaly)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref._instancerefPackage.FAULT_FAILURE_ANOMALY__ERROR_MODEL_PROTOTYPE:
    		getErrorModelPrototype().clear();
    		getErrorModelPrototype().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
