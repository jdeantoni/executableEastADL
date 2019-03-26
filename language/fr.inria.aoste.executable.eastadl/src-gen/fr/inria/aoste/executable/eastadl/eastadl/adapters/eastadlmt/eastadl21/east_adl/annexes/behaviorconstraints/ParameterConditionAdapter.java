package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.Parameter;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.Anomaly;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ParameterConditionAdapter extends EObjectAdapter<ParameterCondition> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public ParameterConditionAdapter() {
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
  
  @Override
  public String getExpression() {
    return adaptee.getExpression();
  }
  
  @Override
  public void setExpression(final String o) {
    adaptee.setExpression(o);
  }
  
  @Override
  public void unsetExpression() {
    adaptee.unsetExpression() ;
  }
  
  @Override
  public boolean isSetExpression() {
    return adaptee.isSetExpression() ;
  }
  
  private EList<Comment> ownedComment_;
  
  @Override
  public EList<Comment> getOwnedComment() {
    if (ownedComment_ == null)
    	ownedComment_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComment(), adaptersFactory, eResource);
    return ownedComment_;
  }
  
  private EList<Anomaly> representAnomaly_;
  
  @Override
  public EList<Anomaly> getRepresentAnomaly() {
    if (representAnomaly_ == null)
    	representAnomaly_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRepresentAnomaly(), adaptersFactory, eResource);
    return representAnomaly_;
  }
  
  private EList<fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition> appliedToCondition_;
  
  @Override
  public EList<fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition> getAppliedToCondition() {
    if (appliedToCondition_ == null)
    	appliedToCondition_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAppliedToCondition(), adaptersFactory, eResource);
    return appliedToCondition_;
  }
  
  private EList<Parameter> appliedToParameter_;
  
  @Override
  public EList<Parameter> getAppliedToParameter() {
    if (appliedToParameter_ == null)
    	appliedToParameter_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAppliedToParameter(), adaptersFactory, eResource);
    return appliedToParameter_;
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static String EXPRESSION_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.eINSTANCE.getParameterCondition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__EXPRESSION:
    		return getExpression();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__REPRESENT_ANOMALY:
    		return getRepresentAnomaly();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_CONDITION:
    		return getAppliedToCondition();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_PARAMETER:
    		return getAppliedToParameter();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__EXPRESSION:
    		unsetExpression();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__EXPRESSION:
    		return isSetExpression();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__REPRESENT_ANOMALY:
    		return getRepresentAnomaly() != null && !getRepresentAnomaly().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_CONDITION:
    		return getAppliedToCondition() != null && !getAppliedToCondition().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_PARAMETER:
    		return getAppliedToParameter() != null && !getAppliedToParameter().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__EXPRESSION:
    		setExpression(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__REPRESENT_ANOMALY:
    		getRepresentAnomaly().clear();
    		getRepresentAnomaly().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_CONDITION:
    		getAppliedToCondition().clear();
    		getAppliedToCondition().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_PARAMETER:
    		getAppliedToParameter().clear();
    		getAppliedToParameter().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
