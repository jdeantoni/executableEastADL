package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class DeviationAttributeSetAdapter extends EObjectAdapter<DeviationAttributeSet> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public DeviationAttributeSetAdapter() {
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
  public DeviationPermissionKind getAllowChangeAttribute() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(adaptee.getAllowChangeAttribute().getValue());
  }
  
  @Override
  public void setAllowChangeAttribute(final DeviationPermissionKind o) {
    adaptee.setAllowChangeAttribute(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(o.getValue()));
  }
  
  @Override
  public void unsetAllowChangeAttribute() {
    adaptee.unsetAllowChangeAttribute() ;
  }
  
  @Override
  public boolean isSetAllowChangeAttribute() {
    return adaptee.isSetAllowChangeAttribute() ;
  }
  
  @Override
  public DeviationPermissionKind getAllowChangeCardinality() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(adaptee.getAllowChangeCardinality().getValue());
  }
  
  @Override
  public void setAllowChangeCardinality(final DeviationPermissionKind o) {
    adaptee.setAllowChangeCardinality(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(o.getValue()));
  }
  
  @Override
  public void unsetAllowChangeCardinality() {
    adaptee.unsetAllowChangeCardinality() ;
  }
  
  @Override
  public boolean isSetAllowChangeCardinality() {
    return adaptee.isSetAllowChangeCardinality() ;
  }
  
  @Override
  public DeviationPermissionKind getAllowChangeDescription() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(adaptee.getAllowChangeDescription().getValue());
  }
  
  @Override
  public void setAllowChangeDescription(final DeviationPermissionKind o) {
    adaptee.setAllowChangeDescription(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(o.getValue()));
  }
  
  @Override
  public void unsetAllowChangeDescription() {
    adaptee.unsetAllowChangeDescription() ;
  }
  
  @Override
  public boolean isSetAllowChangeDescription() {
    return adaptee.isSetAllowChangeDescription() ;
  }
  
  @Override
  public DeviationPermissionKind getAllowChangeName() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(adaptee.getAllowChangeName().getValue());
  }
  
  @Override
  public void setAllowChangeName(final DeviationPermissionKind o) {
    adaptee.setAllowChangeName(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(o.getValue()));
  }
  
  @Override
  public void unsetAllowChangeName() {
    adaptee.unsetAllowChangeName() ;
  }
  
  @Override
  public boolean isSetAllowChangeName() {
    return adaptee.isSetAllowChangeName() ;
  }
  
  @Override
  public DeviationPermissionKind getAllowMove() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(adaptee.getAllowMove().getValue());
  }
  
  @Override
  public void setAllowMove(final DeviationPermissionKind o) {
    adaptee.setAllowMove(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(o.getValue()));
  }
  
  @Override
  public void unsetAllowMove() {
    adaptee.unsetAllowMove() ;
  }
  
  @Override
  public boolean isSetAllowMove() {
    return adaptee.isSetAllowMove() ;
  }
  
  @Override
  public DeviationPermissionKind getAllowReduction() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(adaptee.getAllowReduction().getValue());
  }
  
  @Override
  public void setAllowReduction(final DeviationPermissionKind o) {
    adaptee.setAllowReduction(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(o.getValue()));
  }
  
  @Override
  public void unsetAllowReduction() {
    adaptee.unsetAllowReduction() ;
  }
  
  @Override
  public boolean isSetAllowReduction() {
    return adaptee.isSetAllowReduction() ;
  }
  
  @Override
  public DeviationPermissionKind getAllowRefinement() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(adaptee.getAllowRefinement().getValue());
  }
  
  @Override
  public void setAllowRefinement(final DeviationPermissionKind o) {
    adaptee.setAllowRefinement(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(o.getValue()));
  }
  
  @Override
  public void unsetAllowRefinement() {
    adaptee.unsetAllowRefinement() ;
  }
  
  @Override
  public boolean isSetAllowRefinement() {
    return adaptee.isSetAllowRefinement() ;
  }
  
  @Override
  public DeviationPermissionKind getAllowRegrouping() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(adaptee.getAllowRegrouping().getValue());
  }
  
  @Override
  public void setAllowRegrouping(final DeviationPermissionKind o) {
    adaptee.setAllowRegrouping(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(o.getValue()));
  }
  
  @Override
  public void unsetAllowRegrouping() {
    adaptee.unsetAllowRegrouping() ;
  }
  
  @Override
  public boolean isSetAllowRegrouping() {
    return adaptee.isSetAllowRegrouping() ;
  }
  
  @Override
  public DeviationPermissionKind getAllowRemoval() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(adaptee.getAllowRemoval().getValue());
  }
  
  @Override
  public void setAllowRemoval(final DeviationPermissionKind o) {
    adaptee.setAllowRemoval(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.get(o.getValue()));
  }
  
  @Override
  public void unsetAllowRemoval() {
    adaptee.unsetAllowRemoval() ;
  }
  
  @Override
  public boolean isSetAllowRemoval() {
    return adaptee.isSetAllowRemoval() ;
  }
  
  private EList<Comment> ownedComment_;
  
  @Override
  public EList<Comment> getOwnedComment() {
    if (ownedComment_ == null)
    	ownedComment_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComment(), adaptersFactory, eResource);
    return ownedComment_;
  }
  
  @Override
  public VehicleFeature getFeature() {
    return (VehicleFeature) adaptersFactory.createAdapter(adaptee.getFeature(), eResource);
  }
  
  @Override
  public void setFeature(final VehicleFeature o) {
    if (o != null)
    	adaptee.setFeature(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeatureAdapter) o).getAdaptee());
    else adaptee.setFeature(null);
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static DeviationPermissionKind ALLOW_CHANGE_ATTRIBUTE_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.NO;
  
  protected final static DeviationPermissionKind ALLOW_CHANGE_CARDINALITY_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.NO;
  
  protected final static DeviationPermissionKind ALLOW_CHANGE_DESCRIPTION_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.NO;
  
  protected final static DeviationPermissionKind ALLOW_CHANGE_NAME_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.NO;
  
  protected final static DeviationPermissionKind ALLOW_MOVE_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.NO;
  
  protected final static DeviationPermissionKind ALLOW_REDUCTION_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.NO;
  
  protected final static DeviationPermissionKind ALLOW_REFINEMENT_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.NO;
  
  protected final static DeviationPermissionKind ALLOW_REGROUPING_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.NO;
  
  protected final static DeviationPermissionKind ALLOW_REMOVAL_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind.NO;
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.eINSTANCE.getDeviationAttributeSet();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE:
    		return getAllowChangeAttribute();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY:
    		return getAllowChangeCardinality();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION:
    		return getAllowChangeDescription();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME:
    		return getAllowChangeName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE:
    		return getAllowMove();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION:
    		return getAllowReduction();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT:
    		return getAllowRefinement();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING:
    		return getAllowRegrouping();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL:
    		return getAllowRemoval();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE:
    		return getFeature();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE:
    		unsetAllowChangeAttribute();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY:
    		unsetAllowChangeCardinality();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION:
    		unsetAllowChangeDescription();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME:
    		unsetAllowChangeName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE:
    		unsetAllowMove();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION:
    		unsetAllowReduction();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT:
    		unsetAllowRefinement();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING:
    		unsetAllowRegrouping();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL:
    		unsetAllowRemoval();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE:
    		return isSetAllowChangeAttribute();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY:
    		return isSetAllowChangeCardinality();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION:
    		return isSetAllowChangeDescription();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME:
    		return isSetAllowChangeName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE:
    		return isSetAllowMove();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION:
    		return isSetAllowReduction();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT:
    		return isSetAllowRefinement();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING:
    		return isSetAllowRegrouping();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL:
    		return isSetAllowRemoval();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE:
    		return getFeature() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE:
    		setAllowChangeAttribute(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY:
    		setAllowChangeCardinality(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION:
    		setAllowChangeDescription(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME:
    		setAllowChangeName(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE:
    		setAllowMove(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION:
    		setAllowReduction(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT:
    		setAllowRefinement(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING:
    		setAllowRegrouping(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL:
    		setAllowRemoval(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE:
    		setFeature(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
