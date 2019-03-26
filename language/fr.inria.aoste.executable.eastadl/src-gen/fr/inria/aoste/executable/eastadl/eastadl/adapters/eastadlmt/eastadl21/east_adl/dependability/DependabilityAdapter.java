package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.Dependability;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.FeatureFlaw;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Hazard;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Item;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCase;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.FunctionalSafetyConcept;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.TechnicalSafetyConcept;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EADatatype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Relationship;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class DependabilityAdapter extends EObjectAdapter<Dependability> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.Dependability {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public DependabilityAdapter() {
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
  
  private EList<FeatureFlaw> featureFlaw_;
  
  @Override
  public EList<FeatureFlaw> getFeatureFlaw() {
    if (featureFlaw_ == null)
    	featureFlaw_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFeatureFlaw(), adaptersFactory, eResource);
    return featureFlaw_;
  }
  
  private EList<TechnicalSafetyConcept> technicalSafetyConcept_;
  
  @Override
  public EList<TechnicalSafetyConcept> getTechnicalSafetyConcept() {
    if (technicalSafetyConcept_ == null)
    	technicalSafetyConcept_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTechnicalSafetyConcept(), adaptersFactory, eResource);
    return technicalSafetyConcept_;
  }
  
  private EList<SafetyCase> safetyCase_;
  
  @Override
  public EList<SafetyCase> getSafetyCase() {
    if (safetyCase_ == null)
    	safetyCase_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSafetyCase(), adaptersFactory, eResource);
    return safetyCase_;
  }
  
  private EList<Hazard> hazard_;
  
  @Override
  public EList<Hazard> getHazard() {
    if (hazard_ == null)
    	hazard_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getHazard(), adaptersFactory, eResource);
    return hazard_;
  }
  
  private EList<FaultFailure> faultFailure_;
  
  @Override
  public EList<FaultFailure> getFaultFailure() {
    if (faultFailure_ == null)
    	faultFailure_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFaultFailure(), adaptersFactory, eResource);
    return faultFailure_;
  }
  
  private EList<EADatatype> eaDatatype_;
  
  @Override
  public EList<EADatatype> getEaDatatype() {
    if (eaDatatype_ == null)
    	eaDatatype_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEaDatatype(), adaptersFactory, eResource);
    return eaDatatype_;
  }
  
  private EList<HazardousEvent> hazardousEvent_;
  
  @Override
  public EList<HazardousEvent> getHazardousEvent() {
    if (hazardousEvent_ == null)
    	hazardousEvent_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getHazardousEvent(), adaptersFactory, eResource);
    return hazardousEvent_;
  }
  
  private EList<SafetyConstraint> safetyConstraint_;
  
  @Override
  public EList<SafetyConstraint> getSafetyConstraint() {
    if (safetyConstraint_ == null)
    	safetyConstraint_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSafetyConstraint(), adaptersFactory, eResource);
    return safetyConstraint_;
  }
  
  private EList<ErrorModelType> errorModelType_;
  
  @Override
  public EList<ErrorModelType> getErrorModelType() {
    if (errorModelType_ == null)
    	errorModelType_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getErrorModelType(), adaptersFactory, eResource);
    return errorModelType_;
  }
  
  private EList<FunctionalSafetyConcept> functionalSafetyConcept_;
  
  @Override
  public EList<FunctionalSafetyConcept> getFunctionalSafetyConcept() {
    if (functionalSafetyConcept_ == null)
    	functionalSafetyConcept_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFunctionalSafetyConcept(), adaptersFactory, eResource);
    return functionalSafetyConcept_;
  }
  
  private EList<QuantitativeSafetyConstraint> quantitiativeSafetyConstraint_;
  
  @Override
  public EList<QuantitativeSafetyConstraint> getQuantitiativeSafetyConstraint() {
    if (quantitiativeSafetyConstraint_ == null)
    	quantitiativeSafetyConstraint_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getQuantitiativeSafetyConstraint(), adaptersFactory, eResource);
    return quantitiativeSafetyConstraint_;
  }
  
  private EList<Item> item_;
  
  @Override
  public EList<Item> getItem() {
    if (item_ == null)
    	item_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getItem(), adaptersFactory, eResource);
    return item_;
  }
  
  private EList<SafetyGoal> safetyGoal_;
  
  @Override
  public EList<SafetyGoal> getSafetyGoal() {
    if (safetyGoal_ == null)
    	safetyGoal_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSafetyGoal(), adaptersFactory, eResource);
    return safetyGoal_;
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.eINSTANCE.getDependability();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__TRACEABLE_SPECIFICATION:
    		return getTraceableSpecification();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__OWNED_RELATIONSHIP:
    		return getOwnedRelationship();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__FEATURE_FLAW:
    		return getFeatureFlaw();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT:
    		return getTechnicalSafetyConcept();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__SAFETY_CASE:
    		return getSafetyCase();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__HAZARD:
    		return getHazard();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__FAULT_FAILURE:
    		return getFaultFailure();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__EA_DATATYPE:
    		return getEaDatatype();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__HAZARDOUS_EVENT:
    		return getHazardousEvent();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__SAFETY_CONSTRAINT:
    		return getSafetyConstraint();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__ERROR_MODEL_TYPE:
    		return getErrorModelType();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT:
    		return getFunctionalSafetyConcept();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT:
    		return getQuantitiativeSafetyConstraint();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__ITEM:
    		return getItem();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__SAFETY_GOAL:
    		return getSafetyGoal();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__NAME:
    		unsetName();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__TRACEABLE_SPECIFICATION:
    		return getTraceableSpecification() != null && !getTraceableSpecification().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__OWNED_RELATIONSHIP:
    		return getOwnedRelationship() != null && !getOwnedRelationship().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__FEATURE_FLAW:
    		return getFeatureFlaw() != null && !getFeatureFlaw().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT:
    		return getTechnicalSafetyConcept() != null && !getTechnicalSafetyConcept().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__SAFETY_CASE:
    		return getSafetyCase() != null && !getSafetyCase().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__HAZARD:
    		return getHazard() != null && !getHazard().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__FAULT_FAILURE:
    		return getFaultFailure() != null && !getFaultFailure().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__EA_DATATYPE:
    		return getEaDatatype() != null && !getEaDatatype().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__HAZARDOUS_EVENT:
    		return getHazardousEvent() != null && !getHazardousEvent().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__SAFETY_CONSTRAINT:
    		return getSafetyConstraint() != null && !getSafetyConstraint().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__ERROR_MODEL_TYPE:
    		return getErrorModelType() != null && !getErrorModelType().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT:
    		return getFunctionalSafetyConcept() != null && !getFunctionalSafetyConcept().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT:
    		return getQuantitiativeSafetyConstraint() != null && !getQuantitiativeSafetyConstraint().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__ITEM:
    		return getItem() != null && !getItem().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__SAFETY_GOAL:
    		return getSafetyGoal() != null && !getSafetyGoal().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__GEA_PACKAGE_ELEMENT:
    		setGEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__EA_PACKAGE_ELEMENT:
    		setEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__TRACEABLE_SPECIFICATION:
    		getTraceableSpecification().clear();
    		getTraceableSpecification().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__OWNED_RELATIONSHIP:
    		getOwnedRelationship().clear();
    		getOwnedRelationship().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__FEATURE_FLAW:
    		getFeatureFlaw().clear();
    		getFeatureFlaw().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT:
    		getTechnicalSafetyConcept().clear();
    		getTechnicalSafetyConcept().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__SAFETY_CASE:
    		getSafetyCase().clear();
    		getSafetyCase().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__HAZARD:
    		getHazard().clear();
    		getHazard().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__FAULT_FAILURE:
    		getFaultFailure().clear();
    		getFaultFailure().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__EA_DATATYPE:
    		getEaDatatype().clear();
    		getEaDatatype().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__HAZARDOUS_EVENT:
    		getHazardousEvent().clear();
    		getHazardousEvent().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__SAFETY_CONSTRAINT:
    		getSafetyConstraint().clear();
    		getSafetyConstraint().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__ERROR_MODEL_TYPE:
    		getErrorModelType().clear();
    		getErrorModelType().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT:
    		getFunctionalSafetyConcept().clear();
    		getFunctionalSafetyConcept().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT:
    		getQuantitiativeSafetyConstraint().clear();
    		getQuantitiativeSafetyConstraint().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__ITEM:
    		getItem().clear();
    		getItem().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.DependabilityPackage.DEPENDABILITY__SAFETY_GOAL:
    		getSafetyGoal().clear();
    		getSafetyGoal().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
