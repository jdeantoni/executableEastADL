/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.impl.AtpInstanceRefImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_target;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.AllocationTarget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Allocation target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.impl.FunctionAllocation_targetImpl#getAllocationTarget_context <em>Allocation Target context</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.impl.FunctionAllocation_targetImpl#getAllocationTarget <em>Allocation Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionAllocation_targetImpl extends AtpInstanceRefImpl implements FunctionAllocation_target {
	/**
	 * The cached value of the '{@link #getAllocationTarget_context() <em>Allocation Target context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationTarget_context()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationTarget> allocationTarget_context;

	/**
	 * The cached value of the '{@link #getAllocationTarget() <em>Allocation Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationTarget()
	 * @generated
	 * @ordered
	 */
	protected AllocationTarget allocationTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionAllocation_targetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.FUNCTION_ALLOCATION_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationTarget> getAllocationTarget_context() {
		if (allocationTarget_context == null) {
			allocationTarget_context = new EObjectResolvingEList<AllocationTarget>(AllocationTarget.class, this, _instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT);
		}
		return allocationTarget_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationTarget getAllocationTarget() {
		if (allocationTarget != null && allocationTarget.eIsProxy()) {
			InternalEObject oldAllocationTarget = (InternalEObject)allocationTarget;
			allocationTarget = (AllocationTarget)eResolveProxy(oldAllocationTarget);
			if (allocationTarget != oldAllocationTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET, oldAllocationTarget, allocationTarget));
			}
		}
		return allocationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationTarget basicGetAllocationTarget() {
		return allocationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationTarget(AllocationTarget newAllocationTarget) {
		AllocationTarget oldAllocationTarget = allocationTarget;
		allocationTarget = newAllocationTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET, oldAllocationTarget, allocationTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT:
				return getAllocationTarget_context();
			case _instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET:
				if (resolve) return getAllocationTarget();
				return basicGetAllocationTarget();
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
			case _instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT:
				getAllocationTarget_context().clear();
				getAllocationTarget_context().addAll((Collection<? extends AllocationTarget>)newValue);
				return;
			case _instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET:
				setAllocationTarget((AllocationTarget)newValue);
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
			case _instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT:
				getAllocationTarget_context().clear();
				return;
			case _instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET:
				setAllocationTarget((AllocationTarget)null);
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
			case _instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT:
				return allocationTarget_context != null && !allocationTarget_context.isEmpty();
			case _instancerefPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET:
				return allocationTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionAllocation_targetImpl
