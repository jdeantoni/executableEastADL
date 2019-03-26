package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAXML;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.MultiLevelReference;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Rationale;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Realization;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class ElementsFactoryAdapter extends EFactoryImpl implements ElementsFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.ElementsFactory elementsAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.ElementsFactory.eINSTANCE;
  
  @Override
  public Comment createComment() {
    return adaptersFactory.createCommentAdapter(elementsAdaptee.createComment(), null);
  }
  
  @Override
  public EAPackage createEAPackage() {
    return adaptersFactory.createEAPackageAdapter(elementsAdaptee.createEAPackage(), null);
  }
  
  @Override
  public EAXML createEAXML() {
    return adaptersFactory.createEAXMLAdapter(elementsAdaptee.createEAXML(), null);
  }
  
  @Override
  public MultiLevelReference createMultiLevelReference() {
    return adaptersFactory.createMultiLevelReferenceAdapter(elementsAdaptee.createMultiLevelReference(), null);
  }
  
  @Override
  public Rationale createRationale() {
    return adaptersFactory.createRationaleAdapter(elementsAdaptee.createRationale(), null);
  }
  
  @Override
  public Realization createRealization() {
    return adaptersFactory.createRealizationAdapter(elementsAdaptee.createRealization(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getElementsPackage();
  }
  
  public ElementsPackage getElementsPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage.eINSTANCE;
  }
}
