package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionBehavior;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.Mode;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorBehavior;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BehaviorConstraintAdapter extends EObjectAdapter<BehaviorConstraint> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorConstraint {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public BehaviorConstraintAdapter() {
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
  
  private EList<Comment> ownedComment_;
  
  @Override
  public EList<Comment> getOwnedComment() {
    if (ownedComment_ == null)
    	ownedComment_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComment(), adaptersFactory, eResource);
    return ownedComment_;
  }
  
  private EList<Mode> constrainedMode_;
  
  @Override
  public EList<Mode> getConstrainedMode() {
    if (constrainedMode_ == null)
    	constrainedMode_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConstrainedMode(), adaptersFactory, eResource);
    return constrainedMode_;
  }
  
  private EList<VehicleFeature> relatedVehicleFeature_;
  
  @Override
  public EList<VehicleFeature> getRelatedVehicleFeature() {
    if (relatedVehicleFeature_ == null)
    	relatedVehicleFeature_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRelatedVehicleFeature(), adaptersFactory, eResource);
    return relatedVehicleFeature_;
  }
  
  private EList<FunctionBehavior> constrainedFunctionBehavior_;
  
  @Override
  public EList<FunctionBehavior> getConstrainedFunctionBehavior() {
    if (constrainedFunctionBehavior_ == null)
    	constrainedFunctionBehavior_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConstrainedFunctionBehavior(), adaptersFactory, eResource);
    return constrainedFunctionBehavior_;
  }
  
  private EList<ErrorBehavior> constrainedErrorBehavior_;
  
  @Override
  public EList<ErrorBehavior> getConstrainedErrorBehavior() {
    if (constrainedErrorBehavior_ == null)
    	constrainedErrorBehavior_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConstrainedErrorBehavior(), adaptersFactory, eResource);
    return constrainedErrorBehavior_;
  }
  
  private EList<FunctionTrigger> constrainedFunctionTrigger_;
  
  @Override
  public EList<FunctionTrigger> getConstrainedFunctionTrigger() {
    if (constrainedFunctionTrigger_ == null)
    	constrainedFunctionTrigger_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConstrainedFunctionTrigger(), adaptersFactory, eResource);
    return constrainedFunctionTrigger_;
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.eINSTANCE.getBehaviorConstraint();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_MODE:
    		return getConstrainedMode();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__RELATED_VEHICLE_FEATURE:
    		return getRelatedVehicleFeature();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_BEHAVIOR:
    		return getConstrainedFunctionBehavior();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_ERROR_BEHAVIOR:
    		return getConstrainedErrorBehavior();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_TRIGGER:
    		return getConstrainedFunctionTrigger();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__NAME:
    		unsetName();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_MODE:
    		return getConstrainedMode() != null && !getConstrainedMode().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__RELATED_VEHICLE_FEATURE:
    		return getRelatedVehicleFeature() != null && !getRelatedVehicleFeature().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_BEHAVIOR:
    		return getConstrainedFunctionBehavior() != null && !getConstrainedFunctionBehavior().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_ERROR_BEHAVIOR:
    		return getConstrainedErrorBehavior() != null && !getConstrainedErrorBehavior().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_TRIGGER:
    		return getConstrainedFunctionTrigger() != null && !getConstrainedFunctionTrigger().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_MODE:
    		getConstrainedMode().clear();
    		getConstrainedMode().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__RELATED_VEHICLE_FEATURE:
    		getRelatedVehicleFeature().clear();
    		getRelatedVehicleFeature().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_BEHAVIOR:
    		getConstrainedFunctionBehavior().clear();
    		getConstrainedFunctionBehavior().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_ERROR_BEHAVIOR:
    		getConstrainedErrorBehavior().clear();
    		getConstrainedErrorBehavior().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_TRIGGER:
    		getConstrainedFunctionTrigger().clear();
    		getConstrainedFunctionTrigger().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
