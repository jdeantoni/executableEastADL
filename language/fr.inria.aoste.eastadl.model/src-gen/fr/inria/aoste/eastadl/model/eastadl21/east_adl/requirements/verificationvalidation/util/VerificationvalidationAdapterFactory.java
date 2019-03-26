/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.util;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Relationship;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsRelationship;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.*;

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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage
 * @generated
 */
public class VerificationvalidationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VerificationvalidationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationvalidationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VerificationvalidationPackage.eINSTANCE;
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
	protected VerificationvalidationSwitch<Adapter> modelSwitch =
		new VerificationvalidationSwitch<Adapter>() {
			@Override
			public Adapter caseVerificationValidation(VerificationValidation object) {
				return createVerificationValidationAdapter();
			}
			@Override
			public Adapter caseVVActualOutcome(VVActualOutcome object) {
				return createVVActualOutcomeAdapter();
			}
			@Override
			public Adapter caseVVIntendedOutcome(VVIntendedOutcome object) {
				return createVVIntendedOutcomeAdapter();
			}
			@Override
			public Adapter caseVVLog(VVLog object) {
				return createVVLogAdapter();
			}
			@Override
			public Adapter caseVVProcedure(VVProcedure object) {
				return createVVProcedureAdapter();
			}
			@Override
			public Adapter caseVVStimuli(VVStimuli object) {
				return createVVStimuliAdapter();
			}
			@Override
			public Adapter caseVVTarget(VVTarget object) {
				return createVVTargetAdapter();
			}
			@Override
			public Adapter caseVerify(Verify object) {
				return createVerifyAdapter();
			}
			@Override
			public Adapter caseVVCase(VVCase object) {
				return createVVCaseAdapter();
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
			public Adapter caseGEAPackageableElement(GEAPackageableElement object) {
				return createGEAPackageableElementAdapter();
			}
			@Override
			public Adapter caseEAPackageableElement(EAPackageableElement object) {
				return createEAPackageableElementAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseTraceableSpecification(TraceableSpecification object) {
				return createTraceableSpecificationAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseRequirementsRelationship(RequirementsRelationship object) {
				return createRequirementsRelationshipAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation <em>Verification Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation
	 * @generated
	 */
	public Adapter createVerificationValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome <em>VV Actual Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome
	 * @generated
	 */
	public Adapter createVVActualOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcome <em>VV Intended Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcome
	 * @generated
	 */
	public Adapter createVVIntendedOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVLog <em>VV Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVLog
	 * @generated
	 */
	public Adapter createVVLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure <em>VV Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure
	 * @generated
	 */
	public Adapter createVVProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVStimuli <em>VV Stimuli</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVStimuli
	 * @generated
	 */
	public Adapter createVVStimuliAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVTarget <em>VV Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVTarget
	 * @generated
	 */
	public Adapter createVVTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.Verify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.Verify
	 * @generated
	 */
	public Adapter createVerifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase <em>VV Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase
	 * @generated
	 */
	public Adapter createVVCaseAdapter() {
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

} //VerificationvalidationAdapterFactory
