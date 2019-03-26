/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorConstraint;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehavior;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionTrigger;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.Mode;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.ErrorBehavior;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.BehaviorConstraintImpl#getConstrainedMode <em>Constrained Mode</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.BehaviorConstraintImpl#getRelatedVehicleFeature <em>Related Vehicle Feature</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.BehaviorConstraintImpl#getConstrainedFunctionBehavior <em>Constrained Function Behavior</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.BehaviorConstraintImpl#getConstrainedErrorBehavior <em>Constrained Error Behavior</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.BehaviorConstraintImpl#getConstrainedFunctionTrigger <em>Constrained Function Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BehaviorConstraintImpl extends EAElementImpl implements BehaviorConstraint {
	/**
	 * The cached value of the '{@link #getConstrainedMode() <em>Constrained Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> constrainedMode;

	/**
	 * The cached value of the '{@link #getRelatedVehicleFeature() <em>Related Vehicle Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedVehicleFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleFeature> relatedVehicleFeature;

	/**
	 * The cached value of the '{@link #getConstrainedFunctionBehavior() <em>Constrained Function Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedFunctionBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBehavior> constrainedFunctionBehavior;

	/**
	 * The cached value of the '{@link #getConstrainedErrorBehavior() <em>Constrained Error Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedErrorBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorBehavior> constrainedErrorBehavior;

	/**
	 * The cached value of the '{@link #getConstrainedFunctionTrigger() <em>Constrained Function Trigger</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedFunctionTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionTrigger> constrainedFunctionTrigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorconstraintsPackage.Literals.BEHAVIOR_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getConstrainedMode() {
		if (constrainedMode == null) {
			constrainedMode = new EObjectResolvingEList<Mode>(Mode.class, this, BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_MODE);
		}
		return constrainedMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VehicleFeature> getRelatedVehicleFeature() {
		if (relatedVehicleFeature == null) {
			relatedVehicleFeature = new EObjectResolvingEList<VehicleFeature>(VehicleFeature.class, this, BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__RELATED_VEHICLE_FEATURE);
		}
		return relatedVehicleFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBehavior> getConstrainedFunctionBehavior() {
		if (constrainedFunctionBehavior == null) {
			constrainedFunctionBehavior = new EObjectResolvingEList<FunctionBehavior>(FunctionBehavior.class, this, BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_BEHAVIOR);
		}
		return constrainedFunctionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorBehavior> getConstrainedErrorBehavior() {
		if (constrainedErrorBehavior == null) {
			constrainedErrorBehavior = new EObjectResolvingEList<ErrorBehavior>(ErrorBehavior.class, this, BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_ERROR_BEHAVIOR);
		}
		return constrainedErrorBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionTrigger> getConstrainedFunctionTrigger() {
		if (constrainedFunctionTrigger == null) {
			constrainedFunctionTrigger = new EObjectResolvingEList<FunctionTrigger>(FunctionTrigger.class, this, BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_TRIGGER);
		}
		return constrainedFunctionTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_MODE:
				return getConstrainedMode();
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__RELATED_VEHICLE_FEATURE:
				return getRelatedVehicleFeature();
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_BEHAVIOR:
				return getConstrainedFunctionBehavior();
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_ERROR_BEHAVIOR:
				return getConstrainedErrorBehavior();
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_TRIGGER:
				return getConstrainedFunctionTrigger();
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
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_MODE:
				getConstrainedMode().clear();
				getConstrainedMode().addAll((Collection<? extends Mode>)newValue);
				return;
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__RELATED_VEHICLE_FEATURE:
				getRelatedVehicleFeature().clear();
				getRelatedVehicleFeature().addAll((Collection<? extends VehicleFeature>)newValue);
				return;
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_BEHAVIOR:
				getConstrainedFunctionBehavior().clear();
				getConstrainedFunctionBehavior().addAll((Collection<? extends FunctionBehavior>)newValue);
				return;
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_ERROR_BEHAVIOR:
				getConstrainedErrorBehavior().clear();
				getConstrainedErrorBehavior().addAll((Collection<? extends ErrorBehavior>)newValue);
				return;
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_TRIGGER:
				getConstrainedFunctionTrigger().clear();
				getConstrainedFunctionTrigger().addAll((Collection<? extends FunctionTrigger>)newValue);
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
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_MODE:
				getConstrainedMode().clear();
				return;
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__RELATED_VEHICLE_FEATURE:
				getRelatedVehicleFeature().clear();
				return;
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_BEHAVIOR:
				getConstrainedFunctionBehavior().clear();
				return;
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_ERROR_BEHAVIOR:
				getConstrainedErrorBehavior().clear();
				return;
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_TRIGGER:
				getConstrainedFunctionTrigger().clear();
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
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_MODE:
				return constrainedMode != null && !constrainedMode.isEmpty();
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__RELATED_VEHICLE_FEATURE:
				return relatedVehicleFeature != null && !relatedVehicleFeature.isEmpty();
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_BEHAVIOR:
				return constrainedFunctionBehavior != null && !constrainedFunctionBehavior.isEmpty();
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_ERROR_BEHAVIOR:
				return constrainedErrorBehavior != null && !constrainedErrorBehavior.isEmpty();
			case BehaviorconstraintsPackage.BEHAVIOR_CONSTRAINT__CONSTRAINED_FUNCTION_TRIGGER:
				return constrainedFunctionTrigger != null && !constrainedFunctionTrigger.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorConstraintImpl
