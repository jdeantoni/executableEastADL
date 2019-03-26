package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.AgeTimingConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.ArbitraryEventConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.InputSynchronizationConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.OutputSynchronizationConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.PeriodicEventConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.ReactionConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class TimingconstraintsFactoryAdapter extends EFactoryImpl implements TimingconstraintsFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsFactory timingconstraintsAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsFactory.eINSTANCE;
  
  @Override
  public ArbitraryEventConstraint createArbitraryEventConstraint() {
    return adaptersFactory.createArbitraryEventConstraintAdapter(timingconstraintsAdaptee.createArbitraryEventConstraint(), null);
  }
  
  @Override
  public PatternEventConstraint createPatternEventConstraint() {
    return adaptersFactory.createPatternEventConstraintAdapter(timingconstraintsAdaptee.createPatternEventConstraint(), null);
  }
  
  @Override
  public PeriodicEventConstraint createPeriodicEventConstraint() {
    return adaptersFactory.createPeriodicEventConstraintAdapter(timingconstraintsAdaptee.createPeriodicEventConstraint(), null);
  }
  
  @Override
  public SporadicEventConstraint createSporadicEventConstraint() {
    return adaptersFactory.createSporadicEventConstraintAdapter(timingconstraintsAdaptee.createSporadicEventConstraint(), null);
  }
  
  @Override
  public AgeTimingConstraint createAgeTimingConstraint() {
    return adaptersFactory.createAgeTimingConstraintAdapter(timingconstraintsAdaptee.createAgeTimingConstraint(), null);
  }
  
  @Override
  public InputSynchronizationConstraint createInputSynchronizationConstraint() {
    return adaptersFactory.createInputSynchronizationConstraintAdapter(timingconstraintsAdaptee.createInputSynchronizationConstraint(), null);
  }
  
  @Override
  public OutputSynchronizationConstraint createOutputSynchronizationConstraint() {
    return adaptersFactory.createOutputSynchronizationConstraintAdapter(timingconstraintsAdaptee.createOutputSynchronizationConstraint(), null);
  }
  
  @Override
  public ReactionConstraint createReactionConstraint() {
    return adaptersFactory.createReactionConstraintAdapter(timingconstraintsAdaptee.createReactionConstraint(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getTimingconstraintsPackage();
  }
  
  public TimingconstraintsPackage getTimingconstraintsPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.eINSTANCE;
  }
}
