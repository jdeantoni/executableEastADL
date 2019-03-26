package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.GeneraltemplateclassesFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.GeneraltemplateclassesPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class GeneraltemplateclassesFactoryAdapter extends EFactoryImpl implements GeneraltemplateclassesFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.GeneraltemplateclassesFactory generaltemplateclassesAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.GeneraltemplateclassesFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getGeneraltemplateclassesPackage();
  }
  
  public GeneraltemplateclassesPackage getGeneraltemplateclassesPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.GeneraltemplateclassesPackage.eINSTANCE;
  }
}
