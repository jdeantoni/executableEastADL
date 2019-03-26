package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.Behavior;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionBehavior;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.Mode;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.ModeGroup;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class BehaviorFactoryAdapter extends EFactoryImpl implements BehaviorFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.BehaviorFactory behaviorAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.BehaviorFactory.eINSTANCE;
  
  @Override
  public Behavior createBehavior() {
    return adaptersFactory.createBehaviorAdapter(behaviorAdaptee.createBehavior(), null);
  }
  
  @Override
  public Mode createMode() {
    return adaptersFactory.createModeAdapter(behaviorAdaptee.createMode(), null);
  }
  
  @Override
  public ModeGroup createModeGroup() {
    return adaptersFactory.createModeGroupAdapter(behaviorAdaptee.createModeGroup(), null);
  }
  
  @Override
  public FunctionBehavior createFunctionBehavior() {
    return adaptersFactory.createFunctionBehaviorAdapter(behaviorAdaptee.createFunctionBehavior(), null);
  }
  
  @Override
  public FunctionTrigger createFunctionTrigger() {
    return adaptersFactory.createFunctionTriggerAdapter(behaviorAdaptee.createFunctionTrigger(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getBehaviorPackage();
  }
  
  public BehaviorPackage getBehaviorPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.eINSTANCE;
  }
}
