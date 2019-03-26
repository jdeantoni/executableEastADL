package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.systemtemplate;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplateFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class SystemtemplateFactoryAdapter extends EFactoryImpl implements SystemtemplateFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.systemtemplate.SystemtemplateFactory systemtemplateAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.systemtemplate.SystemtemplateFactory.eINSTANCE;
  
  @Override
  public fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.System createSystem() {
    return adaptersFactory.createSystemAdapter(systemtemplateAdaptee.createSystem(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getSystemtemplatePackage();
  }
  
  public SystemtemplatePackage getSystemtemplatePackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.systemtemplate.SystemtemplatePackage.eINSTANCE;
  }
}
