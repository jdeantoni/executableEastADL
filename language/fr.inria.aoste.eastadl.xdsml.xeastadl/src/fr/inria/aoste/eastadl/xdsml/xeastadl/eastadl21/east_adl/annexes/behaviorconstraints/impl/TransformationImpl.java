/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.ComputationConstraint;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.Flow;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.Parameter;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.Transformation;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransformationImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransformationImpl#getOutgoingFlow <em>Outgoing Flow</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransformationImpl#getIncomingFlow <em>Incoming Flow</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransformationImpl#getInOut <em>In Out</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransformationImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransformationImpl#getInvariantCondition <em>Invariant Condition</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransformationImpl#getSubComputationConstraint <em>Sub Computation Constraint</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransformationImpl#getIn <em>In</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransformationImpl#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends EAElementImpl implements Transformation {
	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCondition> postCondition;

	/**
	 * The cached value of the '{@link #getOutgoingFlow() <em>Outgoing Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<Flow> outgoingFlow;

	/**
	 * The cached value of the '{@link #getIncomingFlow() <em>Incoming Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<Flow> incomingFlow;

	/**
	 * The cached value of the '{@link #getInOut() <em>In Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> inOut;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCondition> preCondition;

	/**
	 * The cached value of the '{@link #getInvariantCondition() <em>Invariant Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCondition> invariantCondition;

	/**
	 * The cached value of the '{@link #getSubComputationConstraint() <em>Sub Computation Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubComputationConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputationConstraint> subComputationConstraint;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> out;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorconstraintsPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCondition> getPostCondition() {
		if (postCondition == null) {
			postCondition = new EObjectResolvingEList<ParameterCondition>(ParameterCondition.class, this, BehaviorconstraintsPackage.TRANSFORMATION__POST_CONDITION);
		}
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getOutgoingFlow() {
		if (outgoingFlow == null) {
			outgoingFlow = new EObjectResolvingEList<Flow>(Flow.class, this, BehaviorconstraintsPackage.TRANSFORMATION__OUTGOING_FLOW);
		}
		return outgoingFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getIncomingFlow() {
		if (incomingFlow == null) {
			incomingFlow = new EObjectResolvingEList<Flow>(Flow.class, this, BehaviorconstraintsPackage.TRANSFORMATION__INCOMING_FLOW);
		}
		return incomingFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getInOut() {
		if (inOut == null) {
			inOut = new EObjectResolvingEList<Parameter>(Parameter.class, this, BehaviorconstraintsPackage.TRANSFORMATION__IN_OUT);
		}
		return inOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCondition> getPreCondition() {
		if (preCondition == null) {
			preCondition = new EObjectResolvingEList<ParameterCondition>(ParameterCondition.class, this, BehaviorconstraintsPackage.TRANSFORMATION__PRE_CONDITION);
		}
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCondition> getInvariantCondition() {
		if (invariantCondition == null) {
			invariantCondition = new EObjectResolvingEList<ParameterCondition>(ParameterCondition.class, this, BehaviorconstraintsPackage.TRANSFORMATION__INVARIANT_CONDITION);
		}
		return invariantCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComputationConstraint> getSubComputationConstraint() {
		if (subComputationConstraint == null) {
			subComputationConstraint = new EObjectResolvingEList<ComputationConstraint>(ComputationConstraint.class, this, BehaviorconstraintsPackage.TRANSFORMATION__SUB_COMPUTATION_CONSTRAINT);
		}
		return subComputationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getIn() {
		if (in == null) {
			in = new EObjectResolvingEList<Parameter>(Parameter.class, this, BehaviorconstraintsPackage.TRANSFORMATION__IN);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOut() {
		if (out == null) {
			out = new EObjectResolvingEList<Parameter>(Parameter.class, this, BehaviorconstraintsPackage.TRANSFORMATION__OUT);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorconstraintsPackage.TRANSFORMATION__POST_CONDITION:
				return getPostCondition();
			case BehaviorconstraintsPackage.TRANSFORMATION__OUTGOING_FLOW:
				return getOutgoingFlow();
			case BehaviorconstraintsPackage.TRANSFORMATION__INCOMING_FLOW:
				return getIncomingFlow();
			case BehaviorconstraintsPackage.TRANSFORMATION__IN_OUT:
				return getInOut();
			case BehaviorconstraintsPackage.TRANSFORMATION__PRE_CONDITION:
				return getPreCondition();
			case BehaviorconstraintsPackage.TRANSFORMATION__INVARIANT_CONDITION:
				return getInvariantCondition();
			case BehaviorconstraintsPackage.TRANSFORMATION__SUB_COMPUTATION_CONSTRAINT:
				return getSubComputationConstraint();
			case BehaviorconstraintsPackage.TRANSFORMATION__IN:
				return getIn();
			case BehaviorconstraintsPackage.TRANSFORMATION__OUT:
				return getOut();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorconstraintsPackage.TRANSFORMATION__POST_CONDITION:
				getPostCondition().clear();
				getPostCondition().addAll((Collection<? extends ParameterCondition>)newValue);
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__OUTGOING_FLOW:
				getOutgoingFlow().clear();
				getOutgoingFlow().addAll((Collection<? extends Flow>)newValue);
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__INCOMING_FLOW:
				getIncomingFlow().clear();
				getIncomingFlow().addAll((Collection<? extends Flow>)newValue);
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__IN_OUT:
				getInOut().clear();
				getInOut().addAll((Collection<? extends Parameter>)newValue);
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__PRE_CONDITION:
				getPreCondition().clear();
				getPreCondition().addAll((Collection<? extends ParameterCondition>)newValue);
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__INVARIANT_CONDITION:
				getInvariantCondition().clear();
				getInvariantCondition().addAll((Collection<? extends ParameterCondition>)newValue);
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__SUB_COMPUTATION_CONSTRAINT:
				getSubComputationConstraint().clear();
				getSubComputationConstraint().addAll((Collection<? extends ComputationConstraint>)newValue);
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Parameter>)newValue);
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Parameter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BehaviorconstraintsPackage.TRANSFORMATION__POST_CONDITION:
				getPostCondition().clear();
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__OUTGOING_FLOW:
				getOutgoingFlow().clear();
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__INCOMING_FLOW:
				getIncomingFlow().clear();
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__IN_OUT:
				getInOut().clear();
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__PRE_CONDITION:
				getPreCondition().clear();
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__INVARIANT_CONDITION:
				getInvariantCondition().clear();
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__SUB_COMPUTATION_CONSTRAINT:
				getSubComputationConstraint().clear();
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__IN:
				getIn().clear();
				return;
			case BehaviorconstraintsPackage.TRANSFORMATION__OUT:
				getOut().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BehaviorconstraintsPackage.TRANSFORMATION__POST_CONDITION:
				return postCondition != null && !postCondition.isEmpty();
			case BehaviorconstraintsPackage.TRANSFORMATION__OUTGOING_FLOW:
				return outgoingFlow != null && !outgoingFlow.isEmpty();
			case BehaviorconstraintsPackage.TRANSFORMATION__INCOMING_FLOW:
				return incomingFlow != null && !incomingFlow.isEmpty();
			case BehaviorconstraintsPackage.TRANSFORMATION__IN_OUT:
				return inOut != null && !inOut.isEmpty();
			case BehaviorconstraintsPackage.TRANSFORMATION__PRE_CONDITION:
				return preCondition != null && !preCondition.isEmpty();
			case BehaviorconstraintsPackage.TRANSFORMATION__INVARIANT_CONDITION:
				return invariantCondition != null && !invariantCondition.isEmpty();
			case BehaviorconstraintsPackage.TRANSFORMATION__SUB_COMPUTATION_CONSTRAINT:
				return subComputationConstraint != null && !subComputationConstraint.isEmpty();
			case BehaviorconstraintsPackage.TRANSFORMATION__IN:
				return in != null && !in.isEmpty();
			case BehaviorconstraintsPackage.TRANSFORMATION__OUT:
				return out != null && !out.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransformationImpl
