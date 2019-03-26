package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.PrimitivetypesFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.PrimitivetypesPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class PrimitivetypesFactoryAdapter extends EFactoryImpl implements PrimitivetypesFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.PrimitivetypesFactory primitivetypesAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.PrimitivetypesFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getPrimitivetypesPackage();
  }
  
  public PrimitivetypesPackage getPrimitivetypesPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.PrimitivetypesPackage.eINSTANCE;
  }
}
