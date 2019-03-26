/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.util;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.*;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAElement;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageableElement;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackageableElement;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GIdentifiable;
import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GReferrable;

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
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrormodelPackage
 * @generated
 */
public class ErrormodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ErrormodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrormodelSwitch() {
		if (modelPackage == null) {
			modelPackage = ErrormodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case ErrormodelPackage.ANOMALY: {
				Anomaly anomaly = (Anomaly)theEObject;
				T result = caseAnomaly(anomaly);
				if (result == null) result = caseEAElement(anomaly);
				if (result == null) result = caseIdentifiable(anomaly);
				if (result == null) result = caseReferrable(anomaly);
				if (result == null) result = caseGIdentifiable(anomaly);
				if (result == null) result = caseGReferrable(anomaly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrormodelPackage.ERROR_BEHAVIOR: {
				ErrorBehavior errorBehavior = (ErrorBehavior)theEObject;
				T result = caseErrorBehavior(errorBehavior);
				if (result == null) result = caseEAElement(errorBehavior);
				if (result == null) result = caseIdentifiable(errorBehavior);
				if (result == null) result = caseReferrable(errorBehavior);
				if (result == null) result = caseGIdentifiable(errorBehavior);
				if (result == null) result = caseGReferrable(errorBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrormodelPackage.ERROR_MODEL_PROTOTYPE: {
				ErrorModelPrototype errorModelPrototype = (ErrorModelPrototype)theEObject;
				T result = caseErrorModelPrototype(errorModelPrototype);
				if (result == null) result = caseEAElement(errorModelPrototype);
				if (result == null) result = caseIdentifiable(errorModelPrototype);
				if (result == null) result = caseReferrable(errorModelPrototype);
				if (result == null) result = caseGIdentifiable(errorModelPrototype);
				if (result == null) result = caseGReferrable(errorModelPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrormodelPackage.ERROR_MODEL_TYPE: {
				ErrorModelType errorModelType = (ErrorModelType)theEObject;
				T result = caseErrorModelType(errorModelType);
				if (result == null) result = caseTraceableSpecification(errorModelType);
				if (result == null) result = caseEAPackageableElement(errorModelType);
				if (result == null) result = caseEAElement(errorModelType);
				if (result == null) result = caseGEAPackageableElement(errorModelType);
				if (result == null) result = caseIdentifiable(errorModelType);
				if (result == null) result = caseReferrable(errorModelType);
				if (result == null) result = caseGIdentifiable(errorModelType);
				if (result == null) result = caseGReferrable(errorModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrormodelPackage.FAILURE_OUT_PORT: {
				FailureOutPort failureOutPort = (FailureOutPort)theEObject;
				T result = caseFailureOutPort(failureOutPort);
				if (result == null) result = caseFaultFailurePort(failureOutPort);
				if (result == null) result = caseAnomaly(failureOutPort);
				if (result == null) result = caseEAElement(failureOutPort);
				if (result == null) result = caseIdentifiable(failureOutPort);
				if (result == null) result = caseReferrable(failureOutPort);
				if (result == null) result = caseGIdentifiable(failureOutPort);
				if (result == null) result = caseGReferrable(failureOutPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrormodelPackage.FAULT_FAILURE_PORT: {
				FaultFailurePort faultFailurePort = (FaultFailurePort)theEObject;
				T result = caseFaultFailurePort(faultFailurePort);
				if (result == null) result = caseAnomaly(faultFailurePort);
				if (result == null) result = caseEAElement(faultFailurePort);
				if (result == null) result = caseIdentifiable(faultFailurePort);
				if (result == null) result = caseReferrable(faultFailurePort);
				if (result == null) result = caseGIdentifiable(faultFailurePort);
				if (result == null) result = caseGReferrable(faultFailurePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrormodelPackage.FAULT_FAILURE_PROPAGATION_LINK: {
				FaultFailurePropagationLink faultFailurePropagationLink = (FaultFailurePropagationLink)theEObject;
				T result = caseFaultFailurePropagationLink(faultFailurePropagationLink);
				if (result == null) result = caseEAElement(faultFailurePropagationLink);
				if (result == null) result = caseIdentifiable(faultFailurePropagationLink);
				if (result == null) result = caseReferrable(faultFailurePropagationLink);
				if (result == null) result = caseGIdentifiable(faultFailurePropagationLink);
				if (result == null) result = caseGReferrable(faultFailurePropagationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrormodelPackage.FAULT_IN_PORT: {
				FaultInPort faultInPort = (FaultInPort)theEObject;
				T result = caseFaultInPort(faultInPort);
				if (result == null) result = caseFaultFailurePort(faultInPort);
				if (result == null) result = caseAnomaly(faultInPort);
				if (result == null) result = caseEAElement(faultInPort);
				if (result == null) result = caseIdentifiable(faultInPort);
				if (result == null) result = caseReferrable(faultInPort);
				if (result == null) result = caseGIdentifiable(faultInPort);
				if (result == null) result = caseGReferrable(faultInPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrormodelPackage.INTERNAL_FAULT_PROTOTYPE: {
				InternalFaultPrototype internalFaultPrototype = (InternalFaultPrototype)theEObject;
				T result = caseInternalFaultPrototype(internalFaultPrototype);
				if (result == null) result = caseAnomaly(internalFaultPrototype);
				if (result == null) result = caseEAElement(internalFaultPrototype);
				if (result == null) result = caseIdentifiable(internalFaultPrototype);
				if (result == null) result = caseReferrable(internalFaultPrototype);
				if (result == null) result = caseGIdentifiable(internalFaultPrototype);
				if (result == null) result = caseGReferrable(internalFaultPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrormodelPackage.PROCESS_FAULT_PROTOTYPE: {
				ProcessFaultPrototype processFaultPrototype = (ProcessFaultPrototype)theEObject;
				T result = caseProcessFaultPrototype(processFaultPrototype);
				if (result == null) result = caseAnomaly(processFaultPrototype);
				if (result == null) result = caseEAElement(processFaultPrototype);
				if (result == null) result = caseIdentifiable(processFaultPrototype);
				if (result == null) result = caseReferrable(processFaultPrototype);
				if (result == null) result = caseGIdentifiable(processFaultPrototype);
				if (result == null) result = caseGReferrable(processFaultPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrormodelPackage.FAULT_FAILURE_PORT_PROXY: {
				FaultFailurePortProxy faultFailurePortProxy = (FaultFailurePortProxy)theEObject;
				T result = caseFaultFailurePortProxy(faultFailurePortProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrormodelPackage.FAULT_IN_PORT_PROXY: {
				FaultInPortProxy faultInPortProxy = (FaultInPortProxy)theEObject;
				T result = caseFaultInPortProxy(faultInPortProxy);
				if (result == null) result = caseFaultFailurePortProxy(faultInPortProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrormodelPackage.FAILURE_OUT_PORT_PROXY: {
				FailureOutPortProxy failureOutPortProxy = (FailureOutPortProxy)theEObject;
				T result = caseFailureOutPortProxy(failureOutPortProxy);
				if (result == null) result = caseFaultFailurePortProxy(failureOutPortProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anomaly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anomaly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnomaly(Anomaly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorBehavior(ErrorBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorModelPrototype(ErrorModelPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorModelType(ErrorModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Out Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Out Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureOutPort(FailureOutPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Failure Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Failure Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultFailurePort(FaultFailurePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Failure Propagation Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Failure Propagation Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultFailurePropagationLink(FaultFailurePropagationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault In Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault In Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultInPort(FaultInPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Fault Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Fault Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalFaultPrototype(InternalFaultPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Fault Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Fault Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessFaultPrototype(ProcessFaultPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Failure Port Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Failure Port Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultFailurePortProxy(FaultFailurePortProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault In Port Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault In Port Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultInPortProxy(FaultInPortProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Out Port Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Out Port Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureOutPortProxy(FailureOutPortProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GReferrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GReferrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGReferrable(GReferrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GIdentifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GIdentifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGIdentifiable(GIdentifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAElement(EAElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEA Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEA Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEAPackageableElement(GEAPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAPackageableElement(EAPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableSpecification(TraceableSpecification object) {
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

} //ErrormodelSwitch
