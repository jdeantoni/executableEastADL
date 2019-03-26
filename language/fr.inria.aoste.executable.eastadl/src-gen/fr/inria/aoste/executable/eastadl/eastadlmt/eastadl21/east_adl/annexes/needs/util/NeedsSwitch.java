/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.util;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.*;

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
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage
 * @generated
 */
public class NeedsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NeedsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeedsSwitch() {
		if (modelPackage == null) {
			modelPackage = NeedsPackage.eINSTANCE;
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
			case NeedsPackage.ARCHITECTURAL_DESCRIPTION: {
				ArchitecturalDescription architecturalDescription = (ArchitecturalDescription)theEObject;
				T result = caseArchitecturalDescription(architecturalDescription);
				if (result == null) result = caseConcept(architecturalDescription);
				if (result == null) result = caseEAElement(architecturalDescription);
				if (result == null) result = caseIdentifiable(architecturalDescription);
				if (result == null) result = caseReferrable(architecturalDescription);
				if (result == null) result = caseGIdentifiable(architecturalDescription);
				if (result == null) result = caseGReferrable(architecturalDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeedsPackage.ARCHITECTURAL_MODEL: {
				ArchitecturalModel architecturalModel = (ArchitecturalModel)theEObject;
				T result = caseArchitecturalModel(architecturalModel);
				if (result == null) result = caseConcept(architecturalModel);
				if (result == null) result = caseEAElement(architecturalModel);
				if (result == null) result = caseIdentifiable(architecturalModel);
				if (result == null) result = caseReferrable(architecturalModel);
				if (result == null) result = caseGIdentifiable(architecturalModel);
				if (result == null) result = caseGReferrable(architecturalModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeedsPackage.ARCHITECTURE: {
				Architecture architecture = (Architecture)theEObject;
				T result = caseArchitecture(architecture);
				if (result == null) result = caseConcept(architecture);
				if (result == null) result = caseEAElement(architecture);
				if (result == null) result = caseIdentifiable(architecture);
				if (result == null) result = caseReferrable(architecture);
				if (result == null) result = caseGIdentifiable(architecture);
				if (result == null) result = caseGReferrable(architecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeedsPackage.CONCEPT: {
				Concept concept = (Concept)theEObject;
				T result = caseConcept(concept);
				if (result == null) result = caseEAElement(concept);
				if (result == null) result = caseIdentifiable(concept);
				if (result == null) result = caseReferrable(concept);
				if (result == null) result = caseGIdentifiable(concept);
				if (result == null) result = caseGReferrable(concept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeedsPackage.MISSION: {
				Mission mission = (Mission)theEObject;
				T result = caseMission(mission);
				if (result == null) result = caseConcept(mission);
				if (result == null) result = caseEAElement(mission);
				if (result == null) result = caseIdentifiable(mission);
				if (result == null) result = caseReferrable(mission);
				if (result == null) result = caseGIdentifiable(mission);
				if (result == null) result = caseGReferrable(mission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeedsPackage.VEHICLE_SYSTEM: {
				VehicleSystem vehicleSystem = (VehicleSystem)theEObject;
				T result = caseVehicleSystem(vehicleSystem);
				if (result == null) result = caseConcept(vehicleSystem);
				if (result == null) result = caseEAElement(vehicleSystem);
				if (result == null) result = caseIdentifiable(vehicleSystem);
				if (result == null) result = caseReferrable(vehicleSystem);
				if (result == null) result = caseGIdentifiable(vehicleSystem);
				if (result == null) result = caseGReferrable(vehicleSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeedsPackage.STAKEHOLDER: {
				Stakeholder stakeholder = (Stakeholder)theEObject;
				T result = caseStakeholder(stakeholder);
				if (result == null) result = caseTraceableSpecification(stakeholder);
				if (result == null) result = caseEAPackageableElement(stakeholder);
				if (result == null) result = caseEAElement(stakeholder);
				if (result == null) result = caseGEAPackageableElement(stakeholder);
				if (result == null) result = caseIdentifiable(stakeholder);
				if (result == null) result = caseReferrable(stakeholder);
				if (result == null) result = caseGIdentifiable(stakeholder);
				if (result == null) result = caseGReferrable(stakeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeedsPackage.STAKEHOLDER_NEED: {
				StakeholderNeed stakeholderNeed = (StakeholderNeed)theEObject;
				T result = caseStakeholderNeed(stakeholderNeed);
				if (result == null) result = caseTraceableSpecification(stakeholderNeed);
				if (result == null) result = caseEAPackageableElement(stakeholderNeed);
				if (result == null) result = caseEAElement(stakeholderNeed);
				if (result == null) result = caseGEAPackageableElement(stakeholderNeed);
				if (result == null) result = caseIdentifiable(stakeholderNeed);
				if (result == null) result = caseReferrable(stakeholderNeed);
				if (result == null) result = caseGIdentifiable(stakeholderNeed);
				if (result == null) result = caseGReferrable(stakeholderNeed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeedsPackage.BUSINESS_OPPORTUNITY: {
				BusinessOpportunity businessOpportunity = (BusinessOpportunity)theEObject;
				T result = caseBusinessOpportunity(businessOpportunity);
				if (result == null) result = caseTraceableSpecification(businessOpportunity);
				if (result == null) result = caseEAPackageableElement(businessOpportunity);
				if (result == null) result = caseEAElement(businessOpportunity);
				if (result == null) result = caseGEAPackageableElement(businessOpportunity);
				if (result == null) result = caseIdentifiable(businessOpportunity);
				if (result == null) result = caseReferrable(businessOpportunity);
				if (result == null) result = caseGIdentifiable(businessOpportunity);
				if (result == null) result = caseGReferrable(businessOpportunity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeedsPackage.PROBLEM_STATEMENT: {
				ProblemStatement problemStatement = (ProblemStatement)theEObject;
				T result = caseProblemStatement(problemStatement);
				if (result == null) result = caseTraceableSpecification(problemStatement);
				if (result == null) result = caseEAPackageableElement(problemStatement);
				if (result == null) result = caseEAElement(problemStatement);
				if (result == null) result = caseGEAPackageableElement(problemStatement);
				if (result == null) result = caseIdentifiable(problemStatement);
				if (result == null) result = caseReferrable(problemStatement);
				if (result == null) result = caseGIdentifiable(problemStatement);
				if (result == null) result = caseGReferrable(problemStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NeedsPackage.PRODUCT_POSITIONING: {
				ProductPositioning productPositioning = (ProductPositioning)theEObject;
				T result = caseProductPositioning(productPositioning);
				if (result == null) result = caseTraceableSpecification(productPositioning);
				if (result == null) result = caseEAPackageableElement(productPositioning);
				if (result == null) result = caseEAElement(productPositioning);
				if (result == null) result = caseGEAPackageableElement(productPositioning);
				if (result == null) result = caseIdentifiable(productPositioning);
				if (result == null) result = caseReferrable(productPositioning);
				if (result == null) result = caseGIdentifiable(productPositioning);
				if (result == null) result = caseGReferrable(productPositioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architectural Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architectural Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitecturalDescription(ArchitecturalDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architectural Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architectural Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitecturalModel(ArchitecturalModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitecture(Architecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcept(Concept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMission(Mission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleSystem(VehicleSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeholder(Stakeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder Need</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder Need</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeholderNeed(StakeholderNeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Opportunity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Opportunity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessOpportunity(BusinessOpportunity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemStatement(ProblemStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Positioning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Positioning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductPositioning(ProductPositioning object) {
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

} //NeedsSwitch
