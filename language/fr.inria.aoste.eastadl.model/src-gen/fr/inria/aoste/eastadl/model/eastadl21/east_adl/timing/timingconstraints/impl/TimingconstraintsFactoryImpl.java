/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingconstraintsFactoryImpl extends EFactoryImpl implements TimingconstraintsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimingconstraintsFactory init() {
		try {
			TimingconstraintsFactory theTimingconstraintsFactory = (TimingconstraintsFactory)EPackage.Registry.INSTANCE.getEFactory(TimingconstraintsPackage.eNS_URI);
			if (theTimingconstraintsFactory != null) {
				return theTimingconstraintsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimingconstraintsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingconstraintsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TimingconstraintsPackage.ARBITRARY_EVENT_CONSTRAINT: return createArbitraryEventConstraint();
			case TimingconstraintsPackage.PATTERN_EVENT_CONSTRAINT: return createPatternEventConstraint();
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT: return createPeriodicEventConstraint();
			case TimingconstraintsPackage.SPORADIC_EVENT_CONSTRAINT: return createSporadicEventConstraint();
			case TimingconstraintsPackage.AGE_TIMING_CONSTRAINT: return createAgeTimingConstraint();
			case TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT: return createInputSynchronizationConstraint();
			case TimingconstraintsPackage.OUTPUT_SYNCHRONIZATION_CONSTRAINT: return createOutputSynchronizationConstraint();
			case TimingconstraintsPackage.REACTION_CONSTRAINT: return createReactionConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitraryEventConstraint createArbitraryEventConstraint() {
		ArbitraryEventConstraintImpl arbitraryEventConstraint = new ArbitraryEventConstraintImpl();
		return arbitraryEventConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternEventConstraint createPatternEventConstraint() {
		PatternEventConstraintImpl patternEventConstraint = new PatternEventConstraintImpl();
		return patternEventConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicEventConstraint createPeriodicEventConstraint() {
		PeriodicEventConstraintImpl periodicEventConstraint = new PeriodicEventConstraintImpl();
		return periodicEventConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicEventConstraint createSporadicEventConstraint() {
		SporadicEventConstraintImpl sporadicEventConstraint = new SporadicEventConstraintImpl();
		return sporadicEventConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeTimingConstraint createAgeTimingConstraint() {
		AgeTimingConstraintImpl ageTimingConstraint = new AgeTimingConstraintImpl();
		return ageTimingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSynchronizationConstraint createInputSynchronizationConstraint() {
		InputSynchronizationConstraintImpl inputSynchronizationConstraint = new InputSynchronizationConstraintImpl();
		return inputSynchronizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSynchronizationConstraint createOutputSynchronizationConstraint() {
		OutputSynchronizationConstraintImpl outputSynchronizationConstraint = new OutputSynchronizationConstraintImpl();
		return outputSynchronizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionConstraint createReactionConstraint() {
		ReactionConstraintImpl reactionConstraint = new ReactionConstraintImpl();
		return reactionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingconstraintsPackage getTimingconstraintsPackage() {
		return (TimingconstraintsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimingconstraintsPackage getPackage() {
		return TimingconstraintsPackage.eINSTANCE;
	}

} //TimingconstraintsFactoryImpl
