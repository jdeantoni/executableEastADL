/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Flow;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Parameter;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.FlowImpl#getSinkParameter <em>Sink Parameter</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.FlowImpl#getOrderedSegment <em>Ordered Segment</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.FlowImpl#getSourceParameter <em>Source Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowImpl extends EAElementImpl implements Flow {
	/**
	 * The cached value of the '{@link #getSinkParameter() <em>Sink Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinkParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> sinkParameter;

	/**
	 * The cached value of the '{@link #getOrderedSegment() <em>Ordered Segment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<Flow> orderedSegment;

	/**
	 * The cached value of the '{@link #getSourceParameter() <em>Source Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> sourceParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorconstraintsPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getSinkParameter() {
		if (sinkParameter == null) {
			sinkParameter = new EObjectResolvingEList<Parameter>(Parameter.class, this, BehaviorconstraintsPackage.FLOW__SINK_PARAMETER);
		}
		return sinkParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getOrderedSegment() {
		if (orderedSegment == null) {
			orderedSegment = new EObjectResolvingEList<Flow>(Flow.class, this, BehaviorconstraintsPackage.FLOW__ORDERED_SEGMENT);
		}
		return orderedSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getSourceParameter() {
		if (sourceParameter == null) {
			sourceParameter = new EObjectResolvingEList<Parameter>(Parameter.class, this, BehaviorconstraintsPackage.FLOW__SOURCE_PARAMETER);
		}
		return sourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorconstraintsPackage.FLOW__SINK_PARAMETER:
				return getSinkParameter();
			case BehaviorconstraintsPackage.FLOW__ORDERED_SEGMENT:
				return getOrderedSegment();
			case BehaviorconstraintsPackage.FLOW__SOURCE_PARAMETER:
				return getSourceParameter();
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
			case BehaviorconstraintsPackage.FLOW__SINK_PARAMETER:
				getSinkParameter().clear();
				getSinkParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case BehaviorconstraintsPackage.FLOW__ORDERED_SEGMENT:
				getOrderedSegment().clear();
				getOrderedSegment().addAll((Collection<? extends Flow>)newValue);
				return;
			case BehaviorconstraintsPackage.FLOW__SOURCE_PARAMETER:
				getSourceParameter().clear();
				getSourceParameter().addAll((Collection<? extends Parameter>)newValue);
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
			case BehaviorconstraintsPackage.FLOW__SINK_PARAMETER:
				getSinkParameter().clear();
				return;
			case BehaviorconstraintsPackage.FLOW__ORDERED_SEGMENT:
				getOrderedSegment().clear();
				return;
			case BehaviorconstraintsPackage.FLOW__SOURCE_PARAMETER:
				getSourceParameter().clear();
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
			case BehaviorconstraintsPackage.FLOW__SINK_PARAMETER:
				return sinkParameter != null && !sinkParameter.isEmpty();
			case BehaviorconstraintsPackage.FLOW__ORDERED_SEGMENT:
				return orderedSegment != null && !orderedSegment.isEmpty();
			case BehaviorconstraintsPackage.FLOW__SOURCE_PARAMETER:
				return sourceParameter != null && !sourceParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowImpl
