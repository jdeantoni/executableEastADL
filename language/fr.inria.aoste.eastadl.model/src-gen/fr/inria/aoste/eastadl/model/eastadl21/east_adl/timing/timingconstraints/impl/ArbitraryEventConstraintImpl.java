/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.ArbitraryEventConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arbitrary Event Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.impl.ArbitraryEventConstraintImpl#getMinimumInterArrivalTime <em>Minimum Inter Arrival Time</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.impl.ArbitraryEventConstraintImpl#getMaximumInterArrivalTime <em>Maximum Inter Arrival Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArbitraryEventConstraintImpl extends EventConstraintImpl implements ArbitraryEventConstraint {
	/**
	 * The cached value of the '{@link #getMinimumInterArrivalTime() <em>Minimum Inter Arrival Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumInterArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeDuration> minimumInterArrivalTime;

	/**
	 * The cached value of the '{@link #getMaximumInterArrivalTime() <em>Maximum Inter Arrival Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumInterArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeDuration> maximumInterArrivalTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArbitraryEventConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingconstraintsPackage.Literals.ARBITRARY_EVENT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeDuration> getMinimumInterArrivalTime() {
		if (minimumInterArrivalTime == null) {
			minimumInterArrivalTime = new EObjectContainmentEList<TimeDuration>(TimeDuration.class, this, TimingconstraintsPackage.ARBITRARY_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME);
		}
		return minimumInterArrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeDuration> getMaximumInterArrivalTime() {
		if (maximumInterArrivalTime == null) {
			maximumInterArrivalTime = new EObjectContainmentEList<TimeDuration>(TimeDuration.class, this, TimingconstraintsPackage.ARBITRARY_EVENT_CONSTRAINT__MAXIMUM_INTER_ARRIVAL_TIME);
		}
		return maximumInterArrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingconstraintsPackage.ARBITRARY_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME:
				return ((InternalEList<?>)getMinimumInterArrivalTime()).basicRemove(otherEnd, msgs);
			case TimingconstraintsPackage.ARBITRARY_EVENT_CONSTRAINT__MAXIMUM_INTER_ARRIVAL_TIME:
				return ((InternalEList<?>)getMaximumInterArrivalTime()).basicRemove(otherEnd, msgs);
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
			case TimingconstraintsPackage.ARBITRARY_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME:
				return getMinimumInterArrivalTime();
			case TimingconstraintsPackage.ARBITRARY_EVENT_CONSTRAINT__MAXIMUM_INTER_ARRIVAL_TIME:
				return getMaximumInterArrivalTime();
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
			case TimingconstraintsPackage.ARBITRARY_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME:
				getMinimumInterArrivalTime().clear();
				getMinimumInterArrivalTime().addAll((Collection<? extends TimeDuration>)newValue);
				return;
			case TimingconstraintsPackage.ARBITRARY_EVENT_CONSTRAINT__MAXIMUM_INTER_ARRIVAL_TIME:
				getMaximumInterArrivalTime().clear();
				getMaximumInterArrivalTime().addAll((Collection<? extends TimeDuration>)newValue);
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
			case TimingconstraintsPackage.ARBITRARY_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME:
				getMinimumInterArrivalTime().clear();
				return;
			case TimingconstraintsPackage.ARBITRARY_EVENT_CONSTRAINT__MAXIMUM_INTER_ARRIVAL_TIME:
				getMaximumInterArrivalTime().clear();
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
			case TimingconstraintsPackage.ARBITRARY_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME:
				return minimumInterArrivalTime != null && !minimumInterArrivalTime.isEmpty();
			case TimingconstraintsPackage.ARBITRARY_EVENT_CONSTRAINT__MAXIMUM_INTER_ARRIVAL_TIME:
				return maximumInterArrivalTime != null && !maximumInterArrivalTime.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArbitraryEventConstraintImpl
