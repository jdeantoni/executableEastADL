package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.Actuator;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.CommunicationHardwarePin;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnector;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinGroup;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePin;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.Node;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.PowerHardwarePin;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.PowerSupply;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.Sensor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class HardwaremodelingFactoryAdapter extends EFactoryImpl implements HardwaremodelingFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingFactory hardwaremodelingAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingFactory.eINSTANCE;
  
  @Override
  public Actuator createActuator() {
    return adaptersFactory.createActuatorAdapter(hardwaremodelingAdaptee.createActuator(), null);
  }
  
  @Override
  public CommunicationHardwarePin createCommunicationHardwarePin() {
    return adaptersFactory.createCommunicationHardwarePinAdapter(hardwaremodelingAdaptee.createCommunicationHardwarePin(), null);
  }
  
  @Override
  public HardwareComponentPrototype createHardwareComponentPrototype() {
    return adaptersFactory.createHardwareComponentPrototypeAdapter(hardwaremodelingAdaptee.createHardwareComponentPrototype(), null);
  }
  
  @Override
  public HardwareComponentType createHardwareComponentType() {
    return adaptersFactory.createHardwareComponentTypeAdapter(hardwaremodelingAdaptee.createHardwareComponentType(), null);
  }
  
  @Override
  public HardwareConnector createHardwareConnector() {
    return adaptersFactory.createHardwareConnectorAdapter(hardwaremodelingAdaptee.createHardwareConnector(), null);
  }
  
  @Override
  public HardwarePinGroup createHardwarePinGroup() {
    return adaptersFactory.createHardwarePinGroupAdapter(hardwaremodelingAdaptee.createHardwarePinGroup(), null);
  }
  
  @Override
  public IOHardwarePin createIOHardwarePin() {
    return adaptersFactory.createIOHardwarePinAdapter(hardwaremodelingAdaptee.createIOHardwarePin(), null);
  }
  
  @Override
  public LogicalBus createLogicalBus() {
    return adaptersFactory.createLogicalBusAdapter(hardwaremodelingAdaptee.createLogicalBus(), null);
  }
  
  @Override
  public Node createNode() {
    return adaptersFactory.createNodeAdapter(hardwaremodelingAdaptee.createNode(), null);
  }
  
  @Override
  public PowerHardwarePin createPowerHardwarePin() {
    return adaptersFactory.createPowerHardwarePinAdapter(hardwaremodelingAdaptee.createPowerHardwarePin(), null);
  }
  
  @Override
  public PowerSupply createPowerSupply() {
    return adaptersFactory.createPowerSupplyAdapter(hardwaremodelingAdaptee.createPowerSupply(), null);
  }
  
  @Override
  public Sensor createSensor() {
    return adaptersFactory.createSensorAdapter(hardwaremodelingAdaptee.createSensor(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getHardwaremodelingPackage();
  }
  
  public HardwaremodelingPackage getHardwaremodelingPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.eINSTANCE;
  }
}
