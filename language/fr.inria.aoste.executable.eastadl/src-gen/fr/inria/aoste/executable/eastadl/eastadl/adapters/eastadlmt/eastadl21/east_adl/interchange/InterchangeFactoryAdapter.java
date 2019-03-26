package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.interchange.InterchangeFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.interchange.InterchangePackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.interchange.RIFExportArea;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.interchange.RIFImportArea;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class InterchangeFactoryAdapter extends EFactoryImpl implements InterchangeFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.interchange.InterchangeFactory interchangeAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.interchange.InterchangeFactory.eINSTANCE;
  
  @Override
  public RIFExportArea createRIFExportArea() {
    return adaptersFactory.createRIFExportAreaAdapter(interchangeAdaptee.createRIFExportArea(), null);
  }
  
  @Override
  public RIFImportArea createRIFImportArea() {
    return adaptersFactory.createRIFImportAreaAdapter(interchangeAdaptee.createRIFImportArea(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getInterchangePackage();
  }
  
  public InterchangePackage getInterchangePackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.interchange.InterchangePackage.eINSTANCE;
  }
}
