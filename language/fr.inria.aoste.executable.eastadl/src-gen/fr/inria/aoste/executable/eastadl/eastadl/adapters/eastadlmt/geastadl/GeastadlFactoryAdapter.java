package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class GeastadlFactoryAdapter extends EFactoryImpl implements fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.GeastadlFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.geastadl.GeastadlFactory geastadlAdaptee = fr.inria.aoste.executable.eastadl.eastadl.geastadl.GeastadlFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getGeastadlPackage();
  }
  
  public fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.GeastadlPackage getGeastadlPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.GeastadlPackage.eINSTANCE;
  }
}
