package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_port;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class _instancerefFactoryAdapter extends EFactoryImpl implements _instancerefFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefFactory _instancerefAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefFactory.eINSTANCE;
  
  @Override
  public HardwareConnector_port createHardwareConnector_port() {
    return adaptersFactory.createHardwareConnector_portAdapter(_instancerefAdaptee.createHardwareConnector_port(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return get_instancerefPackage();
  }
  
  public _instancerefPackage get_instancerefPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage.eINSTANCE;
  }
}
