package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.East_adlFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.East_adlPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class East_adlFactoryAdapter extends EFactoryImpl implements East_adlFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.East_adlFactory east_adlAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.East_adlFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getEast_adlPackage();
  }
  
  public East_adlPackage getEast_adlPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.East_adlPackage.eINSTANCE;
  }
}
