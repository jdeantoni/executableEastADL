/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAElement;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getTriggerCondition <em>Trigger Condition</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getTriggerPolicy <em>Trigger Policy</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getMode <em>Mode</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getFunctionPrototype <em>Function Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage#getFunctionTrigger()
 * @model
 * @generated
 */
public interface FunctionTrigger extends EAElement {
	/**
	 * Returns the value of the '<em><b>Trigger Condition</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Condition</em>' attribute.
	 * @see #isSetTriggerCondition()
	 * @see #unsetTriggerCondition()
	 * @see #setTriggerCondition(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage#getFunctionTrigger_TriggerCondition()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getTriggerCondition();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getTriggerCondition <em>Trigger Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Condition</em>' attribute.
	 * @see #isSetTriggerCondition()
	 * @see #unsetTriggerCondition()
	 * @see #getTriggerCondition()
	 * @generated
	 */
	void setTriggerCondition(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getTriggerCondition <em>Trigger Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTriggerCondition()
	 * @see #getTriggerCondition()
	 * @see #setTriggerCondition(String)
	 * @generated
	 */
	void unsetTriggerCondition();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getTriggerCondition <em>Trigger Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trigger Condition</em>' attribute is set.
	 * @see #unsetTriggerCondition()
	 * @see #getTriggerCondition()
	 * @see #setTriggerCondition(String)
	 * @generated
	 */
	boolean isSetTriggerCondition();

	/**
	 * Returns the value of the '<em><b>Trigger Policy</b></em>' attribute.
	 * The default value is <code>"EVENT"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.TriggerPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Policy</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.TriggerPolicyKind
	 * @see #isSetTriggerPolicy()
	 * @see #unsetTriggerPolicy()
	 * @see #setTriggerPolicy(TriggerPolicyKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage#getFunctionTrigger_TriggerPolicy()
	 * @model default="EVENT" unsettable="true" required="true"
	 * @generated
	 */
	TriggerPolicyKind getTriggerPolicy();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getTriggerPolicy <em>Trigger Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Policy</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.TriggerPolicyKind
	 * @see #isSetTriggerPolicy()
	 * @see #unsetTriggerPolicy()
	 * @see #getTriggerPolicy()
	 * @generated
	 */
	void setTriggerPolicy(TriggerPolicyKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getTriggerPolicy <em>Trigger Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTriggerPolicy()
	 * @see #getTriggerPolicy()
	 * @see #setTriggerPolicy(TriggerPolicyKind)
	 * @generated
	 */
	void unsetTriggerPolicy();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getTriggerPolicy <em>Trigger Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trigger Policy</em>' attribute is set.
	 * @see #unsetTriggerPolicy()
	 * @see #getTriggerPolicy()
	 * @see #setTriggerPolicy(TriggerPolicyKind)
	 * @generated
	 */
	boolean isSetTriggerPolicy();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(FunctionType)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage#getFunctionTrigger_Function()
	 * @model
	 * @generated
	 */
	FunctionType getFunction();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunctionType value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage#getFunctionTrigger_Mode()
	 * @model
	 * @generated
	 */
	EList<Mode> getMode();

	/**
	 * Returns the value of the '<em><b>Function Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Prototype</em>' reference.
	 * @see #setFunctionPrototype(FunctionPrototype)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage#getFunctionTrigger_FunctionPrototype()
	 * @model
	 * @generated
	 */
	FunctionPrototype getFunctionPrototype();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.FunctionTrigger#getFunctionPrototype <em>Function Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Prototype</em>' reference.
	 * @see #getFunctionPrototype()
	 * @generated
	 */
	void setFunctionPrototype(FunctionPrototype value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.behavior.BehaviorPackage#getFunctionTrigger_Port()
	 * @model
	 * @generated
	 */
	EList<FunctionPort> getPort();

} // FunctionTrigger
