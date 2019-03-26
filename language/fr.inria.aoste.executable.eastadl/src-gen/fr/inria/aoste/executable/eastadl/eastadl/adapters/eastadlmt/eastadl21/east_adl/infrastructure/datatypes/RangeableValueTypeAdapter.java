package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.RangeableDatatype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class RangeableValueTypeAdapter extends EObjectAdapter<RangeableValueType> implements fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType {
  private EastADLMTAdaptersFactory adaptersFactory;
  
  public RangeableValueTypeAdapter() {
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
  public String getDimension() {
    return adaptee.getDimension();
  }
  
  @Override
  public void setDimension(final String o) {
    adaptee.setDimension(o);
  }
  
  @Override
  public void unsetDimension() {
    adaptee.unsetDimension() ;
  }
  
  @Override
  public boolean isSetDimension() {
    return adaptee.isSetDimension() ;
  }
  
  @Override
  public String getUnit() {
    return adaptee.getUnit();
  }
  
  @Override
  public void setUnit(final String o) {
    adaptee.setUnit(o);
  }
  
  @Override
  public void unsetUnit() {
    adaptee.unsetUnit() ;
  }
  
  @Override
  public boolean isSetUnit() {
    return adaptee.isSetUnit() ;
  }
  
  @Override
  public String getSemantics() {
    return adaptee.getSemantics();
  }
  
  @Override
  public void setSemantics(final String o) {
    adaptee.setSemantics(o);
  }
  
  @Override
  public void unsetSemantics() {
    adaptee.unsetSemantics() ;
  }
  
  @Override
  public boolean isSetSemantics() {
    return adaptee.isSetSemantics() ;
  }
  
  @Override
  public Double getAccuracy() {
    return adaptee.getAccuracy();
  }
  
  @Override
  public void setAccuracy(final Double o) {
    adaptee.setAccuracy(o);
  }
  
  @Override
  public void unsetAccuracy() {
    adaptee.unsetAccuracy() ;
  }
  
  @Override
  public boolean isSetAccuracy() {
    return adaptee.isSetAccuracy() ;
  }
  
  @Override
  public Double getResolution() {
    return adaptee.getResolution();
  }
  
  @Override
  public void setResolution(final Double o) {
    adaptee.setResolution(o);
  }
  
  @Override
  public void unsetResolution() {
    adaptee.unsetResolution() ;
  }
  
  @Override
  public boolean isSetResolution() {
    return adaptee.isSetResolution() ;
  }
  
  @Override
  public Integer getSignificantDigits() {
    return adaptee.getSignificantDigits();
  }
  
  @Override
  public void setSignificantDigits(final Integer o) {
    adaptee.setSignificantDigits(o);
  }
  
  @Override
  public void unsetSignificantDigits() {
    adaptee.unsetSignificantDigits() ;
  }
  
  @Override
  public boolean isSetSignificantDigits() {
    return adaptee.isSetSignificantDigits() ;
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
  
  @Override
  public RangeableDatatype getBaseRangeable() {
    return (RangeableDatatype) adaptersFactory.createAdapter(adaptee.getBaseRangeable(), eResource);
  }
  
  @Override
  public void setBaseRangeable(final RangeableDatatype o) {
    if (o != null)
    	adaptee.setBaseRangeable(((fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.RangeableDatatypeAdapter) o).getAdaptee());
    else adaptee.setBaseRangeable(null);
  }
  
  protected final static String GSHORT_NAME_EDEFAULT = null;
  
  protected final static String SHORT_NAME_EDEFAULT = "";
  
  protected final static String CATEGORY_EDEFAULT = "";
  
  protected final static String UUID_EDEFAULT = "";
  
  protected final static String NAME_EDEFAULT = "";
  
  protected final static String TEXT_EDEFAULT = "";
  
  protected final static String DIMENSION_EDEFAULT = "";
  
  protected final static String UNIT_EDEFAULT = "";
  
  protected final static String SEMANTICS_EDEFAULT = "";
  
  protected final static Double ACCURACY_EDEFAULT = new Double(0.0);
  
  protected final static Double RESOLUTION_EDEFAULT = new Double(0.0);
  
  protected final static Integer SIGNIFICANT_DIGITS_EDEFAULT = new Integer(0);
  
  @Override
  public EClass eClass() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.eINSTANCE.getRangeableValueType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__GSHORT_NAME:
    		return getGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__SHORT_NAME:
    		return getShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__CATEGORY:
    		return getCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__UUID:
    		return getUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__NAME:
    		return getName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__OWNED_COMMENT:
    		return getOwnedComment();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__TEXT:
    		return getText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__DIMENSION:
    		return getDimension();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__UNIT:
    		return getUnit();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__SEMANTICS:
    		return getSemantics();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__ACCURACY:
    		return getAccuracy();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__RESOLUTION:
    		return getResolution();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS:
    		return getSignificantDigits();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__BASE_RANGEABLE:
    		return getBaseRangeable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__GSHORT_NAME:
    		unsetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__SHORT_NAME:
    		unsetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__CATEGORY:
    		unsetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__UUID:
    		unsetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__NAME:
    		unsetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__TEXT:
    		unsetText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__DIMENSION:
    		unsetDimension();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__UNIT:
    		unsetUnit();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__SEMANTICS:
    		unsetSemantics();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__ACCURACY:
    		unsetAccuracy();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__RESOLUTION:
    		unsetResolution();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS:
    		unsetSignificantDigits();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__GSHORT_NAME:
    		return isSetGShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__SHORT_NAME:
    		return isSetShortName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__CATEGORY:
    		return isSetCategory();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__UUID:
    		return isSetUuid();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__NAME:
    		return isSetName();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__OWNED_COMMENT:
    		return getOwnedComment() != null && !getOwnedComment().isEmpty();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__GEA_PACKAGE_ELEMENT:
    		return getGEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__EA_PACKAGE_ELEMENT:
    		return getEAPackage_element() != null;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__TEXT:
    		return isSetText();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__DIMENSION:
    		return isSetDimension();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__UNIT:
    		return isSetUnit();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__SEMANTICS:
    		return isSetSemantics();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__ACCURACY:
    		return isSetAccuracy();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__RESOLUTION:
    		return isSetResolution();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS:
    		return isSetSignificantDigits();
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__BASE_RANGEABLE:
    		return getBaseRangeable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__GSHORT_NAME:
    		setGShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__SHORT_NAME:
    		setShortName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__CATEGORY:
    		setCategory(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__UUID:
    		setUuid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__OWNED_COMMENT:
    		getOwnedComment().clear();
    		getOwnedComment().addAll((Collection) newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__GEA_PACKAGE_ELEMENT:
    		setGEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__EA_PACKAGE_ELEMENT:
    		setEAPackage_element(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__TEXT:
    		setText(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__DIMENSION:
    		setDimension(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__UNIT:
    		setUnit(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__SEMANTICS:
    		setSemantics(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__ACCURACY:
    		setAccuracy(
    		(java.lang.Double)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__RESOLUTION:
    		setResolution(
    		(java.lang.Double)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS:
    		setSignificantDigits(
    		(java.lang.Integer)
    		 newValue);
    		return;
    	case fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage.RANGEABLE_VALUE_TYPE__BASE_RANGEABLE:
    		setBaseRangeable(
    		(fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.RangeableDatatype)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
