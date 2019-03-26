package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructureFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class AbstractstructureFactoryAdapter extends EFactoryImpl implements AbstractstructureFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructureFactory abstractstructureAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructureFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getAbstractstructurePackage();
  }
  
  public AbstractstructurePackage getAbstractstructurePackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage.eINSTANCE;
  }
}
