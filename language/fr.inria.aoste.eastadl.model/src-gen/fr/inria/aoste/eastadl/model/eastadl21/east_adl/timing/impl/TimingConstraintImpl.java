/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingConstraintImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingConstraintImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.TimingConstraintImpl#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TimingConstraintImpl extends EAElementImpl implements TimingConstraint {
	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected TimeDuration lower;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected TimeDuration upper;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> mode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingPackage.Literals.TIMING_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDuration getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLower(TimeDuration newLower, NotificationChain msgs) {
		TimeDuration oldLower = lower;
		lower = newLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingPackage.TIMING_CONSTRAINT__LOWER, oldLower, newLower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(TimeDuration newLower) {
		if (newLower != lower) {
			NotificationChain msgs = null;
			if (lower != null)
				msgs = ((InternalEObject)lower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingPackage.TIMING_CONSTRAINT__LOWER, null, msgs);
			if (newLower != null)
				msgs = ((InternalEObject)newLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingPackage.TIMING_CONSTRAINT__LOWER, null, msgs);
			msgs = basicSetLower(newLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.TIMING_CONSTRAINT__LOWER, newLower, newLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDuration getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpper(TimeDuration newUpper, NotificationChain msgs) {
		TimeDuration oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingPackage.TIMING_CONSTRAINT__UPPER, oldUpper, newUpper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(TimeDuration newUpper) {
		if (newUpper != upper) {
			NotificationChain msgs = null;
			if (upper != null)
				msgs = ((InternalEObject)upper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingPackage.TIMING_CONSTRAINT__UPPER, null, msgs);
			if (newUpper != null)
				msgs = ((InternalEObject)newUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingPackage.TIMING_CONSTRAINT__UPPER, null, msgs);
			msgs = basicSetUpper(newUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.TIMING_CONSTRAINT__UPPER, newUpper, newUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getMode() {
		if (mode == null) {
			mode = new EObjectResolvingEList<Mode>(Mode.class, this, TimingPackage.TIMING_CONSTRAINT__MODE);
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingPackage.TIMING_CONSTRAINT__LOWER:
				return basicSetLower(null, msgs);
			case TimingPackage.TIMING_CONSTRAINT__UPPER:
				return basicSetUpper(null, msgs);
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
			case TimingPackage.TIMING_CONSTRAINT__LOWER:
				return getLower();
			case TimingPackage.TIMING_CONSTRAINT__UPPER:
				return getUpper();
			case TimingPackage.TIMING_CONSTRAINT__MODE:
				return getMode();
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
			case TimingPackage.TIMING_CONSTRAINT__LOWER:
				setLower((TimeDuration)newValue);
				return;
			case TimingPackage.TIMING_CONSTRAINT__UPPER:
				setUpper((TimeDuration)newValue);
				return;
			case TimingPackage.TIMING_CONSTRAINT__MODE:
				getMode().clear();
				getMode().addAll((Collection<? extends Mode>)newValue);
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
			case TimingPackage.TIMING_CONSTRAINT__LOWER:
				setLower((TimeDuration)null);
				return;
			case TimingPackage.TIMING_CONSTRAINT__UPPER:
				setUpper((TimeDuration)null);
				return;
			case TimingPackage.TIMING_CONSTRAINT__MODE:
				getMode().clear();
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
			case TimingPackage.TIMING_CONSTRAINT__LOWER:
				return lower != null;
			case TimingPackage.TIMING_CONSTRAINT__UPPER:
				return upper != null;
			case TimingPackage.TIMING_CONSTRAINT__MODE:
				return mode != null && !mode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimingConstraintImpl
