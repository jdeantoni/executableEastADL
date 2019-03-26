package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Claim;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Ground;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycaseFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.Warrant;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class SafetycaseFactoryAdapter extends EFactoryImpl implements SafetycaseFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.SafetycaseFactory safetycaseAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.SafetycaseFactory.eINSTANCE;
  
  @Override
  public Claim createClaim() {
    return adaptersFactory.createClaimAdapter(safetycaseAdaptee.createClaim(), null);
  }
  
  @Override
  public Ground createGround() {
    return adaptersFactory.createGroundAdapter(safetycaseAdaptee.createGround(), null);
  }
  
  @Override
  public SafetyCase createSafetyCase() {
    return adaptersFactory.createSafetyCaseAdapter(safetycaseAdaptee.createSafetyCase(), null);
  }
  
  @Override
  public Warrant createWarrant() {
    return adaptersFactory.createWarrantAdapter(safetycaseAdaptee.createWarrant(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getSafetycasePackage();
  }
  
  public SafetycasePackage getSafetycasePackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage.eINSTANCE;
  }
}
