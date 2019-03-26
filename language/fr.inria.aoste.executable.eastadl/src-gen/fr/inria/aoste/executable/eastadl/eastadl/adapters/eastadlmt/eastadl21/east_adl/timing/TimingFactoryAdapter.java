package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.EventChain;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.ExecutionTimeConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.PrecedenceConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimeDuration;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.Timing;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class TimingFactoryAdapter extends EFactoryImpl implements TimingFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.TimingFactory timingAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.TimingFactory.eINSTANCE;
  
  @Override
  public EventChain createEventChain() {
    return adaptersFactory.createEventChainAdapter(timingAdaptee.createEventChain(), null);
  }
  
  @Override
  public ExecutionTimeConstraint createExecutionTimeConstraint() {
    return adaptersFactory.createExecutionTimeConstraintAdapter(timingAdaptee.createExecutionTimeConstraint(), null);
  }
  
  @Override
  public PrecedenceConstraint createPrecedenceConstraint() {
    return adaptersFactory.createPrecedenceConstraintAdapter(timingAdaptee.createPrecedenceConstraint(), null);
  }
  
  @Override
  public TimeDuration createTimeDuration() {
    return adaptersFactory.createTimeDurationAdapter(timingAdaptee.createTimeDuration(), null);
  }
  
  @Override
  public Timing createTiming() {
    return adaptersFactory.createTimingAdapter(timingAdaptee.createTiming(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getTimingPackage();
  }
  
  public TimingPackage getTimingPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimingPackage.eINSTANCE;
  }
}
