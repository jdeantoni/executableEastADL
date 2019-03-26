package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.HazardousEvent;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.Mode;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ControllabilityClassKind;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ExposureClassKind;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Hazard;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.SeverityClassKind;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.ASILKind;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.OperationalSituation;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationship;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.usecases.UseCase;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class HazardousEventAdapter extends EObjectAdapter<HazardousEvent> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public HazardousEventAdapter() {
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
  public String getText() {
    return adaptee.getText();
  }
  
  @Override
  public void setText(final String o) {
    adaptee.setText(o);
  }
  
  @Override
  public void unsetText() {
    adaptee.unsetText() ;
  }
  
  @Override
  public boolean isSetText() {
    return adaptee.isSetText() ;
  }
  
  @Override
  public ControllabilityClassKind getControllability() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ControllabilityClassKind.get(adaptee.getControllability().getValue());
  }
  
  @Override
  public void setControllability(final ControllabilityClassKind o) {
    adaptee.setControllability(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.ControllabilityClassKind.get(o.getValue()));
  }
  
  @Override
  public void unsetControllability() {
    adaptee.unsetControllability() ;
  }
  
  @Override
  public boolean isSetControllability() {
    return adaptee.isSetControllability() ;
  }
  
  @Override
  public ExposureClassKind getExposure() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ExposureClassKind.get(adaptee.getExposure().getValue());
  }
  
  @Override
  public void setExposure(final ExposureClassKind o) {
    adaptee.setExposure(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.ExposureClassKind.get(o.getValue()));
  }
  
  @Override
  public void unsetExposure() {
    adaptee.unsetExposure() ;
  }
  
  @Override
  public boolean isSetExposure() {
    return adaptee.isSetExposure() ;
  }
  
  @Override
  public SeverityClassKind getSeverity() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.SeverityClassKind.get(adaptee.getSeverity().getValue());
  }
  
  @Override
  public void setSeverity(final SeverityClassKind o) {
    adaptee.setSeverity(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.SeverityClassKind.get(o.getValue()));
  }
  
  @Override
  public void unsetSeverity() {
    adaptee.unsetSeverity() ;
  }
  
  @Override
  public boolean isSetSeverity() {
    return adaptee.isSetSeverity() ;
  }
  
  @Override
  public ASILKind getHazardClassification() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.ASILKind.get(adaptee.getHazardClassification().getValue());
  }
  
  @Override
  public void setHazardClassification(final ASILKind o) {
    adaptee.setHazardClassification(fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.ASILKind.get(o.getValue()));
  }
  
  @Override
  public void unsetHazardClassification() {
    adaptee.unsetHazardClassification() ;
  }
  
  @Override
  public boolean isSetHazardClassification() {
    return adaptee.isSetHazardClassification() ;
  }
  
  @Override
  public String getClassificationAssumptions() {
    return adaptee.getClassificationAssumptions();
  }
  
  @Override
  public void setClassificationAssumptions(final String o) {
    adaptee.setClassificationAssumptions(o);
  }
  
  @Override
  public void unsetClassificationAssumptions() {
    adaptee.unsetClassificationAssumptions() ;
  }
  
  @Override
  public boolean isSetClassificationAssumptions() {
    return adaptee.isSetClassificationAssumptions() ;
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
  
  private EList<Mode> operatingMode_;
  
  @Override
  public EList<Mode> getOperatingMode() {
    if (operatingMode_ == null)
    	operatingMode_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOperatingMode(), adaptersFactory, eResource);
    return operatingMode_;
  }
  
  private EList<RequirementsRelationship> externalMeasures_;
  
  @Override
  public EList<RequirementsRelationship> getExternalMeasures() {
    if (externalMeasures_ == null)
    	externalMeasures_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExternalMeasures(), adaptersFactory, eResource);
    return externalMeasures_;
  }
  
  private EList<UseCase> operationalSituationUseCase_;
  
  @Override
  public EList<UseCase> getOperationalSituationUseCase() {
    if (operationalSituationUseCase_ == null)
    	operationalSituationUseCase_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOperationalSituationUseCase(), adaptersFactory, eResource);
    return operationalSituationUseCase_;
  }
  
  private EList<OperationalSituation> environment_;
  
  @Override
  public EList<OperationalSituation> getEnvironment() {
    if (environment_ == null)
    	environment_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEnvironment(), adaptersFactory, eResource);
    return environment_;
  }
  
  private EList<Hazard> hazard_;
  
  @Override
  public EList<Hazard> getHazard() {
    if (hazard_ == null)
    	hazard_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getHazard(), adaptersFactory, eResource);
    return hazard_;
  }
  
  private EList<OperationalSituation> traffic_;
  
  @Override
  public EList<OperationalSituation> getTraffic() {
    if (traffic_ == null)
    	traffic_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTraffic(), adaptersFactory, eResource);
    return traffic_;
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static String TEXT_EDEFAULT = "";
  
  protected final static ControllabilityClassKind CONTROLLABILITY_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ControllabilityClassKind.C0;
  
  protected final static ExposureClassKind EXPOSURE_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ExposureClassKind.E1;
  
  protected final static SeverityClassKind SEVERITY_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.SeverityClassKind.S0;
  
  protected final static ASILKind HAZARD_CLASSIFICATION_EDEFAULT = fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.ASILKind.ASIL_A;
  
  protected final static String CLASSIFICATION_ASSUMPTIONS_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.eINSTANCE.getHazardousEvent();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__TEXT:
    		return getText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__CONTROLLABILITY:
    		return getControllability();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__EXPOSURE:
    		return getExposure();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__SEVERITY:
    		return getSeverity();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__HAZARD_CLASSIFICATION:
    		return getHazardClassification();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS:
    		return getClassificationAssumptions();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__OPERATING_MODE:
    		return getOperatingMode();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__EXTERNAL_MEASURES:
    		return getExternalMeasures();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__OPERATIONAL_SITUATION_USE_CASE:
    		return getOperationalSituationUseCase();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__ENVIRONMENT:
    		return getEnvironment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__HAZARD:
    		return getHazard();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__TRAFFIC:
    		return getTraffic();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__TEXT:
    		unsetText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__CONTROLLABILITY:
    		unsetControllability();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__EXPOSURE:
    		unsetExposure();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__SEVERITY:
    		unsetSeverity();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__HAZARD_CLASSIFICATION:
    		unsetHazardClassification();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS:
    		unsetClassificationAssumptions();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__TEXT:
    		return isSetText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__CONTROLLABILITY:
    		return isSetControllability();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__EXPOSURE:
    		return isSetExposure();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__SEVERITY:
    		return isSetSeverity();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__HAZARD_CLASSIFICATION:
    		return isSetHazardClassification();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS:
    		return isSetClassificationAssumptions();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__OPERATING_MODE:
    		return getOperatingMode() != null && !getOperatingMode().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__EXTERNAL_MEASURES:
    		return getExternalMeasures() != null && !getExternalMeasures().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__OPERATIONAL_SITUATION_USE_CASE:
    		return getOperationalSituationUseCase() != null && !getOperationalSituationUseCase().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__ENVIRONMENT:
    		return getEnvironment() != null && !getEnvironment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__HAZARD:
    		return getHazard() != null && !getHazard().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__TRAFFIC:
    		return getTraffic() != null && !getTraffic().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__GEA_PACKAGE_ELEMENT:
    		setGEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__EA_PACKAGE_ELEMENT:
    		setEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__TEXT:
    		setText(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__CONTROLLABILITY:
    		setControllability(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ControllabilityClassKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__EXPOSURE:
    		setExposure(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.ExposureClassKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__SEVERITY:
    		setSeverity(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.SeverityClassKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__HAZARD_CLASSIFICATION:
    		setHazardClassification(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.ASILKind)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS:
    		setClassificationAssumptions(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__OPERATING_MODE:
    		getOperatingMode().clear();
    		getOperatingMode().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__EXTERNAL_MEASURES:
    		getExternalMeasures().clear();
    		getExternalMeasures().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__OPERATIONAL_SITUATION_USE_CASE:
    		getOperationalSituationUseCase().clear();
    		getOperationalSituationUseCase().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__ENVIRONMENT:
    		getEnvironment().clear();
    		getEnvironment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__HAZARD:
    		getHazard().clear();
    		getHazard().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.HAZARDOUS_EVENT__TRAFFIC:
    		getTraffic().clear();
    		getTraffic().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
