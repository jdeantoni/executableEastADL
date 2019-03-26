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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsPackage
 * @generated
 */
public class RequirementsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequirementsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RequirementsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsSwitch<Adapter> modelSwitch =
		new RequirementsSwitch<Adapter>() {
			@Override
			public Adapter caseDeriveRequirement(DeriveRequirement object) {
				return createDeriveRequirementAdapter();
			}
			@Override
			public Adapter caseOperationalSituation(OperationalSituation object) {
				return createOperationalSituationAdapter();
			}
			@Override
			public Adapter caseRequirementSpecificationObject(RequirementSpecificationObject object) {
				return createRequirementSpecificationObjectAdapter();
			}
			@Override
			public Adapter caseRequirementsModel(RequirementsModel object) {
				return createRequirementsModelAdapter();
			}
			@Override
			public Adapter caseRequirementsRelatedInformation(RequirementsRelatedInformation object) {
				return createRequirementsRelatedInformationAdapter();
			}
			@Override
			public Adapter caseRequirementsRelationship(RequirementsRelationship object) {
				return createRequirementsRelationshipAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseRequirementsContainer(RequirementsContainer object) {
				return createRequirementsContainerAdapter();
			}
			@Override
			public Adapter caseRefine(Refine object) {
				return createRefineAdapter();
			}
			@Override
			public Adapter caseSatisfy(Satisfy object) {
				return createSatisfyAdapter();
			}
			@Override
			public Adapter caseRequirementsLink(RequirementsLink object) {
				return createRequirementsLinkAdapter();
			}
			@Override
			public Adapter caseRequirementsRelationGroup(RequirementsRelationGroup object) {
				return createRequirementsRelationGroupAdapter();
			}
			@Override
			public Adapter caseQualityRequirement(QualityRequirement object) {
				return createQualityRequirementAdapter();
			}
			@Override
			public Adapter caseGReferrable(GReferrable object) {
				return createGReferrableAdapter();
			}
			@Override
			public Adapter caseReferrable(Referrable object) {
				return createReferrableAdapter();
			}
			@Override
			public Adapter caseGIdentifiable(GIdentifiable object) {
				return createGIdentifiableAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseEAElement(EAElement object) {
				return createEAElementAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseGEAPackageableElement(GEAPackageableElement object) {
				return createGEAPackageableElementAdapter();
			}
			@Override
			public Adapter caseEAPackageableElement(EAPackageableElement object) {
				return createEAPackageableElementAdapter();
			}
			@Override
			public Adapter caseTraceableSpecification(TraceableSpecification object) {
				return createTraceableSpecificationAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.DeriveRequirement <em>Derive Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.DeriveRequirement
	 * @generated
	 */
	public Adapter createDeriveRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.OperationalSituation <em>Operational Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.OperationalSituation
	 * @generated
	 */
	public Adapter createOperationalSituationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementSpecificationObject <em>Requirement Specification Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementSpecificationObject
	 * @generated
	 */
	public Adapter createRequirementSpecificationObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsModel
	 * @generated
	 */
	public Adapter createRequirementsModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsRelatedInformation <em>Related Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsRelatedInformation
	 * @generated
	 */
	public Adapter createRequirementsRelatedInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsRelationship
	 * @generated
	 */
	public Adapter createRequirementsRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsContainer
	 * @generated
	 */
	public Adapter createRequirementsContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Refine <em>Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Refine
	 * @generated
	 */
	public Adapter createRefineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Satisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Satisfy
	 * @generated
	 */
	public Adapter createSatisfyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsLink
	 * @generated
	 */
	public Adapter createRequirementsLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsRelationGroup <em>Relation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsRelationGroup
	 * @generated
	 */
	public Adapter createRequirementsRelationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.QualityRequirement <em>Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.QualityRequirement
	 * @generated
	 */
	public Adapter createQualityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable <em>GReferrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable
	 * @generated
	 */
	public Adapter createGReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable
	 * @generated
	 */
	public Adapter createReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable <em>GIdentifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable
	 * @generated
	 */
	public Adapter createGIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement <em>EA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement
	 * @generated
	 */
	public Adapter createEAElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement <em>GEA Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement
	 * @generated
	 */
	public Adapter createGEAPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement <em>EA Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement
	 * @generated
	 */
	public Adapter createEAPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification <em>Traceable Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification
	 * @generated
	 */
	public Adapter createTraceableSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RequirementsAdapterFactory
