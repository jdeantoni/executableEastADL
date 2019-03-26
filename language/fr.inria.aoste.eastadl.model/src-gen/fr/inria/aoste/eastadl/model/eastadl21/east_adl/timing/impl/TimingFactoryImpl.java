/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.*;

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
public class TimingFactoryImpl extends EFactoryImpl implements TimingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimingFactory init() {
		try {
			TimingFactory theTimingFactory = (TimingFactory)EPackage.Registry.INSTANCE.getEFactory(TimingPackage.eNS_URI);
			if (theTimingFactory != null) {
				return theTimingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingFactoryImpl() {
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
			case TimingPackage.EVENT_CHAIN: return createEventChain();
			case TimingPackage.EXECUTION_TIME_CONSTRAINT: return createExecutionTimeConstraint();
			case TimingPackage.PRECEDENCE_CONSTRAINT: return createPrecedenceConstraint();
			case TimingPackage.TIME_DURATION: return createTimeDuration();
			case TimingPackage.TIMING: return createTiming();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChain createEventChain() {
		EventChainImpl eventChain = new EventChainImpl();
		return eventChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTimeConstraint createExecutionTimeConstraint() {
		ExecutionTimeConstraintImpl executionTimeConstraint = new ExecutionTimeConstraintImpl();
		return executionTimeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceConstraint createPrecedenceConstraint() {
		PrecedenceConstraintImpl precedenceConstraint = new PrecedenceConstraintImpl();
		return precedenceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDuration createTimeDuration() {
		TimeDurationImpl timeDuration = new TimeDurationImpl();
		return timeDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing createTiming() {
		TimingImpl timing = new TimingImpl();
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingPackage getTimingPackage() {
		return (TimingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimingPackage getPackage() {
		return TimingPackage.eINSTANCE;
	}

} //TimingFactoryImpl
