/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.Dependability;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.FeatureFlaw;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.Hazard;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.Item;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.SafetyCase;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyrequirement.FunctionalSafetyConcept;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyrequirement.TechnicalSafetyConcept;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.datatypes.EADatatype;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.DependabilityImpl#getFeatureFlaw <em>Feature Flaw</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.DependabilityImpl#getTechnicalSafetyConcept <em>Technical Safety Concept</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.DependabilityImpl#getSafetyCase <em>Safety Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.DependabilityImpl#getHazard <em>Hazard</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.DependabilityImpl#getFaultFailure <em>Fault Failure</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.DependabilityImpl#getEaDatatype <em>Ea Datatype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.DependabilityImpl#getHazardousEvent <em>Hazardous Event</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.DependabilityImpl#getSafetyConstraint <em>Safety Constraint</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.DependabilityImpl#getErrorModelType <em>Error Model Type</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.DependabilityImpl#getFunctionalSafetyConcept <em>Functional Safety Concept</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.DependabilityImpl#getQuantitiativeSafetyConstraint <em>Quantitiative Safety Constraint</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.DependabilityImpl#getItem <em>Item</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.DependabilityImpl#getSafetyGoal <em>Safety Goal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependabilityImpl extends ContextImpl implements Dependability {
	/**
	 * The cached value of the '{@link #getFeatureFlaw() <em>Feature Flaw</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureFlaw()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureFlaw> featureFlaw;

	/**
	 * The cached value of the '{@link #getTechnicalSafetyConcept() <em>Technical Safety Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalSafetyConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<TechnicalSafetyConcept> technicalSafetyConcept;

	/**
	 * The cached value of the '{@link #getSafetyCase() <em>Safety Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyCase()
	 * @generated
	 * @ordered
	 */
	protected EList<SafetyCase> safetyCase;

	/**
	 * The cached value of the '{@link #getHazard() <em>Hazard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazard()
	 * @generated
	 * @ordered
	 */
	protected EList<Hazard> hazard;

	/**
	 * The cached value of the '{@link #getFaultFailure() <em>Fault Failure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultFailure()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultFailure> faultFailure;

	/**
	 * The cached value of the '{@link #getEaDatatype() <em>Ea Datatype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaDatatype()
	 * @generated
	 * @ordered
	 */
	protected EList<EADatatype> eaDatatype;

	/**
	 * The cached value of the '{@link #getHazardousEvent() <em>Hazardous Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardousEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardousEvent> hazardousEvent;

	/**
	 * The cached value of the '{@link #getSafetyConstraint() <em>Safety Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<SafetyConstraint> safetyConstraint;

	/**
	 * The cached value of the '{@link #getErrorModelType() <em>Error Model Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelType()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModelType> errorModelType;

	/**
	 * The cached value of the '{@link #getFunctionalSafetyConcept() <em>Functional Safety Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalSafetyConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalSafetyConcept> functionalSafetyConcept;

	/**
	 * The cached value of the '{@link #getQuantitiativeSafetyConstraint() <em>Quantitiative Safety Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitiativeSafetyConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantitativeSafetyConstraint> quantitiativeSafetyConstraint;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> item;

	/**
	 * The cached value of the '{@link #getSafetyGoal() <em>Safety Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<SafetyGoal> safetyGoal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependabilityPackage.Literals.DEPENDABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureFlaw> getFeatureFlaw() {
		if (featureFlaw == null) {
			featureFlaw = new EObjectContainmentEList<FeatureFlaw>(FeatureFlaw.class, this, DependabilityPackage.DEPENDABILITY__FEATURE_FLAW);
		}
		return featureFlaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TechnicalSafetyConcept> getTechnicalSafetyConcept() {
		if (technicalSafetyConcept == null) {
			technicalSafetyConcept = new EObjectContainmentEList<TechnicalSafetyConcept>(TechnicalSafetyConcept.class, this, DependabilityPackage.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT);
		}
		return technicalSafetyConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SafetyCase> getSafetyCase() {
		if (safetyCase == null) {
			safetyCase = new EObjectContainmentEList<SafetyCase>(SafetyCase.class, this, DependabilityPackage.DEPENDABILITY__SAFETY_CASE);
		}
		return safetyCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hazard> getHazard() {
		if (hazard == null) {
			hazard = new EObjectContainmentEList<Hazard>(Hazard.class, this, DependabilityPackage.DEPENDABILITY__HAZARD);
		}
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FaultFailure> getFaultFailure() {
		if (faultFailure == null) {
			faultFailure = new EObjectContainmentEList<FaultFailure>(FaultFailure.class, this, DependabilityPackage.DEPENDABILITY__FAULT_FAILURE);
		}
		return faultFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EADatatype> getEaDatatype() {
		if (eaDatatype == null) {
			eaDatatype = new EObjectContainmentEList<EADatatype>(EADatatype.class, this, DependabilityPackage.DEPENDABILITY__EA_DATATYPE);
		}
		return eaDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardousEvent> getHazardousEvent() {
		if (hazardousEvent == null) {
			hazardousEvent = new EObjectContainmentEList<HazardousEvent>(HazardousEvent.class, this, DependabilityPackage.DEPENDABILITY__HAZARDOUS_EVENT);
		}
		return hazardousEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SafetyConstraint> getSafetyConstraint() {
		if (safetyConstraint == null) {
			safetyConstraint = new EObjectContainmentEList<SafetyConstraint>(SafetyConstraint.class, this, DependabilityPackage.DEPENDABILITY__SAFETY_CONSTRAINT);
		}
		return safetyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorModelType> getErrorModelType() {
		if (errorModelType == null) {
			errorModelType = new EObjectContainmentEList<ErrorModelType>(ErrorModelType.class, this, DependabilityPackage.DEPENDABILITY__ERROR_MODEL_TYPE);
		}
		return errorModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalSafetyConcept> getFunctionalSafetyConcept() {
		if (functionalSafetyConcept == null) {
			functionalSafetyConcept = new EObjectContainmentEList<FunctionalSafetyConcept>(FunctionalSafetyConcept.class, this, DependabilityPackage.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT);
		}
		return functionalSafetyConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuantitativeSafetyConstraint> getQuantitiativeSafetyConstraint() {
		if (quantitiativeSafetyConstraint == null) {
			quantitiativeSafetyConstraint = new EObjectContainmentEList<QuantitativeSafetyConstraint>(QuantitativeSafetyConstraint.class, this, DependabilityPackage.DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT);
		}
		return quantitiativeSafetyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<Item>(Item.class, this, DependabilityPackage.DEPENDABILITY__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SafetyGoal> getSafetyGoal() {
		if (safetyGoal == null) {
			safetyGoal = new EObjectContainmentEList<SafetyGoal>(SafetyGoal.class, this, DependabilityPackage.DEPENDABILITY__SAFETY_GOAL);
		}
		return safetyGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependabilityPackage.DEPENDABILITY__FEATURE_FLAW:
				return ((InternalEList<?>)getFeatureFlaw()).basicRemove(otherEnd, msgs);
			case DependabilityPackage.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT:
				return ((InternalEList<?>)getTechnicalSafetyConcept()).basicRemove(otherEnd, msgs);
			case DependabilityPackage.DEPENDABILITY__SAFETY_CASE:
				return ((InternalEList<?>)getSafetyCase()).basicRemove(otherEnd, msgs);
			case DependabilityPackage.DEPENDABILITY__HAZARD:
				return ((InternalEList<?>)getHazard()).basicRemove(otherEnd, msgs);
			case DependabilityPackage.DEPENDABILITY__FAULT_FAILURE:
				return ((InternalEList<?>)getFaultFailure()).basicRemove(otherEnd, msgs);
			case DependabilityPackage.DEPENDABILITY__EA_DATATYPE:
				return ((InternalEList<?>)getEaDatatype()).basicRemove(otherEnd, msgs);
			case DependabilityPackage.DEPENDABILITY__HAZARDOUS_EVENT:
				return ((InternalEList<?>)getHazardousEvent()).basicRemove(otherEnd, msgs);
			case DependabilityPackage.DEPENDABILITY__SAFETY_CONSTRAINT:
				return ((InternalEList<?>)getSafetyConstraint()).basicRemove(otherEnd, msgs);
			case DependabilityPackage.DEPENDABILITY__ERROR_MODEL_TYPE:
				return ((InternalEList<?>)getErrorModelType()).basicRemove(otherEnd, msgs);
			case DependabilityPackage.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT:
				return ((InternalEList<?>)getFunctionalSafetyConcept()).basicRemove(otherEnd, msgs);
			case DependabilityPackage.DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT:
				return ((InternalEList<?>)getQuantitiativeSafetyConstraint()).basicRemove(otherEnd, msgs);
			case DependabilityPackage.DEPENDABILITY__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case DependabilityPackage.DEPENDABILITY__SAFETY_GOAL:
				return ((InternalEList<?>)getSafetyGoal()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependabilityPackage.DEPENDABILITY__FEATURE_FLAW:
				return getFeatureFlaw();
			case DependabilityPackage.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT:
				return getTechnicalSafetyConcept();
			case DependabilityPackage.DEPENDABILITY__SAFETY_CASE:
				return getSafetyCase();
			case DependabilityPackage.DEPENDABILITY__HAZARD:
				return getHazard();
			case DependabilityPackage.DEPENDABILITY__FAULT_FAILURE:
				return getFaultFailure();
			case DependabilityPackage.DEPENDABILITY__EA_DATATYPE:
				return getEaDatatype();
			case DependabilityPackage.DEPENDABILITY__HAZARDOUS_EVENT:
				return getHazardousEvent();
			case DependabilityPackage.DEPENDABILITY__SAFETY_CONSTRAINT:
				return getSafetyConstraint();
			case DependabilityPackage.DEPENDABILITY__ERROR_MODEL_TYPE:
				return getErrorModelType();
			case DependabilityPackage.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT:
				return getFunctionalSafetyConcept();
			case DependabilityPackage.DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT:
				return getQuantitiativeSafetyConstraint();
			case DependabilityPackage.DEPENDABILITY__ITEM:
				return getItem();
			case DependabilityPackage.DEPENDABILITY__SAFETY_GOAL:
				return getSafetyGoal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DependabilityPackage.DEPENDABILITY__FEATURE_FLAW:
				getFeatureFlaw().clear();
				getFeatureFlaw().addAll((Collection<? extends FeatureFlaw>)newValue);
				return;
			case DependabilityPackage.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT:
				getTechnicalSafetyConcept().clear();
				getTechnicalSafetyConcept().addAll((Collection<? extends TechnicalSafetyConcept>)newValue);
				return;
			case DependabilityPackage.DEPENDABILITY__SAFETY_CASE:
				getSafetyCase().clear();
				getSafetyCase().addAll((Collection<? extends SafetyCase>)newValue);
				return;
			case DependabilityPackage.DEPENDABILITY__HAZARD:
				getHazard().clear();
				getHazard().addAll((Collection<? extends Hazard>)newValue);
				return;
			case DependabilityPackage.DEPENDABILITY__FAULT_FAILURE:
				getFaultFailure().clear();
				getFaultFailure().addAll((Collection<? extends FaultFailure>)newValue);
				return;
			case DependabilityPackage.DEPENDABILITY__EA_DATATYPE:
				getEaDatatype().clear();
				getEaDatatype().addAll((Collection<? extends EADatatype>)newValue);
				return;
			case DependabilityPackage.DEPENDABILITY__HAZARDOUS_EVENT:
				getHazardousEvent().clear();
				getHazardousEvent().addAll((Collection<? extends HazardousEvent>)newValue);
				return;
			case DependabilityPackage.DEPENDABILITY__SAFETY_CONSTRAINT:
				getSafetyConstraint().clear();
				getSafetyConstraint().addAll((Collection<? extends SafetyConstraint>)newValue);
				return;
			case DependabilityPackage.DEPENDABILITY__ERROR_MODEL_TYPE:
				getErrorModelType().clear();
				getErrorModelType().addAll((Collection<? extends ErrorModelType>)newValue);
				return;
			case DependabilityPackage.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT:
				getFunctionalSafetyConcept().clear();
				getFunctionalSafetyConcept().addAll((Collection<? extends FunctionalSafetyConcept>)newValue);
				return;
			case DependabilityPackage.DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT:
				getQuantitiativeSafetyConstraint().clear();
				getQuantitiativeSafetyConstraint().addAll((Collection<? extends QuantitativeSafetyConstraint>)newValue);
				return;
			case DependabilityPackage.DEPENDABILITY__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends Item>)newValue);
				return;
			case DependabilityPackage.DEPENDABILITY__SAFETY_GOAL:
				getSafetyGoal().clear();
				getSafetyGoal().addAll((Collection<? extends SafetyGoal>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DependabilityPackage.DEPENDABILITY__FEATURE_FLAW:
				getFeatureFlaw().clear();
				return;
			case DependabilityPackage.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT:
				getTechnicalSafetyConcept().clear();
				return;
			case DependabilityPackage.DEPENDABILITY__SAFETY_CASE:
				getSafetyCase().clear();
				return;
			case DependabilityPackage.DEPENDABILITY__HAZARD:
				getHazard().clear();
				return;
			case DependabilityPackage.DEPENDABILITY__FAULT_FAILURE:
				getFaultFailure().clear();
				return;
			case DependabilityPackage.DEPENDABILITY__EA_DATATYPE:
				getEaDatatype().clear();
				return;
			case DependabilityPackage.DEPENDABILITY__HAZARDOUS_EVENT:
				getHazardousEvent().clear();
				return;
			case DependabilityPackage.DEPENDABILITY__SAFETY_CONSTRAINT:
				getSafetyConstraint().clear();
				return;
			case DependabilityPackage.DEPENDABILITY__ERROR_MODEL_TYPE:
				getErrorModelType().clear();
				return;
			case DependabilityPackage.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT:
				getFunctionalSafetyConcept().clear();
				return;
			case DependabilityPackage.DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT:
				getQuantitiativeSafetyConstraint().clear();
				return;
			case DependabilityPackage.DEPENDABILITY__ITEM:
				getItem().clear();
				return;
			case DependabilityPackage.DEPENDABILITY__SAFETY_GOAL:
				getSafetyGoal().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DependabilityPackage.DEPENDABILITY__FEATURE_FLAW:
				return featureFlaw != null && !featureFlaw.isEmpty();
			case DependabilityPackage.DEPENDABILITY__TECHNICAL_SAFETY_CONCEPT:
				return technicalSafetyConcept != null && !technicalSafetyConcept.isEmpty();
			case DependabilityPackage.DEPENDABILITY__SAFETY_CASE:
				return safetyCase != null && !safetyCase.isEmpty();
			case DependabilityPackage.DEPENDABILITY__HAZARD:
				return hazard != null && !hazard.isEmpty();
			case DependabilityPackage.DEPENDABILITY__FAULT_FAILURE:
				return faultFailure != null && !faultFailure.isEmpty();
			case DependabilityPackage.DEPENDABILITY__EA_DATATYPE:
				return eaDatatype != null && !eaDatatype.isEmpty();
			case DependabilityPackage.DEPENDABILITY__HAZARDOUS_EVENT:
				return hazardousEvent != null && !hazardousEvent.isEmpty();
			case DependabilityPackage.DEPENDABILITY__SAFETY_CONSTRAINT:
				return safetyConstraint != null && !safetyConstraint.isEmpty();
			case DependabilityPackage.DEPENDABILITY__ERROR_MODEL_TYPE:
				return errorModelType != null && !errorModelType.isEmpty();
			case DependabilityPackage.DEPENDABILITY__FUNCTIONAL_SAFETY_CONCEPT:
				return functionalSafetyConcept != null && !functionalSafetyConcept.isEmpty();
			case DependabilityPackage.DEPENDABILITY__QUANTITIATIVE_SAFETY_CONSTRAINT:
				return quantitiativeSafetyConstraint != null && !quantitiativeSafetyConstraint.isEmpty();
			case DependabilityPackage.DEPENDABILITY__ITEM:
				return item != null && !item.isEmpty();
			case DependabilityPackage.DEPENDABILITY__SAFETY_GOAL:
				return safetyGoal != null && !safetyGoal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DependabilityImpl
