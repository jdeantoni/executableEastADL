/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.InputSynchronizationConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.TimingconstraintsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Synchronization Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.timingconstraints.impl.InputSynchronizationConstraintImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputSynchronizationConstraintImpl extends AgeTimingConstraintImpl implements InputSynchronizationConstraint {
	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected TimeDuration width;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputSynchronizationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingconstraintsPackage.Literals.INPUT_SYNCHRONIZATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDuration getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidth(TimeDuration newWidth, NotificationChain msgs) {
		TimeDuration oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH, oldWidth, newWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(TimeDuration newWidth) {
		if (newWidth != width) {
			NotificationChain msgs = null;
			if (width != null)
				msgs = ((InternalEObject)width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject)newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH, newWidth, newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH:
				return basicSetWidth(null, msgs);
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
			case TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH:
				return getWidth();
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
			case TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH:
				setWidth((TimeDuration)newValue);
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
			case TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH:
				setWidth((TimeDuration)null);
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
			case TimingconstraintsPackage.INPUT_SYNCHRONIZATION_CONSTRAINT__WIDTH:
				return width != null;
		}
		return super.eIsSet(featureID);
	}

} //InputSynchronizationConstraintImpl
