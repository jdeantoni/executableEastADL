/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.*;

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
public class BehaviorconstraintsFactoryImpl extends EFactoryImpl implements BehaviorconstraintsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorconstraintsFactory init() {
		try {
			BehaviorconstraintsFactory theBehaviorconstraintsFactory = (BehaviorconstraintsFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviorconstraintsPackage.eNS_URI);
			if (theBehaviorconstraintsFactory != null) {
				return theBehaviorconstraintsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviorconstraintsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorconstraintsFactoryImpl() {
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
			case BehaviorconstraintsPackage.BEHAVIOR_ANNEX: return createBehaviorAnnex();
			case BehaviorconstraintsPackage.STATE_MACHINE_CONSTRAINT: return createStateMachineConstraint();
			case BehaviorconstraintsPackage.COMPUTATION_CONSTRAINT: return createComputationConstraint();
			case BehaviorconstraintsPackage.FLOW: return createFlow();
			case BehaviorconstraintsPackage.PARAMETER: return createParameter();
			case BehaviorconstraintsPackage.PARAMETER_CONDITION: return createParameterCondition();
			case BehaviorconstraintsPackage.PARAMETER_CONSTRAINT: return createParameterConstraint();
			case BehaviorconstraintsPackage.STATE: return createState();
			case BehaviorconstraintsPackage.TRANSFORMATION: return createTransformation();
			case BehaviorconstraintsPackage.TRANSITION: return createTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorAnnex createBehaviorAnnex() {
		BehaviorAnnexImpl behaviorAnnex = new BehaviorAnnexImpl();
		return behaviorAnnex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineConstraint createStateMachineConstraint() {
		StateMachineConstraintImpl stateMachineConstraint = new StateMachineConstraintImpl();
		return stateMachineConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationConstraint createComputationConstraint() {
		ComputationConstraintImpl computationConstraint = new ComputationConstraintImpl();
		return computationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCondition createParameterCondition() {
		ParameterConditionImpl parameterCondition = new ParameterConditionImpl();
		return parameterCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterConstraint createParameterConstraint() {
		ParameterConstraintImpl parameterConstraint = new ParameterConstraintImpl();
		return parameterConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorconstraintsPackage getBehaviorconstraintsPackage() {
		return (BehaviorconstraintsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviorconstraintsPackage getPackage() {
		return BehaviorconstraintsPackage.eINSTANCE;
	}

} //BehaviorconstraintsFactoryImpl
