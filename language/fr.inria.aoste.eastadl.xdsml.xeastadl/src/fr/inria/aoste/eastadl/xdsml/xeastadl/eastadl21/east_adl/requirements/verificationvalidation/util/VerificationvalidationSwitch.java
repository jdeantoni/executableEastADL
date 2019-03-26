/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.verificationvalidation.util;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.Context;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.EAElement;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.EAPackageableElement;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.Relationship;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsRelationship;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.verificationvalidation.*;

import fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.gelements.GEAPackageableElement;
import fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.gelements.GIdentifiable;
import fr.inria.aoste.eastadl.xdsml.xeastadl.geastadl.ginfrastructure.gelements.GReferrable;

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
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage
 * @generated
 */
public class VerificationvalidationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VerificationvalidationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationvalidationSwitch() {
		if (modelPackage == null) {
			modelPackage = VerificationvalidationPackage.eINSTANCE;
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
			case VerificationvalidationPackage.VERIFICATION_VALIDATION: {
				VerificationValidation verificationValidation = (VerificationValidation)theEObject;
				T result = caseVerificationValidation(verificationValidation);
				if (result == null) result = caseContext(verificationValidation);
				if (result == null) result = caseEAPackageableElement(verificationValidation);
				if (result == null) result = caseEAElement(verificationValidation);
				if (result == null) result = caseGEAPackageableElement(verificationValidation);
				if (result == null) result = caseIdentifiable(verificationValidation);
				if (result == null) result = caseReferrable(verificationValidation);
				if (result == null) result = caseGIdentifiable(verificationValidation);
				if (result == null) result = caseGReferrable(verificationValidation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerificationvalidationPackage.VV_ACTUAL_OUTCOME: {
				VVActualOutcome vvActualOutcome = (VVActualOutcome)theEObject;
				T result = caseVVActualOutcome(vvActualOutcome);
				if (result == null) result = caseTraceableSpecification(vvActualOutcome);
				if (result == null) result = caseEAPackageableElement(vvActualOutcome);
				if (result == null) result = caseEAElement(vvActualOutcome);
				if (result == null) result = caseGEAPackageableElement(vvActualOutcome);
				if (result == null) result = caseIdentifiable(vvActualOutcome);
				if (result == null) result = caseReferrable(vvActualOutcome);
				if (result == null) result = caseGIdentifiable(vvActualOutcome);
				if (result == null) result = caseGReferrable(vvActualOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerificationvalidationPackage.VV_INTENDED_OUTCOME: {
				VVIntendedOutcome vvIntendedOutcome = (VVIntendedOutcome)theEObject;
				T result = caseVVIntendedOutcome(vvIntendedOutcome);
				if (result == null) result = caseTraceableSpecification(vvIntendedOutcome);
				if (result == null) result = caseEAPackageableElement(vvIntendedOutcome);
				if (result == null) result = caseEAElement(vvIntendedOutcome);
				if (result == null) result = caseGEAPackageableElement(vvIntendedOutcome);
				if (result == null) result = caseIdentifiable(vvIntendedOutcome);
				if (result == null) result = caseReferrable(vvIntendedOutcome);
				if (result == null) result = caseGIdentifiable(vvIntendedOutcome);
				if (result == null) result = caseGReferrable(vvIntendedOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerificationvalidationPackage.VV_LOG: {
				VVLog vvLog = (VVLog)theEObject;
				T result = caseVVLog(vvLog);
				if (result == null) result = caseTraceableSpecification(vvLog);
				if (result == null) result = caseEAPackageableElement(vvLog);
				if (result == null) result = caseEAElement(vvLog);
				if (result == null) result = caseGEAPackageableElement(vvLog);
				if (result == null) result = caseIdentifiable(vvLog);
				if (result == null) result = caseReferrable(vvLog);
				if (result == null) result = caseGIdentifiable(vvLog);
				if (result == null) result = caseGReferrable(vvLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerificationvalidationPackage.VV_PROCEDURE: {
				VVProcedure vvProcedure = (VVProcedure)theEObject;
				T result = caseVVProcedure(vvProcedure);
				if (result == null) result = caseTraceableSpecification(vvProcedure);
				if (result == null) result = caseEAPackageableElement(vvProcedure);
				if (result == null) result = caseEAElement(vvProcedure);
				if (result == null) result = caseGEAPackageableElement(vvProcedure);
				if (result == null) result = caseIdentifiable(vvProcedure);
				if (result == null) result = caseReferrable(vvProcedure);
				if (result == null) result = caseGIdentifiable(vvProcedure);
				if (result == null) result = caseGReferrable(vvProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerificationvalidationPackage.VV_STIMULI: {
				VVStimuli vvStimuli = (VVStimuli)theEObject;
				T result = caseVVStimuli(vvStimuli);
				if (result == null) result = caseTraceableSpecification(vvStimuli);
				if (result == null) result = caseEAPackageableElement(vvStimuli);
				if (result == null) result = caseEAElement(vvStimuli);
				if (result == null) result = caseGEAPackageableElement(vvStimuli);
				if (result == null) result = caseIdentifiable(vvStimuli);
				if (result == null) result = caseReferrable(vvStimuli);
				if (result == null) result = caseGIdentifiable(vvStimuli);
				if (result == null) result = caseGReferrable(vvStimuli);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerificationvalidationPackage.VV_TARGET: {
				VVTarget vvTarget = (VVTarget)theEObject;
				T result = caseVVTarget(vvTarget);
				if (result == null) result = caseTraceableSpecification(vvTarget);
				if (result == null) result = caseEAPackageableElement(vvTarget);
				if (result == null) result = caseEAElement(vvTarget);
				if (result == null) result = caseGEAPackageableElement(vvTarget);
				if (result == null) result = caseIdentifiable(vvTarget);
				if (result == null) result = caseReferrable(vvTarget);
				if (result == null) result = caseGIdentifiable(vvTarget);
				if (result == null) result = caseGReferrable(vvTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerificationvalidationPackage.VERIFY: {
				Verify verify = (Verify)theEObject;
				T result = caseVerify(verify);
				if (result == null) result = caseRequirementsRelationship(verify);
				if (result == null) result = caseRelationship(verify);
				if (result == null) result = caseEAElement(verify);
				if (result == null) result = caseIdentifiable(verify);
				if (result == null) result = caseReferrable(verify);
				if (result == null) result = caseGIdentifiable(verify);
				if (result == null) result = caseGReferrable(verify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VerificationvalidationPackage.VV_CASE: {
				VVCase vvCase = (VVCase)theEObject;
				T result = caseVVCase(vvCase);
				if (result == null) result = caseTraceableSpecification(vvCase);
				if (result == null) result = caseEAPackageableElement(vvCase);
				if (result == null) result = caseEAElement(vvCase);
				if (result == null) result = caseGEAPackageableElement(vvCase);
				if (result == null) result = caseIdentifiable(vvCase);
				if (result == null) result = caseReferrable(vvCase);
				if (result == null) result = caseGIdentifiable(vvCase);
				if (result == null) result = caseGReferrable(vvCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationValidation(VerificationValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VV Actual Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VV Actual Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVActualOutcome(VVActualOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VV Intended Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VV Intended Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVIntendedOutcome(VVIntendedOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VV Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VV Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVLog(VVLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VV Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VV Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVProcedure(VVProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VV Stimuli</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VV Stimuli</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVStimuli(VVStimuli object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VV Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VV Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVTarget(VVTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerify(Verify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VV Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VV Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVCase(VVCase object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsRelationship(RequirementsRelationship object) {
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

} //VerificationvalidationSwitch
