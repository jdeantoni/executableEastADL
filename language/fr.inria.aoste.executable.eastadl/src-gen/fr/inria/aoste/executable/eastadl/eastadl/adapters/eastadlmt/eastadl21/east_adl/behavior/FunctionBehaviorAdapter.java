package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.FunctionBehavior;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionBehaviorKind;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.Mode;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Relationship;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionType;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FunctionBehaviorAdapter extends EObjectAdapter<FunctionBehavior> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionBehavior {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public FunctionBehaviorAdapter() {
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
  public String getPath() {
    return adaptee.getPath();
  }
  
  @Override
  public void setPath(final String o) {
    adaptee.setPath(o);
  }
  
  @Override
  public void unsetPath() {
    adaptee.unsetPath() ;
  }
  
  @Override
  public boolean isSetPath() {
    return adaptee.isSetPath() ;
  }
  
  @Override
  public FunctionBehaviorKind getRepresentation() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionBehaviorKind.get(adaptee.getRepresentation().getValue());
  }
  
  @Override
  public void setRepresentation(final FunctionBehaviorKind o) {
    adaptee.setRepresentation(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.FunctionBehaviorKind.get(o.getValue()));
  }
  
  @Override
  public void unsetRepresentation() {
    adaptee.unsetRepresentation() ;
  }
  
  @Override
  public boolean isSetRepresentation() {
    return adaptee.isSetRepresentation() ;
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
  
  private EList<Mode> mode_;
  
  @Override
  public EList<Mode> getMode() {
    if (mode_ == null)
    	mode_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMode(), adaptersFactory, eResource);
    return mode_;
  }
  
  @Override
  public FunctionType getFunction() {
    return (FunctionType) adaptersFactory.createAdapter(adaptee.getFunction(), eResource);
  }
  
  @Override
  public void setFunction(final FunctionType o) {
    if (o != null)
    	adaptee.setFunction(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionTypeAdapter) o).getAdaptee());
    else adaptee.setFunction(null);
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static String PATH_EDEFAULT = "";
  
  protected final static FunctionBehaviorKind REPRESENTATION_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionBehaviorKind.SCILAB;
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.eINSTANCE.getFunctionBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__TRACEABLE_SPECIFICATION:
    		return getTraceableSpecification();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__OWNED_RELATIONSHIP:
    		return getOwnedRelationship();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__PATH:
    		return getPath();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__REPRESENTATION:
    		return getRepresentation();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__MODE:
    		return getMode();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__FUNCTION:
    		return getFunction();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__PATH:
    		unsetPath();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__REPRESENTATION:
    		unsetRepresentation();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__TRACEABLE_SPECIFICATION:
    		return getTraceableSpecification() != null && !getTraceableSpecification().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__OWNED_RELATIONSHIP:
    		return getOwnedRelationship() != null && !getOwnedRelationship().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__PATH:
    		return isSetPath();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__REPRESENTATION:
    		return isSetRepresentation();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__MODE:
    		return getMode() != null && !getMode().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__FUNCTION:
    		return getFunction() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__GEA_PACKAGE_ELEMENT:
    		setGEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__EA_PACKAGE_ELEMENT:
    		setEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__TRACEABLE_SPECIFICATION:
    		getTraceableSpecification().clear();
    		getTraceableSpecification().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__OWNED_RELATIONSHIP:
    		getOwnedRelationship().clear();
    		getOwnedRelationship().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__PATH:
    		setPath(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__REPRESENTATION:
    		setRepresentation(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionBehaviorKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__MODE:
    		getMode().clear();
    		getMode().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage.FUNCTION_BEHAVIOR__FUNCTION:
    		setFunction(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}