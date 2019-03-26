package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.Eastadl21Factory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.Eastadl21Package;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class Eastadl21FactoryAdapter extends EFactoryImpl implements Eastadl21Factory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.Eastadl21Factory eastadl21Adaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.Eastadl21Factory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getEastadl21Package();
  }
  
  public Eastadl21Package getEastadl21Package() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.Eastadl21Package.eINSTANCE;
  }
}
