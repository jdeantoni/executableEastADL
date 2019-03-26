package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.VehicleSystem;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.Architecture;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.Mission;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.Stakeholder;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class VehicleSystemAdapter extends EObjectAdapter<VehicleSystem> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.VehicleSystem {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public VehicleSystemAdapter() {
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
  
  private EList<Stakeholder> has_;
  
  @Override
  public EList<Stakeholder> getHas() {
    if (has_ == null)
    	has_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getHas(), adaptersFactory, eResource);
    return has_;
  }
  
  @Override
  public Architecture getHasAn() {
    return (Architecture) adaptersFactory.createAdapter(adaptee.getHasAn(), eResource);
  }
  
  @Override
  public void setHasAn(final Architecture o) {
    if (o != null)
    	adaptee.setHasAn(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitectureAdapter) o).getAdaptee());
    else adaptee.setHasAn(null);
  }
  
  private EList<Mission> fulfills_;
  
  @Override
  public EList<Mission> getFulfills() {
    if (fulfills_ == null)
    	fulfills_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFulfills(), adaptersFactory, eResource);
    return fulfills_;
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.eINSTANCE.getVehicleSystem();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__HAS:
    		return getHas();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__HAS_AN:
    		return getHasAn();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__FULFILLS:
    		return getFulfills();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__NAME:
    		unsetName();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__HAS:
    		return getHas() != null && !getHas().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__HAS_AN:
    		return getHasAn() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__FULFILLS:
    		return getFulfills() != null && !getFulfills().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__HAS:
    		getHas().clear();
    		getHas().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__HAS_AN:
    		setHasAn(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.Architecture)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage.VEHICLE_SYSTEM__FULFILLS:
    		getFulfills().clear();
    		getFulfills().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
