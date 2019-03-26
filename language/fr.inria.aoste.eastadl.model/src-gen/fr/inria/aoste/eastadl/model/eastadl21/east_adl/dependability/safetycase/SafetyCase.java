/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase#getStage <em>Stage</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase#getContext <em>Context</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase#getSafetyCase <em>Safety Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase#getWarrant <em>Warrant</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase#getClaim <em>Claim</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase#getGround <em>Ground</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycasePackage#getSafetyCase()
 * @model
 * @generated
 */
public interface SafetyCase extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * The default value is <code>"PRELIMINARYSAFETYCASE"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind
	 * @see #isSetStage()
	 * @see #unsetStage()
	 * @see #setStage(LifecycleStageKind)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycasePackage#getSafetyCase_Stage()
	 * @model default="PRELIMINARYSAFETYCASE" unsettable="true" required="true"
	 * @generated
	 */
	LifecycleStageKind getStage();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind
	 * @see #isSetStage()
	 * @see #unsetStage()
	 * @see #getStage()
	 * @generated
	 */
	void setStage(LifecycleStageKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStage()
	 * @see #getStage()
	 * @see #setStage(LifecycleStageKind)
	 * @generated
	 */
	void unsetStage();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase#getStage <em>Stage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stage</em>' attribute is set.
	 * @see #unsetStage()
	 * @see #getStage()
	 * @see #setStage(LifecycleStageKind)
	 * @generated
	 */
	boolean isSetStage();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #isSetContext()
	 * @see #unsetContext()
	 * @see #setContext(String)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycasePackage#getSafetyCase_Context()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #isSetContext()
	 * @see #unsetContext()
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContext()
	 * @see #getContext()
	 * @see #setContext(String)
	 * @generated
	 */
	void unsetContext();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase#getContext <em>Context</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Context</em>' attribute is set.
	 * @see #unsetContext()
	 * @see #getContext()
	 * @see #setContext(String)
	 * @generated
	 */
	boolean isSetContext();

	/**
	 * Returns the value of the '<em><b>Safety Case</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetyCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Case</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycasePackage#getSafetyCase_SafetyCase()
	 * @model containment="true"
	 * @generated
	 */
	EList<SafetyCase> getSafetyCase();

	/**
	 * Returns the value of the '<em><b>Warrant</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.Warrant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warrant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warrant</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycasePackage#getSafetyCase_Warrant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Warrant> getWarrant();

	/**
	 * Returns the value of the '<em><b>Claim</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.Claim}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycasePackage#getSafetyCase_Claim()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Claim> getClaim();

	/**
	 * Returns the value of the '<em><b>Ground</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.Ground}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycasePackage#getSafetyCase_Ground()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Ground> getGround();

} // SafetyCase
