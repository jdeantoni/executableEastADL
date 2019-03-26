package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElement;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_target;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionConnector_port;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class _instancerefFactoryAdapter extends EFactoryImpl implements _instancerefFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefFactory _instancerefAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefFactory.eINSTANCE;
  
  @Override
  public FunctionAllocation_allocatedElement createFunctionAllocation_allocatedElement() {
    return adaptersFactory.createFunctionAllocation_allocatedElementAdapter(_instancerefAdaptee.createFunctionAllocation_allocatedElement(), null);
  }
  
  @Override
  public FunctionAllocation_target createFunctionAllocation_target() {
    return adaptersFactory.createFunctionAllocation_targetAdapter(_instancerefAdaptee.createFunctionAllocation_target(), null);
  }
  
  @Override
  public FunctionConnector_port createFunctionConnector_port() {
    return adaptersFactory.createFunctionConnector_portAdapter(_instancerefAdaptee.createFunctionConnector_port(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return get_instancerefPackage();
  }
  
  public _instancerefPackage get_instancerefPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage.eINSTANCE;
  }
}
