package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.PowerSupply;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Relationship;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnector;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinGroup;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class PowerSupplyAdapter extends EObjectAdapter<PowerSupply> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.PowerSupply {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public PowerSupplyAdapter() {
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
  public Boolean getIsActive() {
    return adaptee.getIsActive();
  }
  
  @Override
  public void setIsActive(final Boolean o) {
    adaptee.setIsActive(o);
  }
  
  @Override
  public void unsetIsActive() {
    adaptee.unsetIsActive() ;
  }
  
  @Override
  public boolean isSetIsActive() {
    return adaptee.isSetIsActive() ;
  }
  
  private EList<Comment> ownedComment_;
  
  @Override
  public EList<Comment> getOwnedComment() {
    if (ownedComment_ == null)
    	ownedComment_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComment(), adaptersFactory, eResource);
    return ownedComment_;
  }
  
  @Override
  public GEAPackage getGEAPackage_element() {
    return (GEAPackage) adaptersFactory.createAdapter(adaptee.getGEAPackage_element(), eResource);
  }
  
  @Override
  public void setGEAPackage_element(final GEAPackage o) {
    if (o != null)
    	adaptee.setGEAPackage_element(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackageAdapter) o).getAdaptee());
    else adaptee.setGEAPackage_element(null);
  }
  
  @Override
  public EAPackage getEAPackage_element() {
    return (EAPackage) adaptersFactory.createAdapter(adaptee.getEAPackage_element(), eResource);
  }
  
  @Override
  public void setEAPackage_element(final EAPackage o) {
    if (o != null)
    	adaptee.setEAPackage_element(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageAdapter) o).getAdaptee());
    else adaptee.setEAPackage_element(null);
  }
  
  private EList<TraceableSpecification> traceableSpecification_;
  
  @Override
  public EList<TraceableSpecification> getTraceableSpecification() {
    if (traceableSpecification_ == null)
    	traceableSpecification_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTraceableSpecification(), adaptersFactory, eResource);
    return traceableSpecification_;
  }
  
  private EList<Relationship> ownedRelationship_;
  
  @Override
  public EList<Relationship> getOwnedRelationship() {
    if (ownedRelationship_ == null)
    	ownedRelationship_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedRelationship(), adaptersFactory, eResource);
    return ownedRelationship_;
  }
  
  private EList<HardwareConnector> connector_;
  
  @Override
  public EList<HardwareConnector> getConnector() {
    if (connector_ == null)
    	connector_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConnector(), adaptersFactory, eResource);
    return connector_;
  }
  
  private EList<HardwarePin> port_;
  
  @Override
  public EList<HardwarePin> getPort() {
    if (port_ == null)
    	port_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPort(), adaptersFactory, eResource);
    return port_;
  }
  
  private EList<HardwareComponentPrototype> part_;
  
  @Override
  public EList<HardwareComponentPrototype> getPart() {
    if (part_ == null)
    	part_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPart(), adaptersFactory, eResource);
    return part_;
  }
  
  private EList<HardwarePinGroup> portGroup_;
  
  @Override
  public EList<HardwarePinGroup> getPortGroup() {
    if (portGroup_ == null)
    	portGroup_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPortGroup(), adaptersFactory, eResource);
    return portGroup_;
  }
  
  private EList<LogicalBus> bus_;
  
  @Override
  public EList<LogicalBus> getBus() {
    if (bus_ == null)
    	bus_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getBus(), adaptersFactory, eResource);
    return bus_;
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static Boolean IS_ACTIVE_EDEFAULT = java.lang.Boolean.FALSE;
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.eINSTANCE.getPowerSupply();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__TRACEABLE_SPECIFICATION:
    		return getTraceableSpecification();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__OWNED_RELATIONSHIP:
    		return getOwnedRelationship();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__CONNECTOR:
    		return getConnector();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__PORT:
    		return getPort();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__PART:
    		return getPart();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__PORT_GROUP:
    		return getPortGroup();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__BUS:
    		return getBus();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__IS_ACTIVE:
    		return getIsActive();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__IS_ACTIVE:
    		unsetIsActive();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__TRACEABLE_SPECIFICATION:
    		return getTraceableSpecification() != null && !getTraceableSpecification().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__OWNED_RELATIONSHIP:
    		return getOwnedRelationship() != null && !getOwnedRelationship().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__CONNECTOR:
    		return getConnector() != null && !getConnector().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__PORT:
    		return getPort() != null && !getPort().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__PART:
    		return getPart() != null && !getPart().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__PORT_GROUP:
    		return getPortGroup() != null && !getPortGroup().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__BUS:
    		return getBus() != null && !getBus().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__IS_ACTIVE:
    		return isSetIsActive();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__GEA_PACKAGE_ELEMENT:
    		setGEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__EA_PACKAGE_ELEMENT:
    		setEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__TRACEABLE_SPECIFICATION:
    		getTraceableSpecification().clear();
    		getTraceableSpecification().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__OWNED_RELATIONSHIP:
    		getOwnedRelationship().clear();
    		getOwnedRelationship().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__CONNECTOR:
    		getConnector().clear();
    		getConnector().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__PORT:
    		getPort().clear();
    		getPort().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__PART:
    		getPart().clear();
    		getPart().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__PORT_GROUP:
    		getPortGroup().clear();
    		getPortGroup().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__BUS:
    		getBus().clear();
    		getBus().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage.POWER_SUPPLY__IS_ACTIVE:
    		setIsActive(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
