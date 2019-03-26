package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class GelementsFactoryAdapter extends EFactoryImpl implements GelementsFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gelements.GelementsFactory gelementsAdaptee = fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gelements.GelementsFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getGelementsPackage();
  }
  
  public GelementsPackage getGelementsPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage.eINSTANCE;
  }
}
