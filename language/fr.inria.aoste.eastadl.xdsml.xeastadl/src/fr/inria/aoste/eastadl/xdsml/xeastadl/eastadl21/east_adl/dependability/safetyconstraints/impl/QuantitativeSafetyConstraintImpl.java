/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantitative Safety Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.QuantitativeSafetyConstraintImpl#getFailureRate <em>Failure Rate</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.QuantitativeSafetyConstraintImpl#getRepairRate <em>Repair Rate</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl.QuantitativeSafetyConstraintImpl#getConstrainedFaultFailure <em>Constrained Fault Failure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantitativeSafetyConstraintImpl extends TraceableSpecificationImpl implements QuantitativeSafetyConstraint {
	/**
	 * The default value of the '{@link #getFailureRate() <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRate()
	 * @generated
	 * @ordered
	 */
	protected static final Double FAILURE_RATE_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getFailureRate() <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRate()
	 * @generated
	 * @ordered
	 */
	protected Double failureRate = FAILURE_RATE_EDEFAULT;

	/**
	 * This is true if the Failure Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean failureRateESet;

	/**
	 * The default value of the '{@link #getRepairRate() <em>Repair Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepairRate()
	 * @generated
	 * @ordered
	 */
	protected static final Double REPAIR_RATE_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getRepairRate() <em>Repair Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepairRate()
	 * @generated
	 * @ordered
	 */
	protected Double repairRate = REPAIR_RATE_EDEFAULT;

	/**
	 * This is true if the Repair Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repairRateESet;

	/**
	 * The cached value of the '{@link #getConstrainedFaultFailure() <em>Constrained Fault Failure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedFaultFailure()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultFailure> constrainedFaultFailure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantitativeSafetyConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetyconstraintsPackage.Literals.QUANTITATIVE_SAFETY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFailureRate() {
		return failureRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureRate(Double newFailureRate) {
		Double oldFailureRate = failureRate;
		failureRate = newFailureRate;
		boolean oldFailureRateESet = failureRateESet;
		failureRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__FAILURE_RATE, oldFailureRate, failureRate, !oldFailureRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFailureRate() {
		Double oldFailureRate = failureRate;
		boolean oldFailureRateESet = failureRateESet;
		failureRate = FAILURE_RATE_EDEFAULT;
		failureRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__FAILURE_RATE, oldFailureRate, FAILURE_RATE_EDEFAULT, oldFailureRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFailureRate() {
		return failureRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRepairRate() {
		return repairRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepairRate(Double newRepairRate) {
		Double oldRepairRate = repairRate;
		repairRate = newRepairRate;
		boolean oldRepairRateESet = repairRateESet;
		repairRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__REPAIR_RATE, oldRepairRate, repairRate, !oldRepairRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepairRate() {
		Double oldRepairRate = repairRate;
		boolean oldRepairRateESet = repairRateESet;
		repairRate = REPAIR_RATE_EDEFAULT;
		repairRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__REPAIR_RATE, oldRepairRate, REPAIR_RATE_EDEFAULT, oldRepairRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepairRate() {
		return repairRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FaultFailure> getConstrainedFaultFailure() {
		if (constrainedFaultFailure == null) {
			constrainedFaultFailure = new EObjectResolvingEList<FaultFailure>(FaultFailure.class, this, SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE);
		}
		return constrainedFaultFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__FAILURE_RATE:
				return getFailureRate();
			case SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__REPAIR_RATE:
				return getRepairRate();
			case SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE:
				return getConstrainedFaultFailure();
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
			case SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__FAILURE_RATE:
				setFailureRate((Double)newValue);
				return;
			case SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__REPAIR_RATE:
				setRepairRate((Double)newValue);
				return;
			case SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE:
				getConstrainedFaultFailure().clear();
				getConstrainedFaultFailure().addAll((Collection<? extends FaultFailure>)newValue);
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
			case SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__FAILURE_RATE:
				unsetFailureRate();
				return;
			case SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__REPAIR_RATE:
				unsetRepairRate();
				return;
			case SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE:
				getConstrainedFaultFailure().clear();
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
			case SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__FAILURE_RATE:
				return isSetFailureRate();
			case SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__REPAIR_RATE:
				return isSetRepairRate();
			case SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE:
				return constrainedFaultFailure != null && !constrainedFaultFailure.isEmpty();
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
		result.append(" (failureRate: ");
		if (failureRateESet) result.append(failureRate); else result.append("<unset>");
		result.append(", repairRate: ");
		if (repairRateESet) result.append(repairRate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QuantitativeSafetyConstraintImpl
