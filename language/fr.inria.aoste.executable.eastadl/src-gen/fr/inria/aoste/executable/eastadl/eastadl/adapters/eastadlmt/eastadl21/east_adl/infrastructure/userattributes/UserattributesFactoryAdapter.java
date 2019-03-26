package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class UserattributesFactoryAdapter extends EFactoryImpl implements UserattributesFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserattributesFactory userattributesAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserattributesFactory.eINSTANCE;
  
  @Override
  public UserAttributeableElement createUserAttributeableElement() {
    return adaptersFactory.createUserAttributeableElementAdapter(userattributesAdaptee.createUserAttributeableElement(), null);
  }
  
  @Override
  public UserAttributeDefinition createUserAttributeDefinition() {
    return adaptersFactory.createUserAttributeDefinitionAdapter(userattributesAdaptee.createUserAttributeDefinition(), null);
  }
  
  @Override
  public UserAttributeElementType createUserAttributeElementType() {
    return adaptersFactory.createUserAttributeElementTypeAdapter(userattributesAdaptee.createUserAttributeElementType(), null);
  }
  
  @Override
  public UserAttributeValue createUserAttributeValue() {
    return adaptersFactory.createUserAttributeValueAdapter(userattributesAdaptee.createUserAttributeValue(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getUserattributesPackage();
  }
  
  public UserattributesPackage getUserattributesPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.eINSTANCE;
  }
}
