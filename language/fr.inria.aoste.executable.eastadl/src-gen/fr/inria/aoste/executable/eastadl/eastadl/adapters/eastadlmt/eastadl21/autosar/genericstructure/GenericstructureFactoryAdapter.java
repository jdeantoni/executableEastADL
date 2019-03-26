package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.GenericstructureFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.GenericstructurePackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class GenericstructureFactoryAdapter extends EFactoryImpl implements GenericstructureFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.GenericstructureFactory genericstructureAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.GenericstructureFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getGenericstructurePackage();
  }
  
  public GenericstructurePackage getGenericstructurePackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.GenericstructurePackage.eINSTANCE;
  }
}
