/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.PrecedenceConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precedence Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.PrecedenceConstraintImpl#getPreceding <em>Preceding</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.PrecedenceConstraintImpl#getSuccessive <em>Successive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrecedenceConstraintImpl extends TimingConstraintImpl implements PrecedenceConstraint {
	/**
	 * The cached value of the '{@link #getPreceding() <em>Preceding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreceding()
	 * @generated
	 * @ordered
	 */
	protected PrecedenceConstraint_preceding preceding;

	/**
	 * The cached value of the '{@link #getSuccessive() <em>Successive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessive()
	 * @generated
	 * @ordered
	 */
	protected PrecedenceConstraint_successive successive;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingPackage.Literals.PRECEDENCE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceConstraint_preceding getPreceding() {
		return preceding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreceding(PrecedenceConstraint_preceding newPreceding, NotificationChain msgs) {
		PrecedenceConstraint_preceding oldPreceding = preceding;
		preceding = newPreceding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING, oldPreceding, newPreceding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreceding(PrecedenceConstraint_preceding newPreceding) {
		if (newPreceding != preceding) {
			NotificationChain msgs = null;
			if (preceding != null)
				msgs = ((InternalEObject)preceding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING, null, msgs);
			if (newPreceding != null)
				msgs = ((InternalEObject)newPreceding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING, null, msgs);
			msgs = basicSetPreceding(newPreceding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING, newPreceding, newPreceding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceConstraint_successive getSuccessive() {
		return successive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccessive(PrecedenceConstraint_successive newSuccessive, NotificationChain msgs) {
		PrecedenceConstraint_successive oldSuccessive = successive;
		successive = newSuccessive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE, oldSuccessive, newSuccessive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessive(PrecedenceConstraint_successive newSuccessive) {
		if (newSuccessive != successive) {
			NotificationChain msgs = null;
			if (successive != null)
				msgs = ((InternalEObject)successive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE, null, msgs);
			if (newSuccessive != null)
				msgs = ((InternalEObject)newSuccessive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE, null, msgs);
			msgs = basicSetSuccessive(newSuccessive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE, newSuccessive, newSuccessive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING:
				return basicSetPreceding(null, msgs);
			case TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE:
				return basicSetSuccessive(null, msgs);
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
			case TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING:
				return getPreceding();
			case TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE:
				return getSuccessive();
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
			case TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING:
				setPreceding((PrecedenceConstraint_preceding)newValue);
				return;
			case TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE:
				setSuccessive((PrecedenceConstraint_successive)newValue);
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
			case TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING:
				setPreceding((PrecedenceConstraint_preceding)null);
				return;
			case TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE:
				setSuccessive((PrecedenceConstraint_successive)null);
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
			case TimingPackage.PRECEDENCE_CONSTRAINT__PRECEDING:
				return preceding != null;
			case TimingPackage.PRECEDENCE_CONSTRAINT__SUCCESSIVE:
				return successive != null;
		}
		return super.eIsSet(featureID);
	}

} //PrecedenceConstraintImpl
