package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EABoolean;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAFloat;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAInteger;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAString;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.Enumeration;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationLiteral;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class DatatypesFactoryAdapter extends EFactoryImpl implements DatatypesFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.DatatypesFactory datatypesAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.DatatypesFactory.eINSTANCE;
  
  @Override
  public EnumerationValueType createEnumerationValueType() {
    return adaptersFactory.createEnumerationValueTypeAdapter(datatypesAdaptee.createEnumerationValueType(), null);
  }
  
  @Override
  public RangeableValueType createRangeableValueType() {
    return adaptersFactory.createRangeableValueTypeAdapter(datatypesAdaptee.createRangeableValueType(), null);
  }
  
  @Override
  public CompositeDatatype createCompositeDatatype() {
    return adaptersFactory.createCompositeDatatypeAdapter(datatypesAdaptee.createCompositeDatatype(), null);
  }
  
  @Override
  public EABoolean createEABoolean() {
    return adaptersFactory.createEABooleanAdapter(datatypesAdaptee.createEABoolean(), null);
  }
  
  @Override
  public EADatatypePrototype createEADatatypePrototype() {
    return adaptersFactory.createEADatatypePrototypeAdapter(datatypesAdaptee.createEADatatypePrototype(), null);
  }
  
  @Override
  public EAFloat createEAFloat() {
    return adaptersFactory.createEAFloatAdapter(datatypesAdaptee.createEAFloat(), null);
  }
  
  @Override
  public EAInteger createEAInteger() {
    return adaptersFactory.createEAIntegerAdapter(datatypesAdaptee.createEAInteger(), null);
  }
  
  @Override
  public EAString createEAString() {
    return adaptersFactory.createEAStringAdapter(datatypesAdaptee.createEAString(), null);
  }
  
  @Override
  public Enumeration createEnumeration() {
    return adaptersFactory.createEnumerationAdapter(datatypesAdaptee.createEnumeration(), null);
  }
  
  @Override
  public EnumerationLiteral createEnumerationLiteral() {
    return adaptersFactory.createEnumerationLiteralAdapter(datatypesAdaptee.createEnumerationLiteral(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getDatatypesPackage();
  }
  
  public DatatypesPackage getDatatypesPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.eINSTANCE;
  }
}
