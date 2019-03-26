package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorAnnex;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ComputationConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.Flow;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.Parameter;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.State;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.Transformation;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.Transition;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class BehaviorconstraintsFactoryAdapter extends EFactoryImpl implements BehaviorconstraintsFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsFactory behaviorconstraintsAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsFactory.eINSTANCE;
  
  @Override
  public BehaviorAnnex createBehaviorAnnex() {
    return adaptersFactory.createBehaviorAnnexAdapter(behaviorconstraintsAdaptee.createBehaviorAnnex(), null);
  }
  
  @Override
  public StateMachineConstraint createStateMachineConstraint() {
    return adaptersFactory.createStateMachineConstraintAdapter(behaviorconstraintsAdaptee.createStateMachineConstraint(), null);
  }
  
  @Override
  public ComputationConstraint createComputationConstraint() {
    return adaptersFactory.createComputationConstraintAdapter(behaviorconstraintsAdaptee.createComputationConstraint(), null);
  }
  
  @Override
  public Flow createFlow() {
    return adaptersFactory.createFlowAdapter(behaviorconstraintsAdaptee.createFlow(), null);
  }
  
  @Override
  public Parameter createParameter() {
    return adaptersFactory.createParameterAdapter(behaviorconstraintsAdaptee.createParameter(), null);
  }
  
  @Override
  public ParameterCondition createParameterCondition() {
    return adaptersFactory.createParameterConditionAdapter(behaviorconstraintsAdaptee.createParameterCondition(), null);
  }
  
  @Override
  public ParameterConstraint createParameterConstraint() {
    return adaptersFactory.createParameterConstraintAdapter(behaviorconstraintsAdaptee.createParameterConstraint(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(behaviorconstraintsAdaptee.createState(), null);
  }
  
  @Override
  public Transformation createTransformation() {
    return adaptersFactory.createTransformationAdapter(behaviorconstraintsAdaptee.createTransformation(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(behaviorconstraintsAdaptee.createTransition(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getBehaviorconstraintsPackage();
  }
  
  public BehaviorconstraintsPackage getBehaviorconstraintsPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage.eINSTANCE;
  }
}
