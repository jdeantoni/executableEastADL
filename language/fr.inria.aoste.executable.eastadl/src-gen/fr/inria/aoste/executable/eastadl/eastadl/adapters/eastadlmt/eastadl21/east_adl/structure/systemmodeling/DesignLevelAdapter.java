package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.DesignLevel;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Relationship;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.Allocation;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class DesignLevelAdapter extends EObjectAdapter<DesignLevel> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.DesignLevel {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public DesignLevelAdapter() {
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
  
  private EList<Allocation> allocation_;
  
  @Override
  public EList<Allocation> getAllocation() {
    if (allocation_ == null)
    	allocation_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocation(), adaptersFactory, eResource);
    return allocation_;
  }
  
  @Override
  public DesignFunctionPrototype getFunctionalDesignArchitecture() {
    return (DesignFunctionPrototype) adaptersFactory.createAdapter(adaptee.getFunctionalDesignArchitecture(), eResource);
  }
  
  @Override
  public void setFunctionalDesignArchitecture(final DesignFunctionPrototype o) {
    if (o != null)
    	adaptee.setFunctionalDesignArchitecture(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototypeAdapter) o).getAdaptee());
    else adaptee.setFunctionalDesignArchitecture(null);
  }
  
  @Override
  public HardwareComponentPrototype getHardwareDesignArchitecture() {
    return (HardwareComponentPrototype) adaptersFactory.createAdapter(adaptee.getHardwareDesignArchitecture(), eResource);
  }
  
  @Override
  public void setHardwareDesignArchitecture(final HardwareComponentPrototype o) {
    if (o != null)
    	adaptee.setHardwareDesignArchitecture(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototypeAdapter) o).getAdaptee());
    else adaptee.setHardwareDesignArchitecture(null);
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.eINSTANCE.getDesignLevel();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__TRACEABLE_SPECIFICATION:
    		return getTraceableSpecification();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__OWNED_RELATIONSHIP:
    		return getOwnedRelationship();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__ALLOCATION:
    		return getAllocation();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE:
    		return getFunctionalDesignArchitecture();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE:
    		return getHardwareDesignArchitecture();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__NAME:
    		unsetName();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__TRACEABLE_SPECIFICATION:
    		return getTraceableSpecification() != null && !getTraceableSpecification().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__OWNED_RELATIONSHIP:
    		return getOwnedRelationship() != null && !getOwnedRelationship().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__ALLOCATION:
    		return getAllocation() != null && !getAllocation().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE:
    		return getFunctionalDesignArchitecture() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE:
    		return getHardwareDesignArchitecture() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__GEA_PACKAGE_ELEMENT:
    		setGEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__EA_PACKAGE_ELEMENT:
    		setEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__TRACEABLE_SPECIFICATION:
    		getTraceableSpecification().clear();
    		getTraceableSpecification().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__OWNED_RELATIONSHIP:
    		getOwnedRelationship().clear();
    		getOwnedRelationship().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__ALLOCATION:
    		getAllocation().clear();
    		getAllocation().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE:
    		setFunctionalDesignArchitecture(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototype)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage.DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE:
    		setHardwareDesignArchitecture(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
