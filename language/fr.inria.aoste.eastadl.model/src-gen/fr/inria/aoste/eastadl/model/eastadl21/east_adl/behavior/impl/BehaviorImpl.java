/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Behavior;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehavior;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionTrigger;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorImpl#getModeGroup <em>Mode Group</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.BehaviorImpl#getFunctionTrigger <em>Function Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorImpl extends ContextImpl implements Behavior {
	/**
	 * The cached value of the '{@link #getModeGroup() <em>Mode Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeGroup> modeGroup;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBehavior> behavior;

	/**
	 * The cached value of the '{@link #getFunctionTrigger() <em>Function Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionTrigger> functionTrigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeGroup> getModeGroup() {
		if (modeGroup == null) {
			modeGroup = new EObjectContainmentEList<ModeGroup>(ModeGroup.class, this, BehaviorPackage.BEHAVIOR__MODE_GROUP);
		}
		return modeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBehavior> getBehavior() {
		if (behavior == null) {
			behavior = new EObjectContainmentEList<FunctionBehavior>(FunctionBehavior.class, this, BehaviorPackage.BEHAVIOR__BEHAVIOR);
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionTrigger> getFunctionTrigger() {
		if (functionTrigger == null) {
			functionTrigger = new EObjectContainmentEList<FunctionTrigger>(FunctionTrigger.class, this, BehaviorPackage.BEHAVIOR__FUNCTION_TRIGGER);
		}
		return functionTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.BEHAVIOR__MODE_GROUP:
				return ((InternalEList<?>)getModeGroup()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.BEHAVIOR__BEHAVIOR:
				return ((InternalEList<?>)getBehavior()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.BEHAVIOR__FUNCTION_TRIGGER:
				return ((InternalEList<?>)getFunctionTrigger()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.BEHAVIOR__MODE_GROUP:
				return getModeGroup();
			case BehaviorPackage.BEHAVIOR__BEHAVIOR:
				return getBehavior();
			case BehaviorPackage.BEHAVIOR__FUNCTION_TRIGGER:
				return getFunctionTrigger();
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
			case BehaviorPackage.BEHAVIOR__MODE_GROUP:
				getModeGroup().clear();
				getModeGroup().addAll((Collection<? extends ModeGroup>)newValue);
				return;
			case BehaviorPackage.BEHAVIOR__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends FunctionBehavior>)newValue);
				return;
			case BehaviorPackage.BEHAVIOR__FUNCTION_TRIGGER:
				getFunctionTrigger().clear();
				getFunctionTrigger().addAll((Collection<? extends FunctionTrigger>)newValue);
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
			case BehaviorPackage.BEHAVIOR__MODE_GROUP:
				getModeGroup().clear();
				return;
			case BehaviorPackage.BEHAVIOR__BEHAVIOR:
				getBehavior().clear();
				return;
			case BehaviorPackage.BEHAVIOR__FUNCTION_TRIGGER:
				getFunctionTrigger().clear();
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
			case BehaviorPackage.BEHAVIOR__MODE_GROUP:
				return modeGroup != null && !modeGroup.isEmpty();
			case BehaviorPackage.BEHAVIOR__BEHAVIOR:
				return behavior != null && !behavior.isEmpty();
			case BehaviorPackage.BEHAVIOR__FUNCTION_TRIGGER:
				return functionTrigger != null && !functionTrigger.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorImpl
