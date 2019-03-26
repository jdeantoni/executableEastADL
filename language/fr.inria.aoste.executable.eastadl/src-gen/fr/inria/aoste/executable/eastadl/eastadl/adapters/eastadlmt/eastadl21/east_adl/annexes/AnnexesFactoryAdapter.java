package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.AnnexesFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.AnnexesPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class AnnexesFactoryAdapter extends EFactoryImpl implements AnnexesFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.AnnexesFactory annexesAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.AnnexesFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getAnnexesPackage();
  }
  
  public AnnexesPackage getAnnexesPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.AnnexesPackage.eINSTANCE;
  }
}
