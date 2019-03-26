package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventFunctionFlowPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class EventFunctionFlowPortAdapter extends EObjectAdapter<EventFunctionFlowPort> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionFlowPort {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public EventFunctionFlowPortAdapter() {
    super(fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getGShortName() {
    return adaptee.getGShortName();
  }
  
  @Override
  public void setGShortName(final String o) {
    adaptee.setGShortName(o);
  }
  
  @Override
  public void unsetGShortName() {
    adaptee.unsetGShortName() ;
  }
  
  @Override
  public boolean isSetGShortName() {
    return adaptee.isSetGShortName() ;
  }
  
  @Override
  public String getShortName() {
    return adaptee.getShortName();
  }
  
  @Override
  public void setShortName(final String o) {
    adaptee.setShortName(o);
  }
  
  @Override
  public void unsetShortName() {
    adaptee.unsetShortName() ;
  }
  
  @Override
  public boolean isSetShortName() {
    return adaptee.isSetShortName() ;
  }
  
  @Override
  public String getCategory() {
    return adaptee.getCategory();
  }
  
  @Override
  public void setCategory(final String o) {
    adaptee.setCategory(o);
  }
  
  @Override
  public void unsetCategory() {
    adaptee.unsetCategory() ;
  }
  
  @Override
  public boolean isSetCategory() {
    return adaptee.isSetCategory() ;
  }
  
  @Override
  public String getUuid() {
    return adaptee.getUuid();
  }
  
  @Override
  public void setUuid(final String o) {
    adaptee.setUuid(o);
  }
  
  @Override
  public void unsetUuid() {
    adaptee.unsetUuid() ;
  }
  
  @Override
  public boolean isSetUuid() {
    return adaptee.isSetUuid() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public void unsetName() {
    adaptee.unsetName() ;
  }
  
  @Override
  public boolean isSetName() {
    return adaptee.isSetName() ;
  }
  
  @Override
  public Boolean getIsStateChange() {
    return adaptee.getIsStateChange();
  }
  
  @Override
  public void setIsStateChange(final Boolean o) {
    adaptee.setIsStateChange(o);
  }
  
  @Override
  public void unsetIsStateChange() {
    adaptee.unsetIsStateChange() ;
  }
  
  @Override
  public boolean isSetIsStateChange() {
    return adaptee.isSetIsStateChange() ;
  }
  
  private EList<Comment> ownedComment_;
  
  @Override
  public EList<Comment> getOwnedComment() {
    if (ownedComment_ == null)
    	ownedComment_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComment(), adaptersFactory, eResource);
    return ownedComment_;
  }
  
  @Override
  public EventFunctionFlowPort_port getPort() {
    return (EventFunctionFlowPort_port) adaptersFactory.createAdapter(adaptee.getPort(), eResource);
  }
  
  @Override
  public void setPort(final EventFunctionFlowPort_port o) {
    if (o != null)
    	adaptee.setPort(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_portAdapter) o).getAdaptee());
    else adaptee.setPort(null);
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static Boolean IS_STATE_CHANGE_EDEFAULT = java.lang.Boolean.FALSE;
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.eINSTANCE.getEventFunctionFlowPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__IS_STATE_CHANGE:
    		return getIsStateChange();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__PORT:
    		return getPort();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__IS_STATE_CHANGE:
    		unsetIsStateChange();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__IS_STATE_CHANGE:
    		return isSetIsStateChange();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__PORT:
    		return getPort() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__IS_STATE_CHANGE:
    		setIsStateChange(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events.EventsPackage.EVENT_FUNCTION_FLOW_PORT__PORT:
    		setPort(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}