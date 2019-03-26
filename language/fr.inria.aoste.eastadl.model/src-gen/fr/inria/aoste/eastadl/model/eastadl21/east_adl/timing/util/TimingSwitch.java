/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.util;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.*;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement;
import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable;
import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage
 * @generated
 */
public class TimingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingSwitch() {
		if (modelPackage == null) {
			modelPackage = TimingPackage.eINSTANCE;
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
			case TimingPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseTimingDescription(event);
				if (result == null) result = caseEAElement(event);
				if (result == null) result = caseIdentifiable(event);
				if (result == null) result = caseReferrable(event);
				if (result == null) result = caseGIdentifiable(event);
				if (result == null) result = caseGReferrable(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingPackage.EVENT_CHAIN: {
				EventChain eventChain = (EventChain)theEObject;
				T result = caseEventChain(eventChain);
				if (result == null) result = caseTimingDescription(eventChain);
				if (result == null) result = caseEAElement(eventChain);
				if (result == null) result = caseIdentifiable(eventChain);
				if (result == null) result = caseReferrable(eventChain);
				if (result == null) result = caseGIdentifiable(eventChain);
				if (result == null) result = caseGReferrable(eventChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingPackage.EXECUTION_TIME_CONSTRAINT: {
				ExecutionTimeConstraint executionTimeConstraint = (ExecutionTimeConstraint)theEObject;
				T result = caseExecutionTimeConstraint(executionTimeConstraint);
				if (result == null) result = caseTimingConstraint(executionTimeConstraint);
				if (result == null) result = caseEAElement(executionTimeConstraint);
				if (result == null) result = caseIdentifiable(executionTimeConstraint);
				if (result == null) result = caseReferrable(executionTimeConstraint);
				if (result == null) result = caseGIdentifiable(executionTimeConstraint);
				if (result == null) result = caseGReferrable(executionTimeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingPackage.PRECEDENCE_CONSTRAINT: {
				PrecedenceConstraint precedenceConstraint = (PrecedenceConstraint)theEObject;
				T result = casePrecedenceConstraint(precedenceConstraint);
				if (result == null) result = caseTimingConstraint(precedenceConstraint);
				if (result == null) result = caseEAElement(precedenceConstraint);
				if (result == null) result = caseIdentifiable(precedenceConstraint);
				if (result == null) result = caseReferrable(precedenceConstraint);
				if (result == null) result = caseGIdentifiable(precedenceConstraint);
				if (result == null) result = caseGReferrable(precedenceConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingPackage.TIME_DURATION: {
				TimeDuration timeDuration = (TimeDuration)theEObject;
				T result = caseTimeDuration(timeDuration);
				if (result == null) result = caseEAElement(timeDuration);
				if (result == null) result = caseIdentifiable(timeDuration);
				if (result == null) result = caseReferrable(timeDuration);
				if (result == null) result = caseGIdentifiable(timeDuration);
				if (result == null) result = caseGReferrable(timeDuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingPackage.TIMING: {
				Timing timing = (Timing)theEObject;
				T result = caseTiming(timing);
				if (result == null) result = caseContext(timing);
				if (result == null) result = caseEAPackageableElement(timing);
				if (result == null) result = caseEAElement(timing);
				if (result == null) result = caseGEAPackageableElement(timing);
				if (result == null) result = caseIdentifiable(timing);
				if (result == null) result = caseReferrable(timing);
				if (result == null) result = caseGIdentifiable(timing);
				if (result == null) result = caseGReferrable(timing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingPackage.TIMING_CONSTRAINT: {
				TimingConstraint timingConstraint = (TimingConstraint)theEObject;
				T result = caseTimingConstraint(timingConstraint);
				if (result == null) result = caseEAElement(timingConstraint);
				if (result == null) result = caseIdentifiable(timingConstraint);
				if (result == null) result = caseReferrable(timingConstraint);
				if (result == null) result = caseGIdentifiable(timingConstraint);
				if (result == null) result = caseGReferrable(timingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingPackage.TIMING_DESCRIPTION: {
				TimingDescription timingDescription = (TimingDescription)theEObject;
				T result = caseTimingDescription(timingDescription);
				if (result == null) result = caseEAElement(timingDescription);
				if (result == null) result = caseIdentifiable(timingDescription);
				if (result == null) result = caseReferrable(timingDescription);
				if (result == null) result = caseGIdentifiable(timingDescription);
				if (result == null) result = caseGReferrable(timingDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventChain(EventChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Time Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionTimeConstraint(ExecutionTimeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceConstraint(PrecedenceConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeDuration(TimeDuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTiming(Timing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingConstraint(TimingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingDescription(TimingDescription object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
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

} //TimingSwitch
