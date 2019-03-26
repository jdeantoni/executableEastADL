package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class VehiclefeaturemodelingFactoryAdapter extends EFactoryImpl implements VehiclefeaturemodelingFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingFactory vehiclefeaturemodelingAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingFactory.eINSTANCE;
  
  @Override
  public DeviationAttributeSet createDeviationAttributeSet() {
    return adaptersFactory.createDeviationAttributeSetAdapter(vehiclefeaturemodelingAdaptee.createDeviationAttributeSet(), null);
  }
  
  @Override
  public VehicleFeature createVehicleFeature() {
    return adaptersFactory.createVehicleFeatureAdapter(vehiclefeaturemodelingAdaptee.createVehicleFeature(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getVehiclefeaturemodelingPackage();
  }
  
  public VehiclefeaturemodelingPackage getVehiclefeaturemodelingPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.eINSTANCE;
  }
}
