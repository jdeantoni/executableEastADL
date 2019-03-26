/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.PeriodicEventConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Event Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.impl.PeriodicEventConstraintImpl#getMinimumInterArrivalTime <em>Minimum Inter Arrival Time</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.impl.PeriodicEventConstraintImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.impl.PeriodicEventConstraintImpl#getJitter <em>Jitter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeriodicEventConstraintImpl extends EventConstraintImpl implements PeriodicEventConstraint {
	/**
	 * The cached value of the '{@link #getMinimumInterArrivalTime() <em>Minimum Inter Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumInterArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected TimeDuration minimumInterArrivalTime;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected TimeDuration period;

	/**
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected TimeDuration jitter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicEventConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingconstraintsPackage.Literals.PERIODIC_EVENT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDuration getMinimumInterArrivalTime() {
		return minimumInterArrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimumInterArrivalTime(TimeDuration newMinimumInterArrivalTime, NotificationChain msgs) {
		TimeDuration oldMinimumInterArrivalTime = minimumInterArrivalTime;
		minimumInterArrivalTime = newMinimumInterArrivalTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME, oldMinimumInterArrivalTime, newMinimumInterArrivalTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumInterArrivalTime(TimeDuration newMinimumInterArrivalTime) {
		if (newMinimumInterArrivalTime != minimumInterArrivalTime) {
			NotificationChain msgs = null;
			if (minimumInterArrivalTime != null)
				msgs = ((InternalEObject)minimumInterArrivalTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME, null, msgs);
			if (newMinimumInterArrivalTime != null)
				msgs = ((InternalEObject)newMinimumInterArrivalTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME, null, msgs);
			msgs = basicSetMinimumInterArrivalTime(newMinimumInterArrivalTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME, newMinimumInterArrivalTime, newMinimumInterArrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDuration getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(TimeDuration newPeriod, NotificationChain msgs) {
		TimeDuration oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(TimeDuration newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDuration getJitter() {
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJitter(TimeDuration newJitter, NotificationChain msgs) {
		TimeDuration oldJitter = jitter;
		jitter = newJitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__JITTER, oldJitter, newJitter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJitter(TimeDuration newJitter) {
		if (newJitter != jitter) {
			NotificationChain msgs = null;
			if (jitter != null)
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__JITTER, newJitter, newJitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME:
				return basicSetMinimumInterArrivalTime(null, msgs);
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__PERIOD:
				return basicSetPeriod(null, msgs);
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__JITTER:
				return basicSetJitter(null, msgs);
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
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME:
				return getMinimumInterArrivalTime();
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__PERIOD:
				return getPeriod();
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__JITTER:
				return getJitter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME:
				setMinimumInterArrivalTime((TimeDuration)newValue);
				return;
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__PERIOD:
				setPeriod((TimeDuration)newValue);
				return;
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__JITTER:
				setJitter((TimeDuration)newValue);
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
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME:
				setMinimumInterArrivalTime((TimeDuration)null);
				return;
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__PERIOD:
				setPeriod((TimeDuration)null);
				return;
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__JITTER:
				setJitter((TimeDuration)null);
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
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__MINIMUM_INTER_ARRIVAL_TIME:
				return minimumInterArrivalTime != null;
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__PERIOD:
				return period != null;
			case TimingconstraintsPackage.PERIODIC_EVENT_CONSTRAINT__JITTER:
				return jitter != null;
		}
		return super.eIsSet(featureID);
	}

} //PeriodicEventConstraintImpl
