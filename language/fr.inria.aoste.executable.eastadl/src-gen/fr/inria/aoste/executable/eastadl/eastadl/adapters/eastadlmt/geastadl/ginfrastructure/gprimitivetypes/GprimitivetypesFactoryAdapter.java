package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gprimitivetypes;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class GprimitivetypesFactoryAdapter extends EFactoryImpl implements GprimitivetypesFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesFactory gprimitivetypesAdaptee = fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getGprimitivetypesPackage();
  }
  
  public GprimitivetypesPackage getGprimitivetypesPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesPackage.eINSTANCE;
  }
}
