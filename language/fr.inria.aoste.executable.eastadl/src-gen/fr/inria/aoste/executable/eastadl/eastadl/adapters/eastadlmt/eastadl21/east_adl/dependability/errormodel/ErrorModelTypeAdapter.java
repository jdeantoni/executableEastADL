package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorBehavior;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FailureOutPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultInPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentType;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ErrorModelTypeAdapter extends EObjectAdapter<ErrorModelType> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelType {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public ErrorModelTypeAdapter() {
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
  public String getGenericDescription() {
    return adaptee.getGenericDescription();
  }
  
  @Override
  public void setGenericDescription(final String o) {
    adaptee.setGenericDescription(o);
  }
  
  @Override
  public void unsetGenericDescription() {
    adaptee.unsetGenericDescription() ;
  }
  
  @Override
  public boolean isSetGenericDescription() {
    return adaptee.isSetGenericDescription() ;
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
  
  private EList<ErrorBehavior> errorBehaviorDescription_;
  
  @Override
  public EList<ErrorBehavior> getErrorBehaviorDescription() {
    if (errorBehaviorDescription_ == null)
    	errorBehaviorDescription_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getErrorBehaviorDescription(), adaptersFactory, eResource);
    return errorBehaviorDescription_;
  }
  
  private EList<FunctionType> target_;
  
  @Override
  public EList<FunctionType> getTarget() {
    if (target_ == null)
    	target_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTarget(), adaptersFactory, eResource);
    return target_;
  }
  
  private EList<HardwareComponentType> hwTarget_;
  
  @Override
  public EList<HardwareComponentType> getHwTarget() {
    if (hwTarget_ == null)
    	hwTarget_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getHwTarget(), adaptersFactory, eResource);
    return hwTarget_;
  }
  
  private EList<FaultFailurePropagationLink> faultFailureConnector_;
  
  @Override
  public EList<FaultFailurePropagationLink> getFaultFailureConnector() {
    if (faultFailureConnector_ == null)
    	faultFailureConnector_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFaultFailureConnector(), adaptersFactory, eResource);
    return faultFailureConnector_;
  }
  
  private EList<FaultInPort> externalFault_;
  
  @Override
  public EList<FaultInPort> getExternalFault() {
    if (externalFault_ == null)
    	externalFault_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExternalFault(), adaptersFactory, eResource);
    return externalFault_;
  }
  
  private EList<ErrorModelPrototype> part_;
  
  @Override
  public EList<ErrorModelPrototype> getPart() {
    if (part_ == null)
    	part_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPart(), adaptersFactory, eResource);
    return part_;
  }
  
  private EList<FailureOutPort> failure_;
  
  @Override
  public EList<FailureOutPort> getFailure() {
    if (failure_ == null)
    	failure_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFailure(), adaptersFactory, eResource);
    return failure_;
  }
  
  private EList<InternalFaultPrototype> internalFault_;
  
  @Override
  public EList<InternalFaultPrototype> getInternalFault() {
    if (internalFault_ == null)
    	internalFault_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInternalFault(), adaptersFactory, eResource);
    return internalFault_;
  }
  
  private EList<ProcessFaultPrototype> processFault_;
  
  @Override
  public EList<ProcessFaultPrototype> getProcessFault() {
    if (processFault_ == null)
    	processFault_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProcessFault(), adaptersFactory, eResource);
    return processFault_;
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static String TEXT_EDEFAULT = "";
  
  protected final static String GENERIC_DESCRIPTION_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.eINSTANCE.getErrorModelType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__TEXT:
    		return getText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__GENERIC_DESCRIPTION:
    		return getGenericDescription();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION:
    		return getErrorBehaviorDescription();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__TARGET:
    		return getTarget();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__HW_TARGET:
    		return getHwTarget();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR:
    		return getFaultFailureConnector();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__EXTERNAL_FAULT:
    		return getExternalFault();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__PART:
    		return getPart();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__FAILURE:
    		return getFailure();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__INTERNAL_FAULT:
    		return getInternalFault();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__PROCESS_FAULT:
    		return getProcessFault();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__TEXT:
    		unsetText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__GENERIC_DESCRIPTION:
    		unsetGenericDescription();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__TEXT:
    		return isSetText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__GENERIC_DESCRIPTION:
    		return isSetGenericDescription();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION:
    		return getErrorBehaviorDescription() != null && !getErrorBehaviorDescription().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__TARGET:
    		return getTarget() != null && !getTarget().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__HW_TARGET:
    		return getHwTarget() != null && !getHwTarget().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR:
    		return getFaultFailureConnector() != null && !getFaultFailureConnector().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__EXTERNAL_FAULT:
    		return getExternalFault() != null && !getExternalFault().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__PART:
    		return getPart() != null && !getPart().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__FAILURE:
    		return getFailure() != null && !getFailure().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__INTERNAL_FAULT:
    		return getInternalFault() != null && !getInternalFault().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__PROCESS_FAULT:
    		return getProcessFault() != null && !getProcessFault().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__GEA_PACKAGE_ELEMENT:
    		setGEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__EA_PACKAGE_ELEMENT:
    		setEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__TEXT:
    		setText(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__GENERIC_DESCRIPTION:
    		setGenericDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION:
    		getErrorBehaviorDescription().clear();
    		getErrorBehaviorDescription().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__TARGET:
    		getTarget().clear();
    		getTarget().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__HW_TARGET:
    		getHwTarget().clear();
    		getHwTarget().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR:
    		getFaultFailureConnector().clear();
    		getFaultFailureConnector().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__EXTERNAL_FAULT:
    		getExternalFault().clear();
    		getExternalFault().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__PART:
    		getPart().clear();
    		getPart().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__FAILURE:
    		getFailure().clear();
    		getFailure().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__INTERNAL_FAULT:
    		getInternalFault().clear();
    		getInternalFault().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage.ERROR_MODEL_TYPE__PROCESS_FAULT:
    		getProcessFault().clear();
    		getProcessFault().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
