/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.Mode;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.ControllabilityClassKind;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.ExposureClassKind;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.Hazard;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.SeverityClassKind;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.ASILKind;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.OperationalSituation;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsRelationship;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.usecases.UseCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazardous Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.HazardousEventImpl#getControllability <em>Controllability</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.HazardousEventImpl#getExposure <em>Exposure</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.HazardousEventImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.HazardousEventImpl#getHazardClassification <em>Hazard Classification</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.HazardousEventImpl#getClassificationAssumptions <em>Classification Assumptions</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.HazardousEventImpl#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.HazardousEventImpl#getExternalMeasures <em>External Measures</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.HazardousEventImpl#getOperationalSituationUseCase <em>Operational Situation Use Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.HazardousEventImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.HazardousEventImpl#getHazard <em>Hazard</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.impl.HazardousEventImpl#getTraffic <em>Traffic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardousEventImpl extends TraceableSpecificationImpl implements HazardousEvent {
	/**
	 * The default value of the '{@link #getControllability() <em>Controllability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllability()
	 * @generated
	 * @ordered
	 */
	protected static final ControllabilityClassKind CONTROLLABILITY_EDEFAULT = ControllabilityClassKind.C0;

	/**
	 * The cached value of the '{@link #getControllability() <em>Controllability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllability()
	 * @generated
	 * @ordered
	 */
	protected ControllabilityClassKind controllability = CONTROLLABILITY_EDEFAULT;

	/**
	 * This is true if the Controllability attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controllabilityESet;

	/**
	 * The default value of the '{@link #getExposure() <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposure()
	 * @generated
	 * @ordered
	 */
	protected static final ExposureClassKind EXPOSURE_EDEFAULT = ExposureClassKind.E1;

	/**
	 * The cached value of the '{@link #getExposure() <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposure()
	 * @generated
	 * @ordered
	 */
	protected ExposureClassKind exposure = EXPOSURE_EDEFAULT;

	/**
	 * This is true if the Exposure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean exposureESet;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final SeverityClassKind SEVERITY_EDEFAULT = SeverityClassKind.S0;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected SeverityClassKind severity = SEVERITY_EDEFAULT;

	/**
	 * This is true if the Severity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean severityESet;

	/**
	 * The default value of the '{@link #getHazardClassification() <em>Hazard Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardClassification()
	 * @generated
	 * @ordered
	 */
	protected static final ASILKind HAZARD_CLASSIFICATION_EDEFAULT = ASILKind.ASIL_A;

	/**
	 * The cached value of the '{@link #getHazardClassification() <em>Hazard Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardClassification()
	 * @generated
	 * @ordered
	 */
	protected ASILKind hazardClassification = HAZARD_CLASSIFICATION_EDEFAULT;

	/**
	 * This is true if the Hazard Classification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hazardClassificationESet;

	/**
	 * The default value of the '{@link #getClassificationAssumptions() <em>Classification Assumptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationAssumptions()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_ASSUMPTIONS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getClassificationAssumptions() <em>Classification Assumptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationAssumptions()
	 * @generated
	 * @ordered
	 */
	protected String classificationAssumptions = CLASSIFICATION_ASSUMPTIONS_EDEFAULT;

	/**
	 * This is true if the Classification Assumptions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classificationAssumptionsESet;

	/**
	 * The cached value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> operatingMode;

	/**
	 * The cached value of the '{@link #getExternalMeasures() <em>External Measures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsRelationship> externalMeasures;

	/**
	 * The cached value of the '{@link #getOperationalSituationUseCase() <em>Operational Situation Use Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalSituationUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> operationalSituationUseCase;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalSituation> environment;

	/**
	 * The cached value of the '{@link #getHazard() <em>Hazard</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazard()
	 * @generated
	 * @ordered
	 */
	protected EList<Hazard> hazard;

	/**
	 * The cached value of the '{@link #getTraffic() <em>Traffic</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraffic()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalSituation> traffic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardousEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependabilityPackage.Literals.HAZARDOUS_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllabilityClassKind getControllability() {
		return controllability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllability(ControllabilityClassKind newControllability) {
		ControllabilityClassKind oldControllability = controllability;
		controllability = newControllability == null ? CONTROLLABILITY_EDEFAULT : newControllability;
		boolean oldControllabilityESet = controllabilityESet;
		controllabilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependabilityPackage.HAZARDOUS_EVENT__CONTROLLABILITY, oldControllability, controllability, !oldControllabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetControllability() {
		ControllabilityClassKind oldControllability = controllability;
		boolean oldControllabilityESet = controllabilityESet;
		controllability = CONTROLLABILITY_EDEFAULT;
		controllabilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DependabilityPackage.HAZARDOUS_EVENT__CONTROLLABILITY, oldControllability, CONTROLLABILITY_EDEFAULT, oldControllabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetControllability() {
		return controllabilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureClassKind getExposure() {
		return exposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposure(ExposureClassKind newExposure) {
		ExposureClassKind oldExposure = exposure;
		exposure = newExposure == null ? EXPOSURE_EDEFAULT : newExposure;
		boolean oldExposureESet = exposureESet;
		exposureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependabilityPackage.HAZARDOUS_EVENT__EXPOSURE, oldExposure, exposure, !oldExposureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExposure() {
		ExposureClassKind oldExposure = exposure;
		boolean oldExposureESet = exposureESet;
		exposure = EXPOSURE_EDEFAULT;
		exposureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DependabilityPackage.HAZARDOUS_EVENT__EXPOSURE, oldExposure, EXPOSURE_EDEFAULT, oldExposureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExposure() {
		return exposureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityClassKind getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(SeverityClassKind newSeverity) {
		SeverityClassKind oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		boolean oldSeverityESet = severityESet;
		severityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependabilityPackage.HAZARDOUS_EVENT__SEVERITY, oldSeverity, severity, !oldSeverityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSeverity() {
		SeverityClassKind oldSeverity = severity;
		boolean oldSeverityESet = severityESet;
		severity = SEVERITY_EDEFAULT;
		severityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DependabilityPackage.HAZARDOUS_EVENT__SEVERITY, oldSeverity, SEVERITY_EDEFAULT, oldSeverityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSeverity() {
		return severityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASILKind getHazardClassification() {
		return hazardClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardClassification(ASILKind newHazardClassification) {
		ASILKind oldHazardClassification = hazardClassification;
		hazardClassification = newHazardClassification == null ? HAZARD_CLASSIFICATION_EDEFAULT : newHazardClassification;
		boolean oldHazardClassificationESet = hazardClassificationESet;
		hazardClassificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependabilityPackage.HAZARDOUS_EVENT__HAZARD_CLASSIFICATION, oldHazardClassification, hazardClassification, !oldHazardClassificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHazardClassification() {
		ASILKind oldHazardClassification = hazardClassification;
		boolean oldHazardClassificationESet = hazardClassificationESet;
		hazardClassification = HAZARD_CLASSIFICATION_EDEFAULT;
		hazardClassificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DependabilityPackage.HAZARDOUS_EVENT__HAZARD_CLASSIFICATION, oldHazardClassification, HAZARD_CLASSIFICATION_EDEFAULT, oldHazardClassificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHazardClassification() {
		return hazardClassificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassificationAssumptions() {
		return classificationAssumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationAssumptions(String newClassificationAssumptions) {
		String oldClassificationAssumptions = classificationAssumptions;
		classificationAssumptions = newClassificationAssumptions;
		boolean oldClassificationAssumptionsESet = classificationAssumptionsESet;
		classificationAssumptionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependabilityPackage.HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS, oldClassificationAssumptions, classificationAssumptions, !oldClassificationAssumptionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassificationAssumptions() {
		String oldClassificationAssumptions = classificationAssumptions;
		boolean oldClassificationAssumptionsESet = classificationAssumptionsESet;
		classificationAssumptions = CLASSIFICATION_ASSUMPTIONS_EDEFAULT;
		classificationAssumptionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DependabilityPackage.HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS, oldClassificationAssumptions, CLASSIFICATION_ASSUMPTIONS_EDEFAULT, oldClassificationAssumptionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassificationAssumptions() {
		return classificationAssumptionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getOperatingMode() {
		if (operatingMode == null) {
			operatingMode = new EObjectResolvingEList<Mode>(Mode.class, this, DependabilityPackage.HAZARDOUS_EVENT__OPERATING_MODE);
		}
		return operatingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementsRelationship> getExternalMeasures() {
		if (externalMeasures == null) {
			externalMeasures = new EObjectResolvingEList<RequirementsRelationship>(RequirementsRelationship.class, this, DependabilityPackage.HAZARDOUS_EVENT__EXTERNAL_MEASURES);
		}
		return externalMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getOperationalSituationUseCase() {
		if (operationalSituationUseCase == null) {
			operationalSituationUseCase = new EObjectResolvingEList<UseCase>(UseCase.class, this, DependabilityPackage.HAZARDOUS_EVENT__OPERATIONAL_SITUATION_USE_CASE);
		}
		return operationalSituationUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalSituation> getEnvironment() {
		if (environment == null) {
			environment = new EObjectResolvingEList<OperationalSituation>(OperationalSituation.class, this, DependabilityPackage.HAZARDOUS_EVENT__ENVIRONMENT);
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hazard> getHazard() {
		if (hazard == null) {
			hazard = new EObjectResolvingEList<Hazard>(Hazard.class, this, DependabilityPackage.HAZARDOUS_EVENT__HAZARD);
		}
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalSituation> getTraffic() {
		if (traffic == null) {
			traffic = new EObjectResolvingEList<OperationalSituation>(OperationalSituation.class, this, DependabilityPackage.HAZARDOUS_EVENT__TRAFFIC);
		}
		return traffic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependabilityPackage.HAZARDOUS_EVENT__CONTROLLABILITY:
				return getControllability();
			case DependabilityPackage.HAZARDOUS_EVENT__EXPOSURE:
				return getExposure();
			case DependabilityPackage.HAZARDOUS_EVENT__SEVERITY:
				return getSeverity();
			case DependabilityPackage.HAZARDOUS_EVENT__HAZARD_CLASSIFICATION:
				return getHazardClassification();
			case DependabilityPackage.HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS:
				return getClassificationAssumptions();
			case DependabilityPackage.HAZARDOUS_EVENT__OPERATING_MODE:
				return getOperatingMode();
			case DependabilityPackage.HAZARDOUS_EVENT__EXTERNAL_MEASURES:
				return getExternalMeasures();
			case DependabilityPackage.HAZARDOUS_EVENT__OPERATIONAL_SITUATION_USE_CASE:
				return getOperationalSituationUseCase();
			case DependabilityPackage.HAZARDOUS_EVENT__ENVIRONMENT:
				return getEnvironment();
			case DependabilityPackage.HAZARDOUS_EVENT__HAZARD:
				return getHazard();
			case DependabilityPackage.HAZARDOUS_EVENT__TRAFFIC:
				return getTraffic();
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
			case DependabilityPackage.HAZARDOUS_EVENT__CONTROLLABILITY:
				setControllability((ControllabilityClassKind)newValue);
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__EXPOSURE:
				setExposure((ExposureClassKind)newValue);
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__SEVERITY:
				setSeverity((SeverityClassKind)newValue);
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__HAZARD_CLASSIFICATION:
				setHazardClassification((ASILKind)newValue);
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS:
				setClassificationAssumptions((String)newValue);
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__OPERATING_MODE:
				getOperatingMode().clear();
				getOperatingMode().addAll((Collection<? extends Mode>)newValue);
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__EXTERNAL_MEASURES:
				getExternalMeasures().clear();
				getExternalMeasures().addAll((Collection<? extends RequirementsRelationship>)newValue);
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__OPERATIONAL_SITUATION_USE_CASE:
				getOperationalSituationUseCase().clear();
				getOperationalSituationUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__ENVIRONMENT:
				getEnvironment().clear();
				getEnvironment().addAll((Collection<? extends OperationalSituation>)newValue);
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__HAZARD:
				getHazard().clear();
				getHazard().addAll((Collection<? extends Hazard>)newValue);
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__TRAFFIC:
				getTraffic().clear();
				getTraffic().addAll((Collection<? extends OperationalSituation>)newValue);
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
			case DependabilityPackage.HAZARDOUS_EVENT__CONTROLLABILITY:
				unsetControllability();
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__EXPOSURE:
				unsetExposure();
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__SEVERITY:
				unsetSeverity();
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__HAZARD_CLASSIFICATION:
				unsetHazardClassification();
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS:
				unsetClassificationAssumptions();
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__OPERATING_MODE:
				getOperatingMode().clear();
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__EXTERNAL_MEASURES:
				getExternalMeasures().clear();
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__OPERATIONAL_SITUATION_USE_CASE:
				getOperationalSituationUseCase().clear();
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__ENVIRONMENT:
				getEnvironment().clear();
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__HAZARD:
				getHazard().clear();
				return;
			case DependabilityPackage.HAZARDOUS_EVENT__TRAFFIC:
				getTraffic().clear();
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
			case DependabilityPackage.HAZARDOUS_EVENT__CONTROLLABILITY:
				return isSetControllability();
			case DependabilityPackage.HAZARDOUS_EVENT__EXPOSURE:
				return isSetExposure();
			case DependabilityPackage.HAZARDOUS_EVENT__SEVERITY:
				return isSetSeverity();
			case DependabilityPackage.HAZARDOUS_EVENT__HAZARD_CLASSIFICATION:
				return isSetHazardClassification();
			case DependabilityPackage.HAZARDOUS_EVENT__CLASSIFICATION_ASSUMPTIONS:
				return isSetClassificationAssumptions();
			case DependabilityPackage.HAZARDOUS_EVENT__OPERATING_MODE:
				return operatingMode != null && !operatingMode.isEmpty();
			case DependabilityPackage.HAZARDOUS_EVENT__EXTERNAL_MEASURES:
				return externalMeasures != null && !externalMeasures.isEmpty();
			case DependabilityPackage.HAZARDOUS_EVENT__OPERATIONAL_SITUATION_USE_CASE:
				return operationalSituationUseCase != null && !operationalSituationUseCase.isEmpty();
			case DependabilityPackage.HAZARDOUS_EVENT__ENVIRONMENT:
				return environment != null && !environment.isEmpty();
			case DependabilityPackage.HAZARDOUS_EVENT__HAZARD:
				return hazard != null && !hazard.isEmpty();
			case DependabilityPackage.HAZARDOUS_EVENT__TRAFFIC:
				return traffic != null && !traffic.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (controllability: ");
		if (controllabilityESet) result.append(controllability); else result.append("<unset>");
		result.append(", exposure: ");
		if (exposureESet) result.append(exposure); else result.append("<unset>");
		result.append(", severity: ");
		if (severityESet) result.append(severity); else result.append("<unset>");
		result.append(", hazardClassification: ");
		if (hazardClassificationESet) result.append(hazardClassification); else result.append("<unset>");
		result.append(", classificationAssumptions: ");
		if (classificationAssumptionsESet) result.append(classificationAssumptions); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HazardousEventImpl
