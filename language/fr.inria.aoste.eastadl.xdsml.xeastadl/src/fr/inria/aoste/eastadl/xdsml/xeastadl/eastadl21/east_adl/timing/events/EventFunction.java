/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionType;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.Event;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events._instanceref.EventFunction_function;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events.EventFunction#getFunctionType <em>Function Type</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events.EventFunction#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events.EventsPackage#getEventFunction()
 * @model
 * @generated
 */
public interface EventFunction extends Event {
	/**
	 * Returns the value of the '<em><b>Function Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Type</em>' reference.
	 * @see #setFunctionType(FunctionType)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events.EventsPackage#getEventFunction_FunctionType()
	 * @model
	 * @generated
	 */
	FunctionType getFunctionType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events.EventFunction#getFunctionType <em>Function Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Type</em>' reference.
	 * @see #getFunctionType()
	 * @generated
	 */
	void setFunctionType(FunctionType value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(EventFunction_function)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events.EventsPackage#getEventFunction_Function()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventFunction_function getFunction();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events.EventFunction#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(EventFunction_function value);

} // EventFunction
