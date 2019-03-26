package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realized;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedBy;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class _instancerefFactoryAdapter extends EFactoryImpl implements _instancerefFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefFactory _instancerefAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefFactory.eINSTANCE;
  
  @Override
  public Realization_realized createRealization_realized() {
    return adaptersFactory.createRealization_realizedAdapter(_instancerefAdaptee.createRealization_realized(), null);
  }
  
  @Override
  public Realization_realizedBy createRealization_realizedBy() {
    return adaptersFactory.createRealization_realizedByAdapter(_instancerefAdaptee.createRealization_realizedBy(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return get_instancerefPackage();
  }
  
  public _instancerefPackage get_instancerefPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefPackage.eINSTANCE;
  }
}
