package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.InputSynchronizationConstraint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.Mode;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.EventChain;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimeDuration;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class InputSynchronizationConstraintAdapter extends EObjectAdapter<InputSynchronizationConstraint> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.InputSynchronizationConstraint {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public InputSynchronizationConstraintAdapter() {
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
  public TimeDuration getLower() {
    return (TimeDuration) adaptersFactory.createAdapter(adaptee.getLower(), eResource);
  }
  
  @Override
  public void setLower(final TimeDuration o) {
    if (o != null)
    	adaptee.setLower(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimeDurationAdapter) o).getAdaptee());
    else adaptee.setLower(null);
  }
  
  @Override
  public TimeDuration getUpper() {
    return (TimeDuration) adaptersFactory.createAdapter(adaptee.getUpper(), eResource);
  }
  
  @Override
  public void setUpper(final TimeDuration o) {
    if (o != null)
    	adaptee.setUpper(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimeDurationAdapter) o).getAdaptee());
    else adaptee.setUpper(null);
  }
  
  private EList<Mode> mode_;
  
  @Override
  public EList<Mode> getMode() {
    if (mode_ == null)
    	mode_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMode(), adaptersFactory, eResource);
    return mode_;
  }
  
  @Override
  public TimeDuration getJitter() {
    return (TimeDuration) adaptersFactory.createAdapter(adaptee.getJitter(), eResource);
  }
  
  @Override
  public void setJitter(final TimeDuration o) {
    if (o != null)
    	adaptee.setJitter(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimeDurationAdapter) o).getAdaptee());
    else adaptee.setJitter(null);
  }
  
  @Override
  public TimeDuration getNominal() {
    return (TimeDuration) adaptersFactory.createAdapter(adaptee.getNominal(), eResource);
  }
  
  @Override
  public void setNominal(final TimeDuration o) {
    if (o != null)
    	adaptee.setNominal(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimeDurationAdapter) o).getAdaptee());
    else adaptee.setNominal(null);
  }
  
  @Override
  public EventChain getScope() {
    return (EventChain) adaptersFactory.createAdapter(adaptee.getScope(), eResource);
  }
  
  @Override
  public void setScope(final EventChain o) {
    if (o != null)
    	adaptee.setScope(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.EventChainAdapter) o).getAdaptee());
    else adaptee.setScope(null);
  }
  
  @Override
  public TimeDuration getWidth() {
    return (TimeDuration) adaptersFactory.createAdapter(adaptee.getWidth(), eResource);
  }
  
  @Override
  public void setWidth(final TimeDuration o) {
    if (o != null)
    	adaptee.setWidth(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimeDurationAdapter) o).getAdaptee());
    else adaptee.setWidth(null);
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.eINSTANCE.getInputSynchronizationConstraint();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__LOWER:
    		return getLower();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__UPPER:
    		return getUpper();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__MODE:
    		return getMode();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__JITTER:
    		return getJitter();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__NOMINAL:
    		return getNominal();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__SCOPE:
    		return getScope();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH:
    		return getWidth();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__NAME:
    		unsetName();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__LOWER:
    		return getLower() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__UPPER:
    		return getUpper() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__MODE:
    		return getMode() != null && !getMode().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__JITTER:
    		return getJitter() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__NOMINAL:
    		return getNominal() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__SCOPE:
    		return getScope() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH:
    		return getWidth() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__LOWER:
    		setLower(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimeDuration)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__UPPER:
    		setUpper(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimeDuration)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__MODE:
    		getMode().clear();
    		getMode().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__JITTER:
    		setJitter(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimeDuration)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__NOMINAL:
    		setNominal(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimeDuration)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__SCOPE:
    		setScope(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.EventChain)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH:
    		setWidth(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing.TimeDuration)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
