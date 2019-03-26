package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiableFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class IdentifiableFactoryAdapter extends EFactoryImpl implements IdentifiableFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiableFactory identifiableAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiableFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getIdentifiablePackage();
  }
  
  public IdentifiablePackage getIdentifiablePackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiablePackage.eINSTANCE;
  }
}
