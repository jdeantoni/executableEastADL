/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.util;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.events._instanceref._instancerefPackage
 * @generated
 */
public class _instancerefSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _instancerefPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _instancerefSwitch() {
		if (modelPackage == null) {
			modelPackage = _instancerefPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _instancerefPackage.EVENT_FUNCTION_FUNCTION: {
				EventFunction_function eventFunction_function = (EventFunction_function)theEObject;
				T result = caseEventFunction_function(eventFunction_function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _instancerefPackage.EVENT_FUNCTION_CLIENT_SERVER_PORT_PORT: {
				EventFunctionClientServerPort_port eventFunctionClientServerPort_port = (EventFunctionClientServerPort_port)theEObject;
				T result = caseEventFunctionClientServerPort_port(eventFunctionClientServerPort_port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _instancerefPackage.EVENT_FUNCTION_FLOW_PORT_PORT: {
				EventFunctionFlowPort_port eventFunctionFlowPort_port = (EventFunctionFlowPort_port)theEObject;
				T result = caseEventFunctionFlowPort_port(eventFunctionFlowPort_port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Function function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Function function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFunction_function(EventFunction_function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Function Client Server Port port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Function Client Server Port port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFunctionClientServerPort_port(EventFunctionClientServerPort_port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Function Flow Port port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Function Flow Port port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventFunctionFlowPort_port(EventFunctionFlowPort_port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //_instancerefSwitch
