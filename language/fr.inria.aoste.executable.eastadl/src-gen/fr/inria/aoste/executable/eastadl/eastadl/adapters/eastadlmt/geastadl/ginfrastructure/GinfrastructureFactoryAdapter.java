package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.GinfrastructureFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.GinfrastructurePackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.trickEMFgenerator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class GinfrastructureFactoryAdapter extends EFactoryImpl implements GinfrastructureFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.GinfrastructureFactory ginfrastructureAdaptee = fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.GinfrastructureFactory.eINSTANCE;
  
  @Override
  public trickEMFgenerator createtrickEMFgenerator() {
    return adaptersFactory.createtrickEMFgeneratorAdapter(ginfrastructureAdaptee.createtrickEMFgenerator(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getGinfrastructurePackage();
  }
  
  public GinfrastructurePackage getGinfrastructurePackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.GinfrastructurePackage.eINSTANCE;
  }
}
