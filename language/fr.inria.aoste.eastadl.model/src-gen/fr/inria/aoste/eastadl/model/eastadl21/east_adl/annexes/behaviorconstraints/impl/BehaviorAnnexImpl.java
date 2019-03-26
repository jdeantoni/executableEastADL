/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorAnnex;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage;

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
 * An implementation of the model object '<em><b>Behavior Annex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.BehaviorAnnexImpl#getBehaviorConstraint <em>Behavior Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorAnnexImpl extends ContextImpl implements BehaviorAnnex {
	/**
	 * The cached value of the '{@link #getBehaviorConstraint() <em>Behavior Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorConstraint> behaviorConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorAnnexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorconstraintsPackage.Literals.BEHAVIOR_ANNEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorConstraint> getBehaviorConstraint() {
		if (behaviorConstraint == null) {
			behaviorConstraint = new EObjectContainmentEList<BehaviorConstraint>(BehaviorConstraint.class, this, BehaviorconstraintsPackage.BEHAVIOR_ANNEX__BEHAVIOR_CONSTRAINT);
		}
		return behaviorConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorconstraintsPackage.BEHAVIOR_ANNEX__BEHAVIOR_CONSTRAINT:
				return ((InternalEList<?>)getBehaviorConstraint()).basicRemove(otherEnd, msgs);
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
			case BehaviorconstraintsPackage.BEHAVIOR_ANNEX__BEHAVIOR_CONSTRAINT:
				return getBehaviorConstraint();
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
			case BehaviorconstraintsPackage.BEHAVIOR_ANNEX__BEHAVIOR_CONSTRAINT:
				getBehaviorConstraint().clear();
				getBehaviorConstraint().addAll((Collection<? extends BehaviorConstraint>)newValue);
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
			case BehaviorconstraintsPackage.BEHAVIOR_ANNEX__BEHAVIOR_CONSTRAINT:
				getBehaviorConstraint().clear();
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
			case BehaviorconstraintsPackage.BEHAVIOR_ANNEX__BEHAVIOR_CONSTRAINT:
				return behaviorConstraint != null && !behaviorConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorAnnexImpl
