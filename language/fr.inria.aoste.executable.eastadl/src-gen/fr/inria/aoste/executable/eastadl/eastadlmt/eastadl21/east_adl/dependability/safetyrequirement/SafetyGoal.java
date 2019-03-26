/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.Mode;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.ASILKind;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAElement;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal#getHazardClassification <em>Hazard Classification</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal#getSafeStates <em>Safe States</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal#getSafeModes <em>Safe Modes</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage#getSafetyGoal()
 * @model
 * @generated
 */
public interface SafetyGoal extends EAElement {
	/**
	 * Returns the value of the '<em><b>Hazard Classification</b></em>' attribute.
	 * The default value is <code>"ASIL_A"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.ASILKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Classification</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.ASILKind
	 * @see #isSetHazardClassification()
	 * @see #unsetHazardClassification()
	 * @see #setHazardClassification(ASILKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage#getSafetyGoal_HazardClassification()
	 * @model default="ASIL_A" unsettable="true" required="true"
	 * @generated
	 */
	ASILKind getHazardClassification();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal#getHazardClassification <em>Hazard Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard Classification</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.ASILKind
	 * @see #isSetHazardClassification()
	 * @see #unsetHazardClassification()
	 * @see #getHazardClassification()
	 * @generated
	 */
	void setHazardClassification(ASILKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal#getHazardClassification <em>Hazard Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHazardClassification()
	 * @see #getHazardClassification()
	 * @see #setHazardClassification(ASILKind)
	 * @generated
	 */
	void unsetHazardClassification();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal#getHazardClassification <em>Hazard Classification</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Safe States</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safe States</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe States</em>' attribute.
	 * @see #isSetSafeStates()
	 * @see #unsetSafeStates()
	 * @see #setSafeStates(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage#getSafetyGoal_SafeStates()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String"
	 * @generated
	 */
	String getSafeStates();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal#getSafeStates <em>Safe States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe States</em>' attribute.
	 * @see #isSetSafeStates()
	 * @see #unsetSafeStates()
	 * @see #getSafeStates()
	 * @generated
	 */
	void setSafeStates(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal#getSafeStates <em>Safe States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSafeStates()
	 * @see #getSafeStates()
	 * @see #setSafeStates(String)
	 * @generated
	 */
	void unsetSafeStates();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal#getSafeStates <em>Safe States</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Safe States</em>' attribute is set.
	 * @see #unsetSafeStates()
	 * @see #getSafeStates()
	 * @see #setSafeStates(String)
	 * @generated
	 */
	boolean isSetSafeStates();

	/**
	 * Returns the value of the '<em><b>Safe Modes</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safe Modes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe Modes</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage#getSafetyGoal_SafeModes()
	 * @model
	 * @generated
	 */
	EList<Mode> getSafeModes();

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.HazardousEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage#getSafetyGoal_DerivedFrom()
	 * @model required="true"
	 * @generated
	 */
	EList<HazardousEvent> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyrequirementPackage#getSafetyGoal_Requirement()
	 * @model required="true"
	 * @generated
	 */
	EList<Requirement> getRequirement();

} // SafetyGoal
