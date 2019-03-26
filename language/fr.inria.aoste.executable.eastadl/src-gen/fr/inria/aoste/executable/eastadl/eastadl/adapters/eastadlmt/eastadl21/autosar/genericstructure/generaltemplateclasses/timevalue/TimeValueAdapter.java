package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimeValue;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TimeValueAdapter extends EObjectAdapter<TimeValue> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimeValue {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public TimeValueAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
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
  
  protected final static Integer CSE_CODE_EDEFAULT = new Integer(0);
  
  protected final static Integer CSE_CODE_FACTOR_EDEFAULT = new Integer(0);
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevaluePackage.eINSTANCE.getTimeValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevaluePackage.TIME_VALUE__CSE_CODE:
    		return getCseCode();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevaluePackage.TIME_VALUE__CSE_CODE_FACTOR:
    		return getCseCodeFactor();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevaluePackage.TIME_VALUE__CSE_CODE:
    		unsetCseCode();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevaluePackage.TIME_VALUE__CSE_CODE_FACTOR:
    		unsetCseCodeFactor();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevaluePackage.TIME_VALUE__CSE_CODE:
    		return isSetCseCode();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevaluePackage.TIME_VALUE__CSE_CODE_FACTOR:
    		return isSetCseCodeFactor();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevaluePackage.TIME_VALUE__CSE_CODE:
    		setCseCode(
    		(java.lang.Integer)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimevaluePackage.TIME_VALUE__CSE_CODE_FACTOR:
    		setCseCodeFactor(
    		(java.lang.Integer)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
