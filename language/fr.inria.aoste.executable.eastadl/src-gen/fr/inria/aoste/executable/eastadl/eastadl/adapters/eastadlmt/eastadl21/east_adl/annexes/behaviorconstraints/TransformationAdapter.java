package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.Transformation;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ComputationConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.Flow;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.Parameter;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TransformationAdapter extends EObjectAdapter<Transformation> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.Transformation {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public TransformationAdapter() {
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
  
  private EList<ParameterCondition> postCondition_;
  
  @Override
  public EList<ParameterCondition> getPostCondition() {
    if (postCondition_ == null)
    	postCondition_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPostCondition(), adaptersFactory, eResource);
    return postCondition_;
  }
  
  private EList<Flow> outgoingFlow_;
  
  @Override
  public EList<Flow> getOutgoingFlow() {
    if (outgoingFlow_ == null)
    	outgoingFlow_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingFlow(), adaptersFactory, eResource);
    return outgoingFlow_;
  }
  
  private EList<Flow> incomingFlow_;
  
  @Override
  public EList<Flow> getIncomingFlow() {
    if (incomingFlow_ == null)
    	incomingFlow_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingFlow(), adaptersFactory, eResource);
    return incomingFlow_;
  }
  
  private EList<Parameter> inOut_;
  
  @Override
  public EList<Parameter> getInOut() {
    if (inOut_ == null)
    	inOut_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInOut(), adaptersFactory, eResource);
    return inOut_;
  }
  
  private EList<ParameterCondition> preCondition_;
  
  @Override
  public EList<ParameterCondition> getPreCondition() {
    if (preCondition_ == null)
    	preCondition_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPreCondition(), adaptersFactory, eResource);
    return preCondition_;
  }
  
  private EList<ParameterCondition> invariantCondition_;
  
  @Override
  public EList<ParameterCondition> getInvariantCondition() {
    if (invariantCondition_ == null)
    	invariantCondition_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvariantCondition(), adaptersFactory, eResource);
    return invariantCondition_;
  }
  
  private EList<ComputationConstraint> subComputationConstraint_;
  
  @Override
  public EList<ComputationConstraint> getSubComputationConstraint() {
    if (subComputationConstraint_ == null)
    	subComputationConstraint_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubComputationConstraint(), adaptersFactory, eResource);
    return subComputationConstraint_;
  }
  
  private EList<Parameter> in_;
  
  @Override
  public EList<Parameter> getIn() {
    if (in_ == null)
    	in_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIn(), adaptersFactory, eResource);
    return in_;
  }
  
  private EList<Parameter> out_;
  
  @Override
  public EList<Parameter> getOut() {
    if (out_ == null)
    	out_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOut(), adaptersFactory, eResource);
    return out_;
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.eINSTANCE.getTransformation();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__POST_CONDITION:
    		return getPostCondition();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__OUTGOING_FLOW:
    		return getOutgoingFlow();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__INCOMING_FLOW:
    		return getIncomingFlow();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__IN_OUT:
    		return getInOut();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__PRE_CONDITION:
    		return getPreCondition();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__INVARIANT_CONDITION:
    		return getInvariantCondition();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__SUB_COMPUTATION_CONSTRAINT:
    		return getSubComputationConstraint();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__IN:
    		return getIn();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__OUT:
    		return getOut();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__NAME:
    		unsetName();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__POST_CONDITION:
    		return getPostCondition() != null && !getPostCondition().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__OUTGOING_FLOW:
    		return getOutgoingFlow() != null && !getOutgoingFlow().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__INCOMING_FLOW:
    		return getIncomingFlow() != null && !getIncomingFlow().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__IN_OUT:
    		return getInOut() != null && !getInOut().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__PRE_CONDITION:
    		return getPreCondition() != null && !getPreCondition().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__INVARIANT_CONDITION:
    		return getInvariantCondition() != null && !getInvariantCondition().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__SUB_COMPUTATION_CONSTRAINT:
    		return getSubComputationConstraint() != null && !getSubComputationConstraint().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__IN:
    		return getIn() != null && !getIn().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__OUT:
    		return getOut() != null && !getOut().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__POST_CONDITION:
    		getPostCondition().clear();
    		getPostCondition().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__OUTGOING_FLOW:
    		getOutgoingFlow().clear();
    		getOutgoingFlow().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__INCOMING_FLOW:
    		getIncomingFlow().clear();
    		getIncomingFlow().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__IN_OUT:
    		getInOut().clear();
    		getInOut().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__PRE_CONDITION:
    		getPreCondition().clear();
    		getPreCondition().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__INVARIANT_CONDITION:
    		getInvariantCondition().clear();
    		getInvariantCondition().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__SUB_COMPUTATION_CONSTRAINT:
    		getSubComputationConstraint().clear();
    		getSubComputationConstraint().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__IN:
    		getIn().clear();
    		getIn().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.TRANSFORMATION__OUT:
    		getOut().clear();
    		getOut().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
