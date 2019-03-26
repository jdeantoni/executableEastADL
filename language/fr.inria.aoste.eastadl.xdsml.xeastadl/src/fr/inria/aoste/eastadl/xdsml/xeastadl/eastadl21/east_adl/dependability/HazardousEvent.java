/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.Mode;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.ASILKind;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.OperationalSituation;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsRelationship;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.usecases.UseCase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazardous Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getControllability <em>Controllability</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getExposure <em>Exposure</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getSeverity <em>Severity</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getHazardClassification <em>Hazard Classification</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getClassificationAssumptions <em>Classification Assumptions</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getExternalMeasures <em>External Measures</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getOperationalSituationUseCase <em>Operational Situation Use Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getHazard <em>Hazard</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getTraffic <em>Traffic</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getHazardousEvent()
 * @model
 * @generated
 */
public interface HazardousEvent extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Controllability</b></em>' attribute.
	 * The default value is <code>"C0"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.ControllabilityClassKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controllability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllability</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.ControllabilityClassKind
	 * @see #isSetControllability()
	 * @see #unsetControllability()
	 * @see #setControllability(ControllabilityClassKind)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getHazardousEvent_Controllability()
	 * @model default="C0" unsettable="true" required="true"
	 * @generated
	 */
	ControllabilityClassKind getControllability();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getControllability <em>Controllability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controllability</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.ControllabilityClassKind
	 * @see #isSetControllability()
	 * @see #unsetControllability()
	 * @see #getControllability()
	 * @generated
	 */
	void setControllability(ControllabilityClassKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getControllability <em>Controllability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControllability()
	 * @see #getControllability()
	 * @see #setControllability(ControllabilityClassKind)
	 * @generated
	 */
	void unsetControllability();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getControllability <em>Controllability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Controllability</em>' attribute is set.
	 * @see #unsetControllability()
	 * @see #getControllability()
	 * @see #setControllability(ControllabilityClassKind)
	 * @generated
	 */
	boolean isSetControllability();

	/**
	 * Returns the value of the '<em><b>Exposure</b></em>' attribute.
	 * The default value is <code>"E1"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.ExposureClassKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposure</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.ExposureClassKind
	 * @see #isSetExposure()
	 * @see #unsetExposure()
	 * @see #setExposure(ExposureClassKind)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getHazardousEvent_Exposure()
	 * @model default="E1" unsettable="true" required="true"
	 * @generated
	 */
	ExposureClassKind getExposure();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getExposure <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.ExposureClassKind
	 * @see #isSetExposure()
	 * @see #unsetExposure()
	 * @see #getExposure()
	 * @generated
	 */
	void setExposure(ExposureClassKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getExposure <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExposure()
	 * @see #getExposure()
	 * @see #setExposure(ExposureClassKind)
	 * @generated
	 */
	void unsetExposure();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getExposure <em>Exposure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exposure</em>' attribute is set.
	 * @see #unsetExposure()
	 * @see #getExposure()
	 * @see #setExposure(ExposureClassKind)
	 * @generated
	 */
	boolean isSetExposure();

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The default value is <code>"S0"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.SeverityClassKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.SeverityClassKind
	 * @see #isSetSeverity()
	 * @see #unsetSeverity()
	 * @see #setSeverity(SeverityClassKind)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getHazardousEvent_Severity()
	 * @model default="S0" unsettable="true" required="true"
	 * @generated
	 */
	SeverityClassKind getSeverity();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.SeverityClassKind
	 * @see #isSetSeverity()
	 * @see #unsetSeverity()
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityClassKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeverity()
	 * @see #getSeverity()
	 * @see #setSeverity(SeverityClassKind)
	 * @generated
	 */
	void unsetSeverity();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getSeverity <em>Severity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Severity</em>' attribute is set.
	 * @see #unsetSeverity()
	 * @see #getSeverity()
	 * @see #setSeverity(SeverityClassKind)
	 * @generated
	 */
	boolean isSetSeverity();

	/**
	 * Returns the value of the '<em><b>Hazard Classification</b></em>' attribute.
	 * The default value is <code>"ASIL_A"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.ASILKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Classification</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.ASILKind
	 * @see #isSetHazardClassification()
	 * @see #unsetHazardClassification()
	 * @see #setHazardClassification(ASILKind)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getHazardousEvent_HazardClassification()
	 * @model default="ASIL_A" unsettable="true" required="true"
	 * @generated
	 */
	ASILKind getHazardClassification();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getHazardClassification <em>Hazard Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard Classification</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.ASILKind
	 * @see #isSetHazardClassification()
	 * @see #unsetHazardClassification()
	 * @see #getHazardClassification()
	 * @generated
	 */
	void setHazardClassification(ASILKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getHazardClassification <em>Hazard Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHazardClassification()
	 * @see #getHazardClassification()
	 * @see #setHazardClassification(ASILKind)
	 * @generated
	 */
	void unsetHazardClassification();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getHazardClassification <em>Hazard Classification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hazard Classification</em>' attribute is set.
	 * @see #unsetHazardClassification()
	 * @see #getHazardClassification()
	 * @see #setHazardClassification(ASILKind)
	 * @generated
	 */
	boolean isSetHazardClassification();

	/**
	 * Returns the value of the '<em><b>Classification Assumptions</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Assumptions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Assumptions</em>' attribute.
	 * @see #isSetClassificationAssumptions()
	 * @see #unsetClassificationAssumptions()
	 * @see #setClassificationAssumptions(String)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getHazardousEvent_ClassificationAssumptions()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String"
	 * @generated
	 */
	String getClassificationAssumptions();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getClassificationAssumptions <em>Classification Assumptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Assumptions</em>' attribute.
	 * @see #isSetClassificationAssumptions()
	 * @see #unsetClassificationAssumptions()
	 * @see #getClassificationAssumptions()
	 * @generated
	 */
	void setClassificationAssumptions(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getClassificationAssumptions <em>Classification Assumptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassificationAssumptions()
	 * @see #getClassificationAssumptions()
	 * @see #setClassificationAssumptions(String)
	 * @generated
	 */
	void unsetClassificationAssumptions();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.HazardousEvent#getClassificationAssumptions <em>Classification Assumptions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classification Assumptions</em>' attribute is set.
	 * @see #unsetClassificationAssumptions()
	 * @see #getClassificationAssumptions()
	 * @see #setClassificationAssumptions(String)
	 * @generated
	 */
	boolean isSetClassificationAssumptions();

	/**
	 * Returns the value of the '<em><b>Operating Mode</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Mode</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getHazardousEvent_OperatingMode()
	 * @model
	 * @generated
	 */
	EList<Mode> getOperatingMode();

	/**
	 * Returns the value of the '<em><b>External Measures</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Measures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Measures</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getHazardousEvent_ExternalMeasures()
	 * @model
	 * @generated
	 */
	EList<RequirementsRelationship> getExternalMeasures();

	/**
	 * Returns the value of the '<em><b>Operational Situation Use Case</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.usecases.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Situation Use Case</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Situation Use Case</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getHazardousEvent_OperationalSituationUseCase()
	 * @model required="true"
	 * @generated
	 */
	EList<UseCase> getOperationalSituationUseCase();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.OperationalSituation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getHazardousEvent_Environment()
	 * @model
	 * @generated
	 */
	EList<OperationalSituation> getEnvironment();

	/**
	 * Returns the value of the '<em><b>Hazard</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.Hazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getHazardousEvent_Hazard()
	 * @model required="true"
	 * @generated
	 */
	EList<Hazard> getHazard();

	/**
	 * Returns the value of the '<em><b>Traffic</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.OperationalSituation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traffic</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getHazardousEvent_Traffic()
	 * @model
	 * @generated
	 */
	EList<OperationalSituation> getTraffic();

} // HazardousEvent
