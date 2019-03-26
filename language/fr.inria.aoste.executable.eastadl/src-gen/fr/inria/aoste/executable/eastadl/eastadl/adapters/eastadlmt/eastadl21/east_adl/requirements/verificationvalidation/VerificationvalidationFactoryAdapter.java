package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCase;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcome;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVLog;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVStimuli;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVTarget;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.Verify;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class VerificationvalidationFactoryAdapter extends EFactoryImpl implements VerificationvalidationFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationFactory verificationvalidationAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationFactory.eINSTANCE;
  
  @Override
  public VerificationValidation createVerificationValidation() {
    return adaptersFactory.createVerificationValidationAdapter(verificationvalidationAdaptee.createVerificationValidation(), null);
  }
  
  @Override
  public VVActualOutcome createVVActualOutcome() {
    return adaptersFactory.createVVActualOutcomeAdapter(verificationvalidationAdaptee.createVVActualOutcome(), null);
  }
  
  @Override
  public VVIntendedOutcome createVVIntendedOutcome() {
    return adaptersFactory.createVVIntendedOutcomeAdapter(verificationvalidationAdaptee.createVVIntendedOutcome(), null);
  }
  
  @Override
  public VVLog createVVLog() {
    return adaptersFactory.createVVLogAdapter(verificationvalidationAdaptee.createVVLog(), null);
  }
  
  @Override
  public VVProcedure createVVProcedure() {
    return adaptersFactory.createVVProcedureAdapter(verificationvalidationAdaptee.createVVProcedure(), null);
  }
  
  @Override
  public VVStimuli createVVStimuli() {
    return adaptersFactory.createVVStimuliAdapter(verificationvalidationAdaptee.createVVStimuli(), null);
  }
  
  @Override
  public VVTarget createVVTarget() {
    return adaptersFactory.createVVTargetAdapter(verificationvalidationAdaptee.createVVTarget(), null);
  }
  
  @Override
  public Verify createVerify() {
    return adaptersFactory.createVerifyAdapter(verificationvalidationAdaptee.createVerify(), null);
  }
  
  @Override
  public VVCase createVVCase() {
    return adaptersFactory.createVVCaseAdapter(verificationvalidationAdaptee.createVVCase(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getVerificationvalidationPackage();
  }
  
  public VerificationvalidationPackage getVerificationvalidationPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage.eINSTANCE;
  }
}
