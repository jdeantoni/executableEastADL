package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class UserAttributeableElementAdapter extends EObjectAdapter<UserAttributeableElement> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public UserAttributeableElementAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  private EList<UserAttributeElementType> uaType_;
  
  @Override
  public EList<UserAttributeElementType> getUaType() {
    if (uaType_ == null)
    	uaType_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getUaType(), adaptersFactory, eResource);
    return uaType_;
  }
  
  private EList<UserAttributeValue> uaValue_;
  
  @Override
  public EList<UserAttributeValue> getUaValue() {
    if (uaValue_ == null)
    	uaValue_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getUaValue(), adaptersFactory, eResource);
    return uaValue_;
  }
  
  @Override
  public Identifiable getAttributedElement() {
    return (Identifiable) adaptersFactory.createAdapter(adaptee.getAttributedElement(), eResource);
  }
  
  @Override
  public void setAttributedElement(final Identifiable o) {
    if (o != null)
    	adaptee.setAttributedElement(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiableAdapter) o).getAdaptee());
    else adaptee.setAttributedElement(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.eINSTANCE.getUserAttributeableElement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_TYPE:
    		return getUaType();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_VALUE:
    		return getUaValue();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__ATTRIBUTED_ELEMENT:
    		return getAttributedElement();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_TYPE:
    		return getUaType() != null && !getUaType().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_VALUE:
    		return getUaValue() != null && !getUaValue().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__ATTRIBUTED_ELEMENT:
    		return getAttributedElement() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_TYPE:
    		getUaType().clear();
    		getUaType().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__UA_VALUE:
    		getUaValue().clear();
    		getUaValue().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserattributesPackage.USER_ATTRIBUTEABLE_ELEMENT__ATTRIBUTED_ELEMENT:
    		setAttributedElement(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
