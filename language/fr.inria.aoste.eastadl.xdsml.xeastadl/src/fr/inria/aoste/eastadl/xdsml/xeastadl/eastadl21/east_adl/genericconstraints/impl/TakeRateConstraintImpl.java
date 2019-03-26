/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.TakeRateConstraint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Take Rate Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.TakeRateConstraintImpl#getTakeRate <em>Take Rate</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.genericconstraints.impl.TakeRateConstraintImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TakeRateConstraintImpl extends GenericConstraintImpl implements TakeRateConstraint {
	/**
	 * The default value of the '{@link #getTakeRate() <em>Take Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakeRate()
	 * @generated
	 * @ordered
	 */
	protected static final Double TAKE_RATE_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getTakeRate() <em>Take Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakeRate()
	 * @generated
	 * @ordered
	 */
	protected Double takeRate = TAKE_RATE_EDEFAULT;

	/**
	 * This is true if the Take Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean takeRateESet;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifiable> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TakeRateConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericconstraintsPackage.Literals.TAKE_RATE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTakeRate() {
		return takeRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTakeRate(Double newTakeRate) {
		Double oldTakeRate = takeRate;
		takeRate = newTakeRate;
		boolean oldTakeRateESet = takeRateESet;
		takeRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericconstraintsPackage.TAKE_RATE_CONSTRAINT__TAKE_RATE, oldTakeRate, takeRate, !oldTakeRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTakeRate() {
		Double oldTakeRate = takeRate;
		boolean oldTakeRateESet = takeRateESet;
		takeRate = TAKE_RATE_EDEFAULT;
		takeRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GenericconstraintsPackage.TAKE_RATE_CONSTRAINT__TAKE_RATE, oldTakeRate, TAKE_RATE_EDEFAULT, oldTakeRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTakeRate() {
		return takeRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifiable> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, GenericconstraintsPackage.TAKE_RATE_CONSTRAINT__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericconstraintsPackage.TAKE_RATE_CONSTRAINT__TAKE_RATE:
				return getTakeRate();
			case GenericconstraintsPackage.TAKE_RATE_CONSTRAINT__SOURCE:
				return getSource();
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
			case GenericconstraintsPackage.TAKE_RATE_CONSTRAINT__TAKE_RATE:
				setTakeRate((Double)newValue);
				return;
			case GenericconstraintsPackage.TAKE_RATE_CONSTRAINT__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Identifiable>)newValue);
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
			case GenericconstraintsPackage.TAKE_RATE_CONSTRAINT__TAKE_RATE:
				unsetTakeRate();
				return;
			case GenericconstraintsPackage.TAKE_RATE_CONSTRAINT__SOURCE:
				getSource().clear();
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
			case GenericconstraintsPackage.TAKE_RATE_CONSTRAINT__TAKE_RATE:
				return isSetTakeRate();
			case GenericconstraintsPackage.TAKE_RATE_CONSTRAINT__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (takeRate: ");
		if (takeRateESet) result.append(takeRate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TakeRateConstraintImpl
