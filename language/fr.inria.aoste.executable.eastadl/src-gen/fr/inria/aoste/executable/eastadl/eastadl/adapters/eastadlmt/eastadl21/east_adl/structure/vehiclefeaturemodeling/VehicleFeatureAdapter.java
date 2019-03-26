package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Relationship;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.BindingTime;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureTreeNode;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class VehicleFeatureAdapter extends EObjectAdapter<VehicleFeature> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public VehicleFeatureAdapter() {
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
  public String getCardinality() {
    return adaptee.getCardinality();
  }
  
  @Override
  public void setCardinality(final String o) {
    adaptee.setCardinality(o);
  }
  
  @Override
  public void unsetCardinality() {
    adaptee.unsetCardinality() ;
  }
  
  @Override
  public boolean isSetCardinality() {
    return adaptee.isSetCardinality() ;
  }
  
  @Override
  public Boolean getIsDesignVariabilityRationale() {
    return adaptee.getIsDesignVariabilityRationale();
  }
  
  @Override
  public void setIsDesignVariabilityRationale(final Boolean o) {
    adaptee.setIsDesignVariabilityRationale(o);
  }
  
  @Override
  public void unsetIsDesignVariabilityRationale() {
    adaptee.unsetIsDesignVariabilityRationale() ;
  }
  
  @Override
  public boolean isSetIsDesignVariabilityRationale() {
    return adaptee.isSetIsDesignVariabilityRationale() ;
  }
  
  @Override
  public Boolean getIsRemoved() {
    return adaptee.getIsRemoved();
  }
  
  @Override
  public void setIsRemoved(final Boolean o) {
    adaptee.setIsRemoved(o);
  }
  
  @Override
  public void unsetIsRemoved() {
    adaptee.unsetIsRemoved() ;
  }
  
  @Override
  public boolean isSetIsRemoved() {
    return adaptee.isSetIsRemoved() ;
  }
  
  @Override
  public Boolean getIsCustomerVisible() {
    return adaptee.getIsCustomerVisible();
  }
  
  @Override
  public void setIsCustomerVisible(final Boolean o) {
    adaptee.setIsCustomerVisible(o);
  }
  
  @Override
  public void unsetIsCustomerVisible() {
    adaptee.unsetIsCustomerVisible() ;
  }
  
  @Override
  public boolean isSetIsCustomerVisible() {
    return adaptee.isSetIsCustomerVisible() ;
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
  
  @Override
  public BindingTime getRequiredBindingTime() {
    return (BindingTime) adaptersFactory.createAdapter(adaptee.getRequiredBindingTime(), eResource);
  }
  
  @Override
  public void setRequiredBindingTime(final BindingTime o) {
    if (o != null)
    	adaptee.setRequiredBindingTime(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.BindingTimeAdapter) o).getAdaptee());
    else adaptee.setRequiredBindingTime(null);
  }
  
  @Override
  public BindingTime getActualBindingTime() {
    return (BindingTime) adaptersFactory.createAdapter(adaptee.getActualBindingTime(), eResource);
  }
  
  @Override
  public void setActualBindingTime(final BindingTime o) {
    if (o != null)
    	adaptee.setActualBindingTime(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.BindingTimeAdapter) o).getAdaptee());
    else adaptee.setActualBindingTime(null);
  }
  
  private EList<FeatureTreeNode> childNode_;
  
  @Override
  public EList<FeatureTreeNode> getChildNode() {
    if (childNode_ == null)
    	childNode_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getChildNode(), adaptersFactory, eResource);
    return childNode_;
  }
  
  @Override
  public EADatatypePrototype getFeatureParameter() {
    return (EADatatypePrototype) adaptersFactory.createAdapter(adaptee.getFeatureParameter(), eResource);
  }
  
  @Override
  public void setFeatureParameter(final EADatatypePrototype o) {
    if (o != null)
    	adaptee.setFeatureParameter(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototypeAdapter) o).getAdaptee());
    else adaptee.setFeatureParameter(null);
  }
  
  @Override
  public DeviationAttributeSet getDeviationAttributeSet() {
    return (DeviationAttributeSet) adaptersFactory.createAdapter(adaptee.getDeviationAttributeSet(), eResource);
  }
  
  @Override
  public void setDeviationAttributeSet(final DeviationAttributeSet o) {
    if (o != null)
    	adaptee.setDeviationAttributeSet(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSetAdapter) o).getAdaptee());
    else adaptee.setDeviationAttributeSet(null);
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static String CARDINALITY_EDEFAULT = "";
  
  protected final static Boolean IS_DESIGN_VARIABILITY_RATIONALE_EDEFAULT = java.lang.Boolean.FALSE;
  
  protected final static Boolean IS_REMOVED_EDEFAULT = java.lang.Boolean.FALSE;
  
  protected final static Boolean IS_CUSTOMER_VISIBLE_EDEFAULT = java.lang.Boolean.FALSE;
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.eINSTANCE.getVehicleFeature();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__TRACEABLE_SPECIFICATION:
    		return getTraceableSpecification();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__OWNED_RELATIONSHIP:
    		return getOwnedRelationship();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__CARDINALITY:
    		return getCardinality();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__REQUIRED_BINDING_TIME:
    		return getRequiredBindingTime();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__ACTUAL_BINDING_TIME:
    		return getActualBindingTime();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__CHILD_NODE:
    		return getChildNode();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__FEATURE_PARAMETER:
    		return getFeatureParameter();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_DESIGN_VARIABILITY_RATIONALE:
    		return getIsDesignVariabilityRationale();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_REMOVED:
    		return getIsRemoved();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_CUSTOMER_VISIBLE:
    		return getIsCustomerVisible();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET:
    		return getDeviationAttributeSet();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__CARDINALITY:
    		unsetCardinality();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_DESIGN_VARIABILITY_RATIONALE:
    		unsetIsDesignVariabilityRationale();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_REMOVED:
    		unsetIsRemoved();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_CUSTOMER_VISIBLE:
    		unsetIsCustomerVisible();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__TRACEABLE_SPECIFICATION:
    		return getTraceableSpecification() != null && !getTraceableSpecification().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__OWNED_RELATIONSHIP:
    		return getOwnedRelationship() != null && !getOwnedRelationship().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__CARDINALITY:
    		return isSetCardinality();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__REQUIRED_BINDING_TIME:
    		return getRequiredBindingTime() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__ACTUAL_BINDING_TIME:
    		return getActualBindingTime() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__CHILD_NODE:
    		return getChildNode() != null && !getChildNode().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__FEATURE_PARAMETER:
    		return getFeatureParameter() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_DESIGN_VARIABILITY_RATIONALE:
    		return isSetIsDesignVariabilityRationale();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_REMOVED:
    		return isSetIsRemoved();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_CUSTOMER_VISIBLE:
    		return isSetIsCustomerVisible();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET:
    		return getDeviationAttributeSet() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__GEA_PACKAGE_ELEMENT:
    		setGEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__EA_PACKAGE_ELEMENT:
    		setEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__TRACEABLE_SPECIFICATION:
    		getTraceableSpecification().clear();
    		getTraceableSpecification().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__OWNED_RELATIONSHIP:
    		getOwnedRelationship().clear();
    		getOwnedRelationship().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__CARDINALITY:
    		setCardinality(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__REQUIRED_BINDING_TIME:
    		setRequiredBindingTime(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.BindingTime)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__ACTUAL_BINDING_TIME:
    		setActualBindingTime(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.BindingTime)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__CHILD_NODE:
    		getChildNode().clear();
    		getChildNode().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__FEATURE_PARAMETER:
    		setFeatureParameter(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_DESIGN_VARIABILITY_RATIONALE:
    		setIsDesignVariabilityRationale(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_REMOVED:
    		setIsRemoved(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__IS_CUSTOMER_VISIBLE:
    		setIsCustomerVisible(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET:
    		setDeviationAttributeSet(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}