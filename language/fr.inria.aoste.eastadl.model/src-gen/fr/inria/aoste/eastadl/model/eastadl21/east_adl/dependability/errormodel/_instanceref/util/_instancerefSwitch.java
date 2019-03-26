/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.util;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.*;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage
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
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET: {
				ErrorModelPrototype_functionTarget errorModelPrototype_functionTarget = (ErrorModelPrototype_functionTarget)theEObject;
				T result = caseErrorModelPrototype_functionTarget(errorModelPrototype_functionTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _instancerefPackage.ERROR_MODEL_PROTOTYPE_HW_TARGET: {
				ErrorModelPrototype_hwTarget errorModelPrototype_hwTarget = (ErrorModelPrototype_hwTarget)theEObject;
				T result = caseErrorModelPrototype_hwTarget(errorModelPrototype_hwTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _instancerefPackage.FAULT_FAILURE_PORT_FUNCTION_TARGET: {
				FaultFailurePort_functionTarget faultFailurePort_functionTarget = (FaultFailurePort_functionTarget)theEObject;
				T result = caseFaultFailurePort_functionTarget(faultFailurePort_functionTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _instancerefPackage.FAULT_FAILURE_PORT_HW_TARGET: {
				FaultFailurePort_hwTarget faultFailurePort_hwTarget = (FaultFailurePort_hwTarget)theEObject;
				T result = caseFaultFailurePort_hwTarget(faultFailurePort_hwTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT: {
				FaultFailurePropagationLink_fromPort faultFailurePropagationLink_fromPort = (FaultFailurePropagationLink_fromPort)theEObject;
				T result = caseFaultFailurePropagationLink_fromPort(faultFailurePropagationLink_fromPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _instancerefPackage.FAULT_FAILURE_PROPAGATION_LINK_TO_PORT: {
				FaultFailurePropagationLink_toPort faultFailurePropagationLink_toPort = (FaultFailurePropagationLink_toPort)theEObject;
				T result = caseFaultFailurePropagationLink_toPort(faultFailurePropagationLink_toPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Prototype function Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Prototype function Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorModelPrototype_functionTarget(ErrorModelPrototype_functionTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Prototype hw Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Prototype hw Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorModelPrototype_hwTarget(ErrorModelPrototype_hwTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Failure Port function Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Failure Port function Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultFailurePort_functionTarget(FaultFailurePort_functionTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Failure Port hw Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Failure Port hw Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultFailurePort_hwTarget(FaultFailurePort_hwTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Failure Propagation Link from Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Failure Propagation Link from Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultFailurePropagationLink_fromPort(FaultFailurePropagationLink_fromPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Failure Propagation Link to Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Failure Propagation Link to Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultFailurePropagationLink_toPort(FaultFailurePropagationLink_toPort object) {
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
