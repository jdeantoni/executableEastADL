package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.Allocation;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.BasicSoftwareFunctionType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.DesignFunctionType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionAllocation;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerInterface;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortProxy;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionConnector;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxy;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortProxy;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionalDevice;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.HardwareFunctionType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.LocalDeviceManager;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.Operation;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.PortGroup;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class FunctionmodelingFactoryAdapter extends EFactoryImpl implements FunctionmodelingFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingFactory functionmodelingAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingFactory.eINSTANCE;
  
  @Override
  public Allocation createAllocation() {
    return adaptersFactory.createAllocationAdapter(functionmodelingAdaptee.createAllocation(), null);
  }
  
  @Override
  public AnalysisFunctionPrototype createAnalysisFunctionPrototype() {
    return adaptersFactory.createAnalysisFunctionPrototypeAdapter(functionmodelingAdaptee.createAnalysisFunctionPrototype(), null);
  }
  
  @Override
  public AnalysisFunctionType createAnalysisFunctionType() {
    return adaptersFactory.createAnalysisFunctionTypeAdapter(functionmodelingAdaptee.createAnalysisFunctionType(), null);
  }
  
  @Override
  public BasicSoftwareFunctionType createBasicSoftwareFunctionType() {
    return adaptersFactory.createBasicSoftwareFunctionTypeAdapter(functionmodelingAdaptee.createBasicSoftwareFunctionType(), null);
  }
  
  @Override
  public DesignFunctionPrototype createDesignFunctionPrototype() {
    return adaptersFactory.createDesignFunctionPrototypeAdapter(functionmodelingAdaptee.createDesignFunctionPrototype(), null);
  }
  
  @Override
  public DesignFunctionType createDesignFunctionType() {
    return adaptersFactory.createDesignFunctionTypeAdapter(functionmodelingAdaptee.createDesignFunctionType(), null);
  }
  
  @Override
  public FunctionalDevice createFunctionalDevice() {
    return adaptersFactory.createFunctionalDeviceAdapter(functionmodelingAdaptee.createFunctionalDevice(), null);
  }
  
  @Override
  public FunctionAllocation createFunctionAllocation() {
    return adaptersFactory.createFunctionAllocationAdapter(functionmodelingAdaptee.createFunctionAllocation(), null);
  }
  
  @Override
  public FunctionClientServerInterface createFunctionClientServerInterface() {
    return adaptersFactory.createFunctionClientServerInterfaceAdapter(functionmodelingAdaptee.createFunctionClientServerInterface(), null);
  }
  
  @Override
  public FunctionClientServerPort createFunctionClientServerPort() {
    return adaptersFactory.createFunctionClientServerPortAdapter(functionmodelingAdaptee.createFunctionClientServerPort(), null);
  }
  
  @Override
  public FunctionConnector createFunctionConnector() {
    return adaptersFactory.createFunctionConnectorAdapter(functionmodelingAdaptee.createFunctionConnector(), null);
  }
  
  @Override
  public FunctionFlowPort createFunctionFlowPort() {
    return adaptersFactory.createFunctionFlowPortAdapter(functionmodelingAdaptee.createFunctionFlowPort(), null);
  }
  
  @Override
  public FunctionPowerPort createFunctionPowerPort() {
    return adaptersFactory.createFunctionPowerPortAdapter(functionmodelingAdaptee.createFunctionPowerPort(), null);
  }
  
  @Override
  public HardwareFunctionType createHardwareFunctionType() {
    return adaptersFactory.createHardwareFunctionTypeAdapter(functionmodelingAdaptee.createHardwareFunctionType(), null);
  }
  
  @Override
  public LocalDeviceManager createLocalDeviceManager() {
    return adaptersFactory.createLocalDeviceManagerAdapter(functionmodelingAdaptee.createLocalDeviceManager(), null);
  }
  
  @Override
  public Operation createOperation() {
    return adaptersFactory.createOperationAdapter(functionmodelingAdaptee.createOperation(), null);
  }
  
  @Override
  public PortGroup createPortGroup() {
    return adaptersFactory.createPortGroupAdapter(functionmodelingAdaptee.createPortGroup(), null);
  }
  
  @Override
  public FunctionClientServerPortProxy createFunctionClientServerPortProxy() {
    return adaptersFactory.createFunctionClientServerPortProxyAdapter(functionmodelingAdaptee.createFunctionClientServerPortProxy(), null);
  }
  
  @Override
  public FunctionFlowPortProxy createFunctionFlowPortProxy() {
    return adaptersFactory.createFunctionFlowPortProxyAdapter(functionmodelingAdaptee.createFunctionFlowPortProxy(), null);
  }
  
  @Override
  public FunctionPowerPortProxy createFunctionPowerPortProxy() {
    return adaptersFactory.createFunctionPowerPortProxyAdapter(functionmodelingAdaptee.createFunctionPowerPortProxy(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getFunctionmodelingPackage();
  }
  
  public FunctionmodelingPackage getFunctionmodelingPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage.eINSTANCE;
  }
}
