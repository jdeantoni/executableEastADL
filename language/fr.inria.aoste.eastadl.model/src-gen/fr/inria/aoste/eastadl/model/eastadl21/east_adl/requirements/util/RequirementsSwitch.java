/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.util;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Relationship;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.*;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsPackage
 * @generated
 */
public class RequirementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequirementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsSwitch() {
		if (modelPackage == null) {
			modelPackage = RequirementsPackage.eINSTANCE;
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
			case RequirementsPackage.DERIVE_REQUIREMENT: {
				DeriveRequirement deriveRequirement = (DeriveRequirement)theEObject;
				T result = caseDeriveRequirement(deriveRequirement);
				if (result == null) result = caseRequirementsRelationship(deriveRequirement);
				if (result == null) result = caseRelationship(deriveRequirement);
				if (result == null) result = caseEAElement(deriveRequirement);
				if (result == null) result = caseIdentifiable(deriveRequirement);
				if (result == null) result = caseReferrable(deriveRequirement);
				if (result == null) result = caseGIdentifiable(deriveRequirement);
				if (result == null) result = caseGReferrable(deriveRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.OPERATIONAL_SITUATION: {
				OperationalSituation operationalSituation = (OperationalSituation)theEObject;
				T result = caseOperationalSituation(operationalSituation);
				if (result == null) result = caseTraceableSpecification(operationalSituation);
				if (result == null) result = caseEAPackageableElement(operationalSituation);
				if (result == null) result = caseEAElement(operationalSituation);
				if (result == null) result = caseGEAPackageableElement(operationalSituation);
				if (result == null) result = caseIdentifiable(operationalSituation);
				if (result == null) result = caseReferrable(operationalSituation);
				if (result == null) result = caseGIdentifiable(operationalSituation);
				if (result == null) result = caseGReferrable(operationalSituation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.REQUIREMENT_SPECIFICATION_OBJECT: {
				RequirementSpecificationObject requirementSpecificationObject = (RequirementSpecificationObject)theEObject;
				T result = caseRequirementSpecificationObject(requirementSpecificationObject);
				if (result == null) result = caseTraceableSpecification(requirementSpecificationObject);
				if (result == null) result = caseEAPackageableElement(requirementSpecificationObject);
				if (result == null) result = caseEAElement(requirementSpecificationObject);
				if (result == null) result = caseGEAPackageableElement(requirementSpecificationObject);
				if (result == null) result = caseIdentifiable(requirementSpecificationObject);
				if (result == null) result = caseReferrable(requirementSpecificationObject);
				if (result == null) result = caseGIdentifiable(requirementSpecificationObject);
				if (result == null) result = caseGReferrable(requirementSpecificationObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.REQUIREMENTS_MODEL: {
				RequirementsModel requirementsModel = (RequirementsModel)theEObject;
				T result = caseRequirementsModel(requirementsModel);
				if (result == null) result = caseContext(requirementsModel);
				if (result == null) result = caseEAPackageableElement(requirementsModel);
				if (result == null) result = caseEAElement(requirementsModel);
				if (result == null) result = caseGEAPackageableElement(requirementsModel);
				if (result == null) result = caseIdentifiable(requirementsModel);
				if (result == null) result = caseReferrable(requirementsModel);
				if (result == null) result = caseGIdentifiable(requirementsModel);
				if (result == null) result = caseGReferrable(requirementsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.REQUIREMENTS_RELATED_INFORMATION: {
				RequirementsRelatedInformation requirementsRelatedInformation = (RequirementsRelatedInformation)theEObject;
				T result = caseRequirementsRelatedInformation(requirementsRelatedInformation);
				if (result == null) result = caseRequirementSpecificationObject(requirementsRelatedInformation);
				if (result == null) result = caseTraceableSpecification(requirementsRelatedInformation);
				if (result == null) result = caseEAPackageableElement(requirementsRelatedInformation);
				if (result == null) result = caseEAElement(requirementsRelatedInformation);
				if (result == null) result = caseGEAPackageableElement(requirementsRelatedInformation);
				if (result == null) result = caseIdentifiable(requirementsRelatedInformation);
				if (result == null) result = caseReferrable(requirementsRelatedInformation);
				if (result == null) result = caseGIdentifiable(requirementsRelatedInformation);
				if (result == null) result = caseGReferrable(requirementsRelatedInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.REQUIREMENTS_RELATIONSHIP: {
				RequirementsRelationship requirementsRelationship = (RequirementsRelationship)theEObject;
				T result = caseRequirementsRelationship(requirementsRelationship);
				if (result == null) result = caseRelationship(requirementsRelationship);
				if (result == null) result = caseEAElement(requirementsRelationship);
				if (result == null) result = caseIdentifiable(requirementsRelationship);
				if (result == null) result = caseReferrable(requirementsRelationship);
				if (result == null) result = caseGIdentifiable(requirementsRelationship);
				if (result == null) result = caseGReferrable(requirementsRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseRequirementSpecificationObject(requirement);
				if (result == null) result = caseTraceableSpecification(requirement);
				if (result == null) result = caseEAPackageableElement(requirement);
				if (result == null) result = caseEAElement(requirement);
				if (result == null) result = caseGEAPackageableElement(requirement);
				if (result == null) result = caseIdentifiable(requirement);
				if (result == null) result = caseReferrable(requirement);
				if (result == null) result = caseGIdentifiable(requirement);
				if (result == null) result = caseGReferrable(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.REQUIREMENTS_CONTAINER: {
				RequirementsContainer requirementsContainer = (RequirementsContainer)theEObject;
				T result = caseRequirementsContainer(requirementsContainer);
				if (result == null) result = caseTraceableSpecification(requirementsContainer);
				if (result == null) result = caseEAPackageableElement(requirementsContainer);
				if (result == null) result = caseEAElement(requirementsContainer);
				if (result == null) result = caseGEAPackageableElement(requirementsContainer);
				if (result == null) result = caseIdentifiable(requirementsContainer);
				if (result == null) result = caseReferrable(requirementsContainer);
				if (result == null) result = caseGIdentifiable(requirementsContainer);
				if (result == null) result = caseGReferrable(requirementsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.REFINE: {
				Refine refine = (Refine)theEObject;
				T result = caseRefine(refine);
				if (result == null) result = caseRequirementsRelationship(refine);
				if (result == null) result = caseRelationship(refine);
				if (result == null) result = caseEAElement(refine);
				if (result == null) result = caseIdentifiable(refine);
				if (result == null) result = caseReferrable(refine);
				if (result == null) result = caseGIdentifiable(refine);
				if (result == null) result = caseGReferrable(refine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.SATISFY: {
				Satisfy satisfy = (Satisfy)theEObject;
				T result = caseSatisfy(satisfy);
				if (result == null) result = caseRequirementsRelationship(satisfy);
				if (result == null) result = caseRelationship(satisfy);
				if (result == null) result = caseEAElement(satisfy);
				if (result == null) result = caseIdentifiable(satisfy);
				if (result == null) result = caseReferrable(satisfy);
				if (result == null) result = caseGIdentifiable(satisfy);
				if (result == null) result = caseGReferrable(satisfy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.REQUIREMENTS_LINK: {
				RequirementsLink requirementsLink = (RequirementsLink)theEObject;
				T result = caseRequirementsLink(requirementsLink);
				if (result == null) result = caseRequirementsRelationship(requirementsLink);
				if (result == null) result = caseRelationship(requirementsLink);
				if (result == null) result = caseEAElement(requirementsLink);
				if (result == null) result = caseIdentifiable(requirementsLink);
				if (result == null) result = caseReferrable(requirementsLink);
				if (result == null) result = caseGIdentifiable(requirementsLink);
				if (result == null) result = caseGReferrable(requirementsLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.REQUIREMENTS_RELATION_GROUP: {
				RequirementsRelationGroup requirementsRelationGroup = (RequirementsRelationGroup)theEObject;
				T result = caseRequirementsRelationGroup(requirementsRelationGroup);
				if (result == null) result = caseTraceableSpecification(requirementsRelationGroup);
				if (result == null) result = caseEAPackageableElement(requirementsRelationGroup);
				if (result == null) result = caseEAElement(requirementsRelationGroup);
				if (result == null) result = caseGEAPackageableElement(requirementsRelationGroup);
				if (result == null) result = caseIdentifiable(requirementsRelationGroup);
				if (result == null) result = caseReferrable(requirementsRelationGroup);
				if (result == null) result = caseGIdentifiable(requirementsRelationGroup);
				if (result == null) result = caseGReferrable(requirementsRelationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.QUALITY_REQUIREMENT: {
				QualityRequirement qualityRequirement = (QualityRequirement)theEObject;
				T result = caseQualityRequirement(qualityRequirement);
				if (result == null) result = caseRequirement(qualityRequirement);
				if (result == null) result = caseRequirementSpecificationObject(qualityRequirement);
				if (result == null) result = caseTraceableSpecification(qualityRequirement);
				if (result == null) result = caseEAPackageableElement(qualityRequirement);
				if (result == null) result = caseEAElement(qualityRequirement);
				if (result == null) result = caseGEAPackageableElement(qualityRequirement);
				if (result == null) result = caseIdentifiable(qualityRequirement);
				if (result == null) result = caseReferrable(qualityRequirement);
				if (result == null) result = caseGIdentifiable(qualityRequirement);
				if (result == null) result = caseGReferrable(qualityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derive Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derive Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeriveRequirement(DeriveRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Situation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Situation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalSituation(OperationalSituation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Specification Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Specification Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementSpecificationObject(RequirementSpecificationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsModel(RequirementsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsRelatedInformation(RequirementsRelatedInformation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsContainer(RequirementsContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefine(Refine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisfy(Satisfy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsLink(RequirementsLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsRelationGroup(RequirementsRelationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityRequirement(QualityRequirement object) {
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

} //RequirementsSwitch
