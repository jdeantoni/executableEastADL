package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.AUTOSAR;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.AutosartoplevelstructureFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.AutosartoplevelstructurePackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class AutosartoplevelstructureFactoryAdapter extends EFactoryImpl implements AutosartoplevelstructureFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.autosartoplevelstructure.AutosartoplevelstructureFactory autosartoplevelstructureAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.autosartoplevelstructure.AutosartoplevelstructureFactory.eINSTANCE;
  
  @Override
  public AUTOSAR createAUTOSAR() {
    return adaptersFactory.createAUTOSARAdapter(autosartoplevelstructureAdaptee.createAUTOSAR(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getAutosartoplevelstructurePackage();
  }
  
  public AutosartoplevelstructurePackage getAutosartoplevelstructurePackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.AutosartoplevelstructurePackage.eINSTANCE;
  }
}
