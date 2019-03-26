package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.AutosarFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.AutosarPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class AutosarFactoryAdapter extends EFactoryImpl implements AutosarFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.AutosarFactory autosarAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.AutosarFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getAutosarPackage();
  }
  
  public AutosarPackage getAutosarPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.AutosarPackage.eINSTANCE;
  }
}
